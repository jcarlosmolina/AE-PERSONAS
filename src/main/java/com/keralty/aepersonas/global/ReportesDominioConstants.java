package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>ReportesDominio</code> model class.
 */
public final class ReportesDominioConstants {

    private ReportesDominioConstants() {

    }

    // Class
    /** <code>ReportesDominio</code> class id. */
    public static final String CLASS_ID = "Clas_1623832395776730_Alias";
    /** <code>ReportesDominio</code> class name. */
    public static final String CLASS_NAME = "ReportesDominio";
    /** <code>ReportesDominio</code> class alias. */
    public static final String CLASS_ALIAS = "Reportes de Dominio";
    /** <code>ReportesDominio</code> class table name. */
    public static final String TBL_NAME = "ReportesDominio";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "dominioNumero,plantillaReporteidPlantillaReporte,reportesDominioEnviarAuto";

    public static final String DSDSREPORTESDOMINIO = "DS_ReportesDominio";
    public static final String DSICREPORTESDOMINIO = "IC_ReportesDominio";
    

    // Attribute (reportesDominioEnviarAuto)
    /** <code>reportesDominioEnviarAuto</code> attribute id. */
    public static final String ATTR_ID_REPORTESDOMINIOENVIARAUTO = "Clas_1623832395776730Atr_2_Alias";
    /** <code>reportesDominioEnviarAuto</code> attribute name. */
    public static final String ATTR_NAME_REPORTESDOMINIOENVIARAUTO = "reportesDominioEnviarAuto";
    /** <code>reportesDominioEnviarAuto</code> attribute alias. */
    public static final String ATTR_ALIAS_REPORTESDOMINIOENVIARAUTO = "Enviar automáticamente";

    /** <code>reportesDominioEnviarAuto</code> attribute facet sequence. */
    public static final String PATH_FACETS_REPORTESDOMINIOENVIARAUTO = "";
    /** Agents allowed to view the attribute reportesDominioEnviarAuto **/
    public static final String REPORTESDOMINIOENVIARAUTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (reportesDominiodrvFechaHasta)
    /** <code>reportesDominiodrvFechaHasta</code> attribute id. */
    public static final String ATTR_ID_REPORTESDOMINIODRVFECHAHASTA = "Clas_1623832395776730Atr_3_Alias";
    /** <code>reportesDominiodrvFechaHasta</code> attribute name. */
    public static final String ATTR_NAME_REPORTESDOMINIODRVFECHAHASTA = "reportesDominiodrvFechaHasta";
    /** <code>reportesDominiodrvFechaHasta</code> attribute alias. */
    public static final String ATTR_ALIAS_REPORTESDOMINIODRVFECHAHASTA = "Fecha hasta";

    /** <code>reportesDominiodrvFechaHasta</code> attribute facet sequence. */
    public static final String PATH_FACETS_REPORTESDOMINIODRVFECHAHASTA = "";
    /** Agents allowed to view the attribute reportesDominiodrvFechaHasta **/
    public static final String REPORTESDOMINIODRVFECHAHASTA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (reportesDominiodrvRuta)
    /** <code>reportesDominiodrvRuta</code> attribute id. */
    public static final String ATTR_ID_REPORTESDOMINIODRVRUTA = "Clas_1623832395776730Atr_4_Alias";
    /** <code>reportesDominiodrvRuta</code> attribute name. */
    public static final String ATTR_NAME_REPORTESDOMINIODRVRUTA = "reportesDominiodrvRuta";
    /** <code>reportesDominiodrvRuta</code> attribute alias. */
    public static final String ATTR_ALIAS_REPORTESDOMINIODRVRUTA = "Ruta";

    /** <code>reportesDominiodrvRuta</code> attribute facet sequence. */
    public static final String PATH_FACETS_REPORTESDOMINIODRVRUTA = "";
    /** Agents allowed to view the attribute reportesDominiodrvRuta **/
    public static final String REPORTESDOMINIODRVRUTA_AGENTS = "";

    // Attribute (Dominio.dominioNumero)
    /** <code>Dominio.dominioNumero</code> identification attribute name. */
    public static final String ATTR_NAME_DOMINIO_DOMINIONUMERO = "dominio.dominioNumero";
    // Attribute (PlantillaReporte.plantillaReporteidPlantillaReporte)
    /** <code>PlantillaReporte.plantillaReporteidPlantillaReporte</code> identification attribute name. */
    public static final String ATTR_NAME_PLANTILLAREPORTE_PLANTILLAREPORTEIDPLANTILLAREPORTE = "plantillaReporte.plantillaReporteidPlantillaReporte";

    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_DOMINIONUMERO = "Numero";    
    /** <code>Dominio.dominioNumero</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIO_DOMINIONUMERO = "dominioNumero";
    // Field (id_PlantillaReporte)
    /** <code>id_PlantillaReporte</code> field name. */
    public static final String FLD_PLANTILLAREPORTEIDPLANTILLAREPORTE = "id_PlantillaReporte";    
    /** <code>PlantillaReporte.plantillaReporteidPlantillaReporte</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAREPORTE_PLANTILLAREPORTEIDPLANTILLAREPORTE = "plantillaReporteidPlantillaReporte";
    // Field (EnviarAuto)
    /** <code>EnviarAuto</code> field name. */
    public static final String FLD_REPORTESDOMINIOENVIARAUTO = "EnviarAuto";    
    /** <code>reportesDominioEnviarAuto</code> attribute field name. */
    public static final String ATTR_FIELD_REPORTESDOMINIOENVIARAUTO = "reportesDominioEnviarAuto";

    // Component role (Dominio)
    /** <code>Dominio</code> role id. */
    public static final String ROLE_ID_DOMINIO = "Agr_1623832395776247_Alias";
    /** <code>Dominio</code> role name. */
    public static final String ROLE_NAME_DOMINIO = "dominio";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIO = "Dominio";

    /** <code>Dominio</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIO = DominioConstants.ROLE_NAME_REPORTESDOMINIO;
    /** <code>Dominio</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIO = "";
    /** <code>Dominio</code> role target class. */
    public static final String ROLE_TARGET_DOMINIO = DominioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Dominio **/
    public static final String DOMINIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (PlantillaReporte)
    /** <code>PlantillaReporte</code> role id. */
    public static final String ROLE_ID_PLANTILLAREPORTE = "Agr_1623832395776891_Alias";
    /** <code>PlantillaReporte</code> role name. */
    public static final String ROLE_NAME_PLANTILLAREPORTE = "plantillaReporte";
    /** <code>PlantillaReporte</code> role alias. */
    public static final String ROLE_ALIAS_PLANTILLAREPORTE = "Plantilla";

    /** <code>PlantillaReporte</code> inverse role name. */
    public static final String ROLE_INVNAME_PLANTILLAREPORTE = PlantillaReporteConstants.ROLE_NAME_REPORTESDOMINIO;
    /** <code>PlantillaReporte</code> role facet sequence. */
    public static final String PATH_FACETS_PLANTILLAREPORTE = "";
    /** <code>PlantillaReporte</code> role target class. */
    public static final String ROLE_TARGET_PLANTILLAREPORTE = PlantillaReporteConstants.CLASS_NAME;

    /** Agents allowed to navigate through PlantillaReporte **/
    public static final String PLANTILLAREPORTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1623832395776730Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>reportesDominiocrearpagrPlantillaReporte</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_REPORTESDOMINIOCREARPAGRPLANTILLAREPORTE = "p_agrPlantillaReporte";
    /** <code>reportesDominiocrearpagrPlantillaReporte</code> inbound argument id. */
    public static final String ARG_ID_CREAR_REPORTESDOMINIOCREARPAGRPLANTILLAREPORTE = "Clas_1623832395776730Ser_1Arg_3_Alias";
    /** <code>reportesDominiocrearpagrPlantillaReporte</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_REPORTESDOMINIOCREARPAGRPLANTILLAREPORTE = "Plantilla";
    /** <code>reportesDominiocrearpagrDominio</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_REPORTESDOMINIOCREARPAGRDOMINIO = "p_agrDominio";
    /** <code>reportesDominiocrearpagrDominio</code> inbound argument id. */
    public static final String ARG_ID_CREAR_REPORTESDOMINIOCREARPAGRDOMINIO = "Clas_1623832395776730Ser_1Arg_6_Alias";
    /** <code>reportesDominiocrearpagrDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_REPORTESDOMINIOCREARPAGRDOMINIO = "Dominio";
    /** <code>reportesDominiocrearpatrEnviarAuto</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_REPORTESDOMINIOCREARPATRENVIARAUTO = "p_atrEnviarAuto";
    /** <code>reportesDominiocrearpatrEnviarAuto</code> inbound argument id. */
    public static final String ARG_ID_CREAR_REPORTESDOMINIOCREARPATRENVIARAUTO = "Clas_1623832395776730Ser_1Arg_4_Alias";
    /** <code>reportesDominiocrearpatrEnviarAuto</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_REPORTESDOMINIOCREARPATRENVIARAUTO = "Enviar automáticamente";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1623832395776730Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Desasociar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>reportesDominioeliminarpthisReportesDominio</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_REPORTESDOMINIOELIMINARPTHISREPORTESDOMINIO = "p_thisReportesDominio";
    /** <code>reportesDominioeliminarpthisReportesDominio</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_REPORTESDOMINIOELIMINARPTHISREPORTESDOMINIO = "Clas_1623832395776730Ser_2Arg_1_Alias";
    /** <code>reportesDominioeliminarpthisReportesDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_REPORTESDOMINIOELIMINARPTHISREPORTESDOMINIO = "Reportes de Dominio";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1623832395776730Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>reportesDominiomodificarpthisReportesDominio</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_REPORTESDOMINIOMODIFICARPTHISREPORTESDOMINIO = "p_thisReportesDominio";
    /** <code>reportesDominiomodificarpthisReportesDominio</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_REPORTESDOMINIOMODIFICARPTHISREPORTESDOMINIO = "Clas_1623832395776730Ser_3Arg_1_Alias";
    /** <code>reportesDominiomodificarpthisReportesDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_REPORTESDOMINIOMODIFICARPTHISREPORTESDOMINIO = "Reportes de Dominio";
    /** <code>reportesDominiomodificarpEnviarAuto</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_REPORTESDOMINIOMODIFICARPENVIARAUTO = "p_EnviarAuto";
    /** <code>reportesDominiomodificarpEnviarAuto</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_REPORTESDOMINIOMODIFICARPENVIARAUTO = "Clas_1623832395776730Ser_3Arg_2_Alias";
    /** <code>reportesDominiomodificarpEnviarAuto</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_REPORTESDOMINIOMODIFICARPENVIARAUTO = "Enviar automáticamente";
    // Service (getDummy)
    /** <code>getDummy</code> service id. */
    public static final String SERV_ID_GETDUMMY = "Clas_1623832395776730Ser_4_Alias";
    /** <code>getDummy</code> service name. */
    public static final String SERV_NAME_GETDUMMY = "getDummy";
    /** <code>getDummy</code> service alias. */
    public static final String SERV_ALIAS_GETDUMMY = "getDummy";
    /** Agents allowed to execute the service getDummy **/
    public static final String GETDUMMY_SRVAGENTS = "";
    // Inbound arguments
    /** <code>reportesDominiogetDummypthisReportesDominio</code> inbound argument name. */
    public static final String ARG_NAME_GETDUMMY_REPORTESDOMINIOGETDUMMYPTHISREPORTESDOMINIO = "p_thisReportesDominio";
    /** <code>reportesDominiogetDummypthisReportesDominio</code> inbound argument id. */
    public static final String ARG_ID_GETDUMMY_REPORTESDOMINIOGETDUMMYPTHISREPORTESDOMINIO = "Clas_1623832395776730Ser_4Arg_1_Alias";
    /** <code>reportesDominiogetDummypthisReportesDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_GETDUMMY_REPORTESDOMINIOGETDUMMYPTHISREPORTESDOMINIO = "Reportes de Dominio";
    // Outbound arguments
    /** <code>reportesDominiogetDummyoaReporteDominio</code> outbound argument name. */
    public static final String ARG_NAME_GETDUMMY_REPORTESDOMINIOGETDUMMYOAREPORTEDOMINIO = "reportesDominiogetDummyoaReporteDominio";
    /** <code>reportesDominiogetDummyoaReporteDominio</code> outbound argument id. */
    public static final String ARG_ID_GETDUMMY_REPORTESDOMINIOGETDUMMYOAREPORTEDOMINIO = "Clas_1623832395776730Ser_4Arg_2_Alias";
    /** <code>reportesDominiogetDummyoaReporteDominio</code> outbound argument alias. */
    public static final String ARG_ALIAS_GETDUMMY_REPORTESDOMINIOGETDUMMYOAREPORTEDOMINIO = "Reportes de Dominio";

    public static final String FILTER_NAME_FIPARASOLICITUD = "F_I_ParaSolicitud";
    public static final String VAR_NAME_FIPARASOLICITUD_VFSOLICITUD = "vfSolicitud";
    public static final String VAR_NAME_FIPARASOLICITUD_VFTIPO = "vfTipo";
    public static final String FILTER_NAME_FIPARASOLICITUDNOVEDAD = "F_I_ParaSolicitudNovedad";
    public static final String VAR_NAME_FIPARASOLICITUDNOVEDAD_VFSOLICITUDNOVEDAD = "vfSolicitudNovedad";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_REPORTESDOMINIOENVIARAUTO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_REPORTESDOMINIODRVFECHAHASTA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_REPORTESDOMINIODRVRUTA.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_REPORTESDOMINIOENVIARAUTO.toUpperCase(), REPORTESDOMINIOENVIARAUTO_AGENTS);
    	attributeAgents.put(ATTR_NAME_REPORTESDOMINIODRVFECHAHASTA.toUpperCase(), REPORTESDOMINIODRVFECHAHASTA_AGENTS);
    	attributeAgents.put(ATTR_NAME_REPORTESDOMINIODRVRUTA.toUpperCase(), REPORTESDOMINIODRVRUTA_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_DOMINIO.toUpperCase(), DOMINIO_AGENTS);
        roleAgents.put(ROLE_NAME_PLANTILLAREPORTE.toUpperCase(), PLANTILLAREPORTE_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'ReportesDominio', it returns the identification keys
     * - If className is a facet of the inheritance net of 'ReportesDominio', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ROLE_NAME_DOMINIO + "." + DominioConstants.ATTR_FIELD_DOMINIONUMERO);
            returnList.add(ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_FIELD_PLANTILLAREPORTEIDPLANTILLAREPORTE);
        }
        // Facet 'ReportesDominio' (This facet)
        if (ReportesDominioConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ROLE_NAME_DOMINIO + "." + DominioConstants.ATTR_FIELD_DOMINIONUMERO);
            returnList.add(ROLE_NAME_PLANTILLAREPORTE + "." + PlantillaReporteConstants.ATTR_FIELD_PLANTILLAREPORTEIDPLANTILLAREPORTE);
        }
        return returnList;
    }
}
