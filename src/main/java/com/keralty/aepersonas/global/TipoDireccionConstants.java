package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>TipoDireccion</code> model class.
 */
public final class TipoDireccionConstants {

    private TipoDireccionConstants() {

    }

    // Class
    /** <code>TipoDireccion</code> class id. */
    public static final String CLASS_ID = "Clas_1431940628480765_Alias";
    /** <code>TipoDireccion</code> class name. */
    public static final String CLASS_NAME = "TipoDireccion";
    /** <code>TipoDireccion</code> class alias. */
    public static final String CLASS_ALIAS = "Tipo dirección";
    /** <code>TipoDireccion</code> class table name. */
    public static final String TBL_NAME = "TipoDireccion";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "tipoDireccionCodigo,tipoDireccionDescripcion,tipoDireccionEsResidencia,tipoDireccionEsCorrespondencia";

    public static final String DSICTIPODIRECCION = "IC_TipoDireccion";
    

    // Attribute (tipoDireccionCodigo)
    /** <code>tipoDireccionCodigo</code> attribute id. */
    public static final String ATTR_ID_TIPODIRECCIONCODIGO = "Clas_1431940628480765Atr_1_Alias";
    /** <code>tipoDireccionCodigo</code> attribute name. */
    public static final String ATTR_NAME_TIPODIRECCIONCODIGO = "tipoDireccionCodigo";
    /** <code>tipoDireccionCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPODIRECCIONCODIGO = "Código";

    /** <code>tipoDireccionCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPODIRECCIONCODIGO = "";
    /** Agents allowed to view the attribute tipoDireccionCodigo **/
    public static final String TIPODIRECCIONCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (tipoDireccionDescripcion)
    /** <code>tipoDireccionDescripcion</code> attribute id. */
    public static final String ATTR_ID_TIPODIRECCIONDESCRIPCION = "Clas_1431940628480765Atr_2_Alias";
    /** <code>tipoDireccionDescripcion</code> attribute name. */
    public static final String ATTR_NAME_TIPODIRECCIONDESCRIPCION = "tipoDireccionDescripcion";
    /** <code>tipoDireccionDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPODIRECCIONDESCRIPCION = "Descripción";

    /** <code>tipoDireccionDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPODIRECCIONDESCRIPCION = "";
    /** Agents allowed to view the attribute tipoDireccionDescripcion **/
    public static final String TIPODIRECCIONDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoDireccionEsResidencia)
    /** <code>tipoDireccionEsResidencia</code> attribute id. */
    public static final String ATTR_ID_TIPODIRECCIONESRESIDENCIA = "Clas_1431940628480765Atr_3_Alias";
    /** <code>tipoDireccionEsResidencia</code> attribute name. */
    public static final String ATTR_NAME_TIPODIRECCIONESRESIDENCIA = "tipoDireccionEsResidencia";
    /** <code>tipoDireccionEsResidencia</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPODIRECCIONESRESIDENCIA = "Es residencia";

    /** <code>tipoDireccionEsResidencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPODIRECCIONESRESIDENCIA = "";
    /** Agents allowed to view the attribute tipoDireccionEsResidencia **/
    public static final String TIPODIRECCIONESRESIDENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoDireccionEsCorrespondencia)
    /** <code>tipoDireccionEsCorrespondencia</code> attribute id. */
    public static final String ATTR_ID_TIPODIRECCIONESCORRESPONDENCIA = "Clas_1431940628480765Atr_4_Alias";
    /** <code>tipoDireccionEsCorrespondencia</code> attribute name. */
    public static final String ATTR_NAME_TIPODIRECCIONESCORRESPONDENCIA = "tipoDireccionEsCorrespondencia";
    /** <code>tipoDireccionEsCorrespondencia</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPODIRECCIONESCORRESPONDENCIA = "Es correspondencia";

    /** <code>tipoDireccionEsCorrespondencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPODIRECCIONESCORRESPONDENCIA = "";
    /** Agents allowed to view the attribute tipoDireccionEsCorrespondencia **/
    public static final String TIPODIRECCIONESCORRESPONDENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TIPODIRECCIONCODIGO = "Codigo";    
    /** <code>tipoDireccionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPODIRECCIONCODIGO = "tipoDireccionCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_TIPODIRECCIONDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_TIPODIRECCIONDESCRIPCIONLENGTH = 150;
    /** <code>tipoDireccionDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_TIPODIRECCIONDESCRIPCION = "tipoDireccionDescripcion";
    // Field (EsResidencia)
    /** <code>EsResidencia</code> field name. */
    public static final String FLD_TIPODIRECCIONESRESIDENCIA = "EsResidencia";    
    /** <code>tipoDireccionEsResidencia</code> attribute field name. */
    public static final String ATTR_FIELD_TIPODIRECCIONESRESIDENCIA = "tipoDireccionEsResidencia";
    // Field (EsCorrespondencia)
    /** <code>EsCorrespondencia</code> field name. */
    public static final String FLD_TIPODIRECCIONESCORRESPONDENCIA = "EsCorrespondencia";    
    /** <code>tipoDireccionEsCorrespondencia</code> attribute field name. */
    public static final String ATTR_FIELD_TIPODIRECCIONESCORRESPONDENCIA = "tipoDireccionEsCorrespondencia";


    // Compound role (DireccionesC)
    /** <code>DireccionesC</code> role id. */
    public static final String ROLE_ID_DIRECCIONESC = "Agr_1473349943296765_Alias";
    /** <code>DireccionesC</code> role name. */
    public static final String ROLE_NAME_DIRECCIONESC = "direccionesC";
    /** <code>TipoDireccionC</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONESC = "Direcciones";


    /** <code>DireccionesC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONESC = DireccionCConstants.ROLE_NAME_TIPODIRECCIONC;
    /** <code>DireccionesC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONESC = "";
    /** <code>DireccionesC</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONESC = DireccionCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DireccionesC **/
    public static final String DIRECCIONESC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Direcciones)
    /** <code>Direcciones</code> role id. */
    public static final String ROLE_ID_DIRECCIONES = "Agr_1432205131776694_Alias";
    /** <code>Direcciones</code> role name. */
    public static final String ROLE_NAME_DIRECCIONES = "direcciones";
    /** <code>TipoDireccion</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONES = "Direcciones";


    /** <code>Direcciones</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONES = DireccionConstants.ROLE_NAME_TIPODIRECCION;
    /** <code>Direcciones</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONES = "";
    /** <code>Direcciones</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONES = DireccionConstants.CLASS_NAME;
    /** Agents allowed to navigate through Direcciones **/
    public static final String DIRECCIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431940628480765Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear tipo de dirección";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>tipoDireccioncrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPODIRECCIONCREARPATRCODIGO = "p_atrCodigo";
    /** <code>tipoDireccioncrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPODIRECCIONCREARPATRCODIGO = "Clas_1431940628480765Ser_1Arg_1_Alias";
    /** <code>tipoDireccioncrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPODIRECCIONCREARPATRCODIGO = "Código";
    /** <code>tipoDireccioncrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPODIRECCIONCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>tipoDireccioncrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPODIRECCIONCREARPATRDESCRIPCION = "Clas_1431940628480765Ser_1Arg_2_Alias";
    /** <code>tipoDireccioncrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPODIRECCIONCREARPATRDESCRIPCION = "Descripción";
    /** <code>tipoDireccioncrearpatrEsResidencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPODIRECCIONCREARPATRESRESIDENCIA = "p_atrEsResidencia";
    /** <code>tipoDireccioncrearpatrEsResidencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPODIRECCIONCREARPATRESRESIDENCIA = "Clas_1431940628480765Ser_1Arg_3_Alias";
    /** <code>tipoDireccioncrearpatrEsResidencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPODIRECCIONCREARPATRESRESIDENCIA = "Es residencia";
    /** <code>tipoDireccioncrearpatrEsCorrespondencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPODIRECCIONCREARPATRESCORRESPONDENCIA = "p_atrEsCorrespondencia";
    /** <code>tipoDireccioncrearpatrEsCorrespondencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPODIRECCIONCREARPATRESCORRESPONDENCIA = "Clas_1431940628480765Ser_1Arg_4_Alias";
    /** <code>tipoDireccioncrearpatrEsCorrespondencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPODIRECCIONCREARPATRESCORRESPONDENCIA = "Es correspondencia";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431940628480765Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar tipo de dirección";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>tipoDireccioneliminarpthisTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_TIPODIRECCIONELIMINARPTHISTIPODIRECCION = "p_thisTipoDireccion";
    /** <code>tipoDireccioneliminarpthisTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_TIPODIRECCIONELIMINARPTHISTIPODIRECCION = "Clas_1431940628480765Ser_2Arg_1_Alias";
    /** <code>tipoDireccioneliminarpthisTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_TIPODIRECCIONELIMINARPTHISTIPODIRECCION = "Tipo dirección";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431940628480765Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar tipo de dirección";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tipoDireccionmodificarpthisTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPODIRECCIONMODIFICARPTHISTIPODIRECCION = "p_thisTipoDireccion";
    /** <code>tipoDireccionmodificarpthisTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPODIRECCIONMODIFICARPTHISTIPODIRECCION = "Clas_1431940628480765Ser_3Arg_1_Alias";
    /** <code>tipoDireccionmodificarpthisTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPODIRECCIONMODIFICARPTHISTIPODIRECCION = "Tipo dirección";
    /** <code>tipoDireccionmodificarpEsResidencia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPODIRECCIONMODIFICARPESRESIDENCIA = "p_EsResidencia";
    /** <code>tipoDireccionmodificarpEsResidencia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPODIRECCIONMODIFICARPESRESIDENCIA = "Clas_1431940628480765Ser_3Arg_4_Alias";
    /** <code>tipoDireccionmodificarpEsResidencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPODIRECCIONMODIFICARPESRESIDENCIA = "Es residencia";
    /** <code>tipoDireccionmodificarpEsCorrespondencia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPODIRECCIONMODIFICARPESCORRESPONDENCIA = "p_EsCorrespondencia";
    /** <code>tipoDireccionmodificarpEsCorrespondencia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPODIRECCIONMODIFICARPESCORRESPONDENCIA = "Clas_1431940628480765Ser_3Arg_5_Alias";
    /** <code>tipoDireccionmodificarpEsCorrespondencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPODIRECCIONMODIFICARPESCORRESPONDENCIA = "Es correspondencia";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431940628480765Ser_4_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoDireccionsincronizarpthisTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_TIPODIRECCIONSINCRONIZARPTHISTIPODIRECCION = "p_thisTipoDireccion";
    /** <code>tipoDireccionsincronizarpthisTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_TIPODIRECCIONSINCRONIZARPTHISTIPODIRECCION = "Clas_1431940628480765Ser_4Arg_1_Alias";
    /** <code>tipoDireccionsincronizarpthisTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_TIPODIRECCIONSINCRONIZARPTHISTIPODIRECCION = "Tipo dirección";
    /** <code>tipoDireccionsincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_TIPODIRECCIONSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>tipoDireccionsincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_TIPODIRECCIONSINCRONIZARPDESCRIPCION = "Clas_1431940628480765Ser_4Arg_2_Alias";
    /** <code>tipoDireccionsincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_TIPODIRECCIONSINCRONIZARPDESCRIPCION = "Descripción";
    // Service (InsTipoDireccion)
    /** <code>InsTipoDireccion</code> service id. */
    public static final String SERV_ID_INSTIPODIRECCION = "Clas_1431940628480765Ser_5_Alias";
    /** <code>InsTipoDireccion</code> service name. */
    public static final String SERV_NAME_INSTIPODIRECCION = "InsTipoDireccion";
    /** <code>InsTipoDireccion</code> service alias. */
    public static final String SERV_ALIAS_INSTIPODIRECCION = "InsTipoDireccion";
    /** Agents allowed to execute the service InsTipoDireccion **/
    public static final String INSTIPODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoDireccionInsTipoDireccionpthisTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPODIRECCION_TIPODIRECCIONINSTIPODIRECCIONPTHISTIPODIRECCION = "p_thisTipoDireccion";
    /** <code>tipoDireccionInsTipoDireccionpthisTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPODIRECCION_TIPODIRECCIONINSTIPODIRECCIONPTHISTIPODIRECCION = "Clas_1431940628480765Ser_5Arg_1_Alias";
    /** <code>tipoDireccionInsTipoDireccionpthisTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPODIRECCION_TIPODIRECCIONINSTIPODIRECCIONPTHISTIPODIRECCION = "Tipo dirección";
    /** <code>tipoDireccionInsTipoDireccionpevcDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPODIRECCION_TIPODIRECCIONINSTIPODIRECCIONPEVCDIRECCION = "p_evcDireccion";
    /** <code>tipoDireccionInsTipoDireccionpevcDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPODIRECCION_TIPODIRECCIONINSTIPODIRECCIONPEVCDIRECCION = "Clas_1431940628480765Ser_5Arg_2_Alias";
    /** <code>tipoDireccionInsTipoDireccionpevcDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPODIRECCION_TIPODIRECCIONINSTIPODIRECCIONPEVCDIRECCION = "Direcciones";
    // Service (DelTipoDireccion)
    /** <code>DelTipoDireccion</code> service id. */
    public static final String SERV_ID_DELTIPODIRECCION = "Clas_1431940628480765Ser_6_Alias";
    /** <code>DelTipoDireccion</code> service name. */
    public static final String SERV_NAME_DELTIPODIRECCION = "DelTipoDireccion";
    /** <code>DelTipoDireccion</code> service alias. */
    public static final String SERV_ALIAS_DELTIPODIRECCION = "DelTipoDireccion";
    /** Agents allowed to execute the service DelTipoDireccion **/
    public static final String DELTIPODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoDireccionDelTipoDireccionpthisTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPODIRECCION_TIPODIRECCIONDELTIPODIRECCIONPTHISTIPODIRECCION = "p_thisTipoDireccion";
    /** <code>tipoDireccionDelTipoDireccionpthisTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPODIRECCION_TIPODIRECCIONDELTIPODIRECCIONPTHISTIPODIRECCION = "Clas_1431940628480765Ser_6Arg_1_Alias";
    /** <code>tipoDireccionDelTipoDireccionpthisTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPODIRECCION_TIPODIRECCIONDELTIPODIRECCIONPTHISTIPODIRECCION = "Tipo dirección";
    /** <code>tipoDireccionDelTipoDireccionpevcDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPODIRECCION_TIPODIRECCIONDELTIPODIRECCIONPEVCDIRECCION = "p_evcDireccion";
    /** <code>tipoDireccionDelTipoDireccionpevcDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPODIRECCION_TIPODIRECCIONDELTIPODIRECCIONPEVCDIRECCION = "Clas_1431940628480765Ser_6Arg_2_Alias";
    /** <code>tipoDireccionDelTipoDireccionpevcDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPODIRECCION_TIPODIRECCIONDELTIPODIRECCIONPEVCDIRECCION = "Direcciones";
    // Service (InsTipoDireccionC)
    /** <code>InsTipoDireccionC</code> service id. */
    public static final String SERV_ID_INSTIPODIRECCIONC = "Clas_1431940628480765Ser_7_Alias";
    /** <code>InsTipoDireccionC</code> service name. */
    public static final String SERV_NAME_INSTIPODIRECCIONC = "InsTipoDireccionC";
    /** <code>InsTipoDireccionC</code> service alias. */
    public static final String SERV_ALIAS_INSTIPODIRECCIONC = "InsTipoDireccionC";
    /** Agents allowed to execute the service InsTipoDireccionC **/
    public static final String INSTIPODIRECCIONC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoDireccionInsTipoDireccionCpthisTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPODIRECCIONC_TIPODIRECCIONINSTIPODIRECCIONCPTHISTIPODIRECCION = "p_thisTipoDireccion";
    /** <code>tipoDireccionInsTipoDireccionCpthisTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPODIRECCIONC_TIPODIRECCIONINSTIPODIRECCIONCPTHISTIPODIRECCION = "Clas_1431940628480765Ser_7Arg_1_Alias";
    /** <code>tipoDireccionInsTipoDireccionCpthisTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPODIRECCIONC_TIPODIRECCIONINSTIPODIRECCIONCPTHISTIPODIRECCION = "Tipo dirección";
    /** <code>tipoDireccionInsTipoDireccionCpevcDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPODIRECCIONC_TIPODIRECCIONINSTIPODIRECCIONCPEVCDIRECCIONC = "p_evcDireccionC";
    /** <code>tipoDireccionInsTipoDireccionCpevcDireccionC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPODIRECCIONC_TIPODIRECCIONINSTIPODIRECCIONCPEVCDIRECCIONC = "Clas_1431940628480765Ser_7Arg_2_Alias";
    /** <code>tipoDireccionInsTipoDireccionCpevcDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPODIRECCIONC_TIPODIRECCIONINSTIPODIRECCIONCPEVCDIRECCIONC = "Direcciones";
    // Service (DelTipoDireccionC)
    /** <code>DelTipoDireccionC</code> service id. */
    public static final String SERV_ID_DELTIPODIRECCIONC = "Clas_1431940628480765Ser_8_Alias";
    /** <code>DelTipoDireccionC</code> service name. */
    public static final String SERV_NAME_DELTIPODIRECCIONC = "DelTipoDireccionC";
    /** <code>DelTipoDireccionC</code> service alias. */
    public static final String SERV_ALIAS_DELTIPODIRECCIONC = "DelTipoDireccionC";
    /** Agents allowed to execute the service DelTipoDireccionC **/
    public static final String DELTIPODIRECCIONC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoDireccionDelTipoDireccionCpthisTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPODIRECCIONC_TIPODIRECCIONDELTIPODIRECCIONCPTHISTIPODIRECCION = "p_thisTipoDireccion";
    /** <code>tipoDireccionDelTipoDireccionCpthisTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPODIRECCIONC_TIPODIRECCIONDELTIPODIRECCIONCPTHISTIPODIRECCION = "Clas_1431940628480765Ser_8Arg_1_Alias";
    /** <code>tipoDireccionDelTipoDireccionCpthisTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPODIRECCIONC_TIPODIRECCIONDELTIPODIRECCIONCPTHISTIPODIRECCION = "Tipo dirección";
    /** <code>tipoDireccionDelTipoDireccionCpevcDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPODIRECCIONC_TIPODIRECCIONDELTIPODIRECCIONCPEVCDIRECCIONC = "p_evcDireccionC";
    /** <code>tipoDireccionDelTipoDireccionCpevcDireccionC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPODIRECCIONC_TIPODIRECCIONDELTIPODIRECCIONCPEVCDIRECCIONC = "Clas_1431940628480765Ser_8Arg_2_Alias";
    /** <code>tipoDireccionDelTipoDireccionCpevcDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPODIRECCIONC_TIPODIRECCIONDELTIPODIRECCIONCPEVCDIRECCIONC = "Direcciones";

    public static final String FILTER_NAME_IFTIPODIRECCIONRESIDENCIAL = "iF_TipoDireccionResidencial";
    public static final String FILTER_NAME_IFTIPODIRECCIONCODIGO = "iF_TipoDireccionCodigo";
    public static final String VAR_NAME_IFTIPODIRECCIONCODIGO_VCODIGO = "v_Codigo";
    public static final String FILTER_NAME_IFTIPODIRECCIONCORRESPONDENCI = "iF_TipoDireccionCorrespondenci";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_TIPODIRECCIONDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPODIRECCIONESRESIDENCIA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPODIRECCIONESCORRESPONDENCIA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_TIPODIRECCIONCODIGO.toUpperCase(), TIPODIRECCIONCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPODIRECCIONDESCRIPCION.toUpperCase(), TIPODIRECCIONDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPODIRECCIONESRESIDENCIA.toUpperCase(), TIPODIRECCIONESRESIDENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPODIRECCIONESCORRESPONDENCIA.toUpperCase(), TIPODIRECCIONESCORRESPONDENCIA_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'TipoDireccion', it returns the identification keys
     * - If className is a facet of the inheritance net of 'TipoDireccion', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_TIPODIRECCIONCODIGO);
        }
        // Facet 'TipoDireccion' (This facet)
        if (TipoDireccionConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_TIPODIRECCIONCODIGO);
        }
        return returnList;
    }
}
