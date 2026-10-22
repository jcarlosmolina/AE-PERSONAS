package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>FamiliaC</code> model class.
 */
public final class FamiliaCConstants {

    private FamiliaCConstants() {

    }

    // Class
    /** <code>FamiliaC</code> class id. */
    public static final String CLASS_ID = "Clas_1433842221056429_Alias";
    /** <code>FamiliaC</code> class name. */
    public static final String CLASS_NAME = "FamiliaC";
    /** <code>FamiliaC</code> class alias. */
    public static final String CLASS_ALIAS = "Familia";
    /** <code>FamiliaC</code> class table name. */
    public static final String TBL_NAME = "FamiliaC";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "contratoCContratoCID,familiaCID,municipioCodigo,familiaCNumFamilia,familiaCTitularConBeneficios,familiaCEstadoTitularFamilia,familiaCFechaFinVigencia,familiaCdireccionCorrespondencia";

    

    // Attribute (familiaCID)
    /** <code>familiaCID</code> attribute id. */
    public static final String ATTR_ID_FAMILIACID = "Clas_1433842221056429Atr_11_Alias";
    /** <code>familiaCID</code> attribute name. */
    public static final String ATTR_NAME_FAMILIACID = "familiaCID";
    /** <code>familiaCID</code> attribute alias. */
    public static final String ATTR_ALIAS_FAMILIACID = "ID interno";

    /** <code>familiaCID</code> attribute facet sequence. */
    public static final String PATH_FACETS_FAMILIACID = "";
    /** Agents allowed to view the attribute familiaCID **/
    public static final String FAMILIACID_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (familiaCNumFamilia)
    /** <code>familiaCNumFamilia</code> attribute id. */
    public static final String ATTR_ID_FAMILIACNUMFAMILIA = "Clas_1433842221056429Atr_6_Alias";
    /** <code>familiaCNumFamilia</code> attribute name. */
    public static final String ATTR_NAME_FAMILIACNUMFAMILIA = "familiaCNumFamilia";
    /** <code>familiaCNumFamilia</code> attribute alias. */
    public static final String ATTR_ALIAS_FAMILIACNUMFAMILIA = "Nº familia";

    /** <code>familiaCNumFamilia</code> attribute facet sequence. */
    public static final String PATH_FACETS_FAMILIACNUMFAMILIA = "";
    /** Agents allowed to view the attribute familiaCNumFamilia **/
    public static final String FAMILIACNUMFAMILIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (familiaCTitularConBeneficios)
    /** <code>familiaCTitularConBeneficios</code> attribute id. */
    public static final String ATTR_ID_FAMILIACTITULARCONBENEFICIOS = "Clas_1433842221056429Atr_7_Alias";
    /** <code>familiaCTitularConBeneficios</code> attribute name. */
    public static final String ATTR_NAME_FAMILIACTITULARCONBENEFICIOS = "familiaCTitularConBeneficios";
    /** <code>familiaCTitularConBeneficios</code> attribute alias. */
    public static final String ATTR_ALIAS_FAMILIACTITULARCONBENEFICIOS = "Titular con beneficios";

    /** <code>familiaCTitularConBeneficios</code> attribute facet sequence. */
    public static final String PATH_FACETS_FAMILIACTITULARCONBENEFICIOS = "";
    /** Agents allowed to view the attribute familiaCTitularConBeneficios **/
    public static final String FAMILIACTITULARCONBENEFICIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (familiaCEstadoTitularFamilia)
    /** <code>familiaCEstadoTitularFamilia</code> attribute id. */
    public static final String ATTR_ID_FAMILIACESTADOTITULARFAMILIA = "Clas_1433842221056429Atr_8_Alias";
    /** <code>familiaCEstadoTitularFamilia</code> attribute name. */
    public static final String ATTR_NAME_FAMILIACESTADOTITULARFAMILIA = "familiaCEstadoTitularFamilia";
    /** <code>familiaCEstadoTitularFamilia</code> attribute alias. */
    public static final String ATTR_ALIAS_FAMILIACESTADOTITULARFAMILIA = "Estado titular familia";

    /** <code>familiaCEstadoTitularFamilia</code> attribute facet sequence. */
    public static final String PATH_FACETS_FAMILIACESTADOTITULARFAMILIA = "";
    /** Agents allowed to view the attribute familiaCEstadoTitularFamilia **/
    public static final String FAMILIACESTADOTITULARFAMILIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (familiaCFechaFinVigencia)
    /** <code>familiaCFechaFinVigencia</code> attribute id. */
    public static final String ATTR_ID_FAMILIACFECHAFINVIGENCIA = "Clas_1433842221056429Atr_9_Alias";
    /** <code>familiaCFechaFinVigencia</code> attribute name. */
    public static final String ATTR_NAME_FAMILIACFECHAFINVIGENCIA = "familiaCFechaFinVigencia";
    /** <code>familiaCFechaFinVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_FAMILIACFECHAFINVIGENCIA = "Fecha fin vigencia";

    /** <code>familiaCFechaFinVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_FAMILIACFECHAFINVIGENCIA = "";
    /** Agents allowed to view the attribute familiaCFechaFinVigencia **/
    public static final String FAMILIACFECHAFINVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (familiaCdireccionCorrespondencia)
    /** <code>familiaCdireccionCorrespondencia</code> attribute id. */
    public static final String ATTR_ID_FAMILIACDIRECCIONCORRESPONDENCIA = "Clas_1433842221056429Atr_10_Alias";
    /** <code>familiaCdireccionCorrespondencia</code> attribute name. */
    public static final String ATTR_NAME_FAMILIACDIRECCIONCORRESPONDENCIA = "familiaCdireccionCorrespondencia";
    /** <code>familiaCdireccionCorrespondencia</code> attribute alias. */
    public static final String ATTR_ALIAS_FAMILIACDIRECCIONCORRESPONDENCIA = "Dirección";

    /** <code>familiaCdireccionCorrespondencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_FAMILIACDIRECCIONCORRESPONDENCIA = "";
    /** Agents allowed to view the attribute familiaCdireccionCorrespondencia **/
    public static final String FAMILIACDIRECCIONCORRESPONDENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Attribute (ContratoC.contratoCID)
    /** <code>ContratoC.contratoCID</code> identification attribute name. */
    public static final String ATTR_NAME_CONTRATOC_CONTRATOCID = "contratoC.contratoCID";

    // Field (ContratoC_ID)
    /** <code>ContratoC_ID</code> field name. */
    public static final String FLD_CONTRATOCCONTRATOCID = "ContratoC_ID";    
    /** <code>ContratoC.contratoCID</code> attribute field name. */
    public static final String ATTR_FIELD_CONTRATOC_CONTRATOCID = "contratoCContratoCID";
    // Field (ID)
    /** <code>ID</code> field name. */
    public static final String FLD_FAMILIACID = "ID";    
    /** <code>familiaCID</code> attribute field name. */
    public static final String ATTR_FIELD_FAMILIACID = "familiaCID";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_MUNICIPIOCODIGO = "Codigo";    
    /** <code>MunicipioC.municipioCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_MUNICIPIOC_MUNICIPIOCODIGO = "municipioCodigo";
    // Field (NumFamilia)
    /** <code>NumFamilia</code> field name. */
    public static final String FLD_FAMILIACNUMFAMILIA = "NumFamilia";    
    /** <code>NumFamilia</code> field length. */
    public static final int FLD_FAMILIACNUMFAMILIALENGTH = 20;
    /** <code>familiaCNumFamilia</code> attribute field name. */
    public static final String ATTR_FIELD_FAMILIACNUMFAMILIA = "familiaCNumFamilia";
    // Field (TitularConBeneficios)
    /** <code>TitularConBeneficios</code> field name. */
    public static final String FLD_FAMILIACTITULARCONBENEFICIOS = "TitularConBeneficios";    
    /** <code>familiaCTitularConBeneficios</code> attribute field name. */
    public static final String ATTR_FIELD_FAMILIACTITULARCONBENEFICIOS = "familiaCTitularConBeneficios";
    // Field (EstadoTitularFamilia)
    /** <code>EstadoTitularFamilia</code> field name. */
    public static final String FLD_FAMILIACESTADOTITULARFAMILIA = "EstadoTitularFamilia";    
    /** <code>EstadoTitularFamilia</code> field length. */
    public static final int FLD_FAMILIACESTADOTITULARFAMILIALENGTH = 10;
    /** <code>familiaCEstadoTitularFamilia</code> attribute field name. */
    public static final String ATTR_FIELD_FAMILIACESTADOTITULARFAMILIA = "familiaCEstadoTitularFamilia";
    // Field (FechaFinVigencia)
    /** <code>FechaFinVigencia</code> field name. */
    public static final String FLD_FAMILIACFECHAFINVIGENCIA = "FechaFinVigencia";    
    /** <code>familiaCFechaFinVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_FAMILIACFECHAFINVIGENCIA = "familiaCFechaFinVigencia";
    // Field (direccionCorrespondencia)
    /** <code>direccionCorrespondencia</code> field name. */
    public static final String FLD_FAMILIACDIRECCIONCORRESPONDENCIA = "direccionCorrespondencia";    
    /** <code>direccionCorrespondencia</code> field length. */
    public static final int FLD_FAMILIACDIRECCIONCORRESPONDENCIALENGTH = 255;
    /** <code>familiaCdireccionCorrespondencia</code> attribute field name. */
    public static final String ATTR_FIELD_FAMILIACDIRECCIONCORRESPONDENCIA = "familiaCdireccionCorrespondencia";

    // Component role (ContratoC)
    /** <code>ContratoC</code> role id. */
    public static final String ROLE_ID_CONTRATOC = "Agr_1437649993728599_Alias";
    /** <code>ContratoC</code> role name. */
    public static final String ROLE_NAME_CONTRATOC = "contratoC";
    /** <code>ContratoC</code> role alias. */
    public static final String ROLE_ALIAS_CONTRATOC = "Contrato";

    /** <code>ContratoC</code> inverse role name. */
    public static final String ROLE_INVNAME_CONTRATOC = ContratoCConstants.ROLE_NAME_FAMILIASC;
    /** <code>ContratoC</code> role facet sequence. */
    public static final String PATH_FACETS_CONTRATOC = "";
    /** <code>ContratoC</code> role target class. */
    public static final String ROLE_TARGET_CONTRATOC = ContratoCConstants.CLASS_NAME;

    /** Agents allowed to navigate through ContratoC **/
    public static final String CONTRATOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (MunicipioC)
    /** <code>MunicipioC</code> role id. */
    public static final String ROLE_ID_MUNICIPIOC = "Agr_1473350729728168_Alias";
    /** <code>MunicipioC</code> role name. */
    public static final String ROLE_NAME_MUNICIPIOC = "municipioC";
    /** <code>MunicipioC</code> role alias. */
    public static final String ROLE_ALIAS_MUNICIPIOC = "MunicipioC";

    /** <code>MunicipioC</code> inverse role name. */
    public static final String ROLE_INVNAME_MUNICIPIOC = MunicipioConstants.ROLE_NAME_FAMILIAC;
    /** <code>MunicipioC</code> role facet sequence. */
    public static final String PATH_FACETS_MUNICIPIOC = "";
    /** <code>MunicipioC</code> role target class. */
    public static final String ROLE_TARGET_MUNICIPIOC = MunicipioConstants.CLASS_NAME;

    /** Agents allowed to navigate through MunicipioC **/
    public static final String MUNICIPIOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Compound role (PersonaCTitular)
    /** <code>PersonaCTitular</code> role id. */
    public static final String ROLE_ID_PERSONACTITULAR = "Agr_1437649993728411_Alias";
    /** <code>PersonaCTitular</code> role name. */
    public static final String ROLE_NAME_PERSONACTITULAR = "personaCTitular";
    /** <code>FamiliasC</code> role alias. */
    public static final String ROLE_ALIAS_PERSONACTITULAR = "Titular";


    /** <code>PersonaCTitular</code> inverse role name. */
    public static final String ROLE_INVNAME_PERSONACTITULAR = PersonaCConstants.ROLE_NAME_FAMILIASC;
    /** <code>PersonaCTitular</code> role facet sequence. */
    public static final String PATH_FACETS_PERSONACTITULAR = "";
    /** <code>PersonaCTitular</code> role target class. */
    public static final String ROLE_TARGET_PERSONACTITULAR = PersonaCConstants.CLASS_NAME;
    /** Agents allowed to navigate through PersonaCTitular **/
    public static final String PERSONACTITULAR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (BeneficiariosC)
    /** <code>BeneficiariosC</code> role id. */
    public static final String ROLE_ID_BENEFICIARIOSC = "Agr_1437649993728202_Alias";
    /** <code>BeneficiariosC</code> role name. */
    public static final String ROLE_NAME_BENEFICIARIOSC = "beneficiariosC";
    /** <code>FamiliasC</code> role alias. */
    public static final String ROLE_ALIAS_BENEFICIARIOSC = "Beneficiarios";


    /** <code>BeneficiariosC</code> inverse role name. */
    public static final String ROLE_INVNAME_BENEFICIARIOSC = BeneficiarioCConstants.ROLE_NAME_FAMILIASC;
    /** <code>BeneficiariosC</code> role facet sequence. */
    public static final String PATH_FACETS_BENEFICIARIOSC = "";
    /** <code>BeneficiariosC</code> role target class. */
    public static final String ROLE_TARGET_BENEFICIARIOSC = BeneficiarioCConstants.CLASS_NAME;
    /** Agents allowed to navigate through BeneficiariosC **/
    public static final String BENEFICIARIOSC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1433842221056429Ser_10_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear familia";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCcrearpagrPersonaCTitular</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FAMILIACCREARPAGRPERSONACTITULAR = "p_agrPersonaCTitular";
    /** <code>familiaCcrearpagrPersonaCTitular</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FAMILIACCREARPAGRPERSONACTITULAR = "Clas_1433842221056429Ser_10Arg_1_Alias";
    /** <code>familiaCcrearpagrPersonaCTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FAMILIACCREARPAGRPERSONACTITULAR = "Titular";
    /** <code>familiaCcrearpagrContratoC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FAMILIACCREARPAGRCONTRATOC = "p_agrContratoC";
    /** <code>familiaCcrearpagrContratoC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FAMILIACCREARPAGRCONTRATOC = "Clas_1433842221056429Ser_10Arg_19_Alias";
    /** <code>familiaCcrearpagrContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FAMILIACCREARPAGRCONTRATOC = "Contrato";
    /** <code>familiaCcrearpagrMunicipioC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FAMILIACCREARPAGRMUNICIPIOC = "p_agrMunicipioC";
    /** <code>familiaCcrearpagrMunicipioC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FAMILIACCREARPAGRMUNICIPIOC = "Clas_1433842221056429Ser_10Arg_20_Alias";
    /** <code>familiaCcrearpagrMunicipioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FAMILIACCREARPAGRMUNICIPIOC = "MunicipioC";
    /** <code>familiaCcrearpatrTitularConBeneficios</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FAMILIACCREARPATRTITULARCONBENEFICIOS = "p_atrTitularConBeneficios";
    /** <code>familiaCcrearpatrTitularConBeneficios</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FAMILIACCREARPATRTITULARCONBENEFICIOS = "Clas_1433842221056429Ser_10Arg_4_Alias";
    /** <code>familiaCcrearpatrTitularConBeneficios</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FAMILIACCREARPATRTITULARCONBENEFICIOS = "Titular con beneficios";
    /** <code>familiaCcrearpatrdireccionCorrespondencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FAMILIACCREARPATRDIRECCIONCORRESPONDENCIA = "p_atrdireccionCorrespondencia";
    /** <code>familiaCcrearpatrdireccionCorrespondencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FAMILIACCREARPATRDIRECCIONCORRESPONDENCIA = "Clas_1433842221056429Ser_10Arg_5_Alias";
    /** <code>familiaCcrearpatrdireccionCorrespondencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FAMILIACCREARPATRDIRECCIONCORRESPONDENCIA = "Dirección";
    /** <code>familiaCcrearpatrEstadoTitularFamilia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FAMILIACCREARPATRESTADOTITULARFAMILIA = "p_atrEstadoTitularFamilia";
    /** <code>familiaCcrearpatrEstadoTitularFamilia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FAMILIACCREARPATRESTADOTITULARFAMILIA = "Clas_1433842221056429Ser_10Arg_7_Alias";
    /** <code>familiaCcrearpatrEstadoTitularFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FAMILIACCREARPATRESTADOTITULARFAMILIA = "Estado titular familia";
    /** <code>familiaCcrearpatrFechaFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FAMILIACCREARPATRFECHAFINVIGENCIA = "p_atrFechaFinVigencia";
    /** <code>familiaCcrearpatrFechaFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FAMILIACCREARPATRFECHAFINVIGENCIA = "Clas_1433842221056429Ser_10Arg_8_Alias";
    /** <code>familiaCcrearpatrFechaFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FAMILIACCREARPATRFECHAFINVIGENCIA = "Fecha fin vigencia";
    /** <code>familiaCcrearpatrNumFamilia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_FAMILIACCREARPATRNUMFAMILIA = "p_atrNumFamilia";
    /** <code>familiaCcrearpatrNumFamilia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_FAMILIACCREARPATRNUMFAMILIA = "Clas_1433842221056429Ser_10Arg_9_Alias";
    /** <code>familiaCcrearpatrNumFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FAMILIACCREARPATRNUMFAMILIA = "Nº familia";
    // Outbound arguments
    /** <code>familiaCcrearpsFamiliaCreada</code> outbound argument name. */
    public static final String ARG_NAME_CREAR_FAMILIACCREARPSFAMILIACREADA = "familiaCcrearpsFamiliaCreada";
    /** <code>familiaCcrearpsFamiliaCreada</code> outbound argument id. */
    public static final String ARG_ID_CREAR_FAMILIACCREARPSFAMILIACREADA = "Clas_1433842221056429Ser_10Arg_6_Alias";
    /** <code>familiaCcrearpsFamiliaCreada</code> outbound argument alias. */
    public static final String ARG_ALIAS_CREAR_FAMILIACCREARPSFAMILIACREADA = "Familia";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1433842221056429Ser_11_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCeliminarpthisFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_FAMILIACELIMINARPTHISFAMILIAC = "p_thisFamiliaC";
    /** <code>familiaCeliminarpthisFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_FAMILIACELIMINARPTHISFAMILIAC = "Clas_1433842221056429Ser_11Arg_1_Alias";
    /** <code>familiaCeliminarpthisFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_FAMILIACELIMINARPTHISFAMILIAC = "Familia";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1433842221056429Ser_14_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar familia";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCmodificarpthisFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FAMILIACMODIFICARPTHISFAMILIAC = "p_thisFamiliaC";
    /** <code>familiaCmodificarpthisFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FAMILIACMODIFICARPTHISFAMILIAC = "Clas_1433842221056429Ser_14Arg_1_Alias";
    /** <code>familiaCmodificarpthisFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FAMILIACMODIFICARPTHISFAMILIAC = "Familia";
    /** <code>familiaCmodificarpEstadoTitularFamilia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FAMILIACMODIFICARPESTADOTITULARFAMILIA = "p_EstadoTitularFamilia";
    /** <code>familiaCmodificarpEstadoTitularFamilia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FAMILIACMODIFICARPESTADOTITULARFAMILIA = "Clas_1433842221056429Ser_14Arg_2_Alias";
    /** <code>familiaCmodificarpEstadoTitularFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FAMILIACMODIFICARPESTADOTITULARFAMILIA = "Estado titular familia";
    /** <code>familiaCmodificarpFechaFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FAMILIACMODIFICARPFECHAFINVIGENCIA = "p_FechaFinVigencia";
    /** <code>familiaCmodificarpFechaFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FAMILIACMODIFICARPFECHAFINVIGENCIA = "Clas_1433842221056429Ser_14Arg_3_Alias";
    /** <code>familiaCmodificarpFechaFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FAMILIACMODIFICARPFECHAFINVIGENCIA = "Fecha fin vigencia";
    /** <code>familiaCmodificarpdireccionCorrespondencia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FAMILIACMODIFICARPDIRECCIONCORRESPONDENCIA = "p_direccionCorrespondencia";
    /** <code>familiaCmodificarpdireccionCorrespondencia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FAMILIACMODIFICARPDIRECCIONCORRESPONDENCIA = "Clas_1433842221056429Ser_14Arg_4_Alias";
    /** <code>familiaCmodificarpdireccionCorrespondencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FAMILIACMODIFICARPDIRECCIONCORRESPONDENCIA = "Dirección";
    /** <code>familiaCmodificarpNumFamilia</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FAMILIACMODIFICARPNUMFAMILIA = "p_NumFamilia";
    /** <code>familiaCmodificarpNumFamilia</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FAMILIACMODIFICARPNUMFAMILIA = "Clas_1433842221056429Ser_14Arg_5_Alias";
    /** <code>familiaCmodificarpNumFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FAMILIACMODIFICARPNUMFAMILIA = "Nº familia";
    /** <code>familiaCmodificarpTitularConBeneficios</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_FAMILIACMODIFICARPTITULARCONBENEFICIOS = "p_TitularConBeneficios";
    /** <code>familiaCmodificarpTitularConBeneficios</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_FAMILIACMODIFICARPTITULARCONBENEFICIOS = "Clas_1433842221056429Ser_14Arg_6_Alias";
    /** <code>familiaCmodificarpTitularConBeneficios</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_FAMILIACMODIFICARPTITULARCONBENEFICIOS = "Titular con beneficios";
    // Service (InsPersonaCTitular)
    /** <code>InsPersonaCTitular</code> service id. */
    public static final String SERV_ID_INSPERSONACTITULAR = "Clas_1433842221056429Ser_15_Alias";
    /** <code>InsPersonaCTitular</code> service name. */
    public static final String SERV_NAME_INSPERSONACTITULAR = "InsPersonaCTitular";
    /** <code>InsPersonaCTitular</code> service alias. */
    public static final String SERV_ALIAS_INSPERSONACTITULAR = "InsPersonaCTitular";
    /** Agents allowed to execute the service InsPersonaCTitular **/
    public static final String INSPERSONACTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCInsPersonaCTitularpthisFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_INSPERSONACTITULAR_FAMILIACINSPERSONACTITULARPTHISFAMILIAC = "p_thisFamiliaC";
    /** <code>familiaCInsPersonaCTitularpthisFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_INSPERSONACTITULAR_FAMILIACINSPERSONACTITULARPTHISFAMILIAC = "Clas_1433842221056429Ser_15Arg_1_Alias";
    /** <code>familiaCInsPersonaCTitularpthisFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERSONACTITULAR_FAMILIACINSPERSONACTITULARPTHISFAMILIAC = "Familias";
    /** <code>familiaCInsPersonaCTitularpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_INSPERSONACTITULAR_FAMILIACINSPERSONACTITULARPEVCPERSONAC = "p_evcPersonaC";
    /** <code>familiaCInsPersonaCTitularpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_INSPERSONACTITULAR_FAMILIACINSPERSONACTITULARPEVCPERSONAC = "Clas_1433842221056429Ser_15Arg_2_Alias";
    /** <code>familiaCInsPersonaCTitularpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERSONACTITULAR_FAMILIACINSPERSONACTITULARPEVCPERSONAC = "Titular";
    // Service (DelPersonaCTitular)
    /** <code>DelPersonaCTitular</code> service id. */
    public static final String SERV_ID_DELPERSONACTITULAR = "Clas_1433842221056429Ser_20_Alias";
    /** <code>DelPersonaCTitular</code> service name. */
    public static final String SERV_NAME_DELPERSONACTITULAR = "DelPersonaCTitular";
    /** <code>DelPersonaCTitular</code> service alias. */
    public static final String SERV_ALIAS_DELPERSONACTITULAR = "DelPersonaCTitular";
    /** Agents allowed to execute the service DelPersonaCTitular **/
    public static final String DELPERSONACTITULAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCDelPersonaCTitularpthisFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_DELPERSONACTITULAR_FAMILIACDELPERSONACTITULARPTHISFAMILIAC = "p_thisFamiliaC";
    /** <code>familiaCDelPersonaCTitularpthisFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_DELPERSONACTITULAR_FAMILIACDELPERSONACTITULARPTHISFAMILIAC = "Clas_1433842221056429Ser_20Arg_1_Alias";
    /** <code>familiaCDelPersonaCTitularpthisFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERSONACTITULAR_FAMILIACDELPERSONACTITULARPTHISFAMILIAC = "Familias";
    /** <code>familiaCDelPersonaCTitularpevcPersonaC</code> inbound argument name. */
    public static final String ARG_NAME_DELPERSONACTITULAR_FAMILIACDELPERSONACTITULARPEVCPERSONAC = "p_evcPersonaC";
    /** <code>familiaCDelPersonaCTitularpevcPersonaC</code> inbound argument id. */
    public static final String ARG_ID_DELPERSONACTITULAR_FAMILIACDELPERSONACTITULARPEVCPERSONAC = "Clas_1433842221056429Ser_20Arg_2_Alias";
    /** <code>familiaCDelPersonaCTitularpevcPersonaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERSONACTITULAR_FAMILIACDELPERSONACTITULARPEVCPERSONAC = "Titular";
    // Service (evalPostNotiCrear)
    /** <code>evalPostNotiCrear</code> service id. */
    public static final String SERV_ID_EVALPOSTNOTICREAR = "Clas_1433842221056429Ser_22_Alias";
    /** <code>evalPostNotiCrear</code> service name. */
    public static final String SERV_NAME_EVALPOSTNOTICREAR = "evalPostNotiCrear";
    /** <code>evalPostNotiCrear</code> service alias. */
    public static final String SERV_ALIAS_EVALPOSTNOTICREAR = "evalPostNotiCrear";
    /** Agents allowed to execute the service evalPostNotiCrear **/
    public static final String EVALPOSTNOTICREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCevalPostNotiCrearpthisFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPTHISFAMILIAC = "p_thisFamiliaC";
    /** <code>familiaCevalPostNotiCrearpthisFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPTHISFAMILIAC = "Clas_1433842221056429Ser_22Arg_1_Alias";
    /** <code>familiaCevalPostNotiCrearpthisFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPTHISFAMILIAC = "Familia";
    /** <code>familiaCevalPostNotiCrearpeNumFamilia</code> inbound argument name. */
    public static final String ARG_NAME_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPENUMFAMILIA = "peNumFamilia";
    /** <code>familiaCevalPostNotiCrearpeNumFamilia</code> inbound argument id. */
    public static final String ARG_ID_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPENUMFAMILIA = "Clas_1433842221056429Ser_22Arg_2_Alias";
    /** <code>familiaCevalPostNotiCrearpeNumFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPENUMFAMILIA = "Nº familia";
    /** <code>familiaCevalPostNotiCrearpeFechaFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPEFECHAFINVIGENCIA = "peFechaFinVigencia";
    /** <code>familiaCevalPostNotiCrearpeFechaFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPEFECHAFINVIGENCIA = "Clas_1433842221056429Ser_22Arg_3_Alias";
    /** <code>familiaCevalPostNotiCrearpeFechaFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPEFECHAFINVIGENCIA = "Fecha fin vigencia";
    /** <code>familiaCevalPostNotiCrearpeDirCorresp</code> inbound argument name. */
    public static final String ARG_NAME_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPEDIRCORRESP = "peDirCorresp";
    /** <code>familiaCevalPostNotiCrearpeDirCorresp</code> inbound argument id. */
    public static final String ARG_ID_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPEDIRCORRESP = "Clas_1433842221056429Ser_22Arg_4_Alias";
    /** <code>familiaCevalPostNotiCrearpeDirCorresp</code> inbound argument alias. */
    public static final String ARG_ALIAS_EVALPOSTNOTICREAR_FAMILIACEVALPOSTNOTICREARPEDIRCORRESP = "Dirección";
    // Service (InsMunicipioFamilia)
    /** <code>InsMunicipioFamilia</code> service id. */
    public static final String SERV_ID_INSMUNICIPIOFAMILIA = "Clas_1433842221056429Ser_25_Alias";
    /** <code>InsMunicipioFamilia</code> service name. */
    public static final String SERV_NAME_INSMUNICIPIOFAMILIA = "InsMunicipioFamilia";
    /** <code>InsMunicipioFamilia</code> service alias. */
    public static final String SERV_ALIAS_INSMUNICIPIOFAMILIA = "InsMunicipioFamilia";
    /** Agents allowed to execute the service InsMunicipioFamilia **/
    public static final String INSMUNICIPIOFAMILIA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCInsMunicipioFamiliapthisFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOFAMILIA_FAMILIACINSMUNICIPIOFAMILIAPTHISFAMILIAC = "p_thisFamiliaC";
    /** <code>familiaCInsMunicipioFamiliapthisFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOFAMILIA_FAMILIACINSMUNICIPIOFAMILIAPTHISFAMILIAC = "Clas_1433842221056429Ser_25Arg_1_Alias";
    /** <code>familiaCInsMunicipioFamiliapthisFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOFAMILIA_FAMILIACINSMUNICIPIOFAMILIAPTHISFAMILIAC = "FamiliaC";
    /** <code>familiaCInsMunicipioFamiliapevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_INSMUNICIPIOFAMILIA_FAMILIACINSMUNICIPIOFAMILIAPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>familiaCInsMunicipioFamiliapevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_INSMUNICIPIOFAMILIA_FAMILIACINSMUNICIPIOFAMILIAPEVCMUNICIPIO = "Clas_1433842221056429Ser_25Arg_2_Alias";
    /** <code>familiaCInsMunicipioFamiliapevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSMUNICIPIOFAMILIA_FAMILIACINSMUNICIPIOFAMILIAPEVCMUNICIPIO = "MunicipioC";
    // Service (DelMunicipioFamilia)
    /** <code>DelMunicipioFamilia</code> service id. */
    public static final String SERV_ID_DELMUNICIPIOFAMILIA = "Clas_1433842221056429Ser_26_Alias";
    /** <code>DelMunicipioFamilia</code> service name. */
    public static final String SERV_NAME_DELMUNICIPIOFAMILIA = "DelMunicipioFamilia";
    /** <code>DelMunicipioFamilia</code> service alias. */
    public static final String SERV_ALIAS_DELMUNICIPIOFAMILIA = "DelMunicipioFamilia";
    /** Agents allowed to execute the service DelMunicipioFamilia **/
    public static final String DELMUNICIPIOFAMILIA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCDelMunicipioFamiliapthisFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOFAMILIA_FAMILIACDELMUNICIPIOFAMILIAPTHISFAMILIAC = "p_thisFamiliaC";
    /** <code>familiaCDelMunicipioFamiliapthisFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOFAMILIA_FAMILIACDELMUNICIPIOFAMILIAPTHISFAMILIAC = "Clas_1433842221056429Ser_26Arg_1_Alias";
    /** <code>familiaCDelMunicipioFamiliapthisFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOFAMILIA_FAMILIACDELMUNICIPIOFAMILIAPTHISFAMILIAC = "FamiliaC";
    /** <code>familiaCDelMunicipioFamiliapevcMunicipio</code> inbound argument name. */
    public static final String ARG_NAME_DELMUNICIPIOFAMILIA_FAMILIACDELMUNICIPIOFAMILIAPEVCMUNICIPIO = "p_evcMunicipio";
    /** <code>familiaCDelMunicipioFamiliapevcMunicipio</code> inbound argument id. */
    public static final String ARG_ID_DELMUNICIPIOFAMILIA_FAMILIACDELMUNICIPIOFAMILIAPEVCMUNICIPIO = "Clas_1433842221056429Ser_26Arg_2_Alias";
    /** <code>familiaCDelMunicipioFamiliapevcMunicipio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELMUNICIPIOFAMILIA_FAMILIACDELMUNICIPIOFAMILIAPEVCMUNICIPIO = "MunicipioC";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1433842221056429Ser_16_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar familia";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCTELIMINARpthisFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_FAMILIACTELIMINARPTHISFAMILIAC = "p_thisFamiliaC";
    /** <code>familiaCTELIMINARpthisFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_FAMILIACTELIMINARPTHISFAMILIAC = "Clas_1433842221056429Ser_16Arg_1_Alias";
    /** <code>familiaCTELIMINARpthisFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_FAMILIACTELIMINARPTHISFAMILIAC = "Familia";
    // Service (TNEWDESDEAE)
    /** <code>TNEWDESDEAE</code> service id. */
    public static final String SERV_ID_TNEWDESDEAE = "Clas_1433842221056429Ser_21_Alias";
    /** <code>TNEWDESDEAE</code> service name. */
    public static final String SERV_NAME_TNEWDESDEAE = "TNEWDESDEAE";
    /** <code>TNEWDESDEAE</code> service alias. */
    public static final String SERV_ALIAS_TNEWDESDEAE = "TNEWDESDEAE";
    /** Agents allowed to execute the service TNEWDESDEAE **/
    public static final String TNEWDESDEAE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCTNEWDESDEAEptContratoC</code> inbound argument name. */
    public static final String ARG_NAME_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTCONTRATOC = "ptContratoC";
    /** <code>familiaCTNEWDESDEAEptContratoC</code> inbound argument id. */
    public static final String ARG_ID_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTCONTRATOC = "Clas_1433842221056429Ser_21Arg_3_Alias";
    /** <code>familiaCTNEWDESDEAEptContratoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTCONTRATOC = "Contrato";
    /** <code>familiaCTNEWDESDEAEptSolicitud</code> inbound argument name. */
    public static final String ARG_NAME_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTSOLICITUD = "ptSolicitud";
    /** <code>familiaCTNEWDESDEAEptSolicitud</code> inbound argument id. */
    public static final String ARG_ID_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTSOLICITUD = "Clas_1433842221056429Ser_21Arg_4_Alias";
    /** <code>familiaCTNEWDESDEAEptSolicitud</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTSOLICITUD = "Solicitud";
    /** <code>familiaCTNEWDESDEAEptNumFamiliaCORE</code> inbound argument name. */
    public static final String ARG_NAME_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTNUMFAMILIACORE = "ptNumFamiliaCORE";
    /** <code>familiaCTNEWDESDEAEptNumFamiliaCORE</code> inbound argument id. */
    public static final String ARG_ID_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTNUMFAMILIACORE = "Clas_1433842221056429Ser_21Arg_471_Alias";
    /** <code>familiaCTNEWDESDEAEptNumFamiliaCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTNUMFAMILIACORE = "ptNumFamiliaCORE";
    // Service (TCREARACTBENEF)
    /** <code>TCREARACTBENEF</code> service id. */
    public static final String SERV_ID_TCREARACTBENEF = "Clas_1433842221056429Ser_23_Alias";
    /** <code>TCREARACTBENEF</code> service name. */
    public static final String SERV_NAME_TCREARACTBENEF = "TCREARACTBENEF";
    /** <code>TCREARACTBENEF</code> service alias. */
    public static final String SERV_ALIAS_TCREARACTBENEF = "TCREARACTBENEF";
    /** Agents allowed to execute the service TCREARACTBENEF **/
    public static final String TCREARACTBENEF_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCTCREARACTBENEFpthisFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTHISFAMILIAC = "p_thisFamiliaC";
    /** <code>familiaCTCREARACTBENEFpthisFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTHISFAMILIAC = "Clas_1433842221056429Ser_23Arg_2_Alias";
    /** <code>familiaCTCREARACTBENEFpthisFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTHISFAMILIAC = "Familia";
    /** <code>familiaCTCREARACTBENEFptpagrEPSC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGREPSC = "pt_p_agrEPSC";
    /** <code>familiaCTCREARACTBENEFptpagrEPSC</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGREPSC = "Clas_1433842221056429Ser_23Arg_3_Alias";
    /** <code>familiaCTCREARACTBENEFptpagrEPSC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGREPSC = "EPS";
    /** <code>familiaCTCREARACTBENEFptpagrCompanyiaMPC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGRCOMPANYIAMPC = "pt_p_agrCompanyiaMPC";
    /** <code>familiaCTCREARACTBENEFptpagrCompanyiaMPC</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGRCOMPANYIAMPC = "Clas_1433842221056429Ser_23Arg_4_Alias";
    /** <code>familiaCTCREARACTBENEFptpagrCompanyiaMPC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGRCOMPANYIAMPC = "MP Anterior";
    /** <code>familiaCTCREARACTBENEFptpagrParentescoC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGRPARENTESCOC = "pt_p_agrParentescoC";
    /** <code>familiaCTCREARACTBENEFptpagrParentescoC</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGRPARENTESCOC = "Clas_1433842221056429Ser_23Arg_5_Alias";
    /** <code>familiaCTCREARACTBENEFptpagrParentescoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGRPARENTESCOC = "Parentesco";
    /** <code>familiaCTCREARACTBENEFptpagrEstadoBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGRESTADOBENEFICIARIOC = "pt_p_agrEstadoBeneficiarioC";
    /** <code>familiaCTCREARACTBENEFptpagrEstadoBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGRESTADOBENEFICIARIOC = "Clas_1433842221056429Ser_23Arg_6_Alias";
    /** <code>familiaCTCREARACTBENEFptpagrEstadoBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPAGRESTADOBENEFICIARIOC = "Estado beneficiario";
    /** <code>familiaCTCREARACTBENEFptpatrCodigoTipoUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRCODIGOTIPOUSUARIO = "pt_p_atrCodigoTipoUsuario";
    /** <code>familiaCTCREARACTBENEFptpatrCodigoTipoUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRCODIGOTIPOUSUARIO = "Clas_1433842221056429Ser_23Arg_9_Alias";
    /** <code>familiaCTCREARACTBENEFptpatrCodigoTipoUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRCODIGOTIPOUSUARIO = "Cód. Tipo Usuario";
    /** <code>familiaCTCREARACTBENEFptpatrIndicadorBBGestacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRINDICADORBBGESTACION = "pt_p_atrIndicadorBBGestacion";
    /** <code>familiaCTCREARACTBENEFptpatrIndicadorBBGestacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRINDICADORBBGESTACION = "Clas_1433842221056429Ser_23Arg_10_Alias";
    /** <code>familiaCTCREARACTBENEFptpatrIndicadorBBGestacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRINDICADORBBGESTACION = "Indicador BB Gestación";
    /** <code>familiaCTCREARACTBENEFptpatrCodUsuarioBancoRep</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRCODUSUARIOBANCOREP = "pt_p_atrCodUsuarioBancoRep";
    /** <code>familiaCTCREARACTBENEFptpatrCodUsuarioBancoRep</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRCODUSUARIOBANCOREP = "Clas_1433842221056429Ser_23Arg_11_Alias";
    /** <code>familiaCTCREARACTBENEFptpatrCodUsuarioBancoRep</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRCODUSUARIOBANCOREP = "Cod. Usuario Banco Rep.";
    /** <code>familiaCTCREARACTBENEFptpatrFechaAntiguedad</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAANTIGUEDAD = "pt_p_atrFechaAntiguedad";
    /** <code>familiaCTCREARACTBENEFptpatrFechaAntiguedad</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAANTIGUEDAD = "Clas_1433842221056429Ser_23Arg_12_Alias";
    /** <code>familiaCTCREARACTBENEFptpatrFechaAntiguedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAANTIGUEDAD = "Fecha antigüedad";
    /** <code>familiaCTCREARACTBENEFptpatrFechaAntiguedadRealOSI</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAANTIGUEDADREALOSI = "pt_p_atrFechaAntiguedadRealOSI";
    /** <code>familiaCTCREARACTBENEFptpatrFechaAntiguedadRealOSI</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAANTIGUEDADREALOSI = "Clas_1433842221056429Ser_23Arg_13_Alias";
    /** <code>familiaCTCREARACTBENEFptpatrFechaAntiguedadRealOSI</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAANTIGUEDADREALOSI = "Fecha antigüedad";
    /** <code>familiaCTCREARACTBENEFptpatrEstadoMedico</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRESTADOMEDICO = "pt_p_atrEstadoMedico";
    /** <code>familiaCTCREARACTBENEFptpatrEstadoMedico</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRESTADOMEDICO = "Clas_1433842221056429Ser_23Arg_14_Alias";
    /** <code>familiaCTCREARACTBENEFptpatrEstadoMedico</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRESTADOMEDICO = "Estado médico";
    /** <code>familiaCTCREARACTBENEFptpatrTienePreexistencias</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRTIENEPREEXISTENCIAS = "pt_p_atrTienePreexistencias";
    /** <code>familiaCTCREARACTBENEFptpatrTienePreexistencias</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRTIENEPREEXISTENCIAS = "Clas_1433842221056429Ser_23Arg_15_Alias";
    /** <code>familiaCTCREARACTBENEFptpatrTienePreexistencias</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRTIENEPREEXISTENCIAS = "Tiene preexistencias";
    /** <code>familiaCTCREARACTBENEFptpatrFechaInicioVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAINICIOVIGENCIA = "pt_p_atrFechaInicioVigencia";
    /** <code>familiaCTCREARACTBENEFptpatrFechaInicioVigencia</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAINICIOVIGENCIA = "Clas_1433842221056429Ser_23Arg_16_Alias";
    /** <code>familiaCTCREARACTBENEFptpatrFechaInicioVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAINICIOVIGENCIA = "Fecha inicio vigencia";
    /** <code>familiaCTCREARACTBENEFptpatrFechaFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAFINVIGENCIA = "pt_p_atrFechaFinVigencia";
    /** <code>familiaCTCREARACTBENEFptpatrFechaFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAFINVIGENCIA = "Clas_1433842221056429Ser_23Arg_17_Alias";
    /** <code>familiaCTCREARACTBENEFptpatrFechaFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRFECHAFINVIGENCIA = "Fecha fin vigencia";
    /** <code>familiaCTCREARACTBENEFptpatrNumUsuario</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRNUMUSUARIO = "pt_p_atrNumUsuario";
    /** <code>familiaCTCREARACTBENEFptpatrNumUsuario</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRNUMUSUARIO = "Clas_1433842221056429Ser_23Arg_18_Alias";
    /** <code>familiaCTCREARACTBENEFptpatrNumUsuario</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPATRNUMUSUARIO = "Nº Usuario";
    /** <code>familiaCTCREARACTBENEFptptTipoId</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTTIPOID = "pt_ptTipoId";
    /** <code>familiaCTCREARACTBENEFptptTipoId</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTTIPOID = "Clas_1433842221056429Ser_23Arg_19_Alias";
    /** <code>familiaCTCREARACTBENEFptptTipoId</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTTIPOID = "Tipo identificación";
    /** <code>familiaCTCREARACTBENEFptptNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTNUMIDENTIFICACION = "pt_ptNumIdentificacion";
    /** <code>familiaCTCREARACTBENEFptptNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTNUMIDENTIFICACION = "Clas_1433842221056429Ser_23Arg_20_Alias";
    /** <code>familiaCTCREARACTBENEFptptNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTNUMIDENTIFICACION = "Tipo identificación";
    /** <code>familiaCTCREARACTBENEFptptNombreCompleto</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTNOMBRECOMPLETO = "pt_ptNombreCompleto";
    /** <code>familiaCTCREARACTBENEFptptNombreCompleto</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTNOMBRECOMPLETO = "Clas_1433842221056429Ser_23Arg_21_Alias";
    /** <code>familiaCTCREARACTBENEFptptNombreCompleto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTNOMBRECOMPLETO = "pt_ptNombreCompleto";
    /** <code>familiaCTCREARACTBENEFptptCodigoCORE</code> inbound argument name. */
    public static final String ARG_NAME_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTCODIGOCORE = "pt_ptCodigoCORE";
    /** <code>familiaCTCREARACTBENEFptptCodigoCORE</code> inbound argument id. */
    public static final String ARG_ID_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTCODIGOCORE = "Clas_1433842221056429Ser_23Arg_22_Alias";
    /** <code>familiaCTCREARACTBENEFptptCodigoCORE</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARACTBENEF_FAMILIACTCREARACTBENEFPTPTCODIGOCORE = "pt_ptCodigoCORE";
    // Service (TPOSTNOTICREAR)
    /** <code>TPOSTNOTICREAR</code> service id. */
    public static final String SERV_ID_TPOSTNOTICREAR = "Clas_1433842221056429Ser_24_Alias";
    /** <code>TPOSTNOTICREAR</code> service name. */
    public static final String SERV_NAME_TPOSTNOTICREAR = "TPOSTNOTICREAR";
    /** <code>TPOSTNOTICREAR</code> service alias. */
    public static final String SERV_ALIAS_TPOSTNOTICREAR = "TPOSTNOTICREAR";
    /** Agents allowed to execute the service TPOSTNOTICREAR **/
    public static final String TPOSTNOTICREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>familiaCTPOSTNOTICREARpthisFamiliaC</code> inbound argument name. */
    public static final String ARG_NAME_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTHISFAMILIAC = "p_thisFamiliaC";
    /** <code>familiaCTPOSTNOTICREARpthisFamiliaC</code> inbound argument id. */
    public static final String ARG_ID_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTHISFAMILIAC = "Clas_1433842221056429Ser_24Arg_1_Alias";
    /** <code>familiaCTPOSTNOTICREARpthisFamiliaC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTHISFAMILIAC = "Familia";
    /** <code>familiaCTPOSTNOTICREARptpeNumFamilia</code> inbound argument name. */
    public static final String ARG_NAME_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTPENUMFAMILIA = "pt_peNumFamilia";
    /** <code>familiaCTPOSTNOTICREARptpeNumFamilia</code> inbound argument id. */
    public static final String ARG_ID_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTPENUMFAMILIA = "Clas_1433842221056429Ser_24Arg_2_Alias";
    /** <code>familiaCTPOSTNOTICREARptpeNumFamilia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTPENUMFAMILIA = "Nº familia";
    /** <code>familiaCTPOSTNOTICREARptpeFechaFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTPEFECHAFINVIGENCIA = "pt_peFechaFinVigencia";
    /** <code>familiaCTPOSTNOTICREARptpeFechaFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTPEFECHAFINVIGENCIA = "Clas_1433842221056429Ser_24Arg_3_Alias";
    /** <code>familiaCTPOSTNOTICREARptpeFechaFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTPEFECHAFINVIGENCIA = "Fecha fin vigencia";
    /** <code>familiaCTPOSTNOTICREARptpeDirCorresp</code> inbound argument name. */
    public static final String ARG_NAME_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTPEDIRCORRESP = "pt_peDirCorresp";
    /** <code>familiaCTPOSTNOTICREARptpeDirCorresp</code> inbound argument id. */
    public static final String ARG_ID_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTPEDIRCORRESP = "Clas_1433842221056429Ser_24Arg_4_Alias";
    /** <code>familiaCTPOSTNOTICREARptpeDirCorresp</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTPEDIRCORRESP = "Dirección";
    /** <code>familiaCTPOSTNOTICREARptMunicipioDireccion</code> inbound argument name. */
    public static final String ARG_NAME_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTMUNICIPIODIRECCION = "ptMunicipioDireccion";
    /** <code>familiaCTPOSTNOTICREARptMunicipioDireccion</code> inbound argument id. */
    public static final String ARG_ID_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTMUNICIPIODIRECCION = "Clas_1433842221056429Ser_24Arg_5_Alias";
    /** <code>familiaCTPOSTNOTICREARptMunicipioDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTMUNICIPIODIRECCION = "Municipio";
    /** <code>familiaCTPOSTNOTICREARptTipoIdentTitular</code> inbound argument name. */
    public static final String ARG_NAME_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTTIPOIDENTTITULAR = "ptTipoIdentTitular";
    /** <code>familiaCTPOSTNOTICREARptTipoIdentTitular</code> inbound argument id. */
    public static final String ARG_ID_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTTIPOIDENTTITULAR = "Clas_1433842221056429Ser_24Arg_6_Alias";
    /** <code>familiaCTPOSTNOTICREARptTipoIdentTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTTIPOIDENTTITULAR = "Tipo identificación";
    /** <code>familiaCTPOSTNOTICREARptNumIdentTitular</code> inbound argument name. */
    public static final String ARG_NAME_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTNUMIDENTTITULAR = "ptNumIdentTitular";
    /** <code>familiaCTPOSTNOTICREARptNumIdentTitular</code> inbound argument id. */
    public static final String ARG_ID_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTNUMIDENTTITULAR = "Clas_1433842221056429Ser_24Arg_7_Alias";
    /** <code>familiaCTPOSTNOTICREARptNumIdentTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTNUMIDENTTITULAR = "ptNumIdentTitular";
    /** <code>familiaCTPOSTNOTICREARptNombreCompletoTitular</code> inbound argument name. */
    public static final String ARG_NAME_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTNOMBRECOMPLETOTITULAR = "ptNombreCompletoTitular";
    /** <code>familiaCTPOSTNOTICREARptNombreCompletoTitular</code> inbound argument id. */
    public static final String ARG_ID_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTNOMBRECOMPLETOTITULAR = "Clas_1433842221056429Ser_24Arg_8_Alias";
    /** <code>familiaCTPOSTNOTICREARptNombreCompletoTitular</code> inbound argument alias. */
    public static final String ARG_ALIAS_TPOSTNOTICREAR_FAMILIACTPOSTNOTICREARPTNOMBRECOMPLETOTITULAR = "ptNombreCompletoTitular";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_FAMILIACNUMFAMILIA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FAMILIACTITULARCONBENEFICIOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_FAMILIACESTADOTITULARFAMILIA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_FAMILIACFECHAFINVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_FAMILIACDIRECCIONCORRESPONDENCIA.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_FAMILIACID.toUpperCase(), FAMILIACID_AGENTS);
    	attributeAgents.put(ATTR_NAME_FAMILIACNUMFAMILIA.toUpperCase(), FAMILIACNUMFAMILIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_FAMILIACTITULARCONBENEFICIOS.toUpperCase(), FAMILIACTITULARCONBENEFICIOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_FAMILIACESTADOTITULARFAMILIA.toUpperCase(), FAMILIACESTADOTITULARFAMILIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_FAMILIACFECHAFINVIGENCIA.toUpperCase(), FAMILIACFECHAFINVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_FAMILIACDIRECCIONCORRESPONDENCIA.toUpperCase(), FAMILIACDIRECCIONCORRESPONDENCIA_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PERSONACTITULAR.toUpperCase(), PERSONACTITULAR_AGENTS);
        roleAgents.put(ROLE_NAME_CONTRATOC.toUpperCase(), CONTRATOC_AGENTS);
        roleAgents.put(ROLE_NAME_MUNICIPIOC.toUpperCase(), MUNICIPIOC_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'FamiliaC', it returns the identification keys
     * - If className is a facet of the inheritance net of 'FamiliaC', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ROLE_NAME_CONTRATOC + "." + ContratoCConstants.ATTR_FIELD_CONTRATOCID);
            returnList.add(ATTR_FIELD_FAMILIACID);
        }
        // Facet 'FamiliaC' (This facet)
        if (FamiliaCConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ROLE_NAME_CONTRATOC + "." + ContratoCConstants.ATTR_FIELD_CONTRATOCID);
            returnList.add(ATTR_FIELD_FAMILIACID);
        }
        return returnList;
    }
}
