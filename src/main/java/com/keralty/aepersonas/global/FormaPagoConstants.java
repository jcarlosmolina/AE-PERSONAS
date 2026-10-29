package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>FormaPago</code> model class.
 */
public final class FormaPagoConstants {

    private FormaPagoConstants() {

    }

    // Class
    /** <code>FormaPago</code> class id. */
    public static final String CLASS_ID = "Clas_1431941677056219_Alias";
    /** <code>FormaPago</code> class name. */
    public static final String CLASS_NAME = "FormaPago";
    /** <code>FormaPago</code> class alias. */
    public static final String CLASS_ALIAS = "Forma pago";
    /** <code>FormaPago</code> class table name. */
    public static final String TBL_NAME = "FormaPago";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "formaPagoCodigo,formaPagoDescripcion,formaPagoAbrirURL,formaPagoEsVisible";

    public static final String DSICFORMAPAGO = "IC_FormaPago";
    public static final String DSDSFORMAPAGODETDOMINIO = "DS_FormaPagoDetDominio";
    

    // Attribute (formaPagoCodigo)
    /** <code>formaPagoCodigo</code> attribute id. */
    public static final String ATTR_ID_FORMAPAGOCODIGO = "Clas_1431941677056219Atr_1_Alias";
    /** <code>formaPagoCodigo</code> attribute name. */
    public static final String ATTR_NAME_FORMAPAGOCODIGO = "formaPagoCodigo";
    /** <code>formaPagoCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_FORMAPAGOCODIGO = "Código";

    /** <code>formaPagoCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_FORMAPAGOCODIGO = "";
    /** Agents allowed to view the attribute formaPagoCodigo **/
    public static final String FORMAPAGOCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (formaPagoDescripcion)
    /** <code>formaPagoDescripcion</code> attribute id. */
    public static final String ATTR_ID_FORMAPAGODESCRIPCION = "Clas_1431941677056219Atr_2_Alias";
    /** <code>formaPagoDescripcion</code> attribute name. */
    public static final String ATTR_NAME_FORMAPAGODESCRIPCION = "formaPagoDescripcion";
    /** <code>formaPagoDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_FORMAPAGODESCRIPCION = "Descripción";

    /** <code>formaPagoDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_FORMAPAGODESCRIPCION = "";
    /** Agents allowed to view the attribute formaPagoDescripcion **/
    public static final String FORMAPAGODESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (formaPagoAbrirURL)
    /** <code>formaPagoAbrirURL</code> attribute id. */
    public static final String ATTR_ID_FORMAPAGOABRIRURL = "Clas_1431941677056219Atr_3_Alias";
    /** <code>formaPagoAbrirURL</code> attribute name. */
    public static final String ATTR_NAME_FORMAPAGOABRIRURL = "formaPagoAbrirURL";
    /** <code>formaPagoAbrirURL</code> attribute alias. */
    public static final String ATTR_ALIAS_FORMAPAGOABRIRURL = "Abrir URL";

    /** <code>formaPagoAbrirURL</code> attribute facet sequence. */
    public static final String PATH_FACETS_FORMAPAGOABRIRURL = "";
    /** Agents allowed to view the attribute formaPagoAbrirURL **/
    public static final String FORMAPAGOABRIRURL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (formaPagoEsVisible)
    /** <code>formaPagoEsVisible</code> attribute id. */
    public static final String ATTR_ID_FORMAPAGOESVISIBLE = "Clas_1431941677056219Atr_4_Alias";
    /** <code>formaPagoEsVisible</code> attribute name. */
    public static final String ATTR_NAME_FORMAPAGOESVISIBLE = "formaPagoEsVisible";
    /** <code>formaPagoEsVisible</code> attribute alias. */
    public static final String ATTR_ALIAS_FORMAPAGOESVISIBLE = "Visible";

    /** <code>formaPagoEsVisible</code> attribute facet sequence. */
    public static final String PATH_FACETS_FORMAPAGOESVISIBLE = "";
    /** Agents allowed to view the attribute formaPagoEsVisible **/
    public static final String FORMAPAGOESVISIBLE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_FORMAPAGOCODIGO = "Codigo";    
    /** <code>formaPagoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_FORMAPAGOCODIGO = "formaPagoCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_FORMAPAGODESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_FORMAPAGODESCRIPCIONLENGTH = 150;
    /** <code>formaPagoDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_FORMAPAGODESCRIPCION = "formaPagoDescripcion";
    // Field (AbrirURL)
    /** <code>AbrirURL</code> field name. */
    public static final String FLD_FORMAPAGOABRIRURL = "AbrirURL";    
    /** <code>formaPagoAbrirURL</code> attribute field name. */
    public static final String ATTR_FIELD_FORMAPAGOABRIRURL = "formaPagoAbrirURL";
    // Field (EsVisible)
    /** <code>EsVisible</code> field name. */
    public static final String FLD_FORMAPAGOESVISIBLE = "EsVisible";    
    /** <code>formaPagoEsVisible</code> attribute field name. */
    public static final String ATTR_FIELD_FORMAPAGOESVISIBLE = "formaPagoEsVisible";


    // Compound role (Dominios)
    /** <code>Dominios</code> role id. */
    public static final String ROLE_ID_DOMINIOS = "Agr_1537782054912119_Alias";
    /** <code>Dominios</code> role name. */
    public static final String ROLE_NAME_DOMINIOS = "dominios";
    /** <code>FormasPago</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOS = "Dominios";


    /** <code>Dominios</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOS = DominioConstants.ROLE_NAME_FORMASPAGO;
    /** <code>Dominios</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOS = "";
    /** <code>Dominios</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOS = DominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Dominios **/
    public static final String DOMINIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Solicitudes)
    /** <code>Solicitudes</code> role id. */
    public static final String ROLE_ID_SOLICITUDES = "Agr_1432810422272649_Alias";
    /** <code>Solicitudes</code> role name. */
    public static final String ROLE_NAME_SOLICITUDES = "solicitudes";
    /** <code>FormaPago</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDES = "Solicitudes";


    /** <code>Solicitudes</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDES = SolicitudConstants.ROLE_NAME_FORMAPAGO;
    /** <code>Solicitudes</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDES = "";
    /** <code>Solicitudes</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDES = SolicitudConstants.CLASS_NAME;
    /** Agents allowed to navigate through Solicitudes **/
    public static final String SOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1473094483968463_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>FormaPagoC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_FORMAPAGOC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431941677056219Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear forma de pago";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>formaPagocrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FORMAPAGOCREARPATRCODIGO = "p_atrCodigo";
    /** <code>formaPagocrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FORMAPAGOCREARPATRCODIGO = "Clas_1431941677056219Ser_1Arg_1_Alias";
    /** <code>formaPagocrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FORMAPAGOCREARPATRCODIGO = "Código";
    /** <code>formaPagocrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FORMAPAGOCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>formaPagocrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FORMAPAGOCREARPATRDESCRIPCION = "Clas_1431941677056219Ser_1Arg_2_Alias";
    /** <code>formaPagocrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FORMAPAGOCREARPATRDESCRIPCION = "Descripción";
    /** <code>formaPagocrearpatrAbrirURL</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FORMAPAGOCREARPATRABRIRURL = "p_atrAbrirURL";
    /** <code>formaPagocrearpatrAbrirURL</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FORMAPAGOCREARPATRABRIRURL = "Clas_1431941677056219Ser_1Arg_3_Alias";
    /** <code>formaPagocrearpatrAbrirURL</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FORMAPAGOCREARPATRABRIRURL = "Abrir URL";
    /** <code>formaPagocrearpatrEsVisible</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FORMAPAGOCREARPATRESVISIBLE = "p_atrEsVisible";
    /** <code>formaPagocrearpatrEsVisible</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FORMAPAGOCREARPATRESVISIBLE = "Clas_1431941677056219Ser_1Arg_4_Alias";
    /** <code>formaPagocrearpatrEsVisible</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FORMAPAGOCREARPATRESVISIBLE = "Visible";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431941677056219Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar forma de pago";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>formaPagoeliminarpthisFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_FORMAPAGOELIMINARPTHISFORMAPAGO = "p_thisFormaPago";
    /** <code>formaPagoeliminarpthisFormaPago</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_FORMAPAGOELIMINARPTHISFORMAPAGO = "Clas_1431941677056219Ser_2Arg_1_Alias";
    /** <code>formaPagoeliminarpthisFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_FORMAPAGOELIMINARPTHISFORMAPAGO = "Forma pago";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431941677056219Ser_4_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar forma de pago";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>formaPagomodificarpthisFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FORMAPAGOMODIFICARPTHISFORMAPAGO = "p_thisFormaPago";
    /** <code>formaPagomodificarpthisFormaPago</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FORMAPAGOMODIFICARPTHISFORMAPAGO = "Clas_1431941677056219Ser_4Arg_1_Alias";
    /** <code>formaPagomodificarpthisFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FORMAPAGOMODIFICARPTHISFORMAPAGO = "Forma pago";
    /** <code>formaPagomodificarpAbrirURL</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FORMAPAGOMODIFICARPABRIRURL = "p_AbrirURL";
    /** <code>formaPagomodificarpAbrirURL</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FORMAPAGOMODIFICARPABRIRURL = "Clas_1431941677056219Ser_4Arg_2_Alias";
    /** <code>formaPagomodificarpAbrirURL</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FORMAPAGOMODIFICARPABRIRURL = "Abrir URL";
    /** <code>formaPagomodificarpVisible</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FORMAPAGOMODIFICARPVISIBLE = "p_Visible";
    /** <code>formaPagomodificarpVisible</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FORMAPAGOMODIFICARPVISIBLE = "Clas_1431941677056219Ser_4Arg_3_Alias";
    /** <code>formaPagomodificarpVisible</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FORMAPAGOMODIFICARPVISIBLE = "Visible";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431941677056219Ser_5_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>formaPagosincronizarpthisFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_FORMAPAGOSINCRONIZARPTHISFORMAPAGO = "p_thisFormaPago";
    /** <code>formaPagosincronizarpthisFormaPago</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_FORMAPAGOSINCRONIZARPTHISFORMAPAGO = "Clas_1431941677056219Ser_5Arg_1_Alias";
    /** <code>formaPagosincronizarpthisFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_FORMAPAGOSINCRONIZARPTHISFORMAPAGO = "Forma pago";
    /** <code>formaPagosincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_FORMAPAGOSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>formaPagosincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_FORMAPAGOSINCRONIZARPDESCRIPCION = "Clas_1431941677056219Ser_5Arg_2_Alias";
    /** <code>formaPagosincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_FORMAPAGOSINCRONIZARPDESCRIPCION = "Descripción";
    // Service (InsFormaPagoSolicitud)
    /** <code>InsFormaPagoSolicitud</code> service id. */
    public static final String SERV_ID_INSFORMAPAGOSOLICITUD = "Clas_1431941677056219Ser_6_Alias";
    /** <code>InsFormaPagoSolicitud</code> service name. */
    public static final String SERV_NAME_INSFORMAPAGOSOLICITUD = "InsFormaPagoSolicitud";
    /** <code>InsFormaPagoSolicitud</code> service alias. */
    public static final String SERV_ALIAS_INSFORMAPAGOSOLICITUD = "InsFormaPagoSolicitud";
    /** Agents allowed to execute the service InsFormaPagoSolicitud **/
    public static final String INSFORMAPAGOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>formaPagoInsFormaPagoSolicitudpthisFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_INSFORMAPAGOSOLICITUD_FORMAPAGOINSFORMAPAGOSOLICITUDPTHISFORMAPAGO = "p_thisFormaPago";
    /** <code>formaPagoInsFormaPagoSolicitudpthisFormaPago</code> inbound argument id. */
    public static final String ARG_ID_INSFORMAPAGOSOLICITUD_FORMAPAGOINSFORMAPAGOSOLICITUDPTHISFORMAPAGO = "Clas_1431941677056219Ser_6Arg_1_Alias";
    /** <code>formaPagoInsFormaPagoSolicitudpthisFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFORMAPAGOSOLICITUD_FORMAPAGOINSFORMAPAGOSOLICITUDPTHISFORMAPAGO = "Forma Pago";
    /** <code>formaPagoInsFormaPagoSolicitudpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSFORMAPAGOSOLICITUD_FORMAPAGOINSFORMAPAGOSOLICITUDPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>formaPagoInsFormaPagoSolicitudpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSFORMAPAGOSOLICITUD_FORMAPAGOINSFORMAPAGOSOLICITUDPEVCSOLICITUD = "Clas_1431941677056219Ser_6Arg_2_Alias";
    /** <code>formaPagoInsFormaPagoSolicitudpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFORMAPAGOSOLICITUD_FORMAPAGOINSFORMAPAGOSOLICITUDPEVCSOLICITUD = "Solicitudes";
    // Service (DelFormaPagoSolicitud)
    /** <code>DelFormaPagoSolicitud</code> service id. */
    public static final String SERV_ID_DELFORMAPAGOSOLICITUD = "Clas_1431941677056219Ser_7_Alias";
    /** <code>DelFormaPagoSolicitud</code> service name. */
    public static final String SERV_NAME_DELFORMAPAGOSOLICITUD = "DelFormaPagoSolicitud";
    /** <code>DelFormaPagoSolicitud</code> service alias. */
    public static final String SERV_ALIAS_DELFORMAPAGOSOLICITUD = "DelFormaPagoSolicitud";
    /** Agents allowed to execute the service DelFormaPagoSolicitud **/
    public static final String DELFORMAPAGOSOLICITUD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>formaPagoDelFormaPagoSolicitudpthisFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_DELFORMAPAGOSOLICITUD_FORMAPAGODELFORMAPAGOSOLICITUDPTHISFORMAPAGO = "p_thisFormaPago";
    /** <code>formaPagoDelFormaPagoSolicitudpthisFormaPago</code> inbound argument id. */
    public static final String ARG_ID_DELFORMAPAGOSOLICITUD_FORMAPAGODELFORMAPAGOSOLICITUDPTHISFORMAPAGO = "Clas_1431941677056219Ser_7Arg_1_Alias";
    /** <code>formaPagoDelFormaPagoSolicitudpthisFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFORMAPAGOSOLICITUD_FORMAPAGODELFORMAPAGOSOLICITUDPTHISFORMAPAGO = "Forma Pago";
    /** <code>formaPagoDelFormaPagoSolicitudpevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELFORMAPAGOSOLICITUD_FORMAPAGODELFORMAPAGOSOLICITUDPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>formaPagoDelFormaPagoSolicitudpevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELFORMAPAGOSOLICITUD_FORMAPAGODELFORMAPAGOSOLICITUDPEVCSOLICITUD = "Clas_1431941677056219Ser_7Arg_2_Alias";
    /** <code>formaPagoDelFormaPagoSolicitudpevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFORMAPAGOSOLICITUD_FORMAPAGODELFORMAPAGOSOLICITUDPEVCSOLICITUD = "Solicitudes";
    // Service (InsFormaPagoC)
    /** <code>InsFormaPagoC</code> service id. */
    public static final String SERV_ID_INSFORMAPAGOC = "Clas_1431941677056219Ser_10_Alias";
    /** <code>InsFormaPagoC</code> service name. */
    public static final String SERV_NAME_INSFORMAPAGOC = "InsFormaPagoC";
    /** <code>InsFormaPagoC</code> service alias. */
    public static final String SERV_ALIAS_INSFORMAPAGOC = "InsFormaPagoC";
    /** Agents allowed to execute the service InsFormaPagoC **/
    public static final String INSFORMAPAGOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>formaPagoInsFormaPagoCpthisFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_INSFORMAPAGOC_FORMAPAGOINSFORMAPAGOCPTHISFORMAPAGO = "p_thisFormaPago";
    /** <code>formaPagoInsFormaPagoCpthisFormaPago</code> inbound argument id. */
    public static final String ARG_ID_INSFORMAPAGOC_FORMAPAGOINSFORMAPAGOCPTHISFORMAPAGO = "Clas_1431941677056219Ser_10Arg_1_Alias";
    /** <code>formaPagoInsFormaPagoCpthisFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFORMAPAGOC_FORMAPAGOINSFORMAPAGOCPTHISFORMAPAGO = "Forma pago";
    /** <code>formaPagoInsFormaPagoCpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_INSFORMAPAGOC_FORMAPAGOINSFORMAPAGOCPEVCCONTRATOC = "p_evcContratoC";
    /** <code>formaPagoInsFormaPagoCpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_INSFORMAPAGOC_FORMAPAGOINSFORMAPAGOCPEVCCONTRATOC = "Clas_1431941677056219Ser_10Arg_2_Alias";
    /** <code>formaPagoInsFormaPagoCpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFORMAPAGOC_FORMAPAGOINSFORMAPAGOCPEVCCONTRATOC = "Contratos";
    // Service (DelFormaPagoC)
    /** <code>DelFormaPagoC</code> service id. */
    public static final String SERV_ID_DELFORMAPAGOC = "Clas_1431941677056219Ser_11_Alias";
    /** <code>DelFormaPagoC</code> service name. */
    public static final String SERV_NAME_DELFORMAPAGOC = "DelFormaPagoC";
    /** <code>DelFormaPagoC</code> service alias. */
    public static final String SERV_ALIAS_DELFORMAPAGOC = "DelFormaPagoC";
    /** Agents allowed to execute the service DelFormaPagoC **/
    public static final String DELFORMAPAGOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>formaPagoDelFormaPagoCpthisFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_DELFORMAPAGOC_FORMAPAGODELFORMAPAGOCPTHISFORMAPAGO = "p_thisFormaPago";
    /** <code>formaPagoDelFormaPagoCpthisFormaPago</code> inbound argument id. */
    public static final String ARG_ID_DELFORMAPAGOC_FORMAPAGODELFORMAPAGOCPTHISFORMAPAGO = "Clas_1431941677056219Ser_11Arg_1_Alias";
    /** <code>formaPagoDelFormaPagoCpthisFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFORMAPAGOC_FORMAPAGODELFORMAPAGOCPTHISFORMAPAGO = "Forma pago";
    /** <code>formaPagoDelFormaPagoCpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_DELFORMAPAGOC_FORMAPAGODELFORMAPAGOCPEVCCONTRATOC = "p_evcContratoC";
    /** <code>formaPagoDelFormaPagoCpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_DELFORMAPAGOC_FORMAPAGODELFORMAPAGOCPEVCCONTRATOC = "Clas_1431941677056219Ser_11Arg_2_Alias";
    /** <code>formaPagoDelFormaPagoCpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFORMAPAGOC_FORMAPAGODELFORMAPAGOCPEVCCONTRATOC = "Contratos";
    // Service (InsFormaPago)
    /** <code>InsFormaPago</code> service id. */
    public static final String SERV_ID_INSFORMAPAGO = "Clas_1431941677056219Ser_12_Alias";
    /** <code>InsFormaPago</code> service name. */
    public static final String SERV_NAME_INSFORMAPAGO = "InsFormaPago";
    /** <code>InsFormaPago</code> service alias. */
    public static final String SERV_ALIAS_INSFORMAPAGO = "InsFormaPago";
    /** Agents allowed to execute the service InsFormaPago **/
    public static final String INSFORMAPAGO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>formaPagoInsFormaPagopthisFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_INSFORMAPAGO_FORMAPAGOINSFORMAPAGOPTHISFORMAPAGO = "p_thisFormaPago";
    /** <code>formaPagoInsFormaPagopthisFormaPago</code> inbound argument id. */
    public static final String ARG_ID_INSFORMAPAGO_FORMAPAGOINSFORMAPAGOPTHISFORMAPAGO = "Clas_1431941677056219Ser_12Arg_1_Alias";
    /** <code>formaPagoInsFormaPagopthisFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFORMAPAGO_FORMAPAGOINSFORMAPAGOPTHISFORMAPAGO = "Formas de Pago";
    /** <code>formaPagoInsFormaPagopevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSFORMAPAGO_FORMAPAGOINSFORMAPAGOPEVCDOMINIO = "p_evcDominio";
    /** <code>formaPagoInsFormaPagopevcDominio</code> inbound argument id. */
    public static final String ARG_ID_INSFORMAPAGO_FORMAPAGOINSFORMAPAGOPEVCDOMINIO = "Clas_1431941677056219Ser_12Arg_2_Alias";
    /** <code>formaPagoInsFormaPagopevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFORMAPAGO_FORMAPAGOINSFORMAPAGOPEVCDOMINIO = "Dominios";
    // Service (DelFormaPago)
    /** <code>DelFormaPago</code> service id. */
    public static final String SERV_ID_DELFORMAPAGO = "Clas_1431941677056219Ser_13_Alias";
    /** <code>DelFormaPago</code> service name. */
    public static final String SERV_NAME_DELFORMAPAGO = "DelFormaPago";
    /** <code>DelFormaPago</code> service alias. */
    public static final String SERV_ALIAS_DELFORMAPAGO = "DelFormaPago";
    /** Agents allowed to execute the service DelFormaPago **/
    public static final String DELFORMAPAGO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>formaPagoDelFormaPagopthisFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_DELFORMAPAGO_FORMAPAGODELFORMAPAGOPTHISFORMAPAGO = "p_thisFormaPago";
    /** <code>formaPagoDelFormaPagopthisFormaPago</code> inbound argument id. */
    public static final String ARG_ID_DELFORMAPAGO_FORMAPAGODELFORMAPAGOPTHISFORMAPAGO = "Clas_1431941677056219Ser_13Arg_1_Alias";
    /** <code>formaPagoDelFormaPagopthisFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFORMAPAGO_FORMAPAGODELFORMAPAGOPTHISFORMAPAGO = "Formas de Pago";
    /** <code>formaPagoDelFormaPagopevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELFORMAPAGO_FORMAPAGODELFORMAPAGOPEVCDOMINIO = "p_evcDominio";
    /** <code>formaPagoDelFormaPagopevcDominio</code> inbound argument id. */
    public static final String ARG_ID_DELFORMAPAGO_FORMAPAGODELFORMAPAGOPEVCDOMINIO = "Clas_1431941677056219Ser_13Arg_2_Alias";
    /** <code>formaPagoDelFormaPagopevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFORMAPAGO_FORMAPAGODELFORMAPAGOPEVCDOMINIO = "Dominios";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_FORMAPAGODESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FORMAPAGOABRIRURL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_FORMAPAGOESVISIBLE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_FORMAPAGOCODIGO.toUpperCase(), FORMAPAGOCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_FORMAPAGODESCRIPCION.toUpperCase(), FORMAPAGODESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_FORMAPAGOABRIRURL.toUpperCase(), FORMAPAGOABRIRURL_AGENTS);
    	attributeAgents.put(ATTR_NAME_FORMAPAGOESVISIBLE.toUpperCase(), FORMAPAGOESVISIBLE_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'FormaPago', it returns the identification keys
     * - If className is a facet of the inheritance net of 'FormaPago', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_FORMAPAGOCODIGO);
        }
        // Facet 'FormaPago' (This facet)
        if (FormaPagoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FORMAPAGOCODIGO);
        }
        return returnList;
    }
}
