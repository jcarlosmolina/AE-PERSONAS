CREATE TABLE TM_ValorPregunta(Identificador NUMBER(16) NOT NULL, Numero NUMBER(10) NOT NULL);
CREATE TABLE TM_DominioPeriodicidad(Numero NUMBER(16) NOT NULL, Codigo NUMBER(10) NOT NULL);
CREATE TABLE TM_DominioRol(Numero NUMBER(16) NOT NULL, Identificador NUMBER(16) NOT NULL);
CREATE TABLE TM_DominioFormaPago(Numero NUMBER(16) NOT NULL, Codigo NUMBER(10) NOT NULL);
CREATE TABLE TM_DominiosPlantillas(Numero NUMBER(16) NOT NULL, IdPlantilla NUMBER(16) NOT NULL);
CREATE TABLE TM_DominioNovedad(Numero NUMBER(16) NOT NULL, id_Novedad NUMBER(16) NOT NULL);
CREATE TABLE TM_IncompatibilidadesDominio(Numero NUMBER(16) NOT NULL, DominiosIncompatibles_Numero NUMBER(16) NOT NULL);
CREATE TABLE TM_DirSucursalCTipoSucursalC(Codigo NUMBER(16) NOT NULL, TiposSucursalC_Codigo NUMBER(10) NOT NULL);
CREATE TABLE TM_AfiliacionesPlanes(Id NUMBER(16) NOT NULL, Plan NUMBER(10) NOT NULL);
CREATE TABLE TM_AgentexProductoDominio(Id NUMBER(16) NOT NULL, AgentexProducto_Id NUMBER(16) NOT NULL, Numero NUMBER(16) NOT NULL);
CREATE TABLE TM_ReportesProcAlmFuncionario(id_Reporte NUMBER(16) NOT NULL, Id NUMBER(16) NOT NULL);
CREATE TABLE TM_GrupoAsignacionFuncionario(Id NUMBER(16) NOT NULL, Funcionario_Id NUMBER(16) NOT NULL);
CREATE TABLE Funcionario(Id NUMBER(16) NOT NULL, Identificador NUMBER(16) NOT NULL, Codigo NUMBER(10) NOT NULL, PassWord VARCHAR2(128) NOT NULL, Manual NUMBER(1) NOT NULL, Usuario VARCHAR2(50) NOT NULL, PrimerNombre VARCHAR2(50) NOT NULL, SegundoNombre VARCHAR2(50) NULL, PrimerApellido VARCHAR2(50) NULL, SegundoApellido VARCHAR2(50) NULL, UsuarioLDAP VARCHAR2(50) NULL, Email VARCHAR2(100) NULL, CodJefe VARCHAR2(50) NULL, Disponible NUMBER(1) NOT NULL, NumSolNoTerminadas NUMBER(10) NOT NULL, IdSesion VARCHAR2(50) NULL);
CREATE SEQUENCE Funcionario_Sequence;
CREATE OR REPLACE TRIGGER Funcionario_Trg
BEFORE INSERT ON Funcionario
FOR EACH ROW
BEGIN
    SELECT Funcionario_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE Admin(Id NUMBER(16) NOT NULL, PassWord VARCHAR2(128) NOT NULL);
CREATE TABLE SuperAdmin(Id NUMBER(16) NOT NULL, PassWord VARCHAR2(128) NOT NULL);
CREATE TABLE Asesor(Id NUMBER(16) NOT NULL, Codigo NUMBER(10) NULL, PassWord VARCHAR2(128) NOT NULL, ModDBasicosPersona NUMBER(1) NOT NULL, modificaDirector NUMBER(1) NOT NULL, esDirector NUMBER(1) NOT NULL, NumIdentificacion VARCHAR2(60) NULL, EsIntegral NUMBER(1) NOT NULL, VerDBasicosPersona NUMBER(1) NOT NULL, VerDocIdentificacionPersona NUMBER(1) NOT NULL, VerContratoNovedad NUMBER(1) NOT NULL, CanalComercial VARCHAR2(50) NULL, Cargo VARCHAR2(50) NULL, Estado VARCHAR2(50) NULL, AccesoValidadorUsuarios NUMBER(1) NOT NULL);
CREATE TABLE AreaMedica(Id NUMBER(16) NOT NULL, PassWord VARCHAR2(128) NOT NULL);
CREATE TABLE Afiliaciones(Id NUMBER(16) NOT NULL, PassWord VARCHAR2(128) NOT NULL);
CREATE TABLE RespRegional(Id NUMBER(16) NOT NULL, Codigo NUMBER(10) NULL, PassWord VARCHAR2(128) NOT NULL);
CREATE TABLE Gestor(Id NUMBER(16) NOT NULL, PassWord VARCHAR2(128) NOT NULL);
CREATE TABLE MesaDeApoyo(Id NUMBER(16) NOT NULL, PassWord VARCHAR2(128) NOT NULL);
CREATE TABLE ParamConfig(Codigo VARCHAR2(50) NOT NULL, Descripcion VARCHAR2(255) NOT NULL, Valor VARCHAR2(999) NOT NULL, EsNumerico NUMBER(1) NOT NULL);
CREATE TABLE LogParam(Codigo NUMBER(16) NOT NULL, ParamConfig_Codigo VARCHAR2(50) NOT NULL, Fecha DATE NOT NULL, Usuario VARCHAR2(50) NOT NULL, NombreUsuario VARCHAR2(255) NOT NULL, ValorAnterior VARCHAR2(999) NOT NULL, NuevoValor VARCHAR2(999) NOT NULL);
CREATE SEQUENCE LogParam_Sequence;
CREATE OR REPLACE TRIGGER LogParam_Trg
BEFORE INSERT ON LogParam
FOR EACH ROW
BEGIN
    SELECT LogParam_Sequence.NEXTVAL
    INTO :new.Codigo
    FROM dual;
END;
CREATE TABLE FrecuenciaAct(Codigo NUMBER(16) NOT NULL, Parametrica NUMBER(10) NOT NULL, Frecuencia NUMBER(10) NOT NULL, FechaUltimaSinc DATE NULL, ResultadoSinc VARCHAR2(255) NULL, Usuario VARCHAR2(50) NULL, NombreUsuario VARCHAR2(255) NULL);
CREATE SEQUENCE FrecuenciaAct_Sequence;
CREATE OR REPLACE TRIGGER FrecuenciaAct_Trg
BEFORE INSERT ON FrecuenciaAct
FOR EACH ROW
BEGIN
    SELECT FrecuenciaAct_Sequence.NEXTVAL
    INTO :new.Codigo
    FROM dual;
END;
CREATE TABLE CuestionarioMed(Numero NUMBER(16) NOT NULL, Nombre VARCHAR2(100) NOT NULL);
CREATE SEQUENCE CuestionarioMed_Sequence;
CREATE OR REPLACE TRIGGER CuestionarioMed_Trg
BEFORE INSERT ON CuestionarioMed
FOR EACH ROW
BEGIN
    SELECT CuestionarioMed_Sequence.NEXTVAL
    INTO :new.Numero
    FROM dual;
END;
CREATE TABLE Seccion(Identificador NUMBER(16) NOT NULL, Numero NUMBER(16) NOT NULL, Nombre VARCHAR2(150) NOT NULL, NumOrden NUMBER(10) NOT NULL);
CREATE SEQUENCE Seccion_Sequence;
CREATE OR REPLACE TRIGGER Seccion_Trg
BEFORE INSERT ON Seccion
FOR EACH ROW
BEGIN
    SELECT Seccion_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE Pregunta(Numero NUMBER(10) NOT NULL, Identificador NUMBER(16) NOT NULL, NumOrden NUMBER(10) NOT NULL, Descripcion VARCHAR2(255) NOT NULL, ValorSNObliga NUMBER(1) NOT NULL, ObsOblig NUMBER(1) NOT NULL, EsNumero NUMBER(1) NOT NULL, ValorMax NUMBER(19,6) NULL, ValorMin NUMBER(19,6) NULL, SoloHombres NUMBER(1) NOT NULL, SoloMujeres NUMBER(1) NOT NULL, RespMultiple NUMBER(1) NOT NULL, SeEnviaAlCORE NUMBER(1) NOT NULL, CondicionEdad NUMBER(10) NOT NULL, CondicionEdadAnyos NUMBER(10) NULL);
CREATE TABLE Valor(Identificador NUMBER(16) NOT NULL, ValorPosible VARCHAR2(150) NOT NULL);
CREATE SEQUENCE Valor_Sequence;
CREATE OR REPLACE TRIGGER Valor_Trg
BEFORE INSERT ON Valor
FOR EACH ROW
BEGIN
    SELECT Valor_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE Productos(Producto NUMBER(10) NOT NULL, Descripcion VARCHAR2(100) NOT NULL, CodAnexoMat NUMBER(10) NULL, CodAnexoNeo NUMBER(10) NULL, NIT VARCHAR2(60) NULL, CodigoLegal VARCHAR2(10) NOT NULL, FechaDocSolicitud DATE NULL);
CREATE TABLE Planes(Plan NUMBER(10) NOT NULL, Producto NUMBER(10) NOT NULL, Nombre VARCHAR2(150) NOT NULL, EsBancoRep NUMBER(1) NOT NULL, CodigoLegal VARCHAR2(10) NOT NULL, AceptaPreexistencias NUMBER(1) NOT NULL, EsVoluntario NUMBER(1) NOT NULL, InicioContDiaUno NUMBER(1) NOT NULL);
CREATE TABLE Parentesco(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(100) NOT NULL, EsTitular NUMBER(1) NOT NULL, EsConyuge NUMBER(1) NOT NULL, EsPadre NUMBER(1) NOT NULL, EsHijo NUMBER(1) NOT NULL, NombreCorto VARCHAR2(10) NOT NULL);
CREATE TABLE Periodicidad(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL, EsMensual NUMBER(1) NOT NULL);
CREATE TABLE Rol(Identificador NUMBER(16) NOT NULL, Nombre VARCHAR2(50) NOT NULL);
CREATE SEQUENCE Rol_Sequence;
CREATE OR REPLACE TRIGGER Rol_Trg
BEFORE INSERT ON Rol
FOR EACH ROW
BEGIN
    SELECT Rol_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE Dominio(Numero NUMBER(16) NOT NULL, Plan NUMBER(10) NOT NULL, Producto NUMBER(10) NOT NULL, Id NUMBER(16) NULL, GrupoAreaMedica_Id NUMBER(16) NULL, ReqCuesMed NUMBER(1) NOT NULL, NoCuesMedTras NUMBER(1) NOT NULL, NuevaAfiliacion NUMBER(1) NOT NULL, Inclusion NUMBER(1) NOT NULL, AcepCuesMat NUMBER(1) NOT NULL, AcepCuesNeo NUMBER(1) NOT NULL, AcepBBGestante NUMBER(1) NOT NULL, MostrarPreexAnexos NUMBER(1) NOT NULL, MostrarPreexContrato NUMBER(1) NOT NULL, IgnorarPreexistencias NUMBER(1) NOT NULL, RespClauNombre VARCHAR2(100) NULL, RespClauCelula VARCHAR2(15) NULL, RespClauExpCelula VARCHAR2(50) NULL, RespClauCargo VARCHAR2(50) NULL, RespClauFirma BLOB NULL, DiaIniVigencia NUMBER(10) NULL, DiaFinVigencia NUMBER(10) NULL, DiasCaducidad NUMBER(10) NOT NULL, ProrrateoUsuExistente NUMBER(1) NOT NULL, InclusionModGrupoAsoc NUMBER(1) NOT NULL, PermiteRechazadosAfi NUMBER(1) NOT NULL, AcepPolizaInter NUMBER(1) NOT NULL, NovExcepcionReqDoc NUMBER(1) NOT NULL, SolNovColorOscuro VARCHAR2(10) NULL, SolNovColorClaro VARCHAR2(10) NULL, SolNovLogo VARCHAR2(50) NULL, TramiteEnLinea NUMBER(1) NOT NULL, VigenciaRadicacion NUMBER(1) NOT NULL);
CREATE SEQUENCE Dominio_Sequence;
CREATE OR REPLACE TRIGGER Dominio_Trg
BEFORE INSERT ON Dominio
FOR EACH ROW
BEGIN
    SELECT Dominio_Sequence.NEXTVAL
    INTO :new.Numero
    FROM dual;
END;
CREATE TABLE PlantillaEmail(IdPlantilla NUMBER(16) NOT NULL, Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(255) NOT NULL, Asunto VARCHAR2(255) NULL, TextoMensaje CLOB NOT NULL, EmailConf VARCHAR2(100) NULL);
CREATE SEQUENCE PlantillaEmail_Sequence;
CREATE OR REPLACE TRIGGER PlantillaEmail_Trg
BEFORE INSERT ON PlantillaEmail
FOR EACH ROW
BEGIN
    SELECT PlantillaEmail_Sequence.NEXTVAL
    INTO :new.IdPlantilla
    FROM dual;
END;
CREATE TABLE EstadoContrato(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(100) NOT NULL);
CREATE TABLE EstadoBeneficiario(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL, EsActivo NUMBER(1) NOT NULL, Confirmado NUMBER(1) NOT NULL, EsError NUMBER(1) NOT NULL);
CREATE TABLE EstadoBeneficiarioAE(Codigo NUMBER(16) NOT NULL, EstadoBeneficiarioCORE_Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL);
CREATE SEQUENCE EstadoBeneficiarioAE_Sequence;
CREATE OR REPLACE TRIGGER EstadoBeneficiarioAE_Trg
BEFORE INSERT ON EstadoBeneficiarioAE
FOR EACH ROW
BEGIN
    SELECT EstadoBeneficiarioAE_Sequence.NEXTVAL
    INTO :new.Codigo
    FROM dual;
END;
CREATE TABLE Tarifa(Id NUMBER(16) NOT NULL, Producto NUMBER(10) NOT NULL, Plan NUMBER(10) NOT NULL, Codigo VARCHAR2(12) NOT NULL, TipoContrato NUMBER(10) NOT NULL);
CREATE SEQUENCE Tarifa_Sequence;
CREATE OR REPLACE TRIGGER Tarifa_Trg
BEFORE INSERT ON Tarifa
FOR EACH ROW
BEGIN
    SELECT Tarifa_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE Regional(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL);
CREATE TABLE Sucursal(Codigo NUMBER(10) NOT NULL, Regional_Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(200) NOT NULL);
CREATE TABLE GrupoAsociado(Codigo NUMBER(10) NOT NULL, Producto NUMBER(10) NOT NULL, Plan NUMBER(10) NOT NULL, CodigoLegal VARCHAR2(50) NOT NULL, CodTarifaCORE VARCHAR2(50) NULL, Descripcion VARCHAR2(150) NOT NULL, FIniVigencia DATE NOT NULL, FFinVigencia DATE NOT NULL, Estado NUMBER(10) NOT NULL, DisminucionCarencia NUMBER(10) NOT NULL);
CREATE TABLE EstadoCivil(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(100) NOT NULL, NombreCorto VARCHAR2(50) NOT NULL);
CREATE TABLE Departamento(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL, CodigoLegal VARCHAR2(5) NOT NULL);
CREATE TABLE TipoIVA(Codigo NUMBER(16) NOT NULL, Producto NUMBER(10) NOT NULL, Plan NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL, Porcentaje NUMBER(19,6) NOT NULL, FechaInicio DATE NOT NULL, FechaFin DATE NOT NULL);
CREATE SEQUENCE TipoIVA_Sequence;
CREATE OR REPLACE TRIGGER TipoIVA_Trg
BEFORE INSERT ON TipoIVA
FOR EACH ROW
BEGIN
    SELECT TipoIVA_Sequence.NEXTVAL
    INTO :new.Codigo
    FROM dual;
END;
CREATE TABLE Persona(Identificador NUMBER(16) NOT NULL, TipoIdentificacion_Codigo NUMBER(10) NOT NULL, DepartamentoNacimiento_Codigo NUMBER(10) NULL, MunicipioNacimiento_Codigo NUMBER(10) NULL, EstadoCivil_Codigo NUMBER(10) NULL, EstadoPersona_Codigo NUMBER(10) NULL, Codigo NUMBER(10) NULL, NumIdentificacion VARCHAR2(60) NOT NULL, TipoPersona VARCHAR2(1) NOT NULL, PrimerNombre VARCHAR2(50) NULL, SegundoNombre VARCHAR2(50) NULL, PrimerApellido VARCHAR2(50) NULL, SegundoApellido VARCHAR2(50) NULL, RazonSocial VARCHAR2(254) NULL, FechaNacimiento DATE NULL, Genero VARCHAR2(1) NULL, IndicadorExtranjero NUMBER(1) NULL, TelefonoFijo VARCHAR2(15) NULL, TelefonoCelular VARCHAR2(15) NULL, CorreoElectronico VARCHAR2(100) NULL, TieneEPSSanitas NUMBER(1) NULL, RechazadoAfiliacion VARCHAR2(50) NULL, DatosBasicosMod NUMBER(1) NOT NULL);
CREATE SEQUENCE Persona_Sequence;
CREATE OR REPLACE TRIGGER Persona_Trg
BEFORE INSERT ON Persona
FOR EACH ROW
BEGIN
    SELECT Persona_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE Companyia(Codigo NUMBER(10) NOT NULL, Nombre VARCHAR2(150) NOT NULL, EsDeMP NUMBER(1) NOT NULL);
CREATE TABLE Municipio(Codigo NUMBER(10) NOT NULL, Departamento_Codigo NUMBER(10) NULL, Descripcion VARCHAR2(150) NOT NULL, CodigoLegal VARCHAR2(10) NOT NULL, EsValidoEPS NUMBER(1) NOT NULL, AplicaIVA NUMBER(1) NOT NULL);
CREATE TABLE TipoDireccion(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL, EsResidencia NUMBER(1) NOT NULL, EsCorrespondencia NUMBER(1) NOT NULL);
CREATE TABLE EstadoPersona(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL, UnBeneficiarioDistino NUMBER(1) NOT NULL, ProhibidoBeneficiarios NUMBER(1) NOT NULL, ProhibidoContratante NUMBER(1) NOT NULL, ProhibidoTitular NUMBER(1) NOT NULL);
CREATE TABLE FormaPago(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL, AbrirURL NUMBER(1) NOT NULL, EsVisible NUMBER(1) NOT NULL);
CREATE TABLE TipoIdentificacion(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL, NombreCorto VARCHAR2(20) NOT NULL, ValidoContratante NUMBER(1) NOT NULL, ValidoTitular NUMBER(1) NOT NULL, Diplomatico NUMBER(1) NOT NULL, NIT NUMBER(1) NOT NULL, HijoDe NUMBER(1) NOT NULL, RequiereEPS NUMBER(1) NOT NULL, MenorSinIdentificar NUMBER(1) NOT NULL, EsPasaporte NUMBER(1) NOT NULL, VisibleValidadorUsu NUMBER(1) NOT NULL);
CREATE TABLE Eps(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL, EpsSanitas NUMBER(1) NOT NULL);
CREATE TABLE EntidadFinancieraC(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL);
CREATE TABLE TipoEntidadC(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL);
CREATE TABLE TipoInstitucionC(Codigo NUMBER(10) NOT NULL, Nombre VARCHAR2(150) NOT NULL);
CREATE TABLE Ae_solicitudes(id_solicitud NUMBER(16) NOT NULL, Producto NUMBER(10) NOT NULL, Plan NUMBER(10) NULL, Codigo NUMBER(10) NULL, Numero_solicitud VARCHAR2(50) NULL, Sw_estado VARCHAR2(2) NULL, Fecha_asignacion DATE NOT NULL, Cdmotanu VARCHAR2(250) NULL, Cdmotdev VARCHAR2(250) NULL, Fesolici DATE NULL, Login VARCHAR2(50) NULL, Observacion VARCHAR2(500) NULL, Tipo_solicitud VARCHAR2(1) NULL);
CREATE SEQUENCE Ae_solicitudes_Sequence;
CREATE OR REPLACE TRIGGER Ae_solicitudes_Trg
BEFORE INSERT ON Ae_solicitudes
FOR EACH ROW
BEGIN
    SELECT Ae_solicitudes_Sequence.NEXTVAL
    INTO :new.id_solicitud
    FROM dual;
END;
CREATE TABLE Solicitud(id_solicitud NUMBER(16) NOT NULL, Identificador NUMBER(16) NULL, TitularPersona_Identificador NUMBER(16) NULL, Codigo NUMBER(10) NULL, Id NUMBER(16) NOT NULL, FormaPago_Codigo NUMBER(10) NULL, Periodicidad_Codigo NUMBER(10) NULL, ContratoC_ID NUMBER(16) NULL, UsrAreaMedica_Id NUMBER(16) NULL, TipoFactura_Codigo VARCHAR2(20) NULL, UsrAfiliacion_Id NUMBER(16) NULL, NumRadicado NUMBER(10) NOT NULL, Tramite NUMBER(10) NOT NULL, NumContrato VARCHAR2(50) NULL, FInicioContrato DATE NULL, EsTraslado NUMBER(1) NOT NULL, tipoContrato NUMBER(10) NOT NULL, codigoSucursalRad VARCHAR2(200) NULL, contratoConFirma NUMBER(1) NOT NULL, observacions VARCHAR2(700) NULL, exentoIVA VARCHAR2(50) NULL, valorCuota NUMBER(19,6) NULL, valorDtoComercialSim NUMBER(19,6) NULL, ValorCuotaInscrip NUMBER(19,6) NULL, ValorDtoFinanciero NUMBER(19,6) NULL, ValorDtoComercial NUMBER(19,6) NULL, datosPagoOK NUMBER(1) NOT NULL, valorCuotaPeriodoC NUMBER(19,6) NULL, descuentoComercialC NUMBER(19,6) NULL, IVAC NUMBER(19,6) NULL, descuentoFinancieroC NUMBER(19,6) NULL, TieneDifLiquidacion NUMBER(1) NOT NULL, UsuariosValidados NUMBER(1) NOT NULL, NumContratoInclusion VARCHAR2(50) NULL, NumFamilia VARCHAR2(5) NULL, EmailURLPagoEnviado VARCHAR2(999) NULL, EmailDocuEnviado VARCHAR2(999) NULL, DocsEnviados NUMBER(1) NULL, codDirector VARCHAR2(50) NOT NULL, valorCuotaBrutaC NUMBER(19,6) NULL, CodTarifa VARCHAR2(50) NULL, Completada NUMBER(1) NOT NULL, Estado NUMBER(10) NOT NULL, FIniVigContInc DATE NULL, PorcentajeProrrateo NUMBER(19,6) NULL, GrupoDelCORE NUMBER(10) NULL, TipoFacturaCORE VARCHAR2(20) NULL, ResultSMSInfoPago VARCHAR2(999) NULL, FechaCompletada DATE NULL, FechaUltimoDoc DATE NULL, Prioridad NUMBER(10) NOT NULL, FechaTerminada DATE NULL, FechaFUG DATE NULL, FechaFA DATE NULL, FechaFAAM DATE NULL, SemaforoGrabAse NUMBER(19,6) NULL, SemaforoAreaMed NUMBER(19,6) NULL, EstadoDoc NUMBER(10) NOT NULL, EnvioCarnetFisico NUMBER(1) NOT NULL);
CREATE TABLE PersonaC(ID NUMBER(16) NOT NULL, TipoInstitucionC_Codigo NUMBER(10) NULL, TipoEntidadC_Codigo NUMBER(10) NULL, EstadoCivilC_Codigo NUMBER(10) NULL, EstadoPersonaC_Codigo NUMBER(10) NULL, TipoIdentificacionC_Codigo NUMBER(10) NOT NULL, MunicipioCNac_Codigo NUMBER(10) NULL, DepartamentoCNac_Codigo NUMBER(10) NULL, ContratosC_ID NUMBER(16) NULL, FamiliasC_ID NUMBER(16) NULL, FamiliasC_ID_1 NUMBER(16) NULL, BeneficiariosC_ID NUMBER(16) NULL, BeneficiariosC_ID_1 NUMBER(16) NULL, Codigo NUMBER(10) NULL, NumIdentificacion VARCHAR2(60) NOT NULL, Mail VARCHAR2(100) NULL, PrimerNombre VARCHAR2(50) NULL, SegundoNombre VARCHAR2(50) NULL, PrimerApellido VARCHAR2(50) NULL, SegundoApellido VARCHAR2(50) NULL, FechaNacimiento DATE NULL, Genero VARCHAR2(1) NULL, IndicadorExtranjero NUMBER(1) NULL, RazonSocial VARCHAR2(254) NULL, TieneEPSSanitas NUMBER(1) NULL, RechazadoAfiliacion VARCHAR2(50) NULL, NombreCompleto VARCHAR2(100) NULL, UltimaActualizacion DATE NULL);
CREATE SEQUENCE PersonaC_Sequence;
CREATE OR REPLACE TRIGGER PersonaC_Trg
BEFORE INSERT ON PersonaC
FOR EACH ROW
BEGIN
    SELECT PersonaC_Sequence.NEXTVAL
    INTO :new.ID
    FROM dual;
END;
CREATE TABLE DireccionC(Codigo NUMBER(16) NOT NULL, ID NUMBER(16) NULL, ContratoC_ID NUMBER(16) NULL, TipoDireccionC_Codigo NUMBER(10) NULL, DepartamentoC_Codigo NUMBER(10) NULL, MunicipioC_Codigo NUMBER(10) NULL, PaisC_Codigo VARCHAR2(10) NULL, DireccionCompleta VARCHAR2(250) NULL, Localidad VARCHAR2(50) NULL);
CREATE SEQUENCE DireccionC_Sequence;
CREATE OR REPLACE TRIGGER DireccionC_Trg
BEFORE INSERT ON DireccionC
FOR EACH ROW
BEGIN
    SELECT DireccionC_Sequence.NEXTVAL
    INTO :new.Codigo
    FROM dual;
END;
CREATE TABLE TelefonoC(ID NUMBER(16) NOT NULL, DirSucursalC_Codigo NUMBER(16) NULL, DireccionC_Codigo NUMBER(16) NULL, Codigo NUMBER(10) NOT NULL, Telefono VARCHAR2(15) NULL, IndicativoPais VARCHAR2(10) NULL, CodigoArea VARCHAR2(10) NULL, Ext VARCHAR2(10) NULL);
CREATE SEQUENCE TelefonoC_Sequence;
CREATE OR REPLACE TRIGGER TelefonoC_Trg
BEFORE INSERT ON TelefonoC
FOR EACH ROW
BEGIN
    SELECT TelefonoC_Sequence.NEXTVAL
    INTO :new.ID
    FROM dual;
END;
CREATE TABLE ProteccionDatosC(ID NUMBER(16) NOT NULL, Producto NUMBER(10) NOT NULL, Codigo NUMBER(10) NOT NULL, CodRol VARCHAR2(2) NULL, InformacionSaludSMS NUMBER(1) NULL, InformacionSaludEmail NUMBER(1) NULL, IinformacionSaludCorreo NUMBER(1) NULL, InformacionPublicidadSMS NUMBER(1) NULL, InformacionPublicidadEmail NUMBER(1) NULL, InformacionPublicidadCorreo NUMBER(1) NULL, InformacionTerceros NUMBER(1) NULL, Rol VARCHAR2(50) NULL);
CREATE TABLE Direccion(Identificador NUMBER(16) NOT NULL, Persona_Identificador NUMBER(16) NULL, TipoDireccion_Codigo NUMBER(10) NULL, Municipio_Codigo NUMBER(10) NULL, Departamento_Codigo NUMBER(10) NULL, Pais_Codigo VARCHAR2(10) NULL, id_solicitud NUMBER(16) NULL, Titular_id_solicitud NUMBER(16) NULL, Codigo NUMBER(10) NULL, DireccionCompleta VARCHAR2(250) NULL, Rural NUMBER(1) NULL);
CREATE SEQUENCE Direccion_Sequence;
CREATE OR REPLACE TRIGGER Direccion_Trg
BEFORE INSERT ON Direccion
FOR EACH ROW
BEGIN
    SELECT Direccion_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE Pais(Codigo VARCHAR2(10) NOT NULL, Descripcion VARCHAR2(50) NULL);
CREATE TABLE ProteccionDatos(Identificador NUMBER(16) NOT NULL, Producto NUMBER(10) NULL, id_solicitud NUMBER(16) NULL, Rol VARCHAR2(2) NULL, SaludSMS NUMBER(1) NULL, SaludEmail NUMBER(1) NULL, SaludCorreo NUMBER(1) NULL, PublicidadSMS NUMBER(1) NULL, PublicidadEmail NUMBER(1) NULL, PublicidadCorreo NUMBER(1) NULL, InfoTerceros NUMBER(1) NULL);
CREATE SEQUENCE ProteccionDatos_Sequence;
CREATE OR REPLACE TRIGGER ProteccionDatos_Trg
BEFORE INSERT ON ProteccionDatos
FOR EACH ROW
BEGIN
    SELECT ProteccionDatos_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE Usuario(id_solicitud NUMBER(16) NOT NULL, Identificador NUMBER(16) NOT NULL, UsuarioPersona_Identificador NUMBER(16) NOT NULL, Codigo NUMBER(10) NULL, Parentesco_Codigo NUMBER(10) NULL, Companyia_Codigo NUMBER(10) NULL, TipoIdentificacion_Codigo NUMBER(10) NOT NULL, EstadoBeneficiario_Codigo NUMBER(10) NULL, BebeGestante NUMBER(1) NOT NULL, NumUsuario NUMBER(10) NULL, NumIdentificacion VARCHAR2(60) NOT NULL, CodigoTipoUsuario NUMBER(10) NOT NULL, PrimerNombre VARCHAR2(50) NULL, SegundoNombre VARCHAR2(50) NULL, PrimerApellido VARCHAR2(50) NULL, SegundoApellido VARCHAR2(50) NULL, attrUsuarioDiligenciados NUMBER(1) NOT NULL, codigoBancoRep VARCHAR2(30) NULL, UsuarioReplicado NUMBER(1) NOT NULL, FechaAntiguedadBeneficiario DATE NULL, RequierExamenMedico NUMBER(1) NULL, EstadoMedico NUMBER(10) NULL, ValorCuotaInscripcion NUMBER(19,6) NULL, TienePreexistencias NUMBER(1) NULL, FechaInicioVigencia DATE NULL, FechaFinVigencia DATE NULL, tieneDocIdentificacion NUMBER(1) NOT NULL, tieneDocsSolicitud NUMBER(1) NOT NULL, PolizaInternacional NUMBER(1) NOT NULL, IMC NUMBER(19,6) NULL);
CREATE TABLE CuestionarioP(Numero NUMBER(16) NOT NULL, id_solicitud NUMBER(16) NOT NULL, Identificador NUMBER(16) NOT NULL, Nombre VARCHAR2(100) NOT NULL, YaDiligenciado NUMBER(1) NOT NULL);
CREATE SEQUENCE CuestionarioP_Sequence;
CREATE OR REPLACE TRIGGER CuestionarioP_Trg
BEFORE INSERT ON CuestionarioP
FOR EACH ROW
BEGIN
    SELECT CuestionarioP_Sequence.NEXTVAL
    INTO :new.Numero
    FROM dual;
END;
CREATE TABLE SeccionP(Identificador NUMBER(16) NOT NULL, Numero NUMBER(16) NOT NULL, Nombre VARCHAR2(150) NOT NULL, NumOrden NUMBER(10) NOT NULL);
CREATE SEQUENCE SeccionP_Sequence;
CREATE OR REPLACE TRIGGER SeccionP_Trg
BEFORE INSERT ON SeccionP
FOR EACH ROW
BEGIN
    SELECT SeccionP_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE PreguntaP(Identificador NUMBER(16) NOT NULL, Seccion_Identificador NUMBER(16) NOT NULL, Pregunta_Numero NUMBER(10) NULL, Numero NUMBER(10) NOT NULL, NumOrden NUMBER(10) NOT NULL, Descripcion VARCHAR2(255) NOT NULL, SeEnviaACORE NUMBER(1) NOT NULL, RespuestaSiNo NUMBER(1) NOT NULL, RespuestaObs VARCHAR2(999) NULL, VieneDeCORE NUMBER(1) NOT NULL, ValoresRespuestas VARCHAR2(999) NULL);
CREATE SEQUENCE PreguntaP_Sequence;
CREATE OR REPLACE TRIGGER PreguntaP_Trg
BEFORE INSERT ON PreguntaP
FOR EACH ROW
BEGIN
    SELECT PreguntaP_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE Contratante(id_solicitud NUMBER(16) NOT NULL, TipoIdentificacion_Codigo NUMBER(10) NOT NULL, DepartamentoNac_Codigo NUMBER(10) NULL, MunicipioNac_Codigo NUMBER(10) NULL, DepartamentoRes_Codigo NUMBER(10) NULL, MunicipioRes_Codigo NUMBER(10) NULL, Codigo NUMBER(10) NULL, NumIdentificacion VARCHAR2(60) NOT NULL, TipoPersona VARCHAR2(1) NOT NULL, PrimerNombre VARCHAR2(50) NULL, SegundoNombre VARCHAR2(50) NULL, PrimerApellido VARCHAR2(50) NULL, SegundoApellido VARCHAR2(50) NULL, RazonSocial VARCHAR2(254) NULL, FechaNacimiento DATE NULL, Genero VARCHAR2(1) NULL, IndicadorExtranjero NUMBER(1) NULL, TelefonoFijo VARCHAR2(15) NULL, TelefonoCelular VARCHAR2(15) NULL, CorreoElectronico VARCHAR2(100) NULL, TitularConBeneficios NUMBER(1) NOT NULL, Diplomatico NUMBER(1) NOT NULL, DireccionRes VARCHAR2(250) NULL, TelefonoFijoRes VARCHAR2(15) NULL, TelefonoCelularRes VARCHAR2(15) NULL, RuralDirRes NUMBER(1) NULL, TitularConBeneficiosCORE NUMBER(1) NOT NULL, DireccionesModificadas NUMBER(1) NOT NULL);
CREATE TABLE AnexoMat(Identificador NUMBER(16) NOT NULL, id_solicitud NUMBER(16) NOT NULL, Usuario_Identificador NUMBER(16) NOT NULL, Codigo NUMBER(10) NOT NULL, InstitucionMaternal_Codigo VARCHAR2(20) NOT NULL, FechaUltRegla DATE NOT NULL, NumCuotas NUMBER(10) NOT NULL);
CREATE SEQUENCE AnexoMat_Sequence;
CREATE OR REPLACE TRIGGER AnexoMat_Trg
BEFORE INSERT ON AnexoMat
FOR EACH ROW
BEGIN
    SELECT AnexoMat_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE AnexoNeo(Identificador NUMBER(16) NOT NULL, id_solicitud NUMBER(16) NOT NULL, Usuario_Identificador NUMBER(16) NOT NULL, Codigo NUMBER(10) NOT NULL, InstitucionNeonatal_Codigo VARCHAR2(20) NOT NULL, FechaUltRegla DATE NOT NULL, NumHijos NUMBER(10) NOT NULL, NumCuotas NUMBER(10) NOT NULL);
CREATE SEQUENCE AnexoNeo_Sequence;
CREATE OR REPLACE TRIGGER AnexoNeo_Trg
BEFORE INSERT ON AnexoNeo
FOR EACH ROW
BEGIN
    SELECT AnexoNeo_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE Firma(Identificador NUMBER(16) NOT NULL, id_solicitud NUMBER(16) NULL, SolicitudSegunda_id_solicitud NUMBER(16) NULL, Id NUMBER(16) NULL, SolicitudContratante_id_solici NUMBER(16) NULL, ImagenFirma BLOB NULL, Latitud VARCHAR2(25) NULL, Longitud VARCHAR2(25) NULL);
CREATE SEQUENCE Firma_Sequence;
CREATE OR REPLACE TRIGGER Firma_Trg
BEFORE INSERT ON Firma
FOR EACH ROW
BEGIN
    SELECT Firma_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE ContratoC(ID NUMBER(16) NOT NULL, Codigo NUMBER(10) NULL, FormaPagoC_Codigo NUMBER(10) NULL, EstadoContratoC_Codigo NUMBER(10) NULL, Producto NUMBER(10) NOT NULL, Plan NUMBER(10) NOT NULL, TarifaC_Id NUMBER(16) NULL, GrupoAsociadoC_Codigo NUMBER(10) NULL, MunicipioC_Codigo NUMBER(10) NULL, SucursalC_Codigo NUMBER(10) NULL, AsesorC_Id NUMBER(16) NULL, NumContrato VARCHAR2(50) NULL, NumSolicitud VARCHAR2(50) NULL, FechaSolicitud DATE NULL, TipoContrato NUMBER(10) NULL, FechaIniVigencia DATE NULL, FechaFinVigencia DATE NULL, Direccion VARCHAR2(259) NULL, correoContratante VARCHAR2(100) NULL, numTelContratante VARCHAR2(15) NULL, numCelContratante VARCHAR2(15) NULL, exentoIVA VARCHAR2(50) NULL, ContratoConFirma NUMBER(1) NULL, valorCuotaPeriodo NUMBER(19,6) NOT NULL, descuentoComercial NUMBER(19,6) NOT NULL, IVA NUMBER(19,6) NOT NULL, descuentoFinanciero NUMBER(19,6) NOT NULL, contratoNotificado NUMBER(1) NOT NULL, UltimaActualizacion DATE NULL, CodTarifa VARCHAR2(50) NULL);
CREATE SEQUENCE ContratoC_Sequence;
CREATE OR REPLACE TRIGGER ContratoC_Trg
BEFORE INSERT ON ContratoC
FOR EACH ROW
BEGIN
    SELECT ContratoC_Sequence.NEXTVAL
    INTO :new.ID
    FROM dual;
END;
CREATE TABLE ObservacionesC(Identificador NUMBER(16) NOT NULL, ID NUMBER(16) NOT NULL, CodTipoObservacion VARCHAR2(9) NOT NULL, TipoObservacion VARCHAR2(50) NOT NULL, Observacions VARCHAR2(100) NOT NULL);
CREATE SEQUENCE ObservacionesC_Sequence;
CREATE OR REPLACE TRIGGER ObservacionesC_Trg
BEFORE INSERT ON ObservacionesC
FOR EACH ROW
BEGIN
    SELECT ObservacionesC_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE BeneficiarioC(ContratoC_ID NUMBER(16) NOT NULL, ID NUMBER(16) NOT NULL, FamiliasC_ID NUMBER(16) NOT NULL, FamiliasC_ID_1 NUMBER(16) NOT NULL, Codigo NUMBER(10) NULL, CompanyiaMPC_Codigo NUMBER(10) NULL, ParentescoC_Codigo NUMBER(10) NOT NULL, EstadoBeneficiarioC_Codigo NUMBER(10) NULL, NumUsuario NUMBER(10) NULL, CodigoTipoUsuario VARCHAR2(50) NULL, IndicadorBBGestacion NUMBER(1) NULL, CodUsuarioBancoRep VARCHAR2(30) NULL, FechaAntiguedad DATE NULL, RequiereExamenMedico NUMBER(1) NULL, EstadoMedico NUMBER(10) NULL, FechaAntiguedadRealOSI DATE NULL, ValorCuotaInscripcion NUMBER(19,6) NULL, TienePreexistencias NUMBER(1) NULL, FechaInicioVigencia DATE NULL, FechaFinVigencia DATE NULL);
CREATE TABLE AnexoC(Identificador NUMBER(16) NOT NULL, ID NUMBER(16) NOT NULL, BeneficiarioC_ID NUMBER(16) NOT NULL, Codigo NUMBER(10) NULL, TipoIdentificacionC_Codigo NUMBER(10) NULL, CodigoPlanAnexo VARCHAR2(10) NULL, CodigoTarifa VARCHAR2(10) NULL, FechaInicioVigencia DATE NULL, FechaUltimaRegla DATE NULL, NumCuotasPago NUMBER(10) NULL, NumIdentificacion VARCHAR2(60) NULL, CodSucursal VARCHAR2(20) NULL);
CREATE SEQUENCE AnexoC_Sequence;
CREATE OR REPLACE TRIGGER AnexoC_Trg
BEFORE INSERT ON AnexoC
FOR EACH ROW
BEGIN
    SELECT AnexoC_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE PregCuesMedC(ID NUMBER(16) NOT NULL, CodPregunta NUMBER(10) NOT NULL, RptaPregunta NUMBER(1) NOT NULL, Observacions VARCHAR2(999) NULL);
CREATE TABLE DirSucursalC(Codigo NUMBER(16) NOT NULL, ID NUMBER(16) NOT NULL, MunicipioC_Codigo NUMBER(10) NULL, DepartamentoC_Codigo NUMBER(10) NULL, PaisC_Codigo VARCHAR2(10) NULL, RegionalC_Codigo NUMBER(10) NULL, CodLegalSucursal VARCHAR2(9) NULL, Nombre VARCHAR2(200) NULL, EsPrincipal NUMBER(1) NOT NULL, Activa NUMBER(1) NOT NULL, Direccion VARCHAR2(255) NOT NULL, Mail VARCHAR2(500) NULL);
CREATE SEQUENCE DirSucursalC_Sequence;
CREATE OR REPLACE TRIGGER DirSucursalC_Trg
BEFORE INSERT ON DirSucursalC
FOR EACH ROW
BEGIN
    SELECT DirSucursalC_Sequence.NEXTVAL
    INTO :new.Codigo
    FROM dual;
END;
CREATE TABLE FamiliaC(ContratoC_ID NUMBER(16) NOT NULL, ID NUMBER(16) NOT NULL, Codigo NUMBER(10) NULL, NumFamilia VARCHAR2(20) NULL, TitularConBeneficios NUMBER(1) NULL, EstadoTitularFamilia VARCHAR2(10) NULL, FechaFinVigencia DATE NULL, direccionCorrespondencia VARCHAR2(255) NULL);
CREATE TABLE UsuarioReg(id_solicitud NUMBER(16) NOT NULL, Identificador NUMBER(16) NOT NULL, Codigo NUMBER(10) NULL, Parentesco_Codigo NUMBER(10) NULL, TipoIdentificacion VARCHAR2(20) NOT NULL, NumIdentificacion VARCHAR2(60) NOT NULL, TipoYNumDoc VARCHAR2(80) NULL, PrimerNombre VARCHAR2(50) NOT NULL, SegundoNombre VARCHAR2(50) NULL, PrimerApellido VARCHAR2(50) NOT NULL, SegundoApellido VARCHAR2(50) NULL, NumUsuario NUMBER(10) NULL, FechaInicioVigencia DATE NULL, FechaFinVigencia DATE NULL, Genero VARCHAR2(1) NULL, FechaNacimiento DATE NULL);
CREATE TABLE Titular(id_solicitud NUMBER(16) NOT NULL, TipoIdentificacion_Codigo NUMBER(10) NOT NULL, DepartamentoNac_Codigo NUMBER(10) NULL, MunicipioNac_Codigo NUMBER(10) NULL, Codigo NUMBER(10) NULL, NumIdentificacion VARCHAR2(60) NOT NULL, TipoPersona VARCHAR2(1) NOT NULL, PrimerNombre VARCHAR2(50) NULL, SegundoNombre VARCHAR2(50) NULL, PrimerApellido VARCHAR2(50) NULL, SegundoApellido VARCHAR2(50) NULL, FechaNacimiento DATE NULL, Genero VARCHAR2(1) NULL, IndicadorExtranjero NUMBER(1) NULL, TelefonoFijo VARCHAR2(15) NULL, TelefonoCelular VARCHAR2(15) NULL, CorreoElectronico VARCHAR2(100) NULL, TitularConBeneficios NUMBER(1) NOT NULL, TitularRecuperadoInc NUMBER(1) NOT NULL, TelefonoFijoDC VARCHAR2(15) NULL, TelefonoCelularDC VARCHAR2(15) NULL, TitularConBeneficiosCORE NUMBER(1) NOT NULL, RazonSocial VARCHAR2(254) NULL, DireccionesModificadas NUMBER(1) NOT NULL);
CREATE TABLE PreexistenciaC(ID NUMBER(16) NOT NULL, Identificador NUMBER(16) NOT NULL, Descripcion VARCHAR2(200) NOT NULL, FecInicio DATE NOT NULL, FecFin DATE NULL, Observacion VARCHAR2(500) NULL);
CREATE TABLE Preexistencia(id_solicitud NUMBER(16) NOT NULL, Usuario_Identificador NUMBER(16) NOT NULL, Identificador NUMBER(16) NOT NULL, Descripcion VARCHAR2(200) NOT NULL, FecInicio DATE NOT NULL, FecFin DATE NULL, Observacion VARCHAR2(500) NULL);
CREATE TABLE DocumentoG(Identificador NUMBER(16) NOT NULL, id_solicitud NUMBER(16) NOT NULL, Persona_Identificador NUMBER(16) NOT NULL, Descripcion VARCHAR2(150) NULL, Tipo NUMBER(10) NULL, Estado NUMBER(10) NOT NULL, FechaSubida DATE NOT NULL, PathCompleto VARCHAR2(255) NULL, Extension VARCHAR2(15) NULL, NumDescargas NUMBER(10) NOT NULL, EmailEnvioDevuelto VARCHAR2(255) NULL, ResultadoSubida CLOB NULL, IdDocEnGestor VARCHAR2(255) NULL, Nombre VARCHAR2(255) NULL, UsuarioCreador VARCHAR2(50) NOT NULL);
CREATE SEQUENCE DocumentoG_Sequence;
CREATE OR REPLACE TRIGGER DocumentoG_Trg
BEFORE INSERT ON DocumentoG
FOR EACH ROW
BEGIN
    SELECT DocumentoG_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE ObsEstado(Identificador NUMBER(16) NOT NULL, Id NUMBER(16) NOT NULL, Agente_Id NUMBER(16) NOT NULL, Observacions VARCHAR2(999) NULL, EstadoAnterior NUMBER(10) NOT NULL, EstadoNuevo NUMBER(10) NOT NULL, Fecha DATE NOT NULL);
CREATE TABLE ErrorWS(Identificador NUMBER(16) NOT NULL, id_solicitud NUMBER(16) NOT NULL, Descripcion VARCHAR2(999) NOT NULL);
CREATE SEQUENCE ErrorWS_Sequence;
CREATE OR REPLACE TRIGGER ErrorWS_Trg
BEFORE INSERT ON ErrorWS
FOR EACH ROW
BEGIN
    SELECT ErrorWS_Sequence.NEXTVAL
    INTO :new.Identificador
    FROM dual;
END;
CREATE TABLE ParentescoDom(Numero NUMBER(16) NOT NULL, Identificador NUMBER(16) NOT NULL, Codigo NUMBER(10) NOT NULL, EdadMinimaA NUMBER(10) NULL, EdadMaximaA NUMBER(10) NULL, EdadMinimaD NUMBER(10) NULL, EdadMaximaP NUMBER(10) NULL);
CREATE TABLE MarcaMedicaC(ID NUMBER(16) NOT NULL, Producto NUMBER(10) NOT NULL, Codigo VARCHAR2(10) NOT NULL, Descripcion VARCHAR2(100) NULL, TipoMarcacion VARCHAR2(100) NULL, EximePagoPrestacion NUMBER(1) NULL, EstadoMarcacionMedica VARCHAR2(50) NULL, FechaInicio DATE NULL, FechaFin DATE NULL);
CREATE TABLE TipoSucursalC(Codigo NUMBER(10) NOT NULL, Descripcion VARCHAR2(150) NOT NULL);
CREATE TABLE ConceptoC(IdConcepto NUMBER(16) NOT NULL, ID NUMBER(16) NOT NULL, BeneficiarioC_ID NUMBER(16) NOT NULL, codConceptoContrato VARCHAR2(4) NULL, nombreConcepto VARCHAR2(50) NULL, porcentajeConcepto NUMBER(19,6) NULL, valorConcepto NUMBER(19,6) NULL);
CREATE SEQUENCE ConceptoC_Sequence;
CREATE OR REPLACE TRIGGER ConceptoC_Trg
BEFORE INSERT ON ConceptoC
FOR EACH ROW
BEGIN
    SELECT ConceptoC_Sequence.NEXTVAL
    INTO :new.IdConcepto
    FROM dual;
END;
CREATE TABLE DetalleTarifa(id_DetalleTarifa NUMBER(16) NOT NULL, Id NUMBER(16) NOT NULL, Anyo NUMBER(10) NOT NULL, LimInferiorEdad NUMBER(10) NOT NULL, LimSuperiorEdad NUMBER(10) NOT NULL, Valor NUMBER(19,6) NOT NULL);
CREATE SEQUENCE DetalleTarifa_Sequence;
CREATE OR REPLACE TRIGGER DetalleTarifa_Trg
BEFORE INSERT ON DetalleTarifa
FOR EACH ROW
BEGIN
    SELECT DetalleTarifa_Sequence.NEXTVAL
    INTO :new.id_DetalleTarifa
    FROM dual;
END;
CREATE TABLE AgentexProducto(Asesor_Id NUMBER(16) NOT NULL, Id NUMBER(16) NOT NULL, Producto NUMBER(10) NOT NULL, Codigo NUMBER(10) NOT NULL, FechaInicio DATE NULL, FechaFin DATE NULL, TodosDominios NUMBER(1) NOT NULL);
CREATE TABLE InstitucionMatNeo(Codigo VARCHAR2(20) NOT NULL, TipoIdentificacion_Codigo NUMBER(10) NOT NULL, Id NUMBER(16) NOT NULL, Municipio_Codigo NUMBER(10) NOT NULL, NumIdentificacion VARCHAR2(60) NOT NULL, Nombre VARCHAR2(100) NOT NULL, ParaMaternidad NUMBER(1) NOT NULL, ParaNeonatal NUMBER(1) NOT NULL, FechaInicial DATE NOT NULL, FechaFinal DATE NOT NULL);
CREATE TABLE LogEstado(Id NUMBER(16) NOT NULL, id_solicitud NUMBER(16) NOT NULL, Fecha DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, Observacion VARCHAR2(255) NULL, MotDevolucion VARCHAR2(50) NULL, Estado NUMBER(10) NOT NULL, EstadoDoc NUMBER(10) NOT NULL);
CREATE SEQUENCE LogEstado_Sequence;
CREATE OR REPLACE TRIGGER LogEstado_Trg
BEFORE INSERT ON LogEstado
FOR EACH ROW
BEGIN
    SELECT LogEstado_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE MotDevAreaMedica(Id NUMBER(16) NOT NULL, Descripcion VARCHAR2(50) NOT NULL);
CREATE SEQUENCE MotDevAreaMedica_Sequence;
CREATE OR REPLACE TRIGGER MotDevAreaMedica_Trg
BEFORE INSERT ON MotDevAreaMedica
FOR EACH ROW
BEGIN
    SELECT MotDevAreaMedica_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE ContSinDocSol(id_ContSinDocSol NUMBER(16) NOT NULL, NumContrato VARCHAR2(50) NOT NULL);
CREATE SEQUENCE ContSinDocSol_Sequence;
CREATE OR REPLACE TRIGGER ContSinDocSol_Trg
BEFORE INSERT ON ContSinDocSol
FOR EACH ROW
BEGIN
    SELECT ContSinDocSol_Sequence.NEXTVAL
    INTO :new.id_ContSinDocSol
    FROM dual;
END;
CREATE TABLE LogContSinDocSol(id_LogContSinDocSol NUMBER(16) NOT NULL, NumContrato VARCHAR2(50) NOT NULL, Fecha DATE NOT NULL, Usuario VARCHAR2(50) NOT NULL);
CREATE SEQUENCE LogContSinDocSol_Sequence;
CREATE OR REPLACE TRIGGER LogContSinDocSol_Trg
BEFORE INSERT ON LogContSinDocSol
FOR EACH ROW
BEGIN
    SELECT LogContSinDocSol_Sequence.NEXTVAL
    INTO :new.id_LogContSinDocSol
    FROM dual;
END;
CREATE TABLE LogAsignaciones(id_LogAsignaciones NUMBER(16) NOT NULL, id_solicitud NUMBER(16) NOT NULL, Tipo VARCHAR2(30) NOT NULL, FechaHora DATE NOT NULL, Quien VARCHAR2(50) NOT NULL, Usuario VARCHAR2(50) NOT NULL);
CREATE SEQUENCE LogAsignaciones_Sequence;
CREATE OR REPLACE TRIGGER LogAsignaciones_Trg
BEFORE INSERT ON LogAsignaciones
FOR EACH ROW
BEGIN
    SELECT LogAsignaciones_Sequence.NEXTVAL
    INTO :new.id_LogAsignaciones
    FROM dual;
END;
CREATE TABLE ReportesProcAlm(id_Reporte NUMBER(16) NOT NULL, Descripcion VARCHAR2(50) NOT NULL, NombreProc VARCHAR2(200) NOT NULL, NombreFichero VARCHAR2(200) NOT NULL);
CREATE SEQUENCE ReportesProcAlm_Sequence;
CREATE OR REPLACE TRIGGER ReportesProcAlm_Trg
BEFORE INSERT ON ReportesProcAlm
FOR EACH ROW
BEGIN
    SELECT ReportesProcAlm_Sequence.NEXTVAL
    INTO :new.id_Reporte
    FROM dual;
END;
CREATE TABLE Prorrateo(Numero NUMBER(16) NOT NULL, id_Prorrateo NUMBER(16) NOT NULL, Dia NUMBER(10) NOT NULL, Porcentaje NUMBER(19,6) NOT NULL);
CREATE TABLE TipoFactura(Codigo VARCHAR2(20) NOT NULL, Descripcion VARCHAR2(50) NOT NULL, EsEmail NUMBER(1) NOT NULL, EsCelular NUMBER(1) NOT NULL, Activo NUMBER(1) NOT NULL);
CREATE TABLE ParamReporte(id_ParamReporte NUMBER(16) NOT NULL, id_Reporte NUMBER(16) NOT NULL, Titulo VARCHAR2(50) NOT NULL, Descripcion VARCHAR2(200) NULL, EsNumerico NUMBER(1) NOT NULL, Orden NUMBER(10) NULL);
CREATE SEQUENCE ParamReporte_Sequence;
CREATE OR REPLACE TRIGGER ParamReporte_Trg
BEFORE INSERT ON ParamReporte
FOR EACH ROW
BEGIN
    SELECT ParamReporte_Sequence.NEXTVAL
    INTO :new.id_ParamReporte
    FROM dual;
END;
CREATE TABLE TipoNovedad(Tipo NUMBER(10) NOT NULL, AliasTipo VARCHAR2(50) NOT NULL, Nombre VARCHAR2(50) NOT NULL, Descripcion VARCHAR2(200) NOT NULL, CodigoLegal VARCHAR2(5) NOT NULL);
CREATE TABLE Novedad(id_Novedad NUMBER(16) NOT NULL, Tipo NUMBER(10) NOT NULL, AliasNovedad VARCHAR2(2) NOT NULL, Nombre VARCHAR2(50) NOT NULL, Descripcion VARCHAR2(200) NOT NULL, CodigoLegal VARCHAR2(5) NOT NULL, ReqDocPersona NUMBER(1) NOT NULL, ReqDocSolicitud NUMBER(1) NOT NULL, VariasFamilias NUMBER(1) NOT NULL, MinValorMeses NUMBER(10) NULL, MaxValorMeses NUMBER(10) NULL);
CREATE SEQUENCE Novedad_Sequence;
CREATE OR REPLACE TRIGGER Novedad_Trg
BEFORE INSERT ON Novedad
FOR EACH ROW
BEGIN
    SELECT Novedad_Sequence.NEXTVAL
    INTO :new.id_Novedad
    FROM dual;
END;
CREATE TABLE Causal(id_Causal NUMBER(16) NOT NULL, id_Novedad NUMBER(16) NOT NULL, AliasCausal VARCHAR2(50) NOT NULL, Nombre VARCHAR2(50) NOT NULL, Descripcion VARCHAR2(200) NOT NULL, CodigoLegal VARCHAR2(5) NOT NULL, ReqDocPersona NUMBER(1) NOT NULL, ReqDocSolicitud NUMBER(1) NOT NULL);
CREATE SEQUENCE Causal_Sequence;
CREATE OR REPLACE TRIGGER Causal_Trg
BEFORE INSERT ON Causal
FOR EACH ROW
BEGIN
    SELECT Causal_Sequence.NEXTVAL
    INTO :new.id_Causal
    FROM dual;
END;
CREATE TABLE SolicitudNovedad(Id NUMBER(16) NOT NULL, Plan NUMBER(10) NOT NULL, id_Novedad NUMBER(16) NOT NULL, id_Causal NUMBER(16) NULL, Identificador NUMBER(16) NULL, Codigo NUMBER(10) NULL, EstadoContrato_Codigo NUMBER(10) NULL, GrupoAsociado_Codigo NUMBER(10) NULL, Periodicidad_Codigo NUMBER(10) NULL, Agente_Id NUMBER(16) NOT NULL, PeriodicidadNueva_Codigo NUMBER(10) NULL, MotivoExcepcion_Id NUMBER(16) NULL, UsrAfiliacion_Id NUMBER(16) NULL, Firma_Identificador NUMBER(16) NULL, NumRadicado NUMBER(16) NOT NULL, FechaCreacion DATE NOT NULL, FechaVigencia DATE NOT NULL, NumContrato VARCHAR2(50) NOT NULL, Excepcion NUMBER(1) NOT NULL, FechaIniExcepcion DATE NULL, FechaFinExcepcion DATE NULL, CtrCodigoTarifa VARCHAR2(12) NULL, CtrDescTarifa VARCHAR2(100) NULL, CtrCodigoConvenio VARCHAR2(12) NULL, CtrDescConvenio VARCHAR2(100) NULL, CtrEsColectivo NUMBER(1) NOT NULL, CtrTagCausaExclusion VARCHAR2(100) NULL, ContraNumIden VARCHAR2(60) NULL, ContraPrimerNombre VARCHAR2(50) NULL, ContraSegundoNombre VARCHAR2(50) NULL, ContraPrimerApellido VARCHAR2(50) NULL, ContraSegundoApellido VARCHAR2(50) NULL, ContraRazonSocial VARCHAR2(200) NULL, FechaUltimoDoc DATE NULL, Observacions VARCHAR2(900) NULL, Estado NUMBER(10) NULL, EstadoDocumentacion NUMBER(10) NULL, Completada NUMBER(1) NOT NULL, FechaCompletada DATE NULL, CtrActivo NUMBER(1) NOT NULL, CtrTipoContrato NUMBER(10) NULL, SCNumMeses NUMBER(10) NULL, ContraNuevaRazonSocial VARCHAR2(200) NULL, ContraTipoPersona VARCHAR2(1) NULL, CtrFInicioContrato DATE NULL, Prioridad NUMBER(10) NOT NULL, FechaTerminada DATE NULL, FechaFUG DATE NULL, FechaFA DATE NULL, SemaforoGrabAse NUMBER(19,6) NULL);
CREATE SEQUENCE SolicitudNovedad_Sequence;
CREATE OR REPLACE TRIGGER SolicitudNovedad_Trg
BEFORE INSERT ON SolicitudNovedad
FOR EACH ROW
BEGIN
    SELECT SolicitudNovedad_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE FamiliaNovedad(id_FamiliaNovedad NUMBER(16) NOT NULL, Id NUMBER(16) NOT NULL, Codigo NUMBER(10) NULL, Identificador NUMBER(16) NULL, NumFamilia NUMBER(10) NOT NULL, TitNumidentificacion VARCHAR2(60) NOT NULL, TitPrimerNombre VARCHAR2(50) NULL, TitSegundoNombre VARCHAR2(50) NULL, TitPrimerApellido VARCHAR2(50) NULL, TitSegundoApellido VARCHAR2(50) NULL, TitRazonSocial VARCHAR2(200) NULL, TitTieneBeneficios NUMBER(1) NOT NULL, FamActiva NUMBER(1) NOT NULL);
CREATE SEQUENCE FamiliaNovedad_Sequence;
CREATE OR REPLACE TRIGGER FamiliaNovedad_Trg
BEFORE INSERT ON FamiliaNovedad
FOR EACH ROW
BEGIN
    SELECT FamiliaNovedad_Sequence.NEXTVAL
    INTO :new.id_FamiliaNovedad
    FROM dual;
END;
CREATE TABLE UsuarioNovedad(id_UsuarioNovedad NUMBER(16) NOT NULL, id_FamiliaNovedad NUMBER(16) NOT NULL, Codigo NUMBER(10) NULL, Parentesco_Codigo NUMBER(10) NULL, EstadoBeneficiario_Codigo NUMBER(10) NULL, ParentescoNuevo_Codigo NUMBER(10) NULL, TipoIdentificacionCD_Codigo NUMBER(10) NULL, NumIdentificacion VARCHAR2(60) NOT NULL, PrimerNombre VARCHAR2(50) NULL, SegundoNombre VARCHAR2(50) NULL, PrimerApellido VARCHAR2(50) NULL, SegundoApellido VARCHAR2(50) NULL, MotivoEstado VARCHAR2(200) NULL, FechaIniVigencia DATE NULL, FechaAntiguedad DATE NULL, NumUsuario NUMBER(10) NOT NULL, Genero VARCHAR2(1) NULL, FechaNacimiento DATE NULL, SUNumMeses NUMBER(10) NULL, NumIdentificacionCD VARCHAR2(60) NULL, Excluido NUMBER(1) NOT NULL, ContratacionRO NUMBER(1) NOT NULL, ProrrogaSuspension NUMBER(1) NOT NULL, ActivacionSuspension NUMBER(1) NOT NULL);
CREATE SEQUENCE UsuarioNovedad_Sequence;
CREATE OR REPLACE TRIGGER UsuarioNovedad_Trg
BEFORE INSERT ON UsuarioNovedad
FOR EACH ROW
BEGIN
    SELECT UsuarioNovedad_Sequence.NEXTVAL
    INTO :new.id_UsuarioNovedad
    FROM dual;
END;
CREATE TABLE CausaExclusion(id_CausaExclusion NUMBER(16) NOT NULL, id_Novedad NUMBER(16) NOT NULL, AliasCausa VARCHAR2(10) NOT NULL, Descripcion VARCHAR2(100) NOT NULL);
CREATE SEQUENCE CausaExclusion_Sequence;
CREATE OR REPLACE TRIGGER CausaExclusion_Trg
BEFORE INSERT ON CausaExclusion
FOR EACH ROW
BEGIN
    SELECT CausaExclusion_Sequence.NEXTVAL
    INTO :new.id_CausaExclusion
    FROM dual;
END;
CREATE TABLE NovedadCT(id_NovedadCT NUMBER(16) NOT NULL, id_FamiliaNovedad NUMBER(16) NOT NULL, Codigo NUMBER(10) NOT NULL, Identificador NUMBER(16) NULL, MunicipioNac_Codigo NUMBER(10) NULL, MunicipioRes_Codigo NUMBER(10) NULL, DepartamentoNac_Codigo NUMBER(10) NULL, DepartamentoRes_Codigo NUMBER(10) NULL, Pais_Codigo VARCHAR2(10) NULL, TitNumidentificacion VARCHAR2(60) NOT NULL, TitPrimerNombre VARCHAR2(50) NULL, TitSegundoNombre VARCHAR2(50) NULL, TitPrimerApellido VARCHAR2(50) NULL, TitSegundoApellido VARCHAR2(50) NULL, TitRazonSocial VARCHAR2(200) NULL, TitTieneBeneficios NUMBER(1) NOT NULL, FechaNacimiento DATE NULL, Genero VARCHAR2(1) NULL, IndicadorExtranjero NUMBER(1) NULL, TelefonoFijo VARCHAR2(15) NULL, TelefonoCelular VARCHAR2(15) NULL, CorreoElectronico VARCHAR2(100) NULL, DireccionCompleta VARCHAR2(250) NULL, Rural NUMBER(1) NULL, CodigoCORE NUMBER(10) NULL);
CREATE SEQUENCE NovedadCT_Sequence;
CREATE OR REPLACE TRIGGER NovedadCT_Trg
BEFORE INSERT ON NovedadCT
FOR EACH ROW
BEGIN
    SELECT NovedadCT_Sequence.NEXTVAL
    INTO :new.id_NovedadCT
    FROM dual;
END;
CREATE TABLE DocumentoNovedad(IdDocumento NUMBER(16) NOT NULL, Id NUMBER(16) NOT NULL, id_UsuarioNovedad NUMBER(16) NULL, Tipo NUMBER(10) NOT NULL, FechaSubida DATE NOT NULL, Descripcion VARCHAR2(150) NULL, Estado NUMBER(10) NOT NULL, PathCompleto VARCHAR2(255) NULL, Extension VARCHAR2(15) NULL, ResultadoSubida CLOB NULL, IdDocEnGestor VARCHAR2(255) NULL, Nombre VARCHAR2(255) NULL, UsuarioCreador VARCHAR2(50) NOT NULL);
CREATE SEQUENCE DocumentoNovedad_Sequence;
CREATE OR REPLACE TRIGGER DocumentoNovedad_Trg
BEFORE INSERT ON DocumentoNovedad
FOR EACH ROW
BEGIN
    SELECT DocumentoNovedad_Sequence.NEXTVAL
    INTO :new.IdDocumento
    FROM dual;
END;
CREATE TABLE NovedadMD(id_NovedadMD NUMBER(16) NOT NULL, id_FamiliaNovedad NUMBER(16) NOT NULL, Codigo VARCHAR2(10) NULL, Departamento_Codigo NUMBER(10) NULL, Municipio_Codigo NUMBER(10) NULL, DireccionCompleta VARCHAR2(250) NULL, Rural NUMBER(1) NULL, TelefonoFijo VARCHAR2(15) NULL, TelefonoCelular VARCHAR2(15) NULL, CorreoElectronico VARCHAR2(100) NULL);
CREATE SEQUENCE NovedadMD_Sequence;
CREATE OR REPLACE TRIGGER NovedadMD_Trg
BEFORE INSERT ON NovedadMD
FOR EACH ROW
BEGIN
    SELECT NovedadMD_Sequence.NEXTVAL
    INTO :new.id_NovedadMD
    FROM dual;
END;
CREATE TABLE LogEstadoSN(Id NUMBER(16) NOT NULL, SolicitudNovedad_Id NUMBER(16) NOT NULL, Fecha DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, Estado NUMBER(10) NOT NULL, EstadoDoc NUMBER(10) NOT NULL);
CREATE SEQUENCE LogEstadoSN_Sequence;
CREATE OR REPLACE TRIGGER LogEstadoSN_Trg
BEFORE INSERT ON LogEstadoSN
FOR EACH ROW
BEGIN
    SELECT LogEstadoSN_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE MotivoExcepcionSolNov(Id NUMBER(16) NOT NULL, Descripcion VARCHAR2(150) NOT NULL);
CREATE SEQUENCE MotivoExcepcionSolNov_Sequence;
CREATE OR REPLACE TRIGGER MotivoExcepcionSolNov_Trg
BEFORE INSERT ON MotivoExcepcionSolNov
FOR EACH ROW
BEGIN
    SELECT MotivoExcepcionSolNov_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE PriorizacionSolicitudes(EstadoSolicitud NUMBER(10) NOT NULL, EstadoDoc NUMBER(10) NOT NULL, Prioridad NUMBER(10) NOT NULL);
CREATE TABLE LogPriorizacionSol(Id NUMBER(16) NOT NULL, PriSolicitud_EstadoSolicitud NUMBER(10) NULL, PriSolicitud_EstadoDoc NUMBER(10) NULL, Fecha DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, EstadoSolicitud NUMBER(10) NOT NULL, EstadoDoc NUMBER(10) NOT NULL, Prioridad NUMBER(10) NOT NULL);
CREATE SEQUENCE LogPriorizacionSol_Sequence;
CREATE OR REPLACE TRIGGER LogPriorizacionSol_Trg
BEFORE INSERT ON LogPriorizacionSol
FOR EACH ROW
BEGIN
    SELECT LogPriorizacionSol_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE GrupoAsignacion(Id NUMBER(16) NOT NULL, Tipo NUMBER(10) NOT NULL, Nombre VARCHAR2(50) NOT NULL, Descripcion VARCHAR2(150) NOT NULL);
CREATE SEQUENCE GrupoAsignacion_Sequence;
CREATE OR REPLACE TRIGGER GrupoAsignacion_Trg
BEFORE INSERT ON GrupoAsignacion
FOR EACH ROW
BEGIN
    SELECT GrupoAsignacion_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE LogGrupoAsignacion(Id NUMBER(16) NOT NULL, GrupoAsignacion_Id NUMBER(16) NOT NULL, Fecha DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, Accion VARCHAR2(50) NOT NULL, Valor VARCHAR2(200) NOT NULL);
CREATE SEQUENCE LogGrupoAsignacion_Sequence;
CREATE OR REPLACE TRIGGER LogGrupoAsignacion_Trg
BEFORE INSERT ON LogGrupoAsignacion
FOR EACH ROW
BEGIN
    SELECT LogGrupoAsignacion_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE LogGruposUsuarios(Id NUMBER(16) NOT NULL, Numero NUMBER(16) NOT NULL, Fecha DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, TipoGrupo NUMBER(10) NOT NULL, Accion VARCHAR2(50) NOT NULL, Grupo VARCHAR2(100) NOT NULL);
CREATE SEQUENCE LogGruposUsuarios_Sequence;
CREATE OR REPLACE TRIGGER LogGruposUsuarios_Trg
BEFORE INSERT ON LogGruposUsuarios
FOR EACH ROW
BEGIN
    SELECT LogGruposUsuarios_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE GrupoAsignacionNovedad(Id NUMBER(16) NOT NULL, Numero NUMBER(16) NOT NULL, id_Causal NUMBER(16) NOT NULL, GrupoUsuarios_Id NUMBER(16) NULL);
CREATE SEQUENCE GrupoAsignacionNovedad_Sequence;
CREATE OR REPLACE TRIGGER GrupoAsignacionNovedad_Trg
BEFORE INSERT ON GrupoAsignacionNovedad
FOR EACH ROW
BEGIN
    SELECT GrupoAsignacionNovedad_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE LogFuncionario(Id NUMBER(16) NOT NULL, Funcionario_Id NUMBER(16) NOT NULL, Fecha DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, Disponible NUMBER(1) NOT NULL);
CREATE SEQUENCE LogFuncionario_Sequence;
CREATE OR REPLACE TRIGGER LogFuncionario_Trg
BEFORE INSERT ON LogFuncionario
FOR EACH ROW
BEGIN
    SELECT LogFuncionario_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE LogUsrSolNov(Id NUMBER(16) NOT NULL, SolicitudNovedad_Id NUMBER(16) NOT NULL, Fecha DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, Usuario VARCHAR2(50) NOT NULL);
CREATE SEQUENCE LogUsrSolNov_Sequence;
CREATE OR REPLACE TRIGGER LogUsrSolNov_Trg
BEFORE INSERT ON LogUsrSolNov
FOR EACH ROW
BEGIN
    SELECT LogUsrSolNov_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE ContratoCombo(Id NUMBER(16) NOT NULL, ContratoIntegral VARCHAR2(50) NOT NULL, ContratoOdontologico VARCHAR2(50) NOT NULL);
CREATE SEQUENCE ContratoCombo_Sequence;
CREATE OR REPLACE TRIGGER ContratoCombo_Trg
BEFORE INSERT ON ContratoCombo
FOR EACH ROW
BEGIN
    SELECT ContratoCombo_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE LogContratoCombo(Id NUMBER(16) NOT NULL, Fecha DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, ContratoIntegral VARCHAR2(50) NULL, ContratoOdontologico VARCHAR2(50) NULL, Accion VARCHAR2(50) NOT NULL);
CREATE SEQUENCE LogContratoCombo_Sequence;
CREATE OR REPLACE TRIGGER LogContratoCombo_Trg
BEFORE INSERT ON LogContratoCombo
FOR EACH ROW
BEGIN
    SELECT LogContratoCombo_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE ConfiguracionANS(Id NUMBER(16) NOT NULL, Numero NUMBER(16) NOT NULL, id_Novedad NUMBER(16) NULL, id_Causal NUMBER(16) NULL, Tramite NUMBER(10) NOT NULL, ANSAfiliaciones NUMBER(10) NOT NULL, ANSAreaMedica NUMBER(10) NOT NULL, HabilLunes NUMBER(1) NOT NULL, HabilMartes NUMBER(1) NOT NULL, HabilMiercoles NUMBER(1) NOT NULL, HabilJueves NUMBER(1) NOT NULL, HabilViernes NUMBER(1) NOT NULL, HabilSabado NUMBER(1) NOT NULL, HabilDomingo NUMBER(1) NOT NULL);
CREATE SEQUENCE ConfiguracionANS_Sequence;
CREATE OR REPLACE TRIGGER ConfiguracionANS_Trg
BEFORE INSERT ON ConfiguracionANS
FOR EACH ROW
BEGIN
    SELECT ConfiguracionANS_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE LogConfiguracionANS(Id NUMBER(16) NOT NULL, ConfiguracionANS_Id NUMBER(16) NOT NULL, Fecha DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, ANSAfiliaciones NUMBER(10) NOT NULL, ANSAreaMedica NUMBER(10) NOT NULL, HabilLunes NUMBER(1) NOT NULL, HabilMartes NUMBER(1) NOT NULL, HabilMiercoles NUMBER(1) NOT NULL, HabilJueves NUMBER(1) NOT NULL, HabilViernes NUMBER(1) NOT NULL, HabilSabado NUMBER(1) NOT NULL, HabilDomingo NUMBER(1) NOT NULL);
CREATE SEQUENCE LogConfiguracionANS_Sequence;
CREATE OR REPLACE TRIGGER LogConfiguracionANS_Trg
BEFORE INSERT ON LogConfiguracionANS
FOR EACH ROW
BEGIN
    SELECT LogConfiguracionANS_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE ConfiguracionFestivos(Id NUMBER(16) NOT NULL, DiaFestivo DATE NOT NULL);
CREATE SEQUENCE ConfiguracionFestivos_Sequence;
CREATE OR REPLACE TRIGGER ConfiguracionFestivos_Trg
BEFORE INSERT ON ConfiguracionFestivos
FOR EACH ROW
BEGIN
    SELECT ConfiguracionFestivos_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE LogEstadoDocNov(Id NUMBER(16) NOT NULL, IdDocumento NUMBER(16) NOT NULL, Fecha DATE NOT NULL, NombreFuncionario VARCHAR2(200) NOT NULL, EstadoAnterior NUMBER(10) NOT NULL, EstadoNuevo NUMBER(10) NOT NULL, Observacions VARCHAR2(999) NULL);
CREATE SEQUENCE LogEstadoDocNov_Sequence;
CREATE OR REPLACE TRIGGER LogEstadoDocNov_Trg
BEFORE INSERT ON LogEstadoDocNov
FOR EACH ROW
BEGIN
    SELECT LogEstadoDocNov_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE PlantillaReporte(id_PlantillaReporte NUMBER(16) NOT NULL, Tipo NUMBER(10) NOT NULL, Titulo VARCHAR2(100) NOT NULL, FechaVigencia DATE NOT NULL, RutaArchivos VARCHAR2(255) NOT NULL, NombreArchivoPDF VARCHAR2(50) NOT NULL);
CREATE SEQUENCE PlantillaReporte_Sequence;
CREATE OR REPLACE TRIGGER PlantillaReporte_Trg
BEFORE INSERT ON PlantillaReporte
FOR EACH ROW
BEGIN
    SELECT PlantillaReporte_Sequence.NEXTVAL
    INTO :new.id_PlantillaReporte
    FROM dual;
END;
CREATE TABLE ReportesDominio(Numero NUMBER(16) NOT NULL, id_PlantillaReporte NUMBER(16) NOT NULL, EnviarAuto NUMBER(1) NOT NULL);
CREATE TABLE LogInformacionAsesor(id_LogInformacionAsesor NUMBER(16) NOT NULL, Id NUMBER(16) NOT NULL, FechaHora DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, VerDatosPersona NUMBER(1) NOT NULL, VerDocsPersona NUMBER(1) NOT NULL, VerContratoNovedad NUMBER(1) NOT NULL, AccesoValidadorUsuarios NUMBER(1) NOT NULL);
CREATE SEQUENCE LogInformacionAsesor_Sequence;
CREATE OR REPLACE TRIGGER LogInformacionAsesor_Trg
BEFORE INSERT ON LogInformacionAsesor
FOR EACH ROW
BEGIN
    SELECT LogInformacionAsesor_Sequence.NEXTVAL
    INTO :new.id_LogInformacionAsesor
    FROM dual;
END;
CREATE TABLE LogHistoricoPlanes(id_LogHistoricoPlanes NUMBER(16) NOT NULL, Id NUMBER(16) NOT NULL, FechaHora DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, Producto VARCHAR2(10) NOT NULL, Plan VARCHAR2(10) NOT NULL, Accion VARCHAR2(10) NOT NULL);
CREATE SEQUENCE LogHistoricoPlanes_Sequence;
CREATE OR REPLACE TRIGGER LogHistoricoPlanes_Trg
BEFORE INSERT ON LogHistoricoPlanes
FOR EACH ROW
BEGIN
    SELECT LogHistoricoPlanes_Sequence.NEXTVAL
    INTO :new.id_LogHistoricoPlanes
    FROM dual;
END;
CREATE TABLE LogLlamadasAE(ID NUMBER(16) NOT NULL, TipoServicio VARCHAR2(20) NOT NULL, Solicitud VARCHAR2(50) NULL, Servicio VARCHAR2(100) NOT NULL, Capacidad VARCHAR2(100) NULL, FechaHora DATE NOT NULL, TextoError CLOB NULL, TiempoEjecucion NUMBER(19,6) NULL, DatosRecibidos CLOB NULL, DatosEnviados CLOB NULL);
CREATE SEQUENCE LogLlamadasAE_Sequence;
CREATE OR REPLACE TRIGGER LogLlamadasAE_Trg
BEFORE INSERT ON LogLlamadasAE
FOR EACH ROW
BEGIN
    SELECT LogLlamadasAE_Sequence.NEXTVAL
    INTO :new.ID
    FROM dual;
END;
CREATE TABLE LogLlamadasBH(ID NUMBER(16) NOT NULL, TipoServicio VARCHAR2(20) NOT NULL, Solicitud VARCHAR2(50) NULL, Servicio VARCHAR2(100) NOT NULL, Capacidad VARCHAR2(100) NULL, FechaHora DATE NOT NULL, TextoError CLOB NULL, TiempoEjecucion NUMBER(19,6) NULL, Peticion CLOB NULL, Respuesta CLOB NULL, Usuario VARCHAR2(50) NULL);
CREATE SEQUENCE LogLlamadasBH_Sequence;
CREATE OR REPLACE TRIGGER LogLlamadasBH_Trg
BEFORE INSERT ON LogLlamadasBH
FOR EACH ROW
BEGIN
    SELECT LogLlamadasBH_Sequence.NEXTVAL
    INTO :new.ID
    FROM dual;
END;
CREATE TABLE FechaIniEPS(Id NUMBER(16) NOT NULL, Tramite NUMBER(10) NOT NULL, TipoContrato NUMBER(10) NOT NULL, Desde DATE NOT NULL, Hasta DATE NOT NULL, FechaInicioAplicar DATE NOT NULL);
CREATE SEQUENCE FechaIniEPS_Sequence;
CREATE OR REPLACE TRIGGER FechaIniEPS_Trg
BEFORE INSERT ON FechaIniEPS
FOR EACH ROW
BEGIN
    SELECT FechaIniEPS_Sequence.NEXTVAL
    INTO :new.Id
    FROM dual;
END;
CREATE TABLE LogIncompatibilidades(id_LogIncompatibilidades NUMBER(16) NOT NULL, Numero NUMBER(16) NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, Fecha DATE NOT NULL, Accion VARCHAR2(12) NOT NULL, NomDominio VARCHAR2(50) NOT NULL);
CREATE SEQUENCE LogIncompatibilidades_Sequence;
CREATE OR REPLACE TRIGGER LogIncompatibilidades_Trg
BEFORE INSERT ON LogIncompatibilidades
FOR EACH ROW
BEGIN
    SELECT LogIncompatibilidades_Sequence.NEXTVAL
    INTO :new.id_LogIncompatibilidades
    FROM dual;
END;
CREATE TABLE LogDatosDominio(id_LogDatosDominio NUMBER(16) NOT NULL, Numero NUMBER(16) NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, Fecha DATE NOT NULL, TramiteEnLinea NUMBER(1) NOT NULL, VigenciaRadicacion NUMBER(1) NOT NULL);
CREATE SEQUENCE LogDatosDominio_Sequence;
CREATE OR REPLACE TRIGGER LogDatosDominio_Trg
BEFORE INSERT ON LogDatosDominio
FOR EACH ROW
BEGIN
    SELECT LogDatosDominio_Sequence.NEXTVAL
    INTO :new.id_LogDatosDominio
    FROM dual;
END;
CREATE TABLE ContratosExentosFIngreso(id_ContratosExentosFIngreso NUMBER(16) NOT NULL, NumContrato VARCHAR2(50) NOT NULL);
CREATE SEQUENCE ContratosExentosFIngreso_Sequence;
CREATE OR REPLACE TRIGGER ContratosExentosFIngreso_Trg
BEFORE INSERT ON ContratosExentosFIngreso
FOR EACH ROW
BEGIN
    SELECT ContratosExentosFIngreso_Sequence.NEXTVAL
    INTO :new.id_ContratosExentosFIngreso
    FROM dual;
END;
CREATE TABLE LogContratosExentosFIngreso(id_LogContratosExentosFIngreso NUMBER(16) NOT NULL, Fecha DATE NOT NULL, LoginFuncionario VARCHAR2(50) NOT NULL, Accion VARCHAR2(15) NOT NULL, NumContrato VARCHAR2(50) NOT NULL);
CREATE SEQUENCE LogContratosExentosFIngreso_Sequence;
CREATE OR REPLACE TRIGGER LogContratosExentosFIngreso_Trg
BEFORE INSERT ON LogContratosExentosFIngreso
FOR EACH ROW
BEGIN
    SELECT LogContratosExentosFIngreso_Sequence.NEXTVAL
    INTO :new.id_LogContratosExentosFIngreso
    FROM dual;
END;
CREATE TABLE TextoAviso(Identificador VARCHAR2(20) NOT NULL, Descripcion VARCHAR2(255) NULL, Valor CLOB NOT NULL);
CREATE TABLE UsuarioSistemaExterno(Login VARCHAR2(20) NOT NULL, PassWord VARCHAR2(128) NOT NULL, Descripcion VARCHAR2(255) NULL);

CREATE TABLE GridPreferences (agentName VARCHAR2(200) NOT NULL, piuName VARCHAR2(200), gridState CLOB NULL);
