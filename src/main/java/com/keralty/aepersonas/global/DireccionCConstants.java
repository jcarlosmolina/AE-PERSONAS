package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>DireccionC</code> model class.
 */
public final class DireccionCConstants {

    private DireccionCConstants() {

    }

    // Class
    /** <code>DireccionC</code> class id. */
    public static final String CLASS_ID = "Clas_1432202248192978_Alias";
    /** <code>DireccionC</code> class name. */
    public static final String CLASS_NAME = "DireccionC";
    /** <code>DireccionC</code> class alias. */
    public static final String CLASS_ALIAS = "Dirección";
    /** <code>DireccionC</code> class table name. */
    public static final String TBL_NAME = "DireccionC";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "direccionCCodigo,personaCID,contratoCContratoCID,tipoDireccionTipoDireccionCCodigo,departamentoDepartamentoCCodigo,municipioMunicipioCCodigo,paisPaisCCodigo,direccionCDireccionCompleta,direccionCLocalidad";

    

    // Attribute (direccionCCodigo)
    /** <code>direccionCCodigo</code> attribute id. */
    public static final String ATTR_ID_DIRECCIONCCODIGO = "Clas_1432202248192978Atr_7_Alias";
    /** <code>direccionCCodigo</code> attribute name. */
    public static final String ATTR_NAME_DIRECCIONCCODIGO = "direccionCCodigo";
    /** <code>direccionCCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_DIRECCIONCCODIGO = "Código";

    /** <code>direccionCCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_DIRECCIONCCODIGO = "";
    /** Agents allowed to view the attribute direccionCCodigo **/
    public static final String DIRECCIONCCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (direccionCDireccionCompleta)
    /** <code>direccionCDireccionCompleta</code> attribute id. */
    public static final String ATTR_ID_DIRECCIONCDIRECCIONCOMPLETA = "Clas_1432202248192978Atr_8_Alias";
    /** <code>direccionCDireccionCompleta</code> attribute name. */
    public static final String ATTR_NAME_DIRECCIONCDIRECCIONCOMPLETA = "direccionCDireccionCompleta";
    /** <code>direccionCDireccionCompleta</code> attribute alias. */
    public static final String ATTR_ALIAS_DIRECCIONCDIRECCIONCOMPLETA = "Dirección completa";

    /** <code>direccionCDireccionCompleta</code> attribute facet sequence. */
    public static final String PATH_FACETS_DIRECCIONCDIRECCIONCOMPLETA = "";
    /** Agents allowed to view the attribute direccionCDireccionCompleta **/
    public static final String DIRECCIONCDIRECCIONCOMPLETA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (direccionCLocalidad)
    /** <code>direccionCLocalidad</code> attribute id. */
    public static final String ATTR_ID_DIRECCIONCLOCALIDAD = "Clas_1432202248192978Atr_9_Alias";
    /** <code>direccionCLocalidad</code> attribute name. */
    public static final String ATTR_NAME_DIRECCIONCLOCALIDAD = "direccionCLocalidad";
    /** <code>direccionCLocalidad</code> attribute alias. */
    public static final String ATTR_ALIAS_DIRECCIONCLOCALIDAD = "Localidad";

    /** <code>direccionCLocalidad</code> attribute facet sequence. */
    public static final String PATH_FACETS_DIRECCIONCLOCALIDAD = "";
    /** Agents allowed to view the attribute direccionCLocalidad **/
    public static final String DIRECCIONCLOCALIDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (direccionCdrvCiudad)
    /** <code>direccionCdrvCiudad</code> attribute id. */
    public static final String ATTR_ID_DIRECCIONCDRVCIUDAD = "Clas_1432202248192978Atr_11_Alias";
    /** <code>direccionCdrvCiudad</code> attribute name. */
    public static final String ATTR_NAME_DIRECCIONCDRVCIUDAD = "direccionCdrvCiudad";
    /** <code>direccionCdrvCiudad</code> attribute alias. */
    public static final String ATTR_ALIAS_DIRECCIONCDRVCIUDAD = "Ciudad";

    /** <code>direccionCdrvCiudad</code> attribute facet sequence. */
    public static final String PATH_FACETS_DIRECCIONCDRVCIUDAD = "";
    /** Agents allowed to view the attribute direccionCdrvCiudad **/
    public static final String DIRECCIONCDRVCIUDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (direccionCdrvTieneDepartamento)
    /** <code>direccionCdrvTieneDepartamento</code> attribute id. */
    public static final String ATTR_ID_DIRECCIONCDRVTIENEDEPARTAMENTO = "Clas_1432202248192978Atr_12_Alias";
    /** <code>direccionCdrvTieneDepartamento</code> attribute name. */
    public static final String ATTR_NAME_DIRECCIONCDRVTIENEDEPARTAMENTO = "direccionCdrvTieneDepartamento";
    /** <code>direccionCdrvTieneDepartamento</code> attribute alias. */
    public static final String ATTR_ALIAS_DIRECCIONCDRVTIENEDEPARTAMENTO = "Tiene departamento?";

    /** <code>direccionCdrvTieneDepartamento</code> attribute facet sequence. */
    public static final String PATH_FACETS_DIRECCIONCDRVTIENEDEPARTAMENTO = "";
    /** Agents allowed to view the attribute direccionCdrvTieneDepartamento **/
    public static final String DIRECCIONCDRVTIENEDEPARTAMENTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (direccionCdrvTieneMunicipio)
    /** <code>direccionCdrvTieneMunicipio</code> attribute id. */
    public static final String ATTR_ID_DIRECCIONCDRVTIENEMUNICIPIO = "Clas_1432202248192978Atr_13_Alias";
    /** <code>direccionCdrvTieneMunicipio</code> attribute name. */
    public static final String ATTR_NAME_DIRECCIONCDRVTIENEMUNICIPIO = "direccionCdrvTieneMunicipio";
    /** <code>direccionCdrvTieneMunicipio</code> attribute alias. */
    public static final String ATTR_ALIAS_DIRECCIONCDRVTIENEMUNICIPIO = "Tiene municipio?";

    /** <code>direccionCdrvTieneMunicipio</code> attribute facet sequence. */
    public static final String PATH_FACETS_DIRECCIONCDRVTIENEMUNICIPIO = "";
    /** Agents allowed to view the attribute direccionCdrvTieneMunicipio **/
    public static final String DIRECCIONCDRVTIENEMUNICIPIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_DIRECCIONCCODIGO = "Codigo";    
    /** <code>direccionCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DIRECCIONCCODIGO = "direccionCCodigo";
    // Field (ID)
    /** <code>ID</code> field name. */
    public static final String FLD_PERSONACID = "ID";    
    /** <code>PersonaC.personaCID</code> attribute field name. */
    public static final String ATTR_FIELD_PERSONAC_PERSONACID = "personaCID";
    // Field (ContratoC_ID)
    /** <code>ContratoC_ID</code> field name. */
    public static final String FLD_CONTRATOCCONTRATOCID = "ContratoC_ID";    
    /** <code>ContratoC.contratoCID</code> attribute field name. */
    public static final String ATTR_FIELD_CONTRATOC_CONTRATOCID = "contratoCContratoCID";
    // Field (TipoDireccionC_Codigo)
    /** <code>TipoDireccionC_Codigo</code> field name. */
    public static final String FLD_TIPODIRECCIONTIPODIRECCIONCCODIGO = "TipoDireccionC_Codigo";    
    /** <code>TipoDireccionC.tipoDireccionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPODIRECCIONC_TIPODIRECCIONCODIGO = "tipoDireccionTipoDireccionCCodigo";
    // Field (DepartamentoC_Codigo)
    /** <code>DepartamentoC_Codigo</code> field name. */
    public static final String FLD_DEPARTAMENTODEPARTAMENTOCCODIGO = "DepartamentoC_Codigo";    
    /** <code>DepartamentoC.departamentoCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DEPARTAMENTOC_DEPARTAMENTOCODIGO = "departamentoDepartamentoCCodigo";
    // Field (MunicipioC_Codigo)
    /** <code>MunicipioC_Codigo</code> field name. */
    public static final String FLD_MUNICIPIOMUNICIPIOCCODIGO = "MunicipioC_Codigo";    
    /** <code>MunicipioC.municipioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIOC_MUNICIPIOCODIGO = "municipioMunicipioCCodigo";
    // Field (PaisC_Codigo)
    /** <code>PaisC_Codigo</code> field name. */
    public static final String FLD_PAISPAISCCODIGO = "PaisC_Codigo";    
    /** <code>PaisC_Codigo</code> field length. */
    public static final int FLD_PAISPAISCCODIGOLENGTH = 10;
    /** <code>PaisC.paisCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PAISC_PAISCODIGO = "paisPaisCCodigo";
    // Field (DireccionCompleta)
    /** <code>DireccionCompleta</code> field name. */
    public static final String FLD_DIRECCIONCDIRECCIONCOMPLETA = "DireccionCompleta";    
    /** <code>DireccionCompleta</code> field length. */
    public static final int FLD_DIRECCIONCDIRECCIONCOMPLETALENGTH = 250;
    /** <code>direccionCDireccionCompleta</code> attribute field name. */
    public static final String ATTR_FIELD_DIRECCIONCDIRECCIONCOMPLETA = "direccionCDireccionCompleta";
    // Field (Localidad)
    /** <code>Localidad</code> field name. */
    public static final String FLD_DIRECCIONCLOCALIDAD = "Localidad";    
    /** <code>Localidad</code> field length. */
    public static final int FLD_DIRECCIONCLOCALIDADLENGTH = 50;
    /** <code>direccionCLocalidad</code> attribute field name. */
    public static final String ATTR_FIELD_DIRECCIONCLOCALIDAD = "direccionCLocalidad";

    // Component role (PersonaC)
    /** <code>PersonaC</code> role id. */
    public static final String ROLE_ID_PERSONAC = "Agr_1437649993728848_Alias";
    /** <code>PersonaC</code> role name. */
    public static final String ROLE_NAME_PERSONAC = "personaC";
    /** <code>PersonaC</code> role alias. */
    public static final String ROLE_ALIAS_PERSONAC = "Persona";

    /** <code>PersonaC</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONAC = PersonaCConstants.ROLE_NAME_DIRECCIONESC;
    /** <code>PersonaC</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONAC = "";
    /** <code>PersonaC</code> role target class. */
    public static final String ROLE_TARGET_PERSONAC = PersonaCConstants.CLASS_NAME;

    /** Agents allowed to navigate through PersonaC **/
    public static final String PERSONAC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (ContratoC)
    /** <code>ContratoC</code> role id. */
    public static final String ROLE_ID_CONTRATOC = "Agr_1438686773248892_Alias";
    /** <code>ContratoC</code> role name. */
    public static final String ROLE_NAME_CONTRATOC = "contratoC";
    /** <code>ContratoC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOC = "Contrato";

    /** <code>ContratoC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOC = ContratoCConstants.ROLE_NAME_DIRECCIONESC;
    /** <code>ContratoC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOC = "";
    /** <code>ContratoC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOC = ContratoCConstants.CLASS_NAME;

    /** Agents allowed to navigate through ContratoC **/
    public static final String CONTRATOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TipoDireccionC)
    /** <code>TipoDireccionC</code> role id. */
    public static final String ROLE_ID_TIPODIRECCIONC = "Agr_1473349943296765_Alias";
    /** <code>TipoDireccionC</code> role name. */
    public static final String ROLE_NAME_TIPODIRECCIONC = "tipoDireccionC";
    /** <code>TipoDireccionC</code> role alias. */
    public static final String ROLE_ALIAS_TIPODIRECCIONC = "Tipo dirección";

    /** <code>TipoDireccionC</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPODIRECCIONC = TipoDireccionConstants.ROLE_NAME_DIRECCIONESC;
    /** <code>TipoDireccionC</code> role facet sequence. */
    public static final String PATH_FACETS_TIPODIRECCIONC = "";
    /** <code>TipoDireccionC</code> role target class. */
    public static final String ROLE_TARGET_TIPODIRECCIONC = TipoDireccionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoDireccionC **/
    public static final String TIPODIRECCIONC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (DepartamentoC)
    /** <code>DepartamentoC</code> role id. */
    public static final String ROLE_ID_DEPARTAMENTOC = "Agr_1473350074368213_Alias";
    /** <code>DepartamentoC</code> role name. */
    public static final String ROLE_NAME_DEPARTAMENTOC = "departamentoC";
    /** <code>DepartamentoC</code> role alias. */
    public static final String ROLE_ALIAS_DEPARTAMENTOC = "Departamento";

    /** <code>DepartamentoC</code> inverse role name. */
    public static final String ROLE_INVNAME_DEPARTAMENTOC = DepartamentoConstants.ROLE_NAME_DIRECCIONESC;
    /** <code>DepartamentoC</code> role facet sequence. */
    public static final String PATH_FACETS_DEPARTAMENTOC = "";
    /** <code>DepartamentoC</code> role target class. */
    public static final String ROLE_TARGET_DEPARTAMENTOC = DepartamentoConstants.CLASS_NAME;

    /** Agents allowed to navigate through DepartamentoC **/
    public static final String DEPARTAMENTOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (MunicipioC)
    /** <code>MunicipioC</code> role id. */
    public static final String ROLE_ID_MUNICIPIOC = "Agr_1473350074368283_Alias";
    /** <code>MunicipioC</code> role name. */
    public static final String ROLE_NAME_MUNICIPIOC = "municipioC";
    /** <code>MunicipioC</code> role alias. */
    public static final String ROLE_ALIAS_MUNICIPIOC = "Municipio";

    /** <code>MunicipioC</code> inverse role name. */
    public static final String ROLE_INVNAME_MUNICIPIOC = MunicipioConstants.ROLE_NAME_DIRECCIONESC;
    /** <code>MunicipioC</code> role facet sequence. */
    public static final String PATH_FACETS_MUNICIPIOC = "";
    /** <code>MunicipioC</code> role target class. */
    public static final String ROLE_TARGET_MUNICIPIOC = MunicipioConstants.CLASS_NAME;

    /** Agents allowed to navigate through MunicipioC **/
    public static final String MUNICIPIOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (PaisC)
    /** <code>PaisC</code> role id. */
    public static final String ROLE_ID_PAISC = "Agr_1473350074368543_Alias";
    /** <code>PaisC</code> role name. */
    public static final String ROLE_NAME_PAISC = "paisC";
    /** <code>PaisC</code> role alias. */
    public static final String ROLE_ALIAS_PAISC = "Pais";

    /** <code>PaisC</code> inverse role name. */
    public static final String ROLE_INVNAME_PAISC = PaisConstants.ROLE_NAME_DIRECCIONESC;
    /** <code>PaisC</code> role facet sequence. */
    public static final String PATH_FACETS_PAISC = "";
    /** <code>PaisC</code> role target class. */
    public static final String ROLE_TARGET_PAISC = PaisConstants.CLASS_NAME;

    /** Agents allowed to navigate through PaisC **/
    public static final String PAISC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (TelefonosC)
    /** <code>TelefonosC</code> role id. */
    public static final String ROLE_ID_TELEFONOSC = "Agr_1437649993728997_Alias";
    /** <code>TelefonosC</code> role name. */
    public static final String ROLE_NAME_TELEFONOSC = "telefonosC";
    /** <code>DireccionC</code> role alias. */
    public static final String ROLE_ALIAS_TELEFONOSC = "TelefonosC";


    /** <code>TelefonosC</code> inverse role name. */
    public static final String ROLE_INVNAME_TELEFONOSC = TelefonoCConstants.ROLE_NAME_DIRECCIONC;
    /** <code>TelefonosC</code> role facet sequence. */
    public static final String PATH_FACETS_TELEFONOSC = "";
    /** <code>TelefonosC</code> role target class. */
    public static final String ROLE_TARGET_TELEFONOSC = TelefonoCConstants.CLASS_NAME;
    /** Agents allowed to navigate through TelefonosC **/
    public static final String TELEFONOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432202248192978Ser_13_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear dirección";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCcrearpagrTipoDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCCREARPAGRTIPODIRECCIONC = "p_agrTipoDireccionC";
    /** <code>direccionCcrearpagrTipoDireccionC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCCREARPAGRTIPODIRECCIONC = "Clas_1432202248192978Ser_13Arg_18_Alias";
    /** <code>direccionCcrearpagrTipoDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCCREARPAGRTIPODIRECCIONC = "Tipo dirección";
    /** <code>direccionCcrearpagrDepartamentoC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCCREARPAGRDEPARTAMENTOC = "p_agrDepartamentoC";
    /** <code>direccionCcrearpagrDepartamentoC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCCREARPAGRDEPARTAMENTOC = "Clas_1432202248192978Ser_13Arg_19_Alias";
    /** <code>direccionCcrearpagrDepartamentoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCCREARPAGRDEPARTAMENTOC = "Departamento";
    /** <code>direccionCcrearpagrMunicipioC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCCREARPAGRMUNICIPIOC = "p_agrMunicipioC";
    /** <code>direccionCcrearpagrMunicipioC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCCREARPAGRMUNICIPIOC = "Clas_1432202248192978Ser_13Arg_20_Alias";
    /** <code>direccionCcrearpagrMunicipioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCCREARPAGRMUNICIPIOC = "Municipio";
    /** <code>direccionCcrearpagrPaisC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCCREARPAGRPAISC = "p_agrPaisC";
    /** <code>direccionCcrearpagrPaisC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCCREARPAGRPAISC = "Clas_1432202248192978Ser_13Arg_21_Alias";
    /** <code>direccionCcrearpagrPaisC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCCREARPAGRPAISC = "Pais";
    /** <code>direccionCcrearpagrContratoC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCCREARPAGRCONTRATOC = "p_agrContratoC";
    /** <code>direccionCcrearpagrContratoC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCCREARPAGRCONTRATOC = "Clas_1432202248192978Ser_13Arg_24_Alias";
    /** <code>direccionCcrearpagrContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCCREARPAGRCONTRATOC = "Contrato";
    /** <code>direccionCcrearpagrPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCCREARPAGRPERSONAC = "p_agrPersonaC";
    /** <code>direccionCcrearpagrPersonaC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCCREARPAGRPERSONAC = "Clas_1432202248192978Ser_13Arg_27_Alias";
    /** <code>direccionCcrearpagrPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCCREARPAGRPERSONAC = "Persona";
    /** <code>direccionCcrearpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCCREARPATRDIRECCIONCOMPLETA = "p_atrDireccionCompleta";
    /** <code>direccionCcrearpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCCREARPATRDIRECCIONCOMPLETA = "Clas_1432202248192978Ser_13Arg_6_Alias";
    /** <code>direccionCcrearpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCCREARPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>direccionCcrearpatrLocalidad</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DIRECCIONCCREARPATRLOCALIDAD = "p_atrLocalidad";
    /** <code>direccionCcrearpatrLocalidad</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DIRECCIONCCREARPATRLOCALIDAD = "Clas_1432202248192978Ser_13Arg_7_Alias";
    /** <code>direccionCcrearpatrLocalidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DIRECCIONCCREARPATRLOCALIDAD = "Localidad";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432202248192978Ser_14_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar dirección";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCeliminarpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_DIRECCIONCELIMINARPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCeliminarpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_DIRECCIONCELIMINARPTHISDIRECCIONC = "Clas_1432202248192978Ser_14Arg_1_Alias";
    /** <code>direccionCeliminarpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_DIRECCIONCELIMINARPTHISDIRECCIONC = "Dirección";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1432202248192978Ser_15_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCmodificarpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DIRECCIONCMODIFICARPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCmodificarpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DIRECCIONCMODIFICARPTHISDIRECCIONC = "Clas_1432202248192978Ser_15Arg_1_Alias";
    /** <code>direccionCmodificarpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DIRECCIONCMODIFICARPTHISDIRECCIONC = "Dirección";
    /** <code>direccionCmodificarpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DIRECCIONCMODIFICARPDIRECCIONCOMPLETA = "p_DireccionCompleta";
    /** <code>direccionCmodificarpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DIRECCIONCMODIFICARPDIRECCIONCOMPLETA = "Clas_1432202248192978Ser_15Arg_2_Alias";
    /** <code>direccionCmodificarpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DIRECCIONCMODIFICARPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>direccionCmodificarpLocalidad</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DIRECCIONCMODIFICARPLOCALIDAD = "p_Localidad";
    /** <code>direccionCmodificarpLocalidad</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DIRECCIONCMODIFICARPLOCALIDAD = "Clas_1432202248192978Ser_15Arg_3_Alias";
    /** <code>direccionCmodificarpLocalidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DIRECCIONCMODIFICARPLOCALIDAD = "Localidad";
    // Service (InsTipoDireccionC)
    /** <code>InsTipoDireccionC</code> service id. */
    public static final String SERV_ID_INSTIPODIRECCIONC = "Clas_1432202248192978Ser_28_Alias";
    /** <code>InsTipoDireccionC</code> service name. */
    public static final String SERV_NAME_INSTIPODIRECCIONC = "InsTipoDireccionC";
    /** <code>InsTipoDireccionC</code> service alias. */
    public static final String SERV_ALIAS_INSTIPODIRECCIONC = "InsTipoDireccionC";
    /** Agents allowed to execute the service InsTipoDireccionC **/
    public static final String INSTIPODIRECCIONC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCInsTipoDireccionCpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPODIRECCIONC_DIRECCIONCINSTIPODIRECCIONCPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCInsTipoDireccionCpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPODIRECCIONC_DIRECCIONCINSTIPODIRECCIONCPTHISDIRECCIONC = "Clas_1432202248192978Ser_28Arg_1_Alias";
    /** <code>direccionCInsTipoDireccionCpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPODIRECCIONC_DIRECCIONCINSTIPODIRECCIONCPTHISDIRECCIONC = "Direcciones";
    /** <code>direccionCInsTipoDireccionCpevcTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPODIRECCIONC_DIRECCIONCINSTIPODIRECCIONCPEVCTIPODIRECCION = "p_evcTipoDireccion";
    /** <code>direccionCInsTipoDireccionCpevcTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPODIRECCIONC_DIRECCIONCINSTIPODIRECCIONCPEVCTIPODIRECCION = "Clas_1432202248192978Ser_28Arg_2_Alias";
    /** <code>direccionCInsTipoDireccionCpevcTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPODIRECCIONC_DIRECCIONCINSTIPODIRECCIONCPEVCTIPODIRECCION = "Tipo dirección";
    // Service (DelTipoDireccionC)
    /** <code>DelTipoDireccionC</code> service id. */
    public static final String SERV_ID_DELTIPODIRECCIONC = "Clas_1432202248192978Ser_29_Alias";
    /** <code>DelTipoDireccionC</code> service name. */
    public static final String SERV_NAME_DELTIPODIRECCIONC = "DelTipoDireccionC";
    /** <code>DelTipoDireccionC</code> service alias. */
    public static final String SERV_ALIAS_DELTIPODIRECCIONC = "DelTipoDireccionC";
    /** Agents allowed to execute the service DelTipoDireccionC **/
    public static final String DELTIPODIRECCIONC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCDelTipoDireccionCpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPODIRECCIONC_DIRECCIONCDELTIPODIRECCIONCPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCDelTipoDireccionCpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPODIRECCIONC_DIRECCIONCDELTIPODIRECCIONCPTHISDIRECCIONC = "Clas_1432202248192978Ser_29Arg_1_Alias";
    /** <code>direccionCDelTipoDireccionCpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPODIRECCIONC_DIRECCIONCDELTIPODIRECCIONCPTHISDIRECCIONC = "Direcciones";
    /** <code>direccionCDelTipoDireccionCpevcTipoDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPODIRECCIONC_DIRECCIONCDELTIPODIRECCIONCPEVCTIPODIRECCION = "p_evcTipoDireccion";
    /** <code>direccionCDelTipoDireccionCpevcTipoDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPODIRECCIONC_DIRECCIONCDELTIPODIRECCIONCPEVCTIPODIRECCION = "Clas_1432202248192978Ser_29Arg_2_Alias";
    /** <code>direccionCDelTipoDireccionCpevcTipoDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPODIRECCIONC_DIRECCIONCDELTIPODIRECCIONCPEVCTIPODIRECCION = "Tipo dirección";
    // Service (InsDepartamentoC)
    /** <code>InsDepartamentoC</code> service id. */
    public static final String SERV_ID_INSDEPARTAMENTOC = "Clas_1432202248192978Ser_30_Alias";
    /** <code>InsDepartamentoC</code> service name. */
    public static final String SERV_NAME_INSDEPARTAMENTOC = "InsDepartamentoC";
    /** <code>InsDepartamentoC</code> service alias. */
    public static final String SERV_ALIAS_INSDEPARTAMENTOC = "InsDepartamentoC";
    /** Agents allowed to execute the service InsDepartamentoC **/
    public static final String INSDEPARTAMENTOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCInsDepartamentoCpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTOC_DIRECCIONCINSDEPARTAMENTOCPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCInsDepartamentoCpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTOC_DIRECCIONCINSDEPARTAMENTOCPTHISDIRECCIONC = "Clas_1432202248192978Ser_30Arg_1_Alias";
    /** <code>direccionCInsDepartamentoCpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTOC_DIRECCIONCINSDEPARTAMENTOCPTHISDIRECCIONC = "Direcciones";
    /** <code>direccionCInsDepartamentoCpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_INSDEPARTAMENTOC_DIRECCIONCINSDEPARTAMENTOCPEVCDEPARTAMENTO = "p_evcDepartamento";
    /** <code>direccionCInsDepartamentoCpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_INSDEPARTAMENTOC_DIRECCIONCINSDEPARTAMENTOCPEVCDEPARTAMENTO = "Clas_1432202248192978Ser_30Arg_2_Alias";
    /** <code>direccionCInsDepartamentoCpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDEPARTAMENTOC_DIRECCIONCINSDEPARTAMENTOCPEVCDEPARTAMENTO = "Departamento";
    // Service (DelDepartamentoC)
    /** <code>DelDepartamentoC</code> service id. */
    public static final String SERV_ID_DELDEPARTAMENTOC = "Clas_1432202248192978Ser_31_Alias";
    /** <code>DelDepartamentoC</code> service name. */
    public static final String SERV_NAME_DELDEPARTAMENTOC = "DelDepartamentoC";
    /** <code>DelDepartamentoC</code> service alias. */
    public static final String SERV_ALIAS_DELDEPARTAMENTOC = "DelDepartamentoC";
    /** Agents allowed to execute the service DelDepartamentoC **/
    public static final String DELDEPARTAMENTOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCDelDepartamentoCpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTOC_DIRECCIONCDELDEPARTAMENTOCPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCDelDepartamentoCpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTOC_DIRECCIONCDELDEPARTAMENTOCPTHISDIRECCIONC = "Clas_1432202248192978Ser_31Arg_1_Alias";
    /** <code>direccionCDelDepartamentoCpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTOC_DIRECCIONCDELDEPARTAMENTOCPTHISDIRECCIONC = "Direcciones";
    /** <code>direccionCDelDepartamentoCpevcDepartamento</code> inbound argument name. */
    public static final String ARG_NAME_DELDEPARTAMENTOC_DIRECCIONCDELDEPARTAMENTOCPEVCDEPARTAMENTO = "p_evcDepartamento";
    /** <code>direccionCDelDepartamentoCpevcDepartamento</code> inbound argument id. */
    public static final String ARG_ID_DELDEPARTAMENTOC_DIRECCIONCDELDEPARTAMENTOCPEVCDEPARTAMENTO = "Clas_1432202248192978Ser_31Arg_2_Alias";
    /** <code>direccionCDelDepartamentoCpevcDepartamento</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDEPARTAMENTOC_DIRECCIONCDELDEPARTAMENTOCPEVCDEPARTAMENTO = "Departamento";
    // Service (InsMunicipioC)
    /** <code>InsMunicipioC</code> service id. */
    public static final String SERV_ID_INSMUNICIPIOC = "Clas_1432202248192978Ser_32_Alias";
    /** <code>InsMunicipioC</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIOC = "InsMunicipioC";
    /** <code>InsMunicipioC</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIOC = "InsMunicipioC";
    /** Agents allowed to execute the service InsMunicipioC **/
    public static final String INSMUNICIPIOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCInsMunicipioCpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOC_DIRECCIONCINSMUNICIPIOCPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCInsMunicipioCpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOC_DIRECCIONCINSMUNICIPIOCPTHISDIRECCIONC = "Clas_1432202248192978Ser_32Arg_1_Alias";
    /** <code>direccionCInsMunicipioCpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOC_DIRECCIONCINSMUNICIPIOCPTHISDIRECCIONC = "Direcciones";
    /** <code>direccionCInsMunicipioCpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOC_DIRECCIONCINSMUNICIPIOCPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>direccionCInsMunicipioCpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOC_DIRECCIONCINSMUNICIPIOCPEVCMUNICIPIO = "Clas_1432202248192978Ser_32Arg_2_Alias";
    /** <code>direccionCInsMunicipioCpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOC_DIRECCIONCINSMUNICIPIOCPEVCMUNICIPIO = "Municipio";
    // Service (DelMunicipioC)
    /** <code>DelMunicipioC</code> service id. */
    public static final String SERV_ID_DELMUNICIPIOC = "Clas_1432202248192978Ser_33_Alias";
    /** <code>DelMunicipioC</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIOC = "DelMunicipioC";
    /** <code>DelMunicipioC</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIOC = "DelMunicipioC";
    /** Agents allowed to execute the service DelMunicipioC **/
    public static final String DELMUNICIPIOC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCDelMunicipioCpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOC_DIRECCIONCDELMUNICIPIOCPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCDelMunicipioCpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOC_DIRECCIONCDELMUNICIPIOCPTHISDIRECCIONC = "Clas_1432202248192978Ser_33Arg_1_Alias";
    /** <code>direccionCDelMunicipioCpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOC_DIRECCIONCDELMUNICIPIOCPTHISDIRECCIONC = "Direcciones";
    /** <code>direccionCDelMunicipioCpevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOC_DIRECCIONCDELMUNICIPIOCPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>direccionCDelMunicipioCpevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOC_DIRECCIONCDELMUNICIPIOCPEVCMUNICIPIO = "Clas_1432202248192978Ser_33Arg_2_Alias";
    /** <code>direccionCDelMunicipioCpevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOC_DIRECCIONCDELMUNICIPIOCPEVCMUNICIPIO = "Municipio";
    // Service (InsPaisC)
    /** <code>InsPaisC</code> service id. */
    public static final String SERV_ID_INSPAISC = "Clas_1432202248192978Ser_34_Alias";
    /** <code>InsPaisC</code> service name. */
    public static final String SERV_NAME_INSPAISC = "InsPaisC";
    /** <code>InsPaisC</code> service alias. */
    public static final String SERV_ALIAS_INSPAISC = "InsPaisC";
    /** Agents allowed to execute the service InsPaisC **/
    public static final String INSPAISC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCInsPaisCpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_INSPAISC_DIRECCIONCINSPAISCPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCInsPaisCpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_INSPAISC_DIRECCIONCINSPAISCPTHISDIRECCIONC = "Clas_1432202248192978Ser_34Arg_1_Alias";
    /** <code>direccionCInsPaisCpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPAISC_DIRECCIONCINSPAISCPTHISDIRECCIONC = "Direcciones";
    /** <code>direccionCInsPaisCpevcPais</code> inbound argument name. */
    public static final String ARG_NAME_INSPAISC_DIRECCIONCINSPAISCPEVCPAIS = "p_evcPais";
    /** <code>direccionCInsPaisCpevcPais</code> inbound argument id. */
    public static final String ARG_ID_INSPAISC_DIRECCIONCINSPAISCPEVCPAIS = "Clas_1432202248192978Ser_34Arg_2_Alias";
    /** <code>direccionCInsPaisCpevcPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPAISC_DIRECCIONCINSPAISCPEVCPAIS = "Pais";
    // Service (DelPaisC)
    /** <code>DelPaisC</code> service id. */
    public static final String SERV_ID_DELPAISC = "Clas_1432202248192978Ser_35_Alias";
    /** <code>DelPaisC</code> service name. */
    public static final String SERV_NAME_DELPAISC = "DelPaisC";
    /** <code>DelPaisC</code> service alias. */
    public static final String SERV_ALIAS_DELPAISC = "DelPaisC";
    /** Agents allowed to execute the service DelPaisC **/
    public static final String DELPAISC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCDelPaisCpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_DELPAISC_DIRECCIONCDELPAISCPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCDelPaisCpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_DELPAISC_DIRECCIONCDELPAISCPTHISDIRECCIONC = "Clas_1432202248192978Ser_35Arg_1_Alias";
    /** <code>direccionCDelPaisCpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPAISC_DIRECCIONCDELPAISCPTHISDIRECCIONC = "Direcciones";
    /** <code>direccionCDelPaisCpevcPais</code> inbound argument name. */
    public static final String ARG_NAME_DELPAISC_DIRECCIONCDELPAISCPEVCPAIS = "p_evcPais";
    /** <code>direccionCDelPaisCpevcPais</code> inbound argument id. */
    public static final String ARG_ID_DELPAISC_DIRECCIONCDELPAISCPEVCPAIS = "Clas_1432202248192978Ser_35Arg_2_Alias";
    /** <code>direccionCDelPaisCpevcPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPAISC_DIRECCIONCDELPAISCPEVCPAIS = "Pais";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1432202248192978Ser_24_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar dirección";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCTMODIFICARpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONCTMODIFICARPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCTMODIFICARpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONCTMODIFICARPTHISDIRECCIONC = "Clas_1432202248192978Ser_24Arg_1_Alias";
    /** <code>direccionCTMODIFICARpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONCTMODIFICARPTHISDIRECCIONC = "Dirección";
    /** <code>direccionCTMODIFICARptpDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONCTMODIFICARPTPDIRECCIONCOMPLETA = "pt_p_DireccionCompleta";
    /** <code>direccionCTMODIFICARptpDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONCTMODIFICARPTPDIRECCIONCOMPLETA = "Clas_1432202248192978Ser_24Arg_2_Alias";
    /** <code>direccionCTMODIFICARptpDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONCTMODIFICARPTPDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>direccionCTMODIFICARptpevcDepartamentoC</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCDEPARTAMENTOC = "pt_p_evcDepartamentoC";
    /** <code>direccionCTMODIFICARptpevcDepartamentoC</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCDEPARTAMENTOC = "Clas_1432202248192978Ser_24Arg_3_Alias";
    /** <code>direccionCTMODIFICARptpevcDepartamentoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCDEPARTAMENTOC = "Departamento";
    /** <code>direccionCTMODIFICARptpevcMunicipioC</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCMUNICIPIOC = "pt_p_evcMunicipioC";
    /** <code>direccionCTMODIFICARptpevcMunicipioC</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCMUNICIPIOC = "Clas_1432202248192978Ser_24Arg_4_Alias";
    /** <code>direccionCTMODIFICARptpevcMunicipioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCMUNICIPIOC = "Municipio";
    /** <code>direccionCTMODIFICARptpevcPaisC</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCPAISC = "pt_p_evcPaisC";
    /** <code>direccionCTMODIFICARptpevcPaisC</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCPAISC = "Clas_1432202248192978Ser_24Arg_5_Alias";
    /** <code>direccionCTMODIFICARptpevcPaisC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCPAISC = "País";
    /** <code>direccionCTMODIFICARptpevcTipoDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCTIPODIRECCIONC = "pt_p_evcTipoDireccionC";
    /** <code>direccionCTMODIFICARptpevcTipoDireccionC</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCTIPODIRECCIONC = "Clas_1432202248192978Ser_24Arg_6_Alias";
    /** <code>direccionCTMODIFICARptpevcTipoDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONCTMODIFICARPTPEVCTIPODIRECCIONC = "Tipo Dirección";
    /** <code>direccionCTMODIFICARptpLocalidad</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DIRECCIONCTMODIFICARPTPLOCALIDAD = "pt_p_Localidad";
    /** <code>direccionCTMODIFICARptpLocalidad</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DIRECCIONCTMODIFICARPTPLOCALIDAD = "Clas_1432202248192978Ser_24Arg_7_Alias";
    /** <code>direccionCTMODIFICARptpLocalidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DIRECCIONCTMODIFICARPTPLOCALIDAD = "Localidad";
    // Service (TCREAR)
    /** <code>TCREAR</code> service id. */
    public static final String SERV_ID_TCREAR = "Clas_1432202248192978Ser_26_Alias";
    /** <code>TCREAR</code> service name. */
    public static final String SERV_NAME_TCREAR = "TCREAR";
    /** <code>TCREAR</code> service alias. */
    public static final String SERV_ALIAS_TCREAR = "Crear dirección";
    /** Agents allowed to execute the service TCREAR **/
    public static final String TCREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCTCREARpagrDepartamentoC</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONCTCREARPAGRDEPARTAMENTOC = "p_agrDepartamentoC";
    /** <code>direccionCTCREARpagrDepartamentoC</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONCTCREARPAGRDEPARTAMENTOC = "Clas_1432202248192978Ser_26Arg_1_Alias";
    /** <code>direccionCTCREARpagrDepartamentoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONCTCREARPAGRDEPARTAMENTOC = "Departamento";
    /** <code>direccionCTCREARpagrMunicipioC</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONCTCREARPAGRMUNICIPIOC = "p_agrMunicipioC";
    /** <code>direccionCTCREARpagrMunicipioC</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONCTCREARPAGRMUNICIPIOC = "Clas_1432202248192978Ser_26Arg_2_Alias";
    /** <code>direccionCTCREARpagrMunicipioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONCTCREARPAGRMUNICIPIOC = "Municipio";
    /** <code>direccionCTCREARpagrTipoDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONCTCREARPAGRTIPODIRECCIONC = "p_agrTipoDireccionC";
    /** <code>direccionCTCREARpagrTipoDireccionC</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONCTCREARPAGRTIPODIRECCIONC = "Clas_1432202248192978Ser_26Arg_3_Alias";
    /** <code>direccionCTCREARpagrTipoDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONCTCREARPAGRTIPODIRECCIONC = "Tipo Dirección";
    /** <code>direccionCTCREARpagrPaisC</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONCTCREARPAGRPAISC = "p_agrPaisC";
    /** <code>direccionCTCREARpagrPaisC</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONCTCREARPAGRPAISC = "Clas_1432202248192978Ser_26Arg_4_Alias";
    /** <code>direccionCTCREARpagrPaisC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONCTCREARPAGRPAISC = "País";
    /** <code>direccionCTCREARpagrPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONCTCREARPAGRPERSONAC = "p_agrPersonaC";
    /** <code>direccionCTCREARpagrPersonaC</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONCTCREARPAGRPERSONAC = "Clas_1432202248192978Ser_26Arg_5_Alias";
    /** <code>direccionCTCREARpagrPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONCTCREARPAGRPERSONAC = "Persona";
    /** <code>direccionCTCREARpatrDireccionCompleta</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONCTCREARPATRDIRECCIONCOMPLETA = "p_atrDireccionCompleta";
    /** <code>direccionCTCREARpatrDireccionCompleta</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONCTCREARPATRDIRECCIONCOMPLETA = "Clas_1432202248192978Ser_26Arg_6_Alias";
    /** <code>direccionCTCREARpatrDireccionCompleta</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONCTCREARPATRDIRECCIONCOMPLETA = "Dirección completa";
    /** <code>direccionCTCREARpatrLocalidad</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONCTCREARPATRLOCALIDAD = "p_atrLocalidad";
    /** <code>direccionCTCREARpatrLocalidad</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONCTCREARPATRLOCALIDAD = "Clas_1432202248192978Ser_26Arg_7_Alias";
    /** <code>direccionCTCREARpatrLocalidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONCTCREARPATRLOCALIDAD = "Localidad";
    /** <code>direccionCTCREARpTelefonoFijo</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONCTCREARPTELEFONOFIJO = "pTelefonoFijo";
    /** <code>direccionCTCREARpTelefonoFijo</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONCTCREARPTELEFONOFIJO = "Clas_1432202248192978Ser_26Arg_8_Alias";
    /** <code>direccionCTCREARpTelefonoFijo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONCTCREARPTELEFONOFIJO = "Teléfono";
    /** <code>direccionCTCREARpTelefonoCelular</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONCTCREARPTELEFONOCELULAR = "pTelefonoCelular";
    /** <code>direccionCTCREARpTelefonoCelular</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONCTCREARPTELEFONOCELULAR = "Clas_1432202248192978Ser_26Arg_9_Alias";
    /** <code>direccionCTCREARpTelefonoCelular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONCTCREARPTELEFONOCELULAR = "Celular";
    /** <code>direccionCTCREARpagrContratoC</code> inbound argument name. */
    public static final String ARG_NAME_TCREAR_DIRECCIONCTCREARPAGRCONTRATOC = "p_agrContratoC";
    /** <code>direccionCTCREARpagrContratoC</code> inbound argument id. */
    public static final String ARG_ID_TCREAR_DIRECCIONCTCREARPAGRCONTRATOC = "Clas_1432202248192978Ser_26Arg_156_Alias";
    /** <code>direccionCTCREARpagrContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREAR_DIRECCIONCTCREARPAGRCONTRATOC = "Contrato";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1432202248192978Ser_27_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar dirección";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>direccionCTELIMINARpthisDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_DIRECCIONCTELIMINARPTHISDIRECCIONC = "p_thisDireccionC";
    /** <code>direccionCTELIMINARpthisDireccionC</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_DIRECCIONCTELIMINARPTHISDIRECCIONC = "Clas_1432202248192978Ser_27Arg_1_Alias";
    /** <code>direccionCTELIMINARpthisDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_DIRECCIONCTELIMINARPTHISDIRECCIONC = "Dirección";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_DIRECCIONCDIRECCIONCOMPLETA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DIRECCIONCLOCALIDAD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DIRECCIONCDRVCIUDAD.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DIRECCIONCDRVTIENEDEPARTAMENTO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DIRECCIONCDRVTIENEMUNICIPIO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_DIRECCIONCCODIGO.toUpperCase(), DIRECCIONCCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DIRECCIONCDIRECCIONCOMPLETA.toUpperCase(), DIRECCIONCDIRECCIONCOMPLETA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DIRECCIONCLOCALIDAD.toUpperCase(), DIRECCIONCLOCALIDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_DIRECCIONCDRVCIUDAD.toUpperCase(), DIRECCIONCDRVCIUDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_DIRECCIONCDRVTIENEDEPARTAMENTO.toUpperCase(), DIRECCIONCDRVTIENEDEPARTAMENTO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DIRECCIONCDRVTIENEMUNICIPIO.toUpperCase(), DIRECCIONCDRVTIENEMUNICIPIO_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PERSONAC.toUpperCase(), PERSONAC_AGENTS);
        roleAgents.put(ROLE_NAME_CONTRATOC.toUpperCase(), CONTRATOC_AGENTS);
        roleAgents.put(ROLE_NAME_TIPODIRECCIONC.toUpperCase(), TIPODIRECCIONC_AGENTS);
        roleAgents.put(ROLE_NAME_DEPARTAMENTOC.toUpperCase(), DEPARTAMENTOC_AGENTS);
        roleAgents.put(ROLE_NAME_MUNICIPIOC.toUpperCase(), MUNICIPIOC_AGENTS);
        roleAgents.put(ROLE_NAME_PAISC.toUpperCase(), PAISC_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'DireccionC', it returns the identification keys
     * - If className is a facet of the inheritance net of 'DireccionC', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_DIRECCIONCCODIGO);
        }
        // Facet 'DireccionC' (This facet)
        if (DireccionCConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_DIRECCIONCCODIGO);
        }
        return returnList;
    }
}
