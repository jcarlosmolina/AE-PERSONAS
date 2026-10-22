package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>EstadoBeneficiarioAE</code> model class.
 */
public final class EstadoBeneficiarioAEConstants {

    private EstadoBeneficiarioAEConstants() {

    }

    // Class
    /** <code>EstadoBeneficiarioAE</code> class id. */
    public static final String CLASS_ID = "Clas_1431711383552943_Alias";
    /** <code>EstadoBeneficiarioAE</code> class name. */
    public static final String CLASS_NAME = "EstadoBeneficiarioAE";
    /** <code>EstadoBeneficiarioAE</code> class alias. */
    public static final String CLASS_ALIAS = "Estado beneficiario AE";
    /** <code>EstadoBeneficiarioAE</code> class table name. */
    public static final String TBL_NAME = "EstadoBeneficiarioAE";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "estadoBeneficiarioAECodigo,estadoBeneficiarioEstadoBeneficiarioCORECodigo,estadoBeneficiarioAEDescripcion";

    public static final String DSICESTADOBENEFICIARIOAE = "IC_EstadoBeneficiarioAE";
    public static final String DSDSESTADOBENEFICIARIOAEPIU = "DS_EstadoBeneficiarioAE_PIU";
    

    // Attribute (estadoBeneficiarioAECodigo)
    /** <code>estadoBeneficiarioAECodigo</code> attribute id. */
    public static final String ATTR_ID_ESTADOBENEFICIARIOAECODIGO = "Clas_1431711383552943Atr_1_Alias";
    /** <code>estadoBeneficiarioAECodigo</code> attribute name. */
    public static final String ATTR_NAME_ESTADOBENEFICIARIOAECODIGO = "estadoBeneficiarioAECodigo";
    /** <code>estadoBeneficiarioAECodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOBENEFICIARIOAECODIGO = "Código";

    /** <code>estadoBeneficiarioAECodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIOAECODIGO = "";
    /** Agents allowed to view the attribute estadoBeneficiarioAECodigo **/
    public static final String ESTADOBENEFICIARIOAECODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (estadoBeneficiarioAEDescripcion)
    /** <code>estadoBeneficiarioAEDescripcion</code> attribute id. */
    public static final String ATTR_ID_ESTADOBENEFICIARIOAEDESCRIPCION = "Clas_1431711383552943Atr_2_Alias";
    /** <code>estadoBeneficiarioAEDescripcion</code> attribute name. */
    public static final String ATTR_NAME_ESTADOBENEFICIARIOAEDESCRIPCION = "estadoBeneficiarioAEDescripcion";
    /** <code>estadoBeneficiarioAEDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_ESTADOBENEFICIARIOAEDESCRIPCION = "Descripción";

    /** <code>estadoBeneficiarioAEDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIOAEDESCRIPCION = "";
    /** Agents allowed to view the attribute estadoBeneficiarioAEDescripcion **/
    public static final String ESTADOBENEFICIARIOAEDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIOAECODIGO = "Codigo";    
    /** <code>estadoBeneficiarioAECodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIOAECODIGO = "estadoBeneficiarioAECodigo";
    // Field (EstadoBeneficiarioCORE_Codigo)
    /** <code>EstadoBeneficiarioCORE_Codigo</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIOESTADOBENEFICIARIOCORECODIGO = "EstadoBeneficiarioCORE_Codigo";    
    /** <code>EstadoBeneficiarioCORE.estadoBeneficiarioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOCODIGO = "estadoBeneficiarioEstadoBeneficiarioCORECodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_ESTADOBENEFICIARIOAEDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_ESTADOBENEFICIARIOAEDESCRIPCIONLENGTH = 150;
    /** <code>estadoBeneficiarioAEDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_ESTADOBENEFICIARIOAEDESCRIPCION = "estadoBeneficiarioAEDescripcion";

    // Component role (EstadoBeneficiarioCORE)
    /** <code>EstadoBeneficiarioCORE</code> role id. */
    public static final String ROLE_ID_ESTADOBENEFICIARIOCORE = "Agr_1431711383552248_Alias";
    /** <code>EstadoBeneficiarioCORE</code> role name. */
    public static final String ROLE_NAME_ESTADOBENEFICIARIOCORE = "estadoBeneficiarioCORE";
    /** <code>EstadoBeneficiarioCORE</code> role alias. */
    public static final String ROLE_ALIAS_ESTADOBENEFICIARIOCORE = "Estado beneficiario CORE";

    /** <code>EstadoBeneficiarioCORE</code> inverse role name. */
    public static final String ROLE_INVNAME_ESTADOBENEFICIARIOCORE = EstadoBeneficiarioConstants.ROLE_NAME_ESTADOBENEFICIARIOAE;
    /** <code>EstadoBeneficiarioCORE</code> role facet sequence. */
    public static final String PATH_FACETS_ESTADOBENEFICIARIOCORE = "";
    /** <code>EstadoBeneficiarioCORE</code> role target class. */
    public static final String ROLE_TARGET_ESTADOBENEFICIARIOCORE = EstadoBeneficiarioConstants.CLASS_NAME;

    /** Agents allowed to navigate through EstadoBeneficiarioCORE **/
    public static final String ESTADOBENEFICIARIOCORE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431711383552943Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear estado beneficiario";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoBeneficiarioAEcrearpagrEstadoBeneficiarioCORE</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOBENEFICIARIOAECREARPAGRESTADOBENEFICIARIOCORE = "p_agrEstadoBeneficiarioCORE";
    /** <code>estadoBeneficiarioAEcrearpagrEstadoBeneficiarioCORE</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOBENEFICIARIOAECREARPAGRESTADOBENEFICIARIOCORE = "Clas_1431711383552943Ser_1Arg_3_Alias";
    /** <code>estadoBeneficiarioAEcrearpagrEstadoBeneficiarioCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOBENEFICIARIOAECREARPAGRESTADOBENEFICIARIOCORE = "Estado beneficiario CORE";
    /** <code>estadoBeneficiarioAEcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ESTADOBENEFICIARIOAECREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>estadoBeneficiarioAEcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ESTADOBENEFICIARIOAECREARPATRDESCRIPCION = "Clas_1431711383552943Ser_1Arg_2_Alias";
    /** <code>estadoBeneficiarioAEcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ESTADOBENEFICIARIOAECREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431711383552943Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar estado beneficiario";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>estadoBeneficiarioAEeliminarpthisEstadoBeneficiarioAE</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ESTADOBENEFICIARIOAEELIMINARPTHISESTADOBENEFICIARIOAE = "p_thisEstadoBeneficiarioAE";
    /** <code>estadoBeneficiarioAEeliminarpthisEstadoBeneficiarioAE</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ESTADOBENEFICIARIOAEELIMINARPTHISESTADOBENEFICIARIOAE = "Clas_1431711383552943Ser_2Arg_1_Alias";
    /** <code>estadoBeneficiarioAEeliminarpthisEstadoBeneficiarioAE</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ESTADOBENEFICIARIOAEELIMINARPTHISESTADOBENEFICIARIOAE = "Estado beneficiario AE";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431711383552943Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoBeneficiarioAEmodificarpthisEstadoBeneficiarioAE</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOBENEFICIARIOAEMODIFICARPTHISESTADOBENEFICIARIOAE = "p_thisEstadoBeneficiarioAE";
    /** <code>estadoBeneficiarioAEmodificarpthisEstadoBeneficiarioAE</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOBENEFICIARIOAEMODIFICARPTHISESTADOBENEFICIARIOAE = "Clas_1431711383552943Ser_3Arg_1_Alias";
    /** <code>estadoBeneficiarioAEmodificarpthisEstadoBeneficiarioAE</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOBENEFICIARIOAEMODIFICARPTHISESTADOBENEFICIARIOAE = "Estado beneficiario AE";
    /** <code>estadoBeneficiarioAEmodificarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_ESTADOBENEFICIARIOAEMODIFICARPDESCRIPCION = "p_Descripcion";
    /** <code>estadoBeneficiarioAEmodificarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_ESTADOBENEFICIARIOAEMODIFICARPDESCRIPCION = "Clas_1431711383552943Ser_3Arg_2_Alias";
    /** <code>estadoBeneficiarioAEmodificarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_ESTADOBENEFICIARIOAEMODIFICARPDESCRIPCION = "Descripción";
    // Service (CambEstadoBeneficiarioCORE)
    /** <code>CambEstadoBeneficiarioCORE</code> service id. */
    public static final String SERV_ID_CAMBESTADOBENEFICIARIOCORE = "Clas_1431711383552943Ser_4_Alias";
    /** <code>CambEstadoBeneficiarioCORE</code> service name. */
    public static final String SERV_NAME_CAMBESTADOBENEFICIARIOCORE = "CambEstadoBeneficiarioCORE";
    /** <code>CambEstadoBeneficiarioCORE</code> service alias. */
    public static final String SERV_ALIAS_CAMBESTADOBENEFICIARIOCORE = "CambEstadoBeneficiarioCORE";
    /** Agents allowed to execute the service CambEstadoBeneficiarioCORE **/
    public static final String CAMBESTADOBENEFICIARIOCORE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>estadoBeneficiarioAECambEstadoBeneficiarioCOREpthisEstadoBeneficiarioAE</code> inbound argument name. */
    public static final String ARG_NAME_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOAECAMBESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIOAE = "p_thisEstadoBeneficiarioAE";
    /** <code>estadoBeneficiarioAECambEstadoBeneficiarioCOREpthisEstadoBeneficiarioAE</code> inbound argument id. */
    public static final String ARG_ID_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOAECAMBESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIOAE = "Clas_1431711383552943Ser_4Arg_1_Alias";
    /** <code>estadoBeneficiarioAECambEstadoBeneficiarioCOREpthisEstadoBeneficiarioAE</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOAECAMBESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIOAE = "Estado beneficiario AE";
    /** <code>estadoBeneficiarioAECambEstadoBeneficiarioCOREpevcEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOAECAMBESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO = "p_evcEstadoBeneficiario";
    /** <code>estadoBeneficiarioAECambEstadoBeneficiarioCOREpevcEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOAECAMBESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO = "Clas_1431711383552943Ser_4Arg_2_Alias";
    /** <code>estadoBeneficiarioAECambEstadoBeneficiarioCOREpevcEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOAECAMBESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO = "Estado beneficiario CORE";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1431711383552943Ser_5_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar estado beneficiario";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>estadoBeneficiarioAETMODIFICARpthisEstadoBeneficiarioAE</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ESTADOBENEFICIARIOAETMODIFICARPTHISESTADOBENEFICIARIOAE = "p_thisEstadoBeneficiarioAE";
    /** <code>estadoBeneficiarioAETMODIFICARpthisEstadoBeneficiarioAE</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ESTADOBENEFICIARIOAETMODIFICARPTHISESTADOBENEFICIARIOAE = "Clas_1431711383552943Ser_5Arg_1_Alias";
    /** <code>estadoBeneficiarioAETMODIFICARpthisEstadoBeneficiarioAE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ESTADOBENEFICIARIOAETMODIFICARPTHISESTADOBENEFICIARIOAE = "Estado beneficiario AE";
    /** <code>estadoBeneficiarioAETMODIFICARptpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ESTADOBENEFICIARIOAETMODIFICARPTPDESCRIPCION = "pt_p_Descripcion";
    /** <code>estadoBeneficiarioAETMODIFICARptpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ESTADOBENEFICIARIOAETMODIFICARPTPDESCRIPCION = "Clas_1431711383552943Ser_5Arg_2_Alias";
    /** <code>estadoBeneficiarioAETMODIFICARptpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ESTADOBENEFICIARIOAETMODIFICARPTPDESCRIPCION = "Descripción";
    /** <code>estadoBeneficiarioAETMODIFICARptpevcEstadoBeneficiario</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_ESTADOBENEFICIARIOAETMODIFICARPTPEVCESTADOBENEFICIARIO = "pt_p_evcEstadoBeneficiario";
    /** <code>estadoBeneficiarioAETMODIFICARptpevcEstadoBeneficiario</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_ESTADOBENEFICIARIOAETMODIFICARPTPEVCESTADOBENEFICIARIO = "Clas_1431711383552943Ser_5Arg_3_Alias";
    /** <code>estadoBeneficiarioAETMODIFICARptpevcEstadoBeneficiario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_ESTADOBENEFICIARIOAETMODIFICARPTPEVCESTADOBENEFICIARIO = "Estado beneficiario CORE";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ESTADOBENEFICIARIOAEDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ESTADOBENEFICIARIOAECODIGO.toUpperCase(), ESTADOBENEFICIARIOAECODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ESTADOBENEFICIARIOAEDESCRIPCION.toUpperCase(), ESTADOBENEFICIARIOAEDESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_ESTADOBENEFICIARIOCORE.toUpperCase(), ESTADOBENEFICIARIOCORE_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'EstadoBeneficiarioAE', it returns the identification keys
     * - If className is a facet of the inheritance net of 'EstadoBeneficiarioAE', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ESTADOBENEFICIARIOAECODIGO);
        }
        // Facet 'EstadoBeneficiarioAE' (This facet)
        if (EstadoBeneficiarioAEConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ESTADOBENEFICIARIOAECODIGO);
        }
        return returnList;
    }
}
