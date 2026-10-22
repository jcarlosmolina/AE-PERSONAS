package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Sucursal</code> model class.
 */
public final class SucursalConstants {

    private SucursalConstants() {

    }

    // Class
    /** <code>Sucursal</code> class id. */
    public static final String CLASS_ID = "Clas_1431874043904178_Alias";
    /** <code>Sucursal</code> class name. */
    public static final String CLASS_NAME = "Sucursal";
    /** <code>Sucursal</code> class alias. */
    public static final String CLASS_ALIAS = "Sucursal";
    /** <code>Sucursal</code> class table name. */
    public static final String TBL_NAME = "Sucursal";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "sucursalCodigo,regionalRegionalCodigo,sucursalDescripcion";

    public static final String DSICSUCURSAL = "IC_Sucursal";
    public static final String DSDSSUCURSALPIU = "DS_Sucursal_PIU";
    

    // Attribute (sucursalCodigo)
    /** <code>sucursalCodigo</code> attribute id. */
    public static final String ATTR_ID_SUCURSALCODIGO = "Clas_1431874043904178Atr_1_Alias";
    /** <code>sucursalCodigo</code> attribute name. */
    public static final String ATTR_NAME_SUCURSALCODIGO = "sucursalCodigo";
    /** <code>sucursalCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_SUCURSALCODIGO = "Código";

    /** <code>sucursalCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_SUCURSALCODIGO = "";
    /** Agents allowed to view the attribute sucursalCodigo **/
    public static final String SUCURSALCODIGO_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (sucursalDescripcion)
    /** <code>sucursalDescripcion</code> attribute id. */
    public static final String ATTR_ID_SUCURSALDESCRIPCION = "Clas_1431874043904178Atr_2_Alias";
    /** <code>sucursalDescripcion</code> attribute name. */
    public static final String ATTR_NAME_SUCURSALDESCRIPCION = "sucursalDescripcion";
    /** <code>sucursalDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_SUCURSALDESCRIPCION = "Descripción";

    /** <code>sucursalDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_SUCURSALDESCRIPCION = "";
    /** Agents allowed to view the attribute sucursalDescripcion **/
    public static final String SUCURSALDESCRIPCION_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_SUCURSALCODIGO = "Codigo";    
    /** <code>sucursalCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_SUCURSALCODIGO = "sucursalCodigo";
    // Field (Regional_Codigo)
    /** <code>Regional_Codigo</code> field name. */
    public static final String FLD_REGIONALREGIONALCODIGO = "Regional_Codigo";    
    /** <code>Regional.regionalCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_REGIONAL_REGIONALCODIGO = "regionalRegionalCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_SUCURSALDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_SUCURSALDESCRIPCIONLENGTH = 200;
    /** <code>sucursalDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_SUCURSALDESCRIPCION = "sucursalDescripcion";

    // Component role (Regional)
    /** <code>Regional</code> role id. */
    public static final String ROLE_ID_REGIONAL = "Agr_1431874174976463_Alias";
    /** <code>Regional</code> role name. */
    public static final String ROLE_NAME_REGIONAL = "regional";
    /** <code>Regional</code> role alias. */
    public static final String ROLE_ALIAS_REGIONAL = "Regional";

    /** <code>Regional</code> inverse role name. */
    public static final String ROLE_INVNAME_REGIONAL = RegionalConstants.ROLE_NAME_SUCURSALES;
    /** <code>Regional</code> role facet sequence. */
    public static final String PATH_FACETS_REGIONAL = "";
    /** <code>Regional</code> role target class. */
    public static final String ROLE_TARGET_REGIONAL = RegionalConstants.CLASS_NAME;

    /** Agents allowed to navigate through Regional **/
    public static final String REGIONAL_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Agentes)
    /** <code>Agentes</code> role id. */
    public static final String ROLE_ID_AGENTES = "Agr_1433432883200373_Alias";
    /** <code>Agentes</code> role name. */
    public static final String ROLE_NAME_AGENTES = "agentes";
    /** <code>Sucursal</code> role alias. */
    public static final String ROLE_ALIAS_AGENTES = "Agentes";


    /** <code>Agentes</code> inverse role name. */
    public static final String ROLE_INVNAME_AGENTES = FuncionarioConstants.ROLE_NAME_SUCURSAL;
    /** <code>Agentes</code> role facet sequence. */
    public static final String PATH_FACETS_AGENTES = "";
    /** <code>Agentes</code> role target class. */
    public static final String ROLE_TARGET_AGENTES = FuncionarioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Agentes **/
    public static final String AGENTES_AGENTS = "Admin,SuperAdmin,RespRegional,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1473350467584903_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>SucursalC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_SUCURSALC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431874043904178Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear sucursal";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>sucursalcrearpagrRegional</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SUCURSALCREARPAGRREGIONAL = "p_agrRegional";
    /** <code>sucursalcrearpagrRegional</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SUCURSALCREARPAGRREGIONAL = "Clas_1431874043904178Ser_1Arg_4_Alias";
    /** <code>sucursalcrearpagrRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SUCURSALCREARPAGRREGIONAL = "Regional";
    /** <code>sucursalcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SUCURSALCREARPATRCODIGO = "p_atrCodigo";
    /** <code>sucursalcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SUCURSALCREARPATRCODIGO = "Clas_1431874043904178Ser_1Arg_1_Alias";
    /** <code>sucursalcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SUCURSALCREARPATRCODIGO = "Código";
    /** <code>sucursalcrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_SUCURSALCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>sucursalcrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_SUCURSALCREARPATRDESCRIPCION = "Clas_1431874043904178Ser_1Arg_2_Alias";
    /** <code>sucursalcrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_SUCURSALCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431874043904178Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar sucursal";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>sucursaleliminarpthisSucursal</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_SUCURSALELIMINARPTHISSUCURSAL = "p_thisSucursal";
    /** <code>sucursaleliminarpthisSucursal</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_SUCURSALELIMINARPTHISSUCURSAL = "Clas_1431874043904178Ser_2Arg_1_Alias";
    /** <code>sucursaleliminarpthisSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_SUCURSALELIMINARPTHISSUCURSAL = "Sucursal";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431874043904178Ser_3_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>sucursalsincronizarpthisSucursal</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_SUCURSALSINCRONIZARPTHISSUCURSAL = "p_thisSucursal";
    /** <code>sucursalsincronizarpthisSucursal</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_SUCURSALSINCRONIZARPTHISSUCURSAL = "Clas_1431874043904178Ser_3Arg_1_Alias";
    /** <code>sucursalsincronizarpthisSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_SUCURSALSINCRONIZARPTHISSUCURSAL = "Sucursal";
    /** <code>sucursalsincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_SUCURSALSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>sucursalsincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_SUCURSALSINCRONIZARPDESCRIPCION = "Clas_1431874043904178Ser_3Arg_2_Alias";
    /** <code>sucursalsincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_SUCURSALSINCRONIZARPDESCRIPCION = "Descripción";
    // Service (CambRegionalSucursal)
    /** <code>CambRegionalSucursal</code> service id. */
    public static final String SERV_ID_CAMBREGIONALSUCURSAL = "Clas_1431874043904178Ser_4_Alias";
    /** <code>CambRegionalSucursal</code> service name. */
    public static final String SERV_NAME_CAMBREGIONALSUCURSAL = "CambRegionalSucursal";
    /** <code>CambRegionalSucursal</code> service alias. */
    public static final String SERV_ALIAS_CAMBREGIONALSUCURSAL = "CambRegionalSucursal";
    /** Agents allowed to execute the service CambRegionalSucursal **/
    public static final String CAMBREGIONALSUCURSAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>sucursalCambRegionalSucursalpthisSucursal</code> inbound argument name. */
    public static final String ARG_NAME_CAMBREGIONALSUCURSAL_SUCURSALCAMBREGIONALSUCURSALPTHISSUCURSAL = "p_thisSucursal";
    /** <code>sucursalCambRegionalSucursalpthisSucursal</code> inbound argument id. */
    public static final String ARG_ID_CAMBREGIONALSUCURSAL_SUCURSALCAMBREGIONALSUCURSALPTHISSUCURSAL = "Clas_1431874043904178Ser_4Arg_1_Alias";
    /** <code>sucursalCambRegionalSucursalpthisSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBREGIONALSUCURSAL_SUCURSALCAMBREGIONALSUCURSALPTHISSUCURSAL = "Sucursales";
    /** <code>sucursalCambRegionalSucursalpevcRegional</code> inbound argument name. */
    public static final String ARG_NAME_CAMBREGIONALSUCURSAL_SUCURSALCAMBREGIONALSUCURSALPEVCREGIONAL = "p_evcRegional";
    /** <code>sucursalCambRegionalSucursalpevcRegional</code> inbound argument id. */
    public static final String ARG_ID_CAMBREGIONALSUCURSAL_SUCURSALCAMBREGIONALSUCURSALPEVCREGIONAL = "Clas_1431874043904178Ser_4Arg_2_Alias";
    /** <code>sucursalCambRegionalSucursalpevcRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBREGIONALSUCURSAL_SUCURSALCAMBREGIONALSUCURSALPEVCREGIONAL = "Regional";
    // Service (CambSucursalAgente)
    /** <code>CambSucursalAgente</code> service id. */
    public static final String SERV_ID_CAMBSUCURSALAGENTE = "Clas_1431874043904178Ser_9_Alias";
    /** <code>CambSucursalAgente</code> service name. */
    public static final String SERV_NAME_CAMBSUCURSALAGENTE = "CambSucursalAgente";
    /** <code>CambSucursalAgente</code> service alias. */
    public static final String SERV_ALIAS_CAMBSUCURSALAGENTE = "CambSucursalAgente";
    /** Agents allowed to execute the service CambSucursalAgente **/
    public static final String CAMBSUCURSALAGENTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>sucursalCambSucursalAgentepthisSucursal</code> inbound argument name. */
    public static final String ARG_NAME_CAMBSUCURSALAGENTE_SUCURSALCAMBSUCURSALAGENTEPTHISSUCURSAL = "p_thisSucursal";
    /** <code>sucursalCambSucursalAgentepthisSucursal</code> inbound argument id. */
    public static final String ARG_ID_CAMBSUCURSALAGENTE_SUCURSALCAMBSUCURSALAGENTEPTHISSUCURSAL = "Clas_1431874043904178Ser_9Arg_1_Alias";
    /** <code>sucursalCambSucursalAgentepthisSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBSUCURSALAGENTE_SUCURSALCAMBSUCURSALAGENTEPTHISSUCURSAL = "Sucursal";
    /** <code>sucursalCambSucursalAgentepevcFuncionario</code> inbound argument name. */
    public static final String ARG_NAME_CAMBSUCURSALAGENTE_SUCURSALCAMBSUCURSALAGENTEPEVCFUNCIONARIO = "p_evcFuncionario";
    /** <code>sucursalCambSucursalAgentepevcFuncionario</code> inbound argument id. */
    public static final String ARG_ID_CAMBSUCURSALAGENTE_SUCURSALCAMBSUCURSALAGENTEPEVCFUNCIONARIO = "Clas_1431874043904178Ser_9Arg_2_Alias";
    /** <code>sucursalCambSucursalAgentepevcFuncionario</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBSUCURSALAGENTE_SUCURSALCAMBSUCURSALAGENTEPEVCFUNCIONARIO = "Agentes";
    // Service (TSINCRONIZAR)
    /** <code>TSINCRONIZAR</code> service id. */
    public static final String SERV_ID_TSINCRONIZAR = "Clas_1431874043904178Ser_5_Alias";
    /** <code>TSINCRONIZAR</code> service name. */
    public static final String SERV_NAME_TSINCRONIZAR = "TSINCRONIZAR";
    /** <code>TSINCRONIZAR</code> service alias. */
    public static final String SERV_ALIAS_TSINCRONIZAR = "Sincronizar";
    /** Agents allowed to execute the service TSINCRONIZAR **/
    public static final String TSINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>sucursalTSINCRONIZARpthisSucursal</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_SUCURSALTSINCRONIZARPTHISSUCURSAL = "p_thisSucursal";
    /** <code>sucursalTSINCRONIZARpthisSucursal</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_SUCURSALTSINCRONIZARPTHISSUCURSAL = "Clas_1431874043904178Ser_5Arg_1_Alias";
    /** <code>sucursalTSINCRONIZARpthisSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_SUCURSALTSINCRONIZARPTHISSUCURSAL = "Sucursal";
    /** <code>sucursalTSINCRONIZARptpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_SUCURSALTSINCRONIZARPTPDESCRIPCION = "pt_p_Descripcion";
    /** <code>sucursalTSINCRONIZARptpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_SUCURSALTSINCRONIZARPTPDESCRIPCION = "Clas_1431874043904178Ser_5Arg_2_Alias";
    /** <code>sucursalTSINCRONIZARptpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_SUCURSALTSINCRONIZARPTPDESCRIPCION = "Descripción";
    /** <code>sucursalTSINCRONIZARptpevcRegional</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_SUCURSALTSINCRONIZARPTPEVCREGIONAL = "pt_p_evcRegional";
    /** <code>sucursalTSINCRONIZARptpevcRegional</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_SUCURSALTSINCRONIZARPTPEVCREGIONAL = "Clas_1431874043904178Ser_5Arg_3_Alias";
    /** <code>sucursalTSINCRONIZARptpevcRegional</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_SUCURSALTSINCRONIZARPTPEVCREGIONAL = "Regional";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_SUCURSALDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_SUCURSALCODIGO.toUpperCase(), SUCURSALCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_SUCURSALDESCRIPCION.toUpperCase(), SUCURSALDESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_REGIONAL.toUpperCase(), REGIONAL_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Sucursal', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Sucursal', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_SUCURSALCODIGO);
        }
        // Facet 'Sucursal' (This facet)
        if (SucursalConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_SUCURSALCODIGO);
        }
        return returnList;
    }
}
