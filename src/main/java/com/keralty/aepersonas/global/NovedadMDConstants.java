package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>NovedadMD</code> model class.
 */
public final class NovedadMDConstants {

    private NovedadMDConstants() {

    }

    // Class
    /** <code>NovedadMD</code> class id. */
    public static final String CLASS_ID = "Clas_1582553235456449_Alias";
    /** <code>NovedadMD</code> class name. */
    public static final String CLASS_NAME = "NovedadMD";
    /** <code>NovedadMD</code> class alias. */
    public static final String CLASS_ALIAS = "Nueva dirección";
    /** <code>NovedadMD</code> class table name. */
    public static final String TBL_NAME = "NovedadMD";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "novedadMDidNovedadMD,familiaNovedadidFamiliaNovedad,paisCodigo,departamentoDepartamentoCodigo,municipioMunicipioCodigo,novedadMDDireccionCompleta,novedadMDRural,novedadMDTelefonoFijo,novedadMDTelefonoCelular,novedadMDCorreoElectronico";

    public static final String DSDSNOVEDADMDNULL = "DS_NovedadMD_Null";
    

    // Attribute (novedadMDidNovedadMD)
    /** <code>novedadMDidNovedadMD</code> attribute id. */
    public static final String ATTR_ID_NOVEDADMDIDNOVEDADMD = "Clas_1582553235456449Atr_1_Alias";
    /** <code>novedadMDidNovedadMD</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADMDIDNOVEDADMD = "novedadMDidNovedadMD";
    /** <code>novedadMDidNovedadMD</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADMDIDNOVEDADMD = "Identificador";

    /** <code>novedadMDidNovedadMD</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADMDIDNOVEDADMD = "";
    /** Agents allowed to view the attribute novedadMDidNovedadMD **/
    public static final String NOVEDADMDIDNOVEDADMD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadMDDireccionCompleta)
    /** <code>novedadMDDireccionCompleta</code> attribute id. */
    public static final String ATTR_ID_NOVEDADMDDIRECCIONCOMPLETA = "Clas_1582553235456449Atr_2_Alias";
    /** <code>novedadMDDireccionCompleta</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADMDDIRECCIONCOMPLETA = "novedadMDDireccionCompleta";
    /** <code>novedadMDDireccionCompleta</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADMDDIRECCIONCOMPLETA = "Dirección completa";

    /** <code>novedadMDDireccionCompleta</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADMDDIRECCIONCOMPLETA = "";
    /** Agents allowed to view the attribute novedadMDDireccionCompleta **/
    public static final String NOVEDADMDDIRECCIONCOMPLETA_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadMDRural)
    /** <code>novedadMDRural</code> attribute id. */
    public static final String ATTR_ID_NOVEDADMDRURAL = "Clas_1582553235456449Atr_3_Alias";
    /** <code>novedadMDRural</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADMDRURAL = "novedadMDRural";
    /** <code>novedadMDRural</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADMDRURAL = "Rural";

    /** <code>novedadMDRural</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADMDRURAL = "";
    /** Agents allowed to view the attribute novedadMDRural **/
    public static final String NOVEDADMDRURAL_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadMDTelefonoFijo)
    /** <code>novedadMDTelefonoFijo</code> attribute id. */
    public static final String ATTR_ID_NOVEDADMDTELEFONOFIJO = "Clas_1582553235456449Atr_4_Alias";
    /** <code>novedadMDTelefonoFijo</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADMDTELEFONOFIJO = "novedadMDTelefonoFijo";
    /** <code>novedadMDTelefonoFijo</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADMDTELEFONOFIJO = "Teléfono Fijo";

    /** <code>novedadMDTelefonoFijo</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADMDTELEFONOFIJO = "";
    /** Agents allowed to view the attribute novedadMDTelefonoFijo **/
    public static final String NOVEDADMDTELEFONOFIJO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadMDTelefonoCelular)
    /** <code>novedadMDTelefonoCelular</code> attribute id. */
    public static final String ATTR_ID_NOVEDADMDTELEFONOCELULAR = "Clas_1582553235456449Atr_5_Alias";
    /** <code>novedadMDTelefonoCelular</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADMDTELEFONOCELULAR = "novedadMDTelefonoCelular";
    /** <code>novedadMDTelefonoCelular</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADMDTELEFONOCELULAR = "Telefono Celular";

    /** <code>novedadMDTelefonoCelular</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADMDTELEFONOCELULAR = "";
    /** Agents allowed to view the attribute novedadMDTelefonoCelular **/
    public static final String NOVEDADMDTELEFONOCELULAR_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (novedadMDCorreoElectronico)
    /** <code>novedadMDCorreoElectronico</code> attribute id. */
    public static final String ATTR_ID_NOVEDADMDCORREOELECTRONICO = "Clas_1582553235456449Atr_6_Alias";
    /** <code>novedadMDCorreoElectronico</code> attribute name. */
    public static final String ATTR_NAME_NOVEDADMDCORREOELECTRONICO = "novedadMDCorreoElectronico";
    /** <code>novedadMDCorreoElectronico</code> attribute alias. */
    public static final String ATTR_ALIAS_NOVEDADMDCORREOELECTRONICO = "Correo Electrónico";

    /** <code>novedadMDCorreoElectronico</code> attribute facet sequence. */
    public static final String PATH_FACETS_NOVEDADMDCORREOELECTRONICO = "";
    /** Agents allowed to view the attribute novedadMDCorreoElectronico **/
    public static final String NOVEDADMDCORREOELECTRONICO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (id_NovedadMD)
    /** <code>id_NovedadMD</code> field name. */
    public static final String FLD_NOVEDADMDIDNOVEDADMD = "id_NovedadMD";    
    /** <code>novedadMDidNovedadMD</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADMDIDNOVEDADMD = "novedadMDidNovedadMD";
    // Field (id_FamiliaNovedad)
    /** <code>id_FamiliaNovedad</code> field name. */
    public static final String FLD_FAMILIANOVEDADIDFAMILIANOVEDAD = "id_FamiliaNovedad";    
    /** <code>FamiliaNovedad.familiaNovedadidFamiliaNovedad</code> attribute field name. */
    public static final String ATTR_FIELD_FAMILIANOVEDAD_FAMILIANOVEDADIDFAMILIANOVEDAD = "familiaNovedadidFamiliaNovedad";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PAISCODIGO = "Codigo";    
    /** <code>Codigo</code> field length. */
    public static final int FLD_PAISCODIGOLENGTH = 10;
    /** <code>Pais.paisCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PAIS_PAISCODIGO = "paisCodigo";
    // Field (Departamento_Codigo)
    /** <code>Departamento_Codigo</code> field name. */
    public static final String FLD_DEPARTAMENTODEPARTAMENTOCODIGO = "Departamento_Codigo";    
    /** <code>Departamento.departamentoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DEPARTAMENTO_DEPARTAMENTOCODIGO = "departamentoDepartamentoCodigo";
    // Field (Municipio_Codigo)
    /** <code>Municipio_Codigo</code> field name. */
    public static final String FLD_MUNICIPIOMUNICIPIOCODIGO = "Municipio_Codigo";    
    /** <code>Municipio.municipioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIO_MUNICIPIOCODIGO = "municipioMunicipioCodigo";
    // Field (DireccionCompleta)
    /** <code>DireccionCompleta</code> field name. */
    public static final String FLD_NOVEDADMDDIRECCIONCOMPLETA = "DireccionCompleta";    
    /** <code>DireccionCompleta</code> field length. */
    public static final int FLD_NOVEDADMDDIRECCIONCOMPLETALENGTH = 250;
    /** <code>novedadMDDireccionCompleta</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADMDDIRECCIONCOMPLETA = "novedadMDDireccionCompleta";
    // Field (Rural)
    /** <code>Rural</code> field name. */
    public static final String FLD_NOVEDADMDRURAL = "Rural";    
    /** <code>novedadMDRural</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADMDRURAL = "novedadMDRural";
    // Field (TelefonoFijo)
    /** <code>TelefonoFijo</code> field name. */
    public static final String FLD_NOVEDADMDTELEFONOFIJO = "TelefonoFijo";    
    /** <code>TelefonoFijo</code> field length. */
    public static final int FLD_NOVEDADMDTELEFONOFIJOLENGTH = 15;
    /** <code>novedadMDTelefonoFijo</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADMDTELEFONOFIJO = "novedadMDTelefonoFijo";
    // Field (TelefonoCelular)
    /** <code>TelefonoCelular</code> field name. */
    public static final String FLD_NOVEDADMDTELEFONOCELULAR = "TelefonoCelular";    
    /** <code>TelefonoCelular</code> field length. */
    public static final int FLD_NOVEDADMDTELEFONOCELULARLENGTH = 15;
    /** <code>novedadMDTelefonoCelular</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADMDTELEFONOCELULAR = "novedadMDTelefonoCelular";
    // Field (CorreoElectronico)
    /** <code>CorreoElectronico</code> field name. */
    public static final String FLD_NOVEDADMDCORREOELECTRONICO = "CorreoElectronico";    
    /** <code>CorreoElectronico</code> field length. */
    public static final int FLD_NOVEDADMDCORREOELECTRONICOLENGTH = 100;
    /** <code>novedadMDCorreoElectronico</code> attribute field name. */
    public static final String ATTR_FIELD_NOVEDADMDCORREOELECTRONICO = "novedadMDCorreoElectronico";

    // Component role (FamiliaNovedad)
    /** <code>FamiliaNovedad</code> role id. */
    public static final String ROLE_ID_FAMILIANOVEDAD = "Agr_1582553235456369_Alias";
    /** <code>FamiliaNovedad</code> role name. */
    public static final String ROLE_NAME_FAMILIANOVEDAD = "familiaNovedad";
    /** <code>FamiliaNovedad</code> role alias. */
    public static final String ROLE_ALIAS_FAMILIANOVEDAD = "FamiliaNovedad";

    /** <code>FamiliaNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_FAMILIANOVEDAD = FamiliaNovedadConstants.ROLE_NAME_NOVEDADMD;
    /** <code>FamiliaNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_FAMILIANOVEDAD = "";
    /** <code>FamiliaNovedad</code> role target class. */
    public static final String ROLE_TARGET_FAMILIANOVEDAD = FamiliaNovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through FamiliaNovedad **/
    public static final String FAMILIANOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Pais)
    /** <code>Pais</code> role id. */
    public static final String ROLE_ID_PAIS = "Agr_1582554939392150_Alias";
    /** <code>Pais</code> role name. */
    public static final String ROLE_NAME_PAIS = "pais";
    /** <code>Pais</code> role alias. */
    public static final String ROLE_ALIAS_PAIS = "País";

    /** <code>Pais</code> inverse role name. */
    public static final String ROLE_INVNAME_PAIS = PaisConstants.ROLE_NAME_NOVEDADESMD;
    /** <code>Pais</code> role facet sequence. */
    public static final String PATH_FACETS_PAIS = "";
    /** <code>Pais</code> role target class. */
    public static final String ROLE_TARGET_PAIS = PaisConstants.CLASS_NAME;

    /** Agents allowed to navigate through Pais **/
    public static final String PAIS_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Departamento)
    /** <code>Departamento</code> role id. */
    public static final String ROLE_ID_DEPARTAMENTO = "Agr_1582555070464037_Alias";
    /** <code>Departamento</code> role name. */
    public static final String ROLE_NAME_DEPARTAMENTO = "departamento";
    /** <code>Departamento</code> role alias. */
    public static final String ROLE_ALIAS_DEPARTAMENTO = "Departamento";

    /** <code>Departamento</code> inverse role name. */
    public static final String ROLE_INVNAME_DEPARTAMENTO = DepartamentoConstants.ROLE_NAME_NOVEDADESMD;
    /** <code>Departamento</code> role facet sequence. */
    public static final String PATH_FACETS_DEPARTAMENTO = "";
    /** <code>Departamento</code> role target class. */
    public static final String ROLE_TARGET_DEPARTAMENTO = DepartamentoConstants.CLASS_NAME;

    /** Agents allowed to navigate through Departamento **/
    public static final String DEPARTAMENTO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Municipio)
    /** <code>Municipio</code> role id. */
    public static final String ROLE_ID_MUNICIPIO = "Agr_1582555070464056_Alias";
    /** <code>Municipio</code> role name. */
    public static final String ROLE_NAME_MUNICIPIO = "municipio";
    /** <code>Municipio</code> role alias. */
    public static final String ROLE_ALIAS_MUNICIPIO = "Municipio";

    /** <code>Municipio</code> inverse role name. */
    public static final String ROLE_INVNAME_MUNICIPIO = MunicipioConstants.ROLE_NAME_NOVEDADESMD;
    /** <code>Municipio</code> role facet sequence. */
    public static final String PATH_FACETS_MUNICIPIO = "";
    /** <code>Municipio</code> role target class. */
    public static final String ROLE_TARGET_MUNICIPIO = MunicipioConstants.CLASS_NAME;

    /** Agents allowed to navigate through Municipio **/
    public static final String MUNICIPIO_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1582553235456449Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>novedadMDcrearpagrFamiliaNovedad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADMDCREARPAGRFAMILIANOVEDAD = "p_agrFamiliaNovedad";
    /** <code>novedadMDcrearpagrFamiliaNovedad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADMDCREARPAGRFAMILIANOVEDAD = "Clas_1582553235456449Ser_1Arg_2_Alias";
    /** <code>novedadMDcrearpagrFamiliaNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADMDCREARPAGRFAMILIANOVEDAD = "FamiliaNovedad";
    /** <code>novedadMDcrearpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADMDCREARPAGRPAIS = "p_agrPais";
    /** <code>novedadMDcrearpagrPais</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADMDCREARPAGRPAIS = "Clas_1582553235456449Ser_1Arg_5_Alias";
    /** <code>novedadMDcrearpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADMDCREARPAGRPAIS = "País";
    /** <code>novedadMDcrearpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADMDCREARPAGRMUNICIPIO = "p_agrMunicipio";
    /** <code>novedadMDcrearpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADMDCREARPAGRMUNICIPIO = "Clas_1582553235456449Ser_1Arg_9_Alias";
    /** <code>novedadMDcrearpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADMDCREARPAGRMUNICIPIO = "Municipio";
    /** <code>novedadMDcrearpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADMDCREARPAGRDEPARTAMENTO = "p_agrDepartamento";
    /** <code>novedadMDcrearpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADMDCREARPAGRDEPARTAMENTO = "Clas_1582553235456449Ser_1Arg_11_Alias";
    /** <code>novedadMDcrearpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADMDCREARPAGRDEPARTAMENTO = "Departamento";
    /** <code>novedadMDcrearpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADMDCREARPATRDIRECCIONCOMPLETA = "p_atrDireccionCompleta";
    /** <code>novedadMDcrearpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADMDCREARPATRDIRECCIONCOMPLETA = "Clas_1582553235456449Ser_1Arg_3_Alias";
    /** <code>novedadMDcrearpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADMDCREARPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>novedadMDcrearpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADMDCREARPATRRURAL = "p_atrRural";
    /** <code>novedadMDcrearpatrRural</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADMDCREARPATRRURAL = "Clas_1582553235456449Ser_1Arg_4_Alias";
    /** <code>novedadMDcrearpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADMDCREARPATRRURAL = "Rural";
    /** <code>novedadMDcrearpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADMDCREARPATRTELEFONOFIJO = "p_atrTelefonoFijo";
    /** <code>novedadMDcrearpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADMDCREARPATRTELEFONOFIJO = "Clas_1582553235456449Ser_1Arg_12_Alias";
    /** <code>novedadMDcrearpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADMDCREARPATRTELEFONOFIJO = "Teléfono Fijo";
    /** <code>novedadMDcrearpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADMDCREARPATRTELEFONOCELULAR = "p_atrTelefonoCelular";
    /** <code>novedadMDcrearpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADMDCREARPATRTELEFONOCELULAR = "Clas_1582553235456449Ser_1Arg_13_Alias";
    /** <code>novedadMDcrearpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADMDCREARPATRTELEFONOCELULAR = "Telefono Celular";
    /** <code>novedadMDcrearpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_NOVEDADMDCREARPATRCORREOELECTRONICO = "p_atrCorreoElectronico";
    /** <code>novedadMDcrearpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_CREAR_NOVEDADMDCREARPATRCORREOELECTRONICO = "Clas_1582553235456449Ser_1Arg_14_Alias";
    /** <code>novedadMDcrearpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_NOVEDADMDCREARPATRCORREOELECTRONICO = "Correo Electrónico";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1582553235456449Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>novedadMDeliminarpthisNovedadMD</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_NOVEDADMDELIMINARPTHISNOVEDADMD = "p_thisNovedadMD";
    /** <code>novedadMDeliminarpthisNovedadMD</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_NOVEDADMDELIMINARPTHISNOVEDADMD = "Clas_1582553235456449Ser_2Arg_1_Alias";
    /** <code>novedadMDeliminarpthisNovedadMD</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_NOVEDADMDELIMINARPTHISNOVEDADMD = "Nueva dirección";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1582553235456449Ser_4_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Nuva dirección correspondencia";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>novedadMDTCREARptpagrFamiliaNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADMDTCREARPTPAGRFAMILIANOVEDAD = "pt_p_agrFamiliaNovedad";
    /** <code>novedadMDTCREARptpagrFamiliaNovedad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADMDTCREARPTPAGRFAMILIANOVEDAD = "Clas_1582553235456449Ser_4Arg_3_Alias";
    /** <code>novedadMDTCREARptpagrFamiliaNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADMDTCREARPTPAGRFAMILIANOVEDAD = "FamiliaNovedad";
    /** <code>novedadMDTCREARptpagrPais</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADMDTCREARPTPAGRPAIS = "pt_p_agrPais";
    /** <code>novedadMDTCREARptpagrPais</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADMDTCREARPTPAGRPAIS = "Clas_1582553235456449Ser_4Arg_4_Alias";
    /** <code>novedadMDTCREARptpagrPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADMDTCREARPTPAGRPAIS = "País";
    /** <code>novedadMDTCREARptpagrDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADMDTCREARPTPAGRDEPARTAMENTO = "pt_p_agrDepartamento";
    /** <code>novedadMDTCREARptpagrDepartamento</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADMDTCREARPTPAGRDEPARTAMENTO = "Clas_1582553235456449Ser_4Arg_5_Alias";
    /** <code>novedadMDTCREARptpagrDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADMDTCREARPTPAGRDEPARTAMENTO = "Departamento";
    /** <code>novedadMDTCREARptpagrMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADMDTCREARPTPAGRMUNICIPIO = "pt_p_agrMunicipio";
    /** <code>novedadMDTCREARptpagrMunicipio</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADMDTCREARPTPAGRMUNICIPIO = "Clas_1582553235456449Ser_4Arg_6_Alias";
    /** <code>novedadMDTCREARptpagrMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADMDTCREARPTPAGRMUNICIPIO = "Municipio";
    /** <code>novedadMDTCREARptpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADMDTCREARPTPATRDIRECCIONCOMPLETA = "pt_p_atrDireccionCompleta";
    /** <code>novedadMDTCREARptpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADMDTCREARPTPATRDIRECCIONCOMPLETA = "Clas_1582553235456449Ser_4Arg_7_Alias";
    /** <code>novedadMDTCREARptpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADMDTCREARPTPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>novedadMDTCREARptpatrRural</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADMDTCREARPTPATRRURAL = "pt_p_atrRural";
    /** <code>novedadMDTCREARptpatrRural</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADMDTCREARPTPATRRURAL = "Clas_1582553235456449Ser_4Arg_8_Alias";
    /** <code>novedadMDTCREARptpatrRural</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADMDTCREARPTPATRRURAL = "Rural";
    /** <code>novedadMDTCREARptpatrTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADMDTCREARPTPATRTELEFONOFIJO = "pt_p_atrTelefonoFijo";
    /** <code>novedadMDTCREARptpatrTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADMDTCREARPTPATRTELEFONOFIJO = "Clas_1582553235456449Ser_4Arg_305_Alias";
    /** <code>novedadMDTCREARptpatrTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADMDTCREARPTPATRTELEFONOFIJO = "Teléfono Fijo";
    /** <code>novedadMDTCREARptpatrTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADMDTCREARPTPATRTELEFONOCELULAR = "pt_p_atrTelefonoCelular";
    /** <code>novedadMDTCREARptpatrTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADMDTCREARPTPATRTELEFONOCELULAR = "Clas_1582553235456449Ser_4Arg_306_Alias";
    /** <code>novedadMDTCREARptpatrTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADMDTCREARPTPATRTELEFONOCELULAR = "Telefono Celular";
    /** <code>novedadMDTCREARptpatrCorreoElectronico</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_NOVEDADMDTCREARPTPATRCORREOELECTRONICO = "pt_p_atrCorreoElectronico";
    /** <code>novedadMDTCREARptpatrCorreoElectronico</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_NOVEDADMDTCREARPTPATRCORREOELECTRONICO = "Clas_1582553235456449Ser_4Arg_861_Alias";
    /** <code>novedadMDTCREARptpatrCorreoElectronico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_NOVEDADMDTCREARPTPATRCORREOELECTRONICO = "Correo electrónico";
    // Service (TDELETE)
    /** <code>TDELETE</code> service id. */
    public static final String SERV_ID_TDELETE = "Clas_1582553235456449Ser_5_Alias";
    /** <code>TDELETE</code> service name. */
    public static final String SERV_NAME_TDELETE = "TDELETE";
    /** <code>TDELETE</code> service alias. */
    public static final String SERV_ALIAS_TDELETE = "TDELETE";
    /** Agents allowed to execute the service TDELETE **/
    public static final String TDELETE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>novedadMDTDELETEpthisNovedadMD</code> inbound argument name. */
    public static final String ARG_NAME_TDELETE_NOVEDADMDTDELETEPTHISNOVEDADMD = "p_thisNovedadMD";
    /** <code>novedadMDTDELETEpthisNovedadMD</code> inbound argument id. */
    public static final String ARG_ID_TDELETE_NOVEDADMDTDELETEPTHISNOVEDADMD = "Clas_1582553235456449Ser_5Arg_1_Alias";
    /** <code>novedadMDTDELETEpthisNovedadMD</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELETE_NOVEDADMDTDELETEPTHISNOVEDADMD = "Nueva dirección";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_NOVEDADMDDIRECCIONCOMPLETA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADMDRURAL.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADMDTELEFONOFIJO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADMDTELEFONOCELULAR.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_NOVEDADMDCORREOELECTRONICO.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_NOVEDADMDIDNOVEDADMD.toUpperCase(), NOVEDADMDIDNOVEDADMD_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADMDDIRECCIONCOMPLETA.toUpperCase(), NOVEDADMDDIRECCIONCOMPLETA_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADMDRURAL.toUpperCase(), NOVEDADMDRURAL_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADMDTELEFONOFIJO.toUpperCase(), NOVEDADMDTELEFONOFIJO_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADMDTELEFONOCELULAR.toUpperCase(), NOVEDADMDTELEFONOCELULAR_AGENTS);
    	attributeAgents.put(ATTR_NAME_NOVEDADMDCORREOELECTRONICO.toUpperCase(), NOVEDADMDCORREOELECTRONICO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_FAMILIANOVEDAD.toUpperCase(), FAMILIANOVEDAD_AGENTS);
        roleAgents.put(ROLE_NAME_PAIS.toUpperCase(), PAIS_AGENTS);
        roleAgents.put(ROLE_NAME_DEPARTAMENTO.toUpperCase(), DEPARTAMENTO_AGENTS);
        roleAgents.put(ROLE_NAME_MUNICIPIO.toUpperCase(), MUNICIPIO_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'NovedadMD', it returns the identification keys
     * - If className is a facet of the inheritance net of 'NovedadMD', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_NOVEDADMDIDNOVEDADMD);
        }
        // Facet 'NovedadMD' (This facet)
        if (NovedadMDConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_NOVEDADMDIDNOVEDADMD);
        }
        return returnList;
    }
}
