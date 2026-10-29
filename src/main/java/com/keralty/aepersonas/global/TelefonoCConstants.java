package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>TelefonoC</code> model class.
 */
public final class TelefonoCConstants {

    private TelefonoCConstants() {

    }

    // Class
    /** <code>TelefonoC</code> class id. */
    public static final String CLASS_ID = "Clas_1432202510336974_Alias";
    /** <code>TelefonoC</code> class name. */
    public static final String CLASS_NAME = "TelefonoC";
    /** <code>TelefonoC</code> class alias. */
    public static final String CLASS_ALIAS = "Teléfono";
    /** <code>TelefonoC</code> class table name. */
    public static final String TBL_NAME = "TelefonoC";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "telefonoCID,dirSucursalCDirSucursalCCodigo,direccionCDireccionCCodigo,telefonoCCodigo,telefonoCTelefono,telefonoCIndicativoPais,telefonoCCodigoArea,telefonoCExt";

    

    // Attribute (telefonoCID)
    /** <code>telefonoCID</code> attribute id. */
    public static final String ATTR_ID_TELEFONOCID = "Clas_1432202510336974Atr_8_Alias";
    /** <code>telefonoCID</code> attribute name. */
    public static final String ATTR_NAME_TELEFONOCID = "telefonoCID";
    /** <code>telefonoCID</code> attribute alias. */
    public static final String ATTR_ALIAS_TELEFONOCID = "Id interno";

    /** <code>telefonoCID</code> attribute facet sequence. */
    public static final String PATH_FACETS_TELEFONOCID = "";
    /** Agents allowed to view the attribute telefonoCID **/
    public static final String TELEFONOCID_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (telefonoCCodigo)
    /** <code>telefonoCCodigo</code> attribute id. */
    public static final String ATTR_ID_TELEFONOCCODIGO = "Clas_1432202510336974Atr_3_Alias";
    /** <code>telefonoCCodigo</code> attribute name. */
    public static final String ATTR_NAME_TELEFONOCCODIGO = "telefonoCCodigo";
    /** <code>telefonoCCodigo</code> attribute alias. */
    public static final String ATTR_ALIAS_TELEFONOCCODIGO = "Código";

    /** <code>telefonoCCodigo</code> attribute facet sequence. */
    public static final String PATH_FACETS_TELEFONOCCODIGO = "";
    /** Agents allowed to view the attribute telefonoCCodigo **/
    public static final String TELEFONOCCODIGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (telefonoCTelefono)
    /** <code>telefonoCTelefono</code> attribute id. */
    public static final String ATTR_ID_TELEFONOCTELEFONO = "Clas_1432202510336974Atr_4_Alias";
    /** <code>telefonoCTelefono</code> attribute name. */
    public static final String ATTR_NAME_TELEFONOCTELEFONO = "telefonoCTelefono";
    /** <code>telefonoCTelefono</code> attribute alias. */
    public static final String ATTR_ALIAS_TELEFONOCTELEFONO = "Teléfono";

    /** <code>telefonoCTelefono</code> attribute facet sequence. */
    public static final String PATH_FACETS_TELEFONOCTELEFONO = "";
    /** Agents allowed to view the attribute telefonoCTelefono **/
    public static final String TELEFONOCTELEFONO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (telefonoCIndicativoPais)
    /** <code>telefonoCIndicativoPais</code> attribute id. */
    public static final String ATTR_ID_TELEFONOCINDICATIVOPAIS = "Clas_1432202510336974Atr_5_Alias";
    /** <code>telefonoCIndicativoPais</code> attribute name. */
    public static final String ATTR_NAME_TELEFONOCINDICATIVOPAIS = "telefonoCIndicativoPais";
    /** <code>telefonoCIndicativoPais</code> attribute alias. */
    public static final String ATTR_ALIAS_TELEFONOCINDICATIVOPAIS = "Indicativo País";

    /** <code>telefonoCIndicativoPais</code> attribute facet sequence. */
    public static final String PATH_FACETS_TELEFONOCINDICATIVOPAIS = "";
    /** Agents allowed to view the attribute telefonoCIndicativoPais **/
    public static final String TELEFONOCINDICATIVOPAIS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (telefonoCCodigoArea)
    /** <code>telefonoCCodigoArea</code> attribute id. */
    public static final String ATTR_ID_TELEFONOCCODIGOAREA = "Clas_1432202510336974Atr_6_Alias";
    /** <code>telefonoCCodigoArea</code> attribute name. */
    public static final String ATTR_NAME_TELEFONOCCODIGOAREA = "telefonoCCodigoArea";
    /** <code>telefonoCCodigoArea</code> attribute alias. */
    public static final String ATTR_ALIAS_TELEFONOCCODIGOAREA = "Código Área";

    /** <code>telefonoCCodigoArea</code> attribute facet sequence. */
    public static final String PATH_FACETS_TELEFONOCCODIGOAREA = "";
    /** Agents allowed to view the attribute telefonoCCodigoArea **/
    public static final String TELEFONOCCODIGOAREA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (telefonoCExt)
    /** <code>telefonoCExt</code> attribute id. */
    public static final String ATTR_ID_TELEFONOCEXT = "Clas_1432202510336974Atr_7_Alias";
    /** <code>telefonoCExt</code> attribute name. */
    public static final String ATTR_NAME_TELEFONOCEXT = "telefonoCExt";
    /** <code>telefonoCExt</code> attribute alias. */
    public static final String ATTR_ALIAS_TELEFONOCEXT = "Extensión";

    /** <code>telefonoCExt</code> attribute facet sequence. */
    public static final String PATH_FACETS_TELEFONOCEXT = "";
    /** Agents allowed to view the attribute telefonoCExt **/
    public static final String TELEFONOCEXT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (ID)
    /** <code>ID</code> field name. */
    public static final String FLD_TELEFONOCID = "ID";    
    /** <code>telefonoCID</code> attribute field name. */
    public static final String ATTR_FIELD_TELEFONOCID = "telefonoCID";
    // Field (DirSucursalC_Codigo)
    /** <code>DirSucursalC_Codigo</code> field name. */
    public static final String FLD_DIRSUCURSALCDIRSUCURSALCCODIGO = "DirSucursalC_Codigo";    
    /** <code>DirSucursalC.dirSucursalCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DIRSUCURSALC_DIRSUCURSALCCODIGO = "dirSucursalCDirSucursalCCodigo";
    // Field (DireccionC_Codigo)
    /** <code>DireccionC_Codigo</code> field name. */
    public static final String FLD_DIRECCIONCDIRECCIONCCODIGO = "DireccionC_Codigo";    
    /** <code>DireccionC.direccionCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_DIRECCIONC_DIRECCIONCCODIGO = "direccionCDireccionCCodigo";
    // Field (Codigo)
    /** <code>Codigo</code> field name. */
    public static final String FLD_TELEFONOCCODIGO = "Codigo";    
    /** <code>telefonoCCodigo</code> attribute field name. */
    public static final String ATTR_FIELD_TELEFONOCCODIGO = "telefonoCCodigo";
    // Field (Telefono)
    /** <code>Telefono</code> field name. */
    public static final String FLD_TELEFONOCTELEFONO = "Telefono";    
    /** <code>Telefono</code> field length. */
    public static final int FLD_TELEFONOCTELEFONOLENGTH = 15;
    /** <code>telefonoCTelefono</code> attribute field name. */
    public static final String ATTR_FIELD_TELEFONOCTELEFONO = "telefonoCTelefono";
    // Field (IndicativoPais)
    /** <code>IndicativoPais</code> field name. */
    public static final String FLD_TELEFONOCINDICATIVOPAIS = "IndicativoPais";    
    /** <code>IndicativoPais</code> field length. */
    public static final int FLD_TELEFONOCINDICATIVOPAISLENGTH = 10;
    /** <code>telefonoCIndicativoPais</code> attribute field name. */
    public static final String ATTR_FIELD_TELEFONOCINDICATIVOPAIS = "telefonoCIndicativoPais";
    // Field (CodigoArea)
    /** <code>CodigoArea</code> field name. */
    public static final String FLD_TELEFONOCCODIGOAREA = "CodigoArea";    
    /** <code>CodigoArea</code> field length. */
    public static final int FLD_TELEFONOCCODIGOAREALENGTH = 10;
    /** <code>telefonoCCodigoArea</code> attribute field name. */
    public static final String ATTR_FIELD_TELEFONOCCODIGOAREA = "telefonoCCodigoArea";
    // Field (Ext)
    /** <code>Ext</code> field name. */
    public static final String FLD_TELEFONOCEXT = "Ext";    
    /** <code>Ext</code> field length. */
    public static final int FLD_TELEFONOCEXTLENGTH = 10;
    /** <code>telefonoCExt</code> attribute field name. */
    public static final String ATTR_FIELD_TELEFONOCEXT = "telefonoCExt";

    // Component role (DirSucursalC)
    /** <code>DirSucursalC</code> role id. */
    public static final String ROLE_ID_DIRSUCURSALC = "Agr_1437649993728379_Alias";
    /** <code>DirSucursalC</code> role name. */
    public static final String ROLE_NAME_DIRSUCURSALC = "dirSucursalC";
    /** <code>DirSucursalC</code> role alias. */
    public static final String ROLE_ALIAS_DIRSUCURSALC = "DirSucursalC";

    /** <code>DirSucursalC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRSUCURSALC = DirSucursalCConstants.ROLE_NAME_TELEFONOSC;
    /** <code>DirSucursalC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRSUCURSALC = "";
    /** <code>DirSucursalC</code> role target class. */
    public static final String ROLE_TARGET_DIRSUCURSALC = DirSucursalCConstants.CLASS_NAME;

    /** Agents allowed to navigate through DirSucursalC **/
    public static final String DIRSUCURSALC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (DireccionC)
    /** <code>DireccionC</code> role id. */
    public static final String ROLE_ID_DIRECCIONC = "Agr_1437649993728997_Alias";
    /** <code>DireccionC</code> role name. */
    public static final String ROLE_NAME_DIRECCIONC = "direccionC";
    /** <code>DireccionC</code> role alias. */
    public static final String ROLE_ALIAS_DIRECCIONC = "DireccionC";

    /** <code>DireccionC</code> inverse role name. */
    public static final String ROLE_INVNAME_DIRECCIONC = DireccionCConstants.ROLE_NAME_TELEFONOSC;
    /** <code>DireccionC</code> role facet sequence. */
    public static final String PATH_FACETS_DIRECCIONC = "";
    /** <code>DireccionC</code> role target class. */
    public static final String ROLE_TARGET_DIRECCIONC = DireccionCConstants.CLASS_NAME;

    /** Agents allowed to navigate through DireccionC **/
    public static final String DIRECCIONC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1432202510336974Ser_4_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear teléfono";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>telefonoCcrearpagrDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TELEFONOCCREARPAGRDIRSUCURSALC = "p_agrDirSucursalC";
    /** <code>telefonoCcrearpagrDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TELEFONOCCREARPAGRDIRSUCURSALC = "Clas_1432202510336974Ser_4Arg_2_Alias";
    /** <code>telefonoCcrearpagrDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TELEFONOCCREARPAGRDIRSUCURSALC = "DirSucursalC";
    /** <code>telefonoCcrearpagrDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TELEFONOCCREARPAGRDIRECCIONC = "p_agrDireccionC";
    /** <code>telefonoCcrearpagrDireccionC</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TELEFONOCCREARPAGRDIRECCIONC = "Clas_1432202510336974Ser_4Arg_12_Alias";
    /** <code>telefonoCcrearpagrDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TELEFONOCCREARPAGRDIRECCIONC = "DireccionC";
    /** <code>telefonoCcrearpatrTelefono</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TELEFONOCCREARPATRTELEFONO = "p_atrTelefono";
    /** <code>telefonoCcrearpatrTelefono</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TELEFONOCCREARPATRTELEFONO = "Clas_1432202510336974Ser_4Arg_3_Alias";
    /** <code>telefonoCcrearpatrTelefono</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TELEFONOCCREARPATRTELEFONO = "Teléfono";
    /** <code>telefonoCcrearpatrIndicativoPais</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TELEFONOCCREARPATRINDICATIVOPAIS = "p_atrIndicativoPais";
    /** <code>telefonoCcrearpatrIndicativoPais</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TELEFONOCCREARPATRINDICATIVOPAIS = "Clas_1432202510336974Ser_4Arg_4_Alias";
    /** <code>telefonoCcrearpatrIndicativoPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TELEFONOCCREARPATRINDICATIVOPAIS = "Indicativo País";
    /** <code>telefonoCcrearpatrCodigoArea</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TELEFONOCCREARPATRCODIGOAREA = "p_atrCodigoArea";
    /** <code>telefonoCcrearpatrCodigoArea</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TELEFONOCCREARPATRCODIGOAREA = "Clas_1432202510336974Ser_4Arg_5_Alias";
    /** <code>telefonoCcrearpatrCodigoArea</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TELEFONOCCREARPATRCODIGOAREA = "Código Área";
    /** <code>telefonoCcrearpatrExt</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TELEFONOCCREARPATREXT = "p_atrExt";
    /** <code>telefonoCcrearpatrExt</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TELEFONOCCREARPATREXT = "Clas_1432202510336974Ser_4Arg_6_Alias";
    /** <code>telefonoCcrearpatrExt</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TELEFONOCCREARPATREXT = "Extensión";
    /** <code>telefonoCcrearpatrCodigo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_TELEFONOCCREARPATRCODIGO = "p_atrCodigo";
    /** <code>telefonoCcrearpatrCodigo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_TELEFONOCCREARPATRCODIGO = "Clas_1432202510336974Ser_4Arg_7_Alias";
    /** <code>telefonoCcrearpatrCodigo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_TELEFONOCCREARPATRCODIGO = "Código";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1432202510336974Ser_5_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar teléfono";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>telefonoCeliminarpthisTelefonoC</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_TELEFONOCELIMINARPTHISTELEFONOC = "p_thisTelefonoC";
    /** <code>telefonoCeliminarpthisTelefonoC</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_TELEFONOCELIMINARPTHISTELEFONOC = "Clas_1432202510336974Ser_5Arg_1_Alias";
    /** <code>telefonoCeliminarpthisTelefonoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_TELEFONOCELIMINARPTHISTELEFONOC = "Teléfono";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1432202510336974Ser_6_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar teléfono";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>telefonoCmodificarpthisTelefonoC</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TELEFONOCMODIFICARPTHISTELEFONOC = "p_thisTelefonoC";
    /** <code>telefonoCmodificarpthisTelefonoC</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TELEFONOCMODIFICARPTHISTELEFONOC = "Clas_1432202510336974Ser_6Arg_1_Alias";
    /** <code>telefonoCmodificarpthisTelefonoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TELEFONOCMODIFICARPTHISTELEFONOC = "Teléfono";
    /** <code>telefonoCmodificarpTelefono</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TELEFONOCMODIFICARPTELEFONO = "p_Telefono";
    /** <code>telefonoCmodificarpTelefono</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TELEFONOCMODIFICARPTELEFONO = "Clas_1432202510336974Ser_6Arg_2_Alias";
    /** <code>telefonoCmodificarpTelefono</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TELEFONOCMODIFICARPTELEFONO = "Teléfono";
    /** <code>telefonoCmodificarpIndicativoPais</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TELEFONOCMODIFICARPINDICATIVOPAIS = "p_IndicativoPais";
    /** <code>telefonoCmodificarpIndicativoPais</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TELEFONOCMODIFICARPINDICATIVOPAIS = "Clas_1432202510336974Ser_6Arg_3_Alias";
    /** <code>telefonoCmodificarpIndicativoPais</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TELEFONOCMODIFICARPINDICATIVOPAIS = "Indicativo País";
    /** <code>telefonoCmodificarpCodigoArea</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TELEFONOCMODIFICARPCODIGOAREA = "p_CodigoArea";
    /** <code>telefonoCmodificarpCodigoArea</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TELEFONOCMODIFICARPCODIGOAREA = "Clas_1432202510336974Ser_6Arg_4_Alias";
    /** <code>telefonoCmodificarpCodigoArea</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TELEFONOCMODIFICARPCODIGOAREA = "Código Área";
    /** <code>telefonoCmodificarpExt</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_TELEFONOCMODIFICARPEXT = "p_Ext";
    /** <code>telefonoCmodificarpExt</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_TELEFONOCMODIFICARPEXT = "Clas_1432202510336974Ser_6Arg_5_Alias";
    /** <code>telefonoCmodificarpExt</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_TELEFONOCMODIFICARPEXT = "Extensión";
    // Service (TCREARFROMDIRWS)
    /** <code>TCREARFROMDIRWS</code> service id. */
    public static final String SERV_ID_TCREARFROMDIRWS = "Clas_1432202510336974Ser_7_Alias";
    /** <code>TCREARFROMDIRWS</code> service name. */
    public static final String SERV_NAME_TCREARFROMDIRWS = "TCREARFROMDIRWS";
    /** <code>TCREARFROMDIRWS</code> service alias. */
    public static final String SERV_ALIAS_TCREARFROMDIRWS = "TCREARFROMDIRWS";
    /** Agents allowed to execute the service TCREARFROMDIRWS **/
    public static final String TCREARFROMDIRWS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>telefonoCTCREARFROMDIRWSpDireccionC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFROMDIRWS_TELEFONOCTCREARFROMDIRWSPDIRECCIONC = "pDireccionC";
    /** <code>telefonoCTCREARFROMDIRWSpDireccionC</code> inbound argument id. */
    public static final String ARG_ID_TCREARFROMDIRWS_TELEFONOCTCREARFROMDIRWSPDIRECCIONC = "Clas_1432202510336974Ser_7Arg_1_Alias";
    /** <code>telefonoCTCREARFROMDIRWSpDireccionC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFROMDIRWS_TELEFONOCTCREARFROMDIRWSPDIRECCIONC = "Dirección";
    /** <code>telefonoCTCREARFROMDIRWSpTelefonoC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFROMDIRWS_TELEFONOCTCREARFROMDIRWSPTELEFONOC = "pTelefonoC";
    /** <code>telefonoCTCREARFROMDIRWSpTelefonoC</code> inbound argument id. */
    public static final String ARG_ID_TCREARFROMDIRWS_TELEFONOCTCREARFROMDIRWSPTELEFONOC = "Clas_1432202510336974Ser_7Arg_2_Alias";
    /** <code>telefonoCTCREARFROMDIRWSpTelefonoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFROMDIRWS_TELEFONOCTCREARFROMDIRWSPTELEFONOC = "Teléfono";
    // Service (TCREARFROMDIRSUCWS)
    /** <code>TCREARFROMDIRSUCWS</code> service id. */
    public static final String SERV_ID_TCREARFROMDIRSUCWS = "Clas_1432202510336974Ser_8_Alias";
    /** <code>TCREARFROMDIRSUCWS</code> service name. */
    public static final String SERV_NAME_TCREARFROMDIRSUCWS = "TCREARFROMDIRSUCWS";
    /** <code>TCREARFROMDIRSUCWS</code> service alias. */
    public static final String SERV_ALIAS_TCREARFROMDIRSUCWS = "TCREARFROMDIRSUCWS";
    /** Agents allowed to execute the service TCREARFROMDIRSUCWS **/
    public static final String TCREARFROMDIRSUCWS_SRVAGENTS = "";
    // Inbound arguments
    /** <code>telefonoCTCREARFROMDIRSUCWSpDirSucursalC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFROMDIRSUCWS_TELEFONOCTCREARFROMDIRSUCWSPDIRSUCURSALC = "pDirSucursalC";
    /** <code>telefonoCTCREARFROMDIRSUCWSpDirSucursalC</code> inbound argument id. */
    public static final String ARG_ID_TCREARFROMDIRSUCWS_TELEFONOCTCREARFROMDIRSUCWSPDIRSUCURSALC = "Clas_1432202510336974Ser_8Arg_1_Alias";
    /** <code>telefonoCTCREARFROMDIRSUCWSpDirSucursalC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFROMDIRSUCWS_TELEFONOCTCREARFROMDIRSUCWSPDIRSUCURSALC = "Sucursal";
    /** <code>telefonoCTCREARFROMDIRSUCWSpTelefonoC</code> inbound argument name. */
    public static final String ARG_NAME_TCREARFROMDIRSUCWS_TELEFONOCTCREARFROMDIRSUCWSPTELEFONOC = "pTelefonoC";
    /** <code>telefonoCTCREARFROMDIRSUCWSpTelefonoC</code> inbound argument id. */
    public static final String ARG_ID_TCREARFROMDIRSUCWS_TELEFONOCTCREARFROMDIRSUCWSPTELEFONOC = "Clas_1432202510336974Ser_8Arg_2_Alias";
    /** <code>telefonoCTCREARFROMDIRSUCWSpTelefonoC</code> inbound argument alias. */
    public static final String ARG_ALIAS_TCREARFROMDIRSUCWS_TELEFONOCTCREARFROMDIRSUCWSPTELEFONOC = "Teléfono";


    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_TELEFONOCCODIGO.toUpperCase(), Constants.Type.INT.getTypeName());
        attributeTypes.put(ATTR_NAME_TELEFONOCTELEFONO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TELEFONOCINDICATIVOPAIS.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TELEFONOCCODIGOAREA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_TELEFONOCEXT.toUpperCase(), Constants.Type.STRING.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_TELEFONOCID.toUpperCase(), TELEFONOCID_AGENTS);
    	attributeAgents.put(ATTR_NAME_TELEFONOCCODIGO.toUpperCase(), TELEFONOCCODIGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TELEFONOCTELEFONO.toUpperCase(), TELEFONOCTELEFONO_AGENTS);
    	attributeAgents.put(ATTR_NAME_TELEFONOCINDICATIVOPAIS.toUpperCase(), TELEFONOCINDICATIVOPAIS_AGENTS);
    	attributeAgents.put(ATTR_NAME_TELEFONOCCODIGOAREA.toUpperCase(), TELEFONOCCODIGOAREA_AGENTS);
    	attributeAgents.put(ATTR_NAME_TELEFONOCEXT.toUpperCase(), TELEFONOCEXT_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_DIRSUCURSALC.toUpperCase(), DIRSUCURSALC_AGENTS);
        roleAgents.put(ROLE_NAME_DIRECCIONC.toUpperCase(), DIRECCIONC_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'TelefonoC', it returns the identification keys
     * - If className is a facet of the inheritance net of 'TelefonoC', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_TELEFONOCID);
        }
        // Facet 'TelefonoC' (This facet)
        if (TelefonoCConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_TELEFONOCID);
        }
        return returnList;
    }
}
