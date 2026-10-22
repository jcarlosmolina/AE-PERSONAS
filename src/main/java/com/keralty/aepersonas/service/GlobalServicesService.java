package com.keralty.aepersonas.service;

import com.keralty.aepersonas.exception.ModelException;
import com.keralty.aepersonas.exception.PreconditionException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.UserFunctions;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.repository.GlobalServicesJpaRepository;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.sql.Date;

@Transactional
@ApplicationScoped
public class GlobalServicesService extends AbstractService {

    GlobalServicesService globalServicesSrv;

    UserFunctions userFunctionsSrv;

    SolicitudService solicitudSrv;

    TipoIdentificacionService tipoIdentificacionSrv;

    DepartamentoService departamentoSrv;

    MunicipioService municipioSrv;

    EstadoCivilService estadoCivilSrv;

    PaisService paisSrv;

    ParentescoService parentescoSrv;

    PersonaService personaSrv;

    GlobalServicesJpaRepository globalServicesRepository;

    @Inject
    public GlobalServicesService(
            SolicitudService solicitudSrv,
            TipoIdentificacionService tipoIdentificacionSrv,
            DepartamentoService departamentoSrv,
            MunicipioService municipioSrv,
            EstadoCivilService estadoCivilSrv,
            PaisService paisSrv,
            ParentescoService parentescoSrv,
            PersonaService personaSrv,
            GlobalServicesJpaRepository globalServicesRepository,
            UserFunctions userFunctionsSrv,
            GlobalServicesService globalServicesSrv) {
        this.solicitudSrv = solicitudSrv;
        this.tipoIdentificacionSrv = tipoIdentificacionSrv;
        this.departamentoSrv = departamentoSrv;
        this.municipioSrv = municipioSrv;
        this.estadoCivilSrv = estadoCivilSrv;
        this.paisSrv = paisSrv;
        this.parentescoSrv = parentescoSrv;
        this.personaSrv = personaSrv;
        this.globalServicesRepository = globalServicesRepository;
        this.userFunctionsSrv = userFunctionsSrv;
        this.globalServicesSrv = globalServicesSrv;
    }

    /*
     * Entry point for global service TGSELECCONTRATOASOC
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tGSELECCONTRATOASOC(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = globalServicesSrv.tGSELECCONTRATOASOCTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for global service TGSELECCONTRATOASOC
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tGSELECCONTRATOASOCTxn(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest request) throws ModelException {
        request.setTGSELECCONTRATOASOCpSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getTGSELECCONTRATOASOCpSolicitud()));
        return globalServicesSrv.tGSELECCONTRATOASOCImplementation(request);
    }

    /*
     * Implements global service TGSELECCONTRATOASOC
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tGSELECCONTRATOASOCImplementation(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud tGSELECCONTRATOASOCpSolicitud = request.getTGSELECCONTRATOASOCpSolicitudInstance();
        String tGSELECCONTRATOASOCptNumContrato = request.getTGSELECCONTRATOASOCptNumContrato();
        String tGSELECCONTRATOASOCptCodLegalProducto = request.getTGSELECCONTRATOASOCptCodLegalProducto();
        String tGSELECCONTRATOASOCptCodLegalPlan = request.getTGSELECCONTRATOASOCptCodLegalPlan();
        String tGSELECCONTRATOASOCptNumFamilia = request.getTGSELECCONTRATOASOCptNumFamilia();

        request.checkArguments();

        tGSELECCONTRATOASOCPreconditions(request);

        com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest step1Request = new com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest();
        step1Request.setTGSELECCONTRATOASOCpSolicitudInstance(tGSELECCONTRATOASOCpSolicitud);
        step1Request.setTGSELECCONTRATOASOCptNumContrato(tGSELECCONTRATOASOCptNumContrato);
        step1Request.setTGSELECCONTRATOASOCptCodLegalProducto(tGSELECCONTRATOASOCptCodLegalProducto);
        step1Request.setTGSELECCONTRATOASOCptCodLegalPlan(tGSELECCONTRATOASOCptCodLegalPlan);
        step1Request.setTGSELECCONTRATOASOCptNumFamilia(tGSELECCONTRATOASOCptNumFamilia);
        globalServicesSrv.tGSELECCONTRATOASOCImplementation(step1Request);
        return response;
    }

    /*
     * Checks service TGSELECCONTRATOASOC preconditions individually
     * @param request Service request viewmodel
     * @returns Service response viewmodel with the execution results
     */
    public ServiceResponse tGSELECCONTRATOASOCCheckPreconditions(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest request) {
        ServiceResponse response = new ServiceResponse();
        request.setTGSELECCONTRATOASOCpSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getTGSELECCONTRATOASOCpSolicitud()));
        try {
            if("IGl_1433189875712803Pre_1".equals(request.getPreconditionId()))
                checkIGl1433189875712803Pre1(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    private void tGSELECCONTRATOASOCPreconditions(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest request) 
            throws ModelException {
        checkIGl1433189875712803Pre1(request);
    }

    private void checkIGl1433189875712803Pre1 (
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest request) 
            throws ModelException {
        // p_Solicitud.drvYaTieneContratante = true

        Solicitud tGSELECCONTRATOASOCpSolicitud = request.getTGSELECCONTRATOASOCpSolicitudInstance();
        boolean preconditionHolds = tGSELECCONTRATOASOCpSolicitud.getSolicituddrvYaTieneContratante().equals(true);
        if (!preconditionHolds) throw new PreconditionException("Debe especificar primero el contratante");
    }

    /*
     * Entry point for global service TGSELECCONTRATOASOCTIT
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public ServiceResponse tGSELECCONTRATOASOCTIT(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest request) {
        ServiceResponse response = new ServiceResponse();
        try {
            response = globalServicesSrv.tGSELECCONTRATOASOCTITTxn(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    /*
     * Transactional entry point for global service TGSELECCONTRATOASOCTIT
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ServiceResponse tGSELECCONTRATOASOCTITTxn(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest request) throws ModelException {
        request.setTGSELECCONTRATOASOCTITptpSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getTGSELECCONTRATOASOCTITptpSolicitud()));
        return globalServicesSrv.tGSELECCONTRATOASOCTITImplementation(request);
    }

    /*
     * Implements global service TGSELECCONTRATOASOCTIT
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tGSELECCONTRATOASOCTITImplementation(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest request) throws ModelException {
        ServiceResponse response = new ServiceResponse();
        Solicitud tGSELECCONTRATOASOCTITptpSolicitud = request.getTGSELECCONTRATOASOCTITptpSolicitudInstance();
        String tGSELECCONTRATOASOCTITptNumContrato = request.getTGSELECCONTRATOASOCTITptNumContrato();
        String tGSELECCONTRATOASOCTITptCodLegalProducto = request.getTGSELECCONTRATOASOCTITptCodLegalProducto();
        String tGSELECCONTRATOASOCTITptCodLegalPlan = request.getTGSELECCONTRATOASOCTITptCodLegalPlan();
        String tGSELECCONTRATOASOCTITptNumFamilia = request.getTGSELECCONTRATOASOCTITptNumFamilia();

        request.checkArguments();

        tGSELECCONTRATOASOCTITPreconditions(request);

        com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest step1Request = new com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest();
        step1Request.setTGSELECCONTRATOASOCTITptpSolicitudInstance(tGSELECCONTRATOASOCTITptpSolicitud);
        step1Request.setTGSELECCONTRATOASOCTITptNumContrato(tGSELECCONTRATOASOCTITptNumContrato);
        step1Request.setTGSELECCONTRATOASOCTITptCodLegalProducto(tGSELECCONTRATOASOCTITptCodLegalProducto);
        step1Request.setTGSELECCONTRATOASOCTITptCodLegalPlan(tGSELECCONTRATOASOCTITptCodLegalPlan);
        step1Request.setTGSELECCONTRATOASOCTITptNumFamilia(tGSELECCONTRATOASOCTITptNumFamilia);
        globalServicesSrv.tGSELECCONTRATOASOCTITImplementation(step1Request);
        return response;
    }

    /*
     * Checks service TGSELECCONTRATOASOCTIT preconditions individually
     * @param request Service request viewmodel
     * @returns Service response viewmodel with the execution results
     */
    public ServiceResponse tGSELECCONTRATOASOCTITCheckPreconditions(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest request) {
        ServiceResponse response = new ServiceResponse();
        request.setTGSELECCONTRATOASOCTITptpSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getTGSELECCONTRATOASOCTITptpSolicitud()));
        try {
            if("IGl_1433934757888116Pre_1".equals(request.getPreconditionId()))
                checkIGl1433934757888116Pre1(request);
        } catch (Exception e) {
            response.setException(e);
        }
        return response;
    }

    private void tGSELECCONTRATOASOCTITPreconditions(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest request) 
            throws ModelException {
        checkIGl1433934757888116Pre1(request);
    }

    private void checkIGl1433934757888116Pre1 (
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest request) 
            throws ModelException {
        // pt_p_Solicitud.drvYaTieneTitular = true

        Solicitud tGSELECCONTRATOASOCTITptpSolicitud = request.getTGSELECCONTRATOASOCTITptpSolicitudInstance();
        boolean preconditionHolds = tGSELECCONTRATOASOCTITptpSolicitud.getSolicituddrvYaTieneTitular().equals(true);
        if (!preconditionHolds) throw new PreconditionException("Debe especificar primero el titular");
    }

    /*
     * Implements global service TGADDUSUARIODECONT
     * @param request Service request viewmodel
     * @return Service response viewmodel with the execution results
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public ServiceResponse tGADDUSUARIODECONTImplementation(
            com.keralty.aepersonas.viewmodel.globalservices.siu.TGADDUSUARIODECONTRequest request) throws ModelException, SystemException {
        ServiceResponse response = new ServiceResponse();
        TipoIdentificacion tGADDUSUARIODECONTptpagrTipoIdentificacion = request.getTGADDUSUARIODECONTptpagrTipoIdentificacionInstance();
        Departamento tGADDUSUARIODECONTptpagrDepartamentoNacimiento = request.getTGADDUSUARIODECONTptpagrDepartamentoNacimientoInstance();
        Municipio tGADDUSUARIODECONTptpagrMunicipioNacimiento = request.getTGADDUSUARIODECONTptpagrMunicipioNacimientoInstance();
        EstadoCivil tGADDUSUARIODECONTptpagrEstadoCivil = request.getTGADDUSUARIODECONTptpagrEstadoCivilInstance();
        String tGADDUSUARIODECONTptpatrNumIdentificacion = request.getTGADDUSUARIODECONTptpatrNumIdentificacion();
        String tGADDUSUARIODECONTptpatrPrimerNombre = request.getTGADDUSUARIODECONTptpatrPrimerNombre();
        String tGADDUSUARIODECONTptpatrSegundoNombre = request.getTGADDUSUARIODECONTptpatrSegundoNombre();
        String tGADDUSUARIODECONTptpatrPrimerApellido = request.getTGADDUSUARIODECONTptpatrPrimerApellido();
        String tGADDUSUARIODECONTptpatrSegundoApellido = request.getTGADDUSUARIODECONTptpatrSegundoApellido();
        Date tGADDUSUARIODECONTptpatrFechaNacimiento = request.getTGADDUSUARIODECONTptpatrFechaNacimiento();
        String tGADDUSUARIODECONTptpatrGenero = request.getTGADDUSUARIODECONTptpatrGenero();
        Boolean tGADDUSUARIODECONTptpatrIndicadorExtranjero = request.getTGADDUSUARIODECONTptpatrIndicadorExtranjero();
        String tGADDUSUARIODECONTptpatrTelefonoFijo = request.getTGADDUSUARIODECONTptpatrTelefonoFijo();
        String tGADDUSUARIODECONTptpatrTelefonoCelular = request.getTGADDUSUARIODECONTptpatrTelefonoCelular();
        String tGADDUSUARIODECONTptpatrCorreoElectronico = request.getTGADDUSUARIODECONTptpatrCorreoElectronico();
        Departamento tGADDUSUARIODECONTptpagrDepartamento = request.getTGADDUSUARIODECONTptpagrDepartamentoInstance();
        Municipio tGADDUSUARIODECONTptpagrMunicipio = request.getTGADDUSUARIODECONTptpagrMunicipioInstance();
        String tGADDUSUARIODECONTptpatrDireccionCompleta = request.getTGADDUSUARIODECONTptpatrDireccionCompleta();
        Boolean tGADDUSUARIODECONTptpatrRural = request.getTGADDUSUARIODECONTptpatrRural();
        Long tGADDUSUARIODECONTptpCodigo = request.getTGADDUSUARIODECONTptpCodigo();
        Boolean tGADDUSUARIODECONTptpTieneEPSSanitas = request.getTGADDUSUARIODECONTptpTieneEPSSanitas();
        String tGADDUSUARIODECONTptpRechazadoAfiliacion = request.getTGADDUSUARIODECONTptpRechazadoAfiliacion();
        Pais tGADDUSUARIODECONTptpagrPais = request.getTGADDUSUARIODECONTptpagrPaisInstance();
        Solicitud tGADDUSUARIODECONTptpagrSolicitud = request.getTGADDUSUARIODECONTptpagrSolicitudInstance();
        Parentesco tGADDUSUARIODECONTptpagrParentesco = request.getTGADDUSUARIODECONTptpagrParentescoInstance();
        Boolean tGADDUSUARIODECONTptpatrBebeGestante = request.getTGADDUSUARIODECONTptpatrBebeGestante();
        String tGADDUSUARIODECONTptpatrcodigoBancoRep = request.getTGADDUSUARIODECONTptpatrcodigoBancoRep();
        Boolean tGADDUSUARIODECONTptptParaContratante = request.getTGADDUSUARIODECONTptptParaContratante();

        request.checkArguments();

        /* Action 1: IF (EXIST (Usuario) WHERE (Usuario.Solicitud = ptpagrSolicitud AND Usuario.TipoIdentificacion = ptpagrTipoIdentificacion AND Usuario.NumIdentificacion = ptpatrNumIdentificacion) = false) */
        boolean ifCondition1 = globalServicesRepository.assocOperator095(tGADDUSUARIODECONTptpagrSolicitud, tGADDUSUARIODECONTptpagrTipoIdentificacion, tGADDUSUARIODECONTptpatrNumIdentificacion).equals(false);
        if (ifCondition1) {
            /* Action 10: IF (ptptParaContratante = true) */
            boolean ifCondition10 = tGADDUSUARIODECONTptptParaContratante.equals(true);
            if (ifCondition10) {
                /* Action 100: IF (ptpagrSolicitud.Contratante.TipoIdentificacion <> ptpagrTipoIdentificacion OR ptpagrSolicitud.Contratante.NumIdentificacion <> ptpatrNumIdentificacion) */
                boolean ifCondition100 = !(tGADDUSUARIODECONTptpagrSolicitud.getContratante().getTipoIdentificacion().equalsObject(tGADDUSUARIODECONTptpagrTipoIdentificacion)) || !(tGADDUSUARIODECONTptpagrSolicitud.getContratante().getContratanteNumIdentificacion()).equals(tGADDUSUARIODECONTptpatrNumIdentificacion);
                if (ifCondition100) {
                    com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIODECONTASOCRequest step1000Request = new com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIODECONTASOCRequest();
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance(tGADDUSUARIODECONTptpagrTipoIdentificacion);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpagrDepartamentoNacimientoInstance(tGADDUSUARIODECONTptpagrDepartamentoNacimiento);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpagrMunicipioNacimientoInstance(tGADDUSUARIODECONTptpagrMunicipioNacimiento);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpagrEstadoCivilInstance(tGADDUSUARIODECONTptpagrEstadoCivil);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrNumIdentificacion(tGADDUSUARIODECONTptpatrNumIdentificacion);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrPrimerNombre(tGADDUSUARIODECONTptpatrPrimerNombre);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrSegundoNombre(tGADDUSUARIODECONTptpatrSegundoNombre);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrPrimerApellido(tGADDUSUARIODECONTptpatrPrimerApellido);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrSegundoApellido(tGADDUSUARIODECONTptpatrSegundoApellido);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrFechaNacimiento(tGADDUSUARIODECONTptpatrFechaNacimiento);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrGenero(tGADDUSUARIODECONTptpatrGenero);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero(tGADDUSUARIODECONTptpatrIndicadorExtranjero);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrTelefonoFijo(tGADDUSUARIODECONTptpatrTelefonoFijo);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrTelefonoCelular(tGADDUSUARIODECONTptpatrTelefonoCelular);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrCorreoElectronico(tGADDUSUARIODECONTptpatrCorreoElectronico);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpagrDepartamentoInstance(tGADDUSUARIODECONTptpagrDepartamento);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpagrMunicipioInstance(tGADDUSUARIODECONTptpagrMunicipio);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrDireccionCompleta(tGADDUSUARIODECONTptpatrDireccionCompleta);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrRural(tGADDUSUARIODECONTptpatrRural);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpCodigo(tGADDUSUARIODECONTptpCodigo);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpTieneEPSSanitas(tGADDUSUARIODECONTptpTieneEPSSanitas);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpRechazadoAfiliacion(tGADDUSUARIODECONTptpRechazadoAfiliacion);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpagrPaisInstance(tGADDUSUARIODECONTptpagrPais);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpagrSolicitudInstance(tGADDUSUARIODECONTptpagrSolicitud);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpagrParentescoInstance(tGADDUSUARIODECONTptpagrParentesco);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrBebeGestante(tGADDUSUARIODECONTptpatrBebeGestante);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptpatrcodigoBancoRep(tGADDUSUARIODECONTptpatrcodigoBancoRep);
                    step1000Request.setPersonaTADDUSUARIODECONTASOCptParaContratante(tGADDUSUARIODECONTptptParaContratante);
                    personaSrv.tADDUSUARIODECONTASOCImplementation(step1000Request);
                }
            } else {
                /* Action 101: IF (ptpagrSolicitud.Titular.TipoIdentificacion <> ptpagrTipoIdentificacion OR ptpagrSolicitud.Titular.NumIdentificacion <> ptpatrNumIdentificacion) */
                boolean ifCondition101 = !(tGADDUSUARIODECONTptpagrSolicitud.getTitular().getTipoIdentificacion().equalsObject(tGADDUSUARIODECONTptpagrTipoIdentificacion)) || !(tGADDUSUARIODECONTptpagrSolicitud.getTitular().getTitularNumIdentificacion()).equals(tGADDUSUARIODECONTptpatrNumIdentificacion);
                if (ifCondition101) {
                    com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIODECONTASOCRequest step1010Request = new com.keralty.aepersonas.viewmodel.persona.siu.TADDUSUARIODECONTASOCRequest();
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance(tGADDUSUARIODECONTptpagrTipoIdentificacion);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpagrDepartamentoNacimientoInstance(tGADDUSUARIODECONTptpagrDepartamentoNacimiento);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpagrMunicipioNacimientoInstance(tGADDUSUARIODECONTptpagrMunicipioNacimiento);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpagrEstadoCivilInstance(tGADDUSUARIODECONTptpagrEstadoCivil);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrNumIdentificacion(tGADDUSUARIODECONTptpatrNumIdentificacion);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrPrimerNombre(tGADDUSUARIODECONTptpatrPrimerNombre);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrSegundoNombre(tGADDUSUARIODECONTptpatrSegundoNombre);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrPrimerApellido(tGADDUSUARIODECONTptpatrPrimerApellido);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrSegundoApellido(tGADDUSUARIODECONTptpatrSegundoApellido);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrFechaNacimiento(tGADDUSUARIODECONTptpatrFechaNacimiento);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrGenero(tGADDUSUARIODECONTptpatrGenero);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero(tGADDUSUARIODECONTptpatrIndicadorExtranjero);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrTelefonoFijo(tGADDUSUARIODECONTptpatrTelefonoFijo);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrTelefonoCelular(tGADDUSUARIODECONTptpatrTelefonoCelular);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrCorreoElectronico(tGADDUSUARIODECONTptpatrCorreoElectronico);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpagrDepartamentoInstance(tGADDUSUARIODECONTptpagrDepartamento);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpagrMunicipioInstance(tGADDUSUARIODECONTptpagrMunicipio);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrDireccionCompleta(tGADDUSUARIODECONTptpatrDireccionCompleta);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrRural(tGADDUSUARIODECONTptpatrRural);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpCodigo(tGADDUSUARIODECONTptpCodigo);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpTieneEPSSanitas(tGADDUSUARIODECONTptpTieneEPSSanitas);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpRechazadoAfiliacion(tGADDUSUARIODECONTptpRechazadoAfiliacion);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpagrPaisInstance(tGADDUSUARIODECONTptpagrPais);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpagrSolicitudInstance(tGADDUSUARIODECONTptpagrSolicitud);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpagrParentescoInstance(tGADDUSUARIODECONTptpagrParentesco);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrBebeGestante(tGADDUSUARIODECONTptpatrBebeGestante);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptpatrcodigoBancoRep(tGADDUSUARIODECONTptpatrcodigoBancoRep);
                    step1010Request.setPersonaTADDUSUARIODECONTASOCptParaContratante(tGADDUSUARIODECONTptptParaContratante);
                    personaSrv.tADDUSUARIODECONTASOCImplementation(step1010Request);
                }
            }
        }
        return response;
    }
}
