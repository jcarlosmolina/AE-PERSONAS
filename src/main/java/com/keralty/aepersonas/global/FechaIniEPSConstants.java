package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>FechaIniEPS</code> model class.
 */
public final class FechaIniEPSConstants {

    private FechaIniEPSConstants() {

    }

    // Class
    /** <code>FechaIniEPS</code> class id. */
    public static final String CLASS_ID = "Clas_1655287709696534_Alias";
    /** <code>FechaIniEPS</code> class name. */
    public static final String CLASS_NAME = "FechaIniEPS";
    /** <code>FechaIniEPS</code> class alias. */
    public static final String CLASS_ALIAS = "Fechas inicio vigencia para EPS";
    /** <code>FechaIniEPS</code> class table name. */
    public static final String TBL_NAME = "FechaIniEPS";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "fechaIniEPSId,fechaIniEPSTramite,fechaIniEPSTipoContrato,fechaIniEPSDesde,fechaIniEPSHasta,fechaIniEPSFechaInicioAplicar";

    public static final String DSDSFECHAINIEPS = "DS_FechaIniEPS";
    

    // Attribute (fechaIniEPSId)
    /** <code>fechaIniEPSId</code> attribute id. */
    public static final String ATTR_ID_FECHAINIEPSID = "Clas_1655287709696534Atr_2_Alias";
    /** <code>fechaIniEPSId</code> attribute name. */
    public static final String ATTR_NAME_FECHAINIEPSID = "fechaIniEPSId";
    /** <code>fechaIniEPSId</code> attribute alias. */
    public static final String ATTR_ALIAS_FECHAINIEPSID = "Id";

    /** <code>fechaIniEPSId</code> attribute facet sequence. */
    public static final String PATH_FACETS_FECHAINIEPSID = "";
    /** Agents allowed to view the attribute fechaIniEPSId **/
    public static final String FECHAINIEPSID_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (fechaIniEPSTramite)
    /** <code>fechaIniEPSTramite</code> attribute id. */
    public static final String ATTR_ID_FECHAINIEPSTRAMITE = "Clas_1655287709696534Atr_3_Alias";
    /** <code>fechaIniEPSTramite</code> attribute name. */
    public static final String ATTR_NAME_FECHAINIEPSTRAMITE = "fechaIniEPSTramite";
    /** <code>fechaIniEPSTramite</code> attribute alias. */
    public static final String ATTR_ALIAS_FECHAINIEPSTRAMITE = "Trámite";

    /** <code>fechaIniEPSTramite</code> attribute facet sequence. */
    public static final String PATH_FACETS_FECHAINIEPSTRAMITE = "";
    /** Agents allowed to view the attribute fechaIniEPSTramite **/
    public static final String FECHAINIEPSTRAMITE_AGENTS = "Admin,SuperAdmin";
    // Attribute (fechaIniEPSTipoContrato)
    /** <code>fechaIniEPSTipoContrato</code> attribute id. */
    public static final String ATTR_ID_FECHAINIEPSTIPOCONTRATO = "Clas_1655287709696534Atr_4_Alias";
    /** <code>fechaIniEPSTipoContrato</code> attribute name. */
    public static final String ATTR_NAME_FECHAINIEPSTIPOCONTRATO = "fechaIniEPSTipoContrato";
    /** <code>fechaIniEPSTipoContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_FECHAINIEPSTIPOCONTRATO = "Tipo Contrato";

    /** <code>fechaIniEPSTipoContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_FECHAINIEPSTIPOCONTRATO = "";
    /** Agents allowed to view the attribute fechaIniEPSTipoContrato **/
    public static final String FECHAINIEPSTIPOCONTRATO_AGENTS = "Admin,SuperAdmin";
    // Attribute (fechaIniEPSDesde)
    /** <code>fechaIniEPSDesde</code> attribute id. */
    public static final String ATTR_ID_FECHAINIEPSDESDE = "Clas_1655287709696534Atr_5_Alias";
    /** <code>fechaIniEPSDesde</code> attribute name. */
    public static final String ATTR_NAME_FECHAINIEPSDESDE = "fechaIniEPSDesde";
    /** <code>fechaIniEPSDesde</code> attribute alias. */
    public static final String ATTR_ALIAS_FECHAINIEPSDESDE = "Fecha Desde";

    /** <code>fechaIniEPSDesde</code> attribute facet sequence. */
    public static final String PATH_FACETS_FECHAINIEPSDESDE = "";
    /** Agents allowed to view the attribute fechaIniEPSDesde **/
    public static final String FECHAINIEPSDESDE_AGENTS = "Admin,SuperAdmin";
    // Attribute (fechaIniEPSHasta)
    /** <code>fechaIniEPSHasta</code> attribute id. */
    public static final String ATTR_ID_FECHAINIEPSHASTA = "Clas_1655287709696534Atr_6_Alias";
    /** <code>fechaIniEPSHasta</code> attribute name. */
    public static final String ATTR_NAME_FECHAINIEPSHASTA = "fechaIniEPSHasta";
    /** <code>fechaIniEPSHasta</code> attribute alias. */
    public static final String ATTR_ALIAS_FECHAINIEPSHASTA = "Fecha Hasta";

    /** <code>fechaIniEPSHasta</code> attribute facet sequence. */
    public static final String PATH_FACETS_FECHAINIEPSHASTA = "";
    /** Agents allowed to view the attribute fechaIniEPSHasta **/
    public static final String FECHAINIEPSHASTA_AGENTS = "Admin,SuperAdmin";
    // Attribute (fechaIniEPSFechaInicioAplicar)
    /** <code>fechaIniEPSFechaInicioAplicar</code> attribute id. */
    public static final String ATTR_ID_FECHAINIEPSFECHAINICIOAPLICAR = "Clas_1655287709696534Atr_7_Alias";
    /** <code>fechaIniEPSFechaInicioAplicar</code> attribute name. */
    public static final String ATTR_NAME_FECHAINIEPSFECHAINICIOAPLICAR = "fechaIniEPSFechaInicioAplicar";
    /** <code>fechaIniEPSFechaInicioAplicar</code> attribute alias. */
    public static final String ATTR_ALIAS_FECHAINIEPSFECHAINICIOAPLICAR = "Fecha inicio de contratación";

    /** <code>fechaIniEPSFechaInicioAplicar</code> attribute facet sequence. */
    public static final String PATH_FACETS_FECHAINIEPSFECHAINICIOAPLICAR = "";
    /** Agents allowed to view the attribute fechaIniEPSFechaInicioAplicar **/
    public static final String FECHAINIEPSFECHAINICIOAPLICAR_AGENTS = "Admin,SuperAdmin";


    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_FECHAINIEPSID = "Id";    
    /** <code>fechaIniEPSId</code> attribute field name. */
    public static final String ATTR_FIELD_FECHAINIEPSID = "fechaIniEPSId";
    // Field (Tramite)
    /** <code>Tramite</code> field name. */
    public static final String FLD_FECHAINIEPSTRAMITE = "Tramite";    
    /** <code>fechaIniEPSTramite</code> attribute field name. */
    public static final String ATTR_FIELD_FECHAINIEPSTRAMITE = "fechaIniEPSTramite";
    // Field (TipoContrato)
    /** <code>TipoContrato</code> field name. */
    public static final String FLD_FECHAINIEPSTIPOCONTRATO = "TipoContrato";    
    /** <code>fechaIniEPSTipoContrato</code> attribute field name. */
    public static final String ATTR_FIELD_FECHAINIEPSTIPOCONTRATO = "fechaIniEPSTipoContrato";
    // Field (Desde)
    /** <code>Desde</code> field name. */
    public static final String FLD_FECHAINIEPSDESDE = "Desde";    
    /** <code>fechaIniEPSDesde</code> attribute field name. */
    public static final String ATTR_FIELD_FECHAINIEPSDESDE = "fechaIniEPSDesde";
    // Field (Hasta)
    /** <code>Hasta</code> field name. */
    public static final String FLD_FECHAINIEPSHASTA = "Hasta";    
    /** <code>fechaIniEPSHasta</code> attribute field name. */
    public static final String ATTR_FIELD_FECHAINIEPSHASTA = "fechaIniEPSHasta";
    // Field (FechaInicioAplicar)
    /** <code>FechaInicioAplicar</code> field name. */
    public static final String FLD_FECHAINIEPSFECHAINICIOAPLICAR = "FechaInicioAplicar";    
    /** <code>fechaIniEPSFechaInicioAplicar</code> attribute field name. */
    public static final String ATTR_FIELD_FECHAINIEPSFECHAINICIOAPLICAR = "fechaIniEPSFechaInicioAplicar";



    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1655287709696534Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Preconditions
    /** <code>crear</code> precondition 0 id. */
    public static final String PRE_ID_CREAR_0 = "Clas_1655287709696534Pre_1_MsgError";
    // Inbound arguments
    /** <code>fechaIniEPScrearpatrTramite</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FECHAINIEPSCREARPATRTRAMITE = "p_atrTramite";
    /** <code>fechaIniEPScrearpatrTramite</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FECHAINIEPSCREARPATRTRAMITE = "Clas_1655287709696534Ser_1Arg_3_Alias";
    /** <code>fechaIniEPScrearpatrTramite</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FECHAINIEPSCREARPATRTRAMITE = "Trámite";
    /** <code>fechaIniEPScrearpatrTipoContrato</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FECHAINIEPSCREARPATRTIPOCONTRATO = "p_atrTipoContrato";
    /** <code>fechaIniEPScrearpatrTipoContrato</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FECHAINIEPSCREARPATRTIPOCONTRATO = "Clas_1655287709696534Ser_1Arg_4_Alias";
    /** <code>fechaIniEPScrearpatrTipoContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FECHAINIEPSCREARPATRTIPOCONTRATO = "Tipo Contrato";
    /** <code>fechaIniEPScrearpatrDesde</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FECHAINIEPSCREARPATRDESDE = "p_atrDesde";
    /** <code>fechaIniEPScrearpatrDesde</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FECHAINIEPSCREARPATRDESDE = "Clas_1655287709696534Ser_1Arg_5_Alias";
    /** <code>fechaIniEPScrearpatrDesde</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FECHAINIEPSCREARPATRDESDE = "Fecha Desde";
    /** <code>fechaIniEPScrearpatrHasta</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FECHAINIEPSCREARPATRHASTA = "p_atrHasta";
    /** <code>fechaIniEPScrearpatrHasta</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FECHAINIEPSCREARPATRHASTA = "Clas_1655287709696534Ser_1Arg_6_Alias";
    /** <code>fechaIniEPScrearpatrHasta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FECHAINIEPSCREARPATRHASTA = "Fecha Hasta";
    /** <code>fechaIniEPScrearpatrFechaInicioAplicar</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FECHAINIEPSCREARPATRFECHAINICIOAPLICAR = "p_atrFechaInicioAplicar";
    /** <code>fechaIniEPScrearpatrFechaInicioAplicar</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FECHAINIEPSCREARPATRFECHAINICIOAPLICAR = "Clas_1655287709696534Ser_1Arg_7_Alias";
    /** <code>fechaIniEPScrearpatrFechaInicioAplicar</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FECHAINIEPSCREARPATRFECHAINICIOAPLICAR = "Fecha inicio de contratación";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1655287709696534Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>fechaIniEPSeliminarpthisFechaIniEPS</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_FECHAINIEPSELIMINARPTHISFECHAINIEPS = "p_thisFechaIniEPS";
    /** <code>fechaIniEPSeliminarpthisFechaIniEPS</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_FECHAINIEPSELIMINARPTHISFECHAINIEPS = "Clas_1655287709696534Ser_2Arg_1_Alias";
    /** <code>fechaIniEPSeliminarpthisFechaIniEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_FECHAINIEPSELIMINARPTHISFECHAINIEPS = "Fechas inicio vigencia para EPS";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1655287709696534Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Preconditions
    /** <code>modificar</code> precondition 0 id. */
    public static final String PRE_ID_MODIFICAR_0 = "Clas_1655287709696534Pre_2_MsgError";
    // Inbound arguments
    /** <code>fechaIniEPSmodificarpthisFechaIniEPS</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FECHAINIEPSMODIFICARPTHISFECHAINIEPS = "p_thisFechaIniEPS";
    /** <code>fechaIniEPSmodificarpthisFechaIniEPS</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FECHAINIEPSMODIFICARPTHISFECHAINIEPS = "Clas_1655287709696534Ser_3Arg_1_Alias";
    /** <code>fechaIniEPSmodificarpthisFechaIniEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FECHAINIEPSMODIFICARPTHISFECHAINIEPS = "Fechas inicio vigencia para EPS";
    /** <code>fechaIniEPSmodificarpDesde</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FECHAINIEPSMODIFICARPDESDE = "p_Desde";
    /** <code>fechaIniEPSmodificarpDesde</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FECHAINIEPSMODIFICARPDESDE = "Clas_1655287709696534Ser_3Arg_2_Alias";
    /** <code>fechaIniEPSmodificarpDesde</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FECHAINIEPSMODIFICARPDESDE = "Fecha Desde";
    /** <code>fechaIniEPSmodificarpHasta</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FECHAINIEPSMODIFICARPHASTA = "p_Hasta";
    /** <code>fechaIniEPSmodificarpHasta</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FECHAINIEPSMODIFICARPHASTA = "Clas_1655287709696534Ser_3Arg_3_Alias";
    /** <code>fechaIniEPSmodificarpHasta</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FECHAINIEPSMODIFICARPHASTA = "Fecha Hasta";
    /** <code>fechaIniEPSmodificarpFechaInicioAplicar</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FECHAINIEPSMODIFICARPFECHAINICIOAPLICAR = "p_FechaInicioAplicar";
    /** <code>fechaIniEPSmodificarpFechaInicioAplicar</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FECHAINIEPSMODIFICARPFECHAINICIOAPLICAR = "Clas_1655287709696534Ser_3Arg_4_Alias";
    /** <code>fechaIniEPSmodificarpFechaInicioAplicar</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FECHAINIEPSMODIFICARPFECHAINICIOAPLICAR = "Fecha inicio de contratación";

    public static final String FILTER_NAME_FFECHAINIEPS = "F_FechaIniEPS";
    public static final String VAR_NAME_FFECHAINIEPS_VFTRAMITE = "vfTramite";
    public static final String VAR_NAME_FFECHAINIEPS_VFTIPOCONTRATO = "vfTipoContrato";
    public static final String VAR_NAME_FFECHAINIEPS_VFFECHA = "vfFecha";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_FECHAINIEPSTRAMITE.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_FECHAINIEPSTIPOCONTRATO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_FECHAINIEPSDESDE.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_FECHAINIEPSHASTA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_FECHAINIEPSFECHAINICIOAPLICAR.toUpperCase(), Constants.Type.DATE.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_FECHAINIEPSID.toUpperCase(), FECHAINIEPSID_AGENTS);
    	attributeAgents.put(ATTR_NAME_FECHAINIEPSTRAMITE.toUpperCase(), FECHAINIEPSTRAMITE_AGENTS);
    	attributeAgents.put(ATTR_NAME_FECHAINIEPSTIPOCONTRATO.toUpperCase(), FECHAINIEPSTIPOCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_FECHAINIEPSDESDE.toUpperCase(), FECHAINIEPSDESDE_AGENTS);
    	attributeAgents.put(ATTR_NAME_FECHAINIEPSHASTA.toUpperCase(), FECHAINIEPSHASTA_AGENTS);
    	attributeAgents.put(ATTR_NAME_FECHAINIEPSFECHAINICIOAPLICAR.toUpperCase(), FECHAINIEPSFECHAINICIOAPLICAR_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'FechaIniEPS', it returns the identification keys
     * - If className is a facet of the inheritance net of 'FechaIniEPS', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_FECHAINIEPSID);
        }
        // Facet 'FechaIniEPS' (This facet)
        if (FechaIniEPSConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FECHAINIEPSID);
        }
        return returnList;
    }
}
