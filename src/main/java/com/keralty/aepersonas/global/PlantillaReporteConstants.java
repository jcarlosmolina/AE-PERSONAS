package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>PlantillaReporte</code> model class.
 */
public final class PlantillaReporteConstants {

    private PlantillaReporteConstants() {

    }

    // Class
    /** <code>PlantillaReporte</code> class id. */
    public static final String CLASS_ID = "Clas_1623831347200006_Alias";
    /** <code>PlantillaReporte</code> class name. */
    public static final String CLASS_NAME = "PlantillaReporte";
    /** <code>PlantillaReporte</code> class alias. */
    public static final String CLASS_ALIAS = "Plantilla reporte";
    /** <code>PlantillaReporte</code> class table name. */
    public static final String TBL_NAME = "PlantillaReporte";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "plantillaReporteidPlantillaReporte,plantillaReporteTipo,plantillaReporteTitulo,plantillaReporteFechaVigencia,plantillaReporteRutaArchivos,plantillaReporteNombreArchivoPDF";

    public static final String DSDSPLANTILLAREPORTE = "DS_PlantillaReporte";
    public static final String DSICPLANTILLAREPORTE = "IC_PlantillaReporte";
    

    // Attribute (plantillaReporteidPlantillaReporte)
    /** <code>plantillaReporteidPlantillaReporte</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAREPORTEIDPLANTILLAREPORTE = "Clas_1623831347200006Atr_1_Alias";
    /** <code>plantillaReporteidPlantillaReporte</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAREPORTEIDPLANTILLAREPORTE = "plantillaReporteidPlantillaReporte";
    /** <code>plantillaReporteidPlantillaReporte</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAREPORTEIDPLANTILLAREPORTE = "Id";

    /** <code>plantillaReporteidPlantillaReporte</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAREPORTEIDPLANTILLAREPORTE = "";
    /** Agents allowed to view the attribute plantillaReporteidPlantillaReporte **/
    public static final String PLANTILLAREPORTEIDPLANTILLAREPORTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (plantillaReporteTipo)
    /** <code>plantillaReporteTipo</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAREPORTETIPO = "Clas_1623831347200006Atr_2_Alias";
    /** <code>plantillaReporteTipo</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAREPORTETIPO = "plantillaReporteTipo";
    /** <code>plantillaReporteTipo</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAREPORTETIPO = "Tipo";

    /** <code>plantillaReporteTipo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAREPORTETIPO = "";
    /** Agents allowed to view the attribute plantillaReporteTipo **/
    public static final String PLANTILLAREPORTETIPO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (plantillaReporteTitulo)
    /** <code>plantillaReporteTitulo</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAREPORTETITULO = "Clas_1623831347200006Atr_3_Alias";
    /** <code>plantillaReporteTitulo</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAREPORTETITULO = "plantillaReporteTitulo";
    /** <code>plantillaReporteTitulo</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAREPORTETITULO = "Título";

    /** <code>plantillaReporteTitulo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAREPORTETITULO = "";
    /** Agents allowed to view the attribute plantillaReporteTitulo **/
    public static final String PLANTILLAREPORTETITULO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (plantillaReporteFechaVigencia)
    /** <code>plantillaReporteFechaVigencia</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAREPORTEFECHAVIGENCIA = "Clas_1623831347200006Atr_4_Alias";
    /** <code>plantillaReporteFechaVigencia</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA = "plantillaReporteFechaVigencia";
    /** <code>plantillaReporteFechaVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAREPORTEFECHAVIGENCIA = "Fecha vigencia";

    /** <code>plantillaReporteFechaVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAREPORTEFECHAVIGENCIA = "";
    /** Agents allowed to view the attribute plantillaReporteFechaVigencia **/
    public static final String PLANTILLAREPORTEFECHAVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (plantillaReporteRutaArchivos)
    /** <code>plantillaReporteRutaArchivos</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAREPORTERUTAARCHIVOS = "Clas_1623831347200006Atr_5_Alias";
    /** <code>plantillaReporteRutaArchivos</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAREPORTERUTAARCHIVOS = "plantillaReporteRutaArchivos";
    /** <code>plantillaReporteRutaArchivos</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAREPORTERUTAARCHIVOS = "Ruta relativa";

    /** <code>plantillaReporteRutaArchivos</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAREPORTERUTAARCHIVOS = "";
    /** Agents allowed to view the attribute plantillaReporteRutaArchivos **/
    public static final String PLANTILLAREPORTERUTAARCHIVOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (plantillaReporteNombreArchivoPDF)
    /** <code>plantillaReporteNombreArchivoPDF</code> attribute id. */
    public static final String ATTR_ID_PLANTILLAREPORTENOMBREARCHIVOPDF = "Clas_1623831347200006Atr_6_Alias";
    /** <code>plantillaReporteNombreArchivoPDF</code> attribute name. */
    public static final String ATTR_NAME_PLANTILLAREPORTENOMBREARCHIVOPDF = "plantillaReporteNombreArchivoPDF";
    /** <code>plantillaReporteNombreArchivoPDF</code> attribute alias. */
    public static final String ATTR_ALIAS_PLANTILLAREPORTENOMBREARCHIVOPDF = "Nombre fichero PDF";

    /** <code>plantillaReporteNombreArchivoPDF</code> attribute facet sequence. */
    public static final String PATH_FACETS_PLANTILLAREPORTENOMBREARCHIVOPDF = "";
    /** Agents allowed to view the attribute plantillaReporteNombreArchivoPDF **/
    public static final String PLANTILLAREPORTENOMBREARCHIVOPDF_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (id_PlantillaReporte)
    /** <code>id_PlantillaReporte</code> field name. */
    public static final String FLD_PLANTILLAREPORTEIDPLANTILLAREPORTE = "id_PlantillaReporte";    
    /** <code>plantillaReporteidPlantillaReporte</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAREPORTEIDPLANTILLAREPORTE = "plantillaReporteidPlantillaReporte";
    // Field (Tipo)
    /** <code>Tipo</code> field name. */
    public static final String FLD_PLANTILLAREPORTETIPO = "Tipo";    
    /** <code>plantillaReporteTipo</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAREPORTETIPO = "plantillaReporteTipo";
    // Field (Titulo)
    /** <code>Titulo</code> field name. */
    public static final String FLD_PLANTILLAREPORTETITULO = "Titulo";    
    /** <code>Titulo</code> field length. */
    public static final int FLD_PLANTILLAREPORTETITULOLENGTH = 100;
    /** <code>plantillaReporteTitulo</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAREPORTETITULO = "plantillaReporteTitulo";
    // Field (FechaVigencia)
    /** <code>FechaVigencia</code> field name. */
    public static final String FLD_PLANTILLAREPORTEFECHAVIGENCIA = "FechaVigencia";    
    /** <code>plantillaReporteFechaVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAREPORTEFECHAVIGENCIA = "plantillaReporteFechaVigencia";
    // Field (RutaArchivos)
    /** <code>RutaArchivos</code> field name. */
    public static final String FLD_PLANTILLAREPORTERUTAARCHIVOS = "RutaArchivos";    
    /** <code>RutaArchivos</code> field length. */
    public static final int FLD_PLANTILLAREPORTERUTAARCHIVOSLENGTH = 255;
    /** <code>plantillaReporteRutaArchivos</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAREPORTERUTAARCHIVOS = "plantillaReporteRutaArchivos";
    // Field (NombreArchivoPDF)
    /** <code>NombreArchivoPDF</code> field name. */
    public static final String FLD_PLANTILLAREPORTENOMBREARCHIVOPDF = "NombreArchivoPDF";    
    /** <code>NombreArchivoPDF</code> field length. */
    public static final int FLD_PLANTILLAREPORTENOMBREARCHIVOPDFLENGTH = 50;
    /** <code>plantillaReporteNombreArchivoPDF</code> attribute field name. */
    public static final String ATTR_FIELD_PLANTILLAREPORTENOMBREARCHIVOPDF = "plantillaReporteNombreArchivoPDF";


    // Compound role (ReportesDominio)
    /** <code>ReportesDominio</code> role id. */
    public static final String ROLE_ID_REPORTESDOMINIO = "Agr_1623832395776891_Alias";
    /** <code>ReportesDominio</code> role name. */
    public static final String ROLE_NAME_REPORTESDOMINIO = "reportesDominio";
    /** <code>PlantillaReporte</code> role alias. */
    public static final String ROLE_ALIAS_REPORTESDOMINIO = "Dominios";


    /** <code>ReportesDominio</code> inverse role name. */
    public static final String ROLE_INVNAME_REPORTESDOMINIO = ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE;
    /** <code>ReportesDominio</code> role facet sequence. */
    public static final String PATH_FACETS_REPORTESDOMINIO = "";
    /** <code>ReportesDominio</code> role target class. */
    public static final String ROLE_TARGET_REPORTESDOMINIO = ReportesDominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through ReportesDominio **/
    public static final String REPORTESDOMINIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1623831347200006Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>plantillaReportecrearpatrTipo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANTILLAREPORTECREARPATRTIPO = "p_atrTipo";
    /** <code>plantillaReportecrearpatrTipo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANTILLAREPORTECREARPATRTIPO = "Clas_1623831347200006Ser_1Arg_2_Alias";
    /** <code>plantillaReportecrearpatrTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANTILLAREPORTECREARPATRTIPO = "Tipo";
    /** <code>plantillaReportecrearpatrTitulo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANTILLAREPORTECREARPATRTITULO = "p_atrTitulo";
    /** <code>plantillaReportecrearpatrTitulo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANTILLAREPORTECREARPATRTITULO = "Clas_1623831347200006Ser_1Arg_3_Alias";
    /** <code>plantillaReportecrearpatrTitulo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANTILLAREPORTECREARPATRTITULO = "Título";
    /** <code>plantillaReportecrearpatrFechaVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANTILLAREPORTECREARPATRFECHAVIGENCIA = "p_atrFechaVigencia";
    /** <code>plantillaReportecrearpatrFechaVigencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANTILLAREPORTECREARPATRFECHAVIGENCIA = "Clas_1623831347200006Ser_1Arg_4_Alias";
    /** <code>plantillaReportecrearpatrFechaVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANTILLAREPORTECREARPATRFECHAVIGENCIA = "Fecha vigencia";
    /** <code>plantillaReportecrearpatrRutaArchivos</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANTILLAREPORTECREARPATRRUTAARCHIVOS = "p_atrRutaArchivos";
    /** <code>plantillaReportecrearpatrRutaArchivos</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANTILLAREPORTECREARPATRRUTAARCHIVOS = "Clas_1623831347200006Ser_1Arg_5_Alias";
    /** <code>plantillaReportecrearpatrRutaArchivos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANTILLAREPORTECREARPATRRUTAARCHIVOS = "Ruta relativa";
    /** <code>plantillaReportecrearpatrNombreArchivoPDF</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PLANTILLAREPORTECREARPATRNOMBREARCHIVOPDF = "p_atrNombreArchivoPDF";
    /** <code>plantillaReportecrearpatrNombreArchivoPDF</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PLANTILLAREPORTECREARPATRNOMBREARCHIVOPDF = "Clas_1623831347200006Ser_1Arg_6_Alias";
    /** <code>plantillaReportecrearpatrNombreArchivoPDF</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PLANTILLAREPORTECREARPATRNOMBREARCHIVOPDF = "Nombre fichero PDF";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1623831347200006Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1623831347200006Pre_1_MsgError";
    // Inbound arguments
    /** <code>plantillaReporteeliminarpthisPlantillaReporte</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PLANTILLAREPORTEELIMINARPTHISPLANTILLAREPORTE = "p_thisPlantillaReporte";
    /** <code>plantillaReporteeliminarpthisPlantillaReporte</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PLANTILLAREPORTEELIMINARPTHISPLANTILLAREPORTE = "Clas_1623831347200006Ser_2Arg_1_Alias";
    /** <code>plantillaReporteeliminarpthisPlantillaReporte</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PLANTILLAREPORTEELIMINARPTHISPLANTILLAREPORTE = "Plantilla reporte";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1623831347200006Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>plantillaReportemodificarpthisPlantillaReporte</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANTILLAREPORTEMODIFICARPTHISPLANTILLAREPORTE = "p_thisPlantillaReporte";
    /** <code>plantillaReportemodificarpthisPlantillaReporte</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANTILLAREPORTEMODIFICARPTHISPLANTILLAREPORTE = "Clas_1623831347200006Ser_3Arg_1_Alias";
    /** <code>plantillaReportemodificarpthisPlantillaReporte</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANTILLAREPORTEMODIFICARPTHISPLANTILLAREPORTE = "Plantilla reporte";
    /** <code>plantillaReportemodificarpTitulo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANTILLAREPORTEMODIFICARPTITULO = "p_Titulo";
    /** <code>plantillaReportemodificarpTitulo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANTILLAREPORTEMODIFICARPTITULO = "Clas_1623831347200006Ser_3Arg_2_Alias";
    /** <code>plantillaReportemodificarpTitulo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANTILLAREPORTEMODIFICARPTITULO = "Título";
    /** <code>plantillaReportemodificarpFechaVigencia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANTILLAREPORTEMODIFICARPFECHAVIGENCIA = "p_FechaVigencia";
    /** <code>plantillaReportemodificarpFechaVigencia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANTILLAREPORTEMODIFICARPFECHAVIGENCIA = "Clas_1623831347200006Ser_3Arg_3_Alias";
    /** <code>plantillaReportemodificarpFechaVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANTILLAREPORTEMODIFICARPFECHAVIGENCIA = "Fecha vigencia";
    /** <code>plantillaReportemodificarpRutaArchivos</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANTILLAREPORTEMODIFICARPRUTAARCHIVOS = "p_RutaArchivos";
    /** <code>plantillaReportemodificarpRutaArchivos</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANTILLAREPORTEMODIFICARPRUTAARCHIVOS = "Clas_1623831347200006Ser_3Arg_4_Alias";
    /** <code>plantillaReportemodificarpRutaArchivos</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANTILLAREPORTEMODIFICARPRUTAARCHIVOS = "Ruta relativa";
    /** <code>plantillaReportemodificarpNombreArchivoPDF</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_PLANTILLAREPORTEMODIFICARPNOMBREARCHIVOPDF = "p_NombreArchivoPDF";
    /** <code>plantillaReportemodificarpNombreArchivoPDF</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_PLANTILLAREPORTEMODIFICARPNOMBREARCHIVOPDF = "Clas_1623831347200006Ser_3Arg_5_Alias";
    /** <code>plantillaReportemodificarpNombreArchivoPDF</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_PLANTILLAREPORTEMODIFICARPNOMBREARCHIVOPDF = "Nombre fichero PDF";

    public static final String FILTER_NAME_FPLANTILLAREPORTE = "F_PlantillaReporte";
    public static final String VAR_NAME_FPLANTILLAREPORTE_VFTIPO = "vfTipo";
    public static final String VAR_NAME_FPLANTILLAREPORTE_VFFECHA = "vfFecha";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PLANTILLAREPORTETIPO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANTILLAREPORTETITULO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANTILLAREPORTERUTAARCHIVOS.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_PLANTILLAREPORTENOMBREARCHIVOPDF.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PLANTILLAREPORTEIDPLANTILLAREPORTE.toUpperCase(), PLANTILLAREPORTEIDPLANTILLAREPORTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANTILLAREPORTETIPO.toUpperCase(), PLANTILLAREPORTETIPO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANTILLAREPORTETITULO.toUpperCase(), PLANTILLAREPORTETITULO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANTILLAREPORTEFECHAVIGENCIA.toUpperCase(), PLANTILLAREPORTEFECHAVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANTILLAREPORTERUTAARCHIVOS.toUpperCase(), PLANTILLAREPORTERUTAARCHIVOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_PLANTILLAREPORTENOMBREARCHIVOPDF.toUpperCase(), PLANTILLAREPORTENOMBREARCHIVOPDF_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'PlantillaReporte', it returns the identification keys
     * - If className is a facet of the inheritance net of 'PlantillaReporte', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PLANTILLAREPORTEIDPLANTILLAREPORTE);
        }
        // Facet 'PlantillaReporte' (This facet)
        if (PlantillaReporteConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PLANTILLAREPORTEIDPLANTILLAREPORTE);
        }
        return returnList;
    }
}
