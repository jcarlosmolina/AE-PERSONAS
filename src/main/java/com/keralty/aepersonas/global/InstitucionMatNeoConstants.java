package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>InstitucionMatNeo</code> model class.
 */
public final class InstitucionMatNeoConstants {

    private InstitucionMatNeoConstants() {

    }

    // Class
    /** <code>InstitucionMatNeo</code> class id. */
    public static final String CLASS_ID = "Clas_1463993499648846_Alias";
    /** <code>InstitucionMatNeo</code> class name. */
    public static final String CLASS_NAME = "InstitucionMatNeo";
    /** <code>InstitucionMatNeo</code> class alias. */
    public static final String CLASS_ALIAS = "Institución Maternal/Neonatal";
    /** <code>InstitucionMatNeo</code> class table name. */
    public static final String TBL_NAME = "InstitucionMatNeo";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "institucionMatNeoCodigo,tipoIdentificacionTipoIdentificacionCodigo,tarifaId,municipioMunicipioCodigo,institucionMatNeoNumIdentificacion,institucionMatNeoNombre,institucionMatNeoParaMaternidad,institucionMatNeoParaNeonatal,institucionMatNeoFechaInicial,institucionMatNeoFechaFinal";

    public static final String DSDSINSTITUCIONMATNEO = "DS_InstitucionMatNeo";
    public static final String DSICINSTITUCIONMATNEO = "IC_InstitucionMatNeo";
    

    // Attribute (institucionMatNeoCodigo)
    /** <code>institucionMatNeoCodigo</code> attribute id. */
    public static final String ATTR_ID_INSTITUCIONMATNEOCODIGO = "Clas_1463993499648846Atr_2_Alias";
    /** <code>institucionMatNeoCodigo</code> attribute name. */
    public static final String ATTR_NAME_INSTITUCIONMATNEOCODIGO = "institucionMatNeoCodigo";
    /** <code>institucionMatNeoCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_INSTITUCIONMATNEOCODIGO = "Código";

    /** <code>institucionMatNeoCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONMATNEOCODIGO = "";
    /** Agents allowed to view the attribute institucionMatNeoCodigo **/
    public static final String INSTITUCIONMATNEOCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (institucionMatNeoNumIdentificacion)
    /** <code>institucionMatNeoNumIdentificacion</code> attribute id. */
    public static final String ATTR_ID_INSTITUCIONMATNEONUMIDENTIFICACION = "Clas_1463993499648846Atr_3_Alias";
    /** <code>institucionMatNeoNumIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_INSTITUCIONMATNEONUMIDENTIFICACION = "institucionMatNeoNumIdentificacion";
    /** <code>institucionMatNeoNumIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_INSTITUCIONMATNEONUMIDENTIFICACION = "Nº Identificación";

    /** <code>institucionMatNeoNumIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONMATNEONUMIDENTIFICACION = "";
    /** Agents allowed to view the attribute institucionMatNeoNumIdentificacion **/
    public static final String INSTITUCIONMATNEONUMIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (institucionMatNeoNombre)
    /** <code>institucionMatNeoNombre</code> attribute id. */
    public static final String ATTR_ID_INSTITUCIONMATNEONOMBRE = "Clas_1463993499648846Atr_4_Alias";
    /** <code>institucionMatNeoNombre</code> attribute name. */
    public static final String ATTR_NAME_INSTITUCIONMATNEONOMBRE = "institucionMatNeoNombre";
    /** <code>institucionMatNeoNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_INSTITUCIONMATNEONOMBRE = "Nombre de la Sucursal";

    /** <code>institucionMatNeoNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONMATNEONOMBRE = "";
    /** Agents allowed to view the attribute institucionMatNeoNombre **/
    public static final String INSTITUCIONMATNEONOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (institucionMatNeoParaMaternidad)
    /** <code>institucionMatNeoParaMaternidad</code> attribute id. */
    public static final String ATTR_ID_INSTITUCIONMATNEOPARAMATERNIDAD = "Clas_1463993499648846Atr_5_Alias";
    /** <code>institucionMatNeoParaMaternidad</code> attribute name. */
    public static final String ATTR_NAME_INSTITUCIONMATNEOPARAMATERNIDAD = "institucionMatNeoParaMaternidad";
    /** <code>institucionMatNeoParaMaternidad</code> attribute alias. */
    public static final String ATTR_ALIAS_INSTITUCIONMATNEOPARAMATERNIDAD = "Maternidad";

    /** <code>institucionMatNeoParaMaternidad</code> attribute facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONMATNEOPARAMATERNIDAD = "";
    /** Agents allowed to view the attribute institucionMatNeoParaMaternidad **/
    public static final String INSTITUCIONMATNEOPARAMATERNIDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (institucionMatNeoParaNeonatal)
    /** <code>institucionMatNeoParaNeonatal</code> attribute id. */
    public static final String ATTR_ID_INSTITUCIONMATNEOPARANEONATAL = "Clas_1463993499648846Atr_6_Alias";
    /** <code>institucionMatNeoParaNeonatal</code> attribute name. */
    public static final String ATTR_NAME_INSTITUCIONMATNEOPARANEONATAL = "institucionMatNeoParaNeonatal";
    /** <code>institucionMatNeoParaNeonatal</code> attribute alias. */
    public static final String ATTR_ALIAS_INSTITUCIONMATNEOPARANEONATAL = "Neonatal";

    /** <code>institucionMatNeoParaNeonatal</code> attribute facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONMATNEOPARANEONATAL = "";
    /** Agents allowed to view the attribute institucionMatNeoParaNeonatal **/
    public static final String INSTITUCIONMATNEOPARANEONATAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (institucionMatNeoFechaInicial)
    /** <code>institucionMatNeoFechaInicial</code> attribute id. */
    public static final String ATTR_ID_INSTITUCIONMATNEOFECHAINICIAL = "Clas_1463993499648846Atr_7_Alias";
    /** <code>institucionMatNeoFechaInicial</code> attribute name. */
    public static final String ATTR_NAME_INSTITUCIONMATNEOFECHAINICIAL = "institucionMatNeoFechaInicial";
    /** <code>institucionMatNeoFechaInicial</code> attribute alias. */
    public static final String ATTR_ALIAS_INSTITUCIONMATNEOFECHAINICIAL = "Fecha inicial";

    /** <code>institucionMatNeoFechaInicial</code> attribute facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONMATNEOFECHAINICIAL = "";
    /** Agents allowed to view the attribute institucionMatNeoFechaInicial **/
    public static final String INSTITUCIONMATNEOFECHAINICIAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (institucionMatNeoFechaFinal)
    /** <code>institucionMatNeoFechaFinal</code> attribute id. */
    public static final String ATTR_ID_INSTITUCIONMATNEOFECHAFINAL = "Clas_1463993499648846Atr_8_Alias";
    /** <code>institucionMatNeoFechaFinal</code> attribute name. */
    public static final String ATTR_NAME_INSTITUCIONMATNEOFECHAFINAL = "institucionMatNeoFechaFinal";
    /** <code>institucionMatNeoFechaFinal</code> attribute alias. */
    public static final String ATTR_ALIAS_INSTITUCIONMATNEOFECHAFINAL = "Fecha final";

    /** <code>institucionMatNeoFechaFinal</code> attribute facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONMATNEOFECHAFINAL = "";
    /** Agents allowed to view the attribute institucionMatNeoFechaFinal **/
    public static final String INSTITUCIONMATNEOFECHAFINAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_INSTITUCIONMATNEOCODIGO = "Codigo";    
    /** <code>Codigo</code> field length. */
    public static final int FLD_INSTITUCIONMATNEOCODIGOLENGTH = 20;
    /** <code>institucionMatNeoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_INSTITUCIONMATNEOCODIGO = "institucionMatNeoCodigo";
    // Field (TipoIdentificacion_Codigo)
    /** <code>TipoIdentificacion_Codigo</code> field name. */
    public static final String FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCODIGO = "TipoIdentificacion_Codigo";    
    /** <code>TipoIdentificacion.tipoIdentificacionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIDENTIFICACION_TIPOIDENTIFICACIONCODIGO = "tipoIdentificacionTipoIdentificacionCodigo";
    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_TARIFAID = "Id";    
    /** <code>Tarifa.tarifaId</code> attribute field name. */
    public static final String ATTR_FIELD_TARIFA_TARIFAID = "tarifaId";
    // Field (Municipio_Codigo)
    /** <code>Municipio_Codigo</code> field name. */
    public static final String FLD_MUNICIPIOMUNICIPIOCODIGO = "Municipio_Codigo";    
    /** <code>Municipio.municipioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIO_MUNICIPIOCODIGO = "municipioMunicipioCodigo";
    // Field (NumIdentificacion)
    /** <code>NumIdentificacion</code> field name. */
    public static final String FLD_INSTITUCIONMATNEONUMIDENTIFICACION = "NumIdentificacion";    
    /** <code>NumIdentificacion</code> field length. */
    public static final int FLD_INSTITUCIONMATNEONUMIDENTIFICACIONLENGTH = 60;
    /** <code>institucionMatNeoNumIdentificacion</code> attribute field name. */
    public static final String ATTR_FIELD_INSTITUCIONMATNEONUMIDENTIFICACION = "institucionMatNeoNumIdentificacion";
    // Field (Nombre)
    /** <code>Nombre</code> field name. */
    public static final String FLD_INSTITUCIONMATNEONOMBRE = "Nombre";    
    /** <code>Nombre</code> field length. */
    public static final int FLD_INSTITUCIONMATNEONOMBRELENGTH = 100;
    /** <code>institucionMatNeoNombre</code> attribute field name. */
    public static final String ATTR_FIELD_INSTITUCIONMATNEONOMBRE = "institucionMatNeoNombre";
    // Field (ParaMaternidad)
    /** <code>ParaMaternidad</code> field name. */
    public static final String FLD_INSTITUCIONMATNEOPARAMATERNIDAD = "ParaMaternidad";    
    /** <code>institucionMatNeoParaMaternidad</code> attribute field name. */
    public static final String ATTR_FIELD_INSTITUCIONMATNEOPARAMATERNIDAD = "institucionMatNeoParaMaternidad";
    // Field (ParaNeonatal)
    /** <code>ParaNeonatal</code> field name. */
    public static final String FLD_INSTITUCIONMATNEOPARANEONATAL = "ParaNeonatal";    
    /** <code>institucionMatNeoParaNeonatal</code> attribute field name. */
    public static final String ATTR_FIELD_INSTITUCIONMATNEOPARANEONATAL = "institucionMatNeoParaNeonatal";
    // Field (FechaInicial)
    /** <code>FechaInicial</code> field name. */
    public static final String FLD_INSTITUCIONMATNEOFECHAINICIAL = "FechaInicial";    
    /** <code>institucionMatNeoFechaInicial</code> attribute field name. */
    public static final String ATTR_FIELD_INSTITUCIONMATNEOFECHAINICIAL = "institucionMatNeoFechaInicial";
    // Field (FechaFinal)
    /** <code>FechaFinal</code> field name. */
    public static final String FLD_INSTITUCIONMATNEOFECHAFINAL = "FechaFinal";    
    /** <code>institucionMatNeoFechaFinal</code> attribute field name. */
    public static final String ATTR_FIELD_INSTITUCIONMATNEOFECHAFINAL = "institucionMatNeoFechaFinal";

    // Component role (TipoIdentificacion)
    /** <code>TipoIdentificacion</code> role id. */
    public static final String ROLE_ID_TIPOIDENTIFICACION = "Agr_1463993761792621_Alias";
    /** <code>TipoIdentificacion</code> role name. */
    public static final String ROLE_NAME_TIPOIDENTIFICACION = "tipoIdentificacion";
    /** <code>TipoIdentificacion</code> role alias. */
    public static final String ROLE_ALIAS_TIPOIDENTIFICACION = "Tipo Identificacion";

    /** <code>TipoIdentificacion</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOIDENTIFICACION = TipoIdentificacionConstants.ROLE_NAME_INSTITUCIONMATNEO;
    /** <code>TipoIdentificacion</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOIDENTIFICACION = "";
    /** <code>TipoIdentificacion</code> role target class. */
    public static final String ROLE_TARGET_TIPOIDENTIFICACION = TipoIdentificacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoIdentificacion **/
    public static final String TIPOIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Tarifa)
    /** <code>Tarifa</code> role id. */
    public static final String ROLE_ID_TARIFA = "Agr_1463993761792960_Alias";
    /** <code>Tarifa</code> role name. */
    public static final String ROLE_NAME_TARIFA = "tarifa";
    /** <code>Tarifa</code> role alias. */
    public static final String ROLE_ALIAS_TARIFA = "Tarifa";

    /** <code>Tarifa</code> inverse role name. */
    public static final String ROLE_INVNAME_TARIFA = TarifaConstants.ROLE_NAME_INSTITUCIONMATNEO;
    /** <code>Tarifa</code> role facet sequence. */
    public static final String PATH_FACETS_TARIFA = "";
    /** <code>Tarifa</code> role target class. */
    public static final String ROLE_TARGET_TARIFA = TarifaConstants.CLASS_NAME;

    /** Agents allowed to navigate through Tarifa **/
    public static final String TARIFA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Municipio)
    /** <code>Municipio</code> role id. */
    public static final String ROLE_ID_MUNICIPIO = "Agr_1463994023936454_Alias";
    /** <code>Municipio</code> role name. */
    public static final String ROLE_NAME_MUNICIPIO = "municipio";
    /** <code>Municipio</code> role alias. */
    public static final String ROLE_ALIAS_MUNICIPIO = "Municipio";

    /** <code>Municipio</code> inverse role name. */
    public static final String ROLE_INVNAME_MUNICIPIO = MunicipioConstants.ROLE_NAME_INSTITUCIONMATNEO;
    /** <code>Municipio</code> role facet sequence. */
    public static final String PATH_FACETS_MUNICIPIO = "";
    /** <code>Municipio</code> role target class. */
    public static final String ROLE_TARGET_MUNICIPIO = MunicipioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Municipio **/
    public static final String MUNICIPIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (AnexoMat)
    /** <code>AnexoMat</code> role id. */
    public static final String ROLE_ID_ANEXOMAT = "Agr_1463993499648784_Alias";
    /** <code>AnexoMat</code> role name. */
    public static final String ROLE_NAME_ANEXOMAT = "anexoMat";
    /** <code>InstitucionMaternal</code> role alias. */
    public static final String ROLE_ALIAS_ANEXOMAT = "Anexos";


    /** <code>AnexoMat</code> inverse role name. */
    public static final String ROLE_INVNAME_ANEXOMAT = AnexoMatConstants.ROLE_NAME_INSTITUCIONMATERNAL;
    /** <code>AnexoMat</code> role facet sequence. */
    public static final String PATH_FACETS_ANEXOMAT = "";
    /** <code>AnexoMat</code> role target class. */
    public static final String ROLE_TARGET_ANEXOMAT = AnexoMatConstants.CLASS_NAME;
    /** Agents allowed to navigate through AnexoMat **/
    public static final String ANEXOMAT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (AnexoNeo)
    /** <code>AnexoNeo</code> role id. */
    public static final String ROLE_ID_ANEXONEO = "Agr_1463993630720047_Alias";
    /** <code>AnexoNeo</code> role name. */
    public static final String ROLE_NAME_ANEXONEO = "anexoNeo";
    /** <code>InstitucionNeonatal</code> role alias. */
    public static final String ROLE_ALIAS_ANEXONEO = "Anexos";


    /** <code>AnexoNeo</code> inverse role name. */
    public static final String ROLE_INVNAME_ANEXONEO = AnexoNeoConstants.ROLE_NAME_INSTITUCIONNEONATAL;
    /** <code>AnexoNeo</code> role facet sequence. */
    public static final String PATH_FACETS_ANEXONEO = "";
    /** <code>AnexoNeo</code> role target class. */
    public static final String ROLE_TARGET_ANEXONEO = AnexoNeoConstants.CLASS_NAME;
    /** Agents allowed to navigate through AnexoNeo **/
    public static final String ANEXONEO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1463993499648846Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>institucionMatNeocrearpagrTarifa</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_INSTITUCIONMATNEOCREARPAGRTARIFA = "p_agrTarifa";
    /** <code>institucionMatNeocrearpagrTarifa</code> inbound argument id. */
    public static final String ARG_ID_CREAR_INSTITUCIONMATNEOCREARPAGRTARIFA = "Clas_1463993499648846Ser_1Arg_12_Alias";
    /** <code>institucionMatNeocrearpagrTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_INSTITUCIONMATNEOCREARPAGRTARIFA = "Tarifa";
    /** <code>institucionMatNeocrearpagrTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_INSTITUCIONMATNEOCREARPAGRTIPOIDENTIFICACION = "p_agrTipoIdentificacion";
    /** <code>institucionMatNeocrearpagrTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_INSTITUCIONMATNEOCREARPAGRTIPOIDENTIFICACION = "Clas_1463993499648846Ser_1Arg_20_Alias";
    /** <code>institucionMatNeocrearpagrTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_INSTITUCIONMATNEOCREARPAGRTIPOIDENTIFICACION = "Tipo Identificacion";
    /** <code>institucionMatNeocrearpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_INSTITUCIONMATNEOCREARPAGRMUNICIPIO = "p_agrMunicipio";
    /** <code>institucionMatNeocrearpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_CREAR_INSTITUCIONMATNEOCREARPAGRMUNICIPIO = "Clas_1463993499648846Ser_1Arg_22_Alias";
    /** <code>institucionMatNeocrearpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_INSTITUCIONMATNEOCREARPAGRMUNICIPIO = "Municipio";
    /** <code>institucionMatNeocrearpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_INSTITUCIONMATNEOCREARPATRNUMIDENTIFICACION = "p_atrNumIdentificacion";
    /** <code>institucionMatNeocrearpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_INSTITUCIONMATNEOCREARPATRNUMIDENTIFICACION = "Clas_1463993499648846Ser_1Arg_4_Alias";
    /** <code>institucionMatNeocrearpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_INSTITUCIONMATNEOCREARPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>institucionMatNeocrearpatrNombre</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_INSTITUCIONMATNEOCREARPATRNOMBRE = "p_atrNombre";
    /** <code>institucionMatNeocrearpatrNombre</code> inbound argument id. */
    public static final String ARG_ID_CREAR_INSTITUCIONMATNEOCREARPATRNOMBRE = "Clas_1463993499648846Ser_1Arg_5_Alias";
    /** <code>institucionMatNeocrearpatrNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_INSTITUCIONMATNEOCREARPATRNOMBRE = "Nombre de la Sucursal";
    /** <code>institucionMatNeocrearpatrParaMaternidad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_INSTITUCIONMATNEOCREARPATRPARAMATERNIDAD = "p_atrParaMaternidad";
    /** <code>institucionMatNeocrearpatrParaMaternidad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_INSTITUCIONMATNEOCREARPATRPARAMATERNIDAD = "Clas_1463993499648846Ser_1Arg_6_Alias";
    /** <code>institucionMatNeocrearpatrParaMaternidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_INSTITUCIONMATNEOCREARPATRPARAMATERNIDAD = "Maternidad";
    /** <code>institucionMatNeocrearpatrParaNeonatal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_INSTITUCIONMATNEOCREARPATRPARANEONATAL = "p_atrParaNeonatal";
    /** <code>institucionMatNeocrearpatrParaNeonatal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_INSTITUCIONMATNEOCREARPATRPARANEONATAL = "Clas_1463993499648846Ser_1Arg_7_Alias";
    /** <code>institucionMatNeocrearpatrParaNeonatal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_INSTITUCIONMATNEOCREARPATRPARANEONATAL = "Neonatal";
    /** <code>institucionMatNeocrearpatrFechaInicial</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_INSTITUCIONMATNEOCREARPATRFECHAINICIAL = "p_atrFechaInicial";
    /** <code>institucionMatNeocrearpatrFechaInicial</code> inbound argument id. */
    public static final String ARG_ID_CREAR_INSTITUCIONMATNEOCREARPATRFECHAINICIAL = "Clas_1463993499648846Ser_1Arg_8_Alias";
    /** <code>institucionMatNeocrearpatrFechaInicial</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_INSTITUCIONMATNEOCREARPATRFECHAINICIAL = "Fecha inicial";
    /** <code>institucionMatNeocrearpatrFechaFinal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_INSTITUCIONMATNEOCREARPATRFECHAFINAL = "p_atrFechaFinal";
    /** <code>institucionMatNeocrearpatrFechaFinal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_INSTITUCIONMATNEOCREARPATRFECHAFINAL = "Clas_1463993499648846Ser_1Arg_9_Alias";
    /** <code>institucionMatNeocrearpatrFechaFinal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_INSTITUCIONMATNEOCREARPATRFECHAFINAL = "Fecha final";
    /** <code>institucionMatNeocrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_INSTITUCIONMATNEOCREARPATRCODIGO = "p_atrCodigo";
    /** <code>institucionMatNeocrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_INSTITUCIONMATNEOCREARPATRCODIGO = "Clas_1463993499648846Ser_1Arg_11_Alias";
    /** <code>institucionMatNeocrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_INSTITUCIONMATNEOCREARPATRCODIGO = "Código";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1463993499648846Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1463993499648846Pre_1_MsgError";
    /** <code>eliminar</code> precondition 1 id. */
    public static final String PRE_ID_ELIMINAR_1 = "Clas_1463993499648846Pre_2_MsgError";
    // Inbound arguments
    /** <code>institucionMatNeoeliminarpthisInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_INSTITUCIONMATNEOELIMINARPTHISINSTITUCIONMATNEO = "p_thisInstitucionMatNeo";
    /** <code>institucionMatNeoeliminarpthisInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_INSTITUCIONMATNEOELIMINARPTHISINSTITUCIONMATNEO = "Clas_1463993499648846Ser_2Arg_1_Alias";
    /** <code>institucionMatNeoeliminarpthisInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_INSTITUCIONMATNEOELIMINARPTHISINSTITUCIONMATNEO = "Institución Maternal/Neonatal";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1463993499648846Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>institucionMatNeomodificarpthisInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_INSTITUCIONMATNEOMODIFICARPTHISINSTITUCIONMATNEO = "p_thisInstitucionMatNeo";
    /** <code>institucionMatNeomodificarpthisInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_INSTITUCIONMATNEOMODIFICARPTHISINSTITUCIONMATNEO = "Clas_1463993499648846Ser_3Arg_1_Alias";
    /** <code>institucionMatNeomodificarpthisInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_INSTITUCIONMATNEOMODIFICARPTHISINSTITUCIONMATNEO = "Institución Maternal/Neonatal";
    /** <code>institucionMatNeomodificarpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_INSTITUCIONMATNEOMODIFICARPNUMIDENTIFICACION = "p_NumIdentificacion";
    /** <code>institucionMatNeomodificarpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_INSTITUCIONMATNEOMODIFICARPNUMIDENTIFICACION = "Clas_1463993499648846Ser_3Arg_2_Alias";
    /** <code>institucionMatNeomodificarpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_INSTITUCIONMATNEOMODIFICARPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>institucionMatNeomodificarpNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_INSTITUCIONMATNEOMODIFICARPNOMBRE = "p_Nombre";
    /** <code>institucionMatNeomodificarpNombre</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_INSTITUCIONMATNEOMODIFICARPNOMBRE = "Clas_1463993499648846Ser_3Arg_3_Alias";
    /** <code>institucionMatNeomodificarpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_INSTITUCIONMATNEOMODIFICARPNOMBRE = "Nombre de la Sucursal";
    /** <code>institucionMatNeomodificarpParaMaternidad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_INSTITUCIONMATNEOMODIFICARPPARAMATERNIDAD = "p_ParaMaternidad";
    /** <code>institucionMatNeomodificarpParaMaternidad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_INSTITUCIONMATNEOMODIFICARPPARAMATERNIDAD = "Clas_1463993499648846Ser_3Arg_4_Alias";
    /** <code>institucionMatNeomodificarpParaMaternidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_INSTITUCIONMATNEOMODIFICARPPARAMATERNIDAD = "Maternidad";
    /** <code>institucionMatNeomodificarpParaNeonatal</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_INSTITUCIONMATNEOMODIFICARPPARANEONATAL = "p_ParaNeonatal";
    /** <code>institucionMatNeomodificarpParaNeonatal</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_INSTITUCIONMATNEOMODIFICARPPARANEONATAL = "Clas_1463993499648846Ser_3Arg_5_Alias";
    /** <code>institucionMatNeomodificarpParaNeonatal</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_INSTITUCIONMATNEOMODIFICARPPARANEONATAL = "Neonatal";
    /** <code>institucionMatNeomodificarpFechaInicial</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_INSTITUCIONMATNEOMODIFICARPFECHAINICIAL = "p_FechaInicial";
    /** <code>institucionMatNeomodificarpFechaInicial</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_INSTITUCIONMATNEOMODIFICARPFECHAINICIAL = "Clas_1463993499648846Ser_3Arg_6_Alias";
    /** <code>institucionMatNeomodificarpFechaInicial</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_INSTITUCIONMATNEOMODIFICARPFECHAINICIAL = "Fecha inicial";
    /** <code>institucionMatNeomodificarpFechaFinal</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_INSTITUCIONMATNEOMODIFICARPFECHAFINAL = "p_FechaFinal";
    /** <code>institucionMatNeomodificarpFechaFinal</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_INSTITUCIONMATNEOMODIFICARPFECHAFINAL = "Clas_1463993499648846Ser_3Arg_7_Alias";
    /** <code>institucionMatNeomodificarpFechaFinal</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_INSTITUCIONMATNEOMODIFICARPFECHAFINAL = "Fecha final";
    // Service (CambiarInsInstitucionMaternal)
    /** <code>CambiarInsInstitucionMaternal</code> service id. */
    public static final String SERV_ID_CAMBIARINSINSTITUCIONMATERNAL = "Clas_1463993499648846Ser_4_Alias";
    /** <code>CambiarInsInstitucionMaternal</code> service name. */
    public static final String SERV_NAME_CAMBIARINSINSTITUCIONMATERNAL = "CambiarInsInstitucionMaternal";
    /** <code>CambiarInsInstitucionMaternal</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARINSINSTITUCIONMATERNAL = "CambiarInsInstitucionMaternal";
    /** Agents allowed to execute the service CambiarInsInstitucionMaternal **/
    public static final String CAMBIARINSINSTITUCIONMATERNAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARINSINSTITUCIONMATERNAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONMATERNALPTHISINSTITUCIONMATNEO = "p_thisInstitucionMatNeo";
    /** <code>institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARINSINSTITUCIONMATERNAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONMATERNALPTHISINSTITUCIONMATNEO = "Clas_1463993499648846Ser_4Arg_1_Alias";
    /** <code>institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARINSINSTITUCIONMATERNAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONMATERNALPTHISINSTITUCIONMATNEO = "Institución";
    /** <code>institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARINSINSTITUCIONMATERNAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONMATERNALPEVCANEXOMAT = "p_evcAnexoMat";
    /** <code>institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARINSINSTITUCIONMATERNAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONMATERNALPEVCANEXOMAT = "Clas_1463993499648846Ser_4Arg_2_Alias";
    /** <code>institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARINSINSTITUCIONMATERNAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONMATERNALPEVCANEXOMAT = "Anexos";
    // Service (CambiarInsInstitucionNeonatal)
    /** <code>CambiarInsInstitucionNeonatal</code> service id. */
    public static final String SERV_ID_CAMBIARINSINSTITUCIONNEONATAL = "Clas_1463993499648846Ser_5_Alias";
    /** <code>CambiarInsInstitucionNeonatal</code> service name. */
    public static final String SERV_NAME_CAMBIARINSINSTITUCIONNEONATAL = "CambiarInsInstitucionNeonatal";
    /** <code>CambiarInsInstitucionNeonatal</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARINSINSTITUCIONNEONATAL = "CambiarInsInstitucionNeonatal";
    /** Agents allowed to execute the service CambiarInsInstitucionNeonatal **/
    public static final String CAMBIARINSINSTITUCIONNEONATAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARINSINSTITUCIONNEONATAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONNEONATALPTHISINSTITUCIONMATNEO = "p_thisInstitucionMatNeo";
    /** <code>institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARINSINSTITUCIONNEONATAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONNEONATALPTHISINSTITUCIONMATNEO = "Clas_1463993499648846Ser_5Arg_1_Alias";
    /** <code>institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARINSINSTITUCIONNEONATAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONNEONATALPTHISINSTITUCIONMATNEO = "Institución";
    /** <code>institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARINSINSTITUCIONNEONATAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONNEONATALPEVCANEXONEO = "p_evcAnexoNeo";
    /** <code>institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARINSINSTITUCIONNEONATAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONNEONATALPEVCANEXONEO = "Clas_1463993499648846Ser_5Arg_2_Alias";
    /** <code>institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARINSINSTITUCIONNEONATAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONNEONATALPEVCANEXONEO = "Anexos";
    // Service (CambiarTipoIdentificacion)
    /** <code>CambiarTipoIdentificacion</code> service id. */
    public static final String SERV_ID_CAMBIARTIPOIDENTIFICACION = "Clas_1463993499648846Ser_6_Alias";
    /** <code>CambiarTipoIdentificacion</code> service name. */
    public static final String SERV_NAME_CAMBIARTIPOIDENTIFICACION = "CambiarTipoIdentificacion";
    /** <code>CambiarTipoIdentificacion</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARTIPOIDENTIFICACION = "CambiarTipoIdentificacion";
    /** Agents allowed to execute the service CambiarTipoIdentificacion **/
    public static final String CAMBIARTIPOIDENTIFICACION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>institucionMatNeoCambiarTipoIdentificacionpthisInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARTIPOIDENTIFICACION_INSTITUCIONMATNEOCAMBIARTIPOIDENTIFICACIONPTHISINSTITUCIONMATNEO = "p_thisInstitucionMatNeo";
    /** <code>institucionMatNeoCambiarTipoIdentificacionpthisInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARTIPOIDENTIFICACION_INSTITUCIONMATNEOCAMBIARTIPOIDENTIFICACIONPTHISINSTITUCIONMATNEO = "Clas_1463993499648846Ser_6Arg_1_Alias";
    /** <code>institucionMatNeoCambiarTipoIdentificacionpthisInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARTIPOIDENTIFICACION_INSTITUCIONMATNEOCAMBIARTIPOIDENTIFICACIONPTHISINSTITUCIONMATNEO = "Instituciones";
    /** <code>institucionMatNeoCambiarTipoIdentificacionpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARTIPOIDENTIFICACION_INSTITUCIONMATNEOCAMBIARTIPOIDENTIFICACIONPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>institucionMatNeoCambiarTipoIdentificacionpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARTIPOIDENTIFICACION_INSTITUCIONMATNEOCAMBIARTIPOIDENTIFICACIONPEVCTIPOIDENTIFICACION = "Clas_1463993499648846Ser_6Arg_2_Alias";
    /** <code>institucionMatNeoCambiarTipoIdentificacionpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARTIPOIDENTIFICACION_INSTITUCIONMATNEOCAMBIARTIPOIDENTIFICACIONPEVCTIPOIDENTIFICACION = "Tipo Identificacion";
    // Service (CambiarTarifa)
    /** <code>CambiarTarifa</code> service id. */
    public static final String SERV_ID_CAMBIARTARIFA = "Clas_1463993499648846Ser_7_Alias";
    /** <code>CambiarTarifa</code> service name. */
    public static final String SERV_NAME_CAMBIARTARIFA = "CambiarTarifa";
    /** <code>CambiarTarifa</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARTARIFA = "CambiarTarifa";
    /** Agents allowed to execute the service CambiarTarifa **/
    public static final String CAMBIARTARIFA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>institucionMatNeoCambiarTarifapthisInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARTARIFA_INSTITUCIONMATNEOCAMBIARTARIFAPTHISINSTITUCIONMATNEO = "p_thisInstitucionMatNeo";
    /** <code>institucionMatNeoCambiarTarifapthisInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARTARIFA_INSTITUCIONMATNEOCAMBIARTARIFAPTHISINSTITUCIONMATNEO = "Clas_1463993499648846Ser_7Arg_1_Alias";
    /** <code>institucionMatNeoCambiarTarifapthisInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARTARIFA_INSTITUCIONMATNEOCAMBIARTARIFAPTHISINSTITUCIONMATNEO = "Instituciones";
    /** <code>institucionMatNeoCambiarTarifapevcTarifa</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARTARIFA_INSTITUCIONMATNEOCAMBIARTARIFAPEVCTARIFA = "p_evcTarifa";
    /** <code>institucionMatNeoCambiarTarifapevcTarifa</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARTARIFA_INSTITUCIONMATNEOCAMBIARTARIFAPEVCTARIFA = "Clas_1463993499648846Ser_7Arg_2_Alias";
    /** <code>institucionMatNeoCambiarTarifapevcTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARTARIFA_INSTITUCIONMATNEOCAMBIARTARIFAPEVCTARIFA = "Tarifa";
    // Service (CambiarMunicipioInst)
    /** <code>CambiarMunicipioInst</code> service id. */
    public static final String SERV_ID_CAMBIARMUNICIPIOINST = "Clas_1463993499648846Ser_8_Alias";
    /** <code>CambiarMunicipioInst</code> service name. */
    public static final String SERV_NAME_CAMBIARMUNICIPIOINST = "CambiarMunicipioInst";
    /** <code>CambiarMunicipioInst</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARMUNICIPIOINST = "CambiarMunicipioInst";
    /** Agents allowed to execute the service CambiarMunicipioInst **/
    public static final String CAMBIARMUNICIPIOINST_SRVAGENTS = "";
    // Inbound arguments
    /** <code>institucionMatNeoCambiarMunicipioInstpthisInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARMUNICIPIOINST_INSTITUCIONMATNEOCAMBIARMUNICIPIOINSTPTHISINSTITUCIONMATNEO = "p_thisInstitucionMatNeo";
    /** <code>institucionMatNeoCambiarMunicipioInstpthisInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARMUNICIPIOINST_INSTITUCIONMATNEOCAMBIARMUNICIPIOINSTPTHISINSTITUCIONMATNEO = "Clas_1463993499648846Ser_8Arg_1_Alias";
    /** <code>institucionMatNeoCambiarMunicipioInstpthisInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARMUNICIPIOINST_INSTITUCIONMATNEOCAMBIARMUNICIPIOINSTPTHISINSTITUCIONMATNEO = "Instituciones";
    /** <code>institucionMatNeoCambiarMunicipioInstpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARMUNICIPIOINST_INSTITUCIONMATNEOCAMBIARMUNICIPIOINSTPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>institucionMatNeoCambiarMunicipioInstpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARMUNICIPIOINST_INSTITUCIONMATNEOCAMBIARMUNICIPIOINSTPEVCMUNICIPIO = "Clas_1463993499648846Ser_8Arg_2_Alias";
    /** <code>institucionMatNeoCambiarMunicipioInstpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARMUNICIPIOINST_INSTITUCIONMATNEOCAMBIARMUNICIPIOINSTPEVCMUNICIPIO = "Municipio";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1463993499648846Ser_9_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>institucionMatNeoTMODIFICARpthisInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTHISINSTITUCIONMATNEO = "p_thisInstitucionMatNeo";
    /** <code>institucionMatNeoTMODIFICARpthisInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTHISINSTITUCIONMATNEO = "Clas_1463993499648846Ser_9Arg_1_Alias";
    /** <code>institucionMatNeoTMODIFICARpthisInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTHISINSTITUCIONMATNEO = "Institución Maternal/Neonatal";
    /** <code>institucionMatNeoTMODIFICARptpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPEVCMUNICIPIO = "pt_p_evcMunicipio";
    /** <code>institucionMatNeoTMODIFICARptpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPEVCMUNICIPIO = "Clas_1463993499648846Ser_9Arg_3_Alias";
    /** <code>institucionMatNeoTMODIFICARptpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPEVCMUNICIPIO = "Municipio";
    /** <code>institucionMatNeoTMODIFICARptpevcTarifa</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPEVCTARIFA = "pt_p_evcTarifa";
    /** <code>institucionMatNeoTMODIFICARptpevcTarifa</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPEVCTARIFA = "Clas_1463993499648846Ser_9Arg_4_Alias";
    /** <code>institucionMatNeoTMODIFICARptpevcTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPEVCTARIFA = "Tarifa";
    /** <code>institucionMatNeoTMODIFICARptpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPEVCTIPOIDENTIFICACION = "pt_p_evcTipoIdentificacion";
    /** <code>institucionMatNeoTMODIFICARptpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPEVCTIPOIDENTIFICACION = "Clas_1463993499648846Ser_9Arg_5_Alias";
    /** <code>institucionMatNeoTMODIFICARptpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPEVCTIPOIDENTIFICACION = "Tipo Identificacion";
    /** <code>institucionMatNeoTMODIFICARptpNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPNUMIDENTIFICACION = "pt_p_NumIdentificacion";
    /** <code>institucionMatNeoTMODIFICARptpNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPNUMIDENTIFICACION = "Clas_1463993499648846Ser_9Arg_6_Alias";
    /** <code>institucionMatNeoTMODIFICARptpNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPNUMIDENTIFICACION = "Nº Identificación";
    /** <code>institucionMatNeoTMODIFICARptpNombre</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPNOMBRE = "pt_p_Nombre";
    /** <code>institucionMatNeoTMODIFICARptpNombre</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPNOMBRE = "Clas_1463993499648846Ser_9Arg_7_Alias";
    /** <code>institucionMatNeoTMODIFICARptpNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPNOMBRE = "Nombre de la Sucursal";
    /** <code>institucionMatNeoTMODIFICARptpParaMaternidad</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPPARAMATERNIDAD = "pt_p_ParaMaternidad";
    /** <code>institucionMatNeoTMODIFICARptpParaMaternidad</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPPARAMATERNIDAD = "Clas_1463993499648846Ser_9Arg_8_Alias";
    /** <code>institucionMatNeoTMODIFICARptpParaMaternidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPPARAMATERNIDAD = "Maternidad";
    /** <code>institucionMatNeoTMODIFICARptpParaNeonatal</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPPARANEONATAL = "pt_p_ParaNeonatal";
    /** <code>institucionMatNeoTMODIFICARptpParaNeonatal</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPPARANEONATAL = "Clas_1463993499648846Ser_9Arg_9_Alias";
    /** <code>institucionMatNeoTMODIFICARptpParaNeonatal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPPARANEONATAL = "Neonatal";
    /** <code>institucionMatNeoTMODIFICARptpFechaInicial</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPFECHAINICIAL = "pt_p_FechaInicial";
    /** <code>institucionMatNeoTMODIFICARptpFechaInicial</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPFECHAINICIAL = "Clas_1463993499648846Ser_9Arg_10_Alias";
    /** <code>institucionMatNeoTMODIFICARptpFechaInicial</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPFECHAINICIAL = "Fecha inicial";
    /** <code>institucionMatNeoTMODIFICARptpFechaFinal</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPFECHAFINAL = "pt_p_FechaFinal";
    /** <code>institucionMatNeoTMODIFICARptpFechaFinal</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPFECHAFINAL = "Clas_1463993499648846Ser_9Arg_11_Alias";
    /** <code>institucionMatNeoTMODIFICARptpFechaFinal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_INSTITUCIONMATNEOTMODIFICARPTPFECHAFINAL = "Fecha final";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_INSTITUCIONMATNEONUMIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_INSTITUCIONMATNEONOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_INSTITUCIONMATNEOPARAMATERNIDAD.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_INSTITUCIONMATNEOPARANEONATAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_INSTITUCIONMATNEOFECHAINICIAL.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_INSTITUCIONMATNEOFECHAFINAL.toUpperCase(), Constants.Type.DATE.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_INSTITUCIONMATNEOCODIGO.toUpperCase(), INSTITUCIONMATNEOCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_INSTITUCIONMATNEONUMIDENTIFICACION.toUpperCase(), INSTITUCIONMATNEONUMIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_INSTITUCIONMATNEONOMBRE.toUpperCase(), INSTITUCIONMATNEONOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_INSTITUCIONMATNEOPARAMATERNIDAD.toUpperCase(), INSTITUCIONMATNEOPARAMATERNIDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_INSTITUCIONMATNEOPARANEONATAL.toUpperCase(), INSTITUCIONMATNEOPARANEONATAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_INSTITUCIONMATNEOFECHAINICIAL.toUpperCase(), INSTITUCIONMATNEOFECHAINICIAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_INSTITUCIONMATNEOFECHAFINAL.toUpperCase(), INSTITUCIONMATNEOFECHAFINAL_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_TIPOIDENTIFICACION.toUpperCase(), TIPOIDENTIFICACION_AGENTS);
        roleAgents.put(ROLE_NAME_TARIFA.toUpperCase(), TARIFA_AGENTS);
        roleAgents.put(ROLE_NAME_MUNICIPIO.toUpperCase(), MUNICIPIO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'InstitucionMatNeo', it returns the identification keys
     * - If className is a facet of the inheritance net of 'InstitucionMatNeo', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_INSTITUCIONMATNEOCODIGO);
        }
        // Facet 'InstitucionMatNeo' (This facet)
        if (InstitucionMatNeoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_INSTITUCIONMATNEOCODIGO);
        }
        return returnList;
    }
}
