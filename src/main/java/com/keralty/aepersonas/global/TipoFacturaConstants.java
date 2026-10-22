package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>TipoFactura</code> model class.
 */
public final class TipoFacturaConstants {

    private TipoFacturaConstants() {

    }

    // Class
    /** <code>TipoFactura</code> class id. */
    public static final String CLASS_ID = "Clas_1547132600320261_Alias";
    /** <code>TipoFactura</code> class name. */
    public static final String CLASS_NAME = "TipoFactura";
    /** <code>TipoFactura</code> class alias. */
    public static final String CLASS_ALIAS = "Tipo Factura";
    /** <code>TipoFactura</code> class table name. */
    public static final String TBL_NAME = "TipoFactura";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "tipoFacturaCodigo,tipoFacturaDescripcion,tipoFacturaEsEmail,tipoFacturaEsCelular,tipoFacturaActivo";

    public static final String DSICTIPOFACTURA = "IC_TipoFactura";
    public static final String DSDSTIPOFACTURA = "DS_TipoFactura";
    

    // Attribute (tipoFacturaCodigo)
    /** <code>tipoFacturaCodigo</code> attribute id. */
    public static final String ATTR_ID_TIPOFACTURACODIGO = "Clas_1547132600320261Atr_1_Alias";
    /** <code>tipoFacturaCodigo</code> attribute name. */
    public static final String ATTR_NAME_TIPOFACTURACODIGO = "tipoFacturaCodigo";
    /** <code>tipoFacturaCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOFACTURACODIGO = "Código";

    /** <code>tipoFacturaCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOFACTURACODIGO = "";
    /** Agents allowed to view the attribute tipoFacturaCodigo **/
    public static final String TIPOFACTURACODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (tipoFacturaDescripcion)
    /** <code>tipoFacturaDescripcion</code> attribute id. */
    public static final String ATTR_ID_TIPOFACTURADESCRIPCION = "Clas_1547132600320261Atr_2_Alias";
    /** <code>tipoFacturaDescripcion</code> attribute name. */
    public static final String ATTR_NAME_TIPOFACTURADESCRIPCION = "tipoFacturaDescripcion";
    /** <code>tipoFacturaDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOFACTURADESCRIPCION = "Descripción";

    /** <code>tipoFacturaDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOFACTURADESCRIPCION = "";
    /** Agents allowed to view the attribute tipoFacturaDescripcion **/
    public static final String TIPOFACTURADESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (tipoFacturaEsEmail)
    /** <code>tipoFacturaEsEmail</code> attribute id. */
    public static final String ATTR_ID_TIPOFACTURAESEMAIL = "Clas_1547132600320261Atr_3_Alias";
    /** <code>tipoFacturaEsEmail</code> attribute name. */
    public static final String ATTR_NAME_TIPOFACTURAESEMAIL = "tipoFacturaEsEmail";
    /** <code>tipoFacturaEsEmail</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOFACTURAESEMAIL = "Es email";

    /** <code>tipoFacturaEsEmail</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOFACTURAESEMAIL = "";
    /** Agents allowed to view the attribute tipoFacturaEsEmail **/
    public static final String TIPOFACTURAESEMAIL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (tipoFacturaEsCelular)
    /** <code>tipoFacturaEsCelular</code> attribute id. */
    public static final String ATTR_ID_TIPOFACTURAESCELULAR = "Clas_1547132600320261Atr_4_Alias";
    /** <code>tipoFacturaEsCelular</code> attribute name. */
    public static final String ATTR_NAME_TIPOFACTURAESCELULAR = "tipoFacturaEsCelular";
    /** <code>tipoFacturaEsCelular</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOFACTURAESCELULAR = "Es celular";

    /** <code>tipoFacturaEsCelular</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOFACTURAESCELULAR = "";
    /** Agents allowed to view the attribute tipoFacturaEsCelular **/
    public static final String TIPOFACTURAESCELULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (tipoFacturaActivo)
    /** <code>tipoFacturaActivo</code> attribute id. */
    public static final String ATTR_ID_TIPOFACTURAACTIVO = "Clas_1547132600320261Atr_5_Alias";
    /** <code>tipoFacturaActivo</code> attribute name. */
    public static final String ATTR_NAME_TIPOFACTURAACTIVO = "tipoFacturaActivo";
    /** <code>tipoFacturaActivo</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPOFACTURAACTIVO = "Activo";

    /** <code>tipoFacturaActivo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPOFACTURAACTIVO = "";
    /** Agents allowed to view the attribute tipoFacturaActivo **/
    public static final String TIPOFACTURAACTIVO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TIPOFACTURACODIGO = "Codigo";    
    /** <code>Codigo</code> field length. */
    public static final int FLD_TIPOFACTURACODIGOLENGTH = 20;
    /** <code>tipoFacturaCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOFACTURACODIGO = "tipoFacturaCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_TIPOFACTURADESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_TIPOFACTURADESCRIPCIONLENGTH = 50;
    /** <code>tipoFacturaDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOFACTURADESCRIPCION = "tipoFacturaDescripcion";
    // Field (EsEmail)
    /** <code>EsEmail</code> field name. */
    public static final String FLD_TIPOFACTURAESEMAIL = "EsEmail";    
    /** <code>tipoFacturaEsEmail</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOFACTURAESEMAIL = "tipoFacturaEsEmail";
    // Field (EsCelular)
    /** <code>EsCelular</code> field name. */
    public static final String FLD_TIPOFACTURAESCELULAR = "EsCelular";    
    /** <code>tipoFacturaEsCelular</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOFACTURAESCELULAR = "tipoFacturaEsCelular";
    // Field (Activo)
    /** <code>Activo</code> field name. */
    public static final String FLD_TIPOFACTURAACTIVO = "Activo";    
    /** <code>tipoFacturaActivo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOFACTURAACTIVO = "tipoFacturaActivo";


    // Compound role (Solicitudes)
    /** <code>Solicitudes</code> role id. */
    public static final String ROLE_ID_SOLICITUDES = "Agr_1547133517824671_Alias";
    /** <code>Solicitudes</code> role name. */
    public static final String ROLE_NAME_SOLICITUDES = "solicitudes";
    /** <code>TipoFactura</code> role alias. */
    public static final String ROLE_ALIAS_SOLICITUDES = "Solicitudes";


    /** <code>Solicitudes</code> inverse role name. */
    public static final String ROLE_INVNAME_SOLICITUDES = SolicitudConstants.ROLE_NAME_TIPOFACTURA;
    /** <code>Solicitudes</code> role facet sequence. */
    public static final String PATH_FACETS_SOLICITUDES = "";
    /** <code>Solicitudes</code> role target class. */
    public static final String ROLE_TARGET_SOLICITUDES = SolicitudConstants.CLASS_NAME;
    /** Agents allowed to navigate through Solicitudes **/
    public static final String SOLICITUDES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1547132600320261Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tipoFacturacrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOFACTURACREARPATRCODIGO = "p_atrCodigo";
    /** <code>tipoFacturacrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOFACTURACREARPATRCODIGO = "Clas_1547132600320261Ser_1Arg_1_Alias";
    /** <code>tipoFacturacrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOFACTURACREARPATRCODIGO = "Código";
    /** <code>tipoFacturacrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOFACTURACREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>tipoFacturacrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOFACTURACREARPATRDESCRIPCION = "Clas_1547132600320261Ser_1Arg_2_Alias";
    /** <code>tipoFacturacrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOFACTURACREARPATRDESCRIPCION = "Descripción";
    /** <code>tipoFacturacrearpatrEsEmail</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOFACTURACREARPATRESEMAIL = "p_atrEsEmail";
    /** <code>tipoFacturacrearpatrEsEmail</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOFACTURACREARPATRESEMAIL = "Clas_1547132600320261Ser_1Arg_3_Alias";
    /** <code>tipoFacturacrearpatrEsEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOFACTURACREARPATRESEMAIL = "Es email";
    /** <code>tipoFacturacrearpatrEsCelular</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPOFACTURACREARPATRESCELULAR = "p_atrEsCelular";
    /** <code>tipoFacturacrearpatrEsCelular</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPOFACTURACREARPATRESCELULAR = "Clas_1547132600320261Ser_1Arg_4_Alias";
    /** <code>tipoFacturacrearpatrEsCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPOFACTURACREARPATRESCELULAR = "Es celular";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1547132600320261Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tipoFacturaeliminarpthisTipoFactura</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_TIPOFACTURAELIMINARPTHISTIPOFACTURA = "p_thisTipoFactura";
    /** <code>tipoFacturaeliminarpthisTipoFactura</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_TIPOFACTURAELIMINARPTHISTIPOFACTURA = "Clas_1547132600320261Ser_2Arg_1_Alias";
    /** <code>tipoFacturaeliminarpthisTipoFactura</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_TIPOFACTURAELIMINARPTHISTIPOFACTURA = "Tipo Factura";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1547132600320261Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tipoFacturamodificarpthisTipoFactura</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOFACTURAMODIFICARPTHISTIPOFACTURA = "p_thisTipoFactura";
    /** <code>tipoFacturamodificarpthisTipoFactura</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOFACTURAMODIFICARPTHISTIPOFACTURA = "Clas_1547132600320261Ser_3Arg_1_Alias";
    /** <code>tipoFacturamodificarpthisTipoFactura</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOFACTURAMODIFICARPTHISTIPOFACTURA = "Tipo Factura";
    /** <code>tipoFacturamodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOFACTURAMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>tipoFacturamodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOFACTURAMODIFICARPDESCRIPCION = "Clas_1547132600320261Ser_3Arg_2_Alias";
    /** <code>tipoFacturamodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOFACTURAMODIFICARPDESCRIPCION = "Descripción";
    /** <code>tipoFacturamodificarpEsEmail</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOFACTURAMODIFICARPESEMAIL = "p_EsEmail";
    /** <code>tipoFacturamodificarpEsEmail</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOFACTURAMODIFICARPESEMAIL = "Clas_1547132600320261Ser_3Arg_3_Alias";
    /** <code>tipoFacturamodificarpEsEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOFACTURAMODIFICARPESEMAIL = "Es email";
    /** <code>tipoFacturamodificarpEsCelular</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOFACTURAMODIFICARPESCELULAR = "p_EsCelular";
    /** <code>tipoFacturamodificarpEsCelular</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOFACTURAMODIFICARPESCELULAR = "Clas_1547132600320261Ser_3Arg_4_Alias";
    /** <code>tipoFacturamodificarpEsCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOFACTURAMODIFICARPESCELULAR = "Es celular";
    /** <code>tipoFacturamodificarpActivo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPOFACTURAMODIFICARPACTIVO = "p_Activo";
    /** <code>tipoFacturamodificarpActivo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPOFACTURAMODIFICARPACTIVO = "Clas_1547132600320261Ser_3Arg_5_Alias";
    /** <code>tipoFacturamodificarpActivo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPOFACTURAMODIFICARPACTIVO = "Activo";
    // Service (InsTipoFactura)
    /** <code>InsTipoFactura</code> service id. */
    public static final String SERV_ID_INSTIPOFACTURA = "Clas_1547132600320261Ser_4_Alias";
    /** <code>InsTipoFactura</code> service name. */
    public static final String SERV_NAME_INSTIPOFACTURA = "InsTipoFactura";
    /** <code>InsTipoFactura</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOFACTURA = "InsTipoFactura";
    /** Agents allowed to execute the service InsTipoFactura **/
    public static final String INSTIPOFACTURA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoFacturaInsTipoFacturapthisTipoFactura</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOFACTURA_TIPOFACTURAINSTIPOFACTURAPTHISTIPOFACTURA = "p_thisTipoFactura";
    /** <code>tipoFacturaInsTipoFacturapthisTipoFactura</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOFACTURA_TIPOFACTURAINSTIPOFACTURAPTHISTIPOFACTURA = "Clas_1547132600320261Ser_4Arg_1_Alias";
    /** <code>tipoFacturaInsTipoFacturapthisTipoFactura</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOFACTURA_TIPOFACTURAINSTIPOFACTURAPTHISTIPOFACTURA = "Tipo Factura";
    /** <code>tipoFacturaInsTipoFacturapevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOFACTURA_TIPOFACTURAINSTIPOFACTURAPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>tipoFacturaInsTipoFacturapevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOFACTURA_TIPOFACTURAINSTIPOFACTURAPEVCSOLICITUD = "Clas_1547132600320261Ser_4Arg_2_Alias";
    /** <code>tipoFacturaInsTipoFacturapevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOFACTURA_TIPOFACTURAINSTIPOFACTURAPEVCSOLICITUD = "Solicitudes";
    // Service (DelTipoFactura)
    /** <code>DelTipoFactura</code> service id. */
    public static final String SERV_ID_DELTIPOFACTURA = "Clas_1547132600320261Ser_5_Alias";
    /** <code>DelTipoFactura</code> service name. */
    public static final String SERV_NAME_DELTIPOFACTURA = "DelTipoFactura";
    /** <code>DelTipoFactura</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOFACTURA = "DelTipoFactura";
    /** Agents allowed to execute the service DelTipoFactura **/
    public static final String DELTIPOFACTURA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>tipoFacturaDelTipoFacturapthisTipoFactura</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOFACTURA_TIPOFACTURADELTIPOFACTURAPTHISTIPOFACTURA = "p_thisTipoFactura";
    /** <code>tipoFacturaDelTipoFacturapthisTipoFactura</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOFACTURA_TIPOFACTURADELTIPOFACTURAPTHISTIPOFACTURA = "Clas_1547132600320261Ser_5Arg_1_Alias";
    /** <code>tipoFacturaDelTipoFacturapthisTipoFactura</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOFACTURA_TIPOFACTURADELTIPOFACTURAPTHISTIPOFACTURA = "Tipo Factura";
    /** <code>tipoFacturaDelTipoFacturapevcSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOFACTURA_TIPOFACTURADELTIPOFACTURAPEVCSOLICITUD = "p_evcSolicitud";
    /** <code>tipoFacturaDelTipoFacturapevcSolicitud</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOFACTURA_TIPOFACTURADELTIPOFACTURAPEVCSOLICITUD = "Clas_1547132600320261Ser_5Arg_2_Alias";
    /** <code>tipoFacturaDelTipoFacturapevcSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOFACTURA_TIPOFACTURADELTIPOFACTURAPEVCSOLICITUD = "Solicitudes";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_TIPOFACTURADESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPOFACTURAESEMAIL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPOFACTURAESCELULAR.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPOFACTURAACTIVO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_TIPOFACTURACODIGO.toUpperCase(), TIPOFACTURACODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOFACTURADESCRIPCION.toUpperCase(), TIPOFACTURADESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOFACTURAESEMAIL.toUpperCase(), TIPOFACTURAESEMAIL_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOFACTURAESCELULAR.toUpperCase(), TIPOFACTURAESCELULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPOFACTURAACTIVO.toUpperCase(), TIPOFACTURAACTIVO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'TipoFactura', it returns the identification keys
     * - If className is a facet of the inheritance net of 'TipoFactura', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_TIPOFACTURACODIGO);
        }
        // Facet 'TipoFactura' (This facet)
        if (TipoFacturaConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_TIPOFACTURACODIGO);
        }
        return returnList;
    }
}
