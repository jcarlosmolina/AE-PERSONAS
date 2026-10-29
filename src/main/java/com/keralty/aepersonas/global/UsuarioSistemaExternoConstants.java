package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>UsuarioSistemaExterno</code> model class.
 */
public final class UsuarioSistemaExternoConstants {

    private UsuarioSistemaExternoConstants() {

    }

    // Class
    /** <code>UsuarioSistemaExterno</code> class id. */
    public static final String CLASS_ID = "Clas_1738059022336227_Alias";
    /** <code>UsuarioSistemaExterno</code> class name. */
    public static final String CLASS_NAME = "UsuarioSistemaExterno";
    /** <code>UsuarioSistemaExterno</code> class alias. */
    public static final String CLASS_ALIAS = "Sistema Externo";
    /** <code>UsuarioSistemaExterno</code> class table name. */
    public static final String TBL_NAME = "UsuarioSistemaExterno";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "usuarioSistemaExternoLogin,passWord,usuarioSistemaExternoDescripcion";

    public static final String DSDSUSUARIOSISTEMAEXTERNO = "DS_UsuarioSistemaExterno";
    

    // Attribute (usuarioSistemaExternoLogin)
    /** <code>usuarioSistemaExternoLogin</code> attribute id. */
    public static final String ATTR_ID_USUARIOSISTEMAEXTERNOLOGIN = "Clas_1738059022336227Atr_2_Alias";
    /** <code>usuarioSistemaExternoLogin</code> attribute name. */
    public static final String ATTR_NAME_USUARIOSISTEMAEXTERNOLOGIN = "usuarioSistemaExternoLogin";
    /** <code>usuarioSistemaExternoLogin</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOSISTEMAEXTERNOLOGIN = "Login";

    /** <code>usuarioSistemaExternoLogin</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOSISTEMAEXTERNOLOGIN = "";
    /** Agents allowed to view the attribute usuarioSistemaExternoLogin **/
    public static final String USUARIOSISTEMAEXTERNOLOGIN_AGENTS = "Admin,SuperAdmin,UsuarioSistemaExterno";
    // Attribute (usuarioSistemaExternoDescripcion)
    /** <code>usuarioSistemaExternoDescripcion</code> attribute id. */
    public static final String ATTR_ID_USUARIOSISTEMAEXTERNODESCRIPCION = "Clas_1738059022336227Atr_3_Alias";
    /** <code>usuarioSistemaExternoDescripcion</code> attribute name. */
    public static final String ATTR_NAME_USUARIOSISTEMAEXTERNODESCRIPCION = "usuarioSistemaExternoDescripcion";
    /** <code>usuarioSistemaExternoDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_USUARIOSISTEMAEXTERNODESCRIPCION = "Descripción";

    /** <code>usuarioSistemaExternoDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_USUARIOSISTEMAEXTERNODESCRIPCION = "";
    /** Agents allowed to view the attribute usuarioSistemaExternoDescripcion **/
    public static final String USUARIOSISTEMAEXTERNODESCRIPCION_AGENTS = "Admin,SuperAdmin";


    // Field (Login)
    /** <code>Login</code> field name. */
    public static final String FLD_USUARIOSISTEMAEXTERNOLOGIN = "Login";    
    /** <code>Login</code> field length. */
    public static final int FLD_USUARIOSISTEMAEXTERNOLOGINLENGTH = 20;
    /** <code>usuarioSistemaExternoLogin</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOSISTEMAEXTERNOLOGIN = "usuarioSistemaExternoLogin";
    // Field (PassWord)
    /** <code>PassWord</code> field name. */
    public static final String FLD_P4SSW0RD = "PassWord";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_USUARIOSISTEMAEXTERNODESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_USUARIOSISTEMAEXTERNODESCRIPCIONLENGTH = 255;
    /** <code>usuarioSistemaExternoDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_USUARIOSISTEMAEXTERNODESCRIPCION = "usuarioSistemaExternoDescripcion";



    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1738059022336227Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>usuarioSistemaExternocrearpatrLogin</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOSISTEMAEXTERNOCREARPATRLOGIN = "p_atrLogin";
    /** <code>usuarioSistemaExternocrearpatrLogin</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOSISTEMAEXTERNOCREARPATRLOGIN = "Clas_1738059022336227Ser_1Arg_2_Alias";
    /** <code>usuarioSistemaExternocrearpatrLogin</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOSISTEMAEXTERNOCREARPATRLOGIN = "Login";
    /** <code>usuarioSistemaExternocrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOSISTEMAEXTERNOCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>usuarioSistemaExternocrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOSISTEMAEXTERNOCREARPATRDESCRIPCION = "Clas_1738059022336227Ser_1Arg_3_Alias";
    /** <code>usuarioSistemaExternocrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOSISTEMAEXTERNOCREARPATRDESCRIPCION = "Descripción";
    /** <code>usuarioSistemaExternocrearppassword</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_USUARIOSISTEMAEXTERNOCREARPP4SSW0RD = "p_password";
    /** <code>usuarioSistemaExternocrearppassword</code> inbound argument id. */
    public static final String ARG_ID_CREAR_USUARIOSISTEMAEXTERNOCREARPP4SSW0RD = "Clas_1738059022336227Ser_1Arg_4_Alias";
    /** <code>usuarioSistemaExternocrearppassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_USUARIOSISTEMAEXTERNOCREARPP4SSW0RD = "Password";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1738059022336227Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>usuarioSistemaExternoeliminarpthisUsuarioSistemaExterno</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_USUARIOSISTEMAEXTERNOELIMINARPTHISUSUARIOSISTEMAEXTERNO = "p_thisUsuarioSistemaExterno";
    /** <code>usuarioSistemaExternoeliminarpthisUsuarioSistemaExterno</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_USUARIOSISTEMAEXTERNOELIMINARPTHISUSUARIOSISTEMAEXTERNO = "Clas_1738059022336227Ser_2Arg_1_Alias";
    /** <code>usuarioSistemaExternoeliminarpthisUsuarioSistemaExterno</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_USUARIOSISTEMAEXTERNOELIMINARPTHISUSUARIOSISTEMAEXTERNO = "Sistema Externo";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1738059022336227Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>usuarioSistemaExternomodificarpthisUsuarioSistemaExterno</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOSISTEMAEXTERNOMODIFICARPTHISUSUARIOSISTEMAEXTERNO = "p_thisUsuarioSistemaExterno";
    /** <code>usuarioSistemaExternomodificarpthisUsuarioSistemaExterno</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOSISTEMAEXTERNOMODIFICARPTHISUSUARIOSISTEMAEXTERNO = "Clas_1738059022336227Ser_3Arg_1_Alias";
    /** <code>usuarioSistemaExternomodificarpthisUsuarioSistemaExterno</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOSISTEMAEXTERNOMODIFICARPTHISUSUARIOSISTEMAEXTERNO = "Sistema Externo";
    /** <code>usuarioSistemaExternomodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_USUARIOSISTEMAEXTERNOMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>usuarioSistemaExternomodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_USUARIOSISTEMAEXTERNOMODIFICARPDESCRIPCION = "Clas_1738059022336227Ser_3Arg_2_Alias";
    /** <code>usuarioSistemaExternomodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_USUARIOSISTEMAEXTERNOMODIFICARPDESCRIPCION = "Descripción";
    // Service (setPassword)
    /** <code>setPassword</code> service id. */
    public static final String SERV_ID_SETP4SSW0RD = "Clas_1738059022336227Ser_4_Alias";
    /** <code>setPassword</code> service name. */
    public static final String SERV_NAME_SETP4SSW0RD = "setPassword";
    /** <code>setPassword</code> service alias. */
    public static final String SERV_ALIAS_SETP4SSW0RD = "Set password";
    /** Agents allowed to execute the service setPassword **/
    public static final String SETP4SSW0RD_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>usuarioSistemaExternosetPasswordpthisUsuarioSistemaExterno</code> inbound argument name. */
    public static final String ARG_NAME_SETP4SSW0RD_USUARIOSISTEMAEXTERNOSETP4SSW0RDPTHISUSUARIOSISTEMAEXTERNO = "p_thisUsuarioSistemaExterno";
    /** <code>usuarioSistemaExternosetPasswordpthisUsuarioSistemaExterno</code> inbound argument id. */
    public static final String ARG_ID_SETP4SSW0RD_USUARIOSISTEMAEXTERNOSETP4SSW0RDPTHISUSUARIOSISTEMAEXTERNO = "Clas_1738059022336227Ser_4Arg_1_Alias";
    /** <code>usuarioSistemaExternosetPasswordpthisUsuarioSistemaExterno</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETP4SSW0RD_USUARIOSISTEMAEXTERNOSETP4SSW0RDPTHISUSUARIOSISTEMAEXTERNO = "Sistema Externo";
    /** <code>usuarioSistemaExternosetPasswordpNewPassword</code> inbound argument name. */
    public static final String ARG_NAME_SETP4SSW0RD_USUARIOSISTEMAEXTERNOSETP4SSW0RDPNEWP4SSW0RD = "p_NewPassword";
    /** <code>usuarioSistemaExternosetPasswordpNewPassword</code> inbound argument id. */
    public static final String ARG_ID_SETP4SSW0RD_USUARIOSISTEMAEXTERNOSETP4SSW0RDPNEWP4SSW0RD = "Clas_1738059022336227Ser_4Arg_2_Alias";
    /** <code>usuarioSistemaExternosetPasswordpNewPassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_SETP4SSW0RD_USUARIOSISTEMAEXTERNOSETP4SSW0RDPNEWP4SSW0RD = "Nueva password";
    // Service (changePassword)
    /** <code>changePassword</code> service id. */
    public static final String SERV_ID_CHANGEP4SSW0RD = "Clas_1738059022336227Ser_4B_Alias";
    /** <code>changePassword</code> service name. */
    public static final String SERV_NAME_CHANGEP4SSW0RD = "changePassword";
    /** <code>changePassword</code> service alias. */
    public static final String SERV_ALIAS_CHANGEP4SSW0RD = "Change Password";
    /** Agents allowed to execute the service changePassword **/
    public static final String CHANGEP4SSW0RD_SRVAGENTS = "UsuarioSistemaExterno";
    // Inbound arguments
    /** <code>usuarioSistemaExternochangePasswordpthisUsuarioSistemaExterno</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_USUARIOSISTEMAEXTERNOCHANGEP4SSW0RDPTHISUSUARIOSISTEMAEXTERNO = "p_thisUsuarioSistemaExterno";
    /** <code>usuarioSistemaExternochangePasswordpthisUsuarioSistemaExterno</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_USUARIOSISTEMAEXTERNOCHANGEP4SSW0RDPTHISUSUARIOSISTEMAEXTERNO = "Clas_1738059022336227Ser_4Arg_1B_Alias";
    /** <code>usuarioSistemaExternochangePasswordpthisUsuarioSistemaExterno</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_USUARIOSISTEMAEXTERNOCHANGEP4SSW0RDPTHISUSUARIOSISTEMAEXTERNO = "Sistema Externo";
    /** <code>usuarioSistemaExternochangePasswordpOldPassword</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_USUARIOSISTEMAEXTERNOCHANGEP4SSW0RDPOLDP4SSW0RD = "p_OldPassword";
    /** <code>usuarioSistemaExternochangePasswordpOldPassword</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_USUARIOSISTEMAEXTERNOCHANGEP4SSW0RDPOLDP4SSW0RD = "Clas_1738059022336227Ser_4Arg_2B_Alias";
    /** <code>usuarioSistemaExternochangePasswordpOldPassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_USUARIOSISTEMAEXTERNOCHANGEP4SSW0RDPOLDP4SSW0RD = "Old password";
    /** <code>usuarioSistemaExternochangePasswordpNewPassword</code> inbound argument name. */
    public static final String ARG_NAME_CHANGEP4SSW0RD_USUARIOSISTEMAEXTERNOCHANGEP4SSW0RDPNEWP4SSW0RD = "p_NewPassword";
    /** <code>usuarioSistemaExternochangePasswordpNewPassword</code> inbound argument id. */
    public static final String ARG_ID_CHANGEP4SSW0RD_USUARIOSISTEMAEXTERNOCHANGEP4SSW0RDPNEWP4SSW0RD = "Clas_1738059022336227Ser_4Arg_2B_Alias";
    /** <code>usuarioSistemaExternochangePasswordpNewPassword</code> inbound argument alias. */
    public static final String ARG_ALIAS_CHANGEP4SSW0RD_USUARIOSISTEMAEXTERNOCHANGEP4SSW0RDPNEWP4SSW0RD = "Nueva password";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_USUARIOSISTEMAEXTERNODESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_USUARIOSISTEMAEXTERNOLOGIN.toUpperCase(), USUARIOSISTEMAEXTERNOLOGIN_AGENTS);
    	attributeAgents.put(ATTR_NAME_USUARIOSISTEMAEXTERNODESCRIPCION.toUpperCase(), USUARIOSISTEMAEXTERNODESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'UsuarioSistemaExterno', it returns the identification keys
     * - If className is a facet of the inheritance net of 'UsuarioSistemaExterno', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_USUARIOSISTEMAEXTERNOLOGIN);
        }
        // Facet 'UsuarioSistemaExterno' (This facet)
        if (UsuarioSistemaExternoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_USUARIOSISTEMAEXTERNOLOGIN);
        }
        return returnList;
    }
}
