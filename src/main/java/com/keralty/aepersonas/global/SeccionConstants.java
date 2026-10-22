package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Seccion</code> model class.
 */
public final class SeccionConstants {

    private SeccionConstants() {

    }

    // Class
    /** <code>Seccion</code> class id. */
    public static final String CLASS_ID = "Clas_1431633526784668_Alias";
    /** <code>Seccion</code> class name. */
    public static final String CLASS_NAME = "Seccion";
    /** <code>Seccion</code> class alias. */
    public static final String CLASS_ALIAS = "Sección";
    /** <code>Seccion</code> class table name. */
    public static final String TBL_NAME = "Seccion";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "seccionIdentificador,cuestionarioMedNumero,seccionNombre,seccionNumOrden";

    public static final String DSICSECCION = "IC_Seccion";
    public static final String DSDSSECCIONPIU = "DS_Seccion_PIU";
    

    // Attribute (seccionIdentificador)
    /** <code>seccionIdentificador</code> attribute id. */
    public static final String ATTR_ID_SECCIONIDENTIFICADOR = "Clas_1431633526784668Atr_1_Alias";
    /** <code>seccionIdentificador</code> attribute name. */
    public static final String ATTR_NAME_SECCIONIDENTIFICADOR = "seccionIdentificador";
    /** <code>seccionIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_SECCIONIDENTIFICADOR = "Identificador";

    /** <code>seccionIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_SECCIONIDENTIFICADOR = "";
    /** Agents allowed to view the attribute seccionIdentificador **/
    public static final String SECCIONIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (seccionNombre)
    /** <code>seccionNombre</code> attribute id. */
    public static final String ATTR_ID_SECCIONNOMBRE = "Clas_1431633526784668Atr_2_Alias";
    /** <code>seccionNombre</code> attribute name. */
    public static final String ATTR_NAME_SECCIONNOMBRE = "seccionNombre";
    /** <code>seccionNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_SECCIONNOMBRE = "Nombre";

    /** <code>seccionNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_SECCIONNOMBRE = "";
    /** Agents allowed to view the attribute seccionNombre **/
    public static final String SECCIONNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (seccionNumOrden)
    /** <code>seccionNumOrden</code> attribute id. */
    public static final String ATTR_ID_SECCIONNUMORDEN = "Clas_1431633526784668Atr_3_Alias";
    /** <code>seccionNumOrden</code> attribute name. */
    public static final String ATTR_NAME_SECCIONNUMORDEN = "seccionNumOrden";
    /** <code>seccionNumOrden</code> attribute alias. */
    public static final String ATTR_ALIAS_SECCIONNUMORDEN = "Nº orden";

    /** <code>seccionNumOrden</code> attribute facet sequence. */
    public static final String PATH_FACETS_SECCIONNUMORDEN = "";
    /** Agents allowed to view the attribute seccionNumOrden **/
    public static final String SECCIONNUMORDEN_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_SECCIONIDENTIFICADOR = "Identificador";    
    /** <code>seccionIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_SECCIONIDENTIFICADOR = "seccionIdentificador";
    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_CUESTIONARIOMEDNUMERO = "Numero";    
    /** <code>Cuestionario.cuestionarioMedNumero</code> attribute field name. */
    public static final String ATTR_FIELD_CUESTIONARIO_CUESTIONARIOMEDNUMERO = "cuestionarioMedNumero";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_SECCIONNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_SECCIONNOMBRELENGTH = 150;
    /** <code>seccionNombre</code> attribute field name. */
    public static final String ATTR_FIELD_SECCIONNOMBRE = "seccionNombre";
    // Field (NumOrden)
    /** <code>NumOrden</code> field name. */
    public static final String FLD_SECCIONNUMORDEN = "NumOrden";    
    /** <code>seccionNumOrden</code> attribute field name. */
    public static final String ATTR_FIELD_SECCIONNUMORDEN = "seccionNumOrden";

    // Component role (Cuestionario)
    /** <code>Cuestionario</code> role id. */
    public static final String ROLE_ID_CUESTIONARIO = "Agr_1431633657856096_Alias";
    /** <code>Cuestionario</code> role name. */
    public static final String ROLE_NAME_CUESTIONARIO = "cuestionario";
    /** <code>Cuestionario</code> role alias. */
    public static final String ROLE_ALIAS_CUESTIONARIO = "Cuestionario";

    /** <code>Cuestionario</code> inverse role name. */
    public static final String ROLE_INVNAME_CUESTIONARIO = CuestionarioMedConstants.ROLE_NAME_SECCIONES;
    /** <code>Cuestionario</code> role facet sequence. */
    public static final String PATH_FACETS_CUESTIONARIO = "";
    /** <code>Cuestionario</code> role target class. */
    public static final String ROLE_TARGET_CUESTIONARIO = CuestionarioMedConstants.CLASS_NAME;

    /** Agents allowed to navigate through Cuestionario **/
    public static final String CUESTIONARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";

    // Compound role (Preguntas)
    /** <code>Preguntas</code> role id. */
    public static final String ROLE_ID_PREGUNTAS = "Agr_1431634182144405_Alias";
    /** <code>Preguntas</code> role name. */
    public static final String ROLE_NAME_PREGUNTAS = "preguntas";
    /** <code>Seccion</code> role alias. */
    public static final String ROLE_ALIAS_PREGUNTAS = "Preguntas";


    /** <code>Preguntas</code> inverse role name. */
    public static final String ROLE_INVNAME_PREGUNTAS = PreguntaConstants.ROLE_NAME_SECCION;
    /** <code>Preguntas</code> role facet sequence. */
    public static final String PATH_FACETS_PREGUNTAS = "";
    /** <code>Preguntas</code> role target class. */
    public static final String ROLE_TARGET_PREGUNTAS = PreguntaConstants.CLASS_NAME;
    /** Agents allowed to navigate through Preguntas **/
    public static final String PREGUNTAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431633526784668Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccioncrearpagrCuestionario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SECCIONCREARPAGRCUESTIONARIO = "p_agrCuestionario";
    /** <code>seccioncrearpagrCuestionario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SECCIONCREARPAGRCUESTIONARIO = "Clas_1431633526784668Ser_1Arg_4_Alias";
    /** <code>seccioncrearpagrCuestionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SECCIONCREARPAGRCUESTIONARIO = "Cuestionario";
    /** <code>seccioncrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SECCIONCREARPATRNOMBRE = "p_atrNombre";
    /** <code>seccioncrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SECCIONCREARPATRNOMBRE = "Clas_1431633526784668Ser_1Arg_2_Alias";
    /** <code>seccioncrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SECCIONCREARPATRNOMBRE = "Nombre";
    /** <code>seccioncrearpatrNumOrden</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SECCIONCREARPATRNUMORDEN = "p_atrNumOrden";
    /** <code>seccioncrearpatrNumOrden</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SECCIONCREARPATRNUMORDEN = "Clas_1431633526784668Ser_1Arg_3_Alias";
    /** <code>seccioncrearpatrNumOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SECCIONCREARPATRNUMORDEN = "Nº orden";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431633526784668Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccioneliminarpthisSeccion</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_SECCIONELIMINARPTHISSECCION = "p_thisSeccion";
    /** <code>seccioneliminarpthisSeccion</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_SECCIONELIMINARPTHISSECCION = "Clas_1431633526784668Ser_2Arg_1_Alias";
    /** <code>seccioneliminarpthisSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_SECCIONELIMINARPTHISSECCION = "Sección";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431633526784668Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccionmodificarpthisSeccion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_SECCIONMODIFICARPTHISSECCION = "p_thisSeccion";
    /** <code>seccionmodificarpthisSeccion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_SECCIONMODIFICARPTHISSECCION = "Clas_1431633526784668Ser_3Arg_1_Alias";
    /** <code>seccionmodificarpthisSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_SECCIONMODIFICARPTHISSECCION = "Sección";
    /** <code>seccionmodificarpNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_SECCIONMODIFICARPNOMBRE = "p_Nombre";
    /** <code>seccionmodificarpNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_SECCIONMODIFICARPNOMBRE = "Clas_1431633526784668Ser_3Arg_2_Alias";
    /** <code>seccionmodificarpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_SECCIONMODIFICARPNOMBRE = "Nombre";
    // Service (cambiarOrden)
    /** <code>cambiarOrden</code> service id. */
    public static final String SERV_ID_CAMBIARORDEN = "Clas_1431633526784668Ser_5_Alias";
    /** <code>cambiarOrden</code> service name. */
    public static final String SERV_NAME_CAMBIARORDEN = "cambiarOrden";
    /** <code>cambiarOrden</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARORDEN = "cambiarOrden";
    /** Agents allowed to execute the service cambiarOrden **/
    public static final String CAMBIARORDEN_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccioncambiarOrdenpthisSeccion</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARORDEN_SECCIONCAMBIARORDENPTHISSECCION = "p_thisSeccion";
    /** <code>seccioncambiarOrdenpthisSeccion</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARORDEN_SECCIONCAMBIARORDENPTHISSECCION = "Clas_1431633526784668Ser_5Arg_1_Alias";
    /** <code>seccioncambiarOrdenpthisSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARORDEN_SECCIONCAMBIARORDENPTHISSECCION = "Sección";
    /** <code>seccioncambiarOrdenpNuevoOrden</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARORDEN_SECCIONCAMBIARORDENPNUEVOORDEN = "p_NuevoOrden";
    /** <code>seccioncambiarOrdenpNuevoOrden</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARORDEN_SECCIONCAMBIARORDENPNUEVOORDEN = "Clas_1431633526784668Ser_5Arg_2_Alias";
    /** <code>seccioncambiarOrdenpNuevoOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARORDEN_SECCIONCAMBIARORDENPNUEVOORDEN = "Nuevo orden";
    // Service (CambSeccionPregunta)
    /** <code>CambSeccionPregunta</code> service id. */
    public static final String SERV_ID_CAMBSECCIONPREGUNTA = "Clas_1431633526784668Ser_8_Alias";
    /** <code>CambSeccionPregunta</code> service name. */
    public static final String SERV_NAME_CAMBSECCIONPREGUNTA = "CambSeccionPregunta";
    /** <code>CambSeccionPregunta</code> service alias. */
    public static final String SERV_ALIAS_CAMBSECCIONPREGUNTA = "CambSeccionPregunta";
    /** Agents allowed to execute the service CambSeccionPregunta **/
    public static final String CAMBSECCIONPREGUNTA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccionCambSeccionPreguntapthisSeccion</code> inbound argument name. */
    public static final String ARG_NAME_CAMBSECCIONPREGUNTA_SECCIONCAMBSECCIONPREGUNTAPTHISSECCION = "p_thisSeccion";
    /** <code>seccionCambSeccionPreguntapthisSeccion</code> inbound argument id. */
    public static final String ARG_ID_CAMBSECCIONPREGUNTA_SECCIONCAMBSECCIONPREGUNTAPTHISSECCION = "Clas_1431633526784668Ser_8Arg_1_Alias";
    /** <code>seccionCambSeccionPreguntapthisSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBSECCIONPREGUNTA_SECCIONCAMBSECCIONPREGUNTAPTHISSECCION = "Sección";
    /** <code>seccionCambSeccionPreguntapevcPregunta</code> inbound argument name. */
    public static final String ARG_NAME_CAMBSECCIONPREGUNTA_SECCIONCAMBSECCIONPREGUNTAPEVCPREGUNTA = "p_evcPregunta";
    /** <code>seccionCambSeccionPreguntapevcPregunta</code> inbound argument id. */
    public static final String ARG_ID_CAMBSECCIONPREGUNTA_SECCIONCAMBSECCIONPREGUNTAPEVCPREGUNTA = "Clas_1431633526784668Ser_8Arg_2_Alias";
    /** <code>seccionCambSeccionPreguntapevcPregunta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBSECCIONPREGUNTA_SECCIONCAMBSECCIONPREGUNTAPEVCPREGUNTA = "Preguntas";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1431633526784668Ser_4_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear sección";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TCREAR</code> precondition 0 id. */
    public static final String PRE_ID_TCREAR_0 = "Clas_1431633526784668Pre_1_MsgError";
    // Inbound arguments
    /** <code>seccionTCREARptpagrCuestionario</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SECCIONTCREARPTPAGRCUESTIONARIO = "pt_p_agrCuestionario";
    /** <code>seccionTCREARptpagrCuestionario</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SECCIONTCREARPTPAGRCUESTIONARIO = "Clas_1431633526784668Ser_4Arg_2_Alias";
    /** <code>seccionTCREARptpagrCuestionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SECCIONTCREARPTPAGRCUESTIONARIO = "Cuestionario";
    /** <code>seccionTCREARptpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SECCIONTCREARPTPATRNOMBRE = "pt_p_atrNombre";
    /** <code>seccionTCREARptpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SECCIONTCREARPTPATRNOMBRE = "Clas_1431633526784668Ser_4Arg_3_Alias";
    /** <code>seccionTCREARptpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SECCIONTCREARPTPATRNOMBRE = "Nombre";
    /** <code>seccionTCREARptpatrNumOrden</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_SECCIONTCREARPTPATRNUMORDEN = "pt_p_atrNumOrden";
    /** <code>seccionTCREARptpatrNumOrden</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_SECCIONTCREARPTPATRNUMORDEN = "Clas_1431633526784668Ser_4Arg_4_Alias";
    /** <code>seccionTCREARptpatrNumOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_SECCIONTCREARPTPATRNUMORDEN = "Nº orden";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1431633526784668Ser_6_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar sección";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TMODIFICAR</code> precondition 0 id. */
    public static final String PRE_ID_TMODIFICAR_0 = "Clas_1431633526784668Pre_2_MsgError";
    // Inbound arguments
    /** <code>seccionTMODIFICARpthisSeccion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_SECCIONTMODIFICARPTHISSECCION = "p_thisSeccion";
    /** <code>seccionTMODIFICARpthisSeccion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_SECCIONTMODIFICARPTHISSECCION = "Clas_1431633526784668Ser_6Arg_1_Alias";
    /** <code>seccionTMODIFICARpthisSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_SECCIONTMODIFICARPTHISSECCION = "Sección";
    /** <code>seccionTMODIFICARptpNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_SECCIONTMODIFICARPTPNOMBRE = "pt_p_Nombre";
    /** <code>seccionTMODIFICARptpNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_SECCIONTMODIFICARPTPNOMBRE = "Clas_1431633526784668Ser_6Arg_2_Alias";
    /** <code>seccionTMODIFICARptpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_SECCIONTMODIFICARPTPNOMBRE = "Nombre";
    /** <code>seccionTMODIFICARptpNumOrden</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_SECCIONTMODIFICARPTPNUMORDEN = "pt_p_NumOrden";
    /** <code>seccionTMODIFICARptpNumOrden</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_SECCIONTMODIFICARPTPNUMORDEN = "Clas_1431633526784668Ser_6Arg_3_Alias";
    /** <code>seccionTMODIFICARptpNumOrden</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_SECCIONTMODIFICARPTPNUMORDEN = "Nº orden";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1431633526784668Ser_7_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar sección";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TELIMINAR</code> precondition 0 id. */
    public static final String PRE_ID_TELIMINAR_0 = "Clas_1431633526784668Pre_3_MsgError";
    // Inbound arguments
    /** <code>seccionTELIMINARpthisSeccion</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_SECCIONTELIMINARPTHISSECCION = "p_thisSeccion";
    /** <code>seccionTELIMINARpthisSeccion</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_SECCIONTELIMINARPTHISSECCION = "Clas_1431633526784668Ser_7Arg_1_Alias";
    /** <code>seccionTELIMINARpthisSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_SECCIONTELIMINARPTHISSECCION = "Sección";
    // Service (TCAMBIARORDENPREGS)
    /** <code>TCAMBIARORDENPREGS</code> service id. */
    public static final String SERV_ID_TCAMBIARORDENPREGS = "Clas_1431633526784668Ser_9_Alias";
    /** <code>TCAMBIARORDENPREGS</code> service name. */
    public static final String SERV_NAME_TCAMBIARORDENPREGS = "TCAMBIARORDENPREGS";
    /** <code>TCAMBIARORDENPREGS</code> service alias. */
    public static final String SERV_ALIAS_TCAMBIARORDENPREGS = "TCAMBIARORDENPREGS";
    /** Agents allowed to execute the service TCAMBIARORDENPREGS **/
    public static final String TCAMBIARORDENPREGS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>seccionTCAMBIARORDENPREGSpthisSeccion</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTHISSECCION = "p_thisSeccion";
    /** <code>seccionTCAMBIARORDENPREGSpthisSeccion</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTHISSECCION = "Clas_1431633526784668Ser_9Arg_1_Alias";
    /** <code>seccionTCAMBIARORDENPREGSpthisSeccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTHISSECCION = "Sección";
    /** <code>seccionTCAMBIARORDENPREGSptOrdenDesde</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTORDENDESDE = "ptOrdenDesde";
    /** <code>seccionTCAMBIARORDENPREGSptOrdenDesde</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTORDENDESDE = "Clas_1431633526784668Ser_9Arg_2_Alias";
    /** <code>seccionTCAMBIARORDENPREGSptOrdenDesde</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTORDENDESDE = "ptOrdenDesde";
    /** <code>seccionTCAMBIARORDENPREGSptSubir</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTSUBIR = "ptSubir";
    /** <code>seccionTCAMBIARORDENPREGSptSubir</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTSUBIR = "Clas_1431633526784668Ser_9Arg_3_Alias";
    /** <code>seccionTCAMBIARORDENPREGSptSubir</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTSUBIR = "ptSubir";
    /** <code>seccionTCAMBIARORDENPREGSptOrdenHasta</code> inbound argument name. */
    public static final String ARG_NAME_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTORDENHASTA = "ptOrdenHasta";
    /** <code>seccionTCAMBIARORDENPREGSptOrdenHasta</code> inbound argument id. */
    public static final String ARG_ID_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTORDENHASTA = "Clas_1431633526784668Ser_9Arg_4_Alias";
    /** <code>seccionTCAMBIARORDENPREGSptOrdenHasta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCAMBIARORDENPREGS_SECCIONTCAMBIARORDENPREGSPTORDENHASTA = "ptOrdenHasta";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_SECCIONNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_SECCIONNUMORDEN.toUpperCase(), Constants.Type.NAT.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_SECCIONIDENTIFICADOR.toUpperCase(), SECCIONIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_SECCIONNOMBRE.toUpperCase(), SECCIONNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_SECCIONNUMORDEN.toUpperCase(), SECCIONNUMORDEN_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_CUESTIONARIO.toUpperCase(), CUESTIONARIO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Seccion', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Seccion', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_SECCIONIDENTIFICADOR);
        }
        // Facet 'Seccion' (This facet)
        if (SeccionConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_SECCIONIDENTIFICADOR);
        }
        return returnList;
    }
}
