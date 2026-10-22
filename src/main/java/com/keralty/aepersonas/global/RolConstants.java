package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Rol</code> model class.
 */
public final class RolConstants {

    private RolConstants() {

    }

    // Class
    /** <code>Rol</code> class id. */
    public static final String CLASS_ID = "Clas_1431700897792807_Alias";
    /** <code>Rol</code> class name. */
    public static final String CLASS_NAME = "Rol";
    /** <code>Rol</code> class alias. */
    public static final String CLASS_ALIAS = "Rol";
    /** <code>Rol</code> class table name. */
    public static final String TBL_NAME = "Rol";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "rolIdentificador,rolNombre";

    public static final String DSICROL = "IC_Rol";
    

    // Attribute (rolIdentificador)
    /** <code>rolIdentificador</code> attribute id. */
    public static final String ATTR_ID_ROLIDENTIFICADOR = "Clas_1431700897792807Atr_1_Alias";
    /** <code>rolIdentificador</code> attribute name. */
    public static final String ATTR_NAME_ROLIDENTIFICADOR = "rolIdentificador";
    /** <code>rolIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_ROLIDENTIFICADOR = "Identificador";

    /** <code>rolIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_ROLIDENTIFICADOR = "";
    /** Agents allowed to view the attribute rolIdentificador **/
    public static final String ROLIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,AreaMedica,Gestor,MesaDeApoyo";
    // Attribute (rolNombre)
    /** <code>rolNombre</code> attribute id. */
    public static final String ATTR_ID_ROLNOMBRE = "Clas_1431700897792807Atr_2_Alias";
    /** <code>rolNombre</code> attribute name. */
    public static final String ATTR_NAME_ROLNOMBRE = "rolNombre";
    /** <code>rolNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_ROLNOMBRE = "Nombre";

    /** <code>rolNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_ROLNOMBRE = "";
    /** Agents allowed to view the attribute rolNombre **/
    public static final String ROLNOMBRE_AGENTS = "Admin,SuperAdmin,AreaMedica,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_ROLIDENTIFICADOR = "Identificador";    
    /** <code>rolIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_ROLIDENTIFICADOR = "rolIdentificador";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_ROLNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_ROLNOMBRELENGTH = 50;
    /** <code>rolNombre</code> attribute field name. */
    public static final String ATTR_FIELD_ROLNOMBRE = "rolNombre";


    // Compound role (Agentes)
    /** <code>Agentes</code> role id. */
    public static final String ROLE_ID_AGENTES = "Agr_1431700897792546_Alias";
    /** <code>Agentes</code> role name. */
    public static final String ROLE_NAME_AGENTES = "agentes";
    /** <code>Rol</code> role alias. */
    public static final String ROLE_ALIAS_AGENTES = "Agentes";


    /** <code>Agentes</code> inverse role name. */
    public static final String ROLE_INVNAME_AGENTES = FuncionarioConstants.ROLE_NAME_ROL;
    /** <code>Agentes</code> role facet sequence. */
    public static final String PATH_FACETS_AGENTES = "";
    /** <code>Agentes</code> role target class. */
    public static final String ROLE_TARGET_AGENTES = FuncionarioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Agentes **/
    public static final String AGENTES_AGENTS = "Admin,SuperAdmin,AreaMedica,Gestor,MesaDeApoyo";
    // Compound role (Dominios)
    /** <code>Dominios</code> role id. */
    public static final String ROLE_ID_DOMINIOS = "Agr_1431701946368346_Alias";
    /** <code>Dominios</code> role name. */
    public static final String ROLE_NAME_DOMINIOS = "dominios";
    /** <code>Roles</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOS = "Dominios";


    /** <code>Dominios</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOS = DominioConstants.ROLE_NAME_ROLES;
    /** <code>Dominios</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOS = "";
    /** <code>Dominios</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOS = DominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Dominios **/
    public static final String DOMINIOS_AGENTS = "Admin,SuperAdmin,AreaMedica,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431700897792807Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear rol";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>rolcrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ROLCREARPATRNOMBRE = "p_atrNombre";
    /** <code>rolcrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ROLCREARPATRNOMBRE = "Clas_1431700897792807Ser_1Arg_2_Alias";
    /** <code>rolcrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ROLCREARPATRNOMBRE = "Nombre";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431700897792807Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar rol";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431700897792807Pre_1_MsgError";
    // Inbound arguments
    /** <code>roleliminarpthisRol</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ROLELIMINARPTHISROL = "p_thisRol";
    /** <code>roleliminarpthisRol</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ROLELIMINARPTHISROL = "Clas_1431700897792807Ser_2Arg_1_Alias";
    /** <code>roleliminarpthisRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ROLELIMINARPTHISROL = "Rol";
    // Service (InsRolDominio)
    /** <code>InsRolDominio</code> service id. */
    public static final String SERV_ID_INSROLDOMINIO = "Clas_1431700897792807Ser_4_Alias";
    /** <code>InsRolDominio</code> service name. */
    public static final String SERV_NAME_INSROLDOMINIO = "InsRolDominio";
    /** <code>InsRolDominio</code> service alias. */
    public static final String SERV_ALIAS_INSROLDOMINIO = "InsRolDominio";
    /** Agents allowed to execute the service InsRolDominio **/
    public static final String INSROLDOMINIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>rolInsRolDominiopthisRol</code> inbound argument name. */
    public static final String ARG_NAME_INSROLDOMINIO_ROLINSROLDOMINIOPTHISROL = "p_thisRol";
    /** <code>rolInsRolDominiopthisRol</code> inbound argument id. */
    public static final String ARG_ID_INSROLDOMINIO_ROLINSROLDOMINIOPTHISROL = "Clas_1431700897792807Ser_4Arg_1_Alias";
    /** <code>rolInsRolDominiopthisRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSROLDOMINIO_ROLINSROLDOMINIOPTHISROL = "Roles";
    /** <code>rolInsRolDominiopevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSROLDOMINIO_ROLINSROLDOMINIOPEVCDOMINIO = "p_evcDominio";
    /** <code>rolInsRolDominiopevcDominio</code> inbound argument id. */
    public static final String ARG_ID_INSROLDOMINIO_ROLINSROLDOMINIOPEVCDOMINIO = "Clas_1431700897792807Ser_4Arg_2_Alias";
    /** <code>rolInsRolDominiopevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSROLDOMINIO_ROLINSROLDOMINIOPEVCDOMINIO = "Dominios";
    // Service (DelRollDominio)
    /** <code>DelRollDominio</code> service id. */
    public static final String SERV_ID_DELROLLDOMINIO = "Clas_1431700897792807Ser_5_Alias";
    /** <code>DelRollDominio</code> service name. */
    public static final String SERV_NAME_DELROLLDOMINIO = "DelRollDominio";
    /** <code>DelRollDominio</code> service alias. */
    public static final String SERV_ALIAS_DELROLLDOMINIO = "DelRollDominio";
    /** Agents allowed to execute the service DelRollDominio **/
    public static final String DELROLLDOMINIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>rolDelRollDominiopthisRol</code> inbound argument name. */
    public static final String ARG_NAME_DELROLLDOMINIO_ROLDELROLLDOMINIOPTHISROL = "p_thisRol";
    /** <code>rolDelRollDominiopthisRol</code> inbound argument id. */
    public static final String ARG_ID_DELROLLDOMINIO_ROLDELROLLDOMINIOPTHISROL = "Clas_1431700897792807Ser_5Arg_1_Alias";
    /** <code>rolDelRollDominiopthisRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELROLLDOMINIO_ROLDELROLLDOMINIOPTHISROL = "Roles";
    /** <code>rolDelRollDominiopevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELROLLDOMINIO_ROLDELROLLDOMINIOPEVCDOMINIO = "p_evcDominio";
    /** <code>rolDelRollDominiopevcDominio</code> inbound argument id. */
    public static final String ARG_ID_DELROLLDOMINIO_ROLDELROLLDOMINIOPEVCDOMINIO = "Clas_1431700897792807Ser_5Arg_2_Alias";
    /** <code>rolDelRollDominiopevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELROLLDOMINIO_ROLDELROLLDOMINIOPEVCDOMINIO = "Dominios";
    // Service (CambRolAgente)
    /** <code>CambRolAgente</code> service id. */
    public static final String SERV_ID_CAMBROLAGENTE = "Clas_1431700897792807Ser_6_Alias";
    /** <code>CambRolAgente</code> service name. */
    public static final String SERV_NAME_CAMBROLAGENTE = "CambRolAgente";
    /** <code>CambRolAgente</code> service alias. */
    public static final String SERV_ALIAS_CAMBROLAGENTE = "CambRolAgente";
    /** Agents allowed to execute the service CambRolAgente **/
    public static final String CAMBROLAGENTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>rolCambRolAgentepthisRol</code> inbound argument name. */
    public static final String ARG_NAME_CAMBROLAGENTE_ROLCAMBROLAGENTEPTHISROL = "p_thisRol";
    /** <code>rolCambRolAgentepthisRol</code> inbound argument id. */
    public static final String ARG_ID_CAMBROLAGENTE_ROLCAMBROLAGENTEPTHISROL = "Clas_1431700897792807Ser_6Arg_1_Alias";
    /** <code>rolCambRolAgentepthisRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBROLAGENTE_ROLCAMBROLAGENTEPTHISROL = "Rol";
    /** <code>rolCambRolAgentepevcFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_CAMBROLAGENTE_ROLCAMBROLAGENTEPEVCFUNCIONARIO = "p_evcFuncionario";
    /** <code>rolCambRolAgentepevcFuncionario</code> inbound argument id. */
    public static final String ARG_ID_CAMBROLAGENTE_ROLCAMBROLAGENTEPEVCFUNCIONARIO = "Clas_1431700897792807Ser_6Arg_2_Alias";
    /** <code>rolCambRolAgentepevcFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBROLAGENTE_ROLCAMBROLAGENTEPEVCFUNCIONARIO = "Agentes";

    public static final String FILTER_NAME_IFROLPORNOMBRE = "iF_RolPorNombre";
    public static final String VAR_NAME_IFROLPORNOMBRE_VNOMBRE = "v_Nombre";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ROLNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ROLIDENTIFICADOR.toUpperCase(), ROLIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_ROLNOMBRE.toUpperCase(), ROLNOMBRE_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Rol', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Rol', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ROLIDENTIFICADOR);
        }
        // Facet 'Rol' (This facet)
        if (RolConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ROLIDENTIFICADOR);
        }
        return returnList;
    }
}
