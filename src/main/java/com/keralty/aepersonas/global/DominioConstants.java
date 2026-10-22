package com.keralty.aepersonas.global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class with the constants relative to the <code>Dominio</code> model class.
 */
public final class DominioConstants {

    private DominioConstants() {

    }

    // Class
    /** <code>Dominio</code> class id. */
    public static final String CLASS_ID = "Clas_1431701422080423_Alias";
    /** <code>Dominio</code> class name. */
    public static final String CLASS_NAME = "Dominio";
    /** <code>Dominio</code> class alias. */
    public static final String CLASS_ALIAS = "Dominio";
    /** <code>Dominio</code> class table name. */
    public static final String TBL_NAME = "Dominio";

    // Default DisplaySet
    public static final String DEFAULT_DISPLAYSET = "dominioNumero,planesPlan,productosProducto,grupoAsignacionId,grupoAsignacionGrupoAreaMedicaId,dominioReqCuesMed,dominioNoCuesMedTras,dominioNuevaAfiliacion,dominioInclusion,dominioAcepCuesMat,dominioAcepCuesNeo,dominioAcepBBGestante,dominioMostrarPreexAnexos,dominioMostrarPreexContrato,dominioIgnorarPreexistencias,dominioRespClauNombre,dominioRespClauCelula,dominioRespClauExpCelula,dominioRespClauCargo,dominioDiaIniVigencia,dominioDiaFinVigencia,dominioDiasCaducidad,dominioProrrateoUsuExistente,dominioInclusionModGrupoAsoc,dominioPermiteRechazadosAfi,dominioAcepPolizaInter,dominioNovExcepcionReqDoc,dominioSolNovColorOscuro,dominioSolNovColorClaro,dominioSolNovLogo,dominioTramiteEnLinea,dominioVigenciaRadicacion";

    public static final String DSICDOMINIO = "IC_Dominio";
    public static final String DSDSDOMINIOPIU = "DS_Dominio_PIU";
    public static final String DSDSDOMINIOIIU = "DS_Dominio_IIU";
    public static final String DSDSDOMINIOIIUREPORTES = "DS_Dominio_IIUReportes";
    public static final String DSDSDOMINIOFIRMARESPCLAUSULADO = "DS_Dominio_FirmaRespClausulado";
    public static final String DSDSDOMINIOSOLNOVEDAD = "DS_Dominio_SolNovedad";
    public static final String DSDSDOMINIOMGRUPOASESORES = "DS_Dominio_M_GrupoAsesores";
    public static final String DSDSDOMINIOMGRUPOAREAMEDICA = "DS_Dominio_M_GrupoAreaMedica";
    public static final String DSDSDOMINIOMGRUPOSUSUARIOS = "DS_Dominio_M_GruposUsuarios";
    public static final String DSDSDOMINIOSPORASESOR = "DS_DominiosPorAsesor";
    public static final String DSDSDOMINIOMLOG = "DS_Dominio_M_Log";
    public static final String DSDSDOMINIODINCOMPATIBLES = "DS_Dominio_D_Incompatibles";
    

    // Attribute (dominioNumero)
    /** <code>dominioNumero</code> attribute id. */
    public static final String ATTR_ID_DOMINIONUMERO = "Clas_1431701422080423Atr_1_Alias";
    /** <code>dominioNumero</code> attribute name. */
    public static final String ATTR_NAME_DOMINIONUMERO = "dominioNumero";
    /** <code>dominioNumero</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIONUMERO = "Número";

    /** <code>dominioNumero</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIONUMERO = "";
    /** Agents allowed to view the attribute dominioNumero **/
    public static final String DOMINIONUMERO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo,Funcionario,Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,RespRegional,Gestor,MesaDeApoyo";
    // Attribute (dominioReqCuesMed)
    /** <code>dominioReqCuesMed</code> attribute id. */
    public static final String ATTR_ID_DOMINIOREQCUESMED = "Clas_1431701422080423Atr_2_Alias";
    /** <code>dominioReqCuesMed</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOREQCUESMED = "dominioReqCuesMed";
    /** <code>dominioReqCuesMed</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOREQCUESMED = "Cuestionario médico";

    /** <code>dominioReqCuesMed</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOREQCUESMED = "";
    /** Agents allowed to view the attribute dominioReqCuesMed **/
    public static final String DOMINIOREQCUESMED_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioNoCuesMedTras)
    /** <code>dominioNoCuesMedTras</code> attribute id. */
    public static final String ATTR_ID_DOMINIONOCUESMEDTRAS = "Clas_1431701422080423Atr_3_Alias";
    /** <code>dominioNoCuesMedTras</code> attribute name. */
    public static final String ATTR_NAME_DOMINIONOCUESMEDTRAS = "dominioNoCuesMedTras";
    /** <code>dominioNoCuesMedTras</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIONOCUESMEDTRAS = "No cuestionario si traslado";

    /** <code>dominioNoCuesMedTras</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIONOCUESMEDTRAS = "";
    /** Agents allowed to view the attribute dominioNoCuesMedTras **/
    public static final String DOMINIONOCUESMEDTRAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioNuevaAfiliacion)
    /** <code>dominioNuevaAfiliacion</code> attribute id. */
    public static final String ATTR_ID_DOMINIONUEVAAFILIACION = "Clas_1431701422080423Atr_4_Alias";
    /** <code>dominioNuevaAfiliacion</code> attribute name. */
    public static final String ATTR_NAME_DOMINIONUEVAAFILIACION = "dominioNuevaAfiliacion";
    /** <code>dominioNuevaAfiliacion</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIONUEVAAFILIACION = "Nueva afiliación";

    /** <code>dominioNuevaAfiliacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIONUEVAAFILIACION = "";
    /** Agents allowed to view the attribute dominioNuevaAfiliacion **/
    public static final String DOMINIONUEVAAFILIACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioInclusion)
    /** <code>dominioInclusion</code> attribute id. */
    public static final String ATTR_ID_DOMINIOINCLUSION = "Clas_1431701422080423Atr_5_Alias";
    /** <code>dominioInclusion</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOINCLUSION = "dominioInclusion";
    /** <code>dominioInclusion</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOINCLUSION = "Inclusión";

    /** <code>dominioInclusion</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOINCLUSION = "";
    /** Agents allowed to view the attribute dominioInclusion **/
    public static final String DOMINIOINCLUSION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioAcepCuesMat)
    /** <code>dominioAcepCuesMat</code> attribute id. */
    public static final String ATTR_ID_DOMINIOACEPCUESMAT = "Clas_1431701422080423Atr_6_Alias";
    /** <code>dominioAcepCuesMat</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOACEPCUESMAT = "dominioAcepCuesMat";
    /** <code>dominioAcepCuesMat</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOACEPCUESMAT = "Cuestionario maternal";

    /** <code>dominioAcepCuesMat</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOACEPCUESMAT = "";
    /** Agents allowed to view the attribute dominioAcepCuesMat **/
    public static final String DOMINIOACEPCUESMAT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioAcepCuesNeo)
    /** <code>dominioAcepCuesNeo</code> attribute id. */
    public static final String ATTR_ID_DOMINIOACEPCUESNEO = "Clas_1431701422080423Atr_7_Alias";
    /** <code>dominioAcepCuesNeo</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOACEPCUESNEO = "dominioAcepCuesNeo";
    /** <code>dominioAcepCuesNeo</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOACEPCUESNEO = "Cuestionario neonatal";

    /** <code>dominioAcepCuesNeo</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOACEPCUESNEO = "";
    /** Agents allowed to view the attribute dominioAcepCuesNeo **/
    public static final String DOMINIOACEPCUESNEO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioAcepBBGestante)
    /** <code>dominioAcepBBGestante</code> attribute id. */
    public static final String ATTR_ID_DOMINIOACEPBBGESTANTE = "Clas_1431701422080423Atr_16_Alias";
    /** <code>dominioAcepBBGestante</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOACEPBBGESTANTE = "dominioAcepBBGestante";
    /** <code>dominioAcepBBGestante</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOACEPBBGESTANTE = "Bebe gestante";

    /** <code>dominioAcepBBGestante</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOACEPBBGESTANTE = "";
    /** Agents allowed to view the attribute dominioAcepBBGestante **/
    public static final String DOMINIOACEPBBGESTANTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioMostrarPreexAnexos)
    /** <code>dominioMostrarPreexAnexos</code> attribute id. */
    public static final String ATTR_ID_DOMINIOMOSTRARPREEXANEXOS = "Clas_1431701422080423Atr_32_Alias";
    /** <code>dominioMostrarPreexAnexos</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOMOSTRARPREEXANEXOS = "dominioMostrarPreexAnexos";
    /** <code>dominioMostrarPreexAnexos</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOMOSTRARPREEXANEXOS = "Mostrar Preexistencias";

    /** <code>dominioMostrarPreexAnexos</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOMOSTRARPREEXANEXOS = "";
    /** Agents allowed to view the attribute dominioMostrarPreexAnexos **/
    public static final String DOMINIOMOSTRARPREEXANEXOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioMostrarPreexContrato)
    /** <code>dominioMostrarPreexContrato</code> attribute id. */
    public static final String ATTR_ID_DOMINIOMOSTRARPREEXCONTRATO = "Clas_1431701422080423Atr_33_Alias";
    /** <code>dominioMostrarPreexContrato</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOMOSTRARPREEXCONTRATO = "dominioMostrarPreexContrato";
    /** <code>dominioMostrarPreexContrato</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOMOSTRARPREEXCONTRATO = "Mostrar Preexistencias en Contrato";

    /** <code>dominioMostrarPreexContrato</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOMOSTRARPREEXCONTRATO = "";
    /** Agents allowed to view the attribute dominioMostrarPreexContrato **/
    public static final String DOMINIOMOSTRARPREEXCONTRATO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioIgnorarPreexistencias)
    /** <code>dominioIgnorarPreexistencias</code> attribute id. */
    public static final String ATTR_ID_DOMINIOIGNORARPREEXISTENCIAS = "Clas_1431701422080423Atr_34_Alias";
    /** <code>dominioIgnorarPreexistencias</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOIGNORARPREEXISTENCIAS = "dominioIgnorarPreexistencias";
    /** <code>dominioIgnorarPreexistencias</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOIGNORARPREEXISTENCIAS = "Ignorar preexistencias";

    /** <code>dominioIgnorarPreexistencias</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOIGNORARPREEXISTENCIAS = "";
    /** Agents allowed to view the attribute dominioIgnorarPreexistencias **/
    public static final String DOMINIOIGNORARPREEXISTENCIAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioRespClauNombre)
    /** <code>dominioRespClauNombre</code> attribute id. */
    public static final String ATTR_ID_DOMINIORESPCLAUNOMBRE = "Clas_1431701422080423Atr_36_Alias";
    /** <code>dominioRespClauNombre</code> attribute name. */
    public static final String ATTR_NAME_DOMINIORESPCLAUNOMBRE = "dominioRespClauNombre";
    /** <code>dominioRespClauNombre</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIORESPCLAUNOMBRE = "Nombre";

    /** <code>dominioRespClauNombre</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIORESPCLAUNOMBRE = "";
    /** Agents allowed to view the attribute dominioRespClauNombre **/
    public static final String DOMINIORESPCLAUNOMBRE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioRespClauCelula)
    /** <code>dominioRespClauCelula</code> attribute id. */
    public static final String ATTR_ID_DOMINIORESPCLAUCELULA = "Clas_1431701422080423Atr_37_Alias";
    /** <code>dominioRespClauCelula</code> attribute name. */
    public static final String ATTR_NAME_DOMINIORESPCLAUCELULA = "dominioRespClauCelula";
    /** <code>dominioRespClauCelula</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIORESPCLAUCELULA = "Nº de célula de ciudadanía";

    /** <code>dominioRespClauCelula</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIORESPCLAUCELULA = "";
    /** Agents allowed to view the attribute dominioRespClauCelula **/
    public static final String DOMINIORESPCLAUCELULA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioRespClauExpCelula)
    /** <code>dominioRespClauExpCelula</code> attribute id. */
    public static final String ATTR_ID_DOMINIORESPCLAUEXPCELULA = "Clas_1431701422080423Atr_38_Alias";
    /** <code>dominioRespClauExpCelula</code> attribute name. */
    public static final String ATTR_NAME_DOMINIORESPCLAUEXPCELULA = "dominioRespClauExpCelula";
    /** <code>dominioRespClauExpCelula</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIORESPCLAUEXPCELULA = "Lugar de expedición";

    /** <code>dominioRespClauExpCelula</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIORESPCLAUEXPCELULA = "";
    /** Agents allowed to view the attribute dominioRespClauExpCelula **/
    public static final String DOMINIORESPCLAUEXPCELULA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioRespClauCargo)
    /** <code>dominioRespClauCargo</code> attribute id. */
    public static final String ATTR_ID_DOMINIORESPCLAUCARGO = "Clas_1431701422080423Atr_39_Alias";
    /** <code>dominioRespClauCargo</code> attribute name. */
    public static final String ATTR_NAME_DOMINIORESPCLAUCARGO = "dominioRespClauCargo";
    /** <code>dominioRespClauCargo</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIORESPCLAUCARGO = "Cargo";

    /** <code>dominioRespClauCargo</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIORESPCLAUCARGO = "";
    /** Agents allowed to view the attribute dominioRespClauCargo **/
    public static final String DOMINIORESPCLAUCARGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioRespClauFirma)
    /** <code>dominioRespClauFirma</code> attribute id. */
    public static final String ATTR_ID_DOMINIORESPCLAUFIRMA = "Clas_1431701422080423Atr_40_Alias";
    /** <code>dominioRespClauFirma</code> attribute name. */
    public static final String ATTR_NAME_DOMINIORESPCLAUFIRMA = "dominioRespClauFirma";
    /** <code>dominioRespClauFirma</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIORESPCLAUFIRMA = "Firma";

    /** <code>dominioRespClauFirma</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIORESPCLAUFIRMA = "";
    /** Agents allowed to view the attribute dominioRespClauFirma **/
    public static final String DOMINIORESPCLAUFIRMA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioDiaIniVigencia)
    /** <code>dominioDiaIniVigencia</code> attribute id. */
    public static final String ATTR_ID_DOMINIODIAINIVIGENCIA = "Clas_1431701422080423Atr_41_Alias";
    /** <code>dominioDiaIniVigencia</code> attribute name. */
    public static final String ATTR_NAME_DOMINIODIAINIVIGENCIA = "dominioDiaIniVigencia";
    /** <code>dominioDiaIniVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIODIAINIVIGENCIA = "Dia inicio vigencia";

    /** <code>dominioDiaIniVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIODIAINIVIGENCIA = "";
    /** Agents allowed to view the attribute dominioDiaIniVigencia **/
    public static final String DOMINIODIAINIVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioDiaFinVigencia)
    /** <code>dominioDiaFinVigencia</code> attribute id. */
    public static final String ATTR_ID_DOMINIODIAFINVIGENCIA = "Clas_1431701422080423Atr_42_Alias";
    /** <code>dominioDiaFinVigencia</code> attribute name. */
    public static final String ATTR_NAME_DOMINIODIAFINVIGENCIA = "dominioDiaFinVigencia";
    /** <code>dominioDiaFinVigencia</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIODIAFINVIGENCIA = "Dia fin vigencia";

    /** <code>dominioDiaFinVigencia</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIODIAFINVIGENCIA = "";
    /** Agents allowed to view the attribute dominioDiaFinVigencia **/
    public static final String DOMINIODIAFINVIGENCIA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioDiasCaducidad)
    /** <code>dominioDiasCaducidad</code> attribute id. */
    public static final String ATTR_ID_DOMINIODIASCADUCIDAD = "Clas_1431701422080423Atr_43_Alias";
    /** <code>dominioDiasCaducidad</code> attribute name. */
    public static final String ATTR_NAME_DOMINIODIASCADUCIDAD = "dominioDiasCaducidad";
    /** <code>dominioDiasCaducidad</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIODIASCADUCIDAD = "Caducidad en días";

    /** <code>dominioDiasCaducidad</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIODIASCADUCIDAD = "";
    /** Agents allowed to view the attribute dominioDiasCaducidad **/
    public static final String DOMINIODIASCADUCIDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioProrrateoUsuExistente)
    /** <code>dominioProrrateoUsuExistente</code> attribute id. */
    public static final String ATTR_ID_DOMINIOPRORRATEOUSUEXISTENTE = "Clas_1431701422080423Atr_45_Alias";
    /** <code>dominioProrrateoUsuExistente</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOPRORRATEOUSUEXISTENTE = "dominioProrrateoUsuExistente";
    /** <code>dominioProrrateoUsuExistente</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOPRORRATEOUSUEXISTENTE = "Prorrateo usuarios existente";

    /** <code>dominioProrrateoUsuExistente</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOPRORRATEOUSUEXISTENTE = "";
    /** Agents allowed to view the attribute dominioProrrateoUsuExistente **/
    public static final String DOMINIOPRORRATEOUSUEXISTENTE_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioInclusionModGrupoAsoc)
    /** <code>dominioInclusionModGrupoAsoc</code> attribute id. */
    public static final String ATTR_ID_DOMINIOINCLUSIONMODGRUPOASOC = "Clas_1431701422080423Atr_46_Alias";
    /** <code>dominioInclusionModGrupoAsoc</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOINCLUSIONMODGRUPOASOC = "dominioInclusionModGrupoAsoc";
    /** <code>dominioInclusionModGrupoAsoc</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOINCLUSIONMODGRUPOASOC = "Modificación grupo asociado";

    /** <code>dominioInclusionModGrupoAsoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOINCLUSIONMODGRUPOASOC = "";
    /** Agents allowed to view the attribute dominioInclusionModGrupoAsoc **/
    public static final String DOMINIOINCLUSIONMODGRUPOASOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioPermiteRechazadosAfi)
    /** <code>dominioPermiteRechazadosAfi</code> attribute id. */
    public static final String ATTR_ID_DOMINIOPERMITERECHAZADOSAFI = "Clas_1431701422080423Atr_47_Alias";
    /** <code>dominioPermiteRechazadosAfi</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOPERMITERECHAZADOSAFI = "dominioPermiteRechazadosAfi";
    /** <code>dominioPermiteRechazadosAfi</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOPERMITERECHAZADOSAFI = "Permite rechazados afiliación";

    /** <code>dominioPermiteRechazadosAfi</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOPERMITERECHAZADOSAFI = "";
    /** Agents allowed to view the attribute dominioPermiteRechazadosAfi **/
    public static final String DOMINIOPERMITERECHAZADOSAFI_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioAcepPolizaInter)
    /** <code>dominioAcepPolizaInter</code> attribute id. */
    public static final String ATTR_ID_DOMINIOACEPPOLIZAINTER = "Clas_1431701422080423Atr_48_Alias";
    /** <code>dominioAcepPolizaInter</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOACEPPOLIZAINTER = "dominioAcepPolizaInter";
    /** <code>dominioAcepPolizaInter</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOACEPPOLIZAINTER = "Poliza Internacional";

    /** <code>dominioAcepPolizaInter</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOACEPPOLIZAINTER = "";
    /** Agents allowed to view the attribute dominioAcepPolizaInter **/
    public static final String DOMINIOACEPPOLIZAINTER_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioNovExcepcionReqDoc)
    /** <code>dominioNovExcepcionReqDoc</code> attribute id. */
    public static final String ATTR_ID_DOMINIONOVEXCEPCIONREQDOC = "Clas_1431701422080423Atr_49_Alias";
    /** <code>dominioNovExcepcionReqDoc</code> attribute name. */
    public static final String ATTR_NAME_DOMINIONOVEXCEPCIONREQDOC = "dominioNovExcepcionReqDoc";
    /** <code>dominioNovExcepcionReqDoc</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIONOVEXCEPCIONREQDOC = "Novedades Excepción requiere documentos";

    /** <code>dominioNovExcepcionReqDoc</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIONOVEXCEPCIONREQDOC = "";
    /** Agents allowed to view the attribute dominioNovExcepcionReqDoc **/
    public static final String DOMINIONOVEXCEPCIONREQDOC_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioSolNovColorOscuro)
    /** <code>dominioSolNovColorOscuro</code> attribute id. */
    public static final String ATTR_ID_DOMINIOSOLNOVCOLOROSCURO = "Clas_1431701422080423Atr_50_Alias";
    /** <code>dominioSolNovColorOscuro</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOSOLNOVCOLOROSCURO = "dominioSolNovColorOscuro";
    /** <code>dominioSolNovColorOscuro</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOSOLNOVCOLOROSCURO = "Color oscuro";

    /** <code>dominioSolNovColorOscuro</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOSOLNOVCOLOROSCURO = "";
    /** Agents allowed to view the attribute dominioSolNovColorOscuro **/
    public static final String DOMINIOSOLNOVCOLOROSCURO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioSolNovColorClaro)
    /** <code>dominioSolNovColorClaro</code> attribute id. */
    public static final String ATTR_ID_DOMINIOSOLNOVCOLORCLARO = "Clas_1431701422080423Atr_51_Alias";
    /** <code>dominioSolNovColorClaro</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOSOLNOVCOLORCLARO = "dominioSolNovColorClaro";
    /** <code>dominioSolNovColorClaro</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOSOLNOVCOLORCLARO = "Color claro";

    /** <code>dominioSolNovColorClaro</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOSOLNOVCOLORCLARO = "";
    /** Agents allowed to view the attribute dominioSolNovColorClaro **/
    public static final String DOMINIOSOLNOVCOLORCLARO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioSolNovLogo)
    /** <code>dominioSolNovLogo</code> attribute id. */
    public static final String ATTR_ID_DOMINIOSOLNOVLOGO = "Clas_1431701422080423Atr_52_Alias";
    /** <code>dominioSolNovLogo</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOSOLNOVLOGO = "dominioSolNovLogo";
    /** <code>dominioSolNovLogo</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOSOLNOVLOGO = "Logo";

    /** <code>dominioSolNovLogo</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOSOLNOVLOGO = "";
    /** Agents allowed to view the attribute dominioSolNovLogo **/
    public static final String DOMINIOSOLNOVLOGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioTramiteEnLinea)
    /** <code>dominioTramiteEnLinea</code> attribute id. */
    public static final String ATTR_ID_DOMINIOTRAMITEENLINEA = "Clas_1431701422080423Atr_54_Alias";
    /** <code>dominioTramiteEnLinea</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOTRAMITEENLINEA = "dominioTramiteEnLinea";
    /** <code>dominioTramiteEnLinea</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOTRAMITEENLINEA = "Trámite en línea";

    /** <code>dominioTramiteEnLinea</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOTRAMITEENLINEA = "";
    /** Agents allowed to view the attribute dominioTramiteEnLinea **/
    public static final String DOMINIOTRAMITEENLINEA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Attribute (dominioVigenciaRadicacion)
    /** <code>dominioVigenciaRadicacion</code> attribute id. */
    public static final String ATTR_ID_DOMINIOVIGENCIARADICACION = "Clas_1431701422080423Atr_55_Alias";
    /** <code>dominioVigenciaRadicacion</code> attribute name. */
    public static final String ATTR_NAME_DOMINIOVIGENCIARADICACION = "dominioVigenciaRadicacion";
    /** <code>dominioVigenciaRadicacion</code> attribute alias. */
    public static final String ATTR_ALIAS_DOMINIOVIGENCIARADICACION = "Vigencia de radicación";

    /** <code>dominioVigenciaRadicacion</code> attribute facet sequence. */
    public static final String PATH_FACETS_DOMINIOVIGENCIARADICACION = "";
    /** Agents allowed to view the attribute dominioVigenciaRadicacion **/
    public static final String DOMINIOVIGENCIARADICACION_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";


    // Field (Numero)
    /** <code>Numero</code> field name. */
    public static final String FLD_DOMINIONUMERO = "Numero";    
    /** <code>dominioNumero</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIONUMERO = "dominioNumero";
    // Field (Plan)
    /** <code>Plan</code> field name. */
    public static final String FLD_PLANESPLAN = "Plan";    
    /** <code>PlanT.planesPlan</code> attribute field name. */
    public static final String ATTR_FIELD_PLANT_PLANESPLAN = "planesPlan";
    // Field (Producto)
    /** <code>Producto</code> field name. */
    public static final String FLD_PRODUCTOSPRODUCTO = "Producto";    
    /** <code>ProductoT.productosProducto</code> attribute field name. */
    public static final String ATTR_FIELD_PRODUCTOT_PRODUCTOSPRODUCTO = "productosProducto";
    // Field (Id)
    /** <code>Id</code> field name. */
    public static final String FLD_GRUPOASIGNACIONID = "Id";    
    /** <code>GrupoAsesores.grupoAsignacionId</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOASESORES_GRUPOASIGNACIONID = "grupoAsignacionId";
    // Field (GrupoAreaMedica_Id)
    /** <code>GrupoAreaMedica_Id</code> field name. */
    public static final String FLD_GRUPOASIGNACIONGRUPOAREAMEDICAID = "GrupoAreaMedica_Id";    
    /** <code>GrupoAreaMedica.grupoAsignacionId</code> attribute field name. */
    public static final String ATTR_FIELD_GRUPOAREAMEDICA_GRUPOASIGNACIONID = "grupoAsignacionGrupoAreaMedicaId";
    // Field (ReqCuesMed)
    /** <code>ReqCuesMed</code> field name. */
    public static final String FLD_DOMINIOREQCUESMED = "ReqCuesMed";    
    /** <code>dominioReqCuesMed</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOREQCUESMED = "dominioReqCuesMed";
    // Field (NoCuesMedTras)
    /** <code>NoCuesMedTras</code> field name. */
    public static final String FLD_DOMINIONOCUESMEDTRAS = "NoCuesMedTras";    
    /** <code>dominioNoCuesMedTras</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIONOCUESMEDTRAS = "dominioNoCuesMedTras";
    // Field (NuevaAfiliacion)
    /** <code>NuevaAfiliacion</code> field name. */
    public static final String FLD_DOMINIONUEVAAFILIACION = "NuevaAfiliacion";    
    /** <code>dominioNuevaAfiliacion</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIONUEVAAFILIACION = "dominioNuevaAfiliacion";
    // Field (Inclusion)
    /** <code>Inclusion</code> field name. */
    public static final String FLD_DOMINIOINCLUSION = "Inclusion";    
    /** <code>dominioInclusion</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOINCLUSION = "dominioInclusion";
    // Field (AcepCuesMat)
    /** <code>AcepCuesMat</code> field name. */
    public static final String FLD_DOMINIOACEPCUESMAT = "AcepCuesMat";    
    /** <code>dominioAcepCuesMat</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOACEPCUESMAT = "dominioAcepCuesMat";
    // Field (AcepCuesNeo)
    /** <code>AcepCuesNeo</code> field name. */
    public static final String FLD_DOMINIOACEPCUESNEO = "AcepCuesNeo";    
    /** <code>dominioAcepCuesNeo</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOACEPCUESNEO = "dominioAcepCuesNeo";
    // Field (AcepBBGestante)
    /** <code>AcepBBGestante</code> field name. */
    public static final String FLD_DOMINIOACEPBBGESTANTE = "AcepBBGestante";    
    /** <code>dominioAcepBBGestante</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOACEPBBGESTANTE = "dominioAcepBBGestante";
    // Field (MostrarPreexAnexos)
    /** <code>MostrarPreexAnexos</code> field name. */
    public static final String FLD_DOMINIOMOSTRARPREEXANEXOS = "MostrarPreexAnexos";    
    /** <code>dominioMostrarPreexAnexos</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOMOSTRARPREEXANEXOS = "dominioMostrarPreexAnexos";
    // Field (MostrarPreexContrato)
    /** <code>MostrarPreexContrato</code> field name. */
    public static final String FLD_DOMINIOMOSTRARPREEXCONTRATO = "MostrarPreexContrato";    
    /** <code>dominioMostrarPreexContrato</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOMOSTRARPREEXCONTRATO = "dominioMostrarPreexContrato";
    // Field (IgnorarPreexistencias)
    /** <code>IgnorarPreexistencias</code> field name. */
    public static final String FLD_DOMINIOIGNORARPREEXISTENCIAS = "IgnorarPreexistencias";    
    /** <code>dominioIgnorarPreexistencias</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOIGNORARPREEXISTENCIAS = "dominioIgnorarPreexistencias";
    // Field (RespClauNombre)
    /** <code>RespClauNombre</code> field name. */
    public static final String FLD_DOMINIORESPCLAUNOMBRE = "RespClauNombre";    
    /** <code>RespClauNombre</code> field length. */
    public static final int FLD_DOMINIORESPCLAUNOMBRELENGTH = 100;
    /** <code>dominioRespClauNombre</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIORESPCLAUNOMBRE = "dominioRespClauNombre";
    // Field (RespClauCelula)
    /** <code>RespClauCelula</code> field name. */
    public static final String FLD_DOMINIORESPCLAUCELULA = "RespClauCelula";    
    /** <code>RespClauCelula</code> field length. */
    public static final int FLD_DOMINIORESPCLAUCELULALENGTH = 15;
    /** <code>dominioRespClauCelula</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIORESPCLAUCELULA = "dominioRespClauCelula";
    // Field (RespClauExpCelula)
    /** <code>RespClauExpCelula</code> field name. */
    public static final String FLD_DOMINIORESPCLAUEXPCELULA = "RespClauExpCelula";    
    /** <code>RespClauExpCelula</code> field length. */
    public static final int FLD_DOMINIORESPCLAUEXPCELULALENGTH = 50;
    /** <code>dominioRespClauExpCelula</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIORESPCLAUEXPCELULA = "dominioRespClauExpCelula";
    // Field (RespClauCargo)
    /** <code>RespClauCargo</code> field name. */
    public static final String FLD_DOMINIORESPCLAUCARGO = "RespClauCargo";    
    /** <code>RespClauCargo</code> field length. */
    public static final int FLD_DOMINIORESPCLAUCARGOLENGTH = 50;
    /** <code>dominioRespClauCargo</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIORESPCLAUCARGO = "dominioRespClauCargo";
    // Field (RespClauFirma)
    /** <code>RespClauFirma</code> field name. */
    public static final String FLD_DOMINIORESPCLAUFIRMA = "RespClauFirma";    
    /** <code>dominioRespClauFirma</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIORESPCLAUFIRMA = "dominioRespClauFirma";
    // Field (DiaIniVigencia)
    /** <code>DiaIniVigencia</code> field name. */
    public static final String FLD_DOMINIODIAINIVIGENCIA = "DiaIniVigencia";    
    /** <code>dominioDiaIniVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIODIAINIVIGENCIA = "dominioDiaIniVigencia";
    // Field (DiaFinVigencia)
    /** <code>DiaFinVigencia</code> field name. */
    public static final String FLD_DOMINIODIAFINVIGENCIA = "DiaFinVigencia";    
    /** <code>dominioDiaFinVigencia</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIODIAFINVIGENCIA = "dominioDiaFinVigencia";
    // Field (DiasCaducidad)
    /** <code>DiasCaducidad</code> field name. */
    public static final String FLD_DOMINIODIASCADUCIDAD = "DiasCaducidad";    
    /** <code>dominioDiasCaducidad</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIODIASCADUCIDAD = "dominioDiasCaducidad";
    // Field (ProrrateoUsuExistente)
    /** <code>ProrrateoUsuExistente</code> field name. */
    public static final String FLD_DOMINIOPRORRATEOUSUEXISTENTE = "ProrrateoUsuExistente";    
    /** <code>dominioProrrateoUsuExistente</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOPRORRATEOUSUEXISTENTE = "dominioProrrateoUsuExistente";
    // Field (InclusionModGrupoAsoc)
    /** <code>InclusionModGrupoAsoc</code> field name. */
    public static final String FLD_DOMINIOINCLUSIONMODGRUPOASOC = "InclusionModGrupoAsoc";    
    /** <code>dominioInclusionModGrupoAsoc</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOINCLUSIONMODGRUPOASOC = "dominioInclusionModGrupoAsoc";
    // Field (PermiteRechazadosAfi)
    /** <code>PermiteRechazadosAfi</code> field name. */
    public static final String FLD_DOMINIOPERMITERECHAZADOSAFI = "PermiteRechazadosAfi";    
    /** <code>dominioPermiteRechazadosAfi</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOPERMITERECHAZADOSAFI = "dominioPermiteRechazadosAfi";
    // Field (AcepPolizaInter)
    /** <code>AcepPolizaInter</code> field name. */
    public static final String FLD_DOMINIOACEPPOLIZAINTER = "AcepPolizaInter";    
    /** <code>dominioAcepPolizaInter</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOACEPPOLIZAINTER = "dominioAcepPolizaInter";
    // Field (NovExcepcionReqDoc)
    /** <code>NovExcepcionReqDoc</code> field name. */
    public static final String FLD_DOMINIONOVEXCEPCIONREQDOC = "NovExcepcionReqDoc";    
    /** <code>dominioNovExcepcionReqDoc</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIONOVEXCEPCIONREQDOC = "dominioNovExcepcionReqDoc";
    // Field (SolNovColorOscuro)
    /** <code>SolNovColorOscuro</code> field name. */
    public static final String FLD_DOMINIOSOLNOVCOLOROSCURO = "SolNovColorOscuro";    
    /** <code>SolNovColorOscuro</code> field length. */
    public static final int FLD_DOMINIOSOLNOVCOLOROSCUROLENGTH = 10;
    /** <code>dominioSolNovColorOscuro</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOSOLNOVCOLOROSCURO = "dominioSolNovColorOscuro";
    // Field (SolNovColorClaro)
    /** <code>SolNovColorClaro</code> field name. */
    public static final String FLD_DOMINIOSOLNOVCOLORCLARO = "SolNovColorClaro";    
    /** <code>SolNovColorClaro</code> field length. */
    public static final int FLD_DOMINIOSOLNOVCOLORCLAROLENGTH = 10;
    /** <code>dominioSolNovColorClaro</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOSOLNOVCOLORCLARO = "dominioSolNovColorClaro";
    // Field (SolNovLogo)
    /** <code>SolNovLogo</code> field name. */
    public static final String FLD_DOMINIOSOLNOVLOGO = "SolNovLogo";    
    /** <code>SolNovLogo</code> field length. */
    public static final int FLD_DOMINIOSOLNOVLOGOLENGTH = 50;
    /** <code>dominioSolNovLogo</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOSOLNOVLOGO = "dominioSolNovLogo";
    // Field (TramiteEnLinea)
    /** <code>TramiteEnLinea</code> field name. */
    public static final String FLD_DOMINIOTRAMITEENLINEA = "TramiteEnLinea";    
    /** <code>dominioTramiteEnLinea</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOTRAMITEENLINEA = "dominioTramiteEnLinea";
    // Field (VigenciaRadicacion)
    /** <code>VigenciaRadicacion</code> field name. */
    public static final String FLD_DOMINIOVIGENCIARADICACION = "VigenciaRadicacion";    
    /** <code>dominioVigenciaRadicacion</code> attribute field name. */
    public static final String ATTR_FIELD_DOMINIOVIGENCIARADICACION = "dominioVigenciaRadicacion";

    // Component role (PlanT)
    /** <code>PlanT</code> role id. */
    public static final String ROLE_ID_PLANT = "Agr_1431701422080325_Alias";
    /** <code>PlanT</code> role name. */
    public static final String ROLE_NAME_PLANT = "planT";
    /** <code>PlanT</code> role alias. */
    public static final String ROLE_ALIAS_PLANT = "Plan";

    /** <code>PlanT</code> inverse role name. */
    public static final String ROLE_INVNAME_PLANT = PlanesConstants.ROLE_NAME_DOMINIOS;
    /** <code>PlanT</code> role facet sequence. */
    public static final String PATH_FACETS_PLANT = "";
    /** <code>PlanT</code> role target class. */
    public static final String ROLE_TARGET_PLANT = PlanesConstants.CLASS_NAME;

    /** Agents allowed to navigate through PlanT **/
    public static final String PLANT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (ProductoT)
    /** <code>ProductoT</code> role id. */
    public static final String ROLE_ID_PRODUCTOT = "Agr_1431701553152972_Alias";
    /** <code>ProductoT</code> role name. */
    public static final String ROLE_NAME_PRODUCTOT = "productoT";
    /** <code>ProductoT</code> role alias. */
    public static final String ROLE_ALIAS_PRODUCTOT = "Producto";

    /** <code>ProductoT</code> inverse role name. */
    public static final String ROLE_INVNAME_PRODUCTOT = ProductosConstants.ROLE_NAME_DOMINIOS;
    /** <code>ProductoT</code> role facet sequence. */
    public static final String PATH_FACETS_PRODUCTOT = "";
    /** <code>ProductoT</code> role target class. */
    public static final String ROLE_TARGET_PRODUCTOT = ProductosConstants.CLASS_NAME;

    /** Agents allowed to navigate through ProductoT **/
    public static final String PRODUCTOT_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Periodicidades)
    /** <code>Periodicidades</code> role id. */
    public static final String ROLE_ID_PERIODICIDADES = "Agr_1431701815296927_Alias";
    /** <code>Periodicidades</code> role name. */
    public static final String ROLE_NAME_PERIODICIDADES = "periodicidades";
    /** <code>Periodicidades</code> role alias. */
    public static final String ROLE_ALIAS_PERIODICIDADES = "Periodicidades";

    /** <code>Periodicidades</code> inverse role name. */
    public static final String ROLE_INVNAME_PERIODICIDADES = PeriodicidadConstants.ROLE_NAME_DOMINIOS;
    /** <code>Periodicidades</code> role facet sequence. */
    public static final String PATH_FACETS_PERIODICIDADES = "";
    /** <code>Periodicidades</code> role target class. */
    public static final String ROLE_TARGET_PERIODICIDADES = PeriodicidadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Periodicidades **/
    public static final String PERIODICIDADES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Roles)
    /** <code>Roles</code> role id. */
    public static final String ROLE_ID_ROLES = "Agr_1431701946368346_Alias";
    /** <code>Roles</code> role name. */
    public static final String ROLE_NAME_ROLES = "roles";
    /** <code>Roles</code> role alias. */
    public static final String ROLE_ALIAS_ROLES = "Roles";

    /** <code>Roles</code> inverse role name. */
    public static final String ROLE_INVNAME_ROLES = RolConstants.ROLE_NAME_DOMINIOS;
    /** <code>Roles</code> role facet sequence. */
    public static final String PATH_FACETS_ROLES = "";
    /** <code>Roles</code> role target class. */
    public static final String ROLE_TARGET_ROLES = RolConstants.CLASS_NAME;

    /** Agents allowed to navigate through Roles **/
    public static final String ROLES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (FormasPago)
    /** <code>FormasPago</code> role id. */
    public static final String ROLE_ID_FORMASPAGO = "Agr_1537782054912119_Alias";
    /** <code>FormasPago</code> role name. */
    public static final String ROLE_NAME_FORMASPAGO = "formasPago";
    /** <code>FormasPago</code> role alias. */
    public static final String ROLE_ALIAS_FORMASPAGO = "Formas de Pago";

    /** <code>FormasPago</code> inverse role name. */
    public static final String ROLE_INVNAME_FORMASPAGO = FormaPagoConstants.ROLE_NAME_DOMINIOS;
    /** <code>FormasPago</code> role facet sequence. */
    public static final String PATH_FACETS_FORMASPAGO = "";
    /** <code>FormasPago</code> role target class. */
    public static final String ROLE_TARGET_FORMASPAGO = FormaPagoConstants.CLASS_NAME;

    /** Agents allowed to navigate through FormasPago **/
    public static final String FORMASPAGO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Plantillas)
    /** <code>Plantillas</code> role id. */
    public static final String ROLE_ID_PLANTILLAS = "Agr_1554391891968462_Alias";
    /** <code>Plantillas</code> role name. */
    public static final String ROLE_NAME_PLANTILLAS = "plantillas";
    /** <code>Plantillas</code> role alias. */
    public static final String ROLE_ALIAS_PLANTILLAS = "Plantillas";

    /** <code>Plantillas</code> inverse role name. */
    public static final String ROLE_INVNAME_PLANTILLAS = PlantillaEmailConstants.ROLE_NAME_DOMINIOS;
    /** <code>Plantillas</code> role facet sequence. */
    public static final String PATH_FACETS_PLANTILLAS = "";
    /** <code>Plantillas</code> role target class. */
    public static final String ROLE_TARGET_PLANTILLAS = PlantillaEmailConstants.CLASS_NAME;

    /** Agents allowed to navigate through Plantillas **/
    public static final String PLANTILLAS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (Novedades)
    /** <code>Novedades</code> role id. */
    public static final String ROLE_ID_NOVEDADES = "Agr_1581421690880763_Alias";
    /** <code>Novedades</code> role name. */
    public static final String ROLE_NAME_NOVEDADES = "novedades";
    /** <code>Novedades</code> role alias. */
    public static final String ROLE_ALIAS_NOVEDADES = "Novedades";

    /** <code>Novedades</code> inverse role name. */
    public static final String ROLE_INVNAME_NOVEDADES = NovedadConstants.ROLE_NAME_DOMINIOS;
    /** <code>Novedades</code> role facet sequence. */
    public static final String PATH_FACETS_NOVEDADES = "";
    /** <code>Novedades</code> role target class. */
    public static final String ROLE_TARGET_NOVEDADES = NovedadConstants.CLASS_NAME;

    /** Agents allowed to navigate through Novedades **/
    public static final String NOVEDADES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (GrupoAsesores)
    /** <code>GrupoAsesores</code> role id. */
    public static final String ROLE_ID_GRUPOASESORES = "Agr_1586850955264639_Alias";
    /** <code>GrupoAsesores</code> role name. */
    public static final String ROLE_NAME_GRUPOASESORES = "grupoAsesores";
    /** <code>GrupoAsesores</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOASESORES = "Grupo Asesores";

    /** <code>GrupoAsesores</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOASESORES = GrupoAsignacionConstants.ROLE_NAME_DOMINIOASESORES;
    /** <code>GrupoAsesores</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOASESORES = "";
    /** <code>GrupoAsesores</code> role target class. */
    public static final String ROLE_TARGET_GRUPOASESORES = GrupoAsignacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through GrupoAsesores **/
    public static final String GRUPOASESORES_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (GrupoAreaMedica)
    /** <code>GrupoAreaMedica</code> role id. */
    public static final String ROLE_ID_GRUPOAREAMEDICA = "Agr_1586851086336262_Alias";
    /** <code>GrupoAreaMedica</code> role name. */
    public static final String ROLE_NAME_GRUPOAREAMEDICA = "grupoAreaMedica";
    /** <code>GrupoAreaMedica</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOAREAMEDICA = "Grupo Área Médica";

    /** <code>GrupoAreaMedica</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOAREAMEDICA = GrupoAsignacionConstants.ROLE_NAME_DOMINIOAREAMEDICA;
    /** <code>GrupoAreaMedica</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOAREAMEDICA = "";
    /** <code>GrupoAreaMedica</code> role target class. */
    public static final String ROLE_TARGET_GRUPOAREAMEDICA = GrupoAsignacionConstants.CLASS_NAME;

    /** Agents allowed to navigate through GrupoAreaMedica **/
    public static final String GRUPOAREAMEDICA_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Component role (DominiosIncompatibles)
    /** <code>DominiosIncompatibles</code> role id. */
    public static final String ROLE_ID_DOMINIOSINCOMPATIBLES = "Agr_1658385989632013_Alias";
    /** <code>DominiosIncompatibles</code> role name. */
    public static final String ROLE_NAME_DOMINIOSINCOMPATIBLES = "dominiosIncompatibles";
    /** <code>DominiosIncompatibles</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOSINCOMPATIBLES = "Dominios incompatibles";

    /** <code>DominiosIncompatibles</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOSINCOMPATIBLES = DominioConstants.ROLE_NAME_DOMINIOSCONINCOMPATIBILIDAD;
    /** <code>DominiosIncompatibles</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOSINCOMPATIBLES = "";
    /** <code>DominiosIncompatibles</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOSINCOMPATIBLES = DominioConstants.CLASS_NAME;

    /** Agents allowed to navigate through DominiosIncompatibles **/
    public static final String DOMINIOSINCOMPATIBLES_AGENTS = "Admin,SuperAdmin,Asesor";

    // Compound role (DominiosConIncompatibilidad)
    /** <code>DominiosConIncompatibilidad</code> role id. */
    public static final String ROLE_ID_DOMINIOSCONINCOMPATIBILIDAD = "Agr_1658385989632013_Alias";
    /** <code>DominiosConIncompatibilidad</code> role name. */
    public static final String ROLE_NAME_DOMINIOSCONINCOMPATIBILIDAD = "dominiosConIncompatibilidad";
    /** <code>DominiosIncompatibles</code> role alias. */
    public static final String ROLE_ALIAS_DOMINIOSCONINCOMPATIBILIDAD = "Dominios con incompatibilidad";


    /** <code>DominiosConIncompatibilidad</code> inverse role name. */
    public static final String ROLE_INVNAME_DOMINIOSCONINCOMPATIBILIDAD = DominioConstants.ROLE_NAME_DOMINIOSINCOMPATIBLES;
    /** <code>DominiosConIncompatibilidad</code> role facet sequence. */
    public static final String PATH_FACETS_DOMINIOSCONINCOMPATIBILIDAD = "";
    /** <code>DominiosConIncompatibilidad</code> role target class. */
    public static final String ROLE_TARGET_DOMINIOSCONINCOMPATIBILIDAD = DominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through DominiosConIncompatibilidad **/
    public static final String DOMINIOSCONINCOMPATIBILIDAD_AGENTS = "Admin,SuperAdmin,Asesor";
    // Compound role (ParentescosDom)
    /** <code>ParentescosDom</code> role id. */
    public static final String ROLE_ID_PARENTESCOSDOM = "Agr_1434710704128193_Alias";
    /** <code>ParentescosDom</code> role name. */
    public static final String ROLE_NAME_PARENTESCOSDOM = "parentescosDom";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_PARENTESCOSDOM = "Parentescos dominio";


    /** <code>ParentescosDom</code> inverse role name. */
    public static final String ROLE_INVNAME_PARENTESCOSDOM = ParentescoDomConstants.ROLE_NAME_DOMINIO;
    /** <code>ParentescosDom</code> role facet sequence. */
    public static final String PATH_FACETS_PARENTESCOSDOM = "";
    /** <code>ParentescosDom</code> role target class. */
    public static final String ROLE_TARGET_PARENTESCOSDOM = ParentescoDomConstants.CLASS_NAME;
    /** Agents allowed to navigate through ParentescosDom **/
    public static final String PARENTESCOSDOM_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (AgentexProducto)
    /** <code>AgentexProducto</code> role id. */
    public static final String ROLE_ID_AGENTEXPRODUCTO = "Agr_1624004231168905_Alias";
    /** <code>AgentexProducto</code> role name. */
    public static final String ROLE_NAME_AGENTEXPRODUCTO = "agentexProducto";
    /** <code>Dominios</code> role alias. */
    public static final String ROLE_ALIAS_AGENTEXPRODUCTO = "AgentexProducto";


    /** <code>AgentexProducto</code> inverse role name. */
    public static final String ROLE_INVNAME_AGENTEXPRODUCTO = AgentexProductoConstants.ROLE_NAME_DOMINIOS;
    /** <code>AgentexProducto</code> role facet sequence. */
    public static final String PATH_FACETS_AGENTEXPRODUCTO = "";
    /** <code>AgentexProducto</code> role target class. */
    public static final String ROLE_TARGET_AGENTEXPRODUCTO = AgentexProductoConstants.CLASS_NAME;
    /** Agents allowed to navigate through AgentexProducto **/
    public static final String AGENTEXPRODUCTO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (Prorrateos)
    /** <code>Prorrateos</code> role id. */
    public static final String ROLE_ID_PRORRATEOS = "Agr_1547053432832997_Alias";
    /** <code>Prorrateos</code> role name. */
    public static final String ROLE_NAME_PRORRATEOS = "prorrateos";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_PRORRATEOS = "Prorrateos";


    /** <code>Prorrateos</code> inverse role name. */
    public static final String ROLE_INVNAME_PRORRATEOS = ProrrateoConstants.ROLE_NAME_DOMINIO;
    /** <code>Prorrateos</code> role facet sequence. */
    public static final String PATH_FACETS_PRORRATEOS = "";
    /** <code>Prorrateos</code> role target class. */
    public static final String ROLE_TARGET_PRORRATEOS = ProrrateoConstants.CLASS_NAME;
    /** Agents allowed to navigate through Prorrateos **/
    public static final String PRORRATEOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (LogGruposUsuarios)
    /** <code>LogGruposUsuarios</code> role id. */
    public static final String ROLE_ID_LOGGRUPOSUSUARIOS = "Agr_1586851217408540_Alias";
    /** <code>LogGruposUsuarios</code> role name. */
    public static final String ROLE_NAME_LOGGRUPOSUSUARIOS = "logGruposUsuarios";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_LOGGRUPOSUSUARIOS = "LogGruposUsuarios";


    /** <code>LogGruposUsuarios</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGGRUPOSUSUARIOS = LogGruposUsuariosConstants.ROLE_NAME_DOMINIO;
    /** <code>LogGruposUsuarios</code> role facet sequence. */
    public static final String PATH_FACETS_LOGGRUPOSUSUARIOS = "";
    /** <code>LogGruposUsuarios</code> role target class. */
    public static final String ROLE_TARGET_LOGGRUPOSUSUARIOS = LogGruposUsuariosConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogGruposUsuarios **/
    public static final String LOGGRUPOSUSUARIOS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (GrupoAsignacionNovedad)
    /** <code>GrupoAsignacionNovedad</code> role id. */
    public static final String ROLE_ID_GRUPOASIGNACIONNOVEDAD = "Agr_1586852134912896_Alias";
    /** <code>GrupoAsignacionNovedad</code> role name. */
    public static final String ROLE_NAME_GRUPOASIGNACIONNOVEDAD = "grupoAsignacionNovedad";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_GRUPOASIGNACIONNOVEDAD = "Grupos Asignación Novedad";


    /** <code>GrupoAsignacionNovedad</code> inverse role name. */
    public static final String ROLE_INVNAME_GRUPOASIGNACIONNOVEDAD = GrupoAsignacionNovedadConstants.ROLE_NAME_DOMINIO;
    /** <code>GrupoAsignacionNovedad</code> role facet sequence. */
    public static final String PATH_FACETS_GRUPOASIGNACIONNOVEDAD = "";
    /** <code>GrupoAsignacionNovedad</code> role target class. */
    public static final String ROLE_TARGET_GRUPOASIGNACIONNOVEDAD = GrupoAsignacionNovedadConstants.CLASS_NAME;
    /** Agents allowed to navigate through GrupoAsignacionNovedad **/
    public static final String GRUPOASIGNACIONNOVEDAD_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ConfiguracionesANS)
    /** <code>ConfiguracionesANS</code> role id. */
    public static final String ROLE_ID_CONFIGURACIONESANS = "Agr_1586860261376987_Alias";
    /** <code>ConfiguracionesANS</code> role name. */
    public static final String ROLE_NAME_CONFIGURACIONESANS = "configuracionesANS";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_CONFIGURACIONESANS = "Configuraciones ANS";


    /** <code>ConfiguracionesANS</code> inverse role name. */
    public static final String ROLE_INVNAME_CONFIGURACIONESANS = ConfiguracionANSConstants.ROLE_NAME_DOMINIO;
    /** <code>ConfiguracionesANS</code> role facet sequence. */
    public static final String PATH_FACETS_CONFIGURACIONESANS = "";
    /** <code>ConfiguracionesANS</code> role target class. */
    public static final String ROLE_TARGET_CONFIGURACIONESANS = ConfiguracionANSConstants.CLASS_NAME;
    /** Agents allowed to navigate through ConfiguracionesANS **/
    public static final String CONFIGURACIONESANS_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (ReportesDominio)
    /** <code>ReportesDominio</code> role id. */
    public static final String ROLE_ID_REPORTESDOMINIO = "Agr_1623832395776247_Alias";
    /** <code>ReportesDominio</code> role name. */
    public static final String ROLE_NAME_REPORTESDOMINIO = "reportesDominio";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_REPORTESDOMINIO = "Reportes";


    /** <code>ReportesDominio</code> inverse role name. */
    public static final String ROLE_INVNAME_REPORTESDOMINIO = ReportesDominioConstants.ROLE_NAME_DOMINIO;
    /** <code>ReportesDominio</code> role facet sequence. */
    public static final String PATH_FACETS_REPORTESDOMINIO = "";
    /** <code>ReportesDominio</code> role target class. */
    public static final String ROLE_TARGET_REPORTESDOMINIO = ReportesDominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through ReportesDominio **/
    public static final String REPORTESDOMINIO_AGENTS = "Admin,SuperAdmin,Asesor,AreaMedica,Afiliaciones,Gestor,MesaDeApoyo";
    // Compound role (LogIncompatibilidades)
    /** <code>LogIncompatibilidades</code> role id. */
    public static final String ROLE_ID_LOGINCOMPATIBILIDADES = "Agr_1658387955712257_Alias";
    /** <code>LogIncompatibilidades</code> role name. */
    public static final String ROLE_NAME_LOGINCOMPATIBILIDADES = "logIncompatibilidades";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_LOGINCOMPATIBILIDADES = "LogIncompatibilidades";


    /** <code>LogIncompatibilidades</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGINCOMPATIBILIDADES = LogIncompatibilidadesConstants.ROLE_NAME_DOMINIO;
    /** <code>LogIncompatibilidades</code> role facet sequence. */
    public static final String PATH_FACETS_LOGINCOMPATIBILIDADES = "";
    /** <code>LogIncompatibilidades</code> role target class. */
    public static final String ROLE_TARGET_LOGINCOMPATIBILIDADES = LogIncompatibilidadesConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogIncompatibilidades **/
    public static final String LOGINCOMPATIBILIDADES_AGENTS = "Admin,SuperAdmin";
    // Compound role (LogDatosDominio)
    /** <code>LogDatosDominio</code> role id. */
    public static final String ROLE_ID_LOGDATOSDOMINIO = "Agr_1658394378240791_Alias";
    /** <code>LogDatosDominio</code> role name. */
    public static final String ROLE_NAME_LOGDATOSDOMINIO = "logDatosDominio";
    /** <code>Dominio</code> role alias. */
    public static final String ROLE_ALIAS_LOGDATOSDOMINIO = "Log Dominio";


    /** <code>LogDatosDominio</code> inverse role name. */
    public static final String ROLE_INVNAME_LOGDATOSDOMINIO = LogDatosDominioConstants.ROLE_NAME_DOMINIO;
    /** <code>LogDatosDominio</code> role facet sequence. */
    public static final String PATH_FACETS_LOGDATOSDOMINIO = "";
    /** <code>LogDatosDominio</code> role target class. */
    public static final String ROLE_TARGET_LOGDATOSDOMINIO = LogDatosDominioConstants.CLASS_NAME;
    /** Agents allowed to navigate through LogDatosDominio **/
    public static final String LOGDATOSDOMINIO_AGENTS = "Admin,SuperAdmin";

    // Service (crear)
    /** <code>crear</code> service id. */
    public static final String SERV_ID_CREAR = "Clas_1431701422080423Ser_1_Alias";
    /** <code>crear</code> service name. */
    public static final String SERV_NAME_CREAR = "crear";
    /** <code>crear</code> service alias. */
    public static final String SERV_ALIAS_CREAR = "Crear dominio";
    /** Agents allowed to execute the service crear **/
    public static final String CREAR_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>crear</code> precondition 0 id. */
    public static final String PRE_ID_CREAR_0 = "Clas_1431701422080423Pre_1_MsgError";
    /** <code>crear</code> precondition 1 id. */
    public static final String PRE_ID_CREAR_1 = "Clas_1431701422080423Pre_2_MsgError";
    // Inbound arguments
    /** <code>dominiocrearpagrPlanT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPAGRPLANT = "p_agrPlanT";
    /** <code>dominiocrearpagrPlanT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPAGRPLANT = "Clas_1431701422080423Ser_1Arg_2_Alias";
    /** <code>dominiocrearpagrPlanT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPAGRPLANT = "Plan";
    /** <code>dominiocrearpagrProductoT</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPAGRPRODUCTOT = "p_agrProductoT";
    /** <code>dominiocrearpagrProductoT</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPAGRPRODUCTOT = "Clas_1431701422080423Ser_1Arg_3_Alias";
    /** <code>dominiocrearpagrProductoT</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPAGRPRODUCTOT = "Producto";
    /** <code>dominiocrearpagrGrupoAsesores</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPAGRGRUPOASESORES = "p_agrGrupoAsesores";
    /** <code>dominiocrearpagrGrupoAsesores</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPAGRGRUPOASESORES = "Clas_1431701422080423Ser_1Arg_47_Alias";
    /** <code>dominiocrearpagrGrupoAsesores</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPAGRGRUPOASESORES = "Grupo Asesores";
    /** <code>dominiocrearpagrGrupoAreaMedica</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPAGRGRUPOAREAMEDICA = "p_agrGrupoAreaMedica";
    /** <code>dominiocrearpagrGrupoAreaMedica</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPAGRGRUPOAREAMEDICA = "Clas_1431701422080423Ser_1Arg_48_Alias";
    /** <code>dominiocrearpagrGrupoAreaMedica</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPAGRGRUPOAREAMEDICA = "Grupo Área Médica";
    /** <code>dominiocrearpatrReqCuesMed</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRREQCUESMED = "p_atrReqCuesMed";
    /** <code>dominiocrearpatrReqCuesMed</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRREQCUESMED = "Clas_1431701422080423Ser_1Arg_4_Alias";
    /** <code>dominiocrearpatrReqCuesMed</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRREQCUESMED = "Cuestionario médico";
    /** <code>dominiocrearpatrNoCuesMedTras</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRNOCUESMEDTRAS = "p_atrNoCuesMedTras";
    /** <code>dominiocrearpatrNoCuesMedTras</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRNOCUESMEDTRAS = "Clas_1431701422080423Ser_1Arg_5_Alias";
    /** <code>dominiocrearpatrNoCuesMedTras</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRNOCUESMEDTRAS = "No cuestionario si traslado";
    /** <code>dominiocrearpatrNuevaAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRNUEVAAFILIACION = "p_atrNuevaAfiliacion";
    /** <code>dominiocrearpatrNuevaAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRNUEVAAFILIACION = "Clas_1431701422080423Ser_1Arg_6_Alias";
    /** <code>dominiocrearpatrNuevaAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRNUEVAAFILIACION = "Nueva afiliación";
    /** <code>dominiocrearpatrInclusion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRINCLUSION = "p_atrInclusion";
    /** <code>dominiocrearpatrInclusion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRINCLUSION = "Clas_1431701422080423Ser_1Arg_7_Alias";
    /** <code>dominiocrearpatrInclusion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRINCLUSION = "Inclusión";
    /** <code>dominiocrearpatrAcepCuesMat</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRACEPCUESMAT = "p_atrAcepCuesMat";
    /** <code>dominiocrearpatrAcepCuesMat</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRACEPCUESMAT = "Clas_1431701422080423Ser_1Arg_8_Alias";
    /** <code>dominiocrearpatrAcepCuesMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRACEPCUESMAT = "Cuestionario maternal";
    /** <code>dominiocrearpatrAcepCuesNeo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRACEPCUESNEO = "p_atrAcepCuesNeo";
    /** <code>dominiocrearpatrAcepCuesNeo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRACEPCUESNEO = "Clas_1431701422080423Ser_1Arg_9_Alias";
    /** <code>dominiocrearpatrAcepCuesNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRACEPCUESNEO = "Cuestionario neonatal";
    /** <code>dominiocrearpatrAcepBBGestante</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRACEPBBGESTANTE = "p_atrAcepBBGestante";
    /** <code>dominiocrearpatrAcepBBGestante</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRACEPBBGESTANTE = "Clas_1431701422080423Ser_1Arg_19_Alias";
    /** <code>dominiocrearpatrAcepBBGestante</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRACEPBBGESTANTE = "Bebe gestante";
    /** <code>dominiocrearpatrMostrarPreexAnexos</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRMOSTRARPREEXANEXOS = "p_atrMostrarPreexAnexos";
    /** <code>dominiocrearpatrMostrarPreexAnexos</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRMOSTRARPREEXANEXOS = "Clas_1431701422080423Ser_1Arg_34_Alias";
    /** <code>dominiocrearpatrMostrarPreexAnexos</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRMOSTRARPREEXANEXOS = "Mostrar Preexistencias";
    /** <code>dominiocrearpatrMostrarPreexContrato</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRMOSTRARPREEXCONTRATO = "p_atrMostrarPreexContrato";
    /** <code>dominiocrearpatrMostrarPreexContrato</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRMOSTRARPREEXCONTRATO = "Clas_1431701422080423Ser_1Arg_35_Alias";
    /** <code>dominiocrearpatrMostrarPreexContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRMOSTRARPREEXCONTRATO = "Mostrar Preexistencias en Contrato";
    /** <code>dominiocrearpatrIgnorarPreexistencias</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRIGNORARPREEXISTENCIAS = "p_atrIgnorarPreexistencias";
    /** <code>dominiocrearpatrIgnorarPreexistencias</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRIGNORARPREEXISTENCIAS = "Clas_1431701422080423Ser_1Arg_36_Alias";
    /** <code>dominiocrearpatrIgnorarPreexistencias</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRIGNORARPREEXISTENCIAS = "Ignorar preexistencias";
    /** <code>dominiocrearpatrProrrateoUsuExistente</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRPRORRATEOUSUEXISTENTE = "p_atrProrrateoUsuExistente";
    /** <code>dominiocrearpatrProrrateoUsuExistente</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRPRORRATEOUSUEXISTENTE = "Clas_1431701422080423Ser_1Arg_39_Alias";
    /** <code>dominiocrearpatrProrrateoUsuExistente</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRPRORRATEOUSUEXISTENTE = "Prorrateo usuarios existente";
    /** <code>dominiocrearpatrInclusionModGrupoAsoc</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRINCLUSIONMODGRUPOASOC = "p_atrInclusionModGrupoAsoc";
    /** <code>dominiocrearpatrInclusionModGrupoAsoc</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRINCLUSIONMODGRUPOASOC = "Clas_1431701422080423Ser_1Arg_40_Alias";
    /** <code>dominiocrearpatrInclusionModGrupoAsoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRINCLUSIONMODGRUPOASOC = "Modificación grupo asociado";
    /** <code>dominiocrearpatrPermiteRechazadosAfi</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRPERMITERECHAZADOSAFI = "p_atrPermiteRechazadosAfi";
    /** <code>dominiocrearpatrPermiteRechazadosAfi</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRPERMITERECHAZADOSAFI = "Clas_1431701422080423Ser_1Arg_41_Alias";
    /** <code>dominiocrearpatrPermiteRechazadosAfi</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRPERMITERECHAZADOSAFI = "Permite rechazados afiliación";
    /** <code>dominiocrearpatrAcepPolizaInter</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRACEPPOLIZAINTER = "p_atrAcepPolizaInter";
    /** <code>dominiocrearpatrAcepPolizaInter</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRACEPPOLIZAINTER = "Clas_1431701422080423Ser_1Arg_42_Alias";
    /** <code>dominiocrearpatrAcepPolizaInter</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRACEPPOLIZAINTER = "Poliza Internacional";
    /** <code>dominiocrearpatrNovExcepcionReqDoc</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRNOVEXCEPCIONREQDOC = "p_atrNovExcepcionReqDoc";
    /** <code>dominiocrearpatrNovExcepcionReqDoc</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRNOVEXCEPCIONREQDOC = "Clas_1431701422080423Ser_1Arg_43_Alias";
    /** <code>dominiocrearpatrNovExcepcionReqDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRNOVEXCEPCIONREQDOC = "Novedades Excepción requiere documentos";
    /** <code>dominiocrearpatrSolNovColorOscuro</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRSOLNOVCOLOROSCURO = "p_atrSolNovColorOscuro";
    /** <code>dominiocrearpatrSolNovColorOscuro</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRSOLNOVCOLOROSCURO = "Clas_1431701422080423Ser_1Arg_44_Alias";
    /** <code>dominiocrearpatrSolNovColorOscuro</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRSOLNOVCOLOROSCURO = "Color oscuro";
    /** <code>dominiocrearpatrSolNovColorClaro</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRSOLNOVCOLORCLARO = "p_atrSolNovColorClaro";
    /** <code>dominiocrearpatrSolNovColorClaro</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRSOLNOVCOLORCLARO = "Clas_1431701422080423Ser_1Arg_45_Alias";
    /** <code>dominiocrearpatrSolNovColorClaro</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRSOLNOVCOLORCLARO = "Color claro";
    /** <code>dominiocrearpatrSolNovLogo</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRSOLNOVLOGO = "p_atrSolNovLogo";
    /** <code>dominiocrearpatrSolNovLogo</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRSOLNOVLOGO = "Clas_1431701422080423Ser_1Arg_46_Alias";
    /** <code>dominiocrearpatrSolNovLogo</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRSOLNOVLOGO = "Logo";
    /** <code>dominiocrearpatrTramiteEnLinea</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRTRAMITEENLINEA = "p_atrTramiteEnLinea";
    /** <code>dominiocrearpatrTramiteEnLinea</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRTRAMITEENLINEA = "Clas_1431701422080423Ser_1Arg_49_Alias";
    /** <code>dominiocrearpatrTramiteEnLinea</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRTRAMITEENLINEA = "Trámite en línea";
    /** <code>dominiocrearpatrVigenciaRadicacion</code> inbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPATRVIGENCIARADICACION = "p_atrVigenciaRadicacion";
    /** <code>dominiocrearpatrVigenciaRadicacion</code> inbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPATRVIGENCIARADICACION = "Clas_1431701422080423Ser_1Arg_50_Alias";
    /** <code>dominiocrearpatrVigenciaRadicacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPATRVIGENCIARADICACION = "Vigencia de radicación";
    // Outbound arguments
    /** <code>dominiocrearpsDominio</code> outbound argument name. */
    public static final String ARG_NAME_CREAR_DOMINIOCREARPSDOMINIO = "dominiocrearpsDominio";
    /** <code>dominiocrearpsDominio</code> outbound argument id. */
    public static final String ARG_ID_CREAR_DOMINIOCREARPSDOMINIO = "Clas_1431701422080423Ser_1Arg_18_Alias";
    /** <code>dominiocrearpsDominio</code> outbound argument alias. */
    public static final String ARG_ALIAS_CREAR_DOMINIOCREARPSDOMINIO = "Dominio";
    // Service (eliminar)
    /** <code>eliminar</code> service id. */
    public static final String SERV_ID_ELIMINAR = "Clas_1431701422080423Ser_2_Alias";
    /** <code>eliminar</code> service name. */
    public static final String SERV_NAME_ELIMINAR = "eliminar";
    /** <code>eliminar</code> service alias. */
    public static final String SERV_ALIAS_ELIMINAR = "Eliminar dominio";
    /** Agents allowed to execute the service eliminar **/
    public static final String ELIMINAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioeliminarpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_ELIMINAR_DOMINIOELIMINARPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioeliminarpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_ELIMINAR_DOMINIOELIMINARPTHISDOMINIO = "Clas_1431701422080423Ser_2Arg_1_Alias";
    /** <code>dominioeliminarpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_ELIMINAR_DOMINIOELIMINARPTHISDOMINIO = "Dominio";
    // Service (InsPeriodicidadDominio)
    /** <code>InsPeriodicidadDominio</code> service id. */
    public static final String SERV_ID_INSPERIODICIDADDOMINIO = "Clas_1431701422080423Ser_6_Alias";
    /** <code>InsPeriodicidadDominio</code> service name. */
    public static final String SERV_NAME_INSPERIODICIDADDOMINIO = "InsPeriodicidadDominio";
    /** <code>InsPeriodicidadDominio</code> service alias. */
    public static final String SERV_ALIAS_INSPERIODICIDADDOMINIO = "Indicar periodicidad aceptada";
    /** Agents allowed to execute the service InsPeriodicidadDominio **/
    public static final String INSPERIODICIDADDOMINIO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioInsPeriodicidadDominiopthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADDOMINIO_DOMINIOINSPERIODICIDADDOMINIOPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioInsPeriodicidadDominiopthisDominio</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADDOMINIO_DOMINIOINSPERIODICIDADDOMINIOPTHISDOMINIO = "Clas_1431701422080423Ser_6Arg_1_Alias";
    /** <code>dominioInsPeriodicidadDominiopthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADDOMINIO_DOMINIOINSPERIODICIDADDOMINIOPTHISDOMINIO = "Dominio";
    /** <code>dominioInsPeriodicidadDominiopevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_INSPERIODICIDADDOMINIO_DOMINIOINSPERIODICIDADDOMINIOPEVCPERIODICIDAD = "p_evcPeriodicidad";
    /** <code>dominioInsPeriodicidadDominiopevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_INSPERIODICIDADDOMINIO_DOMINIOINSPERIODICIDADDOMINIOPEVCPERIODICIDAD = "Clas_1431701422080423Ser_6Arg_2_Alias";
    /** <code>dominioInsPeriodicidadDominiopevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPERIODICIDADDOMINIO_DOMINIOINSPERIODICIDADDOMINIOPEVCPERIODICIDAD = "Periodicidad/es";
    // Service (DelPeriodicidadDominio)
    /** <code>DelPeriodicidadDominio</code> service id. */
    public static final String SERV_ID_DELPERIODICIDADDOMINIO = "Clas_1431701422080423Ser_7_Alias";
    /** <code>DelPeriodicidadDominio</code> service name. */
    public static final String SERV_NAME_DELPERIODICIDADDOMINIO = "DelPeriodicidadDominio";
    /** <code>DelPeriodicidadDominio</code> service alias. */
    public static final String SERV_ALIAS_DELPERIODICIDADDOMINIO = "Eliminar periodicidad aceptada";
    /** Agents allowed to execute the service DelPeriodicidadDominio **/
    public static final String DELPERIODICIDADDOMINIO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioDelPeriodicidadDominiopthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADDOMINIO_DOMINIODELPERIODICIDADDOMINIOPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioDelPeriodicidadDominiopthisDominio</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADDOMINIO_DOMINIODELPERIODICIDADDOMINIOPTHISDOMINIO = "Clas_1431701422080423Ser_7Arg_1_Alias";
    /** <code>dominioDelPeriodicidadDominiopthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADDOMINIO_DOMINIODELPERIODICIDADDOMINIOPTHISDOMINIO = "Dominio";
    /** <code>dominioDelPeriodicidadDominiopevcPeriodicidad</code> inbound argument name. */
    public static final String ARG_NAME_DELPERIODICIDADDOMINIO_DOMINIODELPERIODICIDADDOMINIOPEVCPERIODICIDAD = "p_evcPeriodicidad";
    /** <code>dominioDelPeriodicidadDominiopevcPeriodicidad</code> inbound argument id. */
    public static final String ARG_ID_DELPERIODICIDADDOMINIO_DOMINIODELPERIODICIDADDOMINIOPEVCPERIODICIDAD = "Clas_1431701422080423Ser_7Arg_2_Alias";
    /** <code>dominioDelPeriodicidadDominiopevcPeriodicidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPERIODICIDADDOMINIO_DOMINIODELPERIODICIDADDOMINIOPEVCPERIODICIDAD = "Periodicidad";
    // Service (InsRolDominio)
    /** <code>InsRolDominio</code> service id. */
    public static final String SERV_ID_INSROLDOMINIO = "Clas_1431701422080423Ser_8_Alias";
    /** <code>InsRolDominio</code> service name. */
    public static final String SERV_NAME_INSROLDOMINIO = "InsRolDominio";
    /** <code>InsRolDominio</code> service alias. */
    public static final String SERV_ALIAS_INSROLDOMINIO = "Indicar rol con permisos";
    /** Agents allowed to execute the service InsRolDominio **/
    public static final String INSROLDOMINIO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioInsRolDominiopthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSROLDOMINIO_DOMINIOINSROLDOMINIOPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioInsRolDominiopthisDominio</code> inbound argument id. */
    public static final String ARG_ID_INSROLDOMINIO_DOMINIOINSROLDOMINIOPTHISDOMINIO = "Clas_1431701422080423Ser_8Arg_1_Alias";
    /** <code>dominioInsRolDominiopthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSROLDOMINIO_DOMINIOINSROLDOMINIOPTHISDOMINIO = "Dominio";
    /** <code>dominioInsRolDominiopevcRol</code> inbound argument name. */
    public static final String ARG_NAME_INSROLDOMINIO_DOMINIOINSROLDOMINIOPEVCROL = "p_evcRol";
    /** <code>dominioInsRolDominiopevcRol</code> inbound argument id. */
    public static final String ARG_ID_INSROLDOMINIO_DOMINIOINSROLDOMINIOPEVCROL = "Clas_1431701422080423Ser_8Arg_2_Alias";
    /** <code>dominioInsRolDominiopevcRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSROLDOMINIO_DOMINIOINSROLDOMINIOPEVCROL = "Rol/es";
    // Service (DelRollDominio)
    /** <code>DelRollDominio</code> service id. */
    public static final String SERV_ID_DELROLLDOMINIO = "Clas_1431701422080423Ser_9_Alias";
    /** <code>DelRollDominio</code> service name. */
    public static final String SERV_NAME_DELROLLDOMINIO = "DelRollDominio";
    /** <code>DelRollDominio</code> service alias. */
    public static final String SERV_ALIAS_DELROLLDOMINIO = "Eliminar rol con permisos";
    /** Agents allowed to execute the service DelRollDominio **/
    public static final String DELROLLDOMINIO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioDelRollDominiopthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELROLLDOMINIO_DOMINIODELROLLDOMINIOPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioDelRollDominiopthisDominio</code> inbound argument id. */
    public static final String ARG_ID_DELROLLDOMINIO_DOMINIODELROLLDOMINIOPTHISDOMINIO = "Clas_1431701422080423Ser_9Arg_1_Alias";
    /** <code>dominioDelRollDominiopthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELROLLDOMINIO_DOMINIODELROLLDOMINIOPTHISDOMINIO = "Dominio";
    /** <code>dominioDelRollDominiopevcRol</code> inbound argument name. */
    public static final String ARG_NAME_DELROLLDOMINIO_DOMINIODELROLLDOMINIOPEVCROL = "p_evcRol";
    /** <code>dominioDelRollDominiopevcRol</code> inbound argument id. */
    public static final String ARG_ID_DELROLLDOMINIO_DOMINIODELROLLDOMINIOPEVCROL = "Clas_1431701422080423Ser_9Arg_2_Alias";
    /** <code>dominioDelRollDominiopevcRol</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELROLLDOMINIO_DOMINIODELROLLDOMINIOPEVCROL = "Rol";
    // Service (modDatosRespFirma)
    /** <code>modDatosRespFirma</code> service id. */
    public static final String SERV_ID_MODDATOSRESPFIRMA = "Clas_1431701422080423Ser_12_Alias";
    /** <code>modDatosRespFirma</code> service name. */
    public static final String SERV_NAME_MODDATOSRESPFIRMA = "modDatosRespFirma";
    /** <code>modDatosRespFirma</code> service alias. */
    public static final String SERV_ALIAS_MODDATOSRESPFIRMA = "Datos responsable firma";
    /** Agents allowed to execute the service modDatosRespFirma **/
    public static final String MODDATOSRESPFIRMA_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>modDatosRespFirma</code> precondition 0 id. */
    public static final String PRE_ID_MODDATOSRESPFIRMA_0 = "Clas_1431701422080423Pre_3_MsgError";
    // Inbound arguments
    /** <code>dominiomodDatosRespFirmapthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPTHISDOMINIO = "p_thisDominio";
    /** <code>dominiomodDatosRespFirmapthisDominio</code> inbound argument id. */
    public static final String ARG_ID_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPTHISDOMINIO = "Clas_1431701422080423Ser_12Arg_1_Alias";
    /** <code>dominiomodDatosRespFirmapthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPTHISDOMINIO = "Dominio";
    /** <code>dominiomodDatosRespFirmapNombre</code> inbound argument name. */
    public static final String ARG_NAME_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPNOMBRE = "pNombre";
    /** <code>dominiomodDatosRespFirmapNombre</code> inbound argument id. */
    public static final String ARG_ID_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPNOMBRE = "Clas_1431701422080423Ser_12Arg_2_Alias";
    /** <code>dominiomodDatosRespFirmapNombre</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPNOMBRE = "Nombre";
    /** <code>dominiomodDatosRespFirmapNumCelula</code> inbound argument name. */
    public static final String ARG_NAME_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPNUMCELULA = "pNumCelula";
    /** <code>dominiomodDatosRespFirmapNumCelula</code> inbound argument id. */
    public static final String ARG_ID_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPNUMCELULA = "Clas_1431701422080423Ser_12Arg_3_Alias";
    /** <code>dominiomodDatosRespFirmapNumCelula</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPNUMCELULA = "Nº célula";
    /** <code>dominiomodDatosRespFirmapExpedicionCelula</code> inbound argument name. */
    public static final String ARG_NAME_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPEXPEDICIONCELULA = "pExpedicionCelula";
    /** <code>dominiomodDatosRespFirmapExpedicionCelula</code> inbound argument id. */
    public static final String ARG_ID_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPEXPEDICIONCELULA = "Clas_1431701422080423Ser_12Arg_4_Alias";
    /** <code>dominiomodDatosRespFirmapExpedicionCelula</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPEXPEDICIONCELULA = "Lugar de expedición";
    /** <code>dominiomodDatosRespFirmapCargo</code> inbound argument name. */
    public static final String ARG_NAME_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPCARGO = "pCargo";
    /** <code>dominiomodDatosRespFirmapCargo</code> inbound argument id. */
    public static final String ARG_ID_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPCARGO = "Clas_1431701422080423Ser_12Arg_5_Alias";
    /** <code>dominiomodDatosRespFirmapCargo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODDATOSRESPFIRMA_DOMINIOMODDATOSRESPFIRMAPCARGO = "Cargo";
    // Service (modImagenFirma)
    /** <code>modImagenFirma</code> service id. */
    public static final String SERV_ID_MODIMAGENFIRMA = "Clas_1431701422080423Ser_13_Alias";
    /** <code>modImagenFirma</code> service name. */
    public static final String SERV_NAME_MODIMAGENFIRMA = "modImagenFirma";
    /** <code>modImagenFirma</code> service alias. */
    public static final String SERV_ALIAS_MODIMAGENFIRMA = "Asignar imagen firma";
    /** Agents allowed to execute the service modImagenFirma **/
    public static final String MODIMAGENFIRMA_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>modImagenFirma</code> precondition 0 id. */
    public static final String PRE_ID_MODIMAGENFIRMA_0 = "Clas_1431701422080423Pre_4_MsgError";
    // Inbound arguments
    /** <code>dominiomodImagenFirmapthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_MODIMAGENFIRMA_DOMINIOMODIMAGENFIRMAPTHISDOMINIO = "p_thisDominio";
    /** <code>dominiomodImagenFirmapthisDominio</code> inbound argument id. */
    public static final String ARG_ID_MODIMAGENFIRMA_DOMINIOMODIMAGENFIRMAPTHISDOMINIO = "Clas_1431701422080423Ser_13Arg_1_Alias";
    /** <code>dominiomodImagenFirmapthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIMAGENFIRMA_DOMINIOMODIMAGENFIRMAPTHISDOMINIO = "Dominio";
    /** <code>dominiomodImagenFirmapFirma</code> inbound argument name. */
    public static final String ARG_NAME_MODIMAGENFIRMA_DOMINIOMODIMAGENFIRMAPFIRMA = "pFirma";
    /** <code>dominiomodImagenFirmapFirma</code> inbound argument id. */
    public static final String ARG_ID_MODIMAGENFIRMA_DOMINIOMODIMAGENFIRMAPFIRMA = "Clas_1431701422080423Ser_13Arg_2_Alias";
    /** <code>dominiomodImagenFirmapFirma</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIMAGENFIRMA_DOMINIOMODIMAGENFIRMAPFIRMA = "Imagen firma";
    // Service (InsFormaPago)
    /** <code>InsFormaPago</code> service id. */
    public static final String SERV_ID_INSFORMAPAGO = "Clas_1431701422080423Ser_14_Alias";
    /** <code>InsFormaPago</code> service name. */
    public static final String SERV_NAME_INSFORMAPAGO = "InsFormaPago";
    /** <code>InsFormaPago</code> service alias. */
    public static final String SERV_ALIAS_INSFORMAPAGO = "Indicar forma de pago aceptada";
    /** Agents allowed to execute the service InsFormaPago **/
    public static final String INSFORMAPAGO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioInsFormaPagopthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSFORMAPAGO_DOMINIOINSFORMAPAGOPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioInsFormaPagopthisDominio</code> inbound argument id. */
    public static final String ARG_ID_INSFORMAPAGO_DOMINIOINSFORMAPAGOPTHISDOMINIO = "Clas_1431701422080423Ser_14Arg_1_Alias";
    /** <code>dominioInsFormaPagopthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFORMAPAGO_DOMINIOINSFORMAPAGOPTHISDOMINIO = "Dominios";
    /** <code>dominioInsFormaPagopevcFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_INSFORMAPAGO_DOMINIOINSFORMAPAGOPEVCFORMAPAGO = "p_evcFormaPago";
    /** <code>dominioInsFormaPagopevcFormaPago</code> inbound argument id. */
    public static final String ARG_ID_INSFORMAPAGO_DOMINIOINSFORMAPAGOPEVCFORMAPAGO = "Clas_1431701422080423Ser_14Arg_2_Alias";
    /** <code>dominioInsFormaPagopevcFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSFORMAPAGO_DOMINIOINSFORMAPAGOPEVCFORMAPAGO = "Formas de Pago";
    // Service (DelFormaPago)
    /** <code>DelFormaPago</code> service id. */
    public static final String SERV_ID_DELFORMAPAGO = "Clas_1431701422080423Ser_15_Alias";
    /** <code>DelFormaPago</code> service name. */
    public static final String SERV_NAME_DELFORMAPAGO = "DelFormaPago";
    /** <code>DelFormaPago</code> service alias. */
    public static final String SERV_ALIAS_DELFORMAPAGO = "Eliminar forma de pago aceptada";
    /** Agents allowed to execute the service DelFormaPago **/
    public static final String DELFORMAPAGO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioDelFormaPagopthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELFORMAPAGO_DOMINIODELFORMAPAGOPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioDelFormaPagopthisDominio</code> inbound argument id. */
    public static final String ARG_ID_DELFORMAPAGO_DOMINIODELFORMAPAGOPTHISDOMINIO = "Clas_1431701422080423Ser_15Arg_1_Alias";
    /** <code>dominioDelFormaPagopthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFORMAPAGO_DOMINIODELFORMAPAGOPTHISDOMINIO = "Dominios";
    /** <code>dominioDelFormaPagopevcFormaPago</code> inbound argument name. */
    public static final String ARG_NAME_DELFORMAPAGO_DOMINIODELFORMAPAGOPEVCFORMAPAGO = "p_evcFormaPago";
    /** <code>dominioDelFormaPagopevcFormaPago</code> inbound argument id. */
    public static final String ARG_ID_DELFORMAPAGO_DOMINIODELFORMAPAGOPEVCFORMAPAGO = "Clas_1431701422080423Ser_15Arg_2_Alias";
    /** <code>dominioDelFormaPagopevcFormaPago</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELFORMAPAGO_DOMINIODELFORMAPAGOPEVCFORMAPAGO = "Formas de Pago";
    // Service (cambiarDiasVigencia)
    /** <code>cambiarDiasVigencia</code> service id. */
    public static final String SERV_ID_CAMBIARDIASVIGENCIA = "Clas_1431701422080423Ser_16_Alias";
    /** <code>cambiarDiasVigencia</code> service name. */
    public static final String SERV_NAME_CAMBIARDIASVIGENCIA = "cambiarDiasVigencia";
    /** <code>cambiarDiasVigencia</code> service alias. */
    public static final String SERV_ALIAS_CAMBIARDIASVIGENCIA = "Cambiar días vigencia";
    /** Agents allowed to execute the service cambiarDiasVigencia **/
    public static final String CAMBIARDIASVIGENCIA_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>cambiarDiasVigencia</code> precondition 0 id. */
    public static final String PRE_ID_CAMBIARDIASVIGENCIA_0 = "Clas_1431701422080423Pre_5_MsgError";
    // Inbound arguments
    /** <code>dominiocambiarDiasVigenciapthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPTHISDOMINIO = "p_thisDominio";
    /** <code>dominiocambiarDiasVigenciapthisDominio</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPTHISDOMINIO = "Clas_1431701422080423Ser_16Arg_1_Alias";
    /** <code>dominiocambiarDiasVigenciapthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPTHISDOMINIO = "Dominio";
    /** <code>dominiocambiarDiasVigenciapIniVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPINIVIGENCIA = "pIniVigencia";
    /** <code>dominiocambiarDiasVigenciapIniVigencia</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPINIVIGENCIA = "Clas_1431701422080423Ser_16Arg_2_Alias";
    /** <code>dominiocambiarDiasVigenciapIniVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPINIVIGENCIA = "Inicio vigencia";
    /** <code>dominiocambiarDiasVigenciapFinVigencia</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPFINVIGENCIA = "pFinVigencia";
    /** <code>dominiocambiarDiasVigenciapFinVigencia</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPFINVIGENCIA = "Clas_1431701422080423Ser_16Arg_3_Alias";
    /** <code>dominiocambiarDiasVigenciapFinVigencia</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPFINVIGENCIA = "Fin vigencia";
    /** <code>dominiocambiarDiasVigenciapCaducidad</code> inbound argument name. */
    public static final String ARG_NAME_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPCADUCIDAD = "pCaducidad";
    /** <code>dominiocambiarDiasVigenciapCaducidad</code> inbound argument id. */
    public static final String ARG_ID_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPCADUCIDAD = "Clas_1431701422080423Ser_16Arg_4_Alias";
    /** <code>dominiocambiarDiasVigenciapCaducidad</code> inbound argument alias. */
    public static final String ARG_ALIAS_CAMBIARDIASVIGENCIA_DOMINIOCAMBIARDIASVIGENCIAPCADUCIDAD = "Días de caducidad";
    // Service (InsPlantilla)
    /** <code>InsPlantilla</code> service id. */
    public static final String SERV_ID_INSPLANTILLA = "Clas_1431701422080423Ser_17_Alias";
    /** <code>InsPlantilla</code> service name. */
    public static final String SERV_NAME_INSPLANTILLA = "InsPlantilla";
    /** <code>InsPlantilla</code> service alias. */
    public static final String SERV_ALIAS_INSPLANTILLA = "InsPlantilla";
    /** Agents allowed to execute the service InsPlantilla **/
    public static final String INSPLANTILLA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioInsPlantillapthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSPLANTILLA_DOMINIOINSPLANTILLAPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioInsPlantillapthisDominio</code> inbound argument id. */
    public static final String ARG_ID_INSPLANTILLA_DOMINIOINSPLANTILLAPTHISDOMINIO = "Clas_1431701422080423Ser_17Arg_1_Alias";
    /** <code>dominioInsPlantillapthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPLANTILLA_DOMINIOINSPLANTILLAPTHISDOMINIO = "Dominios";
    /** <code>dominioInsPlantillapevcPlantillaEmail</code> inbound argument name. */
    public static final String ARG_NAME_INSPLANTILLA_DOMINIOINSPLANTILLAPEVCPLANTILLAEMAIL = "p_evcPlantillaEmail";
    /** <code>dominioInsPlantillapevcPlantillaEmail</code> inbound argument id. */
    public static final String ARG_ID_INSPLANTILLA_DOMINIOINSPLANTILLAPEVCPLANTILLAEMAIL = "Clas_1431701422080423Ser_17Arg_2_Alias";
    /** <code>dominioInsPlantillapevcPlantillaEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSPLANTILLA_DOMINIOINSPLANTILLAPEVCPLANTILLAEMAIL = "Plantillas";
    // Service (DelPlantilla)
    /** <code>DelPlantilla</code> service id. */
    public static final String SERV_ID_DELPLANTILLA = "Clas_1431701422080423Ser_18_Alias";
    /** <code>DelPlantilla</code> service name. */
    public static final String SERV_NAME_DELPLANTILLA = "DelPlantilla";
    /** <code>DelPlantilla</code> service alias. */
    public static final String SERV_ALIAS_DELPLANTILLA = "Eliminar uso de plantilla";
    /** Agents allowed to execute the service DelPlantilla **/
    public static final String DELPLANTILLA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioDelPlantillapthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELPLANTILLA_DOMINIODELPLANTILLAPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioDelPlantillapthisDominio</code> inbound argument id. */
    public static final String ARG_ID_DELPLANTILLA_DOMINIODELPLANTILLAPTHISDOMINIO = "Clas_1431701422080423Ser_18Arg_1_Alias";
    /** <code>dominioDelPlantillapthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPLANTILLA_DOMINIODELPLANTILLAPTHISDOMINIO = "Dominios";
    /** <code>dominioDelPlantillapevcPlantillaEmail</code> inbound argument name. */
    public static final String ARG_NAME_DELPLANTILLA_DOMINIODELPLANTILLAPEVCPLANTILLAEMAIL = "p_evcPlantillaEmail";
    /** <code>dominioDelPlantillapevcPlantillaEmail</code> inbound argument id. */
    public static final String ARG_ID_DELPLANTILLA_DOMINIODELPLANTILLAPEVCPLANTILLAEMAIL = "Clas_1431701422080423Ser_18Arg_2_Alias";
    /** <code>dominioDelPlantillapevcPlantillaEmail</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELPLANTILLA_DOMINIODELPLANTILLAPEVCPLANTILLAEMAIL = "Plantillas";
    // Service (InsNovedad)
    /** <code>InsNovedad</code> service id. */
    public static final String SERV_ID_INSNOVEDAD = "Clas_1431701422080423Ser_20_Alias";
    /** <code>InsNovedad</code> service name. */
    public static final String SERV_NAME_INSNOVEDAD = "InsNovedad";
    /** <code>InsNovedad</code> service alias. */
    public static final String SERV_ALIAS_INSNOVEDAD = "Asignar Novedad";
    /** Agents allowed to execute the service InsNovedad **/
    public static final String INSNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioInsNovedadpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSNOVEDAD_DOMINIOINSNOVEDADPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioInsNovedadpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_INSNOVEDAD_DOMINIOINSNOVEDADPTHISDOMINIO = "Clas_1431701422080423Ser_20Arg_1_Alias";
    /** <code>dominioInsNovedadpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSNOVEDAD_DOMINIOINSNOVEDADPTHISDOMINIO = "Dominio";
    /** <code>dominioInsNovedadpevcNovedad</code> inbound argument name. */
    public static final String ARG_NAME_INSNOVEDAD_DOMINIOINSNOVEDADPEVCNOVEDAD = "p_evcNovedad";
    /** <code>dominioInsNovedadpevcNovedad</code> inbound argument id. */
    public static final String ARG_ID_INSNOVEDAD_DOMINIOINSNOVEDADPEVCNOVEDAD = "Clas_1431701422080423Ser_20Arg_2_Alias";
    /** <code>dominioInsNovedadpevcNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSNOVEDAD_DOMINIOINSNOVEDADPEVCNOVEDAD = "Novedad";
    // Service (DelNovedad)
    /** <code>DelNovedad</code> service id. */
    public static final String SERV_ID_DELNOVEDAD = "Clas_1431701422080423Ser_21_Alias";
    /** <code>DelNovedad</code> service name. */
    public static final String SERV_NAME_DELNOVEDAD = "DelNovedad";
    /** <code>DelNovedad</code> service alias. */
    public static final String SERV_ALIAS_DELNOVEDAD = "DelNovedad";
    /** Agents allowed to execute the service DelNovedad **/
    public static final String DELNOVEDAD_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioDelNovedadpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELNOVEDAD_DOMINIODELNOVEDADPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioDelNovedadpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_DELNOVEDAD_DOMINIODELNOVEDADPTHISDOMINIO = "Clas_1431701422080423Ser_21Arg_1_Alias";
    /** <code>dominioDelNovedadpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELNOVEDAD_DOMINIODELNOVEDADPTHISDOMINIO = "Dominios";
    /** <code>dominioDelNovedadpevcNovedad</code> inbound argument name. */
    public static final String ARG_NAME_DELNOVEDAD_DOMINIODELNOVEDADPEVCNOVEDAD = "p_evcNovedad";
    /** <code>dominioDelNovedadpevcNovedad</code> inbound argument id. */
    public static final String ARG_ID_DELNOVEDAD_DOMINIODELNOVEDADPEVCNOVEDAD = "Clas_1431701422080423Ser_21Arg_2_Alias";
    /** <code>dominioDelNovedadpevcNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELNOVEDAD_DOMINIODELNOVEDADPEVCNOVEDAD = "Novedades";
    // Service (modificarConfSolNovedad)
    /** <code>modificarConfSolNovedad</code> service id. */
    public static final String SERV_ID_MODIFICARCONFSOLNOVEDAD = "Clas_1431701422080423Ser_22_Alias";
    /** <code>modificarConfSolNovedad</code> service name. */
    public static final String SERV_NAME_MODIFICARCONFSOLNOVEDAD = "modificarConfSolNovedad";
    /** <code>modificarConfSolNovedad</code> service alias. */
    public static final String SERV_ALIAS_MODIFICARCONFSOLNOVEDAD = "Modificar configuración Solicitudes de Novedad";
    /** Agents allowed to execute the service modificarConfSolNovedad **/
    public static final String MODIFICARCONFSOLNOVEDAD_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominiomodificarConfSolNovedadpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPTHISDOMINIO = "p_thisDominio";
    /** <code>dominiomodificarConfSolNovedadpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPTHISDOMINIO = "Clas_1431701422080423Ser_22Arg_1_Alias";
    /** <code>dominiomodificarConfSolNovedadpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPTHISDOMINIO = "Dominio";
    /** <code>dominiomodificarConfSolNovedadpNovExcepcionReqDoc</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPNOVEXCEPCIONREQDOC = "p_NovExcepcionReqDoc";
    /** <code>dominiomodificarConfSolNovedadpNovExcepcionReqDoc</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPNOVEXCEPCIONREQDOC = "Clas_1431701422080423Ser_22Arg_14_Alias";
    /** <code>dominiomodificarConfSolNovedadpNovExcepcionReqDoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPNOVEXCEPCIONREQDOC = "Novedades Excepción requiere documentos";
    /** <code>dominiomodificarConfSolNovedadpSolNovColorOscuro</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPSOLNOVCOLOROSCURO = "p_SolNovColorOscuro";
    /** <code>dominiomodificarConfSolNovedadpSolNovColorOscuro</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPSOLNOVCOLOROSCURO = "Clas_1431701422080423Ser_22Arg_15_Alias";
    /** <code>dominiomodificarConfSolNovedadpSolNovColorOscuro</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPSOLNOVCOLOROSCURO = "Color oscuro";
    /** <code>dominiomodificarConfSolNovedadpSolNovColorClaro</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPSOLNOVCOLORCLARO = "p_SolNovColorClaro";
    /** <code>dominiomodificarConfSolNovedadpSolNovColorClaro</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPSOLNOVCOLORCLARO = "Clas_1431701422080423Ser_22Arg_16_Alias";
    /** <code>dominiomodificarConfSolNovedadpSolNovColorClaro</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPSOLNOVCOLORCLARO = "Color claro";
    /** <code>dominiomodificarConfSolNovedadpSolNovLogo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPSOLNOVLOGO = "p_SolNovLogo";
    /** <code>dominiomodificarConfSolNovedadpSolNovLogo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPSOLNOVLOGO = "Clas_1431701422080423Ser_22Arg_17_Alias";
    /** <code>dominiomodificarConfSolNovedadpSolNovLogo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICARCONFSOLNOVEDAD_DOMINIOMODIFICARCONFSOLNOVEDADPSOLNOVLOGO = "Logo";
    // Service (InsGrupoAsesores)
    /** <code>InsGrupoAsesores</code> service id. */
    public static final String SERV_ID_INSGRUPOASESORES = "Clas_1431701422080423Ser_24_Alias";
    /** <code>InsGrupoAsesores</code> service name. */
    public static final String SERV_NAME_INSGRUPOASESORES = "InsGrupoAsesores";
    /** <code>InsGrupoAsesores</code> service alias. */
    public static final String SERV_ALIAS_INSGRUPOASESORES = "InsGrupoAsesores";
    /** Agents allowed to execute the service InsGrupoAsesores **/
    public static final String INSGRUPOASESORES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioInsGrupoAsesorespthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASESORES_DOMINIOINSGRUPOASESORESPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioInsGrupoAsesorespthisDominio</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASESORES_DOMINIOINSGRUPOASESORESPTHISDOMINIO = "Clas_1431701422080423Ser_24Arg_1_Alias";
    /** <code>dominioInsGrupoAsesorespthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASESORES_DOMINIOINSGRUPOASESORESPTHISDOMINIO = "Dominio Asesores";
    /** <code>dominioInsGrupoAsesorespevcGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOASESORES_DOMINIOINSGRUPOASESORESPEVCGRUPOASIGNACION = "p_evcGrupoAsignacion";
    /** <code>dominioInsGrupoAsesorespevcGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOASESORES_DOMINIOINSGRUPOASESORESPEVCGRUPOASIGNACION = "Clas_1431701422080423Ser_24Arg_2_Alias";
    /** <code>dominioInsGrupoAsesorespevcGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOASESORES_DOMINIOINSGRUPOASESORESPEVCGRUPOASIGNACION = "Grupo Asesores";
    // Service (DelGrupoAsesores)
    /** <code>DelGrupoAsesores</code> service id. */
    public static final String SERV_ID_DELGRUPOASESORES = "Clas_1431701422080423Ser_25_Alias";
    /** <code>DelGrupoAsesores</code> service name. */
    public static final String SERV_NAME_DELGRUPOASESORES = "DelGrupoAsesores";
    /** <code>DelGrupoAsesores</code> service alias. */
    public static final String SERV_ALIAS_DELGRUPOASESORES = "DelGrupoAsesores";
    /** Agents allowed to execute the service DelGrupoAsesores **/
    public static final String DELGRUPOASESORES_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioDelGrupoAsesorespthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASESORES_DOMINIODELGRUPOASESORESPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioDelGrupoAsesorespthisDominio</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASESORES_DOMINIODELGRUPOASESORESPTHISDOMINIO = "Clas_1431701422080423Ser_25Arg_1_Alias";
    /** <code>dominioDelGrupoAsesorespthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASESORES_DOMINIODELGRUPOASESORESPTHISDOMINIO = "Dominio Asesores";
    /** <code>dominioDelGrupoAsesorespevcGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOASESORES_DOMINIODELGRUPOASESORESPEVCGRUPOASIGNACION = "p_evcGrupoAsignacion";
    /** <code>dominioDelGrupoAsesorespevcGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOASESORES_DOMINIODELGRUPOASESORESPEVCGRUPOASIGNACION = "Clas_1431701422080423Ser_25Arg_2_Alias";
    /** <code>dominioDelGrupoAsesorespevcGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOASESORES_DOMINIODELGRUPOASESORESPEVCGRUPOASIGNACION = "Grupo Asesores";
    // Service (InsGrupoAreaMedica)
    /** <code>InsGrupoAreaMedica</code> service id. */
    public static final String SERV_ID_INSGRUPOAREAMEDICA = "Clas_1431701422080423Ser_26_Alias";
    /** <code>InsGrupoAreaMedica</code> service name. */
    public static final String SERV_NAME_INSGRUPOAREAMEDICA = "InsGrupoAreaMedica";
    /** <code>InsGrupoAreaMedica</code> service alias. */
    public static final String SERV_ALIAS_INSGRUPOAREAMEDICA = "InsGrupoAreaMedica";
    /** Agents allowed to execute the service InsGrupoAreaMedica **/
    public static final String INSGRUPOAREAMEDICA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioInsGrupoAreaMedicapthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOAREAMEDICA_DOMINIOINSGRUPOAREAMEDICAPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioInsGrupoAreaMedicapthisDominio</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOAREAMEDICA_DOMINIOINSGRUPOAREAMEDICAPTHISDOMINIO = "Clas_1431701422080423Ser_26Arg_1_Alias";
    /** <code>dominioInsGrupoAreaMedicapthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOAREAMEDICA_DOMINIOINSGRUPOAREAMEDICAPTHISDOMINIO = "Dominios Area Medica";
    /** <code>dominioInsGrupoAreaMedicapevcGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_INSGRUPOAREAMEDICA_DOMINIOINSGRUPOAREAMEDICAPEVCGRUPOASIGNACION = "p_evcGrupoAsignacion";
    /** <code>dominioInsGrupoAreaMedicapevcGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_INSGRUPOAREAMEDICA_DOMINIOINSGRUPOAREAMEDICAPEVCGRUPOASIGNACION = "Clas_1431701422080423Ser_26Arg_2_Alias";
    /** <code>dominioInsGrupoAreaMedicapevcGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSGRUPOAREAMEDICA_DOMINIOINSGRUPOAREAMEDICAPEVCGRUPOASIGNACION = "Grupo Área Médica";
    // Service (DelGrupoAreaMedica)
    /** <code>DelGrupoAreaMedica</code> service id. */
    public static final String SERV_ID_DELGRUPOAREAMEDICA = "Clas_1431701422080423Ser_27_Alias";
    /** <code>DelGrupoAreaMedica</code> service name. */
    public static final String SERV_NAME_DELGRUPOAREAMEDICA = "DelGrupoAreaMedica";
    /** <code>DelGrupoAreaMedica</code> service alias. */
    public static final String SERV_ALIAS_DELGRUPOAREAMEDICA = "DelGrupoAreaMedica";
    /** Agents allowed to execute the service DelGrupoAreaMedica **/
    public static final String DELGRUPOAREAMEDICA_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioDelGrupoAreaMedicapthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOAREAMEDICA_DOMINIODELGRUPOAREAMEDICAPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioDelGrupoAreaMedicapthisDominio</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOAREAMEDICA_DOMINIODELGRUPOAREAMEDICAPTHISDOMINIO = "Clas_1431701422080423Ser_27Arg_1_Alias";
    /** <code>dominioDelGrupoAreaMedicapthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOAREAMEDICA_DOMINIODELGRUPOAREAMEDICAPTHISDOMINIO = "Dominios Area Medica";
    /** <code>dominioDelGrupoAreaMedicapevcGrupoAsignacion</code> inbound argument name. */
    public static final String ARG_NAME_DELGRUPOAREAMEDICA_DOMINIODELGRUPOAREAMEDICAPEVCGRUPOASIGNACION = "p_evcGrupoAsignacion";
    /** <code>dominioDelGrupoAreaMedicapevcGrupoAsignacion</code> inbound argument id. */
    public static final String ARG_ID_DELGRUPOAREAMEDICA_DOMINIODELGRUPOAREAMEDICAPEVCGRUPOASIGNACION = "Clas_1431701422080423Ser_27Arg_2_Alias";
    /** <code>dominioDelGrupoAreaMedicapevcGrupoAsignacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELGRUPOAREAMEDICA_DOMINIODELGRUPOAREAMEDICAPEVCGRUPOASIGNACION = "Grupo Área Médica";
    // Service (InsDominio)
    /** <code>InsDominio</code> service id. */
    public static final String SERV_ID_INSDOMINIO = "Clas_1431701422080423Ser_34_Alias";
    /** <code>InsDominio</code> service name. */
    public static final String SERV_NAME_INSDOMINIO = "InsDominio";
    /** <code>InsDominio</code> service alias. */
    public static final String SERV_ALIAS_INSDOMINIO = "InsDominio";
    /** Agents allowed to execute the service InsDominio **/
    public static final String INSDOMINIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioInsDominiopthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSDOMINIO_DOMINIOINSDOMINIOPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioInsDominiopthisDominio</code> inbound argument id. */
    public static final String ARG_ID_INSDOMINIO_DOMINIOINSDOMINIOPTHISDOMINIO = "Clas_1431701422080423Ser_34Arg_1_Alias";
    /** <code>dominioInsDominiopthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDOMINIO_DOMINIOINSDOMINIOPTHISDOMINIO = "Dominios";
    /** <code>dominioInsDominiopevcAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_INSDOMINIO_DOMINIOINSDOMINIOPEVCAGENTEXPRODUCTO = "p_evcAgentexProducto";
    /** <code>dominioInsDominiopevcAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_INSDOMINIO_DOMINIOINSDOMINIOPEVCAGENTEXPRODUCTO = "Clas_1431701422080423Ser_34Arg_2_Alias";
    /** <code>dominioInsDominiopevcAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSDOMINIO_DOMINIOINSDOMINIOPEVCAGENTEXPRODUCTO = "AgentexProducto";
    // Service (DelDominio)
    /** <code>DelDominio</code> service id. */
    public static final String SERV_ID_DELDOMINIO = "Clas_1431701422080423Ser_35_Alias";
    /** <code>DelDominio</code> service name. */
    public static final String SERV_NAME_DELDOMINIO = "DelDominio";
    /** <code>DelDominio</code> service alias. */
    public static final String SERV_ALIAS_DELDOMINIO = "DelDominio";
    /** Agents allowed to execute the service DelDominio **/
    public static final String DELDOMINIO_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioDelDominiopthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELDOMINIO_DOMINIODELDOMINIOPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioDelDominiopthisDominio</code> inbound argument id. */
    public static final String ARG_ID_DELDOMINIO_DOMINIODELDOMINIOPTHISDOMINIO = "Clas_1431701422080423Ser_35Arg_1_Alias";
    /** <code>dominioDelDominiopthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDOMINIO_DOMINIODELDOMINIOPTHISDOMINIO = "Dominios";
    /** <code>dominioDelDominiopevcAgentexProducto</code> inbound argument name. */
    public static final String ARG_NAME_DELDOMINIO_DOMINIODELDOMINIOPEVCAGENTEXPRODUCTO = "p_evcAgentexProducto";
    /** <code>dominioDelDominiopevcAgentexProducto</code> inbound argument id. */
    public static final String ARG_ID_DELDOMINIO_DOMINIODELDOMINIOPEVCAGENTEXPRODUCTO = "Clas_1431701422080423Ser_35Arg_2_Alias";
    /** <code>dominioDelDominiopevcAgentexProducto</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELDOMINIO_DOMINIODELDOMINIOPEVCAGENTEXPRODUCTO = "AgentexProducto";
    // Service (InsIncompatible)
    /** <code>InsIncompatible</code> service id. */
    public static final String SERV_ID_INSINCOMPATIBLE = "Clas_1431701422080423Ser_36_Alias";
    /** <code>InsIncompatible</code> service name. */
    public static final String SERV_NAME_INSINCOMPATIBLE = "InsIncompatible";
    /** <code>InsIncompatible</code> service alias. */
    public static final String SERV_ALIAS_INSINCOMPATIBLE = "Asociar incompatible";
    /** Agents allowed to execute the service InsIncompatible **/
    public static final String INSINCOMPATIBLE_SRVAGENTS = "";
    // Preconditions
    /** <code>InsIncompatible</code> precondition 0 id. */
    public static final String PRE_ID_INSINCOMPATIBLE_0 = "Clas_1431701422080423Pre_10_MsgError";
    /** <code>InsIncompatible</code> precondition 1 id. */
    public static final String PRE_ID_INSINCOMPATIBLE_1 = "Clas_1431701422080423Pre_11_MsgError";
    // Inbound arguments
    /** <code>dominioInsIncompatiblepthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSINCOMPATIBLE_DOMINIOINSINCOMPATIBLEPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioInsIncompatiblepthisDominio</code> inbound argument id. */
    public static final String ARG_ID_INSINCOMPATIBLE_DOMINIOINSINCOMPATIBLEPTHISDOMINIO = "Clas_1431701422080423Ser_36Arg_1_Alias";
    /** <code>dominioInsIncompatiblepthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSINCOMPATIBLE_DOMINIOINSINCOMPATIBLEPTHISDOMINIO = "Dominios con incompatibilidad";
    /** <code>dominioInsIncompatiblepevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_INSINCOMPATIBLE_DOMINIOINSINCOMPATIBLEPEVCDOMINIO = "p_evcDominio";
    /** <code>dominioInsIncompatiblepevcDominio</code> inbound argument id. */
    public static final String ARG_ID_INSINCOMPATIBLE_DOMINIOINSINCOMPATIBLEPEVCDOMINIO = "Clas_1431701422080423Ser_36Arg_2_Alias";
    /** <code>dominioInsIncompatiblepevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_INSINCOMPATIBLE_DOMINIOINSINCOMPATIBLEPEVCDOMINIO = "Dominios incompatibles";
    // Service (DelIncompatible)
    /** <code>DelIncompatible</code> service id. */
    public static final String SERV_ID_DELINCOMPATIBLE = "Clas_1431701422080423Ser_37_Alias";
    /** <code>DelIncompatible</code> service name. */
    public static final String SERV_NAME_DELINCOMPATIBLE = "DelIncompatible";
    /** <code>DelIncompatible</code> service alias. */
    public static final String SERV_ALIAS_DELINCOMPATIBLE = "Desasociar";
    /** Agents allowed to execute the service DelIncompatible **/
    public static final String DELINCOMPATIBLE_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominioDelIncompatiblepthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELINCOMPATIBLE_DOMINIODELINCOMPATIBLEPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioDelIncompatiblepthisDominio</code> inbound argument id. */
    public static final String ARG_ID_DELINCOMPATIBLE_DOMINIODELINCOMPATIBLEPTHISDOMINIO = "Clas_1431701422080423Ser_37Arg_1_Alias";
    /** <code>dominioDelIncompatiblepthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELINCOMPATIBLE_DOMINIODELINCOMPATIBLEPTHISDOMINIO = "Dominios con incompatibilidad";
    /** <code>dominioDelIncompatiblepevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_DELINCOMPATIBLE_DOMINIODELINCOMPATIBLEPEVCDOMINIO = "p_evcDominio";
    /** <code>dominioDelIncompatiblepevcDominio</code> inbound argument id. */
    public static final String ARG_ID_DELINCOMPATIBLE_DOMINIODELINCOMPATIBLEPEVCDOMINIO = "Clas_1431701422080423Ser_37Arg_2_Alias";
    /** <code>dominioDelIncompatiblepevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_DELINCOMPATIBLE_DOMINIODELINCOMPATIBLEPEVCDOMINIO = "Dominios incompatibles";
    // Service (modificar)
    /** <code>modificar</code> service id. */
    public static final String SERV_ID_MODIFICAR = "Clas_1431701422080423Ser_40_Alias";
    /** <code>modificar</code> service name. */
    public static final String SERV_NAME_MODIFICAR = "modificar";
    /** <code>modificar</code> service alias. */
    public static final String SERV_ALIAS_MODIFICAR = "Modificar dominio";
    /** Agents allowed to execute the service modificar **/
    public static final String MODIFICAR_SRVAGENTS = "";
    // Inbound arguments
    /** <code>dominiomodificarpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPTHISDOMINIO = "p_thisDominio";
    /** <code>dominiomodificarpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPTHISDOMINIO = "Clas_1431701422080423Ser_40Arg_1_Alias";
    /** <code>dominiomodificarpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPTHISDOMINIO = "Dominio";
    /** <code>dominiomodificarpReqCuesMed</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPREQCUESMED = "p_ReqCuesMed";
    /** <code>dominiomodificarpReqCuesMed</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPREQCUESMED = "Clas_1431701422080423Ser_40Arg_2_Alias";
    /** <code>dominiomodificarpReqCuesMed</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPREQCUESMED = "Cuestionario médico";
    /** <code>dominiomodificarpNoCuesMedTras</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPNOCUESMEDTRAS = "p_NoCuesMedTras";
    /** <code>dominiomodificarpNoCuesMedTras</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPNOCUESMEDTRAS = "Clas_1431701422080423Ser_40Arg_3_Alias";
    /** <code>dominiomodificarpNoCuesMedTras</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPNOCUESMEDTRAS = "No cuestionario si traslado";
    /** <code>dominiomodificarpNuevaAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPNUEVAAFILIACION = "p_NuevaAfiliacion";
    /** <code>dominiomodificarpNuevaAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPNUEVAAFILIACION = "Clas_1431701422080423Ser_40Arg_4_Alias";
    /** <code>dominiomodificarpNuevaAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPNUEVAAFILIACION = "Nueva afiliación";
    /** <code>dominiomodificarpInclusion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPINCLUSION = "p_Inclusion";
    /** <code>dominiomodificarpInclusion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPINCLUSION = "Clas_1431701422080423Ser_40Arg_5_Alias";
    /** <code>dominiomodificarpInclusion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPINCLUSION = "Inclusión";
    /** <code>dominiomodificarpAcepCuesMat</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPACEPCUESMAT = "p_AcepCuesMat";
    /** <code>dominiomodificarpAcepCuesMat</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPACEPCUESMAT = "Clas_1431701422080423Ser_40Arg_6_Alias";
    /** <code>dominiomodificarpAcepCuesMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPACEPCUESMAT = "Cuestionario maternal";
    /** <code>dominiomodificarpAcepCuesNeo</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPACEPCUESNEO = "p_AcepCuesNeo";
    /** <code>dominiomodificarpAcepCuesNeo</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPACEPCUESNEO = "Clas_1431701422080423Ser_40Arg_7_Alias";
    /** <code>dominiomodificarpAcepCuesNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPACEPCUESNEO = "Cuestionario neonatal";
    /** <code>dominiomodificarpAcepBBGestante</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPACEPBBGESTANTE = "p_AcepBBGestante";
    /** <code>dominiomodificarpAcepBBGestante</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPACEPBBGESTANTE = "Clas_1431701422080423Ser_40Arg_8_Alias";
    /** <code>dominiomodificarpAcepBBGestante</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPACEPBBGESTANTE = "Bebe gestante";
    /** <code>dominiomodificarpIgnorarPreexistencias</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPIGNORARPREEXISTENCIAS = "p_IgnorarPreexistencias";
    /** <code>dominiomodificarpIgnorarPreexistencias</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPIGNORARPREEXISTENCIAS = "Clas_1431701422080423Ser_40Arg_9_Alias";
    /** <code>dominiomodificarpIgnorarPreexistencias</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPIGNORARPREEXISTENCIAS = "Ignorar preexistencias";
    /** <code>dominiomodificarpProrrateoUsuExistente</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPPRORRATEOUSUEXISTENTE = "p_ProrrateoUsuExistente";
    /** <code>dominiomodificarpProrrateoUsuExistente</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPPRORRATEOUSUEXISTENTE = "Clas_1431701422080423Ser_40Arg_10_Alias";
    /** <code>dominiomodificarpProrrateoUsuExistente</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPPRORRATEOUSUEXISTENTE = "Prorrateo usuarios existentes";
    /** <code>dominiomodificarpInclusionModGrupoAsoc</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPINCLUSIONMODGRUPOASOC = "p_InclusionModGrupoAsoc";
    /** <code>dominiomodificarpInclusionModGrupoAsoc</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPINCLUSIONMODGRUPOASOC = "Clas_1431701422080423Ser_40Arg_11_Alias";
    /** <code>dominiomodificarpInclusionModGrupoAsoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPINCLUSIONMODGRUPOASOC = "Modificación grupo asociado";
    /** <code>dominiomodificarpPermiteRechazadosAfi</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPPERMITERECHAZADOSAFI = "p_PermiteRechazadosAfi";
    /** <code>dominiomodificarpPermiteRechazadosAfi</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPPERMITERECHAZADOSAFI = "Clas_1431701422080423Ser_40Arg_12_Alias";
    /** <code>dominiomodificarpPermiteRechazadosAfi</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPPERMITERECHAZADOSAFI = "Permite rechazados afiliación";
    /** <code>dominiomodificarpAcepPolizaInter</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPACEPPOLIZAINTER = "p_AcepPolizaInter";
    /** <code>dominiomodificarpAcepPolizaInter</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPACEPPOLIZAINTER = "Clas_1431701422080423Ser_40Arg_13_Alias";
    /** <code>dominiomodificarpAcepPolizaInter</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPACEPPOLIZAINTER = "Poliza Internacional";
    /** <code>dominiomodificarpMostrarPreexAnexos</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPMOSTRARPREEXANEXOS = "p_MostrarPreexAnexos";
    /** <code>dominiomodificarpMostrarPreexAnexos</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPMOSTRARPREEXANEXOS = "Clas_1431701422080423Ser_40Arg_14_Alias";
    /** <code>dominiomodificarpMostrarPreexAnexos</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPMOSTRARPREEXANEXOS = "Mostrar Preexistencias";
    /** <code>dominiomodificarpMostrarPreexContrato</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPMOSTRARPREEXCONTRATO = "p_MostrarPreexContrato";
    /** <code>dominiomodificarpMostrarPreexContrato</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPMOSTRARPREEXCONTRATO = "Clas_1431701422080423Ser_40Arg_15_Alias";
    /** <code>dominiomodificarpMostrarPreexContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPMOSTRARPREEXCONTRATO = "Mostrar Preexistencias en Contrato";
    /** <code>dominiomodificarpTramiteEnLinea</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPTRAMITEENLINEA = "p_TramiteEnLinea";
    /** <code>dominiomodificarpTramiteEnLinea</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPTRAMITEENLINEA = "Clas_1431701422080423Ser_40Arg_16_Alias";
    /** <code>dominiomodificarpTramiteEnLinea</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPTRAMITEENLINEA = "Trámite en línea";
    /** <code>dominiomodificarpeVigenciaRadicacion</code> inbound argument name. */
    public static final String ARG_NAME_MODIFICAR_DOMINIOMODIFICARPEVIGENCIARADICACION = "peVigenciaRadicacion";
    /** <code>dominiomodificarpeVigenciaRadicacion</code> inbound argument id. */
    public static final String ARG_ID_MODIFICAR_DOMINIOMODIFICARPEVIGENCIARADICACION = "Clas_1431701422080423Ser_40Arg_17_Alias";
    /** <code>dominiomodificarpeVigenciaRadicacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_MODIFICAR_DOMINIOMODIFICARPEVIGENCIARADICACION = "Vigencia de radicación";
    // Service (TELIMINAR)
    /** <code>TELIMINAR</code> service id. */
    public static final String SERV_ID_TELIMINAR = "Clas_1431701422080423Ser_10_Alias";
    /** <code>TELIMINAR</code> service name. */
    public static final String SERV_NAME_TELIMINAR = "TELIMINAR";
    /** <code>TELIMINAR</code> service alias. */
    public static final String SERV_ALIAS_TELIMINAR = "Eliminar dominio";
    /** Agents allowed to execute the service TELIMINAR **/
    public static final String TELIMINAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioTELIMINARpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TELIMINAR_DOMINIOTELIMINARPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTELIMINARpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TELIMINAR_DOMINIOTELIMINARPTHISDOMINIO = "Clas_1431701422080423Ser_10Arg_1_Alias";
    /** <code>dominioTELIMINARpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TELIMINAR_DOMINIOTELIMINARPTHISDOMINIO = "Dominio";
    // Service (TINSPLANTILLA)
    /** <code>TINSPLANTILLA</code> service id. */
    public static final String SERV_ID_TINSPLANTILLA = "Clas_1431701422080423Ser_19_Alias";
    /** <code>TINSPLANTILLA</code> service name. */
    public static final String SERV_NAME_TINSPLANTILLA = "TINSPLANTILLA";
    /** <code>TINSPLANTILLA</code> service alias. */
    public static final String SERV_ALIAS_TINSPLANTILLA = "Asignar Plantilla";
    /** Agents allowed to execute the service TINSPLANTILLA **/
    public static final String TINSPLANTILLA_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioTINSPLANTILLApthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TINSPLANTILLA_DOMINIOTINSPLANTILLAPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTINSPLANTILLApthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TINSPLANTILLA_DOMINIOTINSPLANTILLAPTHISDOMINIO = "Clas_1431701422080423Ser_19Arg_1_Alias";
    /** <code>dominioTINSPLANTILLApthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINSPLANTILLA_DOMINIOTINSPLANTILLAPTHISDOMINIO = "Dominio";
    /** <code>dominioTINSPLANTILLAptPlantilla</code> inbound argument name. */
    public static final String ARG_NAME_TINSPLANTILLA_DOMINIOTINSPLANTILLAPTPLANTILLA = "ptPlantilla";
    /** <code>dominioTINSPLANTILLAptPlantilla</code> inbound argument id. */
    public static final String ARG_ID_TINSPLANTILLA_DOMINIOTINSPLANTILLAPTPLANTILLA = "Clas_1431701422080423Ser_19Arg_2_Alias";
    /** <code>dominioTINSPLANTILLAptPlantilla</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINSPLANTILLA_DOMINIOTINSPLANTILLAPTPLANTILLA = "Plantilla";
    // Service (TINSNOVEDAD)
    /** <code>TINSNOVEDAD</code> service id. */
    public static final String SERV_ID_TINSNOVEDAD = "Clas_1431701422080423Ser_23_Alias";
    /** <code>TINSNOVEDAD</code> service name. */
    public static final String SERV_NAME_TINSNOVEDAD = "TINSNOVEDAD";
    /** <code>TINSNOVEDAD</code> service alias. */
    public static final String SERV_ALIAS_TINSNOVEDAD = "Asignar Novedad";
    /** Agents allowed to execute the service TINSNOVEDAD **/
    public static final String TINSNOVEDAD_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioTINSNOVEDADpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TINSNOVEDAD_DOMINIOTINSNOVEDADPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTINSNOVEDADpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TINSNOVEDAD_DOMINIOTINSNOVEDADPTHISDOMINIO = "Clas_1431701422080423Ser_23Arg_1_Alias";
    /** <code>dominioTINSNOVEDADpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINSNOVEDAD_DOMINIOTINSNOVEDADPTHISDOMINIO = "Dominio";
    /** <code>dominioTINSNOVEDADptpevcNovedad</code> inbound argument name. */
    public static final String ARG_NAME_TINSNOVEDAD_DOMINIOTINSNOVEDADPTPEVCNOVEDAD = "pt_p_evcNovedad";
    /** <code>dominioTINSNOVEDADptpevcNovedad</code> inbound argument id. */
    public static final String ARG_ID_TINSNOVEDAD_DOMINIOTINSNOVEDADPTPEVCNOVEDAD = "Clas_1431701422080423Ser_23Arg_2_Alias";
    /** <code>dominioTINSNOVEDADptpevcNovedad</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINSNOVEDAD_DOMINIOTINSNOVEDADPTPEVCNOVEDAD = "Novedad";
    /** <code>dominioTINSNOVEDADptTipo</code> inbound argument name. */
    public static final String ARG_NAME_TINSNOVEDAD_DOMINIOTINSNOVEDADPTTIPO = "ptTipo";
    /** <code>dominioTINSNOVEDADptTipo</code> inbound argument id. */
    public static final String ARG_ID_TINSNOVEDAD_DOMINIOTINSNOVEDADPTTIPO = "Clas_1431701422080423Ser_23Arg_3_Alias";
    /** <code>dominioTINSNOVEDADptTipo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINSNOVEDAD_DOMINIOTINSNOVEDADPTTIPO = "Tipo Novedad";
    // Service (TADDGRPASESORES)
    /** <code>TADDGRPASESORES</code> service id. */
    public static final String SERV_ID_TADDGRPASESORES = "Clas_1431701422080423Ser_29_Alias";
    /** <code>TADDGRPASESORES</code> service name. */
    public static final String SERV_NAME_TADDGRPASESORES = "TADDGRPASESORES";
    /** <code>TADDGRPASESORES</code> service alias. */
    public static final String SERV_ALIAS_TADDGRPASESORES = "Asignar Grupo";
    /** Agents allowed to execute the service TADDGRPASESORES **/
    public static final String TADDGRPASESORES_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioTADDGRPASESORESpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TADDGRPASESORES_DOMINIOTADDGRPASESORESPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTADDGRPASESORESpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TADDGRPASESORES_DOMINIOTADDGRPASESORESPTHISDOMINIO = "Clas_1431701422080423Ser_29Arg_1_Alias";
    /** <code>dominioTADDGRPASESORESpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDGRPASESORES_DOMINIOTADDGRPASESORESPTHISDOMINIO = "Dominio";
    /** <code>dominioTADDGRPASESORESptGrupo</code> inbound argument name. */
    public static final String ARG_NAME_TADDGRPASESORES_DOMINIOTADDGRPASESORESPTGRUPO = "ptGrupo";
    /** <code>dominioTADDGRPASESORESptGrupo</code> inbound argument id. */
    public static final String ARG_ID_TADDGRPASESORES_DOMINIOTADDGRPASESORESPTGRUPO = "Clas_1431701422080423Ser_29Arg_2_Alias";
    /** <code>dominioTADDGRPASESORESptGrupo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDGRPASESORES_DOMINIOTADDGRPASESORESPTGRUPO = "Grupo";
    // Service (TDELGRPASESORES)
    /** <code>TDELGRPASESORES</code> service id. */
    public static final String SERV_ID_TDELGRPASESORES = "Clas_1431701422080423Ser_30_Alias";
    /** <code>TDELGRPASESORES</code> service name. */
    public static final String SERV_NAME_TDELGRPASESORES = "TDELGRPASESORES";
    /** <code>TDELGRPASESORES</code> service alias. */
    public static final String SERV_ALIAS_TDELGRPASESORES = "Eliminar Grupo Asesores/Afiliaciones";
    /** Agents allowed to execute the service TDELGRPASESORES **/
    public static final String TDELGRPASESORES_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioTDELGRPASESORESpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TDELGRPASESORES_DOMINIOTDELGRPASESORESPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTDELGRPASESORESpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TDELGRPASESORES_DOMINIOTDELGRPASESORESPTHISDOMINIO = "Clas_1431701422080423Ser_30Arg_1_Alias";
    /** <code>dominioTDELGRPASESORESpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELGRPASESORES_DOMINIOTDELGRPASESORESPTHISDOMINIO = "Dominio";
    // Service (TADDGRPMEDICO)
    /** <code>TADDGRPMEDICO</code> service id. */
    public static final String SERV_ID_TADDGRPMEDICO = "Clas_1431701422080423Ser_31_Alias";
    /** <code>TADDGRPMEDICO</code> service name. */
    public static final String SERV_NAME_TADDGRPMEDICO = "TADDGRPMEDICO";
    /** <code>TADDGRPMEDICO</code> service alias. */
    public static final String SERV_ALIAS_TADDGRPMEDICO = "Asignar Grupo";
    /** Agents allowed to execute the service TADDGRPMEDICO **/
    public static final String TADDGRPMEDICO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioTADDGRPMEDICOpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TADDGRPMEDICO_DOMINIOTADDGRPMEDICOPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTADDGRPMEDICOpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TADDGRPMEDICO_DOMINIOTADDGRPMEDICOPTHISDOMINIO = "Clas_1431701422080423Ser_31Arg_1_Alias";
    /** <code>dominioTADDGRPMEDICOpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDGRPMEDICO_DOMINIOTADDGRPMEDICOPTHISDOMINIO = "Dominio";
    /** <code>dominioTADDGRPMEDICOptGrupo</code> inbound argument name. */
    public static final String ARG_NAME_TADDGRPMEDICO_DOMINIOTADDGRPMEDICOPTGRUPO = "ptGrupo";
    /** <code>dominioTADDGRPMEDICOptGrupo</code> inbound argument id. */
    public static final String ARG_ID_TADDGRPMEDICO_DOMINIOTADDGRPMEDICOPTGRUPO = "Clas_1431701422080423Ser_31Arg_2_Alias";
    /** <code>dominioTADDGRPMEDICOptGrupo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDGRPMEDICO_DOMINIOTADDGRPMEDICOPTGRUPO = "Grupo";
    // Service (TDELGRPMEDICO)
    /** <code>TDELGRPMEDICO</code> service id. */
    public static final String SERV_ID_TDELGRPMEDICO = "Clas_1431701422080423Ser_32_Alias";
    /** <code>TDELGRPMEDICO</code> service name. */
    public static final String SERV_NAME_TDELGRPMEDICO = "TDELGRPMEDICO";
    /** <code>TDELGRPMEDICO</code> service alias. */
    public static final String SERV_ALIAS_TDELGRPMEDICO = "Eliminar Grupo Área Médica";
    /** Agents allowed to execute the service TDELGRPMEDICO **/
    public static final String TDELGRPMEDICO_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioTDELGRPMEDICOpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TDELGRPMEDICO_DOMINIOTDELGRPMEDICOPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTDELGRPMEDICOpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TDELGRPMEDICO_DOMINIOTDELGRPMEDICOPTHISDOMINIO = "Clas_1431701422080423Ser_32Arg_1_Alias";
    /** <code>dominioTDELGRPMEDICOpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELGRPMEDICO_DOMINIOTDELGRPMEDICOPTHISDOMINIO = "Dominio";
    // Service (TADDREPORTE)
    /** <code>TADDREPORTE</code> service id. */
    public static final String SERV_ID_TADDREPORTE = "Clas_1431701422080423Ser_33_Alias";
    /** <code>TADDREPORTE</code> service name. */
    public static final String SERV_NAME_TADDREPORTE = "TADDREPORTE";
    /** <code>TADDREPORTE</code> service alias. */
    public static final String SERV_ALIAS_TADDREPORTE = "Asociar reporte";
    /** Agents allowed to execute the service TADDREPORTE **/
    public static final String TADDREPORTE_SRVAGENTS = "Admin,SuperAdmin";
    // Preconditions
    /** <code>TADDREPORTE</code> precondition 0 id. */
    public static final String PRE_ID_TADDREPORTE_0 = "Clas_1431701422080423Pre_8_MsgError";
    /** <code>TADDREPORTE</code> precondition 1 id. */
    public static final String PRE_ID_TADDREPORTE_1 = "Clas_1431701422080423Pre_9_MsgError";
    // Inbound arguments
    /** <code>dominioTADDREPORTEpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TADDREPORTE_DOMINIOTADDREPORTEPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTADDREPORTEpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TADDREPORTE_DOMINIOTADDREPORTEPTHISDOMINIO = "Clas_1431701422080423Ser_33Arg_1_Alias";
    /** <code>dominioTADDREPORTEpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDREPORTE_DOMINIOTADDREPORTEPTHISDOMINIO = "Dominio";
    /** <code>dominioTADDREPORTEptpagrPlantillaReporte</code> inbound argument name. */
    public static final String ARG_NAME_TADDREPORTE_DOMINIOTADDREPORTEPTPAGRPLANTILLAREPORTE = "pt_p_agrPlantillaReporte";
    /** <code>dominioTADDREPORTEptpagrPlantillaReporte</code> inbound argument id. */
    public static final String ARG_ID_TADDREPORTE_DOMINIOTADDREPORTEPTPAGRPLANTILLAREPORTE = "Clas_1431701422080423Ser_33Arg_3_Alias";
    /** <code>dominioTADDREPORTEptpagrPlantillaReporte</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDREPORTE_DOMINIOTADDREPORTEPTPAGRPLANTILLAREPORTE = "Plantilla";
    /** <code>dominioTADDREPORTEptpatrEnviarAuto</code> inbound argument name. */
    public static final String ARG_NAME_TADDREPORTE_DOMINIOTADDREPORTEPTPATRENVIARAUTO = "pt_p_atrEnviarAuto";
    /** <code>dominioTADDREPORTEptpatrEnviarAuto</code> inbound argument id. */
    public static final String ARG_ID_TADDREPORTE_DOMINIOTADDREPORTEPTPATRENVIARAUTO = "Clas_1431701422080423Ser_33Arg_4_Alias";
    /** <code>dominioTADDREPORTEptpatrEnviarAuto</code> inbound argument alias. */
    public static final String ARG_ALIAS_TADDREPORTE_DOMINIOTADDREPORTEPTPATRENVIARAUTO = "Enviar automáticamente";
    // Service (TINSINCOMPATIBLE)
    /** <code>TINSINCOMPATIBLE</code> service id. */
    public static final String SERV_ID_TINSINCOMPATIBLE = "Clas_1431701422080423Ser_38_Alias";
    /** <code>TINSINCOMPATIBLE</code> service name. */
    public static final String SERV_NAME_TINSINCOMPATIBLE = "TINSINCOMPATIBLE";
    /** <code>TINSINCOMPATIBLE</code> service alias. */
    public static final String SERV_ALIAS_TINSINCOMPATIBLE = "Asociar incompatible";
    /** Agents allowed to execute the service TINSINCOMPATIBLE **/
    public static final String TINSINCOMPATIBLE_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioTINSINCOMPATIBLEpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TINSINCOMPATIBLE_DOMINIOTINSINCOMPATIBLEPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTINSINCOMPATIBLEpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TINSINCOMPATIBLE_DOMINIOTINSINCOMPATIBLEPTHISDOMINIO = "Clas_1431701422080423Ser_38Arg_1_Alias";
    /** <code>dominioTINSINCOMPATIBLEpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINSINCOMPATIBLE_DOMINIOTINSINCOMPATIBLEPTHISDOMINIO = "Dominio";
    /** <code>dominioTINSINCOMPATIBLEptpevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_TINSINCOMPATIBLE_DOMINIOTINSINCOMPATIBLEPTPEVCDOMINIO = "pt_p_evcDominio";
    /** <code>dominioTINSINCOMPATIBLEptpevcDominio</code> inbound argument id. */
    public static final String ARG_ID_TINSINCOMPATIBLE_DOMINIOTINSINCOMPATIBLEPTPEVCDOMINIO = "Clas_1431701422080423Ser_38Arg_2_Alias";
    /** <code>dominioTINSINCOMPATIBLEptpevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TINSINCOMPATIBLE_DOMINIOTINSINCOMPATIBLEPTPEVCDOMINIO = "Dominio incompatible";
    // Service (TDELINCOMPATIBLE)
    /** <code>TDELINCOMPATIBLE</code> service id. */
    public static final String SERV_ID_TDELINCOMPATIBLE = "Clas_1431701422080423Ser_39_Alias";
    /** <code>TDELINCOMPATIBLE</code> service name. */
    public static final String SERV_NAME_TDELINCOMPATIBLE = "TDELINCOMPATIBLE";
    /** <code>TDELINCOMPATIBLE</code> service alias. */
    public static final String SERV_ALIAS_TDELINCOMPATIBLE = "Desasociar";
    /** Agents allowed to execute the service TDELINCOMPATIBLE **/
    public static final String TDELINCOMPATIBLE_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioTDELINCOMPATIBLEpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TDELINCOMPATIBLE_DOMINIOTDELINCOMPATIBLEPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTDELINCOMPATIBLEpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TDELINCOMPATIBLE_DOMINIOTDELINCOMPATIBLEPTHISDOMINIO = "Clas_1431701422080423Ser_39Arg_1_Alias";
    /** <code>dominioTDELINCOMPATIBLEpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELINCOMPATIBLE_DOMINIOTDELINCOMPATIBLEPTHISDOMINIO = "Dominio";
    /** <code>dominioTDELINCOMPATIBLEptpevcDominio</code> inbound argument name. */
    public static final String ARG_NAME_TDELINCOMPATIBLE_DOMINIOTDELINCOMPATIBLEPTPEVCDOMINIO = "pt_p_evcDominio";
    /** <code>dominioTDELINCOMPATIBLEptpevcDominio</code> inbound argument id. */
    public static final String ARG_ID_TDELINCOMPATIBLE_DOMINIOTDELINCOMPATIBLEPTPEVCDOMINIO = "Clas_1431701422080423Ser_39Arg_2_Alias";
    /** <code>dominioTDELINCOMPATIBLEptpevcDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TDELINCOMPATIBLE_DOMINIOTDELINCOMPATIBLEPTPEVCDOMINIO = "Dominio incompatible";
    // Service (TMODIFICAR)
    /** <code>TMODIFICAR</code> service id. */
    public static final String SERV_ID_TMODIFICAR = "Clas_1431701422080423Ser_41_Alias";
    /** <code>TMODIFICAR</code> service name. */
    public static final String SERV_NAME_TMODIFICAR = "TMODIFICAR";
    /** <code>TMODIFICAR</code> service alias. */
    public static final String SERV_ALIAS_TMODIFICAR = "Modificar dominio";
    /** Agents allowed to execute the service TMODIFICAR **/
    public static final String TMODIFICAR_SRVAGENTS = "Admin,SuperAdmin";
    // Inbound arguments
    /** <code>dominioTMODIFICARpthisDominio</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPTHISDOMINIO = "p_thisDominio";
    /** <code>dominioTMODIFICARpthisDominio</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPTHISDOMINIO = "Clas_1431701422080423Ser_41Arg_2_Alias";
    /** <code>dominioTMODIFICARpthisDominio</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPTHISDOMINIO = "Dominio";
    /** <code>dominioTMODIFICARpReqCuesMed</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPREQCUESMED = "p_ReqCuesMed";
    /** <code>dominioTMODIFICARpReqCuesMed</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPREQCUESMED = "Clas_1431701422080423Ser_41Arg_3_Alias";
    /** <code>dominioTMODIFICARpReqCuesMed</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPREQCUESMED = "Cuestionario médico";
    /** <code>dominioTMODIFICARpNoCuesMedTras</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPNOCUESMEDTRAS = "p_NoCuesMedTras";
    /** <code>dominioTMODIFICARpNoCuesMedTras</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPNOCUESMEDTRAS = "Clas_1431701422080423Ser_41Arg_4_Alias";
    /** <code>dominioTMODIFICARpNoCuesMedTras</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPNOCUESMEDTRAS = "No cuestionario si traslado";
    /** <code>dominioTMODIFICARpNuevaAfiliacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPNUEVAAFILIACION = "p_NuevaAfiliacion";
    /** <code>dominioTMODIFICARpNuevaAfiliacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPNUEVAAFILIACION = "Clas_1431701422080423Ser_41Arg_5_Alias";
    /** <code>dominioTMODIFICARpNuevaAfiliacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPNUEVAAFILIACION = "Nueva afiliación";
    /** <code>dominioTMODIFICARpInclusion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPINCLUSION = "p_Inclusion";
    /** <code>dominioTMODIFICARpInclusion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPINCLUSION = "Clas_1431701422080423Ser_41Arg_6_Alias";
    /** <code>dominioTMODIFICARpInclusion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPINCLUSION = "Inclusión";
    /** <code>dominioTMODIFICARpAcepCuesMat</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPACEPCUESMAT = "p_AcepCuesMat";
    /** <code>dominioTMODIFICARpAcepCuesMat</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPACEPCUESMAT = "Clas_1431701422080423Ser_41Arg_7_Alias";
    /** <code>dominioTMODIFICARpAcepCuesMat</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPACEPCUESMAT = "Cuestionario maternal";
    /** <code>dominioTMODIFICARpAcepCuesNeo</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPACEPCUESNEO = "p_AcepCuesNeo";
    /** <code>dominioTMODIFICARpAcepCuesNeo</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPACEPCUESNEO = "Clas_1431701422080423Ser_41Arg_8_Alias";
    /** <code>dominioTMODIFICARpAcepCuesNeo</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPACEPCUESNEO = "Cuestionario neonatal";
    /** <code>dominioTMODIFICARpAcepBBGestante</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPACEPBBGESTANTE = "p_AcepBBGestante";
    /** <code>dominioTMODIFICARpAcepBBGestante</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPACEPBBGESTANTE = "Clas_1431701422080423Ser_41Arg_9_Alias";
    /** <code>dominioTMODIFICARpAcepBBGestante</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPACEPBBGESTANTE = "Bebe gestante";
    /** <code>dominioTMODIFICARpIgnorarPreexistencias</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPIGNORARPREEXISTENCIAS = "p_IgnorarPreexistencias";
    /** <code>dominioTMODIFICARpIgnorarPreexistencias</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPIGNORARPREEXISTENCIAS = "Clas_1431701422080423Ser_41Arg_10_Alias";
    /** <code>dominioTMODIFICARpIgnorarPreexistencias</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPIGNORARPREEXISTENCIAS = "Ignorar preexistencias";
    /** <code>dominioTMODIFICARpProrrateoUsuExistente</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPPRORRATEOUSUEXISTENTE = "p_ProrrateoUsuExistente";
    /** <code>dominioTMODIFICARpProrrateoUsuExistente</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPPRORRATEOUSUEXISTENTE = "Clas_1431701422080423Ser_41Arg_11_Alias";
    /** <code>dominioTMODIFICARpProrrateoUsuExistente</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPPRORRATEOUSUEXISTENTE = "Prorrateo usuarios existentes";
    /** <code>dominioTMODIFICARpInclusionModGrupoAsoc</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPINCLUSIONMODGRUPOASOC = "p_InclusionModGrupoAsoc";
    /** <code>dominioTMODIFICARpInclusionModGrupoAsoc</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPINCLUSIONMODGRUPOASOC = "Clas_1431701422080423Ser_41Arg_12_Alias";
    /** <code>dominioTMODIFICARpInclusionModGrupoAsoc</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPINCLUSIONMODGRUPOASOC = "Modificación grupo asociado";
    /** <code>dominioTMODIFICARpPermiteRechazadosAfi</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPPERMITERECHAZADOSAFI = "p_PermiteRechazadosAfi";
    /** <code>dominioTMODIFICARpPermiteRechazadosAfi</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPPERMITERECHAZADOSAFI = "Clas_1431701422080423Ser_41Arg_13_Alias";
    /** <code>dominioTMODIFICARpPermiteRechazadosAfi</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPPERMITERECHAZADOSAFI = "Permite rechazados afiliación";
    /** <code>dominioTMODIFICARpAcepPolizaInter</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPACEPPOLIZAINTER = "p_AcepPolizaInter";
    /** <code>dominioTMODIFICARpAcepPolizaInter</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPACEPPOLIZAINTER = "Clas_1431701422080423Ser_41Arg_14_Alias";
    /** <code>dominioTMODIFICARpAcepPolizaInter</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPACEPPOLIZAINTER = "Poliza Internacional";
    /** <code>dominioTMODIFICARpMostrarPreexAnexos</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPMOSTRARPREEXANEXOS = "p_MostrarPreexAnexos";
    /** <code>dominioTMODIFICARpMostrarPreexAnexos</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPMOSTRARPREEXANEXOS = "Clas_1431701422080423Ser_41Arg_15_Alias";
    /** <code>dominioTMODIFICARpMostrarPreexAnexos</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPMOSTRARPREEXANEXOS = "Mostrar Preexistencias";
    /** <code>dominioTMODIFICARpMostrarPreexContrato</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPMOSTRARPREEXCONTRATO = "p_MostrarPreexContrato";
    /** <code>dominioTMODIFICARpMostrarPreexContrato</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPMOSTRARPREEXCONTRATO = "Clas_1431701422080423Ser_41Arg_16_Alias";
    /** <code>dominioTMODIFICARpMostrarPreexContrato</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPMOSTRARPREEXCONTRATO = "Mostrar Preexistencias en Contrato";
    /** <code>dominioTMODIFICARpTramiteEnLinea</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPTRAMITEENLINEA = "p_TramiteEnLinea";
    /** <code>dominioTMODIFICARpTramiteEnLinea</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPTRAMITEENLINEA = "Clas_1431701422080423Ser_41Arg_17_Alias";
    /** <code>dominioTMODIFICARpTramiteEnLinea</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPTRAMITEENLINEA = "Trámite en línea";
    /** <code>dominioTMODIFICARptVigenciaRadicacion</code> inbound argument name. */
    public static final String ARG_NAME_TMODIFICAR_DOMINIOTMODIFICARPTVIGENCIARADICACION = "ptVigenciaRadicacion";
    /** <code>dominioTMODIFICARptVigenciaRadicacion</code> inbound argument id. */
    public static final String ARG_ID_TMODIFICAR_DOMINIOTMODIFICARPTVIGENCIARADICACION = "Clas_1431701422080423Ser_41Arg_18_Alias";
    /** <code>dominioTMODIFICARptVigenciaRadicacion</code> inbound argument alias. */
    public static final String ARG_ALIAS_TMODIFICAR_DOMINIOTMODIFICARPTVIGENCIARADICACION = "Vigencia de radicación";

    public static final String FILTER_NAME_FDOMINIOVARIOS = "F_DominioVarios";
    public static final String VAR_NAME_FDOMINIOVARIOS_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_FDOMINIOVARIOS_VOPLAN = "vo_Plan";
    public static final String VAR_NAME_FDOMINIOVARIOS_VNUEVAAFILIACION = "v_NuevaAfiliacion";
    public static final String VAR_NAME_FDOMINIOVARIOS_VINCLUSION = "v_Inclusion";
    public static final String VAR_NAME_FDOMINIOVARIOS_VOROL = "vo_Rol";
    public static final String FILTER_NAME_IFDOMINIOPRODPLAN = "iF_DominioProdPlan";
    public static final String VAR_NAME_IFDOMINIOPRODPLAN_VOPRODUCTO = "vo_Producto";
    public static final String VAR_NAME_IFDOMINIOPRODPLAN_VOPLAN = "vo_Plan";

    public static final Map<String, String> ATTRIBUTE_TYPES;
    static {
        Map<String, String> attributeTypes = new HashMap<>();
        attributeTypes.put(ATTR_NAME_DOMINIOREQCUESMED.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIONOCUESMEDTRAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIONUEVAAFILIACION.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOINCLUSION.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOACEPCUESMAT.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOACEPCUESNEO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOACEPBBGESTANTE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOMOSTRARPREEXANEXOS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOMOSTRARPREEXCONTRATO.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOIGNORARPREEXISTENCIAS.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIORESPCLAUNOMBRE.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIORESPCLAUCELULA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIORESPCLAUEXPCELULA.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIORESPCLAUCARGO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIORESPCLAUFIRMA.toUpperCase(), Constants.Type.BLOB.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIODIAINIVIGENCIA.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIODIAFINVIGENCIA.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIODIASCADUCIDAD.toUpperCase(), Constants.Type.NAT.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOPRORRATEOUSUEXISTENTE.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOINCLUSIONMODGRUPOASOC.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOPERMITERECHAZADOSAFI.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOACEPPOLIZAINTER.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIONOVEXCEPCIONREQDOC.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOSOLNOVCOLOROSCURO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOSOLNOVCOLORCLARO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOSOLNOVLOGO.toUpperCase(), Constants.Type.STRING.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOTRAMITEENLINEA.toUpperCase(), Constants.Type.BOOL.getTypeName());
        attributeTypes.put(ATTR_NAME_DOMINIOVIGENCIARADICACION.toUpperCase(), Constants.Type.BOOL.getTypeName());
        ATTRIBUTE_TYPES = Collections.unmodifiableMap(attributeTypes);
    }

    public static final Map<String, String> ATTRIBUTE_AGENTS;
    static {
    	Map<String, String> attributeAgents = new HashMap<>();
    	attributeAgents.put(ATTR_NAME_DOMINIONUMERO.toUpperCase(), DOMINIONUMERO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOREQCUESMED.toUpperCase(), DOMINIOREQCUESMED_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIONOCUESMEDTRAS.toUpperCase(), DOMINIONOCUESMEDTRAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIONUEVAAFILIACION.toUpperCase(), DOMINIONUEVAAFILIACION_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOINCLUSION.toUpperCase(), DOMINIOINCLUSION_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOACEPCUESMAT.toUpperCase(), DOMINIOACEPCUESMAT_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOACEPCUESNEO.toUpperCase(), DOMINIOACEPCUESNEO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOACEPBBGESTANTE.toUpperCase(), DOMINIOACEPBBGESTANTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOMOSTRARPREEXANEXOS.toUpperCase(), DOMINIOMOSTRARPREEXANEXOS_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOMOSTRARPREEXCONTRATO.toUpperCase(), DOMINIOMOSTRARPREEXCONTRATO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOIGNORARPREEXISTENCIAS.toUpperCase(), DOMINIOIGNORARPREEXISTENCIAS_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIORESPCLAUNOMBRE.toUpperCase(), DOMINIORESPCLAUNOMBRE_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIORESPCLAUCELULA.toUpperCase(), DOMINIORESPCLAUCELULA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIORESPCLAUEXPCELULA.toUpperCase(), DOMINIORESPCLAUEXPCELULA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIORESPCLAUCARGO.toUpperCase(), DOMINIORESPCLAUCARGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIORESPCLAUFIRMA.toUpperCase(), DOMINIORESPCLAUFIRMA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIODIAINIVIGENCIA.toUpperCase(), DOMINIODIAINIVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIODIAFINVIGENCIA.toUpperCase(), DOMINIODIAFINVIGENCIA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIODIASCADUCIDAD.toUpperCase(), DOMINIODIASCADUCIDAD_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOPRORRATEOUSUEXISTENTE.toUpperCase(), DOMINIOPRORRATEOUSUEXISTENTE_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOINCLUSIONMODGRUPOASOC.toUpperCase(), DOMINIOINCLUSIONMODGRUPOASOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOPERMITERECHAZADOSAFI.toUpperCase(), DOMINIOPERMITERECHAZADOSAFI_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOACEPPOLIZAINTER.toUpperCase(), DOMINIOACEPPOLIZAINTER_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIONOVEXCEPCIONREQDOC.toUpperCase(), DOMINIONOVEXCEPCIONREQDOC_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOSOLNOVCOLOROSCURO.toUpperCase(), DOMINIOSOLNOVCOLOROSCURO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOSOLNOVCOLORCLARO.toUpperCase(), DOMINIOSOLNOVCOLORCLARO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOSOLNOVLOGO.toUpperCase(), DOMINIOSOLNOVLOGO_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOTRAMITEENLINEA.toUpperCase(), DOMINIOTRAMITEENLINEA_AGENTS);
    	attributeAgents.put(ATTR_NAME_DOMINIOVIGENCIARADICACION.toUpperCase(), DOMINIOVIGENCIARADICACION_AGENTS);
    	ATTRIBUTE_AGENTS = Collections.unmodifiableMap(attributeAgents);
    }

    public static final Map<String, String> ROLE_AGENTS;
    static {
        Map<String, String> roleAgents = new HashMap<>();
        roleAgents.put(ROLE_NAME_PLANT.toUpperCase(), PLANT_AGENTS);
        roleAgents.put(ROLE_NAME_PRODUCTOT.toUpperCase(), PRODUCTOT_AGENTS);
        roleAgents.put(ROLE_NAME_GRUPOASESORES.toUpperCase(), GRUPOASESORES_AGENTS);
        roleAgents.put(ROLE_NAME_GRUPOAREAMEDICA.toUpperCase(), GRUPOAREAMEDICA_AGENTS);
        ROLE_AGENTS = Collections.unmodifiableMap(roleAgents);
    }

    /**
     * Method that returns the identification fields in this table.
     * - If className is 'Dominio', it returns the identification keys
     * - If className is a facet of the inheritance net of 'Dominio', it returns the foreign keys to the table of the facet className
     * - Otherwise it returns an empty array
     * @param className Facet whose keys are to be returned
     * @return Keys in the table for facet className
     */
    public static final List<String> getIdFields(String className) {
        List<String> returnList = new ArrayList<>();
        if (className == null || className.isEmpty()){
            returnList.add(ATTR_FIELD_DOMINIONUMERO);
        }
        // Facet 'Dominio' (This facet)
        if (DominioConstants.CLASS_NAME.equalsIgnoreCase(className)) {
            returnList.add(ATTR_FIELD_DOMINIONUMERO);
        }
        return returnList;
    }
}
