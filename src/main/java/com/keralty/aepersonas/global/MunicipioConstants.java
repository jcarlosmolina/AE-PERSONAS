package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Municipio</code> model class.
 */
public final class MunicipioConstants {

    private MunicipioConstants() {

    }

    // Class
    /** <code>Municipio</code> class id. */
    public static final String CLASS_ID = "Clas_1431890034688728_Alias";
    /** <code>Municipio</code> class name. */
    public static final String CLASS_NAME = "Municipio";
    /** <code>Municipio</code> class alias. */
    public static final String CLASS_ALIAS = "Municipio";
    /** <code>Municipio</code> class table name. */
    public static final String TBL_NAME = "Municipio";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "municipioCodigo,departamentoDepartamentoCodigo,municipioDescripcion,municipioCodigoLegal,municipioEsValidoEPS,municipioAplicaIVA";

    public static final String DSICMUNICIPIO = "IC_Municipio";
    public static final String DSDSMUNICIPIOPIU = "DS_Municipio_PIU";
    

    // Attribute (municipioCodigo)
    /** <code>municipioCodigo</code> attribute id. */
    public static final String ATTR_ID_MUNICIPIOCODIGO = "Clas_1431890034688728Atr_1_Alias";
    /** <code>municipioCodigo</code> attribute name. */
    public static final String ATTR_NAME_MUNICIPIOCODIGO = "municipioCodigo";
    /** <code>municipioCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_MUNICIPIOCODIGO = "Código";

    /** <code>municipioCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_MUNICIPIOCODIGO = "";
    /** Agents allowed to view the attribute municipioCodigo **/
    public static final String MUNICIPIOCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (municipioDescripcion)
    /** <code>municipioDescripcion</code> attribute id. */
    public static final String ATTR_ID_MUNICIPIODESCRIPCION = "Clas_1431890034688728Atr_2_Alias";
    /** <code>municipioDescripcion</code> attribute name. */
    public static final String ATTR_NAME_MUNICIPIODESCRIPCION = "municipioDescripcion";
    /** <code>municipioDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_MUNICIPIODESCRIPCION = "Descripción";

    /** <code>municipioDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_MUNICIPIODESCRIPCION = "";
    /** Agents allowed to view the attribute municipioDescripcion **/
    public static final String MUNICIPIODESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (municipioCodigoLegal)
    /** <code>municipioCodigoLegal</code> attribute id. */
    public static final String ATTR_ID_MUNICIPIOCODIGOLEGAL = "Clas_1431890034688728Atr_3_Alias";
    /** <code>municipioCodigoLegal</code> attribute name. */
    public static final String ATTR_NAME_MUNICIPIOCODIGOLEGAL = "municipioCodigoLegal";
    /** <code>municipioCodigoLegal</code> attribute alias. */
    public static final String ATTR_ALIAS_MUNICIPIOCODIGOLEGAL = "Código legal";

    /** <code>municipioCodigoLegal</code> attribute facet sequence. */
    public static final String PATH_FACETS_MUNICIPIOCODIGOLEGAL = "";
    /** Agents allowed to view the attribute municipioCodigoLegal **/
    public static final String MUNICIPIOCODIGOLEGAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (municipioEsValidoEPS)
    /** <code>municipioEsValidoEPS</code> attribute id. */
    public static final String ATTR_ID_MUNICIPIOESVALIDOEPS = "Clas_1431890034688728Atr_4_Alias";
    /** <code>municipioEsValidoEPS</code> attribute name. */
    public static final String ATTR_NAME_MUNICIPIOESVALIDOEPS = "municipioEsValidoEPS";
    /** <code>municipioEsValidoEPS</code> attribute alias. */
    public static final String ATTR_ALIAS_MUNICIPIOESVALIDOEPS = "Válido EPS";

    /** <code>municipioEsValidoEPS</code> attribute facet sequence. */
    public static final String PATH_FACETS_MUNICIPIOESVALIDOEPS = "";
    /** Agents allowed to view the attribute municipioEsValidoEPS **/
    public static final String MUNICIPIOESVALIDOEPS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (municipioAplicaIVA)
    /** <code>municipioAplicaIVA</code> attribute id. */
    public static final String ATTR_ID_MUNICIPIOAPLICAIVA = "Clas_1431890034688728Atr_5_Alias";
    /** <code>municipioAplicaIVA</code> attribute name. */
    public static final String ATTR_NAME_MUNICIPIOAPLICAIVA = "municipioAplicaIVA";
    /** <code>municipioAplicaIVA</code> attribute alias. */
    public static final String ATTR_ALIAS_MUNICIPIOAPLICAIVA = "Aplica IVA";

    /** <code>municipioAplicaIVA</code> attribute facet sequence. */
    public static final String PATH_FACETS_MUNICIPIOAPLICAIVA = "";
    /** Agents allowed to view the attribute municipioAplicaIVA **/
    public static final String MUNICIPIOAPLICAIVA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_MUNICIPIOCODIGO = "Codigo";    
    /** <code>municipioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIOCODIGO = "municipioCodigo";
    // Field (Departamento_Codigo)
    /** <code>Departamento_Codigo</code> field name. */
    public static final String FLD_DEPARTAMENTODEPARTAMENTOCODIGO = "Departamento_Codigo";    
    /** <code>Departamento.departamentoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DEPARTAMENTO_DEPARTAMENTOCODIGO = "departamentoDepartamentoCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_MUNICIPIODESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_MUNICIPIODESCRIPCIONLENGTH = 150;
    /** <code>municipioDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIODESCRIPCION = "municipioDescripcion";
    // Field (CodigoLegal)
    /** <code>CodigoLegal</code> field name. */
    public static final String FLD_MUNICIPIOCODIGOLEGAL = "CodigoLegal";    
    /** <code>CodigoLegal</code> field length. */
    public static final int FLD_MUNICIPIOCODIGOLEGALLENGTH = 10;
    /** <code>municipioCodigoLegal</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIOCODIGOLEGAL = "municipioCodigoLegal";
    // Field (EsValidoEPS)
    /** <code>EsValidoEPS</code> field name. */
    public static final String FLD_MUNICIPIOESVALIDOEPS = "EsValidoEPS";    
    /** <code>municipioEsValidoEPS</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIOESVALIDOEPS = "municipioEsValidoEPS";
    // Field (AplicaIVA)
    /** <code>AplicaIVA</code> field name. */
    public static final String FLD_MUNICIPIOAPLICAIVA = "AplicaIVA";    
    /** <code>municipioAplicaIVA</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIOAPLICAIVA = "municipioAplicaIVA";

    // Component role (Departamento)
    /** <code>Departamento</code> role id. */
    public static final String ROLE_ID_DEPARTAMENTO = "Agr_1434385776640656_Alias";
    /** <code>Departamento</code> role name. */
    public static final String ROLE_NAME_DEPARTAMENTO = "departamento";
    /** <code>Departamento</code> role alias. */
    public static final String ROLE_ALIAS_DEPARTAMENTO = "Departamento";

    /** <code>Departamento</code> inverse role name. */
    public static final String ROLE_INVNAME_DEPARTAMENTO = DepartamentoConstants.ROLE_NAME_MUNICIPIOS;
    /** <code>Departamento</code> role facet sequence. */
    public static final String PATH_FACETS_DEPARTAMENTO = "";
    /** <code>Departamento</code> role target class. */
    public static final String ROLE_TARGET_DEPARTAMENTO = DepartamentoConstants.CLASS_NAME;

    /** Agents allowed to navigate through Departamento **/
    public static final String DEPARTAMENTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (Personas)
    /** <code>Personas</code> role id. */
    public static final String ROLE_ID_PERSONAS = "Agr_1432214568960361_Alias";
    /** <code>Personas</code> role name. */
    public static final String ROLE_NAME_PERSONAS = "personas";
    /** <code>MunicipioNacimiento</code> role alias. */
    public static final String ROLE_ALIAS_PERSONAS = "Personas";


    /** <code>Personas</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONAS = PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO;
    /** <code>Personas</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONAS = "";
    /** <code>Personas</code> role target class. */
    public static final String ROLE_TARGET_PERSONAS = PersonaConstants.CLASS_NAME;
    /** Agents allowed to navigate through Personas **/
    public static final String PERSONAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (PersonasC)
    /** <code>PersonasC</code> role id. */
    public static final String ROLE_ID_PERSONASC = "Agr_1473350598656411_Alias";
    /** <code>PersonasC</code> role name. */
    public static final String ROLE_NAME_PERSONASC = "personasC";
    /** <code>MunicipioCNac</code> role alias. */
    public static final String ROLE_ALIAS_PERSONASC = "Personas";


    /** <code>PersonasC</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONASC = PersonaCConstants.ROLE_NAME_MUNICIPIOCNAC;
    /** <code>PersonasC</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONASC = "";
    /** <code>PersonasC</code> role target class. */
    public static final String ROLE_TARGET_PERSONASC = PersonaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through PersonasC **/
    public static final String PERSONASC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (DireccionesC)
    /** <code>DireccionesC</code> role id. */
    public static final String ROLE_ID_DIRECCIONESC = "Agr_1473350074368283_Alias";
    /** <code>DireccionesC</code> role name. */
    public static final String ROLE_NAME_DIRECCIONESC = "direccionesC";
    /** <code>MunicipioC</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONESC = "Direcciones";


    /** <code>DireccionesC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONESC = DireccionCConstants.ROLE_NAME_MUNICIPIOC;
    /** <code>DireccionesC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONESC = "";
    /** <code>DireccionesC</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONESC = DireccionCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DireccionesC **/
    public static final String DIRECCIONESC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Direcciones)
    /** <code>Direcciones</code> role id. */
    public static final String ROLE_ID_DIRECCIONES = "Agr_1432206180352927_Alias";
    /** <code>Direcciones</code> role name. */
    public static final String ROLE_NAME_DIRECCIONES = "direcciones";
    /** <code>Municipio</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONES = "Direcciones";


    /** <code>Direcciones</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONES = DireccionConstants.ROLE_NAME_MUNICIPIO;
    /** <code>Direcciones</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONES = "";
    /** <code>Direcciones</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONES = DireccionConstants.CLASS_NAME;
    /** Agents allowed to navigate through Direcciones **/
    public static final String DIRECCIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Contratantes)
    /** <code>Contratantes</code> role id. */
    public static final String ROLE_ID_CONTRATANTES = "Agr_1432819335168081_Alias";
    /** <code>Contratantes</code> role name. */
    public static final String ROLE_NAME_CONTRATANTES = "contratantes";
    /** <code>MunicipioNac</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATANTES = "Contratantes";


    /** <code>Contratantes</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATANTES = ContratanteConstants.ROLE_NAME_MUNICIPIONAC;
    /** <code>Contratantes</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATANTES = "";
    /** <code>Contratantes</code> role target class. */
    public static final String ROLE_TARGET_CONTRATANTES = ContratanteConstants.CLASS_NAME;
    /** Agents allowed to navigate through Contratantes **/
    public static final String CONTRATANTES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ContratanteRes)
    /** <code>ContratanteRes</code> role id. */
    public static final String ROLE_ID_CONTRATANTERES = "Agr_1447153238016560_Alias";
    /** <code>ContratanteRes</code> role name. */
    public static final String ROLE_NAME_CONTRATANTERES = "contratanteRes";
    /** <code>MunicipioRes</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATANTERES = "Contratantes";


    /** <code>ContratanteRes</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATANTERES = ContratanteConstants.ROLE_NAME_MUNICIPIORES;
    /** <code>ContratanteRes</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATANTERES = "";
    /** <code>ContratanteRes</code> role target class. */
    public static final String ROLE_TARGET_CONTRATANTERES = ContratanteConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratanteRes **/
    public static final String CONTRATANTERES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ContratosC)
    /** <code>ContratosC</code> role id. */
    public static final String ROLE_ID_CONTRATOSC = "Agr_1473350205440952_Alias";
    /** <code>ContratosC</code> role name. */
    public static final String ROLE_NAME_CONTRATOSC = "contratosC";
    /** <code>MunicipioC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOSC = "Contratos";


    /** <code>ContratosC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOSC = ContratoCConstants.ROLE_NAME_MUNICIPIOC;
    /** <code>ContratosC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOSC = "";
    /** <code>ContratosC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOSC = ContratoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through ContratosC **/
    public static final String CONTRATOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (DirSucursalC)
    /** <code>DirSucursalC</code> role id. */
    public static final String ROLE_ID_DIRSUCURSALC = "Agr_1473350860800574_Alias";
    /** <code>DirSucursalC</code> role name. */
    public static final String ROLE_NAME_DIRSUCURSALC = "dirSucursalC";
    /** <code>MunicipioC</code> role alias. */
    public static final String ROLE_ALIAS_DIRSUCURSALC = "DirSucursalC";


    /** <code>DirSucursalC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRSUCURSALC = DirSucursalCConstants.ROLE_NAME_MUNICIPIOC;
    /** <code>DirSucursalC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRSUCURSALC = "";
    /** <code>DirSucursalC</code> role target class. */
    public static final String ROLE_TARGET_DIRSUCURSALC = DirSucursalCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DirSucursalC **/
    public static final String DIRSUCURSALC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (FamiliaC)
    /** <code>FamiliaC</code> role id. */
    public static final String ROLE_ID_FAMILIAC = "Agr_1473350729728168_Alias";
    /** <code>FamiliaC</code> role name. */
    public static final String ROLE_NAME_FAMILIAC = "familiaC";
    /** <code>MunicipioC</code> role alias. */
    public static final String ROLE_ALIAS_FAMILIAC = "FamiliaC";


    /** <code>FamiliaC</code> inverse role name. */
    public static final String ROLE_INVNAME_FAMILIAC = FamiliaCConstants.ROLE_NAME_MUNICIPIOC;
    /** <code>FamiliaC</code> role facet sequence. */
    public static final String PATH_FACETS_FAMILIAC = "";
    /** <code>FamiliaC</code> role target class. */
    public static final String ROLE_TARGET_FAMILIAC = FamiliaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through FamiliaC **/
    public static final String FAMILIAC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Titulares)
    /** <code>Titulares</code> role id. */
    public static final String ROLE_ID_TITULARES = "Agr_1433869615104900_Alias";
    /** <code>Titulares</code> role name. */
    public static final String ROLE_NAME_TITULARES = "titulares";
    /** <code>MunicipioNac</code> role alias. */
    public static final String ROLE_ALIAS_TITULARES = "Titulares";


    /** <code>Titulares</code> inverse role name. */
    public static final String ROLE_INVNAME_TITULARES = TitularConstants.ROLE_NAME_MUNICIPIONAC;
    /** <code>Titulares</code> role facet sequence. */
    public static final String PATH_FACETS_TITULARES = "";
    /** <code>Titulares</code> role target class. */
    public static final String ROLE_TARGET_TITULARES = TitularConstants.CLASS_NAME;
    /** Agents allowed to navigate through Titulares **/
    public static final String TITULARES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (InstitucionMatNeo)
    /** <code>InstitucionMatNeo</code> role id. */
    public static final String ROLE_ID_INSTITUCIONMATNEO = "Agr_1463994023936454_Alias";
    /** <code>InstitucionMatNeo</code> role name. */
    public static final String ROLE_NAME_INSTITUCIONMATNEO = "institucionMatNeo";
    /** <code>Municipio</code> role alias. */
    public static final String ROLE_ALIAS_INSTITUCIONMATNEO = "Instituciones";


    /** <code>InstitucionMatNeo</code> inverse role name. */
    public static final String ROLE_INVNAME_INSTITUCIONMATNEO = InstitucionMatNeoConstants.ROLE_NAME_MUNICIPIO;
    /** <code>InstitucionMatNeo</code> role facet sequence. */
    public static final String PATH_FACETS_INSTITUCIONMATNEO = "";
    /** <code>InstitucionMatNeo</code> role target class. */
    public static final String ROLE_TARGET_INSTITUCIONMATNEO = InstitucionMatNeoConstants.CLASS_NAME;
    /** Agents allowed to navigate through InstitucionMatNeo **/
    public static final String INSTITUCIONMATNEO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (NovedadCTNac)
    /** <code>NovedadCTNac</code> role id. */
    public static final String ROLE_ID_NOVEDADCTNAC = "Agr_1583231139840156_Alias";
    /** <code>NovedadCTNac</code> role name. */
    public static final String ROLE_NAME_NOVEDADCTNAC = "novedadCTNac";
    /** <code>MunicipioNac</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADCTNAC = "NovedadCTNac";


    /** <code>NovedadCTNac</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADCTNAC = NovedadCTConstants.ROLE_NAME_MUNICIPIONAC;
    /** <code>NovedadCTNac</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADCTNAC = "";
    /** <code>NovedadCTNac</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADCTNAC = NovedadCTConstants.CLASS_NAME;
    /** Agents allowed to navigate through NovedadCTNac **/
    public static final String NOVEDADCTNAC_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (NovedadCTRes)
    /** <code>NovedadCTRes</code> role id. */
    public static final String ROLE_ID_NOVEDADCTRES = "Agr_1583231270912801_Alias";
    /** <code>NovedadCTRes</code> role name. */
    public static final String ROLE_NAME_NOVEDADCTRES = "novedadCTRes";
    /** <code>MunicipioRes</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADCTRES = "NovedadCTRes";


    /** <code>NovedadCTRes</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADCTRES = NovedadCTConstants.ROLE_NAME_MUNICIPIORES;
    /** <code>NovedadCTRes</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADCTRES = "";
    /** <code>NovedadCTRes</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADCTRES = NovedadCTConstants.CLASS_NAME;
    /** Agents allowed to navigate through NovedadCTRes **/
    public static final String NOVEDADCTRES_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (NovedadesMD)
    /** <code>NovedadesMD</code> role id. */
    public static final String ROLE_ID_NOVEDADESMD = "Agr_1582555070464056_Alias";
    /** <code>NovedadesMD</code> role name. */
    public static final String ROLE_NAME_NOVEDADESMD = "novedadesMD";
    /** <code>Municipio</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADESMD = "Direcciones MD";


    /** <code>NovedadesMD</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADESMD = NovedadMDConstants.ROLE_NAME_MUNICIPIO;
    /** <code>NovedadesMD</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADESMD = "";
    /** <code>NovedadesMD</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADESMD = NovedadMDConstants.CLASS_NAME;
    /** Agents allowed to navigate through NovedadesMD **/
    public static final String NOVEDADESMD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431890034688728Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear municipio";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>municipiocrearpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_MUNICIPIOCREARPAGRDEPARTAMENTO = "p_agrDepartamento";
    /** <code>municipiocrearpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_CREAR_MUNICIPIOCREARPAGRDEPARTAMENTO = "Clas_1431890034688728Ser_1Arg_12_Alias";
    /** <code>municipiocrearpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_MUNICIPIOCREARPAGRDEPARTAMENTO = "Departamento";
    /** <code>municipiocrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_MUNICIPIOCREARPATRCODIGO = "p_atrCodigo";
    /** <code>municipiocrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_MUNICIPIOCREARPATRCODIGO = "Clas_1431890034688728Ser_1Arg_1_Alias";
    /** <code>municipiocrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_MUNICIPIOCREARPATRCODIGO = "Código";
    /** <code>municipiocrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_MUNICIPIOCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>municipiocrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_MUNICIPIOCREARPATRDESCRIPCION = "Clas_1431890034688728Ser_1Arg_2_Alias";
    /** <code>municipiocrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_MUNICIPIOCREARPATRDESCRIPCION = "Descripción";
    /** <code>municipiocrearpatrCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_MUNICIPIOCREARPATRCODIGOLEGAL = "p_atrCodigoLegal";
    /** <code>municipiocrearpatrCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_MUNICIPIOCREARPATRCODIGOLEGAL = "Clas_1431890034688728Ser_1Arg_3_Alias";
    /** <code>municipiocrearpatrCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_MUNICIPIOCREARPATRCODIGOLEGAL = "Código legal";
    /** <code>municipiocrearpatrEsValidoEPS</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_MUNICIPIOCREARPATRESVALIDOEPS = "p_atrEsValidoEPS";
    /** <code>municipiocrearpatrEsValidoEPS</code> inbound argument id. */
    public static final String ARG_ID_CREAR_MUNICIPIOCREARPATRESVALIDOEPS = "Clas_1431890034688728Ser_1Arg_4_Alias";
    /** <code>municipiocrearpatrEsValidoEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_MUNICIPIOCREARPATRESVALIDOEPS = "Válido EPS";
    /** <code>municipiocrearpatrAplicaIVA</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_MUNICIPIOCREARPATRAPLICAIVA = "p_atrAplicaIVA";
    /** <code>municipiocrearpatrAplicaIVA</code> inbound argument id. */
    public static final String ARG_ID_CREAR_MUNICIPIOCREARPATRAPLICAIVA = "Clas_1431890034688728Ser_1Arg_5_Alias";
    /** <code>municipiocrearpatrAplicaIVA</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_MUNICIPIOCREARPATRAPLICAIVA = "Aplica IVA";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431890034688728Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar municipio";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1431890034688728Pre_1_MsgError";
    // Inbound arguments
    /** <code>municipioeliminarpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_MUNICIPIOELIMINARPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioeliminarpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_MUNICIPIOELIMINARPTHISMUNICIPIO = "Clas_1431890034688728Ser_2Arg_1_Alias";
    /** <code>municipioeliminarpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_MUNICIPIOELIMINARPTHISMUNICIPIO = "Municipio";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431890034688728Ser_3_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar municipio";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>municipiomodificarpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_MUNICIPIOMODIFICARPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipiomodificarpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_MUNICIPIOMODIFICARPTHISMUNICIPIO = "Clas_1431890034688728Ser_3Arg_1_Alias";
    /** <code>municipiomodificarpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_MUNICIPIOMODIFICARPTHISMUNICIPIO = "Municipio";
    /** <code>municipiomodificarpAplicaIVA</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_MUNICIPIOMODIFICARPAPLICAIVA = "p_AplicaIVA";
    /** <code>municipiomodificarpAplicaIVA</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_MUNICIPIOMODIFICARPAPLICAIVA = "Clas_1431890034688728Ser_3Arg_2_Alias";
    /** <code>municipiomodificarpAplicaIVA</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_MUNICIPIOMODIFICARPAPLICAIVA = "Aplica IVA";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1431890034688728Ser_4_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipiosincronizarpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_MUNICIPIOSINCRONIZARPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipiosincronizarpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_MUNICIPIOSINCRONIZARPTHISMUNICIPIO = "Clas_1431890034688728Ser_4Arg_1_Alias";
    /** <code>municipiosincronizarpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_MUNICIPIOSINCRONIZARPTHISMUNICIPIO = "Municipio";
    /** <code>municipiosincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_MUNICIPIOSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>municipiosincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_MUNICIPIOSINCRONIZARPDESCRIPCION = "Clas_1431890034688728Ser_4Arg_2_Alias";
    /** <code>municipiosincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_MUNICIPIOSINCRONIZARPDESCRIPCION = "Descripción";
    /** <code>municipiosincronizarpCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_MUNICIPIOSINCRONIZARPCODIGOLEGAL = "p_CodigoLegal";
    /** <code>municipiosincronizarpCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_MUNICIPIOSINCRONIZARPCODIGOLEGAL = "Clas_1431890034688728Ser_4Arg_3_Alias";
    /** <code>municipiosincronizarpCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_MUNICIPIOSINCRONIZARPCODIGOLEGAL = "Código legal";
    /** <code>municipiosincronizarpEsValidoEPS</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_MUNICIPIOSINCRONIZARPESVALIDOEPS = "p_EsValidoEPS";
    /** <code>municipiosincronizarpEsValidoEPS</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_MUNICIPIOSINCRONIZARPESVALIDOEPS = "Clas_1431890034688728Ser_4Arg_4_Alias";
    /** <code>municipiosincronizarpEsValidoEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_MUNICIPIOSINCRONIZARPESVALIDOEPS = "Válido EPS";
    // Service (InsMunicipioDireccion)
    /** <code>InsMunicipioDireccion</code> service id. */
    public static final String SERV_ID_INSMUNICIPIODIRECCION = "Clas_1431890034688728Ser_5_Alias";
    /** <code>InsMunicipioDireccion</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIODIRECCION = "InsMunicipioDireccion";
    /** <code>InsMunicipioDireccion</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIODIRECCION = "InsMunicipioDireccion";
    /** Agents allowed to execute the service InsMunicipioDireccion **/
    public static final String INSMUNICIPIODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioDireccionpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIODIRECCION_MUNICIPIOINSMUNICIPIODIRECCIONPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioDireccionpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIODIRECCION_MUNICIPIOINSMUNICIPIODIRECCIONPTHISMUNICIPIO = "Clas_1431890034688728Ser_5Arg_1_Alias";
    /** <code>municipioInsMunicipioDireccionpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIODIRECCION_MUNICIPIOINSMUNICIPIODIRECCIONPTHISMUNICIPIO = "Municipio";
    /** <code>municipioInsMunicipioDireccionpevcDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIODIRECCION_MUNICIPIOINSMUNICIPIODIRECCIONPEVCDIRECCION = "p_evcDireccion";
    /** <code>municipioInsMunicipioDireccionpevcDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIODIRECCION_MUNICIPIOINSMUNICIPIODIRECCIONPEVCDIRECCION = "Clas_1431890034688728Ser_5Arg_2_Alias";
    /** <code>municipioInsMunicipioDireccionpevcDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIODIRECCION_MUNICIPIOINSMUNICIPIODIRECCIONPEVCDIRECCION = "Direcciones";
    // Service (DelMunicipioDireccion)
    /** <code>DelMunicipioDireccion</code> service id. */
    public static final String SERV_ID_DELMUNICIPIODIRECCION = "Clas_1431890034688728Ser_6_Alias";
    /** <code>DelMunicipioDireccion</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIODIRECCION = "DelMunicipioDireccion";
    /** <code>DelMunicipioDireccion</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIODIRECCION = "DelMunicipioDireccion";
    /** Agents allowed to execute the service DelMunicipioDireccion **/
    public static final String DELMUNICIPIODIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioDireccionpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIODIRECCION_MUNICIPIODELMUNICIPIODIRECCIONPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioDireccionpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIODIRECCION_MUNICIPIODELMUNICIPIODIRECCIONPTHISMUNICIPIO = "Clas_1431890034688728Ser_6Arg_1_Alias";
    /** <code>municipioDelMunicipioDireccionpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIODIRECCION_MUNICIPIODELMUNICIPIODIRECCIONPTHISMUNICIPIO = "Municipio";
    /** <code>municipioDelMunicipioDireccionpevcDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIODIRECCION_MUNICIPIODELMUNICIPIODIRECCIONPEVCDIRECCION = "p_evcDireccion";
    /** <code>municipioDelMunicipioDireccionpevcDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIODIRECCION_MUNICIPIODELMUNICIPIODIRECCIONPEVCDIRECCION = "Clas_1431890034688728Ser_6Arg_2_Alias";
    /** <code>municipioDelMunicipioDireccionpevcDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIODIRECCION_MUNICIPIODELMUNICIPIODIRECCIONPEVCDIRECCION = "Direcciones";
    // Service (InsMunicipioNacimientoPersona)
    /** <code>InsMunicipioNacimientoPersona</code> service id. */
    public static final String SERV_ID_INSMUNICIPIONACIMIENTOPERSONA = "Clas_1431890034688728Ser_7_Alias";
    /** <code>InsMunicipioNacimientoPersona</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIONACIMIENTOPERSONA = "InsMunicipioNacimientoPersona";
    /** <code>InsMunicipioNacimientoPersona</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIONACIMIENTOPERSONA = "InsMunicipioNacimientoPersona";
    /** Agents allowed to execute the service InsMunicipioNacimientoPersona **/
    public static final String INSMUNICIPIONACIMIENTOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioNacimientoPersonapthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIONACIMIENTOPERSONA_MUNICIPIOINSMUNICIPIONACIMIENTOPERSONAPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioNacimientoPersonapthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIONACIMIENTOPERSONA_MUNICIPIOINSMUNICIPIONACIMIENTOPERSONAPTHISMUNICIPIO = "Clas_1431890034688728Ser_7Arg_1_Alias";
    /** <code>municipioInsMunicipioNacimientoPersonapthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIONACIMIENTOPERSONA_MUNICIPIOINSMUNICIPIONACIMIENTOPERSONAPTHISMUNICIPIO = "Municipio nacimiento";
    /** <code>municipioInsMunicipioNacimientoPersonapevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIONACIMIENTOPERSONA_MUNICIPIOINSMUNICIPIONACIMIENTOPERSONAPEVCPERSONA = "p_evcPersona";
    /** <code>municipioInsMunicipioNacimientoPersonapevcPersona</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIONACIMIENTOPERSONA_MUNICIPIOINSMUNICIPIONACIMIENTOPERSONAPEVCPERSONA = "Clas_1431890034688728Ser_7Arg_2_Alias";
    /** <code>municipioInsMunicipioNacimientoPersonapevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIONACIMIENTOPERSONA_MUNICIPIOINSMUNICIPIONACIMIENTOPERSONAPEVCPERSONA = "Personas";
    // Service (DelMunicipioNacimientoPersona)
    /** <code>DelMunicipioNacimientoPersona</code> service id. */
    public static final String SERV_ID_DELMUNICIPIONACIMIENTOPERSONA = "Clas_1431890034688728Ser_8_Alias";
    /** <code>DelMunicipioNacimientoPersona</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIONACIMIENTOPERSONA = "DelMunicipioNacimientoPersona";
    /** <code>DelMunicipioNacimientoPersona</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIONACIMIENTOPERSONA = "DelMunicipioNacimientoPersona";
    /** Agents allowed to execute the service DelMunicipioNacimientoPersona **/
    public static final String DELMUNICIPIONACIMIENTOPERSONA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioNacimientoPersonapthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIONACIMIENTOPERSONA_MUNICIPIODELMUNICIPIONACIMIENTOPERSONAPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioNacimientoPersonapthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIONACIMIENTOPERSONA_MUNICIPIODELMUNICIPIONACIMIENTOPERSONAPTHISMUNICIPIO = "Clas_1431890034688728Ser_8Arg_1_Alias";
    /** <code>municipioDelMunicipioNacimientoPersonapthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIONACIMIENTOPERSONA_MUNICIPIODELMUNICIPIONACIMIENTOPERSONAPTHISMUNICIPIO = "Municipio nacimiento";
    /** <code>municipioDelMunicipioNacimientoPersonapevcPersona</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIONACIMIENTOPERSONA_MUNICIPIODELMUNICIPIONACIMIENTOPERSONAPEVCPERSONA = "p_evcPersona";
    /** <code>municipioDelMunicipioNacimientoPersonapevcPersona</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIONACIMIENTOPERSONA_MUNICIPIODELMUNICIPIONACIMIENTOPERSONAPEVCPERSONA = "Clas_1431890034688728Ser_8Arg_2_Alias";
    /** <code>municipioDelMunicipioNacimientoPersonapevcPersona</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIONACIMIENTOPERSONA_MUNICIPIODELMUNICIPIONACIMIENTOPERSONAPEVCPERSONA = "Personas";
    // Service (InsMunicipioNacContratante)
    /** <code>InsMunicipioNacContratante</code> service id. */
    public static final String SERV_ID_INSMUNICIPIONACCONTRATANTE = "Clas_1431890034688728Ser_9_Alias";
    /** <code>InsMunicipioNacContratante</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIONACCONTRATANTE = "InsMunicipioNacContratante";
    /** <code>InsMunicipioNacContratante</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIONACCONTRATANTE = "InsMunicipioNacContratante";
    /** Agents allowed to execute the service InsMunicipioNacContratante **/
    public static final String INSMUNICIPIONACCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioNacContratantepthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIONACCONTRATANTE_MUNICIPIOINSMUNICIPIONACCONTRATANTEPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioNacContratantepthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIONACCONTRATANTE_MUNICIPIOINSMUNICIPIONACCONTRATANTEPTHISMUNICIPIO = "Clas_1431890034688728Ser_9Arg_1_Alias";
    /** <code>municipioInsMunicipioNacContratantepthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIONACCONTRATANTE_MUNICIPIOINSMUNICIPIONACCONTRATANTEPTHISMUNICIPIO = "Municipio nacimiento";
    /** <code>municipioInsMunicipioNacContratantepevcContratante</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIONACCONTRATANTE_MUNICIPIOINSMUNICIPIONACCONTRATANTEPEVCCONTRATANTE = "p_evcContratante";
    /** <code>municipioInsMunicipioNacContratantepevcContratante</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIONACCONTRATANTE_MUNICIPIOINSMUNICIPIONACCONTRATANTEPEVCCONTRATANTE = "Clas_1431890034688728Ser_9Arg_2_Alias";
    /** <code>municipioInsMunicipioNacContratantepevcContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIONACCONTRATANTE_MUNICIPIOINSMUNICIPIONACCONTRATANTEPEVCCONTRATANTE = "Contratantes";
    // Service (DelMunicipioNacContratante)
    /** <code>DelMunicipioNacContratante</code> service id. */
    public static final String SERV_ID_DELMUNICIPIONACCONTRATANTE = "Clas_1431890034688728Ser_10_Alias";
    /** <code>DelMunicipioNacContratante</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIONACCONTRATANTE = "DelMunicipioNacContratante";
    /** <code>DelMunicipioNacContratante</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIONACCONTRATANTE = "DelMunicipioNacContratante";
    /** Agents allowed to execute the service DelMunicipioNacContratante **/
    public static final String DELMUNICIPIONACCONTRATANTE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioNacContratantepthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIONACCONTRATANTE_MUNICIPIODELMUNICIPIONACCONTRATANTEPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioNacContratantepthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIONACCONTRATANTE_MUNICIPIODELMUNICIPIONACCONTRATANTEPTHISMUNICIPIO = "Clas_1431890034688728Ser_10Arg_1_Alias";
    /** <code>municipioDelMunicipioNacContratantepthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIONACCONTRATANTE_MUNICIPIODELMUNICIPIONACCONTRATANTEPTHISMUNICIPIO = "Municipio nacimiento";
    /** <code>municipioDelMunicipioNacContratantepevcContratante</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIONACCONTRATANTE_MUNICIPIODELMUNICIPIONACCONTRATANTEPEVCCONTRATANTE = "p_evcContratante";
    /** <code>municipioDelMunicipioNacContratantepevcContratante</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIONACCONTRATANTE_MUNICIPIODELMUNICIPIONACCONTRATANTEPEVCCONTRATANTE = "Clas_1431890034688728Ser_10Arg_2_Alias";
    /** <code>municipioDelMunicipioNacContratantepevcContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIONACCONTRATANTE_MUNICIPIODELMUNICIPIONACCONTRATANTEPEVCCONTRATANTE = "Contratantes";
    // Service (InsMunicipioNacTitular)
    /** <code>InsMunicipioNacTitular</code> service id. */
    public static final String SERV_ID_INSMUNICIPIONACTITULAR = "Clas_1431890034688728Ser_11_Alias";
    /** <code>InsMunicipioNacTitular</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIONACTITULAR = "InsMunicipioNacTitular";
    /** <code>InsMunicipioNacTitular</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIONACTITULAR = "InsMunicipioNacTitular";
    /** Agents allowed to execute the service InsMunicipioNacTitular **/
    public static final String INSMUNICIPIONACTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioNacTitularpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIONACTITULAR_MUNICIPIOINSMUNICIPIONACTITULARPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioNacTitularpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIONACTITULAR_MUNICIPIOINSMUNICIPIONACTITULARPTHISMUNICIPIO = "Clas_1431890034688728Ser_11Arg_1_Alias";
    /** <code>municipioInsMunicipioNacTitularpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIONACTITULAR_MUNICIPIOINSMUNICIPIONACTITULARPTHISMUNICIPIO = "Municipio nacimiento";
    /** <code>municipioInsMunicipioNacTitularpevcTitular</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIONACTITULAR_MUNICIPIOINSMUNICIPIONACTITULARPEVCTITULAR = "p_evcTitular";
    /** <code>municipioInsMunicipioNacTitularpevcTitular</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIONACTITULAR_MUNICIPIOINSMUNICIPIONACTITULARPEVCTITULAR = "Clas_1431890034688728Ser_11Arg_2_Alias";
    /** <code>municipioInsMunicipioNacTitularpevcTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIONACTITULAR_MUNICIPIOINSMUNICIPIONACTITULARPEVCTITULAR = "Titulares";
    // Service (DelMunicipioNacTitular)
    /** <code>DelMunicipioNacTitular</code> service id. */
    public static final String SERV_ID_DELMUNICIPIONACTITULAR = "Clas_1431890034688728Ser_12_Alias";
    /** <code>DelMunicipioNacTitular</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIONACTITULAR = "DelMunicipioNacTitular";
    /** <code>DelMunicipioNacTitular</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIONACTITULAR = "DelMunicipioNacTitular";
    /** Agents allowed to execute the service DelMunicipioNacTitular **/
    public static final String DELMUNICIPIONACTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioNacTitularpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIONACTITULAR_MUNICIPIODELMUNICIPIONACTITULARPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioNacTitularpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIONACTITULAR_MUNICIPIODELMUNICIPIONACTITULARPTHISMUNICIPIO = "Clas_1431890034688728Ser_12Arg_1_Alias";
    /** <code>municipioDelMunicipioNacTitularpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIONACTITULAR_MUNICIPIODELMUNICIPIONACTITULARPTHISMUNICIPIO = "Municipio nacimiento";
    /** <code>municipioDelMunicipioNacTitularpevcTitular</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIONACTITULAR_MUNICIPIODELMUNICIPIONACTITULARPEVCTITULAR = "p_evcTitular";
    /** <code>municipioDelMunicipioNacTitularpevcTitular</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIONACTITULAR_MUNICIPIODELMUNICIPIONACTITULARPEVCTITULAR = "Clas_1431890034688728Ser_12Arg_2_Alias";
    /** <code>municipioDelMunicipioNacTitularpevcTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIONACTITULAR_MUNICIPIODELMUNICIPIONACTITULARPEVCTITULAR = "Titulares";
    // Service (InsMunicipioDepartamento)
    /** <code>InsMunicipioDepartamento</code> service id. */
    public static final String SERV_ID_INSMUNICIPIODEPARTAMENTO = "Clas_1431890034688728Ser_13_Alias";
    /** <code>InsMunicipioDepartamento</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIODEPARTAMENTO = "InsMunicipioDepartamento";
    /** <code>InsMunicipioDepartamento</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIODEPARTAMENTO = "InsMunicipioDepartamento";
    /** Agents allowed to execute the service InsMunicipioDepartamento **/
    public static final String INSMUNICIPIODEPARTAMENTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioDepartamentopthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIODEPARTAMENTO_MUNICIPIOINSMUNICIPIODEPARTAMENTOPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioDepartamentopthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIODEPARTAMENTO_MUNICIPIOINSMUNICIPIODEPARTAMENTOPTHISMUNICIPIO = "Clas_1431890034688728Ser_13Arg_1_Alias";
    /** <code>municipioInsMunicipioDepartamentopthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIODEPARTAMENTO_MUNICIPIOINSMUNICIPIODEPARTAMENTOPTHISMUNICIPIO = "Municipios";
    /** <code>municipioInsMunicipioDepartamentopevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIODEPARTAMENTO_MUNICIPIOINSMUNICIPIODEPARTAMENTOPEVCDEPARTAMENTO = "p_evcDepartamento";
    /** <code>municipioInsMunicipioDepartamentopevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIODEPARTAMENTO_MUNICIPIOINSMUNICIPIODEPARTAMENTOPEVCDEPARTAMENTO = "Clas_1431890034688728Ser_13Arg_2_Alias";
    /** <code>municipioInsMunicipioDepartamentopevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIODEPARTAMENTO_MUNICIPIOINSMUNICIPIODEPARTAMENTOPEVCDEPARTAMENTO = "Departamento";
    // Service (DelMunicipioDepartamento)
    /** <code>DelMunicipioDepartamento</code> service id. */
    public static final String SERV_ID_DELMUNICIPIODEPARTAMENTO = "Clas_1431890034688728Ser_14_Alias";
    /** <code>DelMunicipioDepartamento</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIODEPARTAMENTO = "DelMunicipioDepartamento";
    /** <code>DelMunicipioDepartamento</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIODEPARTAMENTO = "DelMunicipioDepartamento";
    /** Agents allowed to execute the service DelMunicipioDepartamento **/
    public static final String DELMUNICIPIODEPARTAMENTO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioDepartamentopthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIODEPARTAMENTO_MUNICIPIODELMUNICIPIODEPARTAMENTOPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioDepartamentopthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIODEPARTAMENTO_MUNICIPIODELMUNICIPIODEPARTAMENTOPTHISMUNICIPIO = "Clas_1431890034688728Ser_14Arg_1_Alias";
    /** <code>municipioDelMunicipioDepartamentopthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIODEPARTAMENTO_MUNICIPIODELMUNICIPIODEPARTAMENTOPTHISMUNICIPIO = "Municipios";
    /** <code>municipioDelMunicipioDepartamentopevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIODEPARTAMENTO_MUNICIPIODELMUNICIPIODEPARTAMENTOPEVCDEPARTAMENTO = "p_evcDepartamento";
    /** <code>municipioDelMunicipioDepartamentopevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIODEPARTAMENTO_MUNICIPIODELMUNICIPIODEPARTAMENTOPEVCDEPARTAMENTO = "Clas_1431890034688728Ser_14Arg_2_Alias";
    /** <code>municipioDelMunicipioDepartamentopevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIODEPARTAMENTO_MUNICIPIODELMUNICIPIODEPARTAMENTOPEVCDEPARTAMENTO = "Departamento";
    // Service (InsMunicipioRes)
    /** <code>InsMunicipioRes</code> service id. */
    public static final String SERV_ID_INSMUNICIPIORES = "Clas_1431890034688728Ser_16_Alias";
    /** <code>InsMunicipioRes</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIORES = "InsMunicipioRes";
    /** <code>InsMunicipioRes</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIORES = "InsMunicipioRes";
    /** Agents allowed to execute the service InsMunicipioRes **/
    public static final String INSMUNICIPIORES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioRespthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIORES_MUNICIPIOINSMUNICIPIORESPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioRespthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIORES_MUNICIPIOINSMUNICIPIORESPTHISMUNICIPIO = "Clas_1431890034688728Ser_16Arg_1_Alias";
    /** <code>municipioInsMunicipioRespthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIORES_MUNICIPIOINSMUNICIPIORESPTHISMUNICIPIO = "Municipio de Residencia";
    /** <code>municipioInsMunicipioRespevcContratante</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIORES_MUNICIPIOINSMUNICIPIORESPEVCCONTRATANTE = "p_evcContratante";
    /** <code>municipioInsMunicipioRespevcContratante</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIORES_MUNICIPIOINSMUNICIPIORESPEVCCONTRATANTE = "Clas_1431890034688728Ser_16Arg_2_Alias";
    /** <code>municipioInsMunicipioRespevcContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIORES_MUNICIPIOINSMUNICIPIORESPEVCCONTRATANTE = "Contratantes";
    // Service (DelMunicipioRes)
    /** <code>DelMunicipioRes</code> service id. */
    public static final String SERV_ID_DELMUNICIPIORES = "Clas_1431890034688728Ser_17_Alias";
    /** <code>DelMunicipioRes</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIORES = "DelMunicipioRes";
    /** <code>DelMunicipioRes</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIORES = "DelMunicipioRes";
    /** Agents allowed to execute the service DelMunicipioRes **/
    public static final String DELMUNICIPIORES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioRespthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIORES_MUNICIPIODELMUNICIPIORESPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioRespthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIORES_MUNICIPIODELMUNICIPIORESPTHISMUNICIPIO = "Clas_1431890034688728Ser_17Arg_1_Alias";
    /** <code>municipioDelMunicipioRespthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIORES_MUNICIPIODELMUNICIPIORESPTHISMUNICIPIO = "Municipio de Residencia";
    /** <code>municipioDelMunicipioRespevcContratante</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIORES_MUNICIPIODELMUNICIPIORESPEVCCONTRATANTE = "p_evcContratante";
    /** <code>municipioDelMunicipioRespevcContratante</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIORES_MUNICIPIODELMUNICIPIORESPEVCCONTRATANTE = "Clas_1431890034688728Ser_17Arg_2_Alias";
    /** <code>municipioDelMunicipioRespevcContratante</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIORES_MUNICIPIODELMUNICIPIORESPEVCCONTRATANTE = "Contratantes";
    // Service (CambiarMunicipioInst)
    /** <code>CambiarMunicipioInst</code> service id. */
    public static final String SERV_ID_CAMBIARMUNICIPIOINST = "Clas_1431890034688728Ser_18_Alias";
    /** <code>CambiarMunicipioInst</code> service name. */
    public static final String SERV_NAME_CAMBIARMUNICIPIOINST = "CambiarMunicipioInst";
    /** <code>CambiarMunicipioInst</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARMUNICIPIOINST = "CambiarMunicipioInst";
    /** Agents allowed to execute the service CambiarMunicipioInst **/
    public static final String CAMBIARMUNICIPIOINST_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioCambiarMunicipioInstpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARMUNICIPIOINST_MUNICIPIOCAMBIARMUNICIPIOINSTPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioCambiarMunicipioInstpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARMUNICIPIOINST_MUNICIPIOCAMBIARMUNICIPIOINSTPTHISMUNICIPIO = "Clas_1431890034688728Ser_18Arg_1_Alias";
    /** <code>municipioCambiarMunicipioInstpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARMUNICIPIOINST_MUNICIPIOCAMBIARMUNICIPIOINSTPTHISMUNICIPIO = "Municipio";
    /** <code>municipioCambiarMunicipioInstpevcInstitucionMatNeo</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARMUNICIPIOINST_MUNICIPIOCAMBIARMUNICIPIOINSTPEVCINSTITUCIONMATNEO = "p_evcInstitucionMatNeo";
    /** <code>municipioCambiarMunicipioInstpevcInstitucionMatNeo</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARMUNICIPIOINST_MUNICIPIOCAMBIARMUNICIPIOINSTPEVCINSTITUCIONMATNEO = "Clas_1431890034688728Ser_18Arg_2_Alias";
    /** <code>municipioCambiarMunicipioInstpevcInstitucionMatNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARMUNICIPIOINST_MUNICIPIOCAMBIARMUNICIPIOINSTPEVCINSTITUCIONMATNEO = "Instituciones";
    // Service (InsMunicipioC)
    /** <code>InsMunicipioC</code> service id. */
    public static final String SERV_ID_INSMUNICIPIOC = "Clas_1431890034688728Ser_19_Alias";
    /** <code>InsMunicipioC</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIOC = "InsMunicipioC";
    /** <code>InsMunicipioC</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIOC = "InsMunicipioC";
    /** Agents allowed to execute the service InsMunicipioC **/
    public static final String INSMUNICIPIOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioCpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOC_MUNICIPIOINSMUNICIPIOCPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioCpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOC_MUNICIPIOINSMUNICIPIOCPTHISMUNICIPIO = "Clas_1431890034688728Ser_19Arg_1_Alias";
    /** <code>municipioInsMunicipioCpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOC_MUNICIPIOINSMUNICIPIOCPTHISMUNICIPIO = "Municipio";
    /** <code>municipioInsMunicipioCpevcDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOC_MUNICIPIOINSMUNICIPIOCPEVCDIRECCIONC = "p_evcDireccionC";
    /** <code>municipioInsMunicipioCpevcDireccionC</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOC_MUNICIPIOINSMUNICIPIOCPEVCDIRECCIONC = "Clas_1431890034688728Ser_19Arg_2_Alias";
    /** <code>municipioInsMunicipioCpevcDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOC_MUNICIPIOINSMUNICIPIOCPEVCDIRECCIONC = "Direcciones";
    // Service (DelMunicipioC)
    /** <code>DelMunicipioC</code> service id. */
    public static final String SERV_ID_DELMUNICIPIOC = "Clas_1431890034688728Ser_20_Alias";
    /** <code>DelMunicipioC</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIOC = "DelMunicipioC";
    /** <code>DelMunicipioC</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIOC = "DelMunicipioC";
    /** Agents allowed to execute the service DelMunicipioC **/
    public static final String DELMUNICIPIOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioCpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOC_MUNICIPIODELMUNICIPIOCPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioCpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOC_MUNICIPIODELMUNICIPIOCPTHISMUNICIPIO = "Clas_1431890034688728Ser_20Arg_1_Alias";
    /** <code>municipioDelMunicipioCpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOC_MUNICIPIODELMUNICIPIOCPTHISMUNICIPIO = "Municipio";
    /** <code>municipioDelMunicipioCpevcDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOC_MUNICIPIODELMUNICIPIOCPEVCDIRECCIONC = "p_evcDireccionC";
    /** <code>municipioDelMunicipioCpevcDireccionC</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOC_MUNICIPIODELMUNICIPIOCPEVCDIRECCIONC = "Clas_1431890034688728Ser_20Arg_2_Alias";
    /** <code>municipioDelMunicipioCpevcDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOC_MUNICIPIODELMUNICIPIOCPEVCDIRECCIONC = "Direcciones";
    // Service (InsMunicipioContrato)
    /** <code>InsMunicipioContrato</code> service id. */
    public static final String SERV_ID_INSMUNICIPIOCONTRATO = "Clas_1431890034688728Ser_21_Alias";
    /** <code>InsMunicipioContrato</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIOCONTRATO = "InsMunicipioContrato";
    /** <code>InsMunicipioContrato</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIOCONTRATO = "InsMunicipioContrato";
    /** Agents allowed to execute the service InsMunicipioContrato **/
    public static final String INSMUNICIPIOCONTRATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioContratopthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOCONTRATO_MUNICIPIOINSMUNICIPIOCONTRATOPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioContratopthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOCONTRATO_MUNICIPIOINSMUNICIPIOCONTRATOPTHISMUNICIPIO = "Clas_1431890034688728Ser_21Arg_1_Alias";
    /** <code>municipioInsMunicipioContratopthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOCONTRATO_MUNICIPIOINSMUNICIPIOCONTRATOPTHISMUNICIPIO = "Municipio";
    /** <code>municipioInsMunicipioContratopevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOCONTRATO_MUNICIPIOINSMUNICIPIOCONTRATOPEVCCONTRATOC = "p_evcContratoC";
    /** <code>municipioInsMunicipioContratopevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOCONTRATO_MUNICIPIOINSMUNICIPIOCONTRATOPEVCCONTRATOC = "Clas_1431890034688728Ser_21Arg_2_Alias";
    /** <code>municipioInsMunicipioContratopevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOCONTRATO_MUNICIPIOINSMUNICIPIOCONTRATOPEVCCONTRATOC = "Contratos";
    // Service (DelMunicipioContrato)
    /** <code>DelMunicipioContrato</code> service id. */
    public static final String SERV_ID_DELMUNICIPIOCONTRATO = "Clas_1431890034688728Ser_22_Alias";
    /** <code>DelMunicipioContrato</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIOCONTRATO = "DelMunicipioContrato";
    /** <code>DelMunicipioContrato</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIOCONTRATO = "DelMunicipioContrato";
    /** Agents allowed to execute the service DelMunicipioContrato **/
    public static final String DELMUNICIPIOCONTRATO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioContratopthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOCONTRATO_MUNICIPIODELMUNICIPIOCONTRATOPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioContratopthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOCONTRATO_MUNICIPIODELMUNICIPIOCONTRATOPTHISMUNICIPIO = "Clas_1431890034688728Ser_22Arg_1_Alias";
    /** <code>municipioDelMunicipioContratopthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOCONTRATO_MUNICIPIODELMUNICIPIOCONTRATOPTHISMUNICIPIO = "Municipio";
    /** <code>municipioDelMunicipioContratopevcContratoC</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOCONTRATO_MUNICIPIODELMUNICIPIOCONTRATOPEVCCONTRATOC = "p_evcContratoC";
    /** <code>municipioDelMunicipioContratopevcContratoC</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOCONTRATO_MUNICIPIODELMUNICIPIOCONTRATOPEVCCONTRATOC = "Clas_1431890034688728Ser_22Arg_2_Alias";
    /** <code>municipioDelMunicipioContratopevcContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOCONTRATO_MUNICIPIODELMUNICIPIOCONTRATOPEVCCONTRATOC = "Contratos";
    // Service (InsMunicipioCNac)
    /** <code>InsMunicipioCNac</code> service id. */
    public static final String SERV_ID_INSMUNICIPIOCNAC = "Clas_1431890034688728Ser_23_Alias";
    /** <code>InsMunicipioCNac</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIOCNAC = "InsMunicipioCNac";
    /** <code>InsMunicipioCNac</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIOCNAC = "InsMunicipioCNac";
    /** Agents allowed to execute the service InsMunicipioCNac **/
    public static final String INSMUNICIPIOCNAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioCNacpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOCNAC_MUNICIPIOINSMUNICIPIOCNACPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioCNacpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOCNAC_MUNICIPIOINSMUNICIPIOCNACPTHISMUNICIPIO = "Clas_1431890034688728Ser_23Arg_1_Alias";
    /** <code>municipioInsMunicipioCNacpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOCNAC_MUNICIPIOINSMUNICIPIOCNACPTHISMUNICIPIO = "Municipio";
    /** <code>municipioInsMunicipioCNacpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOCNAC_MUNICIPIOINSMUNICIPIOCNACPEVCPERSONAC = "p_evcPersonaC";
    /** <code>municipioInsMunicipioCNacpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOCNAC_MUNICIPIOINSMUNICIPIOCNACPEVCPERSONAC = "Clas_1431890034688728Ser_23Arg_2_Alias";
    /** <code>municipioInsMunicipioCNacpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOCNAC_MUNICIPIOINSMUNICIPIOCNACPEVCPERSONAC = "Personas";
    // Service (DelMunicipioCNac)
    /** <code>DelMunicipioCNac</code> service id. */
    public static final String SERV_ID_DELMUNICIPIOCNAC = "Clas_1431890034688728Ser_24_Alias";
    /** <code>DelMunicipioCNac</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIOCNAC = "DelMunicipioCNac";
    /** <code>DelMunicipioCNac</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIOCNAC = "DelMunicipioCNac";
    /** Agents allowed to execute the service DelMunicipioCNac **/
    public static final String DELMUNICIPIOCNAC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioCNacpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOCNAC_MUNICIPIODELMUNICIPIOCNACPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioCNacpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOCNAC_MUNICIPIODELMUNICIPIOCNACPTHISMUNICIPIO = "Clas_1431890034688728Ser_24Arg_1_Alias";
    /** <code>municipioDelMunicipioCNacpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOCNAC_MUNICIPIODELMUNICIPIOCNACPTHISMUNICIPIO = "Municipio";
    /** <code>municipioDelMunicipioCNacpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOCNAC_MUNICIPIODELMUNICIPIOCNACPEVCPERSONAC = "p_evcPersonaC";
    /** <code>municipioDelMunicipioCNacpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOCNAC_MUNICIPIODELMUNICIPIOCNACPEVCPERSONAC = "Clas_1431890034688728Ser_24Arg_2_Alias";
    /** <code>municipioDelMunicipioCNacpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOCNAC_MUNICIPIODELMUNICIPIOCNACPEVCPERSONAC = "Personas";
    // Service (InsMunicipioDirSucursal)
    /** <code>InsMunicipioDirSucursal</code> service id. */
    public static final String SERV_ID_INSMUNICIPIODIRSUCURSAL = "Clas_1431890034688728Ser_25_Alias";
    /** <code>InsMunicipioDirSucursal</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIODIRSUCURSAL = "InsMunicipioDirSucursal";
    /** <code>InsMunicipioDirSucursal</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIODIRSUCURSAL = "InsMunicipioDirSucursal";
    /** Agents allowed to execute the service InsMunicipioDirSucursal **/
    public static final String INSMUNICIPIODIRSUCURSAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioDirSucursalpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIODIRSUCURSAL_MUNICIPIOINSMUNICIPIODIRSUCURSALPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioDirSucursalpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIODIRSUCURSAL_MUNICIPIOINSMUNICIPIODIRSUCURSALPTHISMUNICIPIO = "Clas_1431890034688728Ser_25Arg_1_Alias";
    /** <code>municipioInsMunicipioDirSucursalpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIODIRSUCURSAL_MUNICIPIOINSMUNICIPIODIRSUCURSALPTHISMUNICIPIO = "Municipio";
    /** <code>municipioInsMunicipioDirSucursalpevcDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIODIRSUCURSAL_MUNICIPIOINSMUNICIPIODIRSUCURSALPEVCDIRSUCURSALC = "p_evcDirSucursalC";
    /** <code>municipioInsMunicipioDirSucursalpevcDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIODIRSUCURSAL_MUNICIPIOINSMUNICIPIODIRSUCURSALPEVCDIRSUCURSALC = "Clas_1431890034688728Ser_25Arg_2_Alias";
    /** <code>municipioInsMunicipioDirSucursalpevcDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIODIRSUCURSAL_MUNICIPIOINSMUNICIPIODIRSUCURSALPEVCDIRSUCURSALC = "DirSucursalC";
    // Service (DelMunicipioDirSucursal)
    /** <code>DelMunicipioDirSucursal</code> service id. */
    public static final String SERV_ID_DELMUNICIPIODIRSUCURSAL = "Clas_1431890034688728Ser_26_Alias";
    /** <code>DelMunicipioDirSucursal</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIODIRSUCURSAL = "DelMunicipioDirSucursal";
    /** <code>DelMunicipioDirSucursal</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIODIRSUCURSAL = "DelMunicipioDirSucursal";
    /** Agents allowed to execute the service DelMunicipioDirSucursal **/
    public static final String DELMUNICIPIODIRSUCURSAL_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioDirSucursalpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIODIRSUCURSAL_MUNICIPIODELMUNICIPIODIRSUCURSALPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioDirSucursalpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIODIRSUCURSAL_MUNICIPIODELMUNICIPIODIRSUCURSALPTHISMUNICIPIO = "Clas_1431890034688728Ser_26Arg_1_Alias";
    /** <code>municipioDelMunicipioDirSucursalpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIODIRSUCURSAL_MUNICIPIODELMUNICIPIODIRSUCURSALPTHISMUNICIPIO = "Municipio";
    /** <code>municipioDelMunicipioDirSucursalpevcDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIODIRSUCURSAL_MUNICIPIODELMUNICIPIODIRSUCURSALPEVCDIRSUCURSALC = "p_evcDirSucursalC";
    /** <code>municipioDelMunicipioDirSucursalpevcDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIODIRSUCURSAL_MUNICIPIODELMUNICIPIODIRSUCURSALPEVCDIRSUCURSALC = "Clas_1431890034688728Ser_26Arg_2_Alias";
    /** <code>municipioDelMunicipioDirSucursalpevcDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIODIRSUCURSAL_MUNICIPIODELMUNICIPIODIRSUCURSALPEVCDIRSUCURSALC = "DirSucursalC";
    // Service (InsMunicipioFamilia)
    /** <code>InsMunicipioFamilia</code> service id. */
    public static final String SERV_ID_INSMUNICIPIOFAMILIA = "Clas_1431890034688728Ser_27_Alias";
    /** <code>InsMunicipioFamilia</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIOFAMILIA = "InsMunicipioFamilia";
    /** <code>InsMunicipioFamilia</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIOFAMILIA = "InsMunicipioFamilia";
    /** Agents allowed to execute the service InsMunicipioFamilia **/
    public static final String INSMUNICIPIOFAMILIA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioInsMunicipioFamiliapthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOFAMILIA_MUNICIPIOINSMUNICIPIOFAMILIAPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioInsMunicipioFamiliapthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOFAMILIA_MUNICIPIOINSMUNICIPIOFAMILIAPTHISMUNICIPIO = "Clas_1431890034688728Ser_27Arg_1_Alias";
    /** <code>municipioInsMunicipioFamiliapthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOFAMILIA_MUNICIPIOINSMUNICIPIOFAMILIAPTHISMUNICIPIO = "MunicipioC";
    /** <code>municipioInsMunicipioFamiliapevcFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOFAMILIA_MUNICIPIOINSMUNICIPIOFAMILIAPEVCFAMILIAC = "p_evcFamiliaC";
    /** <code>municipioInsMunicipioFamiliapevcFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOFAMILIA_MUNICIPIOINSMUNICIPIOFAMILIAPEVCFAMILIAC = "Clas_1431890034688728Ser_27Arg_2_Alias";
    /** <code>municipioInsMunicipioFamiliapevcFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOFAMILIA_MUNICIPIOINSMUNICIPIOFAMILIAPEVCFAMILIAC = "FamiliaC";
    // Service (DelMunicipioFamilia)
    /** <code>DelMunicipioFamilia</code> service id. */
    public static final String SERV_ID_DELMUNICIPIOFAMILIA = "Clas_1431890034688728Ser_28_Alias";
    /** <code>DelMunicipioFamilia</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIOFAMILIA = "DelMunicipioFamilia";
    /** <code>DelMunicipioFamilia</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIOFAMILIA = "DelMunicipioFamilia";
    /** Agents allowed to execute the service DelMunicipioFamilia **/
    public static final String DELMUNICIPIOFAMILIA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioDelMunicipioFamiliapthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOFAMILIA_MUNICIPIODELMUNICIPIOFAMILIAPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioDelMunicipioFamiliapthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOFAMILIA_MUNICIPIODELMUNICIPIOFAMILIAPTHISMUNICIPIO = "Clas_1431890034688728Ser_28Arg_1_Alias";
    /** <code>municipioDelMunicipioFamiliapthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOFAMILIA_MUNICIPIODELMUNICIPIOFAMILIAPTHISMUNICIPIO = "MunicipioC";
    /** <code>municipioDelMunicipioFamiliapevcFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOFAMILIA_MUNICIPIODELMUNICIPIOFAMILIAPEVCFAMILIAC = "p_evcFamiliaC";
    /** <code>municipioDelMunicipioFamiliapevcFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOFAMILIA_MUNICIPIODELMUNICIPIOFAMILIAPEVCFAMILIAC = "Clas_1431890034688728Ser_28Arg_2_Alias";
    /** <code>municipioDelMunicipioFamiliapevcFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOFAMILIA_MUNICIPIODELMUNICIPIOFAMILIAPEVCFAMILIAC = "FamiliaC";
    // Service (TSINCRONIZAR)
    /** <code>TSINCRONIZAR</code> service id. */
    public static final String SERV_ID_TSINCRONIZAR = "Clas_1431890034688728Ser_15_Alias";
    /** <code>TSINCRONIZAR</code> service name. */
    public static final String SERV_NAME_TSINCRONIZAR = "TSINCRONIZAR";
    /** <code>TSINCRONIZAR</code> service alias. */
    public static final String SERV_ALIAS_TSINCRONIZAR = "TSINCRONIZAR";
    /** Agents allowed to execute the service TSINCRONIZAR **/
    public static final String TSINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>municipioTSINCRONIZARpthisMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTHISMUNICIPIO = "p_thisMunicipio";
    /** <code>municipioTSINCRONIZARpthisMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTHISMUNICIPIO = "Clas_1431890034688728Ser_15Arg_1_Alias";
    /** <code>municipioTSINCRONIZARpthisMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTHISMUNICIPIO = "Municipio";
    /** <code>municipioTSINCRONIZARptpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTPDESCRIPCION = "pt_p_Descripcion";
    /** <code>municipioTSINCRONIZARptpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTPDESCRIPCION = "Clas_1431890034688728Ser_15Arg_2_Alias";
    /** <code>municipioTSINCRONIZARptpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTPDESCRIPCION = "Descripción";
    /** <code>municipioTSINCRONIZARptpCodigoLegal</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTPCODIGOLEGAL = "pt_p_CodigoLegal";
    /** <code>municipioTSINCRONIZARptpCodigoLegal</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTPCODIGOLEGAL = "Clas_1431890034688728Ser_15Arg_3_Alias";
    /** <code>municipioTSINCRONIZARptpCodigoLegal</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTPCODIGOLEGAL = "Código legal";
    /** <code>municipioTSINCRONIZARptpEsValidoEPS</code> inbound argument name. */
    public static final String ARG_NAME_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTPESVALIDOEPS = "pt_p_EsValidoEPS";
    /** <code>municipioTSINCRONIZARptpEsValidoEPS</code> inbound argument id. */
    public static final String ARG_ID_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTPESVALIDOEPS = "Clas_1431890034688728Ser_15Arg_4_Alias";
    /** <code>municipioTSINCRONIZARptpEsValidoEPS</code> inbound argument alias. */
    public static final String ARG_ALIAS_TSINCRONIZAR_MUNICIPIOTSINCRONIZARPTPESVALIDOEPS = "Válido EPS";

    public static final String FILTER_NAME_FMUNICIPIOVARIOS = "F_MunicipioVarios";
    public static final String VAR_NAME_FMUNICIPIOVARIOS_VODEPARTAMENTO = "vo_Departamento";
    public static final String VAR_NAME_FMUNICIPIOVARIOS_VDESCRIPCION = "v_Descripcion";
    public static final String VAR_NAME_FMUNICIPIOVARIOS_VESVALIDOEPS = "v_EsValidoEPS";
    public static final String VAR_NAME_FMUNICIPIOVARIOS_VAPLICAIVA = "v_AplicaIVA";
    public static final String FILTER_NAME_IFMUNICIPIOCODIGO = "iF_MunicipioCodigo";
    public static final String VAR_NAME_IFMUNICIPIOCODIGO_VCODIGO = "v_Codigo";
    public static final String FILTER_NAME_IFMUNICIPIOCODIGOLEGAL = "iF_MunicipioCodigoLegal";
    public static final String VAR_NAME_IFMUNICIPIOCODIGOLEGAL_VFCODLEGAL = "vfCodLegal";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_MUNICIPIODESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_MUNICIPIOCODIGOLEGAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_MUNICIPIOESVALIDOEPS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_MUNICIPIOAPLICAIVA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_MUNICIPIOCODIGO.toUpperCase(), MUNICIPIOCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_MUNICIPIODESCRIPCION.toUpperCase(), MUNICIPIODESCRIPCION_AGENTS);
    	attributeAgents.put(ATTR_NAME_MUNICIPIOCODIGOLEGAL.toUpperCase(), MUNICIPIOCODIGOLEGAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_MUNICIPIOESVALIDOEPS.toUpperCase(), MUNICIPIOESVALIDOEPS_AGENTS);
    	attributeAgents.put(ATTR_NAME_MUNICIPIOAPLICAIVA.toUpperCase(), MUNICIPIOAPLICAIVA_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_DEPARTAMENTO.toUpperCase(), DEPARTAMENTO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Municipio', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Municipio', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_MUNICIPIOCODIGO);
        }
        // Facet 'Municipio' (This facet)
        if (MunicipioConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_MUNICIPIOCODIGO);
        }
        return returnList;
    }
}
