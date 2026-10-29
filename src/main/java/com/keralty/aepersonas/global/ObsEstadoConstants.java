package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>ObsEstado</code> model class.
 */
public final class ObsEstadoConstants {

    private ObsEstadoConstants() {

    }

    // Class
    /** <code>ObsEstado</code> class id. */
    public static final String CLASS_ID = "Clas_1434446856192292_Alias";
    /** <code>ObsEstado</code> class name. */
    public static final String CLASS_NAME = "ObsEstado";
    /** <code>ObsEstado</code> class alias. */
    public static final String CLASS_ALIAS = "Observaciones";
    /** <code>ObsEstado</code> class table name. */
    public static final String TBL_NAME = "ObsEstado";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "documentoGIdentificador,obsEstadoId,funcionarioAgenteId,obsEstadoObservacions,obsEstadoEstadoAnterior,obsEstadoEstadoNuevo,obsEstadoFecha";

    public static final String DSDSOBSESTADOPIU = "DS_ObsEstado_PIU";
    public static final String DSDSOBSESTADONULL = "DS_ObsEstado_Null";
    

    // Attribute (obsEstadoId)
    /** <code>obsEstadoId</code> attribute id. */
    public static final String ATTR_ID_OBSESTADOID = "Clas_1434446856192292Atr_1_Alias";
    /** <code>obsEstadoId</code> attribute name. */
    public static final String ATTR_NAME_OBSESTADOID = "obsEstadoId";
    /** <code>obsEstadoId</code> attribute alias. */
    public static final String ATTR_ALIAS_OBSESTADOID = "Identificador";

    /** <code>obsEstadoId</code> attribute facet sequence. */
    public static final String PATH_FACETS_OBSESTADOID = "";
    /** Agents allowed to view the attribute obsEstadoId **/
    public static final String OBSESTADOID_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (obsEstadoObservacions)
    /** <code>obsEstadoObservacions</code> attribute id. */
    public static final String ATTR_ID_OBSESTADOOBSERVACIONS = "Clas_1434446856192292Atr_2_Alias";
    /** <code>obsEstadoObservacions</code> attribute name. */
    public static final String ATTR_NAME_OBSESTADOOBSERVACIONS = "obsEstadoObservacions";
    /** <code>obsEstadoObservacions</code> attribute alias. */
    public static final String ATTR_ALIAS_OBSESTADOOBSERVACIONS = "Observaciones";

    /** <code>obsEstadoObservacions</code> attribute facet sequence. */
    public static final String PATH_FACETS_OBSESTADOOBSERVACIONS = "";
    /** Agents allowed to view the attribute obsEstadoObservacions **/
    public static final String OBSESTADOOBSERVACIONS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (obsEstadoEstadoAnterior)
    /** <code>obsEstadoEstadoAnterior</code> attribute id. */
    public static final String ATTR_ID_OBSESTADOESTADOANTERIOR = "Clas_1434446856192292Atr_3_Alias";
    /** <code>obsEstadoEstadoAnterior</code> attribute name. */
    public static final String ATTR_NAME_OBSESTADOESTADOANTERIOR = "obsEstadoEstadoAnterior";
    /** <code>obsEstadoEstadoAnterior</code> attribute alias. */
    public static final String ATTR_ALIAS_OBSESTADOESTADOANTERIOR = "Estado anterior";

    /** <code>obsEstadoEstadoAnterior</code> attribute facet sequence. */
    public static final String PATH_FACETS_OBSESTADOESTADOANTERIOR = "";
    /** Agents allowed to view the attribute obsEstadoEstadoAnterior **/
    public static final String OBSESTADOESTADOANTERIOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (obsEstadoEstadoNuevo)
    /** <code>obsEstadoEstadoNuevo</code> attribute id. */
    public static final String ATTR_ID_OBSESTADOESTADONUEVO = "Clas_1434446856192292Atr_5_Alias";
    /** <code>obsEstadoEstadoNuevo</code> attribute name. */
    public static final String ATTR_NAME_OBSESTADOESTADONUEVO = "obsEstadoEstadoNuevo";
    /** <code>obsEstadoEstadoNuevo</code> attribute alias. */
    public static final String ATTR_ALIAS_OBSESTADOESTADONUEVO = "Estado nuevo";

    /** <code>obsEstadoEstadoNuevo</code> attribute facet sequence. */
    public static final String PATH_FACETS_OBSESTADOESTADONUEVO = "";
    /** Agents allowed to view the attribute obsEstadoEstadoNuevo **/
    public static final String OBSESTADOESTADONUEVO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (obsEstadoFecha)
    /** <code>obsEstadoFecha</code> attribute id. */
    public static final String ATTR_ID_OBSESTADOFECHA = "Clas_1434446856192292Atr_4_Alias";
    /** <code>obsEstadoFecha</code> attribute name. */
    public static final String ATTR_NAME_OBSESTADOFECHA = "obsEstadoFecha";
    /** <code>obsEstadoFecha</code> attribute alias. */
    public static final String ATTR_ALIAS_OBSESTADOFECHA = "Fecha";

    /** <code>obsEstadoFecha</code> attribute facet sequence. */
    public static final String PATH_FACETS_OBSESTADOFECHA = "";
    /** Agents allowed to view the attribute obsEstadoFecha **/
    public static final String OBSESTADOFECHA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Attribute (DocumentoG.documentoGIdentificador)
    /** <code>DocumentoG.documentoGIdentificador</code> identification attribute name. */
    public static final String ATTR_NAME_DOCUMENTOG_DOCUMENTOGIDENTIFICADOR = "documentoG.documentoGIdentificador";

    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_DOCUMENTOGIDENTIFICADOR = "Identificador";    
    /** <code>DocumentoG.documentoGIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTOG_DOCUMENTOGIDENTIFICADOR = "documentoGIdentificador";
    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_OBSESTADOID = "Id";    
    /** <code>obsEstadoId</code> attribute field name. */
    public static final String ATTR_FIELD_OBSESTADOID = "obsEstadoId";
    // Field (Agente_Id)
    /** <code>Agente_Id</code> field name. */
    public static final String FLD_FUNCIONARIOAGENTEID = "Agente_Id";    
    /** <code>Agente.funcionarioId</code> attribute field name. */
    public static final String ATTR_FIELD_AGENTE_FUNCIONARIOID = "funcionarioAgenteId";
    // Field (Observacions)
    /** <code>Observacions</code> field name. */
    public static final String FLD_OBSESTADOOBSERVACIONS = "Observacions";    
    /** <code>Observacions</code> field length. */
    public static final int FLD_OBSESTADOOBSERVACIONSLENGTH = 999;
    /** <code>obsEstadoObservacions</code> attribute field name. */
    public static final String ATTR_FIELD_OBSESTADOOBSERVACIONS = "obsEstadoObservacions";
    // Field (EstadoAnterior)
    /** <code>EstadoAnterior</code> field name. */
    public static final String FLD_OBSESTADOESTADOANTERIOR = "EstadoAnterior";    
    /** <code>obsEstadoEstadoAnterior</code> attribute field name. */
    public static final String ATTR_FIELD_OBSESTADOESTADOANTERIOR = "obsEstadoEstadoAnterior";
    // Field (EstadoNuevo)
    /** <code>EstadoNuevo</code> field name. */
    public static final String FLD_OBSESTADOESTADONUEVO = "EstadoNuevo";    
    /** <code>obsEstadoEstadoNuevo</code> attribute field name. */
    public static final String ATTR_FIELD_OBSESTADOESTADONUEVO = "obsEstadoEstadoNuevo";
    // Field (Fecha)
    /** <code>Fecha</code> field name. */
    public static final String FLD_OBSESTADOFECHA = "Fecha";    
    /** <code>obsEstadoFecha</code> attribute field name. */
    public static final String ATTR_FIELD_OBSESTADOFECHA = "obsEstadoFecha";

    // Component role (DocumentoG)
    /** <code>DocumentoG</code> role id. */
    public static final String ROLE_ID_DOCUMENTOG = "Agr_1434446856192431_Alias";
    /** <code>DocumentoG</code> role name. */
    public static final String ROLE_NAME_DOCUMENTOG = "documentoG";
    /** <code>DocumentoG</code> role alias. */
    public static final String ROLE_ALIAS_DOCUMENTOG = "Documento";

    /** <code>DocumentoG</code> inverse role name. */
    public static final String ROLE_INVNAME_DOCUMENTOG = DocumentoGConstants.ROLE_NAME_OBSESTADO;
    /** <code>DocumentoG</code> role facet sequence. */
    public static final String PATH_FACETS_DOCUMENTOG = "";
    /** <code>DocumentoG</code> role target class. */
    public static final String ROLE_TARGET_DOCUMENTOG = DocumentoGConstants.CLASS_NAME;

    /** Agents allowed to navigate through DocumentoG **/
    public static final String DOCUMENTOG_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Agente)
    /** <code>Agente</code> role id. */
    public static final String ROLE_ID_AGENTE = "Agr_1434447118336092_Alias";
    /** <code>Agente</code> role name. */
    public static final String ROLE_NAME_AGENTE = "agente";
    /** <code>Agente</code> role alias. */
    public static final String ROLE_ALIAS_AGENTE = "Agente";

    /** <code>Agente</code> inverse role name. */
    public static final String ROLE_INVNAME_AGENTE = FuncionarioConstants.ROLE_NAME_OBSESTADO;
    /** <code>Agente</code> role facet sequence. */
    public static final String PATH_FACETS_AGENTE = "";
    /** <code>Agente</code> role target class. */
    public static final String ROLE_TARGET_AGENTE = FuncionarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Agente **/
    public static final String AGENTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1434446856192292Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>obsEstadocrearpagrAgente</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_OBSESTADOCREARPAGRAGENTE = "p_agrAgente";
    /** <code>obsEstadocrearpagrAgente</code> inbound argument id. */
    public static final String ARG_ID_CREAR_OBSESTADOCREARPAGRAGENTE = "Clas_1434446856192292Ser_1Arg_5_Alias";
    /** <code>obsEstadocrearpagrAgente</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_OBSESTADOCREARPAGRAGENTE = "Agente";
    /** <code>obsEstadocrearpagrDocumentoG</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_OBSESTADOCREARPAGRDOCUMENTOG = "p_agrDocumentoG";
    /** <code>obsEstadocrearpagrDocumentoG</code> inbound argument id. */
    public static final String ARG_ID_CREAR_OBSESTADOCREARPAGRDOCUMENTOG = "Clas_1434446856192292Ser_1Arg_8_Alias";
    /** <code>obsEstadocrearpagrDocumentoG</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_OBSESTADOCREARPAGRDOCUMENTOG = "Documento";
    /** <code>obsEstadocrearpatrObservacions</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_OBSESTADOCREARPATROBSERVACIONS = "p_atrObservacions";
    /** <code>obsEstadocrearpatrObservacions</code> inbound argument id. */
    public static final String ARG_ID_CREAR_OBSESTADOCREARPATROBSERVACIONS = "Clas_1434446856192292Ser_1Arg_3_Alias";
    /** <code>obsEstadocrearpatrObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_OBSESTADOCREARPATROBSERVACIONS = "Observaciones";
    /** <code>obsEstadocrearpatrEstadoAnterior</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_OBSESTADOCREARPATRESTADOANTERIOR = "p_atrEstadoAnterior";
    /** <code>obsEstadocrearpatrEstadoAnterior</code> inbound argument id. */
    public static final String ARG_ID_CREAR_OBSESTADOCREARPATRESTADOANTERIOR = "Clas_1434446856192292Ser_1Arg_4_Alias";
    /** <code>obsEstadocrearpatrEstadoAnterior</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_OBSESTADOCREARPATRESTADOANTERIOR = "Estado anterior";
    /** <code>obsEstadocrearpatrEstadoNuevo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_OBSESTADOCREARPATRESTADONUEVO = "p_atrEstadoNuevo";
    /** <code>obsEstadocrearpatrEstadoNuevo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_OBSESTADOCREARPATRESTADONUEVO = "Clas_1434446856192292Ser_1Arg_6_Alias";
    /** <code>obsEstadocrearpatrEstadoNuevo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_OBSESTADOCREARPATRESTADONUEVO = "Estado nuevo";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1434446856192292Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>obsEstadoeliminarpthisObsEstado</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_OBSESTADOELIMINARPTHISOBSESTADO = "p_thisObsEstado";
    /** <code>obsEstadoeliminarpthisObsEstado</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_OBSESTADOELIMINARPTHISOBSESTADO = "Clas_1434446856192292Ser_2Arg_1_Alias";
    /** <code>obsEstadoeliminarpthisObsEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_OBSESTADOELIMINARPTHISOBSESTADO = "Observaciones";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1434446856192292Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar observaciones";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "SuperAdmin,AreaMedica";
    // Preconditions
    /** <code>modificar</code> precondition 0 id. */
    public static final String PRE_ID_MODIFICAR_0 = "Clas_1434446856192292Pre_1_MsgError";
    // Inbound arguments
    /** <code>obsEstadomodificarpthisObsEstado</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_OBSESTADOMODIFICARPTHISOBSESTADO = "p_thisObsEstado";
    /** <code>obsEstadomodificarpthisObsEstado</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_OBSESTADOMODIFICARPTHISOBSESTADO = "Clas_1434446856192292Ser_3Arg_1_Alias";
    /** <code>obsEstadomodificarpthisObsEstado</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_OBSESTADOMODIFICARPTHISOBSESTADO = "Observaciones";
    /** <code>obsEstadomodificarpObservacions</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_OBSESTADOMODIFICARPOBSERVACIONS = "p_Observacions";
    /** <code>obsEstadomodificarpObservacions</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_OBSESTADOMODIFICARPOBSERVACIONS = "Clas_1434446856192292Ser_3Arg_2_Alias";
    /** <code>obsEstadomodificarpObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_OBSESTADOMODIFICARPOBSERVACIONS = "Observaciones";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_OBSESTADOOBSERVACIONS.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_OBSESTADOESTADOANTERIOR.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_OBSESTADOESTADONUEVO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_OBSESTADOFECHA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_OBSESTADOID.toUpperCase(), OBSESTADOID_AGENTS);
    	attributeAgents.put(ATTR_NAME_OBSESTADOOBSERVACIONS.toUpperCase(), OBSESTADOOBSERVACIONS_AGENTS);
    	attributeAgents.put(ATTR_NAME_OBSESTADOESTADOANTERIOR.toUpperCase(), OBSESTADOESTADOANTERIOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_OBSESTADOESTADONUEVO.toUpperCase(), OBSESTADOESTADONUEVO_AGENTS);
    	attributeAgents.put(ATTR_NAME_OBSESTADOFECHA.toUpperCase(), OBSESTADOFECHA_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_DOCUMENTOG.toUpperCase(), DOCUMENTOG_AGENTS);
        roleAgents.put(ROLE_NAME_AGENTE.toUpperCase(), AGENTE_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'ObsEstado', it returns the identification keys
     * - If className is a facet of the inheritance net of 'ObsEstado', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ROLE_NAME_DOCUMENTOG + "." + DocumentoGConstants.ATTR_FIELD_DOCUMENTOGIDENTIFICADOR);
            returnList.add(ATTR_FIELD_OBSESTADOID);
        }
        // Facet 'ObsEstado' (This facet)
        if (ObsEstadoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ROLE_NAME_DOCUMENTOG + "." + DocumentoGConstants.ATTR_FIELD_DOCUMENTOGIDENTIFICADOR);
            returnList.add(ATTR_FIELD_OBSESTADOID);
        }
        return returnList;
    }
}
