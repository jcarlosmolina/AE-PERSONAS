package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Productos</code> model class.
 */
public final class ProductosConstants {

    private ProductosConstants() {

    }

    // Class
    /** <code>Productos</code> class id. */
    public static final String CLASS_ID = "Clas_1431687397376823_Alias";
    /** <code>Productos</code> class name. */
    public static final String CLASS_NAME = "Productos";
    /** <code>Productos</code> class alias. */
    public static final String CLASS_ALIAS = "Producto";
    /** <code>Productos</code> class table name. */
    public static final String TBL_NAME = "Productos";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "productosProducto,productosDescripcion,productosCodAnexoMat,productosCodAnexoNeo,productosNIT,productosCodigoLegal,productosFechaDocSolicitud";

    public static final String DSICPRODUCTO = "IC_Producto";
    

    // Attribute (productosProducto)
    /** <code>productosProducto</code> attribute id. */
    public static final String ATTR_ID_PRODUCTOSPRODUCTO = "Clas_1431687397376823Atr_1_Alias";
    /** <code>productosProducto</code> attribute name. */
    public static final String ATTR_NAME_PRODUCTOSPRODUCTO = "productosProducto";
    /** <code>productosProducto</code> attribute alias. */
    public static final String ATTR_ALIAS_PRODUCTOSPRODUCTO = "Producto";

    /** <code>productosProducto</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRODUCTOSPRODUCTO = "";
    /** Agents allowed to view the attribute productosProducto **/
    public static final String PRODUCTOSPRODUCTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (productosDescripcion)
    /** <code>productosDescripcion</code> attribute id. */
    public static final String ATTR_ID_PRODUCTOSDESCRIPCION = "Clas_1431687397376823Atr_2_Alias";
    /** <code>productosDescripcion</code> attribute name. */
    public static final String ATTR_NAME_PRODUCTOSDESCRIPCION = "productosDescripcion";
    /** <code>productosDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_PRODUCTOSDESCRIPCION = "Descripción";

    /** <code>productosDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRODUCTOSDESCRIPCION = "";
    /** Agents allowed to view the attribute productosDescripcion **/
    public static final String PRODUCTOSDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (productosCodAnexoMat)
    /** <code>productosCodAnexoMat</code> attribute id. */
    public static final String ATTR_ID_PRODUCTOSCODANEXOMAT = "Clas_1431687397376823Atr_3_Alias";
    /** <code>productosCodAnexoMat</code> attribute name. */
    public static final String ATTR_NAME_PRODUCTOSCODANEXOMAT = "productosCodAnexoMat";
    /** <code>productosCodAnexoMat</code> attribute alias. */
    public static final String ATTR_ALIAS_PRODUCTOSCODANEXOMAT = "Anexo maternidad";

    /** <code>productosCodAnexoMat</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRODUCTOSCODANEXOMAT = "";
    /** Agents allowed to view the attribute productosCodAnexoMat **/
    public static final String PRODUCTOSCODANEXOMAT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (productosCodAnexoNeo)
    /** <code>productosCodAnexoNeo</code> attribute id. */
    public static final String ATTR_ID_PRODUCTOSCODANEXONEO = "Clas_1431687397376823Atr_4_Alias";
    /** <code>productosCodAnexoNeo</code> attribute name. */
    public static final String ATTR_NAME_PRODUCTOSCODANEXONEO = "productosCodAnexoNeo";
    /** <code>productosCodAnexoNeo</code> attribute alias. */
    public static final String ATTR_ALIAS_PRODUCTOSCODANEXONEO = "Anexo neonatal";

    /** <code>productosCodAnexoNeo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRODUCTOSCODANEXONEO = "";
    /** Agents allowed to view the attribute productosCodAnexoNeo **/
    public static final String PRODUCTOSCODANEXONEO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (productosNIT)
    /** <code>productosNIT</code> attribute id. */
    public static final String ATTR_ID_PRODUCTOSNIT = "Clas_1431687397376823Atr_5_Alias";
    /** <code>productosNIT</code> attribute name. */
    public static final String ATTR_NAME_PRODUCTOSNIT = "productosNIT";
    /** <code>productosNIT</code> attribute alias. */
    public static final String ATTR_ALIAS_PRODUCTOSNIT = "NIT";

    /** <code>productosNIT</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRODUCTOSNIT = "";
    /** Agents allowed to view the attribute productosNIT **/
    public static final String PRODUCTOSNIT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (productosCodigoLegal)
    /** <code>productosCodigoLegal</code> attribute id. */
    public static final String ATTR_ID_PRODUCTOSCODIGOLEGAL = "Clas_1431687397376823Atr_6_Alias";
    /** <code>productosCodigoLegal</code> attribute name. */
    public static final String ATTR_NAME_PRODUCTOSCODIGOLEGAL = "productosCodigoLegal";
    /** <code>productosCodigoLegal</code> attribute alias. */
    public static final String ATTR_ALIAS_PRODUCTOSCODIGOLEGAL = "Código Legal";

    /** <code>productosCodigoLegal</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRODUCTOSCODIGOLEGAL = "";
    /** Agents allowed to view the attribute productosCodigoLegal **/
    public static final String PRODUCTOSCODIGOLEGAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (productosFechaDocSolicitud)
    /** <code>productosFechaDocSolicitud</code> attribute id. */
    public static final String ATTR_ID_PRODUCTOSFECHADOCSOLICITUD = "Clas_1431687397376823Atr_7_Alias";
    /** <code>productosFechaDocSolicitud</code> attribute name. */
    public static final String ATTR_NAME_PRODUCTOSFECHADOCSOLICITUD = "productosFechaDocSolicitud";
    /** <code>productosFechaDocSolicitud</code> attribute alias. */
    public static final String ATTR_ALIAS_PRODUCTOSFECHADOCSOLICITUD = "Fecha Doc. Solicitud";

    /** <code>productosFechaDocSolicitud</code> attribute facet sequence. */
    public static final String PATH_FACETS_PRODUCTOSFECHADOCSOLICITUD = "";
    /** Agents allowed to view the attribute productosFechaDocSolicitud **/
    public static final String PRODUCTOSFECHADOCSOLICITUD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Producto)
    /** <code>Producto</code> field name. */
    public static final String FLD_PRODUCTOSPRODUCTO = "Producto";    
    /** <code>productosProducto</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOSPRODUCTO = "productosProducto";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_PRODUCTOSDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_PRODUCTOSDESCRIPCIONLENGTH = 100;
    /** <code>productosDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOSDESCRIPCION = "productosDescripcion";
    // Field (CodAnexoMat)
    /** <code>CodAnexoMat</code> field name. */
    public static final String FLD_PRODUCTOSCODANEXOMAT = "CodAnexoMat";    
    /** <code>productosCodAnexoMat</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOSCODANEXOMAT = "productosCodAnexoMat";
    // Field (CodAnexoNeo)
    /** <code>CodAnexoNeo</code> field name. */
    public static final String FLD_PRODUCTOSCODANEXONEO = "CodAnexoNeo";    
    /** <code>productosCodAnexoNeo</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOSCODANEXONEO = "productosCodAnexoNeo";
    // Field (NIT)
    /** <code>NIT</code> field name. */
    public static final String FLD_PRODUCTOSNIT = "NIT";    
    /** <code>NIT</code> field length. */
    public static final int FLD_PRODUCTOSNITLENGTH = 60;
    /** <code>productosNIT</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOSNIT = "productosNIT";
    // Field (CodigoLegal)
    /** <code>CodigoLegal</code> field name. */
    public static final String FLD_PRODUCTOSCODIGOLEGAL = "CodigoLegal";    
    /** <code>CodigoLegal</code> field length. */
    public static final int FLD_PRODUCTOSCODIGOLEGALLENGTH = 10;
    /** <code>productosCodigoLegal</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOSCODIGOLEGAL = "productosCodigoLegal";
    // Field (FechaDocSolicitud)
    /** <code>FechaDocSolicitud</code> field name. */
    public static final String FLD_PRODUCTOSFECHADOCSOLICITUD = "FechaDocSolicitud";    
    /** <code>productosFechaDocSolicitud</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOSFECHADOCSOLICITUD = "productosFechaDocSolicitud";


    // Compound role (Planes)
    /** <code>Planes</code> role id. */
    public static final String ROLE_ID_PLANES = "Agr_1431696441344041_Alias";
    /** <code>Planes</code> role name. */
    public static final String ROLE_NAME_PLANES = "planes";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_PLANES = "Planes";


    /** <code>Planes</code> inverse role name. */
    public static final String ROLE_INVNAME_PLANES = PlanesConstants.ROLE_NAME_PRODUCTOT;
    /** <code>Planes</code> role facet sequence. */
    public static final String PATH_FACETS_PLANES = "";
    /** <code>Planes</code> role target class. */
    public static final String ROLE_TARGET_PLANES = PlanesConstants.CLASS_NAME;
    /** Agents allowed to navigate through Planes **/
    public static final String PLANES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Dominios)
    /** <code>Dominios</code> role id. */
    public static final String ROLE_ID_DOMINIOS = "Agr_1431701553152972_Alias";
    /** <code>Dominios</code> role name. */
    public static final String ROLE_NAME_DOMINIOS = "dominios";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOS = "Dominios";


    /** <code>Dominios</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOS = DominioConstants.ROLE_NAME_PRODUCTOT;
    /** <code>Dominios</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOS = "";
    /** <code>Dominios</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOS = DominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Dominios **/
    public static final String DOMINIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Tarifas)
    /** <code>Tarifas</code> role id. */
    public static final String ROLE_ID_TARIFAS = "Agr_1431715053568944_Alias";
    /** <code>Tarifas</code> role name. */
    public static final String ROLE_NAME_TARIFAS = "tarifas";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_TARIFAS = "Tarifas";


    /** <code>Tarifas</code> inverse role name. */
    public static final String ROLE_INVNAME_TARIFAS = TarifaConstants.ROLE_NAME_PRODUCTOT;
    /** <code>Tarifas</code> role facet sequence. */
    public static final String PATH_FACETS_TARIFAS = "";
    /** <code>Tarifas</code> role target class. */
    public static final String ROLE_TARGET_TARIFAS = TarifaConstants.CLASS_NAME;
    /** Agents allowed to navigate through Tarifas **/
    public static final String TARIFAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (GruposAsociados)
    /** <code>GruposAsociados</code> role id. */
    public static final String ROLE_ID_GRUPOSASOCIADOS = "Agr_1431875354624678_Alias";
    /** <code>GruposAsociados</code> role name. */
    public static final String ROLE_NAME_GRUPOSASOCIADOS = "gruposAsociados";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOSASOCIADOS = "Grupos asociados";


    /** <code>GruposAsociados</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOSASOCIADOS = GrupoAsociadoConstants.ROLE_NAME_PRODUCTOT;
    /** <code>GruposAsociados</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOSASOCIADOS = "";
    /** <code>GruposAsociados</code> role target class. */
    public static final String ROLE_TARGET_GRUPOSASOCIADOS = GrupoAsociadoConstants.CLASS_NAME;
    /** Agents allowed to navigate through GruposAsociados **/
    public static final String GRUPOSASOCIADOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (TiposIVA)
    /** <code>TiposIVA</code> role id. */
    public static final String ROLE_ID_TIPOSIVA = "Agr_1431882432512973_Alias";
    /** <code>TiposIVA</code> role name. */
    public static final String ROLE_NAME_TIPOSIVA = "tiposIVA";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_TIPOSIVA = "Tipos I.V.A";


    /** <code>TiposIVA</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOSIVA = TipoIVAConstants.ROLE_NAME_PRODUCTOT;
    /** <code>TiposIVA</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOSIVA = "";
    /** <code>TiposIVA</code> role target class. */
    public static final String ROLE_TARGET_TIPOSIVA = TipoIVAConstants.CLASS_NAME;
    /** Agents allowed to navigate through TiposIVA **/
    public static final String TIPOSIVA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (AESOLICITUDES)
    /** <code>AESOLICITUDES</code> role id. */
    public static final String ROLE_ID_AESOLICITUDES = "Agr_1431956226048423_Alias";
    /** <code>AESOLICITUDES</code> role name. */
    public static final String ROLE_NAME_AESOLICITUDES = "aESOLICITUDES";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_AESOLICITUDES = "Solicitudes";


    /** <code>AESOLICITUDES</code> inverse role name. */
    public static final String ROLE_INVNAME_AESOLICITUDES = AesolicitudesConstants.ROLE_NAME_PRODUCTOT;
    /** <code>AESOLICITUDES</code> role facet sequence. */
    public static final String PATH_FACETS_AESOLICITUDES = "";
    /** <code>AESOLICITUDES</code> role target class. */
    public static final String ROLE_TARGET_AESOLICITUDES = AesolicitudesConstants.CLASS_NAME;
    /** Agents allowed to navigate through AESOLICITUDES **/
    public static final String AESOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ProteccionDatosC)
    /** <code>ProteccionDatosC</code> role id. */
    public static final String ROLE_ID_PROTECCIONDATOSC = "Agr_1473095532544315_Alias";
    /** <code>ProteccionDatosC</code> role name. */
    public static final String ROLE_NAME_PROTECCIONDATOSC = "proteccionDatosC";
    /** <code>ProductoC</code> role alias. */
    public static final String ROLE_ALIAS_PROTECCIONDATOSC = "ProteccionDatosC";


    /** <code>ProteccionDatosC</code> inverse role name. */
    public static final String ROLE_INVNAME_PROTECCIONDATOSC = ProteccionDatosCConstants.ROLE_NAME_PRODUCTOC;
    /** <code>ProteccionDatosC</code> role facet sequence. */
    public static final String PATH_FACETS_PROTECCIONDATOSC = "";
    /** <code>ProteccionDatosC</code> role target class. */
    public static final String ROLE_TARGET_PROTECCIONDATOSC = ProteccionDatosCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ProteccionDatosC **/
    public static final String PROTECCIONDATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ProteccionesDatos)
    /** <code>ProteccionesDatos</code> role id. */
    public static final String ROLE_ID_PROTECCIONESDATOS = "Agr_1432207228928500_Alias";
    /** <code>ProteccionesDatos</code> role name. */
    public static final String ROLE_NAME_PROTECCIONESDATOS = "proteccionesDatos";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_PROTECCIONESDATOS = "Protecciones Datos";


    /** <code>ProteccionesDatos</code> inverse role name. */
    public static final String ROLE_INVNAME_PROTECCIONESDATOS = ProteccionDatosConstants.ROLE_NAME_PRODUCTOT;
    /** <code>ProteccionesDatos</code> role facet sequence. */
    public static final String PATH_FACETS_PROTECCIONESDATOS = "";
    /** <code>ProteccionesDatos</code> role target class. */
    public static final String ROLE_TARGET_PROTECCIONESDATOS = ProteccionDatosConstants.CLASS_NAME;
    /** Agents allowed to navigate through ProteccionesDatos **/
    public static final String PROTECCIONESDATOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1473095401472256_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>ProductoC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_PRODUCTOC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (MarcaMedicaC)
    /** <code>MarcaMedicaC</code> role id. */
    public static final String ROLE_ID_MARCAMEDICAC = "Agr_1473095401472777_Alias";
    /** <code>MarcaMedicaC</code> role name. */
    public static final String ROLE_NAME_MARCAMEDICAC = "marcaMedicaC";
    /** <code>ProductoC</code> role alias. */
    public static final String ROLE_ALIAS_MARCAMEDICAC = "MarcaMedicaC";


    /** <code>MarcaMedicaC</code> inverse role name. */
    public static final String ROLE_INVNAME_MARCAMEDICAC = MarcaMedicaCConstants.ROLE_NAME_PRODUCTOC;
    /** <code>MarcaMedicaC</code> role facet sequence. */
    public static final String PATH_FACETS_MARCAMEDICAC = "";
    /** <code>MarcaMedicaC</code> role target class. */
    public static final String ROLE_TARGET_MARCAMEDICAC = MarcaMedicaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through MarcaMedicaC **/
    public static final String MARCAMEDICAC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (AgentexProducto)
    /** <code>AgentexProducto</code> role id. */
    public static final String ROLE_ID_AGENTEXPRODUCTO = "Agr_1460561248256568_Alias";
    /** <code>AgentexProducto</code> role name. */
    public static final String ROLE_NAME_AGENTEXPRODUCTO = "agentexProducto";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_AGENTEXPRODUCTO = "Asesores";


    /** <code>AgentexProducto</code> inverse role name. */
    public static final String ROLE_INVNAME_AGENTEXPRODUCTO = AgentexProductoConstants.ROLE_NAME_PRODUCTOT;
    /** <code>AgentexProducto</code> role facet sequence. */
    public static final String PATH_FACETS_AGENTEXPRODUCTO = "";
    /** <code>AgentexProducto</code> role target class. */
    public static final String ROLE_TARGET_AGENTEXPRODUCTO = AgentexProductoConstants.CLASS_NAME;
    /** Agents allowed to navigate through AgentexProducto **/
    public static final String AGENTEXPRODUCTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431687397376823Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear producto";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>productoscrearpatrProducto</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRODUCTOSCREARPATRPRODUCTO = "p_atrProducto";
    /** <code>productoscrearpatrProducto</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRODUCTOSCREARPATRPRODUCTO = "Clas_1431687397376823Ser_1Arg_1_Alias";
    /** <code>productoscrearpatrProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRODUCTOSCREARPATRPRODUCTO = "Producto";
    /** <code>productoscrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRODUCTOSCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>productoscrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRODUCTOSCREARPATRDESCRIPCION = "Clas_1431687397376823Ser_1Arg_2_Alias";
    /** <code>productoscrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRODUCTOSCREARPATRDESCRIPCION = "Descripción";
    /** <code>productoscrearpatrCodAnexoMat</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRODUCTOSCREARPATRCODANEXOMAT = "p_atrCodAnexoMat";
    /** <code>productoscrearpatrCodAnexoMat</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRODUCTOSCREARPATRCODANEXOMAT = "Clas_1431687397376823Ser_1Arg_3_Alias";
    /** <code>productoscrearpatrCodAnexoMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRODUCTOSCREARPATRCODANEXOMAT = "Anexo maternidad";
    /** <code>productoscrearpatrCodAnexoNeo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRODUCTOSCREARPATRCODANEXONEO = "p_atrCodAnexoNeo";
    /** <code>productoscrearpatrCodAnexoNeo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRODUCTOSCREARPATRCODANEXONEO = "Clas_1431687397376823Ser_1Arg_4_Alias";
    /** <code>productoscrearpatrCodAnexoNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRODUCTOSCREARPATRCODANEXONEO = "Anexo neonatal";
    /** <code>productoscrearpatrNIT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRODUCTOSCREARPATRNIT = "p_atrNIT";
    /** <code>productoscrearpatrNIT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRODUCTOSCREARPATRNIT = "Clas_1431687397376823Ser_1Arg_6_Alias";
    /** <code>productoscrearpatrNIT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRODUCTOSCREARPATRNIT = "NIT";
    /** <code>productoscrearpatrCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PRODUCTOSCREARPATRCODIGOLEGAL = "p_atrCodigoLegal";
    /** <code>productoscrearpatrCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PRODUCTOSCREARPATRCODIGOLEGAL = "Clas_1431687397376823Ser_1Arg_7_Alias";
    /** <code>productoscrearpatrCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PRODUCTOSCREARPATRCODIGOLEGAL = "Código Legal";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431687397376823Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar producto";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431687397376823Pre_1_MsgError";
    /** <code>eliminar</code> precondition 1 id. */
    public static final String PRE_ID_ELIMINAR_1 = "Clas_1431687397376823Pre_2_MsgError";
    /** <code>eliminar</code> precondition 2 id. */
    public static final String PRE_ID_ELIMINAR_2 = "Clas_1431687397376823Pre_5_MsgError";
    /** <code>eliminar</code> precondition 3 id. */
    public static final String PRE_ID_ELIMINAR_3 = "Clas_1431687397376823Pre_6_MsgError";
    /** <code>eliminar</code> precondition 4 id. */
    public static final String PRE_ID_ELIMINAR_4 = "Clas_1431687397376823Pre_7_MsgError";
    /** <code>eliminar</code> precondition 5 id. */
    public static final String PRE_ID_ELIMINAR_5 = "Clas_1431687397376823Pre_8_MsgError";
    // Inbound arguments
    /** <code>productoseliminarpthisProducto</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PRODUCTOSELIMINARPTHISPRODUCTO = "p_thisProducto";
    /** <code>productoseliminarpthisProducto</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PRODUCTOSELIMINARPTHISPRODUCTO = "Clas_1431687397376823Ser_2Arg_1_Alias";
    /** <code>productoseliminarpthisProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PRODUCTOSELIMINARPTHISPRODUCTO = "Producto";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431687397376823Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar producto";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>productosmodificarpthisProducto</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PRODUCTOSMODIFICARPTHISPRODUCTO = "p_thisProducto";
    /** <code>productosmodificarpthisProducto</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PRODUCTOSMODIFICARPTHISPRODUCTO = "Clas_1431687397376823Ser_3Arg_1_Alias";
    /** <code>productosmodificarpthisProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PRODUCTOSMODIFICARPTHISPRODUCTO = "Producto";
    /** <code>productosmodificarpCodAnexoMat</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PRODUCTOSMODIFICARPCODANEXOMAT = "p_CodAnexoMat";
    /** <code>productosmodificarpCodAnexoMat</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PRODUCTOSMODIFICARPCODANEXOMAT = "Clas_1431687397376823Ser_3Arg_2_Alias";
    /** <code>productosmodificarpCodAnexoMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PRODUCTOSMODIFICARPCODANEXOMAT = "Anexo maternidad";
    /** <code>productosmodificarpCodAnexoNeo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PRODUCTOSMODIFICARPCODANEXONEO = "p_CodAnexoNeo";
    /** <code>productosmodificarpCodAnexoNeo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PRODUCTOSMODIFICARPCODANEXONEO = "Clas_1431687397376823Ser_3Arg_3_Alias";
    /** <code>productosmodificarpCodAnexoNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PRODUCTOSMODIFICARPCODANEXONEO = "Anexo neonatal";
    /** <code>productosmodificarpNIT</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PRODUCTOSMODIFICARPNIT = "p_NIT";
    /** <code>productosmodificarpNIT</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PRODUCTOSMODIFICARPNIT = "Clas_1431687397376823Ser_3Arg_4_Alias";
    /** <code>productosmodificarpNIT</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PRODUCTOSMODIFICARPNIT = "NIT";
    /** <code>productosmodificarpFechaDocSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PRODUCTOSMODIFICARPFECHADOCSOLICITUD = "p_FechaDocSolicitud";
    /** <code>productosmodificarpFechaDocSolicitud</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PRODUCTOSMODIFICARPFECHADOCSOLICITUD = "Clas_1431687397376823Ser_3Arg_5_Alias";
    /** <code>productosmodificarpFechaDocSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PRODUCTOSMODIFICARPFECHADOCSOLICITUD = "Fecha Doc. Solicitud";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431687397376823Ser_4_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>productossincronizarpthisProducto</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PRODUCTOSSINCRONIZARPTHISPRODUCTO = "p_thisProducto";
    /** <code>productossincronizarpthisProducto</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PRODUCTOSSINCRONIZARPTHISPRODUCTO = "Clas_1431687397376823Ser_4Arg_1_Alias";
    /** <code>productossincronizarpthisProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PRODUCTOSSINCRONIZARPTHISPRODUCTO = "Producto";
    /** <code>productossincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PRODUCTOSSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>productossincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PRODUCTOSSINCRONIZARPDESCRIPCION = "Clas_1431687397376823Ser_4Arg_4_Alias";
    /** <code>productossincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PRODUCTOSSINCRONIZARPDESCRIPCION = "Descripción";
    /** <code>productossincronizarpCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PRODUCTOSSINCRONIZARPCODIGOLEGAL = "p_CodigoLegal";
    /** <code>productossincronizarpCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PRODUCTOSSINCRONIZARPCODIGOLEGAL = "Clas_1431687397376823Ser_4Arg_7_Alias";
    /** <code>productossincronizarpCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PRODUCTOSSINCRONIZARPCODIGOLEGAL = "Código Legal";
    // Service (CambPlanDeProducto)
    /** <code>CambPlanDeProducto</code> service id. */
    public static final String SERV_ID_CAMBPLANDEPRODUCTO = "Clas_1431687397376823Ser_5_Alias";
    /** <code>CambPlanDeProducto</code> service name. */
    public static final String SERV_NAME_CAMBPLANDEPRODUCTO = "CambPlanDeProducto";
    /** <code>CambPlanDeProducto</code> service alias. */
    public static final String SERV_ALIAS_CAMBPLANDEPRODUCTO = "CambPlanDeProducto";
    /** Agents allowed to execute the service CambPlanDeProducto **/
    public static final String CAMBPLANDEPRODUCTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>productosCambPlanDeProductopthisProducto</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANDEPRODUCTO_PRODUCTOSCAMBPLANDEPRODUCTOPTHISPRODUCTO = "p_thisProducto";
    /** <code>productosCambPlanDeProductopthisProducto</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANDEPRODUCTO_PRODUCTOSCAMBPLANDEPRODUCTOPTHISPRODUCTO = "Clas_1431687397376823Ser_5Arg_1_Alias";
    /** <code>productosCambPlanDeProductopthisProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANDEPRODUCTO_PRODUCTOSCAMBPLANDEPRODUCTOPTHISPRODUCTO = "ProductoT";
    /** <code>productosCambPlanDeProductopevcPlanes</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPLANDEPRODUCTO_PRODUCTOSCAMBPLANDEPRODUCTOPEVCPLANES = "p_evcPlanes";
    /** <code>productosCambPlanDeProductopevcPlanes</code> inbound argument id. */
    public static final String ARG_ID_CAMBPLANDEPRODUCTO_PRODUCTOSCAMBPLANDEPRODUCTOPEVCPLANES = "Clas_1431687397376823Ser_5Arg_2_Alias";
    /** <code>productosCambPlanDeProductopevcPlanes</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPLANDEPRODUCTO_PRODUCTOSCAMBPLANDEPRODUCTOPEVCPLANES = "Planes";
    // Service (CambProductoTarifa)
    /** <code>CambProductoTarifa</code> service id. */
    public static final String SERV_ID_CAMBPRODUCTOTARIFA = "Clas_1431687397376823Ser_6_Alias";
    /** <code>CambProductoTarifa</code> service name. */
    public static final String SERV_NAME_CAMBPRODUCTOTARIFA = "CambProductoTarifa";
    /** <code>CambProductoTarifa</code> service alias. */
    public static final String SERV_ALIAS_CAMBPRODUCTOTARIFA = "CambProductoTarifa";
    /** Agents allowed to execute the service CambProductoTarifa **/
    public static final String CAMBPRODUCTOTARIFA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>productosCambProductoTarifapthisProducto</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTOTARIFA_PRODUCTOSCAMBPRODUCTOTARIFAPTHISPRODUCTO = "p_thisProducto";
    /** <code>productosCambProductoTarifapthisProducto</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTOTARIFA_PRODUCTOSCAMBPRODUCTOTARIFAPTHISPRODUCTO = "Clas_1431687397376823Ser_6Arg_1_Alias";
    /** <code>productosCambProductoTarifapthisProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTOTARIFA_PRODUCTOSCAMBPRODUCTOTARIFAPTHISPRODUCTO = "ProductoT";
    /** <code>productosCambProductoTarifapevcTarifa</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTOTARIFA_PRODUCTOSCAMBPRODUCTOTARIFAPEVCTARIFA = "p_evcTarifa";
    /** <code>productosCambProductoTarifapevcTarifa</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTOTARIFA_PRODUCTOSCAMBPRODUCTOTARIFAPEVCTARIFA = "Clas_1431687397376823Ser_6Arg_2_Alias";
    /** <code>productosCambProductoTarifapevcTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTOTARIFA_PRODUCTOSCAMBPRODUCTOTARIFAPEVCTARIFA = "Tarifas";
    // Service (CambProductoGrupoAsociado)
    /** <code>CambProductoGrupoAsociado</code> service id. */
    public static final String SERV_ID_CAMBPRODUCTOGRUPOASOCIADO = "Clas_1431687397376823Ser_9_Alias";
    /** <code>CambProductoGrupoAsociado</code> service name. */
    public static final String SERV_NAME_CAMBPRODUCTOGRUPOASOCIADO = "CambProductoGrupoAsociado";
    /** <code>CambProductoGrupoAsociado</code> service alias. */
    public static final String SERV_ALIAS_CAMBPRODUCTOGRUPOASOCIADO = "CambProductoGrupoAsociado";
    /** Agents allowed to execute the service CambProductoGrupoAsociado **/
    public static final String CAMBPRODUCTOGRUPOASOCIADO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>productosCambProductoGrupoAsociadopthisProducto</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTOGRUPOASOCIADO_PRODUCTOSCAMBPRODUCTOGRUPOASOCIADOPTHISPRODUCTO = "p_thisProducto";
    /** <code>productosCambProductoGrupoAsociadopthisProducto</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTOGRUPOASOCIADO_PRODUCTOSCAMBPRODUCTOGRUPOASOCIADOPTHISPRODUCTO = "Clas_1431687397376823Ser_9Arg_1_Alias";
    /** <code>productosCambProductoGrupoAsociadopthisProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTOGRUPOASOCIADO_PRODUCTOSCAMBPRODUCTOGRUPOASOCIADOPTHISPRODUCTO = "Producto";
    /** <code>productosCambProductoGrupoAsociadopevcGrupoAsociado</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTOGRUPOASOCIADO_PRODUCTOSCAMBPRODUCTOGRUPOASOCIADOPEVCGRUPOASOCIADO = "p_evcGrupoAsociado";
    /** <code>productosCambProductoGrupoAsociadopevcGrupoAsociado</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTOGRUPOASOCIADO_PRODUCTOSCAMBPRODUCTOGRUPOASOCIADOPEVCGRUPOASOCIADO = "Clas_1431687397376823Ser_9Arg_2_Alias";
    /** <code>productosCambProductoGrupoAsociadopevcGrupoAsociado</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTOGRUPOASOCIADO_PRODUCTOSCAMBPRODUCTOGRUPOASOCIADOPEVCGRUPOASOCIADO = "Grupos asociados";
    // Service (InsProductoProteccionDatos)
    /** <code>InsProductoProteccionDatos</code> service id. */
    public static final String SERV_ID_INSPRODUCTOPROTECCIONDATOS = "Clas_1431687397376823Ser_11_Alias";
    /** <code>InsProductoProteccionDatos</code> service name. */
    public static final String SERV_NAME_INSPRODUCTOPROTECCIONDATOS = "InsProductoProteccionDatos";
    /** <code>InsProductoProteccionDatos</code> service alias. */
    public static final String SERV_ALIAS_INSPRODUCTOPROTECCIONDATOS = "InsProductoProteccionDatos";
    /** Agents allowed to execute the service InsProductoProteccionDatos **/
    public static final String INSPRODUCTOPROTECCIONDATOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>productosInsProductoProteccionDatospthisProducto</code> inbound argument name. */
    public static final String ARG_NAME_INSPRODUCTOPROTECCIONDATOS_PRODUCTOSINSPRODUCTOPROTECCIONDATOSPTHISPRODUCTO = "p_thisProducto";
    /** <code>productosInsProductoProteccionDatospthisProducto</code> inbound argument id. */
    public static final String ARG_ID_INSPRODUCTOPROTECCIONDATOS_PRODUCTOSINSPRODUCTOPROTECCIONDATOSPTHISPRODUCTO = "Clas_1431687397376823Ser_11Arg_1_Alias";
    /** <code>productosInsProductoProteccionDatospthisProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPRODUCTOPROTECCIONDATOS_PRODUCTOSINSPRODUCTOPROTECCIONDATOSPTHISPRODUCTO = "ProductoT";
    /** <code>productosInsProductoProteccionDatospevcProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_INSPRODUCTOPROTECCIONDATOS_PRODUCTOSINSPRODUCTOPROTECCIONDATOSPEVCPROTECCIONDATOS = "p_evcProteccionDatos";
    /** <code>productosInsProductoProteccionDatospevcProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_INSPRODUCTOPROTECCIONDATOS_PRODUCTOSINSPRODUCTOPROTECCIONDATOSPEVCPROTECCIONDATOS = "Clas_1431687397376823Ser_11Arg_2_Alias";
    /** <code>productosInsProductoProteccionDatospevcProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPRODUCTOPROTECCIONDATOS_PRODUCTOSINSPRODUCTOPROTECCIONDATOSPEVCPROTECCIONDATOS = "Protecciones Datos";
    // Service (DelProductoProteccionDatos)
    /** <code>DelProductoProteccionDatos</code> service id. */
    public static final String SERV_ID_DELPRODUCTOPROTECCIONDATOS = "Clas_1431687397376823Ser_12_Alias";
    /** <code>DelProductoProteccionDatos</code> service name. */
    public static final String SERV_NAME_DELPRODUCTOPROTECCIONDATOS = "DelProductoProteccionDatos";
    /** <code>DelProductoProteccionDatos</code> service alias. */
    public static final String SERV_ALIAS_DELPRODUCTOPROTECCIONDATOS = "DelProductoProteccionDatos";
    /** Agents allowed to execute the service DelProductoProteccionDatos **/
    public static final String DELPRODUCTOPROTECCIONDATOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>productosDelProductoProteccionDatospthisProducto</code> inbound argument name. */
    public static final String ARG_NAME_DELPRODUCTOPROTECCIONDATOS_PRODUCTOSDELPRODUCTOPROTECCIONDATOSPTHISPRODUCTO = "p_thisProducto";
    /** <code>productosDelProductoProteccionDatospthisProducto</code> inbound argument id. */
    public static final String ARG_ID_DELPRODUCTOPROTECCIONDATOS_PRODUCTOSDELPRODUCTOPROTECCIONDATOSPTHISPRODUCTO = "Clas_1431687397376823Ser_12Arg_1_Alias";
    /** <code>productosDelProductoProteccionDatospthisProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPRODUCTOPROTECCIONDATOS_PRODUCTOSDELPRODUCTOPROTECCIONDATOSPTHISPRODUCTO = "ProductoT";
    /** <code>productosDelProductoProteccionDatospevcProteccionDatos</code> inbound argument name. */
    public static final String ARG_NAME_DELPRODUCTOPROTECCIONDATOS_PRODUCTOSDELPRODUCTOPROTECCIONDATOSPEVCPROTECCIONDATOS = "p_evcProteccionDatos";
    /** <code>productosDelProductoProteccionDatospevcProteccionDatos</code> inbound argument id. */
    public static final String ARG_ID_DELPRODUCTOPROTECCIONDATOS_PRODUCTOSDELPRODUCTOPROTECCIONDATOSPEVCPROTECCIONDATOS = "Clas_1431687397376823Ser_12Arg_2_Alias";
    /** <code>productosDelProductoProteccionDatospevcProteccionDatos</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPRODUCTOPROTECCIONDATOS_PRODUCTOSDELPRODUCTOPROTECCIONDATOSPEVCPROTECCIONDATOS = "Protecciones Datos";
    // Service (dummyVerificarContratoInc)
    /** <code>dummyVerificarContratoInc</code> service id. */
    public static final String SERV_ID_DUMMYVERIFICARCONTRATOINC = "Clas_1431687397376823Ser_13_Alias";
    /** <code>dummyVerificarContratoInc</code> service name. */
    public static final String SERV_NAME_DUMMYVERIFICARCONTRATOINC = "dummyVerificarContratoInc";
    /** <code>dummyVerificarContratoInc</code> service alias. */
    public static final String SERV_ALIAS_DUMMYVERIFICARCONTRATOINC = "dummy_VerificarContratoInc";
    /** Agents allowed to execute the service dummyVerificarContratoInc **/
    public static final String DUMMYVERIFICARCONTRATOINC_SRVAGENTS = "";
    // Preconditions
    /** <code>dummyVerificarContratoInc</code> precondition 0 id. */
    public static final String PRE_ID_DUMMYVERIFICARCONTRATOINC_0 = "Clas_1431687397376823Pre_9_MsgError";
    /** <code>dummyVerificarContratoInc</code> precondition 1 id. */
    public static final String PRE_ID_DUMMYVERIFICARCONTRATOINC_1 = "Clas_1431687397376823Pre_10_MsgError";
    /** <code>dummyVerificarContratoInc</code> precondition 2 id. */
    public static final String PRE_ID_DUMMYVERIFICARCONTRATOINC_2 = "Clas_1431687397376823Pre_11_MsgError";
    /** <code>dummyVerificarContratoInc</code> precondition 3 id. */
    public static final String PRE_ID_DUMMYVERIFICARCONTRATOINC_3 = "Clas_1431687397376823Pre_12_MsgError";
    /** <code>dummyVerificarContratoInc</code> precondition 4 id. */
    public static final String PRE_ID_DUMMYVERIFICARCONTRATOINC_4 = "Clas_1431687397376823Pre_13_MsgError";
    /** <code>dummyVerificarContratoInc</code> precondition 5 id. */
    public static final String PRE_ID_DUMMYVERIFICARCONTRATOINC_5 = "Clas_1431687397376823Pre_14_MsgError";
    // Inbound arguments
    /** <code>productosdummyVerificarContratoIncpthisProducto</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPTHISPRODUCTO = "p_thisProducto";
    /** <code>productosdummyVerificarContratoIncpthisProducto</code> inbound argument id. */
    public static final String ARG_ID_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPTHISPRODUCTO = "Clas_1431687397376823Ser_13Arg_1_Alias";
    /** <code>productosdummyVerificarContratoIncpthisProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPTHISPRODUCTO = "Producto";
    /** <code>productosdummyVerificarContratoIncpContratoC</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPCONTRATOC = "p_ContratoC";
    /** <code>productosdummyVerificarContratoIncpContratoC</code> inbound argument id. */
    public static final String ARG_ID_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPCONTRATOC = "Clas_1431687397376823Ser_13Arg_5_Alias";
    /** <code>productosdummyVerificarContratoIncpContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPCONTRATOC = "Contrato";
    /** <code>productosdummyVerificarContratoIncpNumFamilia</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPNUMFAMILIA = "p_NumFamilia";
    /** <code>productosdummyVerificarContratoIncpNumFamilia</code> inbound argument id. */
    public static final String ARG_ID_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPNUMFAMILIA = "Clas_1431687397376823Ser_13Arg_6_Alias";
    /** <code>productosdummyVerificarContratoIncpNumFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPNUMFAMILIA = "p_NumFamilia";
    /** <code>productosdummyVerificarContratoIncpFechaInicioContrato</code> inbound argument name. */
    public static final String ARG_NAME_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPFECHAINICIOCONTRATO = "p_FechaInicioContrato";
    /** <code>productosdummyVerificarContratoIncpFechaInicioContrato</code> inbound argument id. */
    public static final String ARG_ID_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPFECHAINICIOCONTRATO = "Clas_1431687397376823Ser_13Arg_7_Alias";
    /** <code>productosdummyVerificarContratoIncpFechaInicioContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_DUMMYVERIFICARCONTRATOINC_PRODUCTOSDUMMYVERIFICARCONTRATOINCPFECHAINICIOCONTRATO = "F. Inicio Contrato";
    // Service (CambProductoDeAsesorxProducto)
    /** <code>CambProductoDeAsesorxProducto</code> service id. */
    public static final String SERV_ID_CAMBPRODUCTODEASESORXPRODUCTO = "Clas_1431687397376823Ser_14_Alias";
    /** <code>CambProductoDeAsesorxProducto</code> service name. */
    public static final String SERV_NAME_CAMBPRODUCTODEASESORXPRODUCTO = "CambProductoDeAsesorxProducto";
    /** <code>CambProductoDeAsesorxProducto</code> service alias. */
    public static final String SERV_ALIAS_CAMBPRODUCTODEASESORXPRODUCTO = "CambProductoDeAsesorxProducto";
    /** Agents allowed to execute the service CambProductoDeAsesorxProducto **/
    public static final String CAMBPRODUCTODEASESORXPRODUCTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>productosCambProductoDeAsesorxProductopthisProducto</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTODEASESORXPRODUCTO_PRODUCTOSCAMBPRODUCTODEASESORXPRODUCTOPTHISPRODUCTO = "p_thisProducto";
    /** <code>productosCambProductoDeAsesorxProductopthisProducto</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTODEASESORXPRODUCTO_PRODUCTOSCAMBPRODUCTODEASESORXPRODUCTOPTHISPRODUCTO = "Clas_1431687397376823Ser_14Arg_1_Alias";
    /** <code>productosCambProductoDeAsesorxProductopthisProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTODEASESORXPRODUCTO_PRODUCTOSCAMBPRODUCTODEASESORXPRODUCTOPTHISPRODUCTO = "ProductoT";
    /** <code>productosCambProductoDeAsesorxProductopevcAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_CAMBPRODUCTODEASESORXPRODUCTO_PRODUCTOSCAMBPRODUCTODEASESORXPRODUCTOPEVCAGENTEXPRODUCTO = "p_evcAgentexProducto";
    /** <code>productosCambProductoDeAsesorxProductopevcAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_CAMBPRODUCTODEASESORXPRODUCTO_PRODUCTOSCAMBPRODUCTODEASESORXPRODUCTOPEVCAGENTEXPRODUCTO = "Clas_1431687397376823Ser_14Arg_2_Alias";
    /** <code>productosCambProductoDeAsesorxProductopevcAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBPRODUCTODEASESORXPRODUCTO_PRODUCTOSCAMBPRODUCTODEASESORXPRODUCTOPEVCAGENTEXPRODUCTO = "Asesores";
    // Service (chgProductoC)
    /** <code>chgProductoC</code> service id. */
    public static final String SERV_ID_CHGPRODUCTOC = "Clas_1431687397376823Ser_15_Alias";
    /** <code>chgProductoC</code> service name. */
    public static final String SERV_NAME_CHGPRODUCTOC = "chgProductoC";
    /** <code>chgProductoC</code> service alias. */
    public static final String SERV_ALIAS_CHGPRODUCTOC = "chgProductoC";
    /** Agents allowed to execute the service chgProductoC **/
    public static final String CHGPRODUCTOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>productoschgProductoCpthisProductos</code> inbound argument name. */
    public static final String ARG_NAME_CHGPRODUCTOC_PRODUCTOSCHGPRODUCTOCPTHISPRODUCTOS = "p_thisProductos";
    /** <code>productoschgProductoCpthisProductos</code> inbound argument id. */
    public static final String ARG_ID_CHGPRODUCTOC_PRODUCTOSCHGPRODUCTOCPTHISPRODUCTOS = "Clas_1431687397376823Ser_15Arg_1_Alias";
    /** <code>productoschgProductoCpthisProductos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHGPRODUCTOC_PRODUCTOSCHGPRODUCTOCPTHISPRODUCTOS = "Producto";
    /** <code>productoschgProductoCpevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_CHGPRODUCTOC_PRODUCTOSCHGPRODUCTOCPEVCCONTRATOC = "p_evcContratoC";
    /** <code>productoschgProductoCpevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_CHGPRODUCTOC_PRODUCTOSCHGPRODUCTOCPEVCCONTRATOC = "Clas_1431687397376823Ser_15Arg_2_Alias";
    /** <code>productoschgProductoCpevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHGPRODUCTOC_PRODUCTOSCHGPRODUCTOCPEVCCONTRATOC = "Contratos";

    public static final String FILTER_NAME_IFPRODUCTONUMERO = "iF_ProductoNumero";
    public static final String VAR_NAME_IFPRODUCTONUMERO_VNUMERO = "v_Numero";
    public static final String FILTER_NAME_IFPRODUCTOSPORCODLEGAL = "iF_Productos_PorCodLEgal";
    public static final String VAR_NAME_IFPRODUCTOSPORCODLEGAL_VCODLEGAL = "vCodLegal";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PRODUCTOSDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PRODUCTOSCODANEXOMAT.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_PRODUCTOSCODANEXONEO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_PRODUCTOSNIT.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PRODUCTOSCODIGOLEGAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PRODUCTOSFECHADOCSOLICITUD.toUpperCase(), Constants.Type.DATE.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PRODUCTOSPRODUCTO.toUpperCase(), PRODUCTOSPRODUCTO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PRODUCTOSDESCRIPCION.toUpperCase(), PRODUCTOSDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_PRODUCTOSCODANEXOMAT.toUpperCase(), PRODUCTOSCODANEXOMAT_AGENTS);
    	attributeAgents.put(ATTR_NAME_PRODUCTOSCODANEXONEO.toUpperCase(), PRODUCTOSCODANEXONEO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PRODUCTOSNIT.toUpperCase(), PRODUCTOSNIT_AGENTS);
    	attributeAgents.put(ATTR_NAME_PRODUCTOSCODIGOLEGAL.toUpperCase(), PRODUCTOSCODIGOLEGAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_PRODUCTOSFECHADOCSOLICITUD.toUpperCase(), PRODUCTOSFECHADOCSOLICITUD_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Productos', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Productos', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PRODUCTOSPRODUCTO);
        }
        // Facet 'Productos' (This facet)
        if (ProductosConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PRODUCTOSPRODUCTO);
        }
        return returnList;
    }
}
