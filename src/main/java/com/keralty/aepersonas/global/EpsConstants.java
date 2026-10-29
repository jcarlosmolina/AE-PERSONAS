package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Eps</code> model class.
 */
public final class EpsConstants {

    private EpsConstants() {

    }

    // Class
    /** <code>Eps</code> class id. */
    public static final String CLASS_ID = "Clas_1431942987776277_Alias";
    /** <code>Eps</code> class name. */
    public static final String CLASS_NAME = "Eps";
    /** <code>Eps</code> class alias. */
    public static final String CLASS_ALIAS = "EPS";
    /** <code>Eps</code> class table name. */
    public static final String TBL_NAME = "Eps";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "epsCodigo,epsDescripcion,epsEpsSanitas";

    public static final String DSICEPS = "IC_EPS";
    

    // Attribute (epsCodigo)
    /** <code>epsCodigo</code> attribute id. */
    public static final String ATTR_ID_EPSCODIGO = "Clas_1431942987776277Atr_1_Alias";
    /** <code>epsCodigo</code> attribute name. */
    public static final String ATTR_NAME_EPSCODIGO = "epsCodigo";
    /** <code>epsCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_EPSCODIGO = "Código";

    /** <code>epsCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_EPSCODIGO = "";
    /** Agents allowed to view the attribute epsCodigo **/
    public static final String EPSCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (epsDescripcion)
    /** <code>epsDescripcion</code> attribute id. */
    public static final String ATTR_ID_EPSDESCRIPCION = "Clas_1431942987776277Atr_2_Alias";
    /** <code>epsDescripcion</code> attribute name. */
    public static final String ATTR_NAME_EPSDESCRIPCION = "epsDescripcion";
    /** <code>epsDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_EPSDESCRIPCION = "Descripción";

    /** <code>epsDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_EPSDESCRIPCION = "";
    /** Agents allowed to view the attribute epsDescripcion **/
    public static final String EPSDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (epsEpsSanitas)
    /** <code>epsEpsSanitas</code> attribute id. */
    public static final String ATTR_ID_EPSEPSSANITAS = "Clas_1431942987776277Atr_3_Alias";
    /** <code>epsEpsSanitas</code> attribute name. */
    public static final String ATTR_NAME_EPSEPSSANITAS = "epsEpsSanitas";
    /** <code>epsEpsSanitas</code> attribute alias. */
    public static final String ATTR_ALIAS_EPSEPSSANITAS = "Es EPS Sanitas";

    /** <code>epsEpsSanitas</code> attribute facet sequence. */
    public static final String PATH_FACETS_EPSEPSSANITAS = "";
    /** Agents allowed to view the attribute epsEpsSanitas **/
    public static final String EPSEPSSANITAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_EPSCODIGO = "Codigo";    
    /** <code>epsCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_EPSCODIGO = "epsCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_EPSDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_EPSDESCRIPCIONLENGTH = 150;
    /** <code>epsDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_EPSDESCRIPCION = "epsDescripcion";
    // Field (EpsSanitas)
    /** <code>EpsSanitas</code> field name. */
    public static final String FLD_EPSEPSSANITAS = "EpsSanitas";    
    /** <code>epsEpsSanitas</code> attribute field name. */
    public static final String ATTR_FIELD_EPSEPSSANITAS = "epsEpsSanitas";


    // Compound role (AtributosUsuario)
    /** <code>AtributosUsuario</code> role id. */
    public static final String ROLE_ID_ATRIBUTOSUSUARIO = "Agr_1432634130432846_Alias";
    /** <code>AtributosUsuario</code> role name. */
    public static final String ROLE_NAME_ATRIBUTOSUSUARIO = "atributosUsuario";
    /** <code>Eps</code> role alias. */
    public static final String ROLE_ALIAS_ATRIBUTOSUSUARIO = "Atributos usuario";


    /** <code>AtributosUsuario</code> inverse role name. */
    public static final String ROLE_INVNAME_ATRIBUTOSUSUARIO = UsuarioConstants.ROLE_NAME_EPS;
    /** <code>AtributosUsuario</code> role facet sequence. */
    public static final String PATH_FACETS_ATRIBUTOSUSUARIO = "";
    /** <code>AtributosUsuario</code> role target class. */
    public static final String ROLE_TARGET_ATRIBUTOSUSUARIO = UsuarioConstants.CLASS_NAME;
    /** Agents allowed to navigate through AtributosUsuario **/
    public static final String ATRIBUTOSUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (BeneficiariosC)
    /** <code>BeneficiariosC</code> role id. */
    public static final String ROLE_ID_BENEFICIARIOSC = "Agr_1473094090752762_Alias";
    /** <code>BeneficiariosC</code> role name. */
    public static final String ROLE_NAME_BENEFICIARIOSC = "beneficiariosC";
    /** <code>EPSC</code> role alias. */
    public static final String ROLE_ALIAS_BENEFICIARIOSC = "Beneficiarios";


    /** <code>BeneficiariosC</code> inverse role name. */
    public static final String ROLE_INVNAME_BENEFICIARIOSC = BeneficiarioCConstants.ROLE_NAME_EPSC;
    /** <code>BeneficiariosC</code> role facet sequence. */
    public static final String PATH_FACETS_BENEFICIARIOSC = "";
    /** <code>BeneficiariosC</code> role target class. */
    public static final String ROLE_TARGET_BENEFICIARIOSC = BeneficiarioCConstants.CLASS_NAME;
    /** Agents allowed to navigate through BeneficiariosC **/
    public static final String BENEFICIARIOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431942987776277Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear EPS";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>epscrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_EPSCREARPATRCODIGO = "p_atrCodigo";
    /** <code>epscrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_EPSCREARPATRCODIGO = "Clas_1431942987776277Ser_1Arg_1_Alias";
    /** <code>epscrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_EPSCREARPATRCODIGO = "Código";
    /** <code>epscrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_EPSCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>epscrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_EPSCREARPATRDESCRIPCION = "Clas_1431942987776277Ser_1Arg_2_Alias";
    /** <code>epscrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_EPSCREARPATRDESCRIPCION = "Descripción";
    /** <code>epscrearpatrEpsSanitas</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_EPSCREARPATREPSSANITAS = "p_atrEpsSanitas";
    /** <code>epscrearpatrEpsSanitas</code> inbound argument id. */
    public static final String ARG_ID_CREAR_EPSCREARPATREPSSANITAS = "Clas_1431942987776277Ser_1Arg_3_Alias";
    /** <code>epscrearpatrEpsSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_EPSCREARPATREPSSANITAS = "Es EPS Sanitas";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431942987776277Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar EPS";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>epseliminarpthisEPS</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_EPSELIMINARPTHISEPS = "p_thisEPS";
    /** <code>epseliminarpthisEPS</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_EPSELIMINARPTHISEPS = "Clas_1431942987776277Ser_2Arg_1_Alias";
    /** <code>epseliminarpthisEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_EPSELIMINARPTHISEPS = "EPS";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431942987776277Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar EPS";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>epsmodificarpthisEPS</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_EPSMODIFICARPTHISEPS = "p_thisEPS";
    /** <code>epsmodificarpthisEPS</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_EPSMODIFICARPTHISEPS = "Clas_1431942987776277Ser_3Arg_1_Alias";
    /** <code>epsmodificarpthisEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_EPSMODIFICARPTHISEPS = "EPS";
    /** <code>epsmodificarpEPSSanitas</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_EPSMODIFICARPEPSSANITAS = "p_EPSSanitas";
    /** <code>epsmodificarpEPSSanitas</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_EPSMODIFICARPEPSSANITAS = "Clas_1431942987776277Ser_3Arg_2_Alias";
    /** <code>epsmodificarpEPSSanitas</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_EPSMODIFICARPEPSSANITAS = "Es EPS Sanitas";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431942987776277Ser_4_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>epssincronizarpthisEPS</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_EPSSINCRONIZARPTHISEPS = "p_thisEPS";
    /** <code>epssincronizarpthisEPS</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_EPSSINCRONIZARPTHISEPS = "Clas_1431942987776277Ser_4Arg_1_Alias";
    /** <code>epssincronizarpthisEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_EPSSINCRONIZARPTHISEPS = "EPS";
    /** <code>epssincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_EPSSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>epssincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_EPSSINCRONIZARPDESCRIPCION = "Clas_1431942987776277Ser_4Arg_2_Alias";
    /** <code>epssincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_EPSSINCRONIZARPDESCRIPCION = "Descripción";
    // Service (InsEPSUsuario)
    /** <code>InsEPSUsuario</code> service id. */
    public static final String SERV_ID_INSEPSUSUARIO = "Clas_1431942987776277Ser_5_Alias";
    /** <code>InsEPSUsuario</code> service name. */
    public static final String SERV_NAME_INSEPSUSUARIO = "InsEPSUsuario";
    /** <code>InsEPSUsuario</code> service alias. */
    public static final String SERV_ALIAS_INSEPSUSUARIO = "InsEPSUsuario";
    /** Agents allowed to execute the service InsEPSUsuario **/
    public static final String INSEPSUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>epsInsEPSUsuariopthisEPS</code> inbound argument name. */
    public static final String ARG_NAME_INSEPSUSUARIO_EPSINSEPSUSUARIOPTHISEPS = "p_thisEPS";
    /** <code>epsInsEPSUsuariopthisEPS</code> inbound argument id. */
    public static final String ARG_ID_INSEPSUSUARIO_EPSINSEPSUSUARIOPTHISEPS = "Clas_1431942987776277Ser_5Arg_1_Alias";
    /** <code>epsInsEPSUsuariopthisEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSEPSUSUARIO_EPSINSEPSUSUARIOPTHISEPS = "Eps";
    /** <code>epsInsEPSUsuariopevcUsuario</code> inbound argument name. */
    public static final String ARG_NAME_INSEPSUSUARIO_EPSINSEPSUSUARIOPEVCUSUARIO = "p_evcUsuario";
    /** <code>epsInsEPSUsuariopevcUsuario</code> inbound argument id. */
    public static final String ARG_ID_INSEPSUSUARIO_EPSINSEPSUSUARIOPEVCUSUARIO = "Clas_1431942987776277Ser_5Arg_2_Alias";
    /** <code>epsInsEPSUsuariopevcUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSEPSUSUARIO_EPSINSEPSUSUARIOPEVCUSUARIO = "Atributos usuario";
    // Service (DelEPSUsuario)
    /** <code>DelEPSUsuario</code> service id. */
    public static final String SERV_ID_DELEPSUSUARIO = "Clas_1431942987776277Ser_7_Alias";
    /** <code>DelEPSUsuario</code> service name. */
    public static final String SERV_NAME_DELEPSUSUARIO = "DelEPSUsuario";
    /** <code>DelEPSUsuario</code> service alias. */
    public static final String SERV_ALIAS_DELEPSUSUARIO = "DelEPSUsuario";
    /** Agents allowed to execute the service DelEPSUsuario **/
    public static final String DELEPSUSUARIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>epsDelEPSUsuariopthisEPS</code> inbound argument name. */
    public static final String ARG_NAME_DELEPSUSUARIO_EPSDELEPSUSUARIOPTHISEPS = "p_thisEPS";
    /** <code>epsDelEPSUsuariopthisEPS</code> inbound argument id. */
    public static final String ARG_ID_DELEPSUSUARIO_EPSDELEPSUSUARIOPTHISEPS = "Clas_1431942987776277Ser_7Arg_1_Alias";
    /** <code>epsDelEPSUsuariopthisEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELEPSUSUARIO_EPSDELEPSUSUARIOPTHISEPS = "Eps";
    /** <code>epsDelEPSUsuariopevcUsuario</code> inbound argument name. */
    public static final String ARG_NAME_DELEPSUSUARIO_EPSDELEPSUSUARIOPEVCUSUARIO = "p_evcUsuario";
    /** <code>epsDelEPSUsuariopevcUsuario</code> inbound argument id. */
    public static final String ARG_ID_DELEPSUSUARIO_EPSDELEPSUSUARIOPEVCUSUARIO = "Clas_1431942987776277Ser_7Arg_2_Alias";
    /** <code>epsDelEPSUsuariopevcUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELEPSUSUARIO_EPSDELEPSUSUARIOPEVCUSUARIO = "Atributos usuario";
    // Service (InsEPSC)
    /** <code>InsEPSC</code> service id. */
    public static final String SERV_ID_INSEPSC = "Clas_1431942987776277Ser_8_Alias";
    /** <code>InsEPSC</code> service name. */
    public static final String SERV_NAME_INSEPSC = "InsEPSC";
    /** <code>InsEPSC</code> service alias. */
    public static final String SERV_ALIAS_INSEPSC = "InsEPSC";
    /** Agents allowed to execute the service InsEPSC **/
    public static final String INSEPSC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>epsInsEPSCpthisEPS</code> inbound argument name. */
    public static final String ARG_NAME_INSEPSC_EPSINSEPSCPTHISEPS = "p_thisEPS";
    /** <code>epsInsEPSCpthisEPS</code> inbound argument id. */
    public static final String ARG_ID_INSEPSC_EPSINSEPSCPTHISEPS = "Clas_1431942987776277Ser_8Arg_1_Alias";
    /** <code>epsInsEPSCpthisEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSEPSC_EPSINSEPSCPTHISEPS = "EPS";
    /** <code>epsInsEPSCpevcBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_INSEPSC_EPSINSEPSCPEVCBENEFICIARIOC = "p_evcBeneficiarioC";
    /** <code>epsInsEPSCpevcBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_INSEPSC_EPSINSEPSCPEVCBENEFICIARIOC = "Clas_1431942987776277Ser_8Arg_2_Alias";
    /** <code>epsInsEPSCpevcBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSEPSC_EPSINSEPSCPEVCBENEFICIARIOC = "Beneficiarios";
    // Service (DelEPSC)
    /** <code>DelEPSC</code> service id. */
    public static final String SERV_ID_DELEPSC = "Clas_1431942987776277Ser_9_Alias";
    /** <code>DelEPSC</code> service name. */
    public static final String SERV_NAME_DELEPSC = "DelEPSC";
    /** <code>DelEPSC</code> service alias. */
    public static final String SERV_ALIAS_DELEPSC = "DelEPSC";
    /** Agents allowed to execute the service DelEPSC **/
    public static final String DELEPSC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>epsDelEPSCpthisEPS</code> inbound argument name. */
    public static final String ARG_NAME_DELEPSC_EPSDELEPSCPTHISEPS = "p_thisEPS";
    /** <code>epsDelEPSCpthisEPS</code> inbound argument id. */
    public static final String ARG_ID_DELEPSC_EPSDELEPSCPTHISEPS = "Clas_1431942987776277Ser_9Arg_1_Alias";
    /** <code>epsDelEPSCpthisEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELEPSC_EPSDELEPSCPTHISEPS = "EPS";
    /** <code>epsDelEPSCpevcBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_DELEPSC_EPSDELEPSCPEVCBENEFICIARIOC = "p_evcBeneficiarioC";
    /** <code>epsDelEPSCpevcBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_DELEPSC_EPSDELEPSCPEVCBENEFICIARIOC = "Clas_1431942987776277Ser_9Arg_2_Alias";
    /** <code>epsDelEPSCpevcBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELEPSC_EPSDELEPSCPEVCBENEFICIARIOC = "Beneficiarios";

    public static final String FILTER_NAME_IFEPSSANITAS = "iF_EPSSanitas";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_EPSDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_EPSEPSSANITAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_EPSCODIGO.toUpperCase(), EPSCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_EPSDESCRIPCION.toUpperCase(), EPSDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_EPSEPSSANITAS.toUpperCase(), EPSEPSSANITAS_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Eps', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Eps', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_EPSCODIGO);
        }
        // Facet 'Eps' (This facet)
        if (EpsConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_EPSCODIGO);
        }
        return returnList;
    }
}
