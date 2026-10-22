package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>PreguntaP</code> model class.
 */
public final class PreguntaPConstants {

    private PreguntaPConstants() {

    }

    // Class
    /** <code>PreguntaP</code> class id. */
    public static final String CLASS_ID = "Clas_1432647499776120_Alias";
    /** <code>PreguntaP</code> class name. */
    public static final String CLASS_NAME = "PreguntaP";
    /** <code>PreguntaP</code> class alias. */
    public static final String CLASS_ALIAS = "Pregunta";
    /** <code>PreguntaP</code> class table name. */
    public static final String TBL_NAME = "PreguntaP";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "preguntaPIdentificador,seccionPSeccionIdentificador,preguntaPreguntaNumero,preguntaPNumero,preguntaPNumOrden,preguntaPDescripcion,preguntaPSeEnviaACORE,preguntaPRespuestaSiNo,preguntaPRespuestaObs,preguntaPVieneDeCORE,preguntaPValoresRespuestas";

    public static final String DSDSPREGUNTAPNULL = "DS_PreguntaP_Null";
    

    // Attribute (preguntaPIdentificador)
    /** <code>preguntaPIdentificador</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPIDENTIFICADOR = "Clas_1432647499776120Atr_10_Alias";
    /** <code>preguntaPIdentificador</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPIDENTIFICADOR = "preguntaPIdentificador";
    /** <code>preguntaPIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPIDENTIFICADOR = "Id";

    /** <code>preguntaPIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPIDENTIFICADOR = "";
    /** Agents allowed to view the attribute preguntaPIdentificador **/
    public static final String PREGUNTAPIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaPNumero)
    /** <code>preguntaPNumero</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPNUMERO = "Clas_1432647499776120Atr_1_Alias";
    /** <code>preguntaPNumero</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPNUMERO = "preguntaPNumero";
    /** <code>preguntaPNumero</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPNUMERO = "Número";

    /** <code>preguntaPNumero</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPNUMERO = "";
    /** Agents allowed to view the attribute preguntaPNumero **/
    public static final String PREGUNTAPNUMERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaPNumOrden)
    /** <code>preguntaPNumOrden</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPNUMORDEN = "Clas_1432647499776120Atr_2_Alias";
    /** <code>preguntaPNumOrden</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPNUMORDEN = "preguntaPNumOrden";
    /** <code>preguntaPNumOrden</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPNUMORDEN = "Nº orden";

    /** <code>preguntaPNumOrden</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPNUMORDEN = "";
    /** Agents allowed to view the attribute preguntaPNumOrden **/
    public static final String PREGUNTAPNUMORDEN_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaPDescripcion)
    /** <code>preguntaPDescripcion</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPDESCRIPCION = "Clas_1432647499776120Atr_3_Alias";
    /** <code>preguntaPDescripcion</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPDESCRIPCION = "preguntaPDescripcion";
    /** <code>preguntaPDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPDESCRIPCION = "Descripción";

    /** <code>preguntaPDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPDESCRIPCION = "";
    /** Agents allowed to view the attribute preguntaPDescripcion **/
    public static final String PREGUNTAPDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaPSeEnviaACORE)
    /** <code>preguntaPSeEnviaACORE</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPSEENVIAACORE = "Clas_1432647499776120Atr_9_Alias";
    /** <code>preguntaPSeEnviaACORE</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPSEENVIAACORE = "preguntaPSeEnviaACORE";
    /** <code>preguntaPSeEnviaACORE</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPSEENVIAACORE = "Se envía a CORE";

    /** <code>preguntaPSeEnviaACORE</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPSEENVIAACORE = "";
    /** Agents allowed to view the attribute preguntaPSeEnviaACORE **/
    public static final String PREGUNTAPSEENVIAACORE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaPRespuestaSiNo)
    /** <code>preguntaPRespuestaSiNo</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPRESPUESTASINO = "Clas_1432647499776120Atr_4_Alias";
    /** <code>preguntaPRespuestaSiNo</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPRESPUESTASINO = "preguntaPRespuestaSiNo";
    /** <code>preguntaPRespuestaSiNo</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPRESPUESTASINO = "Respuesta Si/No";

    /** <code>preguntaPRespuestaSiNo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPRESPUESTASINO = "";
    /** Agents allowed to view the attribute preguntaPRespuestaSiNo **/
    public static final String PREGUNTAPRESPUESTASINO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaPRespuestaObs)
    /** <code>preguntaPRespuestaObs</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPRESPUESTAOBS = "Clas_1432647499776120Atr_5_Alias";
    /** <code>preguntaPRespuestaObs</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPRESPUESTAOBS = "preguntaPRespuestaObs";
    /** <code>preguntaPRespuestaObs</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPRESPUESTAOBS = "Observaciones";

    /** <code>preguntaPRespuestaObs</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPRESPUESTAOBS = "";
    /** Agents allowed to view the attribute preguntaPRespuestaObs **/
    public static final String PREGUNTAPRESPUESTAOBS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaPVieneDeCORE)
    /** <code>preguntaPVieneDeCORE</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPVIENEDECORE = "Clas_1432647499776120Atr_6_Alias";
    /** <code>preguntaPVieneDeCORE</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPVIENEDECORE = "preguntaPVieneDeCORE";
    /** <code>preguntaPVieneDeCORE</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPVIENEDECORE = "Viene de CORE";

    /** <code>preguntaPVieneDeCORE</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPVIENEDECORE = "";
    /** Agents allowed to view the attribute preguntaPVieneDeCORE **/
    public static final String PREGUNTAPVIENEDECORE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaPdrvRespuesta)
    /** <code>preguntaPdrvRespuesta</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPDRVRESPUESTA = "Clas_1432647499776120Atr_7_Alias";
    /** <code>preguntaPdrvRespuesta</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPDRVRESPUESTA = "preguntaPdrvRespuesta";
    /** <code>preguntaPdrvRespuesta</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPDRVRESPUESTA = "Respuesta";

    /** <code>preguntaPdrvRespuesta</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPDRVRESPUESTA = "";
    /** Agents allowed to view the attribute preguntaPdrvRespuesta **/
    public static final String PREGUNTAPDRVRESPUESTA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaPValoresRespuestas)
    /** <code>preguntaPValoresRespuestas</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPVALORESRESPUESTAS = "Clas_1432647499776120Atr_8_Alias";
    /** <code>preguntaPValoresRespuestas</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPVALORESRESPUESTAS = "preguntaPValoresRespuestas";
    /** <code>preguntaPValoresRespuestas</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPVALORESRESPUESTAS = "Valores Respuestas";

    /** <code>preguntaPValoresRespuestas</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPVALORESRESPUESTAS = "";
    /** Agents allowed to view the attribute preguntaPValoresRespuestas **/
    public static final String PREGUNTAPVALORESRESPUESTAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (preguntaPdrvRespuestaSiNo)
    /** <code>preguntaPdrvRespuestaSiNo</code> attribute id. */
    public static final String ATTR_ID_PREGUNTAPDRVRESPUESTASINO = "Clas_1432647499776120Atr_11_Alias";
    /** <code>preguntaPdrvRespuestaSiNo</code> attribute name. */
    public static final String ATTR_NAME_PREGUNTAPDRVRESPUESTASINO = "preguntaPdrvRespuestaSiNo";
    /** <code>preguntaPdrvRespuestaSiNo</code> attribute alias. */
    public static final String ATTR_ALIAS_PREGUNTAPDRVRESPUESTASINO = "Respuesta Si / No";

    /** <code>preguntaPdrvRespuestaSiNo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PREGUNTAPDRVRESPUESTASINO = "";
    /** Agents allowed to view the attribute preguntaPdrvRespuestaSiNo **/
    public static final String PREGUNTAPDRVRESPUESTASINO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_PREGUNTAPIDENTIFICADOR = "Identificador";    
    /** <code>preguntaPIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAPIDENTIFICADOR = "preguntaPIdentificador";
    // Field (Seccion_Identificador)
    /** <code>Seccion_Identificador</code> field name. */
    public static final String FLD_SECCIONPSECCIONIDENTIFICADOR = "Seccion_Identificador";    
    /** <code>Seccion.seccionPIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_SECCION_SECCIONPIDENTIFICADOR = "seccionPSeccionIdentificador";
    // Field (Pregunta_Numero)
    /** <code>Pregunta_Numero</code> field name. */
    public static final String FLD_PREGUNTAPREGUNTANUMERO = "Pregunta_Numero";    
    /** <code>Pregunta.preguntaNumero</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTA_PREGUNTANUMERO = "preguntaPreguntaNumero";
    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_PREGUNTAPNUMERO = "Numero";    
    /** <code>preguntaPNumero</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAPNUMERO = "preguntaPNumero";
    // Field (NumOrden)
    /** <code>NumOrden</code> field name. */
    public static final String FLD_PREGUNTAPNUMORDEN = "NumOrden";    
    /** <code>preguntaPNumOrden</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAPNUMORDEN = "preguntaPNumOrden";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_PREGUNTAPDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_PREGUNTAPDESCRIPCIONLENGTH = 255;
    /** <code>preguntaPDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAPDESCRIPCION = "preguntaPDescripcion";
    // Field (SeEnviaACORE)
    /** <code>SeEnviaACORE</code> field name. */
    public static final String FLD_PREGUNTAPSEENVIAACORE = "SeEnviaACORE";    
    /** <code>preguntaPSeEnviaACORE</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAPSEENVIAACORE = "preguntaPSeEnviaACORE";
    // Field (RespuestaSiNo)
    /** <code>RespuestaSiNo</code> field name. */
    public static final String FLD_PREGUNTAPRESPUESTASINO = "RespuestaSiNo";    
    /** <code>preguntaPRespuestaSiNo</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAPRESPUESTASINO = "preguntaPRespuestaSiNo";
    // Field (RespuestaObs)
    /** <code>RespuestaObs</code> field name. */
    public static final String FLD_PREGUNTAPRESPUESTAOBS = "RespuestaObs";    
    /** <code>RespuestaObs</code> field length. */
    public static final int FLD_PREGUNTAPRESPUESTAOBSLENGTH = 999;
    /** <code>preguntaPRespuestaObs</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAPRESPUESTAOBS = "preguntaPRespuestaObs";
    // Field (VieneDeCORE)
    /** <code>VieneDeCORE</code> field name. */
    public static final String FLD_PREGUNTAPVIENEDECORE = "VieneDeCORE";    
    /** <code>preguntaPVieneDeCORE</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAPVIENEDECORE = "preguntaPVieneDeCORE";
    // Field (ValoresRespuestas)
    /** <code>ValoresRespuestas</code> field name. */
    public static final String FLD_PREGUNTAPVALORESRESPUESTAS = "ValoresRespuestas";    
    /** <code>ValoresRespuestas</code> field length. */
    public static final int FLD_PREGUNTAPVALORESRESPUESTASLENGTH = 999;
    /** <code>preguntaPValoresRespuestas</code> attribute field name. */
    public static final String ATTR_FIELD_PREGUNTAPVALORESRESPUESTAS = "preguntaPValoresRespuestas";

    // Component role (Seccion)
    /** <code>Seccion</code> role id. */
    public static final String ROLE_ID_SECCION = "Agr_1432647499776123_Alias";
    /** <code>Seccion</code> role name. */
    public static final String ROLE_NAME_SECCION = "seccion";
    /** <code>Seccion</code> role alias. */
    public static final String ROLE_ALIAS_SECCION = "Sección";

    /** <code>Seccion</code> inverse role name. */
    public static final String ROLE_INVNAME_SECCION = SeccionPConstants.ROLE_NAME_PREGUNTAS;
    /** <code>Seccion</code> role facet sequence. */
    public static final String PATH_FACETS_SECCION = "";
    /** <code>Seccion</code> role target class. */
    public static final String ROLE_TARGET_SECCION = SeccionPConstants.CLASS_NAME;

    /** Agents allowed to navigate through Seccion **/
    public static final String SECCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Pregunta)
    /** <code>Pregunta</code> role id. */
    public static final String ROLE_ID_PREGUNTA = "Agr_1432647761920034_Alias";
    /** <code>Pregunta</code> role name. */
    public static final String ROLE_NAME_PREGUNTA = "pregunta";
    /** <code>Pregunta</code> role alias. */
    public static final String ROLE_ALIAS_PREGUNTA = "Pregunta";

    /** <code>Pregunta</code> inverse role name. */
    public static final String ROLE_INVNAME_PREGUNTA = PreguntaConstants.ROLE_NAME_PREGUNTASPERSONA;
    /** <code>Pregunta</code> role facet sequence. */
    public static final String PATH_FACETS_PREGUNTA = "";
    /** <code>Pregunta</code> role target class. */
    public static final String ROLE_TARGET_PREGUNTA = PreguntaConstants.CLASS_NAME;

    /** Agents allowed to navigate through Pregunta **/
    public static final String PREGUNTA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432647499776120Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>preguntaPcrearpagrSeccion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTAPCREARPAGRSECCION = "p_agrSeccion";
    /** <code>preguntaPcrearpagrSeccion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTAPCREARPAGRSECCION = "Clas_1432647499776120Ser_1Arg_2_Alias";
    /** <code>preguntaPcrearpagrSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTAPCREARPAGRSECCION = "Sección";
    /** <code>preguntaPcrearpagrPregunta</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTAPCREARPAGRPREGUNTA = "p_agrPregunta";
    /** <code>preguntaPcrearpagrPregunta</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTAPCREARPAGRPREGUNTA = "Clas_1432647499776120Ser_1Arg_3_Alias";
    /** <code>preguntaPcrearpagrPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTAPCREARPAGRPREGUNTA = "Pregunta";
    /** <code>preguntaPcrearpatrNumero</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTAPCREARPATRNUMERO = "p_atrNumero";
    /** <code>preguntaPcrearpatrNumero</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTAPCREARPATRNUMERO = "Clas_1432647499776120Ser_1Arg_1_Alias";
    /** <code>preguntaPcrearpatrNumero</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTAPCREARPATRNUMERO = "Número";
    /** <code>preguntaPcrearpatrNumOrden</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTAPCREARPATRNUMORDEN = "p_atrNumOrden";
    /** <code>preguntaPcrearpatrNumOrden</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTAPCREARPATRNUMORDEN = "Clas_1432647499776120Ser_1Arg_4_Alias";
    /** <code>preguntaPcrearpatrNumOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTAPCREARPATRNUMORDEN = "Nº orden";
    /** <code>preguntaPcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTAPCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>preguntaPcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTAPCREARPATRDESCRIPCION = "Clas_1432647499776120Ser_1Arg_5_Alias";
    /** <code>preguntaPcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTAPCREARPATRDESCRIPCION = "Descripción";
    /** <code>preguntaPcrearpatrSeEnviaACORE</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PREGUNTAPCREARPATRSEENVIAACORE = "p_atrSeEnviaACORE";
    /** <code>preguntaPcrearpatrSeEnviaACORE</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PREGUNTAPCREARPATRSEENVIAACORE = "Clas_1432647499776120Ser_1Arg_6_Alias";
    /** <code>preguntaPcrearpatrSeEnviaACORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PREGUNTAPCREARPATRSEENVIAACORE = "Se envía a CORE";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432647499776120Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaPeliminarpthisPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PREGUNTAPELIMINARPTHISPREGUNTAP = "p_thisPreguntaP";
    /** <code>preguntaPeliminarpthisPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PREGUNTAPELIMINARPTHISPREGUNTAP = "Clas_1432647499776120Ser_2Arg_1_Alias";
    /** <code>preguntaPeliminarpthisPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PREGUNTAPELIMINARPTHISPREGUNTAP = "Pregunta";
    // Service (InsPreguntaAPersona)
    /** <code>InsPreguntaAPersona</code> service id. */
    public static final String SERV_ID_INSPREGUNTAAPERSONA = "Clas_1432647499776120Ser_4_Alias";
    /** <code>InsPreguntaAPersona</code> service name. */
    public static final String SERV_NAME_INSPREGUNTAAPERSONA = "InsPreguntaAPersona";
    /** <code>InsPreguntaAPersona</code> service alias. */
    public static final String SERV_ALIAS_INSPREGUNTAAPERSONA = "InsPreguntaAPersona";
    /** Agents allowed to execute the service InsPreguntaAPersona **/
    public static final String INSPREGUNTAAPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaPInsPreguntaAPersonapthisPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_INSPREGUNTAAPERSONA_PREGUNTAPINSPREGUNTAAPERSONAPTHISPREGUNTAP = "p_thisPreguntaP";
    /** <code>preguntaPInsPreguntaAPersonapthisPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_INSPREGUNTAAPERSONA_PREGUNTAPINSPREGUNTAAPERSONAPTHISPREGUNTAP = "Clas_1432647499776120Ser_4Arg_1_Alias";
    /** <code>preguntaPInsPreguntaAPersonapthisPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPREGUNTAAPERSONA_PREGUNTAPINSPREGUNTAAPERSONAPTHISPREGUNTAP = "Preguntas persona";
    /** <code>preguntaPInsPreguntaAPersonapevcPregunta</code> inbound argument name. */
    public static final String ARG_NAME_INSPREGUNTAAPERSONA_PREGUNTAPINSPREGUNTAAPERSONAPEVCPREGUNTA = "p_evcPregunta";
    /** <code>preguntaPInsPreguntaAPersonapevcPregunta</code> inbound argument id. */
    public static final String ARG_ID_INSPREGUNTAAPERSONA_PREGUNTAPINSPREGUNTAAPERSONAPEVCPREGUNTA = "Clas_1432647499776120Ser_4Arg_2_Alias";
    /** <code>preguntaPInsPreguntaAPersonapevcPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPREGUNTAAPERSONA_PREGUNTAPINSPREGUNTAAPERSONAPEVCPREGUNTA = "Pregunta";
    // Service (DelPreguntaDePersona)
    /** <code>DelPreguntaDePersona</code> service id. */
    public static final String SERV_ID_DELPREGUNTADEPERSONA = "Clas_1432647499776120Ser_5_Alias";
    /** <code>DelPreguntaDePersona</code> service name. */
    public static final String SERV_NAME_DELPREGUNTADEPERSONA = "DelPreguntaDePersona";
    /** <code>DelPreguntaDePersona</code> service alias. */
    public static final String SERV_ALIAS_DELPREGUNTADEPERSONA = "DelPreguntaDePersona";
    /** Agents allowed to execute the service DelPreguntaDePersona **/
    public static final String DELPREGUNTADEPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaPDelPreguntaDePersonapthisPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_DELPREGUNTADEPERSONA_PREGUNTAPDELPREGUNTADEPERSONAPTHISPREGUNTAP = "p_thisPreguntaP";
    /** <code>preguntaPDelPreguntaDePersonapthisPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_DELPREGUNTADEPERSONA_PREGUNTAPDELPREGUNTADEPERSONAPTHISPREGUNTAP = "Clas_1432647499776120Ser_5Arg_1_Alias";
    /** <code>preguntaPDelPreguntaDePersonapthisPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPREGUNTADEPERSONA_PREGUNTAPDELPREGUNTADEPERSONAPTHISPREGUNTAP = "Preguntas persona";
    /** <code>preguntaPDelPreguntaDePersonapevcPregunta</code> inbound argument name. */
    public static final String ARG_NAME_DELPREGUNTADEPERSONA_PREGUNTAPDELPREGUNTADEPERSONAPEVCPREGUNTA = "p_evcPregunta";
    /** <code>preguntaPDelPreguntaDePersonapevcPregunta</code> inbound argument id. */
    public static final String ARG_ID_DELPREGUNTADEPERSONA_PREGUNTAPDELPREGUNTADEPERSONAPEVCPREGUNTA = "Clas_1432647499776120Ser_5Arg_2_Alias";
    /** <code>preguntaPDelPreguntaDePersonapevcPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPREGUNTADEPERSONA_PREGUNTAPDELPREGUNTADEPERSONAPEVCPREGUNTA = "Pregunta";
    // Service (marcarRespuesta)
    /** <code>marcarRespuesta</code> service id. */
    public static final String SERV_ID_MARCARRESPUESTA = "Clas_1432647499776120Ser_3_Alias";
    /** <code>marcarRespuesta</code> service name. */
    public static final String SERV_NAME_MARCARRESPUESTA = "marcarRespuesta";
    /** <code>marcarRespuesta</code> service alias. */
    public static final String SERV_ALIAS_MARCARRESPUESTA = "Marcar respuesta";
    /** Agents allowed to execute the service marcarRespuesta **/
    public static final String MARCARRESPUESTA_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>preguntaPmarcarRespuestapthisPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPTHISPREGUNTAP = "p_thisPreguntaP";
    /** <code>preguntaPmarcarRespuestapthisPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPTHISPREGUNTAP = "Clas_1432647499776120Ser_3Arg_1_Alias";
    /** <code>preguntaPmarcarRespuestapthisPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPTHISPREGUNTAP = "Pregunta";
    /** <code>preguntaPmarcarRespuestapRespuestaSiNo</code> inbound argument name. */
    public static final String ARG_NAME_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPRESPUESTASINO = "p_RespuestaSiNo";
    /** <code>preguntaPmarcarRespuestapRespuestaSiNo</code> inbound argument id. */
    public static final String ARG_ID_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPRESPUESTASINO = "Clas_1432647499776120Ser_3Arg_2_Alias";
    /** <code>preguntaPmarcarRespuestapRespuestaSiNo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPRESPUESTASINO = "Respuesta Si/No";
    /** <code>preguntaPmarcarRespuestapRespuestaObs</code> inbound argument name. */
    public static final String ARG_NAME_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPRESPUESTAOBS = "p_RespuestaObs";
    /** <code>preguntaPmarcarRespuestapRespuestaObs</code> inbound argument id. */
    public static final String ARG_ID_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPRESPUESTAOBS = "Clas_1432647499776120Ser_3Arg_3_Alias";
    /** <code>preguntaPmarcarRespuestapRespuestaObs</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPRESPUESTAOBS = "Observaciones";
    /** <code>preguntaPmarcarRespuestapeValoresRespuestas</code> inbound argument name. */
    public static final String ARG_NAME_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPEVALORESRESPUESTAS = "pe_ValoresRespuestas";
    /** <code>preguntaPmarcarRespuestapeValoresRespuestas</code> inbound argument id. */
    public static final String ARG_ID_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPEVALORESRESPUESTAS = "Clas_1432647499776120Ser_3Arg_4_Alias";
    /** <code>preguntaPmarcarRespuestapeValoresRespuestas</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPEVALORESRESPUESTAS = "Valores Respuestas";
    // Service (marcarRespuestaDeCORE)
    /** <code>marcarRespuestaDeCORE</code> service id. */
    public static final String SERV_ID_MARCARRESPUESTADECORE = "Clas_1432647499776120Ser_7_Alias";
    /** <code>marcarRespuestaDeCORE</code> service name. */
    public static final String SERV_NAME_MARCARRESPUESTADECORE = "marcarRespuestaDeCORE";
    /** <code>marcarRespuestaDeCORE</code> service alias. */
    public static final String SERV_ALIAS_MARCARRESPUESTADECORE = "marcarRespuestaDeCORE";
    /** Agents allowed to execute the service marcarRespuestaDeCORE **/
    public static final String MARCARRESPUESTADECORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaPmarcarRespuestaDeCOREpthisPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_MARCARRESPUESTADECORE_PREGUNTAPMARCARRESPUESTADECOREPTHISPREGUNTAP = "p_thisPreguntaP";
    /** <code>preguntaPmarcarRespuestaDeCOREpthisPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_MARCARRESPUESTADECORE_PREGUNTAPMARCARRESPUESTADECOREPTHISPREGUNTAP = "Clas_1432647499776120Ser_7Arg_1_Alias";
    /** <code>preguntaPmarcarRespuestaDeCOREpthisPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARRESPUESTADECORE_PREGUNTAPMARCARRESPUESTADECOREPTHISPREGUNTAP = "Pregunta";
    /** <code>preguntaPmarcarRespuestaDeCOREpRespuestaSiNo</code> inbound argument name. */
    public static final String ARG_NAME_MARCARRESPUESTADECORE_PREGUNTAPMARCARRESPUESTADECOREPRESPUESTASINO = "p_RespuestaSiNo";
    /** <code>preguntaPmarcarRespuestaDeCOREpRespuestaSiNo</code> inbound argument id. */
    public static final String ARG_ID_MARCARRESPUESTADECORE_PREGUNTAPMARCARRESPUESTADECOREPRESPUESTASINO = "Clas_1432647499776120Ser_7Arg_2_Alias";
    /** <code>preguntaPmarcarRespuestaDeCOREpRespuestaSiNo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARRESPUESTADECORE_PREGUNTAPMARCARRESPUESTADECOREPRESPUESTASINO = "Respuesta Si/No";
    // Service (cambiarVieneDeCore)
    /** <code>cambiarVieneDeCore</code> service id. */
    public static final String SERV_ID_CAMBIARVIENEDECORE = "Clas_1432647499776120Ser_9_Alias";
    /** <code>cambiarVieneDeCore</code> service name. */
    public static final String SERV_NAME_CAMBIARVIENEDECORE = "cambiarVieneDeCore";
    /** <code>cambiarVieneDeCore</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARVIENEDECORE = "Cambiar Viene de CORE";
    /** Agents allowed to execute the service cambiarVieneDeCore **/
    public static final String CAMBIARVIENEDECORE_SRVAGENTS = "Admin,SuperAdmin,Asesor,MesaDeApoyo";
    // Inbound arguments
    /** <code>preguntaPcambiarVieneDeCorepthisPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARVIENEDECORE_PREGUNTAPCAMBIARVIENEDECOREPTHISPREGUNTAP = "p_thisPreguntaP";
    /** <code>preguntaPcambiarVieneDeCorepthisPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARVIENEDECORE_PREGUNTAPCAMBIARVIENEDECOREPTHISPREGUNTAP = "Clas_1432647499776120Ser_9Arg_1_Alias";
    /** <code>preguntaPcambiarVieneDeCorepthisPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARVIENEDECORE_PREGUNTAPCAMBIARVIENEDECOREPTHISPREGUNTAP = "Pregunta";
    /** <code>preguntaPcambiarVieneDeCorepeViene</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARVIENEDECORE_PREGUNTAPCAMBIARVIENEDECOREPEVIENE = "peViene";
    /** <code>preguntaPcambiarVieneDeCorepeViene</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARVIENEDECORE_PREGUNTAPCAMBIARVIENEDECOREPEVIENE = "Clas_1432647499776120Ser_9Arg_2_Alias";
    /** <code>preguntaPcambiarVieneDeCorepeViene</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARVIENEDECORE_PREGUNTAPCAMBIARVIENEDECOREPEVIENE = "Viene de CORE";
    // Service (marcarDatosCORE)
    /** <code>marcarDatosCORE</code> service id. */
    public static final String SERV_ID_MARCARDATOSCORE = "Clas_1432647499776120Ser_11_Alias";
    /** <code>marcarDatosCORE</code> service name. */
    public static final String SERV_NAME_MARCARDATOSCORE = "marcarDatosCORE";
    /** <code>marcarDatosCORE</code> service alias. */
    public static final String SERV_ALIAS_MARCARDATOSCORE = "marcarDatosCORE";
    /** Agents allowed to execute the service marcarDatosCORE **/
    public static final String MARCARDATOSCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaPmarcarDatosCOREpthisPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPTHISPREGUNTAP = "p_thisPreguntaP";
    /** <code>preguntaPmarcarDatosCOREpthisPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPTHISPREGUNTAP = "Clas_1432647499776120Ser_11Arg_1_Alias";
    /** <code>preguntaPmarcarDatosCOREpthisPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPTHISPREGUNTAP = "Pregunta";
    /** <code>preguntaPmarcarDatosCOREpRespuestaSiNo</code> inbound argument name. */
    public static final String ARG_NAME_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPRESPUESTASINO = "p_RespuestaSiNo";
    /** <code>preguntaPmarcarDatosCOREpRespuestaSiNo</code> inbound argument id. */
    public static final String ARG_ID_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPRESPUESTASINO = "Clas_1432647499776120Ser_11Arg_2_Alias";
    /** <code>preguntaPmarcarDatosCOREpRespuestaSiNo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPRESPUESTASINO = "Respuesta Si/No";
    /** <code>preguntaPmarcarDatosCOREpRespuestaObs</code> inbound argument name. */
    public static final String ARG_NAME_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPRESPUESTAOBS = "p_RespuestaObs";
    /** <code>preguntaPmarcarDatosCOREpRespuestaObs</code> inbound argument id. */
    public static final String ARG_ID_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPRESPUESTAOBS = "Clas_1432647499776120Ser_11Arg_3_Alias";
    /** <code>preguntaPmarcarDatosCOREpRespuestaObs</code> inbound argument alias. */
    public static final String ARG_ALIAS_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPRESPUESTAOBS = "Observaciones";
    // Service (dummyPrecondicionesRespuesta)
    /** <code>dummyPrecondicionesRespuesta</code> service id. */
    public static final String SERV_ID_DUMMYPRECONDICIONESRESPUESTA = "Clas_1432647499776120Ser_12_Alias";
    /** <code>dummyPrecondicionesRespuesta</code> service name. */
    public static final String SERV_NAME_DUMMYPRECONDICIONESRESPUESTA = "dummyPrecondicionesRespuesta";
    /** <code>dummyPrecondicionesRespuesta</code> service alias. */
    public static final String SERV_ALIAS_DUMMYPRECONDICIONESRESPUESTA = "dummyPrecondicionesRespuesta";
    /** Agents allowed to execute the service dummyPrecondicionesRespuesta **/
    public static final String DUMMYPRECONDICIONESRESPUESTA_SRVAGENTS = "";
    // Preconditions
    /** <code>dummyPrecondicionesRespuesta</code> precondition 0 id. */
    public static final String PRE_ID_DUMMYPRECONDICIONESRESPUESTA_0 = "Clas_1432647499776120Pre_2_MsgError";
    /** <code>dummyPrecondicionesRespuesta</code> precondition 1 id. */
    public static final String PRE_ID_DUMMYPRECONDICIONESRESPUESTA_1 = "Clas_1432647499776120Pre_3_MsgError";
    // Inbound arguments
    /** <code>preguntaPdummyPrecondicionesRespuestapthisPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYPRECONDICIONESRESPUESTA_PREGUNTAPDUMMYPRECONDICIONESRESPUESTAPTHISPREGUNTAP = "p_thisPreguntaP";
    /** <code>preguntaPdummyPrecondicionesRespuestapthisPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_DUMMYPRECONDICIONESRESPUESTA_PREGUNTAPDUMMYPRECONDICIONESRESPUESTAPTHISPREGUNTAP = "Clas_1432647499776120Ser_12Arg_1_Alias";
    /** <code>preguntaPdummyPrecondicionesRespuestapthisPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYPRECONDICIONESRESPUESTA_PREGUNTAPDUMMYPRECONDICIONESRESPUESTAPTHISPREGUNTAP = "Pregunta";
    // Service (dummyTraerCuestMedico)
    /** <code>dummyTraerCuestMedico</code> service id. */
    public static final String SERV_ID_DUMMYTRAERCUESTMEDICO = "Clas_1432647499776120Ser_14_Alias";
    /** <code>dummyTraerCuestMedico</code> service name. */
    public static final String SERV_NAME_DUMMYTRAERCUESTMEDICO = "dummyTraerCuestMedico";
    /** <code>dummyTraerCuestMedico</code> service alias. */
    public static final String SERV_ALIAS_DUMMYTRAERCUESTMEDICO = "dummyTraerCuestMedico";
    /** Agents allowed to execute the service dummyTraerCuestMedico **/
    public static final String DUMMYTRAERCUESTMEDICO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaPdummyTraerCuestMedicopthisPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYTRAERCUESTMEDICO_PREGUNTAPDUMMYTRAERCUESTMEDICOPTHISPREGUNTAP = "p_thisPreguntaP";
    /** <code>preguntaPdummyTraerCuestMedicopthisPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_DUMMYTRAERCUESTMEDICO_PREGUNTAPDUMMYTRAERCUESTMEDICOPTHISPREGUNTAP = "Clas_1432647499776120Ser_14Arg_1_Alias";
    /** <code>preguntaPdummyTraerCuestMedicopthisPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYTRAERCUESTMEDICO_PREGUNTAPDUMMYTRAERCUESTMEDICOPTHISPREGUNTAP = "Pregunta";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1432647499776120Ser_8_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar pregunta";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaPTELIMINARpthisPreguntaP</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_PREGUNTAPTELIMINARPTHISPREGUNTAP = "p_thisPreguntaP";
    /** <code>preguntaPTELIMINARpthisPreguntaP</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_PREGUNTAPTELIMINARPTHISPREGUNTAP = "Clas_1432647499776120Ser_8Arg_1_Alias";
    /** <code>preguntaPTELIMINARpthisPreguntaP</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_PREGUNTAPTELIMINARPTHISPREGUNTAP = "Pregunta";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1432647499776120Ser_10_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaPTCREARptpagrSeccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTAPTCREARPTPAGRSECCION = "pt_p_agrSeccion";
    /** <code>preguntaPTCREARptpagrSeccion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTAPTCREARPTPAGRSECCION = "Clas_1432647499776120Ser_10Arg_3_Alias";
    /** <code>preguntaPTCREARptpagrSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPAGRSECCION = "Sección";
    /** <code>preguntaPTCREARptpagrPregunta</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTAPTCREARPTPAGRPREGUNTA = "pt_p_agrPregunta";
    /** <code>preguntaPTCREARptpagrPregunta</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTAPTCREARPTPAGRPREGUNTA = "Clas_1432647499776120Ser_10Arg_4_Alias";
    /** <code>preguntaPTCREARptpagrPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPAGRPREGUNTA = "Pregunta";
    /** <code>preguntaPTCREARptpatrNumero</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTAPTCREARPTPATRNUMERO = "pt_p_atrNumero";
    /** <code>preguntaPTCREARptpatrNumero</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTAPTCREARPTPATRNUMERO = "Clas_1432647499776120Ser_10Arg_5_Alias";
    /** <code>preguntaPTCREARptpatrNumero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPATRNUMERO = "Número";
    /** <code>preguntaPTCREARptpatrNumOrden</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTAPTCREARPTPATRNUMORDEN = "pt_p_atrNumOrden";
    /** <code>preguntaPTCREARptpatrNumOrden</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTAPTCREARPTPATRNUMORDEN = "Clas_1432647499776120Ser_10Arg_6_Alias";
    /** <code>preguntaPTCREARptpatrNumOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPATRNUMORDEN = "Nº orden";
    /** <code>preguntaPTCREARptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTAPTCREARPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>preguntaPTCREARptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTAPTCREARPTPATRDESCRIPCION = "Clas_1432647499776120Ser_10Arg_7_Alias";
    /** <code>preguntaPTCREARptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPATRDESCRIPCION = "Descripción";
    /** <code>preguntaPTCREARptpatrSeEnviaACORE</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTAPTCREARPTPATRSEENVIAACORE = "pt_p_atrSeEnviaACORE";
    /** <code>preguntaPTCREARptpatrSeEnviaACORE</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTAPTCREARPTPATRSEENVIAACORE = "Clas_1432647499776120Ser_10Arg_8_Alias";
    /** <code>preguntaPTCREARptpatrSeEnviaACORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPATRSEENVIAACORE = "Se envía a CORE";
    /** <code>preguntaPTCREARpPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_PREGUNTAPTCREARPPERSONAC = "p_PersonaC";
    /** <code>preguntaPTCREARpPersonaC</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_PREGUNTAPTCREARPPERSONAC = "Clas_1432647499776120Ser_10Arg_10_Alias";
    /** <code>preguntaPTCREARpPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_PREGUNTAPTCREARPPERSONAC = "Persona";
    // Service (TCREAR2)
    /** <code>TCREAR2</code> service id. */
    public static final String SERV_ID_TCREAR2 = "Clas_1432647499776120Ser_13_Alias";
    /** <code>TCREAR2</code> service name. */
    public static final String SERV_NAME_TCREAR2 = "TCREAR2";
    /** <code>TCREAR2</code> service alias. */
    public static final String SERV_ALIAS_TCREAR2 = "Crear";
    /** Agents allowed to execute the service TCREAR2 **/
    public static final String TCREAR2_SRVAGENTS = "";
    // Inbound arguments
    /** <code>preguntaPTCREAR2ptpagrSeccion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR2_PREGUNTAPTCREAR2PTPAGRSECCION = "pt_p_agrSeccion";
    /** <code>preguntaPTCREAR2ptpagrSeccion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPAGRSECCION = "Clas_1432647499776120Ser_13Arg_2_Alias";
    /** <code>preguntaPTCREAR2ptpagrSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPAGRSECCION = "Sección";
    /** <code>preguntaPTCREAR2ptpagrPregunta</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR2_PREGUNTAPTCREAR2PTPAGRPREGUNTA = "pt_p_agrPregunta";
    /** <code>preguntaPTCREAR2ptpagrPregunta</code> inbound argument id. */
    public static final String ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPAGRPREGUNTA = "Clas_1432647499776120Ser_13Arg_3_Alias";
    /** <code>preguntaPTCREAR2ptpagrPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPAGRPREGUNTA = "Pregunta";
    /** <code>preguntaPTCREAR2ptpatrNumero</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR2_PREGUNTAPTCREAR2PTPATRNUMERO = "pt_p_atrNumero";
    /** <code>preguntaPTCREAR2ptpatrNumero</code> inbound argument id. */
    public static final String ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPATRNUMERO = "Clas_1432647499776120Ser_13Arg_4_Alias";
    /** <code>preguntaPTCREAR2ptpatrNumero</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPATRNUMERO = "Número";
    /** <code>preguntaPTCREAR2ptpatrNumOrden</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR2_PREGUNTAPTCREAR2PTPATRNUMORDEN = "pt_p_atrNumOrden";
    /** <code>preguntaPTCREAR2ptpatrNumOrden</code> inbound argument id. */
    public static final String ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPATRNUMORDEN = "Clas_1432647499776120Ser_13Arg_5_Alias";
    /** <code>preguntaPTCREAR2ptpatrNumOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPATRNUMORDEN = "Nº orden";
    /** <code>preguntaPTCREAR2ptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR2_PREGUNTAPTCREAR2PTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>preguntaPTCREAR2ptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPATRDESCRIPCION = "Clas_1432647499776120Ser_13Arg_6_Alias";
    /** <code>preguntaPTCREAR2ptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPATRDESCRIPCION = "Descripción";
    /** <code>preguntaPTCREAR2ptpatrSeEnviaACORE</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR2_PREGUNTAPTCREAR2PTPATRSEENVIAACORE = "pt_p_atrSeEnviaACORE";
    /** <code>preguntaPTCREAR2ptpatrSeEnviaACORE</code> inbound argument id. */
    public static final String ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPATRSEENVIAACORE = "Clas_1432647499776120Ser_13Arg_7_Alias";
    /** <code>preguntaPTCREAR2ptpatrSeEnviaACORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPATRSEENVIAACORE = "Se envía a CORE";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PREGUNTAPNUMERO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAPNUMORDEN.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAPDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAPSEENVIAACORE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAPRESPUESTASINO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAPRESPUESTAOBS.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAPVIENEDECORE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAPDRVRESPUESTA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAPVALORESRESPUESTAS.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PREGUNTAPDRVRESPUESTASINO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PREGUNTAPIDENTIFICADOR.toUpperCase(), PREGUNTAPIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAPNUMERO.toUpperCase(), PREGUNTAPNUMERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAPNUMORDEN.toUpperCase(), PREGUNTAPNUMORDEN_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAPDESCRIPCION.toUpperCase(), PREGUNTAPDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAPSEENVIAACORE.toUpperCase(), PREGUNTAPSEENVIAACORE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAPRESPUESTASINO.toUpperCase(), PREGUNTAPRESPUESTASINO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAPRESPUESTAOBS.toUpperCase(), PREGUNTAPRESPUESTAOBS_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAPVIENEDECORE.toUpperCase(), PREGUNTAPVIENEDECORE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAPDRVRESPUESTA.toUpperCase(), PREGUNTAPDRVRESPUESTA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAPVALORESRESPUESTAS.toUpperCase(), PREGUNTAPVALORESRESPUESTAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_PREGUNTAPDRVRESPUESTASINO.toUpperCase(), PREGUNTAPDRVRESPUESTASINO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_SECCION.toUpperCase(), SECCION_AGENTS);
        roleAgents.put(ROLE_NAME_PREGUNTA.toUpperCase(), PREGUNTA_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'PreguntaP', it returns the identification keys
     * - If className is a facet of the inheritance net of 'PreguntaP', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PREGUNTAPIDENTIFICADOR);
        }
        // Facet 'PreguntaP' (This facet)
        if (PreguntaPConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PREGUNTAPIDENTIFICADOR);
        }
        return returnList;
    }
}
