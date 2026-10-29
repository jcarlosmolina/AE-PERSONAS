package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Companyia</code> model class.
 */
public final class CompanyiaConstants {

    private CompanyiaConstants() {

    }

    // Class
    /** <code>Companyia</code> class id. */
    public static final String CLASS_ID = "Clas_1431889510400288_Alias";
    /** <code>Companyia</code> class name. */
    public static final String CLASS_NAME = "Companyia";
    /** <code>Companyia</code> class alias. */
    public static final String CLASS_ALIAS = "Compañía";
    /** <code>Companyia</code> class table name. */
    public static final String TBL_NAME = "Companyia";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "companyiaCodigo,companyiaNombre,companyiaEsDeMP";

    public static final String DSICCOMPANYIA = "IC_Companyia";
    

    // Attribute (companyiaCodigo)
    /** <code>companyiaCodigo</code> attribute id. */
    public static final String ATTR_ID_COMPANYIACODIGO = "Clas_1431889510400288Atr_1_Alias";
    /** <code>companyiaCodigo</code> attribute name. */
    public static final String ATTR_NAME_COMPANYIACODIGO = "companyiaCodigo";
    /** <code>companyiaCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_COMPANYIACODIGO = "Código";

    /** <code>companyiaCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_COMPANYIACODIGO = "";
    /** Agents allowed to view the attribute companyiaCodigo **/
    public static final String COMPANYIACODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (companyiaNombre)
    /** <code>companyiaNombre</code> attribute id. */
    public static final String ATTR_ID_COMPANYIANOMBRE = "Clas_1431889510400288Atr_2_Alias";
    /** <code>companyiaNombre</code> attribute name. */
    public static final String ATTR_NAME_COMPANYIANOMBRE = "companyiaNombre";
    /** <code>companyiaNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_COMPANYIANOMBRE = "Nombre";

    /** <code>companyiaNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_COMPANYIANOMBRE = "";
    /** Agents allowed to view the attribute companyiaNombre **/
    public static final String COMPANYIANOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (companyiaEsDeMP)
    /** <code>companyiaEsDeMP</code> attribute id. */
    public static final String ATTR_ID_COMPANYIAESDEMP = "Clas_1431889510400288Atr_3_Alias";
    /** <code>companyiaEsDeMP</code> attribute name. */
    public static final String ATTR_NAME_COMPANYIAESDEMP = "companyiaEsDeMP";
    /** <code>companyiaEsDeMP</code> attribute alias. */
    public static final String ATTR_ALIAS_COMPANYIAESDEMP = "Medicina Prepagada";

    /** <code>companyiaEsDeMP</code> attribute facet sequence. */
    public static final String PATH_FACETS_COMPANYIAESDEMP = "";
    /** Agents allowed to view the attribute companyiaEsDeMP **/
    public static final String COMPANYIAESDEMP_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_COMPANYIACODIGO = "Codigo";    
    /** <code>companyiaCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_COMPANYIACODIGO = "companyiaCodigo";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_COMPANYIANOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_COMPANYIANOMBRELENGTH = 150;
    /** <code>companyiaNombre</code> attribute field name. */
    public static final String ATTR_FIELD_COMPANYIANOMBRE = "companyiaNombre";
    // Field (EsDeMP)
    /** <code>EsDeMP</code> field name. */
    public static final String FLD_COMPANYIAESDEMP = "EsDeMP";    
    /** <code>companyiaEsDeMP</code> attribute field name. */
    public static final String ATTR_FIELD_COMPANYIAESDEMP = "companyiaEsDeMP";


    // Compound role (AtributosUsuario)
    /** <code>AtributosUsuario</code> role id. */
    public static final String ROLE_ID_ATRIBUTOSUSUARIO = "Agr_1432634261504830_Alias";
    /** <code>AtributosUsuario</code> role name. */
    public static final String ROLE_NAME_ATRIBUTOSUSUARIO = "atributosUsuario";
    /** <code>Companyia</code> role alias. */
    public static final String ROLE_ALIAS_ATRIBUTOSUSUARIO = "Atributos usuario";


    /** <code>AtributosUsuario</code> inverse role name. */
    public static final String ROLE_INVNAME_ATRIBUTOSUSUARIO = UsuarioConstants.ROLE_NAME_COMPANYIA;
    /** <code>AtributosUsuario</code> role facet sequence. */
    public static final String PATH_FACETS_ATRIBUTOSUSUARIO = "";
    /** <code>AtributosUsuario</code> role target class. */
    public static final String ROLE_TARGET_ATRIBUTOSUSUARIO = UsuarioConstants.CLASS_NAME;
    /** Agents allowed to navigate through AtributosUsuario **/
    public static final String ATRIBUTOSUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (BeneficiariosC)
    /** <code>BeneficiariosC</code> role id. */
    public static final String ROLE_ID_BENEFICIARIOSC = "Agr_1473094221824900_Alias";
    /** <code>BeneficiariosC</code> role name. */
    public static final String ROLE_NAME_BENEFICIARIOSC = "beneficiariosC";
    /** <code>CompanyiaMPC</code> role alias. */
    public static final String ROLE_ALIAS_BENEFICIARIOSC = "Beneficiarios";


    /** <code>BeneficiariosC</code> inverse role name. */
    public static final String ROLE_INVNAME_BENEFICIARIOSC = BeneficiarioCConstants.ROLE_NAME_COMPANYIAMPC;
    /** <code>BeneficiariosC</code> role facet sequence. */
    public static final String PATH_FACETS_BENEFICIARIOSC = "";
    /** <code>BeneficiariosC</code> role target class. */
    public static final String ROLE_TARGET_BENEFICIARIOSC = BeneficiarioCConstants.CLASS_NAME;
    /** Agents allowed to navigate through BeneficiariosC **/
    public static final String BENEFICIARIOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431889510400288Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear compañía";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>companyiacrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_COMPANYIACREARPATRCODIGO = "p_atrCodigo";
    /** <code>companyiacrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_COMPANYIACREARPATRCODIGO = "Clas_1431889510400288Ser_1Arg_1_Alias";
    /** <code>companyiacrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_COMPANYIACREARPATRCODIGO = "Código";
    /** <code>companyiacrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_COMPANYIACREARPATRNOMBRE = "p_atrNombre";
    /** <code>companyiacrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_COMPANYIACREARPATRNOMBRE = "Clas_1431889510400288Ser_1Arg_2_Alias";
    /** <code>companyiacrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_COMPANYIACREARPATRNOMBRE = "Nombre";
    /** <code>companyiacrearpatrEsDeMP</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_COMPANYIACREARPATRESDEMP = "p_atrEsDeMP";
    /** <code>companyiacrearpatrEsDeMP</code> inbound argument id. */
    public static final String ARG_ID_CREAR_COMPANYIACREARPATRESDEMP = "Clas_1431889510400288Ser_1Arg_3_Alias";
    /** <code>companyiacrearpatrEsDeMP</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_COMPANYIACREARPATRESDEMP = "Medicina Prepagada";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431889510400288Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar compañía";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>companyiaeliminarpthisCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_COMPANYIAELIMINARPTHISCOMPANYIA = "p_thisCompanyia";
    /** <code>companyiaeliminarpthisCompanyia</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_COMPANYIAELIMINARPTHISCOMPANYIA = "Clas_1431889510400288Ser_2Arg_1_Alias";
    /** <code>companyiaeliminarpthisCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_COMPANYIAELIMINARPTHISCOMPANYIA = "Compañía";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431889510400288Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar compañía";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>companyiamodificarpthisCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_COMPANYIAMODIFICARPTHISCOMPANYIA = "p_thisCompanyia";
    /** <code>companyiamodificarpthisCompanyia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_COMPANYIAMODIFICARPTHISCOMPANYIA = "Clas_1431889510400288Ser_3Arg_1_Alias";
    /** <code>companyiamodificarpthisCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_COMPANYIAMODIFICARPTHISCOMPANYIA = "Compañía";
    /** <code>companyiamodificarpEsDeMP</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_COMPANYIAMODIFICARPESDEMP = "p_EsDeMP";
    /** <code>companyiamodificarpEsDeMP</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_COMPANYIAMODIFICARPESDEMP = "Clas_1431889510400288Ser_3Arg_2_Alias";
    /** <code>companyiamodificarpEsDeMP</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_COMPANYIAMODIFICARPESDEMP = "Medicina Prepagada";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431889510400288Ser_4_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>companyiasincronizarpthisCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_COMPANYIASINCRONIZARPTHISCOMPANYIA = "p_thisCompanyia";
    /** <code>companyiasincronizarpthisCompanyia</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_COMPANYIASINCRONIZARPTHISCOMPANYIA = "Clas_1431889510400288Ser_4Arg_1_Alias";
    /** <code>companyiasincronizarpthisCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_COMPANYIASINCRONIZARPTHISCOMPANYIA = "Compañía";
    /** <code>companyiasincronizarpNombre</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_COMPANYIASINCRONIZARPNOMBRE = "p_Nombre";
    /** <code>companyiasincronizarpNombre</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_COMPANYIASINCRONIZARPNOMBRE = "Clas_1431889510400288Ser_4Arg_2_Alias";
    /** <code>companyiasincronizarpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_COMPANYIASINCRONIZARPNOMBRE = "Nombre";
    // Service (InsCompanyiaUsuario)
    /** <code>InsCompanyiaUsuario</code> service id. */
    public static final String SERV_ID_INSCOMPANYIAUSUARIO = "Clas_1431889510400288Ser_5_Alias";
    /** <code>InsCompanyiaUsuario</code> service name. */
    public static final String SERV_NAME_INSCOMPANYIAUSUARIO = "InsCompanyiaUsuario";
    /** <code>InsCompanyiaUsuario</code> service alias. */
    public static final String SERV_ALIAS_INSCOMPANYIAUSUARIO = "InsCompanyiaUsuario";
    /** Agents allowed to execute the service InsCompanyiaUsuario **/
    public static final String INSCOMPANYIAUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>companyiaInsCompanyiaUsuariopthisCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_INSCOMPANYIAUSUARIO_COMPANYIAINSCOMPANYIAUSUARIOPTHISCOMPANYIA = "p_thisCompanyia";
    /** <code>companyiaInsCompanyiaUsuariopthisCompanyia</code> inbound argument id. */
    public static final String ARG_ID_INSCOMPANYIAUSUARIO_COMPANYIAINSCOMPANYIAUSUARIOPTHISCOMPANYIA = "Clas_1431889510400288Ser_5Arg_1_Alias";
    /** <code>companyiaInsCompanyiaUsuariopthisCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCOMPANYIAUSUARIO_COMPANYIAINSCOMPANYIAUSUARIOPTHISCOMPANYIA = "Compañía anterior";
    /** <code>companyiaInsCompanyiaUsuariopevcUsuario</code> inbound argument name. */
    public static final String ARG_NAME_INSCOMPANYIAUSUARIO_COMPANYIAINSCOMPANYIAUSUARIOPEVCUSUARIO = "p_evcUsuario";
    /** <code>companyiaInsCompanyiaUsuariopevcUsuario</code> inbound argument id. */
    public static final String ARG_ID_INSCOMPANYIAUSUARIO_COMPANYIAINSCOMPANYIAUSUARIOPEVCUSUARIO = "Clas_1431889510400288Ser_5Arg_2_Alias";
    /** <code>companyiaInsCompanyiaUsuariopevcUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCOMPANYIAUSUARIO_COMPANYIAINSCOMPANYIAUSUARIOPEVCUSUARIO = "Atributos usuario";
    // Service (DelCompanyiaUsuario)
    /** <code>DelCompanyiaUsuario</code> service id. */
    public static final String SERV_ID_DELCOMPANYIAUSUARIO = "Clas_1431889510400288Ser_6_Alias";
    /** <code>DelCompanyiaUsuario</code> service name. */
    public static final String SERV_NAME_DELCOMPANYIAUSUARIO = "DelCompanyiaUsuario";
    /** <code>DelCompanyiaUsuario</code> service alias. */
    public static final String SERV_ALIAS_DELCOMPANYIAUSUARIO = "DelCompanyiaUsuario";
    /** Agents allowed to execute the service DelCompanyiaUsuario **/
    public static final String DELCOMPANYIAUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>companyiaDelCompanyiaUsuariopthisCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_DELCOMPANYIAUSUARIO_COMPANYIADELCOMPANYIAUSUARIOPTHISCOMPANYIA = "p_thisCompanyia";
    /** <code>companyiaDelCompanyiaUsuariopthisCompanyia</code> inbound argument id. */
    public static final String ARG_ID_DELCOMPANYIAUSUARIO_COMPANYIADELCOMPANYIAUSUARIOPTHISCOMPANYIA = "Clas_1431889510400288Ser_6Arg_1_Alias";
    /** <code>companyiaDelCompanyiaUsuariopthisCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCOMPANYIAUSUARIO_COMPANYIADELCOMPANYIAUSUARIOPTHISCOMPANYIA = "Compañía anterior";
    /** <code>companyiaDelCompanyiaUsuariopevcUsuario</code> inbound argument name. */
    public static final String ARG_NAME_DELCOMPANYIAUSUARIO_COMPANYIADELCOMPANYIAUSUARIOPEVCUSUARIO = "p_evcUsuario";
    /** <code>companyiaDelCompanyiaUsuariopevcUsuario</code> inbound argument id. */
    public static final String ARG_ID_DELCOMPANYIAUSUARIO_COMPANYIADELCOMPANYIAUSUARIOPEVCUSUARIO = "Clas_1431889510400288Ser_6Arg_2_Alias";
    /** <code>companyiaDelCompanyiaUsuariopevcUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCOMPANYIAUSUARIO_COMPANYIADELCOMPANYIAUSUARIOPEVCUSUARIO = "Atributos usuario";
    // Service (InsCompanyiaMPC)
    /** <code>InsCompanyiaMPC</code> service id. */
    public static final String SERV_ID_INSCOMPANYIAMPC = "Clas_1431889510400288Ser_7_Alias";
    /** <code>InsCompanyiaMPC</code> service name. */
    public static final String SERV_NAME_INSCOMPANYIAMPC = "InsCompanyiaMPC";
    /** <code>InsCompanyiaMPC</code> service alias. */
    public static final String SERV_ALIAS_INSCOMPANYIAMPC = "InsCompanyiaMPC";
    /** Agents allowed to execute the service InsCompanyiaMPC **/
    public static final String INSCOMPANYIAMPC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>companyiaInsCompanyiaMPCpthisCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_INSCOMPANYIAMPC_COMPANYIAINSCOMPANYIAMPCPTHISCOMPANYIA = "p_thisCompanyia";
    /** <code>companyiaInsCompanyiaMPCpthisCompanyia</code> inbound argument id. */
    public static final String ARG_ID_INSCOMPANYIAMPC_COMPANYIAINSCOMPANYIAMPCPTHISCOMPANYIA = "Clas_1431889510400288Ser_7Arg_1_Alias";
    /** <code>companyiaInsCompanyiaMPCpthisCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCOMPANYIAMPC_COMPANYIAINSCOMPANYIAMPCPTHISCOMPANYIA = "MP Anterior";
    /** <code>companyiaInsCompanyiaMPCpevcBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_INSCOMPANYIAMPC_COMPANYIAINSCOMPANYIAMPCPEVCBENEFICIARIOC = "p_evcBeneficiarioC";
    /** <code>companyiaInsCompanyiaMPCpevcBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_INSCOMPANYIAMPC_COMPANYIAINSCOMPANYIAMPCPEVCBENEFICIARIOC = "Clas_1431889510400288Ser_7Arg_2_Alias";
    /** <code>companyiaInsCompanyiaMPCpevcBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSCOMPANYIAMPC_COMPANYIAINSCOMPANYIAMPCPEVCBENEFICIARIOC = "Beneficiarios";
    // Service (DelCompanyiaMPC)
    /** <code>DelCompanyiaMPC</code> service id. */
    public static final String SERV_ID_DELCOMPANYIAMPC = "Clas_1431889510400288Ser_8_Alias";
    /** <code>DelCompanyiaMPC</code> service name. */
    public static final String SERV_NAME_DELCOMPANYIAMPC = "DelCompanyiaMPC";
    /** <code>DelCompanyiaMPC</code> service alias. */
    public static final String SERV_ALIAS_DELCOMPANYIAMPC = "DelCompanyiaMPC";
    /** Agents allowed to execute the service DelCompanyiaMPC **/
    public static final String DELCOMPANYIAMPC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>companyiaDelCompanyiaMPCpthisCompanyia</code> inbound argument name. */
    public static final String ARG_NAME_DELCOMPANYIAMPC_COMPANYIADELCOMPANYIAMPCPTHISCOMPANYIA = "p_thisCompanyia";
    /** <code>companyiaDelCompanyiaMPCpthisCompanyia</code> inbound argument id. */
    public static final String ARG_ID_DELCOMPANYIAMPC_COMPANYIADELCOMPANYIAMPCPTHISCOMPANYIA = "Clas_1431889510400288Ser_8Arg_1_Alias";
    /** <code>companyiaDelCompanyiaMPCpthisCompanyia</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCOMPANYIAMPC_COMPANYIADELCOMPANYIAMPCPTHISCOMPANYIA = "MP Anterior";
    /** <code>companyiaDelCompanyiaMPCpevcBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_DELCOMPANYIAMPC_COMPANYIADELCOMPANYIAMPCPEVCBENEFICIARIOC = "p_evcBeneficiarioC";
    /** <code>companyiaDelCompanyiaMPCpevcBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_DELCOMPANYIAMPC_COMPANYIADELCOMPANYIAMPCPEVCBENEFICIARIOC = "Clas_1431889510400288Ser_8Arg_2_Alias";
    /** <code>companyiaDelCompanyiaMPCpevcBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELCOMPANYIAMPC_COMPANYIADELCOMPANYIAMPCPEVCBENEFICIARIOC = "Beneficiarios";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_COMPANYIANOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_COMPANYIAESDEMP.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_COMPANYIACODIGO.toUpperCase(), COMPANYIACODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_COMPANYIANOMBRE.toUpperCase(), COMPANYIANOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_COMPANYIAESDEMP.toUpperCase(), COMPANYIAESDEMP_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Companyia', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Companyia', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_COMPANYIACODIGO);
        }
        // Facet 'Companyia' (This facet)
        if (CompanyiaConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_COMPANYIACODIGO);
        }
        return returnList;
    }
}
