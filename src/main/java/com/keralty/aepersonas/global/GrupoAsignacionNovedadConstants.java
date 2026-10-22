package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>GrupoAsignacionNovedad</code> model class.
 */
public final class GrupoAsignacionNovedadConstants {

    private GrupoAsignacionNovedadConstants() {

    }

    // Class
    /** <code>GrupoAsignacionNovedad</code> class id. */
    public static final String CLASS_ID = "Clas_1586852003840652_Alias";
    /** <code>GrupoAsignacionNovedad</code> class name. */
    public static final String CLASS_NAME = "GrupoAsignacionNovedad";
    /** <code>GrupoAsignacionNovedad</code> class alias. */
    public static final String CLASS_ALIAS = "Grupo Asignación Novedades";
    /** <code>GrupoAsignacionNovedad</code> class table name. */
    public static final String TBL_NAME = "GrupoAsignacionNovedad";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "grupoAsignacionNovedadId,dominioNumero,causalidCausal,grupoAsignacionGrupoUsuariosId";

    public static final String DSDSGRUPOASIGNACIONNOVEDAD = "DS_GrupoAsignacionNovedad";
    

    // Attribute (grupoAsignacionNovedadId)
    /** <code>grupoAsignacionNovedadId</code> attribute id. */
    public static final String ATTR_ID_GRUPOASIGNACIONNOVEDADID = "Clas_1586852003840652Atr_1_Alias";
    /** <code>grupoAsignacionNovedadId</code> attribute name. */
    public static final String ATTR_NAME_GRUPOASIGNACIONNOVEDADID = "grupoAsignacionNovedadId";
    /** <code>grupoAsignacionNovedadId</code> attribute alias. */
    public static final String ATTR_ALIAS_GRUPOASIGNACIONNOVEDADID = "Id.";

    /** <code>grupoAsignacionNovedadId</code> attribute facet sequence. */
    public static final String PATH_FACETS_GRUPOASIGNACIONNOVEDADID = "";
    /** Agents allowed to view the attribute grupoAsignacionNovedadId **/
    public static final String GRUPOASIGNACIONNOVEDADID_AGENTS = "Admin,SuperAdmin,Asesor,Gestor";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_GRUPOASIGNACIONNOVEDADID = "Id";    
    /** <code>grupoAsignacionNovedadId</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASIGNACIONNOVEDADID = "grupoAsignacionNovedadId";
    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_DOMINIONUMERO = "Numero";    
    /** <code>Dominio.dominioNumero</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIO_DOMINIONUMERO = "dominioNumero";
    // Field (id_Causal)
    /** <code>id_Causal</code> field name. */
    public static final String FLD_CAUSALIDCAUSAL = "id_Causal";    
    /** <code>Causal.causalidCausal</code> attribute field name. */
    public static final String ATTR_FIELD_CAUSAL_CAUSALIDCAUSAL = "causalidCausal";
    // Field (GrupoUsuarios_Id)
    /** <code>GrupoUsuarios_Id</code> field name. */
    public static final String FLD_GRUPOASIGNACIONGRUPOUSUARIOSID = "GrupoUsuarios_Id";    
    /** <code>GrupoUsuarios.grupoAsignacionId</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOUSUARIOS_GRUPOASIGNACIONID = "grupoAsignacionGrupoUsuariosId";

    // Component role (Dominio)
    /** <code>Dominio</code> role id. */
    public static final String ROLE_ID_DOMINIO = "Agr_1586852134912896_Alias";
    /** <code>Dominio</code> role name. */
    public static final String ROLE_NAME_DOMINIO = "dominio";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIO = "Dominio";

    /** <code>Dominio</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIO = DominioConstants.ROLE_NAME_GRUPOASIGNACIONNOVEDAD;
    /** <code>Dominio</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIO = "";
    /** <code>Dominio</code> role target class. */
    public static final String ROLE_TARGET_DOMINIO = DominioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Dominio **/
    public static final String DOMINIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor";
    // Component role (Causal)
    /** <code>Causal</code> role id. */
    public static final String ROLE_ID_CAUSAL = "Agr_1586852134912336_Alias";
    /** <code>Causal</code> role name. */
    public static final String ROLE_NAME_CAUSAL = "causal";
    /** <code>Causal</code> role alias. */
    public static final String ROLE_ALIAS_CAUSAL = "Causal";

    /** <code>Causal</code> inverse role name. */
    public static final String ROLE_INVNAME_CAUSAL = CausalConstants.ROLE_NAME_GRUPOASIGNACIONNOVEDAD;
    /** <code>Causal</code> role facet sequence. */
    public static final String PATH_FACETS_CAUSAL = "";
    /** <code>Causal</code> role target class. */
    public static final String ROLE_TARGET_CAUSAL = CausalConstants.CLASS_NAME;

    /** Agents allowed to navigate through Causal **/
    public static final String CAUSAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor";
    // Component role (GrupoUsuarios)
    /** <code>GrupoUsuarios</code> role id. */
    public static final String ROLE_ID_GRUPOUSUARIOS = "Agr_1586852134912600_Alias";
    /** <code>GrupoUsuarios</code> role name. */
    public static final String ROLE_NAME_GRUPOUSUARIOS = "grupoUsuarios";
    /** <code>GrupoUsuarios</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOUSUARIOS = "Grupo Usuarios";

    /** <code>GrupoUsuarios</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOUSUARIOS = GrupoAsignacionConstants.ROLE_NAME_DOMINIOCAUSALUSUARIO;
    /** <code>GrupoUsuarios</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOUSUARIOS = "";
    /** <code>GrupoUsuarios</code> role target class. */
    public static final String ROLE_TARGET_GRUPOUSUARIOS = GrupoAsignacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through GrupoUsuarios **/
    public static final String GRUPOUSUARIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1586852003840652Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionNovedadcrearpagrCausal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASIGNACIONNOVEDADCREARPAGRCAUSAL = "p_agrCausal";
    /** <code>grupoAsignacionNovedadcrearpagrCausal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASIGNACIONNOVEDADCREARPAGRCAUSAL = "Clas_1586852003840652Ser_1Arg_3_Alias";
    /** <code>grupoAsignacionNovedadcrearpagrCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASIGNACIONNOVEDADCREARPAGRCAUSAL = "Causal";
    /** <code>grupoAsignacionNovedadcrearpagrGrupoUsuarios</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASIGNACIONNOVEDADCREARPAGRGRUPOUSUARIOS = "p_agrGrupoUsuarios";
    /** <code>grupoAsignacionNovedadcrearpagrGrupoUsuarios</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASIGNACIONNOVEDADCREARPAGRGRUPOUSUARIOS = "Clas_1586852003840652Ser_1Arg_4_Alias";
    /** <code>grupoAsignacionNovedadcrearpagrGrupoUsuarios</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASIGNACIONNOVEDADCREARPAGRGRUPOUSUARIOS = "Grupo Usuarios";
    /** <code>grupoAsignacionNovedadcrearpagrDominio</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_GRUPOASIGNACIONNOVEDADCREARPAGRDOMINIO = "p_agrDominio";
    /** <code>grupoAsignacionNovedadcrearpagrDominio</code> inbound argument id. */
    public static final String ARG_ID_CREAR_GRUPOASIGNACIONNOVEDADCREARPAGRDOMINIO = "Clas_1586852003840652Ser_1Arg_7_Alias";
    /** <code>grupoAsignacionNovedadcrearpagrDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_GRUPOASIGNACIONNOVEDADCREARPAGRDOMINIO = "Dominio";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1586852003840652Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>grupoAsignacionNovedadeliminarpthisGrupoAsignacionNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_GRUPOASIGNACIONNOVEDADELIMINARPTHISGRUPOASIGNACIONNOVEDAD = "p_thisGrupoAsignacionNovedad";
    /** <code>grupoAsignacionNovedadeliminarpthisGrupoAsignacionNovedad</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_GRUPOASIGNACIONNOVEDADELIMINARPTHISGRUPOASIGNACIONNOVEDAD = "Clas_1586852003840652Ser_2Arg_1_Alias";
    /** <code>grupoAsignacionNovedadeliminarpthisGrupoAsignacionNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_GRUPOASIGNACIONNOVEDADELIMINARPTHISGRUPOASIGNACIONNOVEDAD = "Grupo Asignación Novedades";
    // Service (InsGrupoUsuarios)
    /** <code>InsGrupoUsuarios</code> service id. */
    public static final String SERV_ID_INSGRUPOUSUARIOS = "Clas_1586852003840652Ser_4_Alias";
    /** <code>InsGrupoUsuarios</code> service name. */
    public static final String SERV_NAME_INSGRUPOUSUARIOS = "InsGrupoUsuarios";
    /** <code>InsGrupoUsuarios</code> service alias. */
    public static final String SERV_ALIAS_INSGRUPOUSUARIOS = "InsGrupoUsuarios";
    /** Agents allowed to execute the service InsGrupoUsuarios **/
    public static final String INSGRUPOUSUARIOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionNovedadInsGrupoUsuariospthisGrupoAsignacionNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADINSGRUPOUSUARIOSPTHISGRUPOASIGNACIONNOVEDAD = "p_thisGrupoAsignacionNovedad";
    /** <code>grupoAsignacionNovedadInsGrupoUsuariospthisGrupoAsignacionNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADINSGRUPOUSUARIOSPTHISGRUPOASIGNACIONNOVEDAD = "Clas_1586852003840652Ser_4Arg_1_Alias";
    /** <code>grupoAsignacionNovedadInsGrupoUsuariospthisGrupoAsignacionNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADINSGRUPOUSUARIOSPTHISGRUPOASIGNACIONNOVEDAD = "DominioCausalUsuario";
    /** <code>grupoAsignacionNovedadInsGrupoUsuariospevcGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADINSGRUPOUSUARIOSPEVCGRUPOASIGNACION = "p_evcGrupoAsignacion";
    /** <code>grupoAsignacionNovedadInsGrupoUsuariospevcGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADINSGRUPOUSUARIOSPEVCGRUPOASIGNACION = "Clas_1586852003840652Ser_4Arg_2_Alias";
    /** <code>grupoAsignacionNovedadInsGrupoUsuariospevcGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADINSGRUPOUSUARIOSPEVCGRUPOASIGNACION = "Grupo Usuarios";
    // Service (DelGrupoUsuarios)
    /** <code>DelGrupoUsuarios</code> service id. */
    public static final String SERV_ID_DELGRUPOUSUARIOS = "Clas_1586852003840652Ser_5_Alias";
    /** <code>DelGrupoUsuarios</code> service name. */
    public static final String SERV_NAME_DELGRUPOUSUARIOS = "DelGrupoUsuarios";
    /** <code>DelGrupoUsuarios</code> service alias. */
    public static final String SERV_ALIAS_DELGRUPOUSUARIOS = "DelGrupoUsuarios";
    /** Agents allowed to execute the service DelGrupoUsuarios **/
    public static final String DELGRUPOUSUARIOS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>grupoAsignacionNovedadDelGrupoUsuariospthisGrupoAsignacionNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADDELGRUPOUSUARIOSPTHISGRUPOASIGNACIONNOVEDAD = "p_thisGrupoAsignacionNovedad";
    /** <code>grupoAsignacionNovedadDelGrupoUsuariospthisGrupoAsignacionNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADDELGRUPOUSUARIOSPTHISGRUPOASIGNACIONNOVEDAD = "Clas_1586852003840652Ser_5Arg_1_Alias";
    /** <code>grupoAsignacionNovedadDelGrupoUsuariospthisGrupoAsignacionNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADDELGRUPOUSUARIOSPTHISGRUPOASIGNACIONNOVEDAD = "DominioCausalUsuario";
    /** <code>grupoAsignacionNovedadDelGrupoUsuariospevcGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADDELGRUPOUSUARIOSPEVCGRUPOASIGNACION = "p_evcGrupoAsignacion";
    /** <code>grupoAsignacionNovedadDelGrupoUsuariospevcGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADDELGRUPOUSUARIOSPEVCGRUPOASIGNACION = "Clas_1586852003840652Ser_5Arg_2_Alias";
    /** <code>grupoAsignacionNovedadDelGrupoUsuariospevcGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOUSUARIOS_GRUPOASIGNACIONNOVEDADDELGRUPOUSUARIOSPEVCGRUPOASIGNACION = "Grupo Usuarios";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1586852003840652Ser_8_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TCREAR</code> precondition 0 id. */
    public static final String PRE_ID_TCREAR_0 = "Clas_1586852003840652Pre_1_MsgError";
    /** <code>TCREAR</code> precondition 1 id. */
    public static final String PRE_ID_TCREAR_1 = "Clas_1586852003840652Pre_2_MsgError";
    // Inbound arguments
    /** <code>grupoAsignacionNovedadTCREARptpagrDominio</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTPAGRDOMINIO = "pt_p_agrDominio";
    /** <code>grupoAsignacionNovedadTCREARptpagrDominio</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTPAGRDOMINIO = "Clas_1586852003840652Ser_8Arg_3_Alias";
    /** <code>grupoAsignacionNovedadTCREARptpagrDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTPAGRDOMINIO = "Dominio";
    /** <code>grupoAsignacionNovedadTCREARptpagrCausal</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTPAGRCAUSAL = "pt_p_agrCausal";
    /** <code>grupoAsignacionNovedadTCREARptpagrCausal</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTPAGRCAUSAL = "Clas_1586852003840652Ser_8Arg_4_Alias";
    /** <code>grupoAsignacionNovedadTCREARptpagrCausal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTPAGRCAUSAL = "Causal";
    /** <code>grupoAsignacionNovedadTCREARptpagrGrupoUsuarios</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTPAGRGRUPOUSUARIOS = "pt_p_agrGrupoUsuarios";
    /** <code>grupoAsignacionNovedadTCREARptpagrGrupoUsuarios</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTPAGRGRUPOUSUARIOS = "Clas_1586852003840652Ser_8Arg_5_Alias";
    /** <code>grupoAsignacionNovedadTCREARptpagrGrupoUsuarios</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTPAGRGRUPOUSUARIOS = "Grupo Usuarios";
    /** <code>grupoAsignacionNovedadTCREARptNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTNOVEDAD = "ptNovedad";
    /** <code>grupoAsignacionNovedadTCREARptNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTNOVEDAD = "Clas_1586852003840652Ser_8Arg_11_Alias";
    /** <code>grupoAsignacionNovedadTCREARptNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_GRUPOASIGNACIONNOVEDADTCREARPTNOVEDAD = "Novedad";
    // Service (TASGGRUPO)
    /** <code>TASGGRUPO</code> service id. */
    public static final String SERV_ID_TASGGRUPO = "Clas_1586852003840652Ser_9_Alias";
    /** <code>TASGGRUPO</code> service name. */
    public static final String SERV_NAME_TASGGRUPO = "TASGGRUPO";
    /** <code>TASGGRUPO</code> service alias. */
    public static final String SERV_ALIAS_TASGGRUPO = "Asignar Grupo";
    /** Agents allowed to execute the service TASGGRUPO **/
    public static final String TASGGRUPO_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TASGGRUPO</code> precondition 0 id. */
    public static final String PRE_ID_TASGGRUPO_0 = "Clas_1586852003840652Pre_3_MsgError";
    // Inbound arguments
    /** <code>grupoAsignacionNovedadTASGGRUPOpthisGrupoAsignacionNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TASGGRUPO_GRUPOASIGNACIONNOVEDADTASGGRUPOPTHISGRUPOASIGNACIONNOVEDAD = "p_thisGrupoAsignacionNovedad";
    /** <code>grupoAsignacionNovedadTASGGRUPOpthisGrupoAsignacionNovedad</code> inbound argument id. */
    public static final String ARG_ID_TASGGRUPO_GRUPOASIGNACIONNOVEDADTASGGRUPOPTHISGRUPOASIGNACIONNOVEDAD = "Clas_1586852003840652Ser_9Arg_2_Alias";
    /** <code>grupoAsignacionNovedadTASGGRUPOpthisGrupoAsignacionNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGGRUPO_GRUPOASIGNACIONNOVEDADTASGGRUPOPTHISGRUPOASIGNACIONNOVEDAD = "Grupo Asignación Novedades";
    /** <code>grupoAsignacionNovedadTASGGRUPOptGrupo</code> inbound argument name. */
    public static final String ARG_NAME_TASGGRUPO_GRUPOASIGNACIONNOVEDADTASGGRUPOPTGRUPO = "ptGrupo";
    /** <code>grupoAsignacionNovedadTASGGRUPOptGrupo</code> inbound argument id. */
    public static final String ARG_ID_TASGGRUPO_GRUPOASIGNACIONNOVEDADTASGGRUPOPTGRUPO = "Clas_1586852003840652Ser_9Arg_3_Alias";
    /** <code>grupoAsignacionNovedadTASGGRUPOptGrupo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TASGGRUPO_GRUPOASIGNACIONNOVEDADTASGGRUPOPTGRUPO = "Grupo";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_GRUPOASIGNACIONNOVEDADID.toUpperCase(), GRUPOASIGNACIONNOVEDADID_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_DOMINIO.toUpperCase(), DOMINIO_AGENTS);
        roleAgents.put(ROLE_NAME_CAUSAL.toUpperCase(), CAUSAL_AGENTS);
        roleAgents.put(ROLE_NAME_GRUPOUSUARIOS.toUpperCase(), GRUPOUSUARIOS_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'GrupoAsignacionNovedad', it returns the identification keys
     * - If className is a facet of the inheritance net of 'GrupoAsignacionNovedad', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_GRUPOASIGNACIONNOVEDADID);
        }
        // Facet 'GrupoAsignacionNovedad' (This facet)
        if (GrupoAsignacionNovedadConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_GRUPOASIGNACIONNOVEDADID);
        }
        return returnList;
    }
}
