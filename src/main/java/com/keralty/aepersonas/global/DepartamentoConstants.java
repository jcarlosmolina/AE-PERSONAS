package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Departamento</code> model class.
 */
public final class DepartamentoConstants {

    private DepartamentoConstants() {

    }

    // Class
    /** <code>Departamento</code> class id. */
    public static final String CLASS_ID = "Clas_1431882039296664_Alias";
    /** <code>Departamento</code> class name. */
    public static final String CLASS_NAME = "Departamento";
    /** <code>Departamento</code> class alias. */
    public static final String CLASS_ALIAS = "Departamento";
    /** <code>Departamento</code> class table name. */
    public static final String TBL_NAME = "Departamento";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "departamentoCodigo,departamentoDescripcion,departamentoCodigoLegal";

    public static final String DSICDEPARTAMENTO = "IC_Departamento";
    

    // Attribute (departamentoCodigo)
    /** <code>departamentoCodigo</code> attribute id. */
    public static final String ATTR_ID_DEPARTAMENTOCODIGO = "Clas_1431882039296664Atr_1_Alias";
    /** <code>departamentoCodigo</code> attribute name. */
    public static final String ATTR_NAME_DEPARTAMENTOCODIGO = "departamentoCodigo";
    /** <code>departamentoCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_DEPARTAMENTOCODIGO = "Código";

    /** <code>departamentoCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_DEPARTAMENTOCODIGO = "";
    /** Agents allowed to view the attribute departamentoCodigo **/
    public static final String DEPARTAMENTOCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (departamentoDescripcion)
    /** <code>departamentoDescripcion</code> attribute id. */
    public static final String ATTR_ID_DEPARTAMENTODESCRIPCION = "Clas_1431882039296664Atr_2_Alias";
    /** <code>departamentoDescripcion</code> attribute name. */
    public static final String ATTR_NAME_DEPARTAMENTODESCRIPCION = "departamentoDescripcion";
    /** <code>departamentoDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_DEPARTAMENTODESCRIPCION = "Descripción";

    /** <code>departamentoDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_DEPARTAMENTODESCRIPCION = "";
    /** Agents allowed to view the attribute departamentoDescripcion **/
    public static final String DEPARTAMENTODESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (departamentoCodigoLegal)
    /** <code>departamentoCodigoLegal</code> attribute id. */
    public static final String ATTR_ID_DEPARTAMENTOCODIGOLEGAL = "Clas_1431882039296664Atr_3_Alias";
    /** <code>departamentoCodigoLegal</code> attribute name. */
    public static final String ATTR_NAME_DEPARTAMENTOCODIGOLEGAL = "departamentoCodigoLegal";
    /** <code>departamentoCodigoLegal</code> attribute alias. */
    public static final String ATTR_ALIAS_DEPARTAMENTOCODIGOLEGAL = "Código Legal";

    /** <code>departamentoCodigoLegal</code> attribute facet sequence. */
    public static final String PATH_FACETS_DEPARTAMENTOCODIGOLEGAL = "";
    /** Agents allowed to view the attribute departamentoCodigoLegal **/
    public static final String DEPARTAMENTOCODIGOLEGAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_DEPARTAMENTOCODIGO = "Codigo";    
    /** <code>departamentoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DEPARTAMENTOCODIGO = "departamentoCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_DEPARTAMENTODESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_DEPARTAMENTODESCRIPCIONLENGTH = 150;
    /** <code>departamentoDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_DEPARTAMENTODESCRIPCION = "departamentoDescripcion";
    // Field (CodigoLegal)
    /** <code>CodigoLegal</code> field name. */
    public static final String FLD_DEPARTAMENTOCODIGOLEGAL = "CodigoLegal";    
    /** <code>CodigoLegal</code> field length. */
    public static final int FLD_DEPARTAMENTOCODIGOLEGALLENGTH = 5;
    /** <code>departamentoCodigoLegal</code> attribute field name. */
    public static final String ATTR_FIELD_DEPARTAMENTOCODIGOLEGAL = "departamentoCodigoLegal";


    // Compound role (Personas)
    /** <code>Personas</code> role id. */
    public static final String ROLE_ID_PERSONAS = "Agr_1432214437888620_Alias";
    /** <code>Personas</code> role name. */
    public static final String ROLE_NAME_PERSONAS = "personas";
    /** <code>DepartamentoNacimiento</code> role alias. */
    public static final String ROLE_ALIAS_PERSONAS = "Personas";


    /** <code>Personas</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONAS = PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO;
    /** <code>Personas</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONAS = "";
    /** <code>Personas</code> role target class. */
    public static final String ROLE_TARGET_PERSONAS = PersonaConstants.CLASS_NAME;
    /** Agents allowed to navigate through Personas **/
    public static final String PERSONAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Municipios)
    /** <code>Municipios</code> role id. */
    public static final String ROLE_ID_MUNICIPIOS = "Agr_1434385776640656_Alias";
    /** <code>Municipios</code> role name. */
    public static final String ROLE_NAME_MUNICIPIOS = "municipios";
    /** <code>Departamento</code> role alias. */
    public static final String ROLE_ALIAS_MUNICIPIOS = "Municipios";


    /** <code>Municipios</code> inverse role name. */
    public static final String ROLE_INVNAME_MUNICIPIOS = MunicipioConstants.ROLE_NAME_DEPARTAMENTO;
    /** <code>Municipios</code> role facet sequence. */
    public static final String PATH_FACETS_MUNICIPIOS = "";
    /** <code>Municipios</code> role target class. */
    public static final String ROLE_TARGET_MUNICIPIOS = MunicipioConstants.CLASS_NAME;
    /** Agents allowed to navigate through Municipios **/
    public static final String MUNICIPIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (PersonasC)
    /** <code>PersonasC</code> role id. */
    public static final String ROLE_ID_PERSONASC = "Agr_1473350729728127_Alias";
    /** <code>PersonasC</code> role name. */
    public static final String ROLE_NAME_PERSONASC = "personasC";
    /** <code>DepartamentoCNac</code> role alias. */
    public static final String ROLE_ALIAS_PERSONASC = "Personas";


    /** <code>PersonasC</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONASC = PersonaCConstants.ROLE_NAME_DEPARTAMENTOCNAC;
    /** <code>PersonasC</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONASC = "";
    /** <code>PersonasC</code> role target class. */
    public static final String ROLE_TARGET_PERSONASC = PersonaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through PersonasC **/
    public static final String PERSONASC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (DireccionesC)
    /** <code>DireccionesC</code> role id. */
    public static final String ROLE_ID_DIRECCIONESC = "Agr_1473350074368213_Alias";
    /** <code>DireccionesC</code> role name. */
    public static final String ROLE_NAME_DIRECCIONESC = "direccionesC";
    /** <code>DepartamentoC</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONESC = "Direcciones";


    /** <code>DireccionesC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONESC = DireccionCConstants.ROLE_NAME_DEPARTAMENTOC;
    /** <code>DireccionesC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONESC = "";
    /** <code>DireccionesC</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONESC = DireccionCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DireccionesC **/
    public static final String DIRECCIONESC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Direcciones)
    /** <code>Direcciones</code> role id. */
    public static final String ROLE_ID_DIRECCIONES = "Agr_1432206180352739_Alias";
    /** <code>Direcciones</code> role name. */
    public static final String ROLE_NAME_DIRECCIONES = "direcciones";
    /** <code>Departamento</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONES = "Direcciones";


    /** <code>Direcciones</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONES = DireccionConstants.ROLE_NAME_DEPARTAMENTO;
    /** <code>Direcciones</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONES = "";
    /** <code>Direcciones</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONES = DireccionConstants.CLASS_NAME;
    /** Agents allowed to navigate through Direcciones **/
    public static final String DIRECCIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Contratantes)
    /** <code>Contratantes</code> role id. */
    public static final String ROLE_ID_CONTRATANTES = "Agr_1432819335168403_Alias";
    /** <code>Contratantes</code> role name. */
    public static final String ROLE_NAME_CONTRATANTES = "contratantes";
    /** <code>DepartamentoNac</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATANTES = "Contratantes";


    /** <code>Contratantes</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATANTES = ContratanteConstants.ROLE_NAME_DEPARTAMENTONAC;
    /** <code>Contratantes</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATANTES = "";
    /** <code>Contratantes</code> role target class. */
    public static final String ROLE_TARGET_CONTRATANTES = ContratanteConstants.CLASS_NAME;
    /** Agents allowed to navigate through Contratantes **/
    public static final String CONTRATANTES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ContratantesRes)
    /** <code>ContratantesRes</code> role id. */
    public static final String ROLE_ID_CONTRATANTESRES = "Agr_1447153106944999_Alias";
    /** <code>ContratantesRes</code> role name. */
    public static final String ROLE_NAME_CONTRATANTESRES = "contratantesRes";
    /** <code>DepartamentoRes</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATANTESRES = "Contratantes";


    /** <code>ContratantesRes</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATANTESRES = ContratanteConstants.ROLE_NAME_DEPARTAMENTORES;
    /** <code>ContratantesRes</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATANTESRES = "";
    /** <code>ContratantesRes</code> role target class. */
    public static final String ROLE_TARGET_CONTRATANTESRES = ContratanteConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratantesRes **/
    public static final String CONTRATANTESRES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (DirSucursalC)
    /** <code>DirSucursalC</code> role id. */
    public static final String ROLE_ID_DIRSUCURSALC = "Agr_1473350991872080_Alias";
    /** <code>DirSucursalC</code> role name. */
    public static final String ROLE_NAME_DIRSUCURSALC = "dirSucursalC";
    /** <code>DepartamentoC</code> role alias. */
    public static final String ROLE_ALIAS_DIRSUCURSALC = "DirSucursalC";


    /** <code>DirSucursalC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRSUCURSALC = DirSucursalCConstants.ROLE_NAME_DEPARTAMENTOC;
    /** <code>DirSucursalC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRSUCURSALC = "";
    /** <code>DirSucursalC</code> role target class. */
    public static final String ROLE_TARGET_DIRSUCURSALC = DirSucursalCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DirSucursalC **/
    public static final String DIRSUCURSALC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Titulares)
    /** <code>Titulares</code> role id. */
    public static final String ROLE_ID_TITULARES = "Agr_1433869615104749_Alias";
    /** <code>Titulares</code> role name. */
    public static final String ROLE_NAME_TITULARES = "titulares";
    /** <code>DepartamentoNac</code> role alias. */
    public static final String ROLE_ALIAS_TITULARES = "Titulares";


    /** <code>Titulares</code> inverse role name. */
    public static final String ROLE_INVNAME_TITULARES = TitularConstants.ROLE_NAME_DEPARTAMENTONAC;
    /** <code>Titulares</code> role facet sequence. */
    public static final String PATH_FACETS_TITULARES = "";
    /** <code>Titulares</code> role target class. */
    public static final String ROLE_TARGET_TITULARES = TitularConstants.CLASS_NAME;
    /** Agents allowed to navigate through Titulares **/
    public static final String TITULARES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (NovedadCTNac)
    /** <code>NovedadCTNac</code> role id. */
    public static final String ROLE_ID_NOVEDADCTNAC = "Agr_1583231270912220_Alias";
    /** <code>NovedadCTNac</code> role name. */
    public static final String ROLE_NAME_NOVEDADCTNAC = "novedadCTNac";
    /** <code>DepartamentoNac</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADCTNAC = "NovedadCTNac";


    /** <code>NovedadCTNac</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADCTNAC = NovedadCTConstants.ROLE_NAME_DEPARTAMENTONAC;
    /** <code>NovedadCTNac</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADCTNAC = "";
    /** <code>NovedadCTNac</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADCTNAC = NovedadCTConstants.CLASS_NAME;
    /** Agents allowed to navigate through NovedadCTNac **/
    public static final String NOVEDADCTNAC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (NovedadCTRes)
    /** <code>NovedadCTRes</code> role id. */
    public static final String ROLE_ID_NOVEDADCTRES = "Agr_1583231270912659_Alias";
    /** <code>NovedadCTRes</code> role name. */
    public static final String ROLE_NAME_NOVEDADCTRES = "novedadCTRes";
    /** <code>DepartamentoRes</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADCTRES = "NovedadCTRes";


    /** <code>NovedadCTRes</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADCTRES = NovedadCTConstants.ROLE_NAME_DEPARTAMENTORES;
    /** <code>NovedadCTRes</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADCTRES = "";
    /** <code>NovedadCTRes</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADCTRES = NovedadCTConstants.CLASS_NAME;
    /** Agents allowed to navigate through NovedadCTRes **/
    public static final String NOVEDADCTRES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (NovedadesMD)
    /** <code>NovedadesMD</code> role id. */
    public static final String ROLE_ID_NOVEDADESMD = "Agr_1582555070464037_Alias";
    /** <code>NovedadesMD</code> role name. */
    public static final String ROLE_NAME_NOVEDADESMD = "novedadesMD";
    /** <code>Departamento</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADESMD = "Direcciones MD";


    /** <code>NovedadesMD</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADESMD = NovedadMDConstants.ROLE_NAME_DEPARTAMENTO;
    /** <code>NovedadesMD</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADESMD = "";
    /** <code>NovedadesMD</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADESMD = NovedadMDConstants.CLASS_NAME;
    /** Agents allowed to navigate through NovedadesMD **/
    public static final String NOVEDADESMD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431882039296664Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear departamento";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>departamentocrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DEPARTAMENTOCREARPATRCODIGO = "p_atrCodigo";
    /** <code>departamentocrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DEPARTAMENTOCREARPATRCODIGO = "Clas_1431882039296664Ser_1Arg_1_Alias";
    /** <code>departamentocrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DEPARTAMENTOCREARPATRCODIGO = "Código";
    /** <code>departamentocrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DEPARTAMENTOCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>departamentocrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DEPARTAMENTOCREARPATRDESCRIPCION = "Clas_1431882039296664Ser_1Arg_2_Alias";
    /** <code>departamentocrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DEPARTAMENTOCREARPATRDESCRIPCION = "Descripción";
    /** <code>departamentocrearpatrCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DEPARTAMENTOCREARPATRCODIGOLEGAL = "p_atrCodigoLegal";
    /** <code>departamentocrearpatrCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DEPARTAMENTOCREARPATRCODIGOLEGAL = "Clas_1431882039296664Ser_1Arg_3_Alias";
    /** <code>departamentocrearpatrCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DEPARTAMENTOCREARPATRCODIGOLEGAL = "Código Legal";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431882039296664Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar departamento";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431882039296664Pre_1_MsgError";
    // Inbound arguments
    /** <code>departamentoeliminarpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_DEPARTAMENTOELIMINARPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoeliminarpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_DEPARTAMENTOELIMINARPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_2Arg_1_Alias";
    /** <code>departamentoeliminarpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_DEPARTAMENTOELIMINARPTHISDEPARTAMENTO = "Departamento";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431882039296664Ser_3_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentosincronizarpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_DEPARTAMENTOSINCRONIZARPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentosincronizarpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_DEPARTAMENTOSINCRONIZARPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_3Arg_1_Alias";
    /** <code>departamentosincronizarpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_DEPARTAMENTOSINCRONIZARPTHISDEPARTAMENTO = "Departamento";
    /** <code>departamentosincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_DEPARTAMENTOSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>departamentosincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_DEPARTAMENTOSINCRONIZARPDESCRIPCION = "Clas_1431882039296664Ser_3Arg_2_Alias";
    /** <code>departamentosincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_DEPARTAMENTOSINCRONIZARPDESCRIPCION = "Descripción";
    // Service (InsDepartamentoDireccion)
    /** <code>InsDepartamentoDireccion</code> service id. */
    public static final String SERV_ID_INSDEPARTAMENTODIRECCION = "Clas_1431882039296664Ser_4_Alias";
    /** <code>InsDepartamentoDireccion</code> service name. */
    public static final String SERV_NAME_INSDEPARTAMENTODIRECCION = "InsDepartamentoDireccion";
    /** <code>InsDepartamentoDireccion</code> service alias. */
    public static final String SERV_ALIAS_INSDEPARTAMENTODIRECCION = "InsDepartamentoDireccion";
    /** Agents allowed to execute the service InsDepartamentoDireccion **/
    public static final String INSDEPARTAMENTODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoInsDepartamentoDireccionpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTODIRECCION_DEPARTAMENTOINSDEPARTAMENTODIRECCIONPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoInsDepartamentoDireccionpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTODIRECCION_DEPARTAMENTOINSDEPARTAMENTODIRECCIONPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_4Arg_1_Alias";
    /** <code>departamentoInsDepartamentoDireccionpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTODIRECCION_DEPARTAMENTOINSDEPARTAMENTODIRECCIONPTHISDEPARTAMENTO = "Departamento";
    /** <code>departamentoInsDepartamentoDireccionpevcDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTODIRECCION_DEPARTAMENTOINSDEPARTAMENTODIRECCIONPEVCDIRECCION = "p_evcDireccion";
    /** <code>departamentoInsDepartamentoDireccionpevcDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTODIRECCION_DEPARTAMENTOINSDEPARTAMENTODIRECCIONPEVCDIRECCION = "Clas_1431882039296664Ser_4Arg_2_Alias";
    /** <code>departamentoInsDepartamentoDireccionpevcDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTODIRECCION_DEPARTAMENTOINSDEPARTAMENTODIRECCIONPEVCDIRECCION = "Direcciones";
    // Service (DelDepartamentoDireccion)
    /** <code>DelDepartamentoDireccion</code> service id. */
    public static final String SERV_ID_DELDEPARTAMENTODIRECCION = "Clas_1431882039296664Ser_5_Alias";
    /** <code>DelDepartamentoDireccion</code> service name. */
    public static final String SERV_NAME_DELDEPARTAMENTODIRECCION = "DelDepartamentoDireccion";
    /** <code>DelDepartamentoDireccion</code> service alias. */
    public static final String SERV_ALIAS_DELDEPARTAMENTODIRECCION = "DelDepartamentoDireccion";
    /** Agents allowed to execute the service DelDepartamentoDireccion **/
    public static final String DELDEPARTAMENTODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoDelDepartamentoDireccionpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTODIRECCION_DEPARTAMENTODELDEPARTAMENTODIRECCIONPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoDelDepartamentoDireccionpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTODIRECCION_DEPARTAMENTODELDEPARTAMENTODIRECCIONPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_5Arg_1_Alias";
    /** <code>departamentoDelDepartamentoDireccionpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTODIRECCION_DEPARTAMENTODELDEPARTAMENTODIRECCIONPTHISDEPARTAMENTO = "Departamento";
    /** <code>departamentoDelDepartamentoDireccionpevcDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTODIRECCION_DEPARTAMENTODELDEPARTAMENTODIRECCIONPEVCDIRECCION = "p_evcDireccion";
    /** <code>departamentoDelDepartamentoDireccionpevcDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTODIRECCION_DEPARTAMENTODELDEPARTAMENTODIRECCIONPEVCDIRECCION = "Clas_1431882039296664Ser_5Arg_2_Alias";
    /** <code>departamentoDelDepartamentoDireccionpevcDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTODIRECCION_DEPARTAMENTODELDEPARTAMENTODIRECCIONPEVCDIRECCION = "Direcciones";
    // Service (InsDptoNacimientoPersona)
    /** <code>InsDptoNacimientoPersona</code> service id. */
    public static final String SERV_ID_INSDPTONACIMIENTOPERSONA = "Clas_1431882039296664Ser_6_Alias";
    /** <code>InsDptoNacimientoPersona</code> service name. */
    public static final String SERV_NAME_INSDPTONACIMIENTOPERSONA = "InsDptoNacimientoPersona";
    /** <code>InsDptoNacimientoPersona</code> service alias. */
    public static final String SERV_ALIAS_INSDPTONACIMIENTOPERSONA = "InsDptoNacimientoPersona";
    /** Agents allowed to execute the service InsDptoNacimientoPersona **/
    public static final String INSDPTONACIMIENTOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoInsDptoNacimientoPersonapthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDPTONACIMIENTOPERSONA_DEPARTAMENTOINSDPTONACIMIENTOPERSONAPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoInsDptoNacimientoPersonapthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDPTONACIMIENTOPERSONA_DEPARTAMENTOINSDPTONACIMIENTOPERSONAPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_6Arg_1_Alias";
    /** <code>departamentoInsDptoNacimientoPersonapthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDPTONACIMIENTOPERSONA_DEPARTAMENTOINSDPTONACIMIENTOPERSONAPTHISDEPARTAMENTO = "Departamento nacimiento";
    /** <code>departamentoInsDptoNacimientoPersonapevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSDPTONACIMIENTOPERSONA_DEPARTAMENTOINSDPTONACIMIENTOPERSONAPEVCPERSONA = "p_evcPersona";
    /** <code>departamentoInsDptoNacimientoPersonapevcPersona</code> inbound argument id. */
    public static final String ARG_ID_INSDPTONACIMIENTOPERSONA_DEPARTAMENTOINSDPTONACIMIENTOPERSONAPEVCPERSONA = "Clas_1431882039296664Ser_6Arg_2_Alias";
    /** <code>departamentoInsDptoNacimientoPersonapevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDPTONACIMIENTOPERSONA_DEPARTAMENTOINSDPTONACIMIENTOPERSONAPEVCPERSONA = "Personas";
    // Service (DelDptoNacimientoPersona)
    /** <code>DelDptoNacimientoPersona</code> service id. */
    public static final String SERV_ID_DELDPTONACIMIENTOPERSONA = "Clas_1431882039296664Ser_7_Alias";
    /** <code>DelDptoNacimientoPersona</code> service name. */
    public static final String SERV_NAME_DELDPTONACIMIENTOPERSONA = "DelDptoNacimientoPersona";
    /** <code>DelDptoNacimientoPersona</code> service alias. */
    public static final String SERV_ALIAS_DELDPTONACIMIENTOPERSONA = "DelDptoNacimientoPersona";
    /** Agents allowed to execute the service DelDptoNacimientoPersona **/
    public static final String DELDPTONACIMIENTOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoDelDptoNacimientoPersonapthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDPTONACIMIENTOPERSONA_DEPARTAMENTODELDPTONACIMIENTOPERSONAPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoDelDptoNacimientoPersonapthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDPTONACIMIENTOPERSONA_DEPARTAMENTODELDPTONACIMIENTOPERSONAPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_7Arg_1_Alias";
    /** <code>departamentoDelDptoNacimientoPersonapthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDPTONACIMIENTOPERSONA_DEPARTAMENTODELDPTONACIMIENTOPERSONAPTHISDEPARTAMENTO = "Departamento nacimiento";
    /** <code>departamentoDelDptoNacimientoPersonapevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELDPTONACIMIENTOPERSONA_DEPARTAMENTODELDPTONACIMIENTOPERSONAPEVCPERSONA = "p_evcPersona";
    /** <code>departamentoDelDptoNacimientoPersonapevcPersona</code> inbound argument id. */
    public static final String ARG_ID_DELDPTONACIMIENTOPERSONA_DEPARTAMENTODELDPTONACIMIENTOPERSONAPEVCPERSONA = "Clas_1431882039296664Ser_7Arg_2_Alias";
    /** <code>departamentoDelDptoNacimientoPersonapevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDPTONACIMIENTOPERSONA_DEPARTAMENTODELDPTONACIMIENTOPERSONAPEVCPERSONA = "Personas";
    // Service (InsDepartamentoNacContratante)
    /** <code>InsDepartamentoNacContratante</code> service id. */
    public static final String SERV_ID_INSDEPARTAMENTONACCONTRATANTE = "Clas_1431882039296664Ser_8_Alias";
    /** <code>InsDepartamentoNacContratante</code> service name. */
    public static final String SERV_NAME_INSDEPARTAMENTONACCONTRATANTE = "InsDepartamentoNacContratante";
    /** <code>InsDepartamentoNacContratante</code> service alias. */
    public static final String SERV_ALIAS_INSDEPARTAMENTONACCONTRATANTE = "InsDepartamentoNacContratante";
    /** Agents allowed to execute the service InsDepartamentoNacContratante **/
    public static final String INSDEPARTAMENTONACCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoInsDepartamentoNacContratantepthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTONACCONTRATANTE_DEPARTAMENTOINSDEPARTAMENTONACCONTRATANTEPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoInsDepartamentoNacContratantepthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTONACCONTRATANTE_DEPARTAMENTOINSDEPARTAMENTONACCONTRATANTEPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_8Arg_1_Alias";
    /** <code>departamentoInsDepartamentoNacContratantepthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTONACCONTRATANTE_DEPARTAMENTOINSDEPARTAMENTONACCONTRATANTEPTHISDEPARTAMENTO = "Departamento nacimiento";
    /** <code>departamentoInsDepartamentoNacContratantepevcContratante</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTONACCONTRATANTE_DEPARTAMENTOINSDEPARTAMENTONACCONTRATANTEPEVCCONTRATANTE = "p_evcContratante";
    /** <code>departamentoInsDepartamentoNacContratantepevcContratante</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTONACCONTRATANTE_DEPARTAMENTOINSDEPARTAMENTONACCONTRATANTEPEVCCONTRATANTE = "Clas_1431882039296664Ser_8Arg_2_Alias";
    /** <code>departamentoInsDepartamentoNacContratantepevcContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTONACCONTRATANTE_DEPARTAMENTOINSDEPARTAMENTONACCONTRATANTEPEVCCONTRATANTE = "Contratantes";
    // Service (DelDepartamentoNacContratante)
    /** <code>DelDepartamentoNacContratante</code> service id. */
    public static final String SERV_ID_DELDEPARTAMENTONACCONTRATANTE = "Clas_1431882039296664Ser_9_Alias";
    /** <code>DelDepartamentoNacContratante</code> service name. */
    public static final String SERV_NAME_DELDEPARTAMENTONACCONTRATANTE = "DelDepartamentoNacContratante";
    /** <code>DelDepartamentoNacContratante</code> service alias. */
    public static final String SERV_ALIAS_DELDEPARTAMENTONACCONTRATANTE = "DelDepartamentoNacContratante";
    /** Agents allowed to execute the service DelDepartamentoNacContratante **/
    public static final String DELDEPARTAMENTONACCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoDelDepartamentoNacContratantepthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTONACCONTRATANTE_DEPARTAMENTODELDEPARTAMENTONACCONTRATANTEPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoDelDepartamentoNacContratantepthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTONACCONTRATANTE_DEPARTAMENTODELDEPARTAMENTONACCONTRATANTEPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_9Arg_1_Alias";
    /** <code>departamentoDelDepartamentoNacContratantepthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTONACCONTRATANTE_DEPARTAMENTODELDEPARTAMENTONACCONTRATANTEPTHISDEPARTAMENTO = "Departamento nacimiento";
    /** <code>departamentoDelDepartamentoNacContratantepevcContratante</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTONACCONTRATANTE_DEPARTAMENTODELDEPARTAMENTONACCONTRATANTEPEVCCONTRATANTE = "p_evcContratante";
    /** <code>departamentoDelDepartamentoNacContratantepevcContratante</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTONACCONTRATANTE_DEPARTAMENTODELDEPARTAMENTONACCONTRATANTEPEVCCONTRATANTE = "Clas_1431882039296664Ser_9Arg_2_Alias";
    /** <code>departamentoDelDepartamentoNacContratantepevcContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTONACCONTRATANTE_DEPARTAMENTODELDEPARTAMENTONACCONTRATANTEPEVCCONTRATANTE = "Contratantes";
    // Service (InsDepartamentoNacTitular)
    /** <code>InsDepartamentoNacTitular</code> service id. */
    public static final String SERV_ID_INSDEPARTAMENTONACTITULAR = "Clas_1431882039296664Ser_10_Alias";
    /** <code>InsDepartamentoNacTitular</code> service name. */
    public static final String SERV_NAME_INSDEPARTAMENTONACTITULAR = "InsDepartamentoNacTitular";
    /** <code>InsDepartamentoNacTitular</code> service alias. */
    public static final String SERV_ALIAS_INSDEPARTAMENTONACTITULAR = "InsDepartamentoNacTitular";
    /** Agents allowed to execute the service InsDepartamentoNacTitular **/
    public static final String INSDEPARTAMENTONACTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoInsDepartamentoNacTitularpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTONACTITULAR_DEPARTAMENTOINSDEPARTAMENTONACTITULARPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoInsDepartamentoNacTitularpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTONACTITULAR_DEPARTAMENTOINSDEPARTAMENTONACTITULARPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_10Arg_1_Alias";
    /** <code>departamentoInsDepartamentoNacTitularpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTONACTITULAR_DEPARTAMENTOINSDEPARTAMENTONACTITULARPTHISDEPARTAMENTO = "Departamento nacimiento";
    /** <code>departamentoInsDepartamentoNacTitularpevcTitular</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTONACTITULAR_DEPARTAMENTOINSDEPARTAMENTONACTITULARPEVCTITULAR = "p_evcTitular";
    /** <code>departamentoInsDepartamentoNacTitularpevcTitular</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTONACTITULAR_DEPARTAMENTOINSDEPARTAMENTONACTITULARPEVCTITULAR = "Clas_1431882039296664Ser_10Arg_2_Alias";
    /** <code>departamentoInsDepartamentoNacTitularpevcTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTONACTITULAR_DEPARTAMENTOINSDEPARTAMENTONACTITULARPEVCTITULAR = "Titulares";
    // Service (DelDepartamentoNacTitular)
    /** <code>DelDepartamentoNacTitular</code> service id. */
    public static final String SERV_ID_DELDEPARTAMENTONACTITULAR = "Clas_1431882039296664Ser_11_Alias";
    /** <code>DelDepartamentoNacTitular</code> service name. */
    public static final String SERV_NAME_DELDEPARTAMENTONACTITULAR = "DelDepartamentoNacTitular";
    /** <code>DelDepartamentoNacTitular</code> service alias. */
    public static final String SERV_ALIAS_DELDEPARTAMENTONACTITULAR = "DelDepartamentoNacTitular";
    /** Agents allowed to execute the service DelDepartamentoNacTitular **/
    public static final String DELDEPARTAMENTONACTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoDelDepartamentoNacTitularpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTONACTITULAR_DEPARTAMENTODELDEPARTAMENTONACTITULARPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoDelDepartamentoNacTitularpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTONACTITULAR_DEPARTAMENTODELDEPARTAMENTONACTITULARPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_11Arg_1_Alias";
    /** <code>departamentoDelDepartamentoNacTitularpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTONACTITULAR_DEPARTAMENTODELDEPARTAMENTONACTITULARPTHISDEPARTAMENTO = "Departamento nacimiento";
    /** <code>departamentoDelDepartamentoNacTitularpevcTitular</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTONACTITULAR_DEPARTAMENTODELDEPARTAMENTONACTITULARPEVCTITULAR = "p_evcTitular";
    /** <code>departamentoDelDepartamentoNacTitularpevcTitular</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTONACTITULAR_DEPARTAMENTODELDEPARTAMENTONACTITULARPEVCTITULAR = "Clas_1431882039296664Ser_11Arg_2_Alias";
    /** <code>departamentoDelDepartamentoNacTitularpevcTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTONACTITULAR_DEPARTAMENTODELDEPARTAMENTONACTITULARPEVCTITULAR = "Titulares";
    // Service (InsMunicipioDepartamento)
    /** <code>InsMunicipioDepartamento</code> service id. */
    public static final String SERV_ID_INSMUNICIPIODEPARTAMENTO = "Clas_1431882039296664Ser_12_Alias";
    /** <code>InsMunicipioDepartamento</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIODEPARTAMENTO = "InsMunicipioDepartamento";
    /** <code>InsMunicipioDepartamento</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIODEPARTAMENTO = "InsMunicipioDepartamento";
    /** Agents allowed to execute the service InsMunicipioDepartamento **/
    public static final String INSMUNICIPIODEPARTAMENTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoInsMunicipioDepartamentopthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIODEPARTAMENTO_DEPARTAMENTOINSMUNICIPIODEPARTAMENTOPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoInsMunicipioDepartamentopthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIODEPARTAMENTO_DEPARTAMENTOINSMUNICIPIODEPARTAMENTOPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_12Arg_1_Alias";
    /** <code>departamentoInsMunicipioDepartamentopthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIODEPARTAMENTO_DEPARTAMENTOINSMUNICIPIODEPARTAMENTOPTHISDEPARTAMENTO = "Departamento";
    /** <code>departamentoInsMunicipioDepartamentopevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIODEPARTAMENTO_DEPARTAMENTOINSMUNICIPIODEPARTAMENTOPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>departamentoInsMunicipioDepartamentopevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIODEPARTAMENTO_DEPARTAMENTOINSMUNICIPIODEPARTAMENTOPEVCMUNICIPIO = "Clas_1431882039296664Ser_12Arg_2_Alias";
    /** <code>departamentoInsMunicipioDepartamentopevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIODEPARTAMENTO_DEPARTAMENTOINSMUNICIPIODEPARTAMENTOPEVCMUNICIPIO = "Municipios";
    // Service (DelMunicipioDepartamento)
    /** <code>DelMunicipioDepartamento</code> service id. */
    public static final String SERV_ID_DELMUNICIPIODEPARTAMENTO = "Clas_1431882039296664Ser_13_Alias";
    /** <code>DelMunicipioDepartamento</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIODEPARTAMENTO = "DelMunicipioDepartamento";
    /** <code>DelMunicipioDepartamento</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIODEPARTAMENTO = "DelMunicipioDepartamento";
    /** Agents allowed to execute the service DelMunicipioDepartamento **/
    public static final String DELMUNICIPIODEPARTAMENTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoDelMunicipioDepartamentopthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIODEPARTAMENTO_DEPARTAMENTODELMUNICIPIODEPARTAMENTOPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoDelMunicipioDepartamentopthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIODEPARTAMENTO_DEPARTAMENTODELMUNICIPIODEPARTAMENTOPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_13Arg_1_Alias";
    /** <code>departamentoDelMunicipioDepartamentopthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIODEPARTAMENTO_DEPARTAMENTODELMUNICIPIODEPARTAMENTOPTHISDEPARTAMENTO = "Departamento";
    /** <code>departamentoDelMunicipioDepartamentopevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIODEPARTAMENTO_DEPARTAMENTODELMUNICIPIODEPARTAMENTOPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>departamentoDelMunicipioDepartamentopevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIODEPARTAMENTO_DEPARTAMENTODELMUNICIPIODEPARTAMENTOPEVCMUNICIPIO = "Clas_1431882039296664Ser_13Arg_2_Alias";
    /** <code>departamentoDelMunicipioDepartamentopevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIODEPARTAMENTO_DEPARTAMENTODELMUNICIPIODEPARTAMENTOPEVCMUNICIPIO = "Municipios";
    // Service (InsDepartamentoRes)
    /** <code>InsDepartamentoRes</code> service id. */
    public static final String SERV_ID_INSDEPARTAMENTORES = "Clas_1431882039296664Ser_14_Alias";
    /** <code>InsDepartamentoRes</code> service name. */
    public static final String SERV_NAME_INSDEPARTAMENTORES = "InsDepartamentoRes";
    /** <code>InsDepartamentoRes</code> service alias. */
    public static final String SERV_ALIAS_INSDEPARTAMENTORES = "InsDepartamentoRes";
    /** Agents allowed to execute the service InsDepartamentoRes **/
    public static final String INSDEPARTAMENTORES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoInsDepartamentoRespthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTORES_DEPARTAMENTOINSDEPARTAMENTORESPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoInsDepartamentoRespthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTORES_DEPARTAMENTOINSDEPARTAMENTORESPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_14Arg_1_Alias";
    /** <code>departamentoInsDepartamentoRespthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTORES_DEPARTAMENTOINSDEPARTAMENTORESPTHISDEPARTAMENTO = "Departamento de Residencia";
    /** <code>departamentoInsDepartamentoRespevcContratante</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTORES_DEPARTAMENTOINSDEPARTAMENTORESPEVCCONTRATANTE = "p_evcContratante";
    /** <code>departamentoInsDepartamentoRespevcContratante</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTORES_DEPARTAMENTOINSDEPARTAMENTORESPEVCCONTRATANTE = "Clas_1431882039296664Ser_14Arg_2_Alias";
    /** <code>departamentoInsDepartamentoRespevcContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTORES_DEPARTAMENTOINSDEPARTAMENTORESPEVCCONTRATANTE = "Contratantes";
    // Service (DelDepartamentoRes)
    /** <code>DelDepartamentoRes</code> service id. */
    public static final String SERV_ID_DELDEPARTAMENTORES = "Clas_1431882039296664Ser_15_Alias";
    /** <code>DelDepartamentoRes</code> service name. */
    public static final String SERV_NAME_DELDEPARTAMENTORES = "DelDepartamentoRes";
    /** <code>DelDepartamentoRes</code> service alias. */
    public static final String SERV_ALIAS_DELDEPARTAMENTORES = "DelDepartamentoRes";
    /** Agents allowed to execute the service DelDepartamentoRes **/
    public static final String DELDEPARTAMENTORES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>departamentoDelDepartamentoRespthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTORES_DEPARTAMENTODELDEPARTAMENTORESPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoDelDepartamentoRespthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTORES_DEPARTAMENTODELDEPARTAMENTORESPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_15Arg_1_Alias";
    /** <code>departamentoDelDepartamentoRespthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTORES_DEPARTAMENTODELDEPARTAMENTORESPTHISDEPARTAMENTO = "Departamento de Residencia";
    /** <code>departamentoDelDepartamentoRespevcContratante</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTORES_DEPARTAMENTODELDEPARTAMENTORESPEVCCONTRATANTE = "p_evcContratante";
    /** <code>departamentoDelDepartamentoRespevcContratante</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTORES_DEPARTAMENTODELDEPARTAMENTORESPEVCCONTRATANTE = "Clas_1431882039296664Ser_15Arg_2_Alias";
    /** <code>departamentoDelDepartamentoRespevcContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTORES_DEPARTAMENTODELDEPARTAMENTORESPEVCCONTRATANTE = "Contratantes";
    // Service (InsDepartamentoC)
    /** <code>InsDepartamentoC</code> service id. */
    public static final String SERV_ID_INSDEPARTAMENTOC = "Clas_1431882039296664Ser_16_Alias";
    /** <code>InsDepartamentoC</code> service name. */
    public static final String SERV_NAME_INSDEPARTAMENTOC = "InsDepartamentoC";
    /** <code>InsDepartamentoC</code> service alias. */
    public static final String SERV_ALIAS_INSDEPARTAMENTOC = "InsDepartamentoC";
    /** Agents allowed to execute the service InsDepartamentoC **/
    public static final String INSDEPARTAMENTOC_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>departamentoInsDepartamentoCpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTOC_DEPARTAMENTOINSDEPARTAMENTOCPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoInsDepartamentoCpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTOC_DEPARTAMENTOINSDEPARTAMENTOCPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_16Arg_1_Alias";
    /** <code>departamentoInsDepartamentoCpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTOC_DEPARTAMENTOINSDEPARTAMENTOCPTHISDEPARTAMENTO = "Departamento";
    /** <code>departamentoInsDepartamentoCpevcDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTOC_DEPARTAMENTOINSDEPARTAMENTOCPEVCDIRECCIONC = "p_evcDireccionC";
    /** <code>departamentoInsDepartamentoCpevcDireccionC</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTOC_DEPARTAMENTOINSDEPARTAMENTOCPEVCDIRECCIONC = "Clas_1431882039296664Ser_16Arg_2_Alias";
    /** <code>departamentoInsDepartamentoCpevcDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTOC_DEPARTAMENTOINSDEPARTAMENTOCPEVCDIRECCIONC = "Direcciones";
    // Service (DelDepartamentoC)
    /** <code>DelDepartamentoC</code> service id. */
    public static final String SERV_ID_DELDEPARTAMENTOC = "Clas_1431882039296664Ser_17_Alias";
    /** <code>DelDepartamentoC</code> service name. */
    public static final String SERV_NAME_DELDEPARTAMENTOC = "DelDepartamentoC";
    /** <code>DelDepartamentoC</code> service alias. */
    public static final String SERV_ALIAS_DELDEPARTAMENTOC = "DelDepartamentoC";
    /** Agents allowed to execute the service DelDepartamentoC **/
    public static final String DELDEPARTAMENTOC_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>departamentoDelDepartamentoCpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTOC_DEPARTAMENTODELDEPARTAMENTOCPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoDelDepartamentoCpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTOC_DEPARTAMENTODELDEPARTAMENTOCPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_17Arg_1_Alias";
    /** <code>departamentoDelDepartamentoCpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTOC_DEPARTAMENTODELDEPARTAMENTOCPTHISDEPARTAMENTO = "Departamento";
    /** <code>departamentoDelDepartamentoCpevcDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTOC_DEPARTAMENTODELDEPARTAMENTOCPEVCDIRECCIONC = "p_evcDireccionC";
    /** <code>departamentoDelDepartamentoCpevcDireccionC</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTOC_DEPARTAMENTODELDEPARTAMENTOCPEVCDIRECCIONC = "Clas_1431882039296664Ser_17Arg_2_Alias";
    /** <code>departamentoDelDepartamentoCpevcDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTOC_DEPARTAMENTODELDEPARTAMENTOCPEVCDIRECCIONC = "Direcciones";
    // Service (InsDepartamentoCNac)
    /** <code>InsDepartamentoCNac</code> service id. */
    public static final String SERV_ID_INSDEPARTAMENTOCNAC = "Clas_1431882039296664Ser_18_Alias";
    /** <code>InsDepartamentoCNac</code> service name. */
    public static final String SERV_NAME_INSDEPARTAMENTOCNAC = "InsDepartamentoCNac";
    /** <code>InsDepartamentoCNac</code> service alias. */
    public static final String SERV_ALIAS_INSDEPARTAMENTOCNAC = "InsDepartamentoCNac";
    /** Agents allowed to execute the service InsDepartamentoCNac **/
    public static final String INSDEPARTAMENTOCNAC_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>departamentoInsDepartamentoCNacpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTOCNAC_DEPARTAMENTOINSDEPARTAMENTOCNACPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoInsDepartamentoCNacpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTOCNAC_DEPARTAMENTOINSDEPARTAMENTOCNACPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_18Arg_1_Alias";
    /** <code>departamentoInsDepartamentoCNacpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTOCNAC_DEPARTAMENTOINSDEPARTAMENTOCNACPTHISDEPARTAMENTO = "Departamento nacimiento";
    /** <code>departamentoInsDepartamentoCNacpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTOCNAC_DEPARTAMENTOINSDEPARTAMENTOCNACPEVCPERSONAC = "p_evcPersonaC";
    /** <code>departamentoInsDepartamentoCNacpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTOCNAC_DEPARTAMENTOINSDEPARTAMENTOCNACPEVCPERSONAC = "Clas_1431882039296664Ser_18Arg_2_Alias";
    /** <code>departamentoInsDepartamentoCNacpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTOCNAC_DEPARTAMENTOINSDEPARTAMENTOCNACPEVCPERSONAC = "Personas";
    // Service (DelDepartamentoCNac)
    /** <code>DelDepartamentoCNac</code> service id. */
    public static final String SERV_ID_DELDEPARTAMENTOCNAC = "Clas_1431882039296664Ser_19_Alias";
    /** <code>DelDepartamentoCNac</code> service name. */
    public static final String SERV_NAME_DELDEPARTAMENTOCNAC = "DelDepartamentoCNac";
    /** <code>DelDepartamentoCNac</code> service alias. */
    public static final String SERV_ALIAS_DELDEPARTAMENTOCNAC = "DelDepartamentoCNac";
    /** Agents allowed to execute the service DelDepartamentoCNac **/
    public static final String DELDEPARTAMENTOCNAC_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>departamentoDelDepartamentoCNacpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTOCNAC_DEPARTAMENTODELDEPARTAMENTOCNACPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoDelDepartamentoCNacpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTOCNAC_DEPARTAMENTODELDEPARTAMENTOCNACPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_19Arg_1_Alias";
    /** <code>departamentoDelDepartamentoCNacpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTOCNAC_DEPARTAMENTODELDEPARTAMENTOCNACPTHISDEPARTAMENTO = "Departamento nacimiento";
    /** <code>departamentoDelDepartamentoCNacpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTOCNAC_DEPARTAMENTODELDEPARTAMENTOCNACPEVCPERSONAC = "p_evcPersonaC";
    /** <code>departamentoDelDepartamentoCNacpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTOCNAC_DEPARTAMENTODELDEPARTAMENTOCNACPEVCPERSONAC = "Clas_1431882039296664Ser_19Arg_2_Alias";
    /** <code>departamentoDelDepartamentoCNacpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTOCNAC_DEPARTAMENTODELDEPARTAMENTOCNACPEVCPERSONAC = "Personas";
    // Service (InsDepartamentoDirSucursalC)
    /** <code>InsDepartamentoDirSucursalC</code> service id. */
    public static final String SERV_ID_INSDEPARTAMENTODIRSUCURSALC = "Clas_1431882039296664Ser_20_Alias";
    /** <code>InsDepartamentoDirSucursalC</code> service name. */
    public static final String SERV_NAME_INSDEPARTAMENTODIRSUCURSALC = "InsDepartamentoDirSucursalC";
    /** <code>InsDepartamentoDirSucursalC</code> service alias. */
    public static final String SERV_ALIAS_INSDEPARTAMENTODIRSUCURSALC = "InsDepartamentoDirSucursalC";
    /** Agents allowed to execute the service InsDepartamentoDirSucursalC **/
    public static final String INSDEPARTAMENTODIRSUCURSALC_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>departamentoInsDepartamentoDirSucursalCpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTODIRSUCURSALC_DEPARTAMENTOINSDEPARTAMENTODIRSUCURSALCPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoInsDepartamentoDirSucursalCpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTODIRSUCURSALC_DEPARTAMENTOINSDEPARTAMENTODIRSUCURSALCPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_20Arg_1_Alias";
    /** <code>departamentoInsDepartamentoDirSucursalCpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTODIRSUCURSALC_DEPARTAMENTOINSDEPARTAMENTODIRSUCURSALCPTHISDEPARTAMENTO = "Departamento";
    /** <code>departamentoInsDepartamentoDirSucursalCpevcDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTODIRSUCURSALC_DEPARTAMENTOINSDEPARTAMENTODIRSUCURSALCPEVCDIRSUCURSALC = "p_evcDirSucursalC";
    /** <code>departamentoInsDepartamentoDirSucursalCpevcDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTODIRSUCURSALC_DEPARTAMENTOINSDEPARTAMENTODIRSUCURSALCPEVCDIRSUCURSALC = "Clas_1431882039296664Ser_20Arg_2_Alias";
    /** <code>departamentoInsDepartamentoDirSucursalCpevcDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTODIRSUCURSALC_DEPARTAMENTOINSDEPARTAMENTODIRSUCURSALCPEVCDIRSUCURSALC = "DirSucursalC";
    // Service (DelDepartamentoDirSucursalC)
    /** <code>DelDepartamentoDirSucursalC</code> service id. */
    public static final String SERV_ID_DELDEPARTAMENTODIRSUCURSALC = "Clas_1431882039296664Ser_21_Alias";
    /** <code>DelDepartamentoDirSucursalC</code> service name. */
    public static final String SERV_NAME_DELDEPARTAMENTODIRSUCURSALC = "DelDepartamentoDirSucursalC";
    /** <code>DelDepartamentoDirSucursalC</code> service alias. */
    public static final String SERV_ALIAS_DELDEPARTAMENTODIRSUCURSALC = "DelDepartamentoDirSucursalC";
    /** Agents allowed to execute the service DelDepartamentoDirSucursalC **/
    public static final String DELDEPARTAMENTODIRSUCURSALC_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>departamentoDelDepartamentoDirSucursalCpthisDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTODIRSUCURSALC_DEPARTAMENTODELDEPARTAMENTODIRSUCURSALCPTHISDEPARTAMENTO = "p_thisDepartamento";
    /** <code>departamentoDelDepartamentoDirSucursalCpthisDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTODIRSUCURSALC_DEPARTAMENTODELDEPARTAMENTODIRSUCURSALCPTHISDEPARTAMENTO = "Clas_1431882039296664Ser_21Arg_1_Alias";
    /** <code>departamentoDelDepartamentoDirSucursalCpthisDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTODIRSUCURSALC_DEPARTAMENTODELDEPARTAMENTODIRSUCURSALCPTHISDEPARTAMENTO = "Departamento";
    /** <code>departamentoDelDepartamentoDirSucursalCpevcDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTODIRSUCURSALC_DEPARTAMENTODELDEPARTAMENTODIRSUCURSALCPEVCDIRSUCURSALC = "p_evcDirSucursalC";
    /** <code>departamentoDelDepartamentoDirSucursalCpevcDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTODIRSUCURSALC_DEPARTAMENTODELDEPARTAMENTODIRSUCURSALCPEVCDIRSUCURSALC = "Clas_1431882039296664Ser_21Arg_2_Alias";
    /** <code>departamentoDelDepartamentoDirSucursalCpevcDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTODIRSUCURSALC_DEPARTAMENTODELDEPARTAMENTODIRSUCURSALCPEVCDIRSUCURSALC = "DirSucursalC";

    public static final String FILTER_NAME_IFDEPARTAMENTOCODIGO = "iF_DepartamentoCodigo";
    public static final String VAR_NAME_IFDEPARTAMENTOCODIGO_VCODIGO = "v_Codigo";
    public static final String FILTER_NAME_FDEPARTAMENTOCODIGOLEGAL = "F_DepartamentoCodigoLegal";
    public static final String VAR_NAME_FDEPARTAMENTOCODIGOLEGAL_VFCODLEGAL = "vfCodLegal";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_DEPARTAMENTODESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DEPARTAMENTOCODIGOLEGAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_DEPARTAMENTOCODIGO.toUpperCase(), DEPARTAMENTOCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DEPARTAMENTODESCRIPCION.toUpperCase(), DEPARTAMENTODESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_DEPARTAMENTOCODIGOLEGAL.toUpperCase(), DEPARTAMENTOCODIGOLEGAL_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Departamento', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Departamento', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_DEPARTAMENTOCODIGO);
        }
        // Facet 'Departamento' (This facet)
        if (DepartamentoConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_DEPARTAMENTOCODIGO);
        }
        return returnList;
    }
}
