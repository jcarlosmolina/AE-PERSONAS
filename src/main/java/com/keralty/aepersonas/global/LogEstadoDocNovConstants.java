package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>LogEstadoDocNov</code> model class.
 */
public final class LogEstadoDocNovConstants {

    private LogEstadoDocNovConstants() {

    }

    // Class
    /** <code>LogEstadoDocNov</code> class id. */
    public static final String CLASS_ID = "Clas_1594054803456437_Alias";
    /** <code>LogEstadoDocNov</code> class name. */
    public static final String CLASS_NAME = "LogEstadoDocNov";
    /** <code>LogEstadoDocNov</code> class alias. */
    public static final String CLASS_ALIAS = "Observaciones";
    /** <code>LogEstadoDocNov</code> class table name. */
    public static final String TBL_NAME = "LogEstadoDocNov";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "logEstadoDocNovId,documentoNovedadIdDocumento,logEstadoDocNovFecha,logEstadoDocNovNombreFuncionario,logEstadoDocNovEstadoAnterior,logEstadoDocNovEstadoNuevo,logEstadoDocNovObservacions";

    public static final String DSDSLOGESTADODOCNOV = "DS_LogEstadoDocNov";
    

    // Attribute (logEstadoDocNovId)
    /** <code>logEstadoDocNovId</code> attribute id. */
    public static final String ATTR_ID_LOGESTADODOCNOVID = "Clas_1594054803456437Atr_1_Alias";
    /** <code>logEstadoDocNovId</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADODOCNOVID = "logEstadoDocNovId";
    /** <code>logEstadoDocNovId</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADODOCNOVID = "Id.";

    /** <code>logEstadoDocNovId</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADODOCNOVID = "";
    /** Agents allowed to view the attribute logEstadoDocNovId **/
    public static final String LOGESTADODOCNOVID_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoDocNovFecha)
    /** <code>logEstadoDocNovFecha</code> attribute id. */
    public static final String ATTR_ID_LOGESTADODOCNOVFECHA = "Clas_1594054803456437Atr_2_Alias";
    /** <code>logEstadoDocNovFecha</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADODOCNOVFECHA = "logEstadoDocNovFecha";
    /** <code>logEstadoDocNovFecha</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADODOCNOVFECHA = "Fecha";

    /** <code>logEstadoDocNovFecha</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADODOCNOVFECHA = "";
    /** Agents allowed to view the attribute logEstadoDocNovFecha **/
    public static final String LOGESTADODOCNOVFECHA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoDocNovNombreFuncionario)
    /** <code>logEstadoDocNovNombreFuncionario</code> attribute id. */
    public static final String ATTR_ID_LOGESTADODOCNOVNOMBREFUNCIONARIO = "Clas_1594054803456437Atr_3_Alias";
    /** <code>logEstadoDocNovNombreFuncionario</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADODOCNOVNOMBREFUNCIONARIO = "logEstadoDocNovNombreFuncionario";
    /** <code>logEstadoDocNovNombreFuncionario</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADODOCNOVNOMBREFUNCIONARIO = "Nombre";

    /** <code>logEstadoDocNovNombreFuncionario</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADODOCNOVNOMBREFUNCIONARIO = "";
    /** Agents allowed to view the attribute logEstadoDocNovNombreFuncionario **/
    public static final String LOGESTADODOCNOVNOMBREFUNCIONARIO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoDocNovEstadoAnterior)
    /** <code>logEstadoDocNovEstadoAnterior</code> attribute id. */
    public static final String ATTR_ID_LOGESTADODOCNOVESTADOANTERIOR = "Clas_1594054803456437Atr_4_Alias";
    /** <code>logEstadoDocNovEstadoAnterior</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADODOCNOVESTADOANTERIOR = "logEstadoDocNovEstadoAnterior";
    /** <code>logEstadoDocNovEstadoAnterior</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADODOCNOVESTADOANTERIOR = "Estado Anterior";

    /** <code>logEstadoDocNovEstadoAnterior</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADODOCNOVESTADOANTERIOR = "";
    /** Agents allowed to view the attribute logEstadoDocNovEstadoAnterior **/
    public static final String LOGESTADODOCNOVESTADOANTERIOR_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoDocNovEstadoNuevo)
    /** <code>logEstadoDocNovEstadoNuevo</code> attribute id. */
    public static final String ATTR_ID_LOGESTADODOCNOVESTADONUEVO = "Clas_1594054803456437Atr_5_Alias";
    /** <code>logEstadoDocNovEstadoNuevo</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADODOCNOVESTADONUEVO = "logEstadoDocNovEstadoNuevo";
    /** <code>logEstadoDocNovEstadoNuevo</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADODOCNOVESTADONUEVO = "Estado Nuevo";

    /** <code>logEstadoDocNovEstadoNuevo</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADODOCNOVESTADONUEVO = "";
    /** Agents allowed to view the attribute logEstadoDocNovEstadoNuevo **/
    public static final String LOGESTADODOCNOVESTADONUEVO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (logEstadoDocNovObservacions)
    /** <code>logEstadoDocNovObservacions</code> attribute id. */
    public static final String ATTR_ID_LOGESTADODOCNOVOBSERVACIONS = "Clas_1594054803456437Atr_6_Alias";
    /** <code>logEstadoDocNovObservacions</code> attribute name. */
    public static final String ATTR_NAME_LOGESTADODOCNOVOBSERVACIONS = "logEstadoDocNovObservacions";
    /** <code>logEstadoDocNovObservacions</code> attribute alias. */
    public static final String ATTR_ALIAS_LOGESTADODOCNOVOBSERVACIONS = "Observaciones";

    /** <code>logEstadoDocNovObservacions</code> attribute facet sequence. */
    public static final String PATH_FACETS_LOGESTADODOCNOVOBSERVACIONS = "";
    /** Agents allowed to view the attribute logEstadoDocNovObservacions **/
    public static final String LOGESTADODOCNOVOBSERVACIONS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_LOGESTADODOCNOVID = "Id";    
    /** <code>logEstadoDocNovId</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADODOCNOVID = "logEstadoDocNovId";
    // Field (IdDocumento)
    /** <code>IdDocumento</code> field name. */
    public static final String FLD_DOCUMENTONOVEDADIDDOCUMENTO = "IdDocumento";    
    /** <code>DocumentoNovedad.documentoNovedadIdDocumento</code> attribute field name. */
    public static final String ATTR_FIELD_DOCUMENTONOVEDAD_DOCUMENTONOVEDADIDDOCUMENTO = "documentoNovedadIdDocumento";
    // Field (Fecha)
    /** <code>Fecha</code> field name. */
    public static final String FLD_LOGESTADODOCNOVFECHA = "Fecha";    
    /** <code>logEstadoDocNovFecha</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADODOCNOVFECHA = "logEstadoDocNovFecha";
    // Field (NombreFuncionario)
    /** <code>NombreFuncionario</code> field name. */
    public static final String FLD_LOGESTADODOCNOVNOMBREFUNCIONARIO = "NombreFuncionario";    
    /** <code>NombreFuncionario</code> field length. */
    public static final int FLD_LOGESTADODOCNOVNOMBREFUNCIONARIOLENGTH = 200;
    /** <code>logEstadoDocNovNombreFuncionario</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADODOCNOVNOMBREFUNCIONARIO = "logEstadoDocNovNombreFuncionario";
    // Field (EstadoAnterior)
    /** <code>EstadoAnterior</code> field name. */
    public static final String FLD_LOGESTADODOCNOVESTADOANTERIOR = "EstadoAnterior";    
    /** <code>logEstadoDocNovEstadoAnterior</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADODOCNOVESTADOANTERIOR = "logEstadoDocNovEstadoAnterior";
    // Field (EstadoNuevo)
    /** <code>EstadoNuevo</code> field name. */
    public static final String FLD_LOGESTADODOCNOVESTADONUEVO = "EstadoNuevo";    
    /** <code>logEstadoDocNovEstadoNuevo</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADODOCNOVESTADONUEVO = "logEstadoDocNovEstadoNuevo";
    // Field (Observacions)
    /** <code>Observacions</code> field name. */
    public static final String FLD_LOGESTADODOCNOVOBSERVACIONS = "Observacions";    
    /** <code>Observacions</code> field length. */
    public static final int FLD_LOGESTADODOCNOVOBSERVACIONSLENGTH = 999;
    /** <code>logEstadoDocNovObservacions</code> attribute field name. */
    public static final String ATTR_FIELD_LOGESTADODOCNOVOBSERVACIONS = "logEstadoDocNovObservacions";

    // Component role (DocumentoNovedad)
    /** <code>DocumentoNovedad</code> role id. */
    public static final String ROLE_ID_DOCUMENTONOVEDAD = "Agr_1594054803456266_Alias";
    /** <code>DocumentoNovedad</code> role name. */
    public static final String ROLE_NAME_DOCUMENTONOVEDAD = "documentoNovedad";
    /** <code>DocumentoNovedad</code> role alias. */
    public static final String ROLE_ALIAS_DOCUMENTONOVEDAD = "DocumentoNovedad";

    /** <code>DocumentoNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_DOCUMENTONOVEDAD = DocumentoNovedadConstants.ROLE_NAME_LOGESTADODOCNOV;
    /** <code>DocumentoNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_DOCUMENTONOVEDAD = "";
    /** <code>DocumentoNovedad</code> role target class. */
    public static final String ROLE_TARGET_DOCUMENTONOVEDAD = DocumentoNovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through DocumentoNovedad **/
    public static final String DOCUMENTONOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1594054803456437Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logEstadoDocNovcrearpagrDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADODOCNOVCREARPAGRDOCUMENTONOVEDAD = "p_agrDocumentoNovedad";
    /** <code>logEstadoDocNovcrearpagrDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADODOCNOVCREARPAGRDOCUMENTONOVEDAD = "Clas_1594054803456437Ser_1Arg_1_Alias";
    /** <code>logEstadoDocNovcrearpagrDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADODOCNOVCREARPAGRDOCUMENTONOVEDAD = "DocumentoNovedad";
    /** <code>logEstadoDocNovcrearpatrNombreFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADODOCNOVCREARPATRNOMBREFUNCIONARIO = "p_atrNombreFuncionario";
    /** <code>logEstadoDocNovcrearpatrNombreFuncionario</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADODOCNOVCREARPATRNOMBREFUNCIONARIO = "Clas_1594054803456437Ser_1Arg_2_Alias";
    /** <code>logEstadoDocNovcrearpatrNombreFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADODOCNOVCREARPATRNOMBREFUNCIONARIO = "Nombre";
    /** <code>logEstadoDocNovcrearpatrEstadoAnterior</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADODOCNOVCREARPATRESTADOANTERIOR = "p_atrEstadoAnterior";
    /** <code>logEstadoDocNovcrearpatrEstadoAnterior</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADODOCNOVCREARPATRESTADOANTERIOR = "Clas_1594054803456437Ser_1Arg_3_Alias";
    /** <code>logEstadoDocNovcrearpatrEstadoAnterior</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADODOCNOVCREARPATRESTADOANTERIOR = "Estado Anterior";
    /** <code>logEstadoDocNovcrearpatrEstadoNuevo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADODOCNOVCREARPATRESTADONUEVO = "p_atrEstadoNuevo";
    /** <code>logEstadoDocNovcrearpatrEstadoNuevo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADODOCNOVCREARPATRESTADONUEVO = "Clas_1594054803456437Ser_1Arg_4_Alias";
    /** <code>logEstadoDocNovcrearpatrEstadoNuevo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADODOCNOVCREARPATRESTADONUEVO = "Estado Nuevo";
    /** <code>logEstadoDocNovcrearpatrObservacions</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_LOGESTADODOCNOVCREARPATROBSERVACIONS = "p_atrObservacions";
    /** <code>logEstadoDocNovcrearpatrObservacions</code> inbound argument id. */
    public static final String ARG_ID_CREAR_LOGESTADODOCNOVCREARPATROBSERVACIONS = "Clas_1594054803456437Ser_1Arg_5_Alias";
    /** <code>logEstadoDocNovcrearpatrObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_LOGESTADODOCNOVCREARPATROBSERVACIONS = "Observaciones";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1594054803456437Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logEstadoDocNoveliminarpthisObsEstadoNov</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_LOGESTADODOCNOVELIMINARPTHISOBSESTADONOV = "p_thisObsEstadoNov";
    /** <code>logEstadoDocNoveliminarpthisObsEstadoNov</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_LOGESTADODOCNOVELIMINARPTHISOBSESTADONOV = "Clas_1594054803456437Ser_2Arg_1_Alias";
    /** <code>logEstadoDocNoveliminarpthisObsEstadoNov</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_LOGESTADODOCNOVELIMINARPTHISOBSESTADONOV = "Observaciones";
    // Service (TNEW)
    /** <code>TNEW</code> service id. */
    public static final String SERV_ID_TNEW = "Clas_1594054803456437Ser_3_Alias";
    /** <code>TNEW</code> service name. */
    public static final String SERV_NAME_TNEW = "TNEW";
    /** <code>TNEW</code> service alias. */
    public static final String SERV_ALIAS_TNEW = "TNEW";
    /** Agents allowed to execute the service TNEW **/
    public static final String TNEW_SRVAGENTS = "";
    // Inbound arguments
    /** <code>logEstadoDocNovTNEWptpagrDocumentoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_LOGESTADODOCNOVTNEWPTPAGRDOCUMENTONOVEDAD = "pt_p_agrDocumentoNovedad";
    /** <code>logEstadoDocNovTNEWptpagrDocumentoNovedad</code> inbound argument id. */
    public static final String ARG_ID_TNEW_LOGESTADODOCNOVTNEWPTPAGRDOCUMENTONOVEDAD = "Clas_1594054803456437Ser_3Arg_1_Alias";
    /** <code>logEstadoDocNovTNEWptpagrDocumentoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_LOGESTADODOCNOVTNEWPTPAGRDOCUMENTONOVEDAD = "DocumentoNovedad";
    /** <code>logEstadoDocNovTNEWptpatrEstadoAnterior</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_LOGESTADODOCNOVTNEWPTPATRESTADOANTERIOR = "pt_p_atrEstadoAnterior";
    /** <code>logEstadoDocNovTNEWptpatrEstadoAnterior</code> inbound argument id. */
    public static final String ARG_ID_TNEW_LOGESTADODOCNOVTNEWPTPATRESTADOANTERIOR = "Clas_1594054803456437Ser_3Arg_2_Alias";
    /** <code>logEstadoDocNovTNEWptpatrEstadoAnterior</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_LOGESTADODOCNOVTNEWPTPATRESTADOANTERIOR = "Estado Anterior";
    /** <code>logEstadoDocNovTNEWptpatrEstadoNuevo</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_LOGESTADODOCNOVTNEWPTPATRESTADONUEVO = "pt_p_atrEstadoNuevo";
    /** <code>logEstadoDocNovTNEWptpatrEstadoNuevo</code> inbound argument id. */
    public static final String ARG_ID_TNEW_LOGESTADODOCNOVTNEWPTPATRESTADONUEVO = "Clas_1594054803456437Ser_3Arg_3_Alias";
    /** <code>logEstadoDocNovTNEWptpatrEstadoNuevo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_LOGESTADODOCNOVTNEWPTPATRESTADONUEVO = "Estado Nuevo";
    /** <code>logEstadoDocNovTNEWptpatrObservacions</code> inbound argument name. */
    public static final String ARG_NAME_TNEW_LOGESTADODOCNOVTNEWPTPATROBSERVACIONS = "pt_p_atrObservacions";
    /** <code>logEstadoDocNovTNEWptpatrObservacions</code> inbound argument id. */
    public static final String ARG_ID_TNEW_LOGESTADODOCNOVTNEWPTPATROBSERVACIONS = "Clas_1594054803456437Ser_3Arg_4_Alias";
    /** <code>logEstadoDocNovTNEWptpatrObservacions</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEW_LOGESTADODOCNOVTNEWPTPATROBSERVACIONS = "Observaciones";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_LOGESTADODOCNOVFECHA.toUpperCase(), Constants.Type.DATETIME.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADODOCNOVNOMBREFUNCIONARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADODOCNOVESTADOANTERIOR.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADODOCNOVESTADONUEVO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_LOGESTADODOCNOVOBSERVACIONS.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_LOGESTADODOCNOVID.toUpperCase(), LOGESTADODOCNOVID_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADODOCNOVFECHA.toUpperCase(), LOGESTADODOCNOVFECHA_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADODOCNOVNOMBREFUNCIONARIO.toUpperCase(), LOGESTADODOCNOVNOMBREFUNCIONARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADODOCNOVESTADOANTERIOR.toUpperCase(), LOGESTADODOCNOVESTADOANTERIOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADODOCNOVESTADONUEVO.toUpperCase(), LOGESTADODOCNOVESTADONUEVO_AGENTS);
    	attributeAgents.put(ATTR_NAME_LOGESTADODOCNOVOBSERVACIONS.toUpperCase(), LOGESTADODOCNOVOBSERVACIONS_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_DOCUMENTONOVEDAD.toUpperCase(), DOCUMENTONOVEDAD_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'LogEstadoDocNov', it returns the identification keys
     * - If className is a facet of the inheritance net of 'LogEstadoDocNov', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_LOGESTADODOCNOVID);
        }
        // Facet 'LogEstadoDocNov' (This facet)
        if (LogEstadoDocNovConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_LOGESTADODOCNOVID);
        }
        return returnList;
    }
}
