package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>PlantillaEmail</code> model class.
 */
public final class PlantillaEmailConstants {

    private PlantillaEmailConstants() {

    }

    // Class
    /** <code>PlantillaEmail</code> class id. */
    public static final String CLASS_ID = "Clas_1431708631040445_Alias";
    /** <code>PlantillaEmail</code> class name. */
    public static final String CLASS_NAME = "PlantillaEmail";
    /** <code>PlantillaEmail</code> class alias. */
    public static final String CLASS_ALIAS = "Plantilla email";
    /** <code>PlantillaEmail</code> class table name. */
    public static final String TBL_NAME = "PlantillaEmail";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "plantillaEmailIdPlantilla,plantillaEmailCodigo,plantillaEmailDescripcion,plantillaEmailAsunto,plantillaEmailEmailConf";

    public static final String DSICPLANTILLAEMAIL = "IC_PlantillaEmail";
    public static final String DSDSPLANTILLASDOMINIO = "DS_PlantillasDominio";
    public static final String DSDSPLANTILLAEMAIL = "DS_PlantillaEmail";
    

    // Attribute (plantillaEmailIdPlantilla)
    /** <code>plantillaEmailIdPlantilla</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAEMAILIDPLANTILLA = "Clas_1431708631040445Atr_6_Alias";
    /** <code>plantillaEmailIdPlantilla</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAEMAILIDPLANTILLA = "plantillaEmailIdPlantilla";
    /** <code>plantillaEmailIdPlantilla</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAEMAILIDPLANTILLA = "Id.";

    /** <code>plantillaEmailIdPlantilla</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAEMAILIDPLANTILLA = "";
    /** Agents allowed to view the attribute plantillaEmailIdPlantilla **/
    public static final String PLANTILLAEMAILIDPLANTILLA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (plantillaEmailCodigo)
    /** <code>plantillaEmailCodigo</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAEMAILCODIGO = "Clas_1431708631040445Atr_1_Alias";
    /** <code>plantillaEmailCodigo</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAEMAILCODIGO = "plantillaEmailCodigo";
    /** <code>plantillaEmailCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAEMAILCODIGO = "Código";

    /** <code>plantillaEmailCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAEMAILCODIGO = "";
    /** Agents allowed to view the attribute plantillaEmailCodigo **/
    public static final String PLANTILLAEMAILCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (plantillaEmailDescripcion)
    /** <code>plantillaEmailDescripcion</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAEMAILDESCRIPCION = "Clas_1431708631040445Atr_2_Alias";
    /** <code>plantillaEmailDescripcion</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAEMAILDESCRIPCION = "plantillaEmailDescripcion";
    /** <code>plantillaEmailDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAEMAILDESCRIPCION = "Descripción";

    /** <code>plantillaEmailDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAEMAILDESCRIPCION = "";
    /** Agents allowed to view the attribute plantillaEmailDescripcion **/
    public static final String PLANTILLAEMAILDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (plantillaEmailAsunto)
    /** <code>plantillaEmailAsunto</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAEMAILASUNTO = "Clas_1431708631040445Atr_3_Alias";
    /** <code>plantillaEmailAsunto</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAEMAILASUNTO = "plantillaEmailAsunto";
    /** <code>plantillaEmailAsunto</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAEMAILASUNTO = "Asunto";

    /** <code>plantillaEmailAsunto</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAEMAILASUNTO = "";
    /** Agents allowed to view the attribute plantillaEmailAsunto **/
    public static final String PLANTILLAEMAILASUNTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (plantillaEmailTextoMensaje)
    /** <code>plantillaEmailTextoMensaje</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAEMAILTEXTOMENSAJE = "Clas_1431708631040445Atr_4_Alias";
    /** <code>plantillaEmailTextoMensaje</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAEMAILTEXTOMENSAJE = "plantillaEmailTextoMensaje";
    /** <code>plantillaEmailTextoMensaje</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAEMAILTEXTOMENSAJE = "Texto mensaje";

    /** <code>plantillaEmailTextoMensaje</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAEMAILTEXTOMENSAJE = "";
    /** Agents allowed to view the attribute plantillaEmailTextoMensaje **/
    public static final String PLANTILLAEMAILTEXTOMENSAJE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (plantillaEmailEmailConf)
    /** <code>plantillaEmailEmailConf</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAEMAILEMAILCONF = "Clas_1431708631040445Atr_5_Alias";
    /** <code>plantillaEmailEmailConf</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAEMAILEMAILCONF = "plantillaEmailEmailConf";
    /** <code>plantillaEmailEmailConf</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAEMAILEMAILCONF = "Email confirmación";

    /** <code>plantillaEmailEmailConf</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAEMAILEMAILCONF = "";
    /** Agents allowed to view the attribute plantillaEmailEmailConf **/
    public static final String PLANTILLAEMAILEMAILCONF_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";


    // Field (IdPlantilla)
    /** <code>IdPlantilla</code> field name. */
    public static final String FLD_PLANTILLAEMAILIDPLANTILLA = "IdPlantilla";    
    /** <code>plantillaEmailIdPlantilla</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAEMAILIDPLANTILLA = "plantillaEmailIdPlantilla";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PLANTILLAEMAILCODIGO = "Codigo";    
    /** <code>plantillaEmailCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAEMAILCODIGO = "plantillaEmailCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_PLANTILLAEMAILDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_PLANTILLAEMAILDESCRIPCIONLENGTH = 255;
    /** <code>plantillaEmailDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAEMAILDESCRIPCION = "plantillaEmailDescripcion";
    // Field (Asunto)
    /** <code>Asunto</code> field name. */
    public static final String FLD_PLANTILLAEMAILASUNTO = "Asunto";    
    /** <code>Asunto</code> field length. */
    public static final int FLD_PLANTILLAEMAILASUNTOLENGTH = 255;
    /** <code>plantillaEmailAsunto</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAEMAILASUNTO = "plantillaEmailAsunto";
    // Field (TextoMensaje)
    /** <code>TextoMensaje</code> field name. */
    public static final String FLD_PLANTILLAEMAILTEXTOMENSAJE = "TextoMensaje";    
    /** <code>plantillaEmailTextoMensaje</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAEMAILTEXTOMENSAJE = "plantillaEmailTextoMensaje";
    // Field (EmailConf)
    /** <code>EmailConf</code> field name. */
    public static final String FLD_PLANTILLAEMAILEMAILCONF = "EmailConf";    
    /** <code>EmailConf</code> field length. */
    public static final int FLD_PLANTILLAEMAILEMAILCONFLENGTH = 100;
    /** <code>plantillaEmailEmailConf</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAEMAILEMAILCONF = "plantillaEmailEmailConf";


    // Compound role (Dominios)
    /** <code>Dominios</code> role id. */
    public static final String ROLE_ID_DOMINIOS = "Agr_1554391891968462_Alias";
    /** <code>Dominios</code> role name. */
    public static final String ROLE_NAME_DOMINIOS = "dominios";
    /** <code>Plantillas</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOS = "Dominios";


    /** <code>Dominios</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOS = DominioConstants.ROLE_NAME_PLANTILLAS;
    /** <code>Dominios</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOS = "";
    /** <code>Dominios</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOS = DominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Dominios **/
    public static final String DOMINIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431708631040445Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear plantilla de email";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>plantillaEmailcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANTILLAEMAILCREARPATRCODIGO = "p_atrCodigo";
    /** <code>plantillaEmailcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANTILLAEMAILCREARPATRCODIGO = "Clas_1431708631040445Ser_1Arg_1_Alias";
    /** <code>plantillaEmailcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANTILLAEMAILCREARPATRCODIGO = "Código";
    /** <code>plantillaEmailcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANTILLAEMAILCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>plantillaEmailcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANTILLAEMAILCREARPATRDESCRIPCION = "Clas_1431708631040445Ser_1Arg_2_Alias";
    /** <code>plantillaEmailcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANTILLAEMAILCREARPATRDESCRIPCION = "Descripción";
    /** <code>plantillaEmailcrearpatrAsunto</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANTILLAEMAILCREARPATRASUNTO = "p_atrAsunto";
    /** <code>plantillaEmailcrearpatrAsunto</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANTILLAEMAILCREARPATRASUNTO = "Clas_1431708631040445Ser_1Arg_3_Alias";
    /** <code>plantillaEmailcrearpatrAsunto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANTILLAEMAILCREARPATRASUNTO = "Asunto";
    /** <code>plantillaEmailcrearpatrTextoMensaje</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANTILLAEMAILCREARPATRTEXTOMENSAJE = "p_atrTextoMensaje";
    /** <code>plantillaEmailcrearpatrTextoMensaje</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANTILLAEMAILCREARPATRTEXTOMENSAJE = "Clas_1431708631040445Ser_1Arg_4_Alias";
    /** <code>plantillaEmailcrearpatrTextoMensaje</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANTILLAEMAILCREARPATRTEXTOMENSAJE = "Texto mensaje";
    /** <code>plantillaEmailcrearpatrEmailConf</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANTILLAEMAILCREARPATREMAILCONF = "p_atrEmailConf";
    /** <code>plantillaEmailcrearpatrEmailConf</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANTILLAEMAILCREARPATREMAILCONF = "Clas_1431708631040445Ser_1Arg_5_Alias";
    /** <code>plantillaEmailcrearpatrEmailConf</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANTILLAEMAILCREARPATREMAILCONF = "Email confirmación";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431708631040445Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar plantilla de email";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431708631040445Pre_1_MsgError";
    // Inbound arguments
    /** <code>plantillaEmaileliminarpthisPlantillasEmail</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PLANTILLAEMAILELIMINARPTHISPLANTILLASEMAIL = "p_thisPlantillasEmail";
    /** <code>plantillaEmaileliminarpthisPlantillasEmail</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PLANTILLAEMAILELIMINARPTHISPLANTILLASEMAIL = "Clas_1431708631040445Ser_2Arg_1_Alias";
    /** <code>plantillaEmaileliminarpthisPlantillasEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PLANTILLAEMAILELIMINARPTHISPLANTILLASEMAIL = "Plantilla email";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431708631040445Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar plantilla de email";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>plantillaEmailmodificarpthisPlantillasEmail</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANTILLAEMAILMODIFICARPTHISPLANTILLASEMAIL = "p_thisPlantillasEmail";
    /** <code>plantillaEmailmodificarpthisPlantillasEmail</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANTILLAEMAILMODIFICARPTHISPLANTILLASEMAIL = "Clas_1431708631040445Ser_3Arg_1_Alias";
    /** <code>plantillaEmailmodificarpthisPlantillasEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANTILLAEMAILMODIFICARPTHISPLANTILLASEMAIL = "Plantilla email";
    /** <code>plantillaEmailmodificarpAsunto</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANTILLAEMAILMODIFICARPASUNTO = "p_Asunto";
    /** <code>plantillaEmailmodificarpAsunto</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANTILLAEMAILMODIFICARPASUNTO = "Clas_1431708631040445Ser_3Arg_3_Alias";
    /** <code>plantillaEmailmodificarpAsunto</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANTILLAEMAILMODIFICARPASUNTO = "Asunto";
    /** <code>plantillaEmailmodificarpTextoMensaje</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANTILLAEMAILMODIFICARPTEXTOMENSAJE = "p_TextoMensaje";
    /** <code>plantillaEmailmodificarpTextoMensaje</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANTILLAEMAILMODIFICARPTEXTOMENSAJE = "Clas_1431708631040445Ser_3Arg_4_Alias";
    /** <code>plantillaEmailmodificarpTextoMensaje</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANTILLAEMAILMODIFICARPTEXTOMENSAJE = "Texto mensaje";
    /** <code>plantillaEmailmodificarpEmailConf</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANTILLAEMAILMODIFICARPEMAILCONF = "p_EmailConf";
    /** <code>plantillaEmailmodificarpEmailConf</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANTILLAEMAILMODIFICARPEMAILCONF = "Clas_1431708631040445Ser_3Arg_5_Alias";
    /** <code>plantillaEmailmodificarpEmailConf</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANTILLAEMAILMODIFICARPEMAILCONF = "Email confirmación";
    // Service (InsPlantilla)
    /** <code>InsPlantilla</code> service id. */
    public static final String SERV_ID_INSPLANTILLA = "Clas_1431708631040445Ser_4_Alias";
    /** <code>InsPlantilla</code> service name. */
    public static final String SERV_NAME_INSPLANTILLA = "InsPlantilla";
    /** <code>InsPlantilla</code> service alias. */
    public static final String SERV_ALIAS_INSPLANTILLA = "InsPlantilla";
    /** Agents allowed to execute the service InsPlantilla **/
    public static final String INSPLANTILLA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>plantillaEmailInsPlantillapthisPlantillaEmail</code> inbound argument name. */
    public static final String ARG_NAME_INSPLANTILLA_PLANTILLAEMAILINSPLANTILLAPTHISPLANTILLAEMAIL = "p_thisPlantillaEmail";
    /** <code>plantillaEmailInsPlantillapthisPlantillaEmail</code> inbound argument id. */
    public static final String ARG_ID_INSPLANTILLA_PLANTILLAEMAILINSPLANTILLAPTHISPLANTILLAEMAIL = "Clas_1431708631040445Ser_4Arg_1_Alias";
    /** <code>plantillaEmailInsPlantillapthisPlantillaEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPLANTILLA_PLANTILLAEMAILINSPLANTILLAPTHISPLANTILLAEMAIL = "Plantillas";
    /** <code>plantillaEmailInsPlantillapevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSPLANTILLA_PLANTILLAEMAILINSPLANTILLAPEVCDOMINIO = "p_evcDominio";
    /** <code>plantillaEmailInsPlantillapevcDominio</code> inbound argument id. */
    public static final String ARG_ID_INSPLANTILLA_PLANTILLAEMAILINSPLANTILLAPEVCDOMINIO = "Clas_1431708631040445Ser_4Arg_2_Alias";
    /** <code>plantillaEmailInsPlantillapevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPLANTILLA_PLANTILLAEMAILINSPLANTILLAPEVCDOMINIO = "Dominios";
    // Service (DelPlantilla)
    /** <code>DelPlantilla</code> service id. */
    public static final String SERV_ID_DELPLANTILLA = "Clas_1431708631040445Ser_5_Alias";
    /** <code>DelPlantilla</code> service name. */
    public static final String SERV_NAME_DELPLANTILLA = "DelPlantilla";
    /** <code>DelPlantilla</code> service alias. */
    public static final String SERV_ALIAS_DELPLANTILLA = "DelPlantilla";
    /** Agents allowed to execute the service DelPlantilla **/
    public static final String DELPLANTILLA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>plantillaEmailDelPlantillapthisPlantillaEmail</code> inbound argument name. */
    public static final String ARG_NAME_DELPLANTILLA_PLANTILLAEMAILDELPLANTILLAPTHISPLANTILLAEMAIL = "p_thisPlantillaEmail";
    /** <code>plantillaEmailDelPlantillapthisPlantillaEmail</code> inbound argument id. */
    public static final String ARG_ID_DELPLANTILLA_PLANTILLAEMAILDELPLANTILLAPTHISPLANTILLAEMAIL = "Clas_1431708631040445Ser_5Arg_1_Alias";
    /** <code>plantillaEmailDelPlantillapthisPlantillaEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPLANTILLA_PLANTILLAEMAILDELPLANTILLAPTHISPLANTILLAEMAIL = "Plantillas";
    /** <code>plantillaEmailDelPlantillapevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELPLANTILLA_PLANTILLAEMAILDELPLANTILLAPEVCDOMINIO = "p_evcDominio";
    /** <code>plantillaEmailDelPlantillapevcDominio</code> inbound argument id. */
    public static final String ARG_ID_DELPLANTILLA_PLANTILLAEMAILDELPLANTILLAPEVCDOMINIO = "Clas_1431708631040445Ser_5Arg_2_Alias";
    /** <code>plantillaEmailDelPlantillapevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPLANTILLA_PLANTILLAEMAILDELPLANTILLAPEVCDOMINIO = "Dominios";
    // Service (modificarTextoMensaje)
    /** <code>modificarTextoMensaje</code> service id. */
    public static final String SERV_ID_MODIFICARTEXTOMENSAJE = "Clas_1431708631040445Ser_6_Alias";
    /** <code>modificarTextoMensaje</code> service name. */
    public static final String SERV_NAME_MODIFICARTEXTOMENSAJE = "modificarTextoMensaje";
    /** <code>modificarTextoMensaje</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARTEXTOMENSAJE = "Modificar plantilla de email";
    /** Agents allowed to execute the service modificarTextoMensaje **/
    public static final String MODIFICARTEXTOMENSAJE_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>plantillaEmailmodificarTextoMensajepthisPlantillaEmail</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARTEXTOMENSAJE_PLANTILLAEMAILMODIFICARTEXTOMENSAJEPTHISPLANTILLAEMAIL = "p_thisPlantillaEmail";
    /** <code>plantillaEmailmodificarTextoMensajepthisPlantillaEmail</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARTEXTOMENSAJE_PLANTILLAEMAILMODIFICARTEXTOMENSAJEPTHISPLANTILLAEMAIL = "Clas_1431708631040445Ser_6Arg_1_Alias";
    /** <code>plantillaEmailmodificarTextoMensajepthisPlantillaEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARTEXTOMENSAJE_PLANTILLAEMAILMODIFICARTEXTOMENSAJEPTHISPLANTILLAEMAIL = "Plantilla email";
    /** <code>plantillaEmailmodificarTextoMensajepTextoMensaje</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARTEXTOMENSAJE_PLANTILLAEMAILMODIFICARTEXTOMENSAJEPTEXTOMENSAJE = "p_TextoMensaje";
    /** <code>plantillaEmailmodificarTextoMensajepTextoMensaje</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARTEXTOMENSAJE_PLANTILLAEMAILMODIFICARTEXTOMENSAJEPTEXTOMENSAJE = "Clas_1431708631040445Ser_6Arg_2_Alias";
    /** <code>plantillaEmailmodificarTextoMensajepTextoMensaje</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARTEXTOMENSAJE_PLANTILLAEMAILMODIFICARTEXTOMENSAJEPTEXTOMENSAJE = "Texto mensaje";
    // Service (dummyModificar)
    /** <code>dummyModificar</code> service id. */
    public static final String SERV_ID_DUMMYMODIFICAR = "Clas_1431708631040445Ser_7_Alias";
    /** <code>dummyModificar</code> service name. */
    public static final String SERV_NAME_DUMMYMODIFICAR = "dummyModificar";
    /** <code>dummyModificar</code> service alias. */
    public static final String SERV_ALIAS_DUMMYMODIFICAR = "Modificar";
    /** Agents allowed to execute the service dummyModificar **/
    public static final String DUMMYMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>plantillaEmaildummyModificarpthisPlantillaEmail</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYMODIFICAR_PLANTILLAEMAILDUMMYMODIFICARPTHISPLANTILLAEMAIL = "p_thisPlantillaEmail";
    /** <code>plantillaEmaildummyModificarpthisPlantillaEmail</code> inbound argument id. */
    public static final String ARG_ID_DUMMYMODIFICAR_PLANTILLAEMAILDUMMYMODIFICARPTHISPLANTILLAEMAIL = "Clas_1431708631040445Ser_7Arg_1_Alias";
    /** <code>plantillaEmaildummyModificarpthisPlantillaEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYMODIFICAR_PLANTILLAEMAILDUMMYMODIFICARPTHISPLANTILLAEMAIL = "Plantilla email";
    // Service (getDummy)
    /** <code>getDummy</code> service id. */
    public static final String SERV_ID_GETDUMMY = "Clas_1431708631040445Ser_9_Alias";
    /** <code>getDummy</code> service name. */
    public static final String SERV_NAME_GETDUMMY = "getDummy";
    /** <code>getDummy</code> service alias. */
    public static final String SERV_ALIAS_GETDUMMY = "getDummy";
    /** Agents allowed to execute the service getDummy **/
    public static final String GETDUMMY_SRVAGENTS = "";
    // Inbound arguments
    /** <code>plantillaEmailgetDummypthisPlantillaEmail</code> inbound argument name. */
    public static final String ARG_NAME_GETDUMMY_PLANTILLAEMAILGETDUMMYPTHISPLANTILLAEMAIL = "p_thisPlantillaEmail";
    /** <code>plantillaEmailgetDummypthisPlantillaEmail</code> inbound argument id. */
    public static final String ARG_ID_GETDUMMY_PLANTILLAEMAILGETDUMMYPTHISPLANTILLAEMAIL = "Clas_1431708631040445Ser_9Arg_1_Alias";
    /** <code>plantillaEmailgetDummypthisPlantillaEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_GETDUMMY_PLANTILLAEMAILGETDUMMYPTHISPLANTILLAEMAIL = "Plantilla email";
    // Outbound arguments
    /** <code>plantillaEmailgetDummyoaPlantillaEmail</code> outbound argument name. */
    public static final String ARG_NAME_GETDUMMY_PLANTILLAEMAILGETDUMMYOAPLANTILLAEMAIL = "plantillaEmailgetDummyoaPlantillaEmail";
    /** <code>plantillaEmailgetDummyoaPlantillaEmail</code> outbound argument id. */
    public static final String ARG_ID_GETDUMMY_PLANTILLAEMAILGETDUMMYOAPLANTILLAEMAIL = "Clas_1431708631040445Ser_9Arg_2_Alias";
    /** <code>plantillaEmailgetDummyoaPlantillaEmail</code> outbound argument alias. */
    public static final String ARG_ALIAS_GETDUMMY_PLANTILLAEMAILGETDUMMYOAPLANTILLAEMAIL = "Plantilla email";
    // Service (TNEW)
    /** <code>TNEW</code> service id. */
    public static final String SERV_ID_TNEW = "Clas_1431708631040445Ser_8_Alias";
    /** <code>TNEW</code> service name. */
    public static final String SERV_NAME_TNEW = "TNEW";
    /** <code>TNEW</code> service alias. */
    public static final String SERV_ALIAS_TNEW = "Crear plantilla";
    /** Agents allowed to execute the service TNEW **/
    public static final String TNEW_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>plantillaEmailTNEWptpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PLANTILLAEMAILTNEWPTPATRCODIGO = "pt_p_atrCodigo";
    /** <code>plantillaEmailTNEWptpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PLANTILLAEMAILTNEWPTPATRCODIGO = "Clas_1431708631040445Ser_8Arg_3_Alias";
    /** <code>plantillaEmailTNEWptpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PLANTILLAEMAILTNEWPTPATRCODIGO = "Código";
    /** <code>plantillaEmailTNEWptpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_PLANTILLAEMAILTNEWPTPATRDESCRIPCION = "pt_p_atrDescripcion";
    /** <code>plantillaEmailTNEWptpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TNEW_PLANTILLAEMAILTNEWPTPATRDESCRIPCION = "Clas_1431708631040445Ser_8Arg_4_Alias";
    /** <code>plantillaEmailTNEWptpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PLANTILLAEMAILTNEWPTPATRDESCRIPCION = "Descripción";
    // Outbound arguments
    /** <code>plantillaEmailTNEWpsPlantilla</code> outbound argument name. */
    public static final String ARG_NAME_TNEW_PLANTILLAEMAILTNEWPSPLANTILLA = "plantillaEmailTNEWpsPlantilla";
    /** <code>plantillaEmailTNEWpsPlantilla</code> outbound argument id. */
    public static final String ARG_ID_TNEW_PLANTILLAEMAILTNEWPSPLANTILLA = "Clas_1431708631040445Ser_8Arg_10_Alias";
    /** <code>plantillaEmailTNEWpsPlantilla</code> outbound argument alias. */
    public static final String ARG_ALIAS_TNEW_PLANTILLAEMAILTNEWPSPLANTILLA = "Plantilla email";

    public static final String FILTER_NAME_IFPLANTILLAEMAILCODIGO = "iF_PlantillaEmailCodigo";
    public static final String VAR_NAME_IFPLANTILLAEMAILCODIGO_VCODIGO = "v_Codigo";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PLANTILLAEMAILCODIGO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANTILLAEMAILDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANTILLAEMAILASUNTO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANTILLAEMAILTEXTOMENSAJE.toUpperCase(), Constants.Type.TEXT.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANTILLAEMAILEMAILCONF.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PLANTILLAEMAILIDPLANTILLA.toUpperCase(), PLANTILLAEMAILIDPLANTILLA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANTILLAEMAILCODIGO.toUpperCase(), PLANTILLAEMAILCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANTILLAEMAILDESCRIPCION.toUpperCase(), PLANTILLAEMAILDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANTILLAEMAILASUNTO.toUpperCase(), PLANTILLAEMAILASUNTO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANTILLAEMAILTEXTOMENSAJE.toUpperCase(), PLANTILLAEMAILTEXTOMENSAJE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANTILLAEMAILEMAILCONF.toUpperCase(), PLANTILLAEMAILEMAILCONF_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'PlantillaEmail', it returns the identification keys
     * - If className is a facet of the inheritance net of 'PlantillaEmail', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PLANTILLAEMAILIDPLANTILLA);
        }
        // Facet 'PlantillaEmail' (This facet)
        if (PlantillaEmailConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PLANTILLAEMAILIDPLANTILLA);
        }
        return returnList;
    }
}
