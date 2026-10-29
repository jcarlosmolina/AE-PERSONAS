package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>AnexoC</code> model class.
 */
public final class AnexoCConstants {

    private AnexoCConstants() {

    }

    // Class
    /** <code>AnexoC</code> class id. */
    public static final String CLASS_ID = "Clas_1433004933120720_Alias";
    /** <code>AnexoC</code> class name. */
    public static final String CLASS_NAME = "AnexoC";
    /** <code>AnexoC</code> class alias. */
    public static final String CLASS_ALIAS = "Anexo beneficiario";
    /** <code>AnexoC</code> class table name. */
    public static final String TBL_NAME = "AnexoC";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "anexoCIdentificador,contratoCID,beneficiarioCBeneficiarioCID,periodicidadCodigo,tipoIdentificacionTipoIdentificacionCCodigo,anexoCCodigoPlanAnexo,anexoCCodigoTarifa,anexoCFechaInicioVigencia,anexoCFechaUltimaRegla,anexoCNumCuotasPago,anexoCNumIdentificacion,anexoCCodSucursal";

    

    // Attribute (anexoCIdentificador)
    /** <code>anexoCIdentificador</code> attribute id. */
    public static final String ATTR_ID_ANEXOCIDENTIFICADOR = "Clas_1433004933120720Atr_7_Alias";
    /** <code>anexoCIdentificador</code> attribute name. */
    public static final String ATTR_NAME_ANEXOCIDENTIFICADOR = "anexoCIdentificador";
    /** <code>anexoCIdentificador</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOCIDENTIFICADOR = "Identificador";

    /** <code>anexoCIdentificador</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOCIDENTIFICADOR = "";
    /** Agents allowed to view the attribute anexoCIdentificador **/
    public static final String ANEXOCIDENTIFICADOR_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoCCodigoPlanAnexo)
    /** <code>anexoCCodigoPlanAnexo</code> attribute id. */
    public static final String ATTR_ID_ANEXOCCODIGOPLANANEXO = "Clas_1433004933120720Atr_8_Alias";
    /** <code>anexoCCodigoPlanAnexo</code> attribute name. */
    public static final String ATTR_NAME_ANEXOCCODIGOPLANANEXO = "anexoCCodigoPlanAnexo";
    /** <code>anexoCCodigoPlanAnexo</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOCCODIGOPLANANEXO = "Cód. Plan Anexo";

    /** <code>anexoCCodigoPlanAnexo</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOCCODIGOPLANANEXO = "";
    /** Agents allowed to view the attribute anexoCCodigoPlanAnexo **/
    public static final String ANEXOCCODIGOPLANANEXO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoCCodigoTarifa)
    /** <code>anexoCCodigoTarifa</code> attribute id. */
    public static final String ATTR_ID_ANEXOCCODIGOTARIFA = "Clas_1433004933120720Atr_9_Alias";
    /** <code>anexoCCodigoTarifa</code> attribute name. */
    public static final String ATTR_NAME_ANEXOCCODIGOTARIFA = "anexoCCodigoTarifa";
    /** <code>anexoCCodigoTarifa</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOCCODIGOTARIFA = "Código Tarifa";

    /** <code>anexoCCodigoTarifa</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOCCODIGOTARIFA = "";
    /** Agents allowed to view the attribute anexoCCodigoTarifa **/
    public static final String ANEXOCCODIGOTARIFA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoCFechaInicioVigencia)
    /** <code>anexoCFechaInicioVigencia</code> attribute id. */
    public static final String ATTR_ID_ANEXOCFECHAINICIOVIGENCIA = "Clas_1433004933120720Atr_10_Alias";
    /** <code>anexoCFechaInicioVigencia</code> attribute name. */
    public static final String ATTR_NAME_ANEXOCFECHAINICIOVIGENCIA = "anexoCFechaInicioVigencia";
    /** <code>anexoCFechaInicioVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOCFECHAINICIOVIGENCIA = "Fecha Inicio Vigencia";

    /** <code>anexoCFechaInicioVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOCFECHAINICIOVIGENCIA = "";
    /** Agents allowed to view the attribute anexoCFechaInicioVigencia **/
    public static final String ANEXOCFECHAINICIOVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoCFechaUltimaRegla)
    /** <code>anexoCFechaUltimaRegla</code> attribute id. */
    public static final String ATTR_ID_ANEXOCFECHAULTIMAREGLA = "Clas_1433004933120720Atr_11_Alias";
    /** <code>anexoCFechaUltimaRegla</code> attribute name. */
    public static final String ATTR_NAME_ANEXOCFECHAULTIMAREGLA = "anexoCFechaUltimaRegla";
    /** <code>anexoCFechaUltimaRegla</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOCFECHAULTIMAREGLA = "Fecha Última Regla";

    /** <code>anexoCFechaUltimaRegla</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOCFECHAULTIMAREGLA = "";
    /** Agents allowed to view the attribute anexoCFechaUltimaRegla **/
    public static final String ANEXOCFECHAULTIMAREGLA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoCNumCuotasPago)
    /** <code>anexoCNumCuotasPago</code> attribute id. */
    public static final String ATTR_ID_ANEXOCNUMCUOTASPAGO = "Clas_1433004933120720Atr_12_Alias";
    /** <code>anexoCNumCuotasPago</code> attribute name. */
    public static final String ATTR_NAME_ANEXOCNUMCUOTASPAGO = "anexoCNumCuotasPago";
    /** <code>anexoCNumCuotasPago</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOCNUMCUOTASPAGO = "Nº Cuotas Pago";

    /** <code>anexoCNumCuotasPago</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOCNUMCUOTASPAGO = "";
    /** Agents allowed to view the attribute anexoCNumCuotasPago **/
    public static final String ANEXOCNUMCUOTASPAGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoCNumIdentificacion)
    /** <code>anexoCNumIdentificacion</code> attribute id. */
    public static final String ATTR_ID_ANEXOCNUMIDENTIFICACION = "Clas_1433004933120720Atr_13_Alias";
    /** <code>anexoCNumIdentificacion</code> attribute name. */
    public static final String ATTR_NAME_ANEXOCNUMIDENTIFICACION = "anexoCNumIdentificacion";
    /** <code>anexoCNumIdentificacion</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOCNUMIDENTIFICACION = "Nº Identificación";

    /** <code>anexoCNumIdentificacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOCNUMIDENTIFICACION = "";
    /** Agents allowed to view the attribute anexoCNumIdentificacion **/
    public static final String ANEXOCNUMIDENTIFICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (anexoCCodSucursal)
    /** <code>anexoCCodSucursal</code> attribute id. */
    public static final String ATTR_ID_ANEXOCCODSUCURSAL = "Clas_1433004933120720Atr_14_Alias";
    /** <code>anexoCCodSucursal</code> attribute name. */
    public static final String ATTR_NAME_ANEXOCCODSUCURSAL = "anexoCCodSucursal";
    /** <code>anexoCCodSucursal</code> attribute alias. */
    public static final String ATTR_ALIAS_ANEXOCCODSUCURSAL = "Cod. Sucursal";

    /** <code>anexoCCodSucursal</code> attribute facet sequence. */
    public static final String PATH_FACETS_ANEXOCCODSUCURSAL = "";
    /** Agents allowed to view the attribute anexoCCodSucursal **/
    public static final String ANEXOCCODSUCURSAL_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Identificador)
    /** <code>Identificador</code> field name. */
    public static final String FLD_ANEXOCIDENTIFICADOR = "Identificador";    
    /** <code>anexoCIdentificador</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOCIDENTIFICADOR = "anexoCIdentificador";
    // Field (ID)
    /** <code>ID</code> field name. */
    public static final String FLD_CONTRATOCID = "ID";    
    /** <code>BeneficiarioC.ContratoC.contratoCID</code> attribute field name. */
    public static final String ATTR_FIELD_BENEFICIARIOC_CONTRATOC_CONTRATOCID = "contratoCID";
    // Field (BeneficiarioC_ID)
    /** <code>BeneficiarioC_ID</code> field name. */
    public static final String FLD_BENEFICIARIOCBENEFICIARIOCID = "BeneficiarioC_ID";    
    /** <code>BeneficiarioC.beneficiarioCID</code> attribute field name. */
    public static final String ATTR_FIELD_BENEFICIARIOC_BENEFICIARIOCID = "beneficiarioCBeneficiarioCID";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PERIODICIDADCODIGO = "Codigo";    
    /** <code>PeriodicidadC.periodicidadCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PERIODICIDADC_PERIODICIDADCODIGO = "periodicidadCodigo";
    // Field (TipoIdentificacionC_Codigo)
    /** <code>TipoIdentificacionC_Codigo</code> field name. */
    public static final String FLD_TIPOIDENTIFICACIONTIPOIDENTIFICACIONCCODIGO = "TipoIdentificacionC_Codigo";    
    /** <code>TipoIdentificacionC.tipoIdentificacionCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TIPOIDENTIFICACIONC_TIPOIDENTIFICACIONCODIGO = "tipoIdentificacionTipoIdentificacionCCodigo";
    // Field (CodigoPlanAnexo)
    /** <code>CodigoPlanAnexo</code> field name. */
    public static final String FLD_ANEXOCCODIGOPLANANEXO = "CodigoPlanAnexo";    
    /** <code>CodigoPlanAnexo</code> field length. */
    public static final int FLD_ANEXOCCODIGOPLANANEXOLENGTH = 10;
    /** <code>anexoCCodigoPlanAnexo</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOCCODIGOPLANANEXO = "anexoCCodigoPlanAnexo";
    // Field (CodigoTarifa)
    /** <code>CodigoTarifa</code> field name. */
    public static final String FLD_ANEXOCCODIGOTARIFA = "CodigoTarifa";    
    /** <code>CodigoTarifa</code> field length. */
    public static final int FLD_ANEXOCCODIGOTARIFALENGTH = 10;
    /** <code>anexoCCodigoTarifa</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOCCODIGOTARIFA = "anexoCCodigoTarifa";
    // Field (FechaInicioVigencia)
    /** <code>FechaInicioVigencia</code> field name. */
    public static final String FLD_ANEXOCFECHAINICIOVIGENCIA = "FechaInicioVigencia";    
    /** <code>anexoCFechaInicioVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOCFECHAINICIOVIGENCIA = "anexoCFechaInicioVigencia";
    // Field (FechaUltimaRegla)
    /** <code>FechaUltimaRegla</code> field name. */
    public static final String FLD_ANEXOCFECHAULTIMAREGLA = "FechaUltimaRegla";    
    /** <code>anexoCFechaUltimaRegla</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOCFECHAULTIMAREGLA = "anexoCFechaUltimaRegla";
    // Field (NumCuotasPago)
    /** <code>NumCuotasPago</code> field name. */
    public static final String FLD_ANEXOCNUMCUOTASPAGO = "NumCuotasPago";    
    /** <code>anexoCNumCuotasPago</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOCNUMCUOTASPAGO = "anexoCNumCuotasPago";
    // Field (NumIdentificacion)
    /** <code>NumIdentificacion</code> field name. */
    public static final String FLD_ANEXOCNUMIDENTIFICACION = "NumIdentificacion";    
    /** <code>NumIdentificacion</code> field length. */
    public static final int FLD_ANEXOCNUMIDENTIFICACIONLENGTH = 60;
    /** <code>anexoCNumIdentificacion</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOCNUMIDENTIFICACION = "anexoCNumIdentificacion";
    // Field (CodSucursal)
    /** <code>CodSucursal</code> field name. */
    public static final String FLD_ANEXOCCODSUCURSAL = "CodSucursal";    
    /** <code>CodSucursal</code> field length. */
    public static final int FLD_ANEXOCCODSUCURSALLENGTH = 20;
    /** <code>anexoCCodSucursal</code> attribute field name. */
    public static final String ATTR_FIELD_ANEXOCCODSUCURSAL = "anexoCCodSucursal";

    // Component role (BeneficiarioC)
    /** <code>BeneficiarioC</code> role id. */
    public static final String ROLE_ID_BENEFICIARIOC = "Agr_1437649993728110_Alias";
    /** <code>BeneficiarioC</code> role name. */
    public static final String ROLE_NAME_BENEFICIARIOC = "beneficiarioC";
    /** <code>BeneficiarioC</code> role alias. */
    public static final String ROLE_ALIAS_BENEFICIARIOC = "Beneficiario";

    /** <code>BeneficiarioC</code> inverse role name. */
    public static final String ROLE_INVNAME_BENEFICIARIOC = BeneficiarioCConstants.ROLE_NAME_ANEXOSC;
    /** <code>BeneficiarioC</code> role facet sequence. */
    public static final String PATH_FACETS_BENEFICIARIOC = "";
    /** <code>BeneficiarioC</code> role target class. */
    public static final String ROLE_TARGET_BENEFICIARIOC = BeneficiarioCConstants.CLASS_NAME;

    /** Agents allowed to navigate through BeneficiarioC **/
    public static final String BENEFICIARIOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (PeriodicidadC)
    /** <code>PeriodicidadC</code> role id. */
    public static final String ROLE_ID_PERIODICIDADC = "Agr_1473094352896081_Alias";
    /** <code>PeriodicidadC</code> role name. */
    public static final String ROLE_NAME_PERIODICIDADC = "periodicidadC";
    /** <code>PeriodicidadC</code> role alias. */
    public static final String ROLE_ALIAS_PERIODICIDADC = "PeriodicidadC";

    /** <code>PeriodicidadC</code> inverse role name. */
    public static final String ROLE_INVNAME_PERIODICIDADC = PeriodicidadConstants.ROLE_NAME_ANEXOSC;
    /** <code>PeriodicidadC</code> role facet sequence. */
    public static final String PATH_FACETS_PERIODICIDADC = "";
    /** <code>PeriodicidadC</code> role target class. */
    public static final String ROLE_TARGET_PERIODICIDADC = PeriodicidadConstants.CLASS_NAME;

    /** Agents allowed to navigate through PeriodicidadC **/
    public static final String PERIODICIDADC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (TipoIdentificacionC)
    /** <code>TipoIdentificacionC</code> role id. */
    public static final String ROLE_ID_TIPOIDENTIFICACIONC = "Agr_1473350860800217_Alias";
    /** <code>TipoIdentificacionC</code> role name. */
    public static final String ROLE_NAME_TIPOIDENTIFICACIONC = "tipoIdentificacionC";
    /** <code>TipoIdentificacionC</code> role alias. */
    public static final String ROLE_ALIAS_TIPOIDENTIFICACIONC = "Tipo identificación";

    /** <code>TipoIdentificacionC</code> inverse role name. */
    public static final String ROLE_INVNAME_TIPOIDENTIFICACIONC = TipoIdentificacionConstants.ROLE_NAME_ANEXOSC;
    /** <code>TipoIdentificacionC</code> role facet sequence. */
    public static final String PATH_FACETS_TIPOIDENTIFICACIONC = "";
    /** <code>TipoIdentificacionC</code> role target class. */
    public static final String ROLE_TARGET_TIPOIDENTIFICACIONC = TipoIdentificacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through TipoIdentificacionC **/
    public static final String TIPOIDENTIFICACIONC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1433004933120720Ser_4_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear anexo";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoCcrearpagrPeriodicidadC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOCCREARPAGRPERIODICIDADC = "p_agrPeriodicidadC";
    /** <code>anexoCcrearpagrPeriodicidadC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOCCREARPAGRPERIODICIDADC = "Clas_1433004933120720Ser_4Arg_13_Alias";
    /** <code>anexoCcrearpagrPeriodicidadC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOCCREARPAGRPERIODICIDADC = "PeriodicidadC";
    /** <code>anexoCcrearpagrBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOCCREARPAGRBENEFICIARIOC = "p_agrBeneficiarioC";
    /** <code>anexoCcrearpagrBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOCCREARPAGRBENEFICIARIOC = "Clas_1433004933120720Ser_4Arg_15_Alias";
    /** <code>anexoCcrearpagrBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOCCREARPAGRBENEFICIARIOC = "Beneficiario";
    /** <code>anexoCcrearpagrTipoIdentificacionC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOCCREARPAGRTIPOIDENTIFICACIONC = "p_agrTipoIdentificacionC";
    /** <code>anexoCcrearpagrTipoIdentificacionC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOCCREARPAGRTIPOIDENTIFICACIONC = "Clas_1433004933120720Ser_4Arg_16_Alias";
    /** <code>anexoCcrearpagrTipoIdentificacionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOCCREARPAGRTIPOIDENTIFICACIONC = "Tipo identificación";
    /** <code>anexoCcrearpatrCodigoPlanAnexo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOCCREARPATRCODIGOPLANANEXO = "p_atrCodigoPlanAnexo";
    /** <code>anexoCcrearpatrCodigoPlanAnexo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOCCREARPATRCODIGOPLANANEXO = "Clas_1433004933120720Ser_4Arg_3_Alias";
    /** <code>anexoCcrearpatrCodigoPlanAnexo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOCCREARPATRCODIGOPLANANEXO = "Cód. Plan Anexo";
    /** <code>anexoCcrearpatrCodigoTarifa</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOCCREARPATRCODIGOTARIFA = "p_atrCodigoTarifa";
    /** <code>anexoCcrearpatrCodigoTarifa</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOCCREARPATRCODIGOTARIFA = "Clas_1433004933120720Ser_4Arg_4_Alias";
    /** <code>anexoCcrearpatrCodigoTarifa</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOCCREARPATRCODIGOTARIFA = "Código Tarifa";
    /** <code>anexoCcrearpatrFechaInicioVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOCCREARPATRFECHAINICIOVIGENCIA = "p_atrFechaInicioVigencia";
    /** <code>anexoCcrearpatrFechaInicioVigencia</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOCCREARPATRFECHAINICIOVIGENCIA = "Clas_1433004933120720Ser_4Arg_5_Alias";
    /** <code>anexoCcrearpatrFechaInicioVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOCCREARPATRFECHAINICIOVIGENCIA = "Fecha Inicio Vigencia";
    /** <code>anexoCcrearpatrFechaUltimaRegla</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOCCREARPATRFECHAULTIMAREGLA = "p_atrFechaUltimaRegla";
    /** <code>anexoCcrearpatrFechaUltimaRegla</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOCCREARPATRFECHAULTIMAREGLA = "Clas_1433004933120720Ser_4Arg_6_Alias";
    /** <code>anexoCcrearpatrFechaUltimaRegla</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOCCREARPATRFECHAULTIMAREGLA = "Fecha Última Regla";
    /** <code>anexoCcrearpatrNumCuotasPago</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOCCREARPATRNUMCUOTASPAGO = "p_atrNumCuotasPago";
    /** <code>anexoCcrearpatrNumCuotasPago</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOCCREARPATRNUMCUOTASPAGO = "Clas_1433004933120720Ser_4Arg_7_Alias";
    /** <code>anexoCcrearpatrNumCuotasPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOCCREARPATRNUMCUOTASPAGO = "Nº Cuotas Pago";
    /** <code>anexoCcrearpatrNumIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOCCREARPATRNUMIDENTIFICACION = "p_atrNumIdentificacion";
    /** <code>anexoCcrearpatrNumIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOCCREARPATRNUMIDENTIFICACION = "Clas_1433004933120720Ser_4Arg_8_Alias";
    /** <code>anexoCcrearpatrNumIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOCCREARPATRNUMIDENTIFICACION = "Nº Identificación";
    /** <code>anexoCcrearpatrCodSucursal</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_ANEXOCCREARPATRCODSUCURSAL = "p_atrCodSucursal";
    /** <code>anexoCcrearpatrCodSucursal</code> inbound argument id. */
    public static final String ARG_ID_CREAR_ANEXOCCREARPATRCODSUCURSAL = "Clas_1433004933120720Ser_4Arg_9_Alias";
    /** <code>anexoCcrearpatrCodSucursal</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_ANEXOCCREARPATRCODSUCURSAL = "Cod. Sucursal";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1433004933120720Ser_5_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar anexo";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoCeliminarpthisAnexoC</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_ANEXOCELIMINARPTHISANEXOC = "p_thisAnexoC";
    /** <code>anexoCeliminarpthisAnexoC</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_ANEXOCELIMINARPTHISANEXOC = "Clas_1433004933120720Ser_5Arg_1_Alias";
    /** <code>anexoCeliminarpthisAnexoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_ANEXOCELIMINARPTHISANEXOC = "Anexo beneficiario";
    // Service (InsTipoIdentificacionC)
    /** <code>InsTipoIdentificacionC</code> service id. */
    public static final String SERV_ID_INSTIPOIDENTIFICACIONC = "Clas_1433004933120720Ser_7_Alias";
    /** <code>InsTipoIdentificacionC</code> service name. */
    public static final String SERV_NAME_INSTIPOIDENTIFICACIONC = "InsTipoIdentificacionC";
    /** <code>InsTipoIdentificacionC</code> service alias. */
    public static final String SERV_ALIAS_INSTIPOIDENTIFICACIONC = "InsTipoIdentificacionC";
    /** Agents allowed to execute the service InsTipoIdentificacionC **/
    public static final String INSTIPOIDENTIFICACIONC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoCInsTipoIdentificacionCpthisAnexoC</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOIDENTIFICACIONC_ANEXOCINSTIPOIDENTIFICACIONCPTHISANEXOC = "p_thisAnexoC";
    /** <code>anexoCInsTipoIdentificacionCpthisAnexoC</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOIDENTIFICACIONC_ANEXOCINSTIPOIDENTIFICACIONCPTHISANEXOC = "Clas_1433004933120720Ser_7Arg_1_Alias";
    /** <code>anexoCInsTipoIdentificacionCpthisAnexoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOIDENTIFICACIONC_ANEXOCINSTIPOIDENTIFICACIONCPTHISANEXOC = "Anexos";
    /** <code>anexoCInsTipoIdentificacionCpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_INSTIPOIDENTIFICACIONC_ANEXOCINSTIPOIDENTIFICACIONCPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>anexoCInsTipoIdentificacionCpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_INSTIPOIDENTIFICACIONC_ANEXOCINSTIPOIDENTIFICACIONCPEVCTIPOIDENTIFICACION = "Clas_1433004933120720Ser_7Arg_2_Alias";
    /** <code>anexoCInsTipoIdentificacionCpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSTIPOIDENTIFICACIONC_ANEXOCINSTIPOIDENTIFICACIONCPEVCTIPOIDENTIFICACION = "Tipo identificación";
    // Service (DelTipoIdentificacionC)
    /** <code>DelTipoIdentificacionC</code> service id. */
    public static final String SERV_ID_DELTIPOIDENTIFICACIONC = "Clas_1433004933120720Ser_8_Alias";
    /** <code>DelTipoIdentificacionC</code> service name. */
    public static final String SERV_NAME_DELTIPOIDENTIFICACIONC = "DelTipoIdentificacionC";
    /** <code>DelTipoIdentificacionC</code> service alias. */
    public static final String SERV_ALIAS_DELTIPOIDENTIFICACIONC = "DelTipoIdentificacionC";
    /** Agents allowed to execute the service DelTipoIdentificacionC **/
    public static final String DELTIPOIDENTIFICACIONC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoCDelTipoIdentificacionCpthisAnexoC</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOIDENTIFICACIONC_ANEXOCDELTIPOIDENTIFICACIONCPTHISANEXOC = "p_thisAnexoC";
    /** <code>anexoCDelTipoIdentificacionCpthisAnexoC</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOIDENTIFICACIONC_ANEXOCDELTIPOIDENTIFICACIONCPTHISANEXOC = "Clas_1433004933120720Ser_8Arg_1_Alias";
    /** <code>anexoCDelTipoIdentificacionCpthisAnexoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOIDENTIFICACIONC_ANEXOCDELTIPOIDENTIFICACIONCPTHISANEXOC = "Anexos";
    /** <code>anexoCDelTipoIdentificacionCpevcTipoIdentificacion</code> inbound argument name. */
    public static final String ARG_NAME_DELTIPOIDENTIFICACIONC_ANEXOCDELTIPOIDENTIFICACIONCPEVCTIPOIDENTIFICACION = "p_evcTipoIdentificacion";
    /** <code>anexoCDelTipoIdentificacionCpevcTipoIdentificacion</code> inbound argument id. */
    public static final String ARG_ID_DELTIPOIDENTIFICACIONC_ANEXOCDELTIPOIDENTIFICACIONCPEVCTIPOIDENTIFICACION = "Clas_1433004933120720Ser_8Arg_2_Alias";
    /** <code>anexoCDelTipoIdentificacionCpevcTipoIdentificacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELTIPOIDENTIFICACIONC_ANEXOCDELTIPOIDENTIFICACIONCPEVCTIPOIDENTIFICACION = "Tipo identificación";
    // Service (TCREARFROMWS)
    /** <code>TCREARFROMWS</code> service id. */
    public static final String SERV_ID_TCREARFROMWS = "Clas_1433004933120720Ser_6_Alias";
    /** <code>TCREARFROMWS</code> service name. */
    public static final String SERV_NAME_TCREARFROMWS = "TCREARFROMWS";
    /** <code>TCREARFROMWS</code> service alias. */
    public static final String SERV_ALIAS_TCREARFROMWS = "TCREARFROMWS";
    /** Agents allowed to execute the service TCREARFROMWS **/
    public static final String TCREARFROMWS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>anexoCTCREARFROMWSpBeneficiarioC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFROMWS_ANEXOCTCREARFROMWSPBENEFICIARIOC = "pBeneficiarioC";
    /** <code>anexoCTCREARFROMWSpBeneficiarioC</code> inbound argument id. */
    public static final String ARG_ID_TCREARFROMWS_ANEXOCTCREARFROMWSPBENEFICIARIOC = "Clas_1433004933120720Ser_6Arg_2_Alias";
    /** <code>anexoCTCREARFROMWSpBeneficiarioC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFROMWS_ANEXOCTCREARFROMWSPBENEFICIARIOC = "Beneficiario";
    /** <code>anexoCTCREARFROMWSpAnexoC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFROMWS_ANEXOCTCREARFROMWSPANEXOC = "pAnexoC";
    /** <code>anexoCTCREARFROMWSpAnexoC</code> inbound argument id. */
    public static final String ARG_ID_TCREARFROMWS_ANEXOCTCREARFROMWSPANEXOC = "Clas_1433004933120720Ser_6Arg_3_Alias";
    /** <code>anexoCTCREARFROMWSpAnexoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFROMWS_ANEXOCTCREARFROMWSPANEXOC = "Anexo beneficiario";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_ANEXOCCODIGOPLANANEXO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXOCCODIGOTARIFA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXOCFECHAINICIOVIGENCIA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXOCFECHAULTIMAREGLA.toUpperCase(), Constants.Type.DATE.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXOCNUMCUOTASPAGO.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXOCNUMIDENTIFICACION.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_ANEXOCCODSUCURSAL.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_ANEXOCIDENTIFICADOR.toUpperCase(), ANEXOCIDENTIFICADOR_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXOCCODIGOPLANANEXO.toUpperCase(), ANEXOCCODIGOPLANANEXO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXOCCODIGOTARIFA.toUpperCase(), ANEXOCCODIGOTARIFA_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXOCFECHAINICIOVIGENCIA.toUpperCase(), ANEXOCFECHAINICIOVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXOCFECHAULTIMAREGLA.toUpperCase(), ANEXOCFECHAULTIMAREGLA_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXOCNUMCUOTASPAGO.toUpperCase(), ANEXOCNUMCUOTASPAGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXOCNUMIDENTIFICACION.toUpperCase(), ANEXOCNUMIDENTIFICACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_ANEXOCCODSUCURSAL.toUpperCase(), ANEXOCCODSUCURSAL_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_BENEFICIARIOC.toUpperCase(), BENEFICIARIOC_AGENTS);
        roleAgents.put(ROLE_NAME_PERIODICIDADC.toUpperCase(), PERIODICIDADC_AGENTS);
        roleAgents.put(ROLE_NAME_TIPOIDENTIFICACIONC.toUpperCase(), TIPOIDENTIFICACIONC_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'AnexoC', it returns the identification keys
     * - If className is a facet of the inheritance net of 'AnexoC', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_ANEXOCIDENTIFICADOR);
        }
        // Facet 'AnexoC' (This facet)
        if (AnexoCConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_ANEXOCIDENTIFICADOR);
        }
        return returnList;
    }
}
