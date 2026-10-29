package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>FrecuenciaAct</code> model class.
 */
public final class FrecuenciaActConstants {

    private FrecuenciaActConstants() {

    }

    // Class
    /** <code>FrecuenciaAct</code> class id. */
    public static final String CLASS_ID = "Clas_1431632084992014_Alias";
    /** <code>FrecuenciaAct</code> class name. */
    public static final String CLASS_NAME = "FrecuenciaAct";
    /** <code>FrecuenciaAct</code> class alias. */
    public static final String CLASS_ALIAS = "Frecuencias act.";
    /** <code>FrecuenciaAct</code> class table name. */
    public static final String TBL_NAME = "FrecuenciaAct";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "frecuenciaActCodigo,frecuenciaActParametrica,frecuenciaActFrecuencia,frecuenciaActFechaUltimaSinc,frecuenciaActResultadoSinc,frecuenciaActUsuario,frecuenciaActNombreUsuario";

    public static final String DSICFRECUENCIAACT = "IC_FrecuenciaAct";
    public static final String DSDSFRECUENCIAACTPIU = "DS_FrecuenciaAct_PIU";
    

    // Attribute (frecuenciaActCodigo)
    /** <code>frecuenciaActCodigo</code> attribute id. */
    public static final String ATTR_ID_FRECUENCIAACTCODIGO = "Clas_1431632084992014Atr_1_Alias";
    /** <code>frecuenciaActCodigo</code> attribute name. */
    public static final String ATTR_NAME_FRECUENCIAACTCODIGO = "frecuenciaActCodigo";
    /** <code>frecuenciaActCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_FRECUENCIAACTCODIGO = "Código";

    /** <code>frecuenciaActCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_FRECUENCIAACTCODIGO = "";
    /** Agents allowed to view the attribute frecuenciaActCodigo **/
    public static final String FRECUENCIAACTCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (frecuenciaActParametrica)
    /** <code>frecuenciaActParametrica</code> attribute id. */
    public static final String ATTR_ID_FRECUENCIAACTPARAMETRICA = "Clas_1431632084992014Atr_2_Alias";
    /** <code>frecuenciaActParametrica</code> attribute name. */
    public static final String ATTR_NAME_FRECUENCIAACTPARAMETRICA = "frecuenciaActParametrica";
    /** <code>frecuenciaActParametrica</code> attribute alias. */
    public static final String ATTR_ALIAS_FRECUENCIAACTPARAMETRICA = "Paramétrica";

    /** <code>frecuenciaActParametrica</code> attribute facet sequence. */
    public static final String PATH_FACETS_FRECUENCIAACTPARAMETRICA = "";
    /** Agents allowed to view the attribute frecuenciaActParametrica **/
    public static final String FRECUENCIAACTPARAMETRICA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (frecuenciaActFrecuencia)
    /** <code>frecuenciaActFrecuencia</code> attribute id. */
    public static final String ATTR_ID_FRECUENCIAACTFRECUENCIA = "Clas_1431632084992014Atr_3_Alias";
    /** <code>frecuenciaActFrecuencia</code> attribute name. */
    public static final String ATTR_NAME_FRECUENCIAACTFRECUENCIA = "frecuenciaActFrecuencia";
    /** <code>frecuenciaActFrecuencia</code> attribute alias. */
    public static final String ATTR_ALIAS_FRECUENCIAACTFRECUENCIA = "Frecuencia";

    /** <code>frecuenciaActFrecuencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_FRECUENCIAACTFRECUENCIA = "";
    /** Agents allowed to view the attribute frecuenciaActFrecuencia **/
    public static final String FRECUENCIAACTFRECUENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (frecuenciaActFechaUltimaSinc)
    /** <code>frecuenciaActFechaUltimaSinc</code> attribute id. */
    public static final String ATTR_ID_FRECUENCIAACTFECHAULTIMASINC = "Clas_1431632084992014Atr_4_Alias";
    /** <code>frecuenciaActFechaUltimaSinc</code> attribute name. */
    public static final String ATTR_NAME_FRECUENCIAACTFECHAULTIMASINC = "frecuenciaActFechaUltimaSinc";
    /** <code>frecuenciaActFechaUltimaSinc</code> attribute alias. */
    public static final String ATTR_ALIAS_FRECUENCIAACTFECHAULTIMASINC = "Fecha última sinc.";

    /** <code>frecuenciaActFechaUltimaSinc</code> attribute facet sequence. */
    public static final String PATH_FACETS_FRECUENCIAACTFECHAULTIMASINC = "";
    /** Agents allowed to view the attribute frecuenciaActFechaUltimaSinc **/
    public static final String FRECUENCIAACTFECHAULTIMASINC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (frecuenciaActResultadoSinc)
    /** <code>frecuenciaActResultadoSinc</code> attribute id. */
    public static final String ATTR_ID_FRECUENCIAACTRESULTADOSINC = "Clas_1431632084992014Atr_5_Alias";
    /** <code>frecuenciaActResultadoSinc</code> attribute name. */
    public static final String ATTR_NAME_FRECUENCIAACTRESULTADOSINC = "frecuenciaActResultadoSinc";
    /** <code>frecuenciaActResultadoSinc</code> attribute alias. */
    public static final String ATTR_ALIAS_FRECUENCIAACTRESULTADOSINC = "Resultado sinc.";

    /** <code>frecuenciaActResultadoSinc</code> attribute facet sequence. */
    public static final String PATH_FACETS_FRECUENCIAACTRESULTADOSINC = "";
    /** Agents allowed to view the attribute frecuenciaActResultadoSinc **/
    public static final String FRECUENCIAACTRESULTADOSINC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (frecuenciaActUsuario)
    /** <code>frecuenciaActUsuario</code> attribute id. */
    public static final String ATTR_ID_FRECUENCIAACTUSUARIO = "Clas_1431632084992014Atr_6_Alias";
    /** <code>frecuenciaActUsuario</code> attribute name. */
    public static final String ATTR_NAME_FRECUENCIAACTUSUARIO = "frecuenciaActUsuario";
    /** <code>frecuenciaActUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_FRECUENCIAACTUSUARIO = "Usuario";

    /** <code>frecuenciaActUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_FRECUENCIAACTUSUARIO = "";
    /** Agents allowed to view the attribute frecuenciaActUsuario **/
    public static final String FRECUENCIAACTUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (frecuenciaActNombreUsuario)
    /** <code>frecuenciaActNombreUsuario</code> attribute id. */
    public static final String ATTR_ID_FRECUENCIAACTNOMBREUSUARIO = "Clas_1431632084992014Atr_7_Alias";
    /** <code>frecuenciaActNombreUsuario</code> attribute name. */
    public static final String ATTR_NAME_FRECUENCIAACTNOMBREUSUARIO = "frecuenciaActNombreUsuario";
    /** <code>frecuenciaActNombreUsuario</code> attribute alias. */
    public static final String ATTR_ALIAS_FRECUENCIAACTNOMBREUSUARIO = "Nombre";

    /** <code>frecuenciaActNombreUsuario</code> attribute facet sequence. */
    public static final String PATH_FACETS_FRECUENCIAACTNOMBREUSUARIO = "";
    /** Agents allowed to view the attribute frecuenciaActNombreUsuario **/
    public static final String FRECUENCIAACTNOMBREUSUARIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (frecuenciaActdrvNombreParametrica)
    /** <code>frecuenciaActdrvNombreParametrica</code> attribute id. */
    public static final String ATTR_ID_FRECUENCIAACTDRVNOMBREPARAMETRICA = "Clas_1431632084992014Atr_8_Alias";
    /** <code>frecuenciaActdrvNombreParametrica</code> attribute name. */
    public static final String ATTR_NAME_FRECUENCIAACTDRVNOMBREPARAMETRICA = "frecuenciaActdrvNombreParametrica";
    /** <code>frecuenciaActdrvNombreParametrica</code> attribute alias. */
    public static final String ATTR_ALIAS_FRECUENCIAACTDRVNOMBREPARAMETRICA = "Paramétrica";

    /** <code>frecuenciaActdrvNombreParametrica</code> attribute facet sequence. */
    public static final String PATH_FACETS_FRECUENCIAACTDRVNOMBREPARAMETRICA = "";
    /** Agents allowed to view the attribute frecuenciaActdrvNombreParametrica **/
    public static final String FRECUENCIAACTDRVNOMBREPARAMETRICA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_FRECUENCIAACTCODIGO = "Codigo";    
    /** <code>frecuenciaActCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_FRECUENCIAACTCODIGO = "frecuenciaActCodigo";
    // Field (Parametrica)
    /** <code>Parametrica</code> field name. */
    public static final String FLD_FRECUENCIAACTPARAMETRICA = "Parametrica";    
    /** <code>frecuenciaActParametrica</code> attribute field name. */
    public static final String ATTR_FIELD_FRECUENCIAACTPARAMETRICA = "frecuenciaActParametrica";
    // Field (Frecuencia)
    /** <code>Frecuencia</code> field name. */
    public static final String FLD_FRECUENCIAACTFRECUENCIA = "Frecuencia";    
    /** <code>frecuenciaActFrecuencia</code> attribute field name. */
    public static final String ATTR_FIELD_FRECUENCIAACTFRECUENCIA = "frecuenciaActFrecuencia";
    // Field (FechaUltimaSinc)
    /** <code>FechaUltimaSinc</code> field name. */
    public static final String FLD_FRECUENCIAACTFECHAULTIMASINC = "FechaUltimaSinc";    
    /** <code>frecuenciaActFechaUltimaSinc</code> attribute field name. */
    public static final String ATTR_FIELD_FRECUENCIAACTFECHAULTIMASINC = "frecuenciaActFechaUltimaSinc";
    // Field (ResultadoSinc)
    /** <code>ResultadoSinc</code> field name. */
    public static final String FLD_FRECUENCIAACTRESULTADOSINC = "ResultadoSinc";    
    /** <code>ResultadoSinc</code> field length. */
    public static final int FLD_FRECUENCIAACTRESULTADOSINCLENGTH = 255;
    /** <code>frecuenciaActResultadoSinc</code> attribute field name. */
    public static final String ATTR_FIELD_FRECUENCIAACTRESULTADOSINC = "frecuenciaActResultadoSinc";
    // Field (Usuario)
    /** <code>Usuario</code> field name. */
    public static final String FLD_FRECUENCIAACTUSUARIO = "Usuario";    
    /** <code>Usuario</code> field length. */
    public static final int FLD_FRECUENCIAACTUSUARIOLENGTH = 50;
    /** <code>frecuenciaActUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_FRECUENCIAACTUSUARIO = "frecuenciaActUsuario";
    // Field (NombreUsuario)
    /** <code>NombreUsuario</code> field name. */
    public static final String FLD_FRECUENCIAACTNOMBREUSUARIO = "NombreUsuario";    
    /** <code>NombreUsuario</code> field length. */
    public static final int FLD_FRECUENCIAACTNOMBREUSUARIOLENGTH = 255;
    /** <code>frecuenciaActNombreUsuario</code> attribute field name. */
    public static final String ATTR_FIELD_FRECUENCIAACTNOMBREUSUARIO = "frecuenciaActNombreUsuario";



    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431632084992014Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>frecuenciaActcrearpatrParametrica</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FRECUENCIAACTCREARPATRPARAMETRICA = "p_atrParametrica";
    /** <code>frecuenciaActcrearpatrParametrica</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FRECUENCIAACTCREARPATRPARAMETRICA = "Clas_1431632084992014Ser_1Arg_2_Alias";
    /** <code>frecuenciaActcrearpatrParametrica</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FRECUENCIAACTCREARPATRPARAMETRICA = "Paramétrica";
    /** <code>frecuenciaActcrearpatrFrecuencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FRECUENCIAACTCREARPATRFRECUENCIA = "p_atrFrecuencia";
    /** <code>frecuenciaActcrearpatrFrecuencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FRECUENCIAACTCREARPATRFRECUENCIA = "Clas_1431632084992014Ser_1Arg_3_Alias";
    /** <code>frecuenciaActcrearpatrFrecuencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FRECUENCIAACTCREARPATRFRECUENCIA = "Frecuencia";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431632084992014Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>frecuenciaActeliminarpthisFrecuenciaAct</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_FRECUENCIAACTELIMINARPTHISFRECUENCIAACT = "p_thisFrecuenciaAct";
    /** <code>frecuenciaActeliminarpthisFrecuenciaAct</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_FRECUENCIAACTELIMINARPTHISFRECUENCIAACT = "Clas_1431632084992014Ser_2Arg_1_Alias";
    /** <code>frecuenciaActeliminarpthisFrecuenciaAct</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_FRECUENCIAACTELIMINARPTHISFRECUENCIAACT = "Frecuencias act.";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431632084992014Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar frecuencia de actualización de paramétrica";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>frecuenciaActmodificarpthisFrecuenciaAct</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FRECUENCIAACTMODIFICARPTHISFRECUENCIAACT = "p_thisFrecuenciaAct";
    /** <code>frecuenciaActmodificarpthisFrecuenciaAct</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FRECUENCIAACTMODIFICARPTHISFRECUENCIAACT = "Clas_1431632084992014Ser_3Arg_1_Alias";
    /** <code>frecuenciaActmodificarpthisFrecuenciaAct</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FRECUENCIAACTMODIFICARPTHISFRECUENCIAACT = "Frecuencias act.";
    /** <code>frecuenciaActmodificarpFrecuencia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FRECUENCIAACTMODIFICARPFRECUENCIA = "p_Frecuencia";
    /** <code>frecuenciaActmodificarpFrecuencia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FRECUENCIAACTMODIFICARPFRECUENCIA = "Clas_1431632084992014Ser_3Arg_2_Alias";
    /** <code>frecuenciaActmodificarpFrecuencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FRECUENCIAACTMODIFICARPFRECUENCIA = "Frecuencia";
    // Service (fijarSincronizacion)
    /** <code>fijarSincronizacion</code> service id. */
    public static final String SERV_ID_FIJARSINCRONIZACION = "Clas_1431632084992014Ser_4_Alias";
    /** <code>fijarSincronizacion</code> service name. */
    public static final String SERV_NAME_FIJARSINCRONIZACION = "fijarSincronizacion";
    /** <code>fijarSincronizacion</code> service alias. */
    public static final String SERV_ALIAS_FIJARSINCRONIZACION = "fijarSincronizacion";
    /** Agents allowed to execute the service fijarSincronizacion **/
    public static final String FIJARSINCRONIZACION_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>frecuenciaActfijarSincronizacionpthisFrecuenciaAct</code> inbound argument name. */
    public static final String ARG_NAME_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPTHISFRECUENCIAACT = "p_thisFrecuenciaAct";
    /** <code>frecuenciaActfijarSincronizacionpthisFrecuenciaAct</code> inbound argument id. */
    public static final String ARG_ID_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPTHISFRECUENCIAACT = "Clas_1431632084992014Ser_4Arg_1_Alias";
    /** <code>frecuenciaActfijarSincronizacionpthisFrecuenciaAct</code> inbound argument alias. */
    public static final String ARG_ALIAS_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPTHISFRECUENCIAACT = "Frecuencias act.";
    /** <code>frecuenciaActfijarSincronizacionpFechaUltimaSinc</code> inbound argument name. */
    public static final String ARG_NAME_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPFECHAULTIMASINC = "p_FechaUltimaSinc";
    /** <code>frecuenciaActfijarSincronizacionpFechaUltimaSinc</code> inbound argument id. */
    public static final String ARG_ID_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPFECHAULTIMASINC = "Clas_1431632084992014Ser_4Arg_3_Alias";
    /** <code>frecuenciaActfijarSincronizacionpFechaUltimaSinc</code> inbound argument alias. */
    public static final String ARG_ALIAS_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPFECHAULTIMASINC = "Fecha última sinc.";
    /** <code>frecuenciaActfijarSincronizacionpResultadoSinc</code> inbound argument name. */
    public static final String ARG_NAME_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPRESULTADOSINC = "p_ResultadoSinc";
    /** <code>frecuenciaActfijarSincronizacionpResultadoSinc</code> inbound argument id. */
    public static final String ARG_ID_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPRESULTADOSINC = "Clas_1431632084992014Ser_4Arg_4_Alias";
    /** <code>frecuenciaActfijarSincronizacionpResultadoSinc</code> inbound argument alias. */
    public static final String ARG_ALIAS_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPRESULTADOSINC = "Resultado sinc.";
    /** <code>frecuenciaActfijarSincronizacionpUsuario</code> inbound argument name. */
    public static final String ARG_NAME_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPUSUARIO = "p_Usuario";
    /** <code>frecuenciaActfijarSincronizacionpUsuario</code> inbound argument id. */
    public static final String ARG_ID_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPUSUARIO = "Clas_1431632084992014Ser_4Arg_5_Alias";
    /** <code>frecuenciaActfijarSincronizacionpUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPUSUARIO = "Usuario";
    /** <code>frecuenciaActfijarSincronizacionpNombreUsuario</code> inbound argument name. */
    public static final String ARG_NAME_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPNOMBREUSUARIO = "p_NombreUsuario";
    /** <code>frecuenciaActfijarSincronizacionpNombreUsuario</code> inbound argument id. */
    public static final String ARG_ID_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPNOMBREUSUARIO = "Clas_1431632084992014Ser_4Arg_6_Alias";
    /** <code>frecuenciaActfijarSincronizacionpNombreUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_FIJARSINCRONIZACION_FRECUENCIAACTFIJARSINCRONIZACIONPNOMBREUSUARIO = "Nombre";

    public static final String FILTER_NAME_FFRECUENCIAACTVARIOS = "F_FrecuenciaActVarios";
    public static final String VAR_NAME_FFRECUENCIAACTVARIOS_VPARAMETRICA = "v_Parametrica";
    public static final String VAR_NAME_FFRECUENCIAACTVARIOS_VFINI = "v_FIni";
    public static final String VAR_NAME_FFRECUENCIAACTVARIOS_VFFIN = "v_FFin";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_FRECUENCIAACTPARAMETRICA.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_FRECUENCIAACTFRECUENCIA.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_FRECUENCIAACTFECHAULTIMASINC.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_FRECUENCIAACTRESULTADOSINC.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FRECUENCIAACTUSUARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FRECUENCIAACTNOMBREUSUARIO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FRECUENCIAACTDRVNOMBREPARAMETRICA.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_FRECUENCIAACTCODIGO.toUpperCase(), FRECUENCIAACTCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_FRECUENCIAACTPARAMETRICA.toUpperCase(), FRECUENCIAACTPARAMETRICA_AGENTS);
    	attributeAgents.put(ATTR_NAME_FRECUENCIAACTFRECUENCIA.toUpperCase(), FRECUENCIAACTFRECUENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_FRECUENCIAACTFECHAULTIMASINC.toUpperCase(), FRECUENCIAACTFECHAULTIMASINC_AGENTS);
    	attributeAgents.put(ATTR_NAME_FRECUENCIAACTRESULTADOSINC.toUpperCase(), FRECUENCIAACTRESULTADOSINC_AGENTS);
    	attributeAgents.put(ATTR_NAME_FRECUENCIAACTUSUARIO.toUpperCase(), FRECUENCIAACTUSUARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_FRECUENCIAACTNOMBREUSUARIO.toUpperCase(), FRECUENCIAACTNOMBREUSUARIO_AGENTS);
    	attributeAgents.put(ATTR_NAME_FRECUENCIAACTDRVNOMBREPARAMETRICA.toUpperCase(), FRECUENCIAACTDRVNOMBREPARAMETRICA_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'FrecuenciaAct', it returns the identification keys
     * - If className is a facet of the inheritance net of 'FrecuenciaAct', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_FRECUENCIAACTCODIGO);
        }
        // Facet 'FrecuenciaAct' (This facet)
        if (FrecuenciaActConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_FRECUENCIAACTCODIGO);
        }
        return returnList;
    }
}
