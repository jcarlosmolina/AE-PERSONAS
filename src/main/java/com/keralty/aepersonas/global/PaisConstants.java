package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Pais</code> model class.
 */
public final class PaisConstants {

    private PaisConstants() {

    }

    // Class
    /** <code>Pais</code> class id. */
    public static final String CLASS_ID = "Clas_1432206704640584_Alias";
    /** <code>Pais</code> class name. */
    public static final String CLASS_NAME = "Pais";
    /** <code>Pais</code> class alias. */
    public static final String CLASS_ALIAS = "País";
    /** <code>Pais</code> class table name. */
    public static final String TBL_NAME = "Pais";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "paisCodigo,paisDescripcion";

    public static final String DSICPAIS = "IC_Pais";
    

    // Attribute (paisCodigo)
    /** <code>paisCodigo</code> attribute id. */
    public static final String ATTR_ID_PAISCODIGO = "Clas_1432206704640584Atr_1_Alias";
    /** <code>paisCodigo</code> attribute name. */
    public static final String ATTR_NAME_PAISCODIGO = "paisCodigo";
    /** <code>paisCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_PAISCODIGO = "Código";

    /** <code>paisCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_PAISCODIGO = "";
    /** Agents allowed to view the attribute paisCodigo **/
    public static final String PAISCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (paisDescripcion)
    /** <code>paisDescripcion</code> attribute id. */
    public static final String ATTR_ID_PAISDESCRIPCION = "Clas_1432206704640584Atr_2_Alias";
    /** <code>paisDescripcion</code> attribute name. */
    public static final String ATTR_NAME_PAISDESCRIPCION = "paisDescripcion";
    /** <code>paisDescripcion</code> attribute alias. */
    public static final String ATTR_ALIAS_PAISDESCRIPCION = "Descripción";

    /** <code>paisDescripcion</code> attribute facet sequence. */
    public static final String PATH_FACETS_PAISDESCRIPCION = "";
    /** Agents allowed to view the attribute paisDescripcion **/
    public static final String PAISDESCRIPCION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_PAISCODIGO = "Codigo";    
    /** <code>Codigo</code> field length. */
    public static final int FLD_PAISCODIGOLENGTH = 10;
    /** <code>paisCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_PAISCODIGO = "paisCodigo";
    // Field (Descripcion)
    /** <code>Descripcion</code> field name. */
    public static final String FLD_PAISDESCRIPCION = "Descripcion";    
    /** <code>Descripcion</code> field length. */
    public static final int FLD_PAISDESCRIPCIONLENGTH = 50;
    /** <code>paisDescripcion</code> attribute field name. */
    public static final String ATTR_FIELD_PAISDESCRIPCION = "paisDescripcion";


    // Compound role (DireccionesC)
    /** <code>DireccionesC</code> role id. */
    public static final String ROLE_ID_DIRECCIONESC = "Agr_1473350074368543_Alias";
    /** <code>DireccionesC</code> role name. */
    public static final String ROLE_NAME_DIRECCIONESC = "direccionesC";
    /** <code>PaisC</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONESC = "Direcciones";


    /** <code>DireccionesC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONESC = DireccionCConstants.ROLE_NAME_PAISC;
    /** <code>DireccionesC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONESC = "";
    /** <code>DireccionesC</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONESC = DireccionCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DireccionesC **/
    public static final String DIRECCIONESC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Direcciones)
    /** <code>Direcciones</code> role id. */
    public static final String ROLE_ID_DIRECCIONES = "Agr_1432206835712707_Alias";
    /** <code>Direcciones</code> role name. */
    public static final String ROLE_NAME_DIRECCIONES = "direcciones";
    /** <code>Pais</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONES = "Direcciones";


    /** <code>Direcciones</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONES = DireccionConstants.ROLE_NAME_PAIS;
    /** <code>Direcciones</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONES = "";
    /** <code>Direcciones</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONES = DireccionConstants.CLASS_NAME;
    /** Agents allowed to navigate through Direcciones **/
    public static final String DIRECCIONES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (DirSucursalC)
    /** <code>DirSucursalC</code> role id. */
    public static final String ROLE_ID_DIRSUCURSALC = "Agr_1473350991872574_Alias";
    /** <code>DirSucursalC</code> role name. */
    public static final String ROLE_NAME_DIRSUCURSALC = "dirSucursalC";
    /** <code>PaisC</code> role alias. */
    public static final String ROLE_ALIAS_DIRSUCURSALC = "Sucursales";


    /** <code>DirSucursalC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRSUCURSALC = DirSucursalCConstants.ROLE_NAME_PAISC;
    /** <code>DirSucursalC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRSUCURSALC = "";
    /** <code>DirSucursalC</code> role target class. */
    public static final String ROLE_TARGET_DIRSUCURSALC = DirSucursalCConstants.CLASS_NAME;
    /** Agents allowed to navigate through DirSucursalC **/
    public static final String DIRSUCURSALC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (NovedadCT)
    /** <code>NovedadCT</code> role id. */
    public static final String ROLE_ID_NOVEDADCT = "Agr_1583231401984110_Alias";
    /** <code>NovedadCT</code> role name. */
    public static final String ROLE_NAME_NOVEDADCT = "novedadCT";
    /** <code>Pais</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADCT = "NovedadCT";


    /** <code>NovedadCT</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADCT = NovedadCTConstants.ROLE_NAME_PAIS;
    /** <code>NovedadCT</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADCT = "";
    /** <code>NovedadCT</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADCT = NovedadCTConstants.CLASS_NAME;
    /** Agents allowed to navigate through NovedadCT **/
    public static final String NOVEDADCT_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (NovedadesMD)
    /** <code>NovedadesMD</code> role id. */
    public static final String ROLE_ID_NOVEDADESMD = "Agr_1582554939392150_Alias";
    /** <code>NovedadesMD</code> role name. */
    public static final String ROLE_NAME_NOVEDADESMD = "novedadesMD";
    /** <code>Pais</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADESMD = "Direcciones MD";


    /** <code>NovedadesMD</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADESMD = NovedadMDConstants.ROLE_NAME_PAIS;
    /** <code>NovedadesMD</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADESMD = "";
    /** <code>NovedadesMD</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADESMD = NovedadMDConstants.CLASS_NAME;
    /** Agents allowed to navigate through NovedadesMD **/
    public static final String NOVEDADESMD_AGENTS = "Admin,SuperAdmin,Asesor,Afiliaciones,Gestor,MesaDeApoyo";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432206704640584Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear país";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "SuperAdmin";
    // Inbound arguments
    /** <code>paiscrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PAISCREARPATRCODIGO = "p_atrCodigo";
    /** <code>paiscrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PAISCREARPATRCODIGO = "Clas_1432206704640584Ser_1Arg_1_Alias";
    /** <code>paiscrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PAISCREARPATRCODIGO = "Código";
    /** <code>paiscrearpatrDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_PAISCREARPATRDESCRIPCION = "p_atrDescripcion";
    /** <code>paiscrearpatrDescripcion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_PAISCREARPATRDESCRIPCION = "Clas_1432206704640584Ser_1Arg_2_Alias";
    /** <code>paiscrearpatrDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_PAISCREARPATRDESCRIPCION = "Descripción";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432206704640584Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar país";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "SuperAdmin";
    // Preconditions
    /** <code>eliminar</code> precondition 0 id. */
    public static final String PRE_ID_ELIMINAR_0 = "Clas_1432206704640584Pre_1_MsgError";
    // Inbound arguments
    /** <code>paiseliminarpthisPais</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_PAISELIMINARPTHISPAIS = "p_thisPais";
    /** <code>paiseliminarpthisPais</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_PAISELIMINARPTHISPAIS = "Clas_1432206704640584Ser_2Arg_1_Alias";
    /** <code>paiseliminarpthisPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_PAISELIMINARPTHISPAIS = "País";
    // Service (sincronizar)
    /** <code>sincronizar</code> service id. */
    public static final String SERV_ID_SINCRONIZAR = "Clas_1432206704640584Ser_3_Alias";
    /** <code>sincronizar</code> service name. */
    public static final String SERV_NAME_SINCRONIZAR = "sincronizar";
    /** <code>sincronizar</code> service alias. */
    public static final String SERV_ALIAS_SINCRONIZAR = "sincronizar";
    /** Agents allowed to execute the service sincronizar **/
    public static final String SINCRONIZAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>paissincronizarpthisPais</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PAISSINCRONIZARPTHISPAIS = "p_thisPais";
    /** <code>paissincronizarpthisPais</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PAISSINCRONIZARPTHISPAIS = "Clas_1432206704640584Ser_3Arg_1_Alias";
    /** <code>paissincronizarpthisPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PAISSINCRONIZARPTHISPAIS = "País";
    /** <code>paissincronizarpDescripcion</code> inbound argument name. */
    public static final String ARG_NAME_SINCRONIZAR_PAISSINCRONIZARPDESCRIPCION = "p_Descripcion";
    /** <code>paissincronizarpDescripcion</code> inbound argument id. */
    public static final String ARG_ID_SINCRONIZAR_PAISSINCRONIZARPDESCRIPCION = "Clas_1432206704640584Ser_3Arg_2_Alias";
    /** <code>paissincronizarpDescripcion</code> inbound argument alias. */
    public static final String ARG_ALIAS_SINCRONIZAR_PAISSINCRONIZARPDESCRIPCION = "Descripción";
    // Service (InsPaisDireccion)
    /** <code>InsPaisDireccion</code> service id. */
    public static final String SERV_ID_INSPAISDIRECCION = "Clas_1432206704640584Ser_4_Alias";
    /** <code>InsPaisDireccion</code> service name. */
    public static final String SERV_NAME_INSPAISDIRECCION = "InsPaisDireccion";
    /** <code>InsPaisDireccion</code> service alias. */
    public static final String SERV_ALIAS_INSPAISDIRECCION = "InsPaisDireccion";
    /** Agents allowed to execute the service InsPaisDireccion **/
    public static final String INSPAISDIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>paisInsPaisDireccionpthisPais</code> inbound argument name. */
    public static final String ARG_NAME_INSPAISDIRECCION_PAISINSPAISDIRECCIONPTHISPAIS = "p_thisPais";
    /** <code>paisInsPaisDireccionpthisPais</code> inbound argument id. */
    public static final String ARG_ID_INSPAISDIRECCION_PAISINSPAISDIRECCIONPTHISPAIS = "Clas_1432206704640584Ser_4Arg_1_Alias";
    /** <code>paisInsPaisDireccionpthisPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPAISDIRECCION_PAISINSPAISDIRECCIONPTHISPAIS = "País";
    /** <code>paisInsPaisDireccionpevcDireccion</code> inbound argument name. */
    public static final String ARG_NAME_INSPAISDIRECCION_PAISINSPAISDIRECCIONPEVCDIRECCION = "p_evcDireccion";
    /** <code>paisInsPaisDireccionpevcDireccion</code> inbound argument id. */
    public static final String ARG_ID_INSPAISDIRECCION_PAISINSPAISDIRECCIONPEVCDIRECCION = "Clas_1432206704640584Ser_4Arg_2_Alias";
    /** <code>paisInsPaisDireccionpevcDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPAISDIRECCION_PAISINSPAISDIRECCIONPEVCDIRECCION = "Direcciones";
    // Service (DelPaisDireccion)
    /** <code>DelPaisDireccion</code> service id. */
    public static final String SERV_ID_DELPAISDIRECCION = "Clas_1432206704640584Ser_5_Alias";
    /** <code>DelPaisDireccion</code> service name. */
    public static final String SERV_NAME_DELPAISDIRECCION = "DelPaisDireccion";
    /** <code>DelPaisDireccion</code> service alias. */
    public static final String SERV_ALIAS_DELPAISDIRECCION = "DelPaisDireccion";
    /** Agents allowed to execute the service DelPaisDireccion **/
    public static final String DELPAISDIRECCION_SRVAGENTS = "";
    // Inbound arguments
    /** <code>paisDelPaisDireccionpthisPais</code> inbound argument name. */
    public static final String ARG_NAME_DELPAISDIRECCION_PAISDELPAISDIRECCIONPTHISPAIS = "p_thisPais";
    /** <code>paisDelPaisDireccionpthisPais</code> inbound argument id. */
    public static final String ARG_ID_DELPAISDIRECCION_PAISDELPAISDIRECCIONPTHISPAIS = "Clas_1432206704640584Ser_5Arg_1_Alias";
    /** <code>paisDelPaisDireccionpthisPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPAISDIRECCION_PAISDELPAISDIRECCIONPTHISPAIS = "País";
    /** <code>paisDelPaisDireccionpevcDireccion</code> inbound argument name. */
    public static final String ARG_NAME_DELPAISDIRECCION_PAISDELPAISDIRECCIONPEVCDIRECCION = "p_evcDireccion";
    /** <code>paisDelPaisDireccionpevcDireccion</code> inbound argument id. */
    public static final String ARG_ID_DELPAISDIRECCION_PAISDELPAISDIRECCIONPEVCDIRECCION = "Clas_1432206704640584Ser_5Arg_2_Alias";
    /** <code>paisDelPaisDireccionpevcDireccion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPAISDIRECCION_PAISDELPAISDIRECCIONPEVCDIRECCION = "Direcciones";
    // Service (InsPaisC)
    /** <code>InsPaisC</code> service id. */
    public static final String SERV_ID_INSPAISC = "Clas_1432206704640584Ser_8_Alias";
    /** <code>InsPaisC</code> service name. */
    public static final String SERV_NAME_INSPAISC = "InsPaisC";
    /** <code>InsPaisC</code> service alias. */
    public static final String SERV_ALIAS_INSPAISC = "InsPaisC";
    /** Agents allowed to execute the service InsPaisC **/
    public static final String INSPAISC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>paisInsPaisCpthisPais</code> inbound argument name. */
    public static final String ARG_NAME_INSPAISC_PAISINSPAISCPTHISPAIS = "p_thisPais";
    /** <code>paisInsPaisCpthisPais</code> inbound argument id. */
    public static final String ARG_ID_INSPAISC_PAISINSPAISCPTHISPAIS = "Clas_1432206704640584Ser_8Arg_1_Alias";
    /** <code>paisInsPaisCpthisPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPAISC_PAISINSPAISCPTHISPAIS = "Pais";
    /** <code>paisInsPaisCpevcDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_INSPAISC_PAISINSPAISCPEVCDIRECCIONC = "p_evcDireccionC";
    /** <code>paisInsPaisCpevcDireccionC</code> inbound argument id. */
    public static final String ARG_ID_INSPAISC_PAISINSPAISCPEVCDIRECCIONC = "Clas_1432206704640584Ser_8Arg_2_Alias";
    /** <code>paisInsPaisCpevcDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPAISC_PAISINSPAISCPEVCDIRECCIONC = "Direcciones";
    // Service (DelPaisC)
    /** <code>DelPaisC</code> service id. */
    public static final String SERV_ID_DELPAISC = "Clas_1432206704640584Ser_9_Alias";
    /** <code>DelPaisC</code> service name. */
    public static final String SERV_NAME_DELPAISC = "DelPaisC";
    /** <code>DelPaisC</code> service alias. */
    public static final String SERV_ALIAS_DELPAISC = "DelPaisC";
    /** Agents allowed to execute the service DelPaisC **/
    public static final String DELPAISC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>paisDelPaisCpthisPais</code> inbound argument name. */
    public static final String ARG_NAME_DELPAISC_PAISDELPAISCPTHISPAIS = "p_thisPais";
    /** <code>paisDelPaisCpthisPais</code> inbound argument id. */
    public static final String ARG_ID_DELPAISC_PAISDELPAISCPTHISPAIS = "Clas_1432206704640584Ser_9Arg_1_Alias";
    /** <code>paisDelPaisCpthisPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPAISC_PAISDELPAISCPTHISPAIS = "Pais";
    /** <code>paisDelPaisCpevcDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_DELPAISC_PAISDELPAISCPEVCDIRECCIONC = "p_evcDireccionC";
    /** <code>paisDelPaisCpevcDireccionC</code> inbound argument id. */
    public static final String ARG_ID_DELPAISC_PAISDELPAISCPEVCDIRECCIONC = "Clas_1432206704640584Ser_9Arg_2_Alias";
    /** <code>paisDelPaisCpevcDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPAISC_PAISDELPAISCPEVCDIRECCIONC = "Direcciones";
    // Service (InsPaisDirSucursalC)
    /** <code>InsPaisDirSucursalC</code> service id. */
    public static final String SERV_ID_INSPAISDIRSUCURSALC = "Clas_1432206704640584Ser_10_Alias";
    /** <code>InsPaisDirSucursalC</code> service name. */
    public static final String SERV_NAME_INSPAISDIRSUCURSALC = "InsPaisDirSucursalC";
    /** <code>InsPaisDirSucursalC</code> service alias. */
    public static final String SERV_ALIAS_INSPAISDIRSUCURSALC = "InsPaisDirSucursalC";
    /** Agents allowed to execute the service InsPaisDirSucursalC **/
    public static final String INSPAISDIRSUCURSALC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>paisInsPaisDirSucursalCpthisPais</code> inbound argument name. */
    public static final String ARG_NAME_INSPAISDIRSUCURSALC_PAISINSPAISDIRSUCURSALCPTHISPAIS = "p_thisPais";
    /** <code>paisInsPaisDirSucursalCpthisPais</code> inbound argument id. */
    public static final String ARG_ID_INSPAISDIRSUCURSALC_PAISINSPAISDIRSUCURSALCPTHISPAIS = "Clas_1432206704640584Ser_10Arg_1_Alias";
    /** <code>paisInsPaisDirSucursalCpthisPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPAISDIRSUCURSALC_PAISINSPAISDIRSUCURSALCPTHISPAIS = "Pais";
    /** <code>paisInsPaisDirSucursalCpevcDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_INSPAISDIRSUCURSALC_PAISINSPAISDIRSUCURSALCPEVCDIRSUCURSALC = "p_evcDirSucursalC";
    /** <code>paisInsPaisDirSucursalCpevcDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_INSPAISDIRSUCURSALC_PAISINSPAISDIRSUCURSALCPEVCDIRSUCURSALC = "Clas_1432206704640584Ser_10Arg_2_Alias";
    /** <code>paisInsPaisDirSucursalCpevcDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPAISDIRSUCURSALC_PAISINSPAISDIRSUCURSALCPEVCDIRSUCURSALC = "Sucursales";
    // Service (DelPaisDirSucursalC)
    /** <code>DelPaisDirSucursalC</code> service id. */
    public static final String SERV_ID_DELPAISDIRSUCURSALC = "Clas_1432206704640584Ser_11_Alias";
    /** <code>DelPaisDirSucursalC</code> service name. */
    public static final String SERV_NAME_DELPAISDIRSUCURSALC = "DelPaisDirSucursalC";
    /** <code>DelPaisDirSucursalC</code> service alias. */
    public static final String SERV_ALIAS_DELPAISDIRSUCURSALC = "DelPaisDirSucursalC";
    /** Agents allowed to execute the service DelPaisDirSucursalC **/
    public static final String DELPAISDIRSUCURSALC_SRVAGENTS = "";
    // Inbound arguments
    /** <code>paisDelPaisDirSucursalCpthisPais</code> inbound argument name. */
    public static final String ARG_NAME_DELPAISDIRSUCURSALC_PAISDELPAISDIRSUCURSALCPTHISPAIS = "p_thisPais";
    /** <code>paisDelPaisDirSucursalCpthisPais</code> inbound argument id. */
    public static final String ARG_ID_DELPAISDIRSUCURSALC_PAISDELPAISDIRSUCURSALCPTHISPAIS = "Clas_1432206704640584Ser_11Arg_1_Alias";
    /** <code>paisDelPaisDirSucursalCpthisPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPAISDIRSUCURSALC_PAISDELPAISDIRSUCURSALCPTHISPAIS = "Pais";
    /** <code>paisDelPaisDirSucursalCpevcDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_DELPAISDIRSUCURSALC_PAISDELPAISDIRSUCURSALCPEVCDIRSUCURSALC = "p_evcDirSucursalC";
    /** <code>paisDelPaisDirSucursalCpevcDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_DELPAISDIRSUCURSALC_PAISDELPAISDIRSUCURSALCPEVCDIRSUCURSALC = "Clas_1432206704640584Ser_11Arg_2_Alias";
    /** <code>paisDelPaisDirSucursalCpevcDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPAISDIRSUCURSALC_PAISDELPAISDIRSUCURSALCPEVCDIRSUCURSALC = "Sucursales";

    public static final String FILTER_NAME_IFPAISCODIGO = "iF_PaisCodigo";
    public static final String VAR_NAME_IFPAISCODIGO_VCODIGO = "v_Codigo";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_PAISDESCRIPCION.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_PAISCODIGO.toUpperCase(), PAISCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_PAISDESCRIPCION.toUpperCase(), PAISDESCRIPCION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Pais', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Pais', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_PAISCODIGO);
        }
        // Facet 'Pais' (This facet)
        if (PaisConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_PAISCODIGO);
        }
        return returnList;
    }
}
