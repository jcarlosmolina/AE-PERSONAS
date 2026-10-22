package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>TipoNovedad</code> model class.
 */
public final class TipoNovedadConstants {

    private TipoNovedadConstants() {

    }

    // Class
    /** <code>TipoNovedad</code> class id. */
    public static final String CLASS_ID = "Clas_1581411467264384_Alias";
    /** <code>TipoNovedad</code> class name. */
    public static final String CLASS_NAME = "TipoNovedad";
    /** <code>TipoNovedad</code> class alias. */
    public static final String CLASS_ALIAS = "Tipo Novedad";
    /** <code>TipoNovedad</code> class table name. */
    public static final String TBL_NAME = "TipoNovedad";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "tipoNovedadTipo,tipoNovedadAliasTipo,tipoNovedadNombre,tipoNovedadDescripcion,tipoNovedadCodigoLegal";

    public static final String DSDSTIPONOVEDAD = "DS_TipoNovedad";
    public static final String DSICTIPONOVEDAD = "IC_TipoNovedad";
    public static final String DSDSTIPONOVEDADNULL = "DS_TipoNovedad_Null";
    

    // Attribute (tipoNovedadTipo)
    /** <code>tipoNovedadTipo</code> attribute id. */
    public static final String ATTR_ID_TIPONOVEDADTIPO = "Clas_1581411467264384Atr_2_Alias";
    /** <code>tipoNovedadTipo</code> attribute name. */
    public static final String ATTR_NAME_TIPONOVEDADTIPO = "tipoNovedadTipo";
    /** <code>tipoNovedadTipo</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPONOVEDADTIPO = "Tipo";

    /** <code>tipoNovedadTipo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPONOVEDADTIPO = "";
    /** Agents allowed to view the attribute tipoNovedadTipo **/
    public static final String TIPONOVEDADTIPO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoNovedadAliasTipo)
    /** <code>tipoNovedadAliasTipo</code> attribute id. */
    public static final String ATTR_ID_TIPONOVEDADALIASTIPO = "Clas_1581411467264384Atr_3_Alias";
    /** <code>tipoNovedadAliasTipo</code> attribute name. */
    public static final String ATTR_NAME_TIPONOVEDADALIASTIPO = "tipoNovedadAliasTipo";
    /** <code>tipoNovedadAliasTipo</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPONOVEDADALIASTIPO = "Alias";

    /** <code>tipoNovedadAliasTipo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPONOVEDADALIASTIPO = "";
    /** Agents allowed to view the attribute tipoNovedadAliasTipo **/
    public static final String TIPONOVEDADALIASTIPO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoNovedadNombre)
    /** <code>tipoNovedadNombre</code> attribute id. */
    public static final String ATTR_ID_TIPONOVEDADNOMBRE = "Clas_1581411467264384Atr_4_Alias";
    /** <code>tipoNovedadNombre</code> attribute name. */
    public static final String ATTR_NAME_TIPONOVEDADNOMBRE = "tipoNovedadNombre";
    /** <code>tipoNovedadNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPONOVEDADNOMBRE = "Nombre";

    /** <code>tipoNovedadNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPONOVEDADNOMBRE = "";
    /** Agents allowed to view the attribute tipoNovedadNombre **/
    public static final String TIPONOVEDADNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoNovedadDescripcion)
    /** <code>tipoNovedadDescripcion</code> attribute id. */
    public static final String ATTR_ID_TIPONOVEDADDESCRIPCION = "Clas_1581411467264384Atr_5_Alias";
    /** <code>tipoNovedadDescripcion</code> attribute name. */
    public static final String ATTR_NAME_TIPONOVEDADDESCRIPCION = "tipoNovedadDescripcion";
    /** <code>tipoNovedadDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPONOVEDADDESCRIPCION = "Descripción";

    /** <code>tipoNovedadDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPONOVEDADDESCRIPCION = "";
    /** Agents allowed to view the attribute tipoNovedadDescripcion **/
    public static final String TIPONOVEDADDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (tipoNovedadCodigoLegal)
    /** <code>tipoNovedadCodigoLegal</code> attribute id. */
    public static final String ATTR_ID_TIPONOVEDADCODIGOLEGAL = "Clas_1581411467264384Atr_6_Alias";
    /** <code>tipoNovedadCodigoLegal</code> attribute name. */
    public static final String ATTR_NAME_TIPONOVEDADCODIGOLEGAL = "tipoNovedadCodigoLegal";
    /** <code>tipoNovedadCodigoLegal</code> attribute alias. */
    public static final String ATTR_ALIAS_TIPONOVEDADCODIGOLEGAL = "Código Legal";

    /** <code>tipoNovedadCodigoLegal</code> attribute facet sequence. */
    public static final String PATH_FACETS_TIPONOVEDADCODIGOLEGAL = "";
    /** Agents allowed to view the attribute tipoNovedadCodigoLegal **/
    public static final String TIPONOVEDADCODIGOLEGAL_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Tipo)
    /** <code>Tipo</code> field name. */
    public static final String FLD_TIPONOVEDADTIPO = "Tipo";    
    /** <code>tipoNovedadTipo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPONOVEDADTIPO = "tipoNovedadTipo";
    // Field (AliasTipo)
    /** <code>AliasTipo</code> field name. */
    public static final String FLD_TIPONOVEDADALIASTIPO = "AliasTipo";    
    /** <code>AliasTipo</code> field length. */
    public static final int FLD_TIPONOVEDADALIASTIPOLENGTH = 50;
    /** <code>tipoNovedadAliasTipo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPONOVEDADALIASTIPO = "tipoNovedadAliasTipo";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_TIPONOVEDADNOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_TIPONOVEDADNOMBRELENGTH = 50;
    /** <code>tipoNovedadNombre</code> attribute field name. */
    public static final String ATTR_FIELD_TIPONOVEDADNOMBRE = "tipoNovedadNombre";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_TIPONOVEDADDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_TIPONOVEDADDESCRIPCIONLENGTH = 200;
    /** <code>tipoNovedadDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_TIPONOVEDADDESCRIPCION = "tipoNovedadDescripcion";
    // Field (CodigoLegal)
    /** <code>CodigoLegal</code> field name. */
    public static final String FLD_TIPONOVEDADCODIGOLEGAL = "CodigoLegal";    
    /** <code>CodigoLegal</code> field length. */
    public static final int FLD_TIPONOVEDADCODIGOLEGALLENGTH = 5;
    /** <code>tipoNovedadCodigoLegal</code> attribute field name. */
    public static final String ATTR_FIELD_TIPONOVEDADCODIGOLEGAL = "tipoNovedadCodigoLegal";


    // Compound role (Novedades)
    /** <code>Novedades</code> role id. */
    public static final String ROLE_ID_NOVEDADES = "Agr_1581412253696882_Alias";
    /** <code>Novedades</code> role name. */
    public static final String ROLE_NAME_NOVEDADES = "novedades";
    /** <code>TipoNovedad</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADES = "Novedades";


    /** <code>Novedades</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADES = NovedadConstants.ROLE_NAME_TIPONOVEDAD;
    /** <code>Novedades</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADES = "";
    /** <code>Novedades</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADES = NovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through Novedades **/
    public static final String NOVEDADES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1581411467264384Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tipoNovedadcrearpatrTipo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPONOVEDADCREARPATRTIPO = "p_atrTipo";
    /** <code>tipoNovedadcrearpatrTipo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPONOVEDADCREARPATRTIPO = "Clas_1581411467264384Ser_1Arg_2_Alias";
    /** <code>tipoNovedadcrearpatrTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPONOVEDADCREARPATRTIPO = "Tipo";
    /** <code>tipoNovedadcrearpatrAliasTipo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPONOVEDADCREARPATRALIASTIPO = "p_atrAliasTipo";
    /** <code>tipoNovedadcrearpatrAliasTipo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPONOVEDADCREARPATRALIASTIPO = "Clas_1581411467264384Ser_1Arg_3_Alias";
    /** <code>tipoNovedadcrearpatrAliasTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPONOVEDADCREARPATRALIASTIPO = "Alias";
    /** <code>tipoNovedadcrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPONOVEDADCREARPATRNOMBRE = "p_atrNombre";
    /** <code>tipoNovedadcrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPONOVEDADCREARPATRNOMBRE = "Clas_1581411467264384Ser_1Arg_4_Alias";
    /** <code>tipoNovedadcrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPONOVEDADCREARPATRNOMBRE = "Nombre";
    /** <code>tipoNovedadcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPONOVEDADCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>tipoNovedadcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPONOVEDADCREARPATRDESCRIPCION = "Clas_1581411467264384Ser_1Arg_5_Alias";
    /** <code>tipoNovedadcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPONOVEDADCREARPATRDESCRIPCION = "Descripción";
    /** <code>tipoNovedadcrearpatrCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TIPONOVEDADCREARPATRCODIGOLEGAL = "p_atrCodigoLegal";
    /** <code>tipoNovedadcrearpatrCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TIPONOVEDADCREARPATRCODIGOLEGAL = "Clas_1581411467264384Ser_1Arg_6_Alias";
    /** <code>tipoNovedadcrearpatrCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TIPONOVEDADCREARPATRCODIGOLEGAL = "Código Legal";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1581411467264384Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tipoNovedadeliminarpthisTipoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_TIPONOVEDADELIMINARPTHISTIPONOVEDAD = "p_thisTipoNovedad";
    /** <code>tipoNovedadeliminarpthisTipoNovedad</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_TIPONOVEDADELIMINARPTHISTIPONOVEDAD = "Clas_1581411467264384Ser_2Arg_1_Alias";
    /** <code>tipoNovedadeliminarpthisTipoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_TIPONOVEDADELIMINARPTHISTIPONOVEDAD = "Tipo Novedad";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1581411467264384Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>tipoNovedadmodificarpthisTipoNovedad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPONOVEDADMODIFICARPTHISTIPONOVEDAD = "p_thisTipoNovedad";
    /** <code>tipoNovedadmodificarpthisTipoNovedad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPONOVEDADMODIFICARPTHISTIPONOVEDAD = "Clas_1581411467264384Ser_3Arg_1_Alias";
    /** <code>tipoNovedadmodificarpthisTipoNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPONOVEDADMODIFICARPTHISTIPONOVEDAD = "Tipo Novedad";
    /** <code>tipoNovedadmodificarpAliasTipo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPONOVEDADMODIFICARPALIASTIPO = "p_AliasTipo";
    /** <code>tipoNovedadmodificarpAliasTipo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPONOVEDADMODIFICARPALIASTIPO = "Clas_1581411467264384Ser_3Arg_2_Alias";
    /** <code>tipoNovedadmodificarpAliasTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPONOVEDADMODIFICARPALIASTIPO = "Alias";
    /** <code>tipoNovedadmodificarpNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPONOVEDADMODIFICARPNOMBRE = "p_Nombre";
    /** <code>tipoNovedadmodificarpNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPONOVEDADMODIFICARPNOMBRE = "Clas_1581411467264384Ser_3Arg_3_Alias";
    /** <code>tipoNovedadmodificarpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPONOVEDADMODIFICARPNOMBRE = "Nombre";
    /** <code>tipoNovedadmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPONOVEDADMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>tipoNovedadmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPONOVEDADMODIFICARPDESCRIPCION = "Clas_1581411467264384Ser_3Arg_4_Alias";
    /** <code>tipoNovedadmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPONOVEDADMODIFICARPDESCRIPCION = "Descripción";
    /** <code>tipoNovedadmodificarpCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TIPONOVEDADMODIFICARPCODIGOLEGAL = "p_CodigoLegal";
    /** <code>tipoNovedadmodificarpCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TIPONOVEDADMODIFICARPCODIGOLEGAL = "Clas_1581411467264384Ser_3Arg_5_Alias";
    /** <code>tipoNovedadmodificarpCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TIPONOVEDADMODIFICARPCODIGOLEGAL = "Código Legal";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_TIPONOVEDADALIASTIPO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPONOVEDADNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPONOVEDADDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TIPONOVEDADCODIGOLEGAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_TIPONOVEDADTIPO.toUpperCase(), TIPONOVEDADTIPO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPONOVEDADALIASTIPO.toUpperCase(), TIPONOVEDADALIASTIPO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPONOVEDADNOMBRE.toUpperCase(), TIPONOVEDADNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPONOVEDADDESCRIPCION.toUpperCase(), TIPONOVEDADDESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_TIPONOVEDADCODIGOLEGAL.toUpperCase(), TIPONOVEDADCODIGOLEGAL_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'TipoNovedad', it returns the identification keys
     * - If className is a facet of the inheritance net of 'TipoNovedad', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_TIPONOVEDADTIPO);
        }
        // Facet 'TipoNovedad' (This facet)
        if (TipoNovedadConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_TIPONOVEDADTIPO);
        }
        return returnList;
    }
}
