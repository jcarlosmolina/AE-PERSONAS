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
import com.keralty.aepersonas.utils.Utilities;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.sql.Date;

import com.keralty.aepersonas.persistence.EstadoPersona;
import com.keralty.aepersonas.viewmodel.globalservices.siu.TGADDUSUARIODECONTRequest;
import com.keralty.integraciones.contract.ConsultarContratoDePersonaRequest;
import com.keralty.integraciones.contract.ConsultarContratoRequest;
import com.keralty.integraciones.contract.ConsultarContratoResponse;
import com.keralty.integraciones.contract.cover.response.CoverFamilyResponse;
import com.keralty.integraciones.contract.cover.response.Patient;
import com.keralty.integraciones.patient.ConsultarPersonaRequest;
import com.keralty.integraciones.patient.ConsultarPersonaResponse;
import org.eclipse.microprofile.rest.client.inject.RestClient;

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

    @RestClient
    BhCallService bhCallService;

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

        ConsultarContratoRequest reqConsultarContrato = new ConsultarContratoRequest();
		// Recuperamos los datos del contrato a partir de la info recibida
        reqConsultarContrato.setCodigoLegalProducto(tGSELECCONTRATOASOCptCodLegalProducto);
        reqConsultarContrato.setCodigoLegalPlan(tGSELECCONTRATOASOCptCodLegalPlan);
        reqConsultarContrato.setNumContrato(tGSELECCONTRATOASOCptNumContrato);
        reqConsultarContrato.setNumeroFamilia(tGSELECCONTRATOASOCptNumFamilia);
        reqConsultarContrato.setNumSolicitud(tGSELECCONTRATOASOCpSolicitud.getSolicitudNumRadicado().toString());
        ConsultarContratoResponse responseConsultarContrato = bhCallService.consultaContrato(reqConsultarContrato );
        
        if (!responseConsultarContrato.isExito()) {
        	response.setResultCode("900");
        	response.setResultDescription(responseConsultarContrato.getTextoError());
        	return response;
        }
        
        if (responseConsultarContrato.getCoverResponse() == null || responseConsultarContrato.getCoverResponse().getCoverFamilyResponse() == null ||
        		responseConsultarContrato.getCoverResponse().getCoverFamilyResponse().isEmpty()) {
        	response.setResultCode("901");
        	response.setResultDescription("Contrato no encontrado");
        	return response;
        }

        // Nos quedamos con el contrato, solo debe haber uno
		CoverFamilyResponse contrato = responseConsultarContrato.getCoverResponse().getCoverFamilyResponse().get(0);

		String tipoIdentContratante = tGSELECCONTRATOASOCpSolicitud.getContratante().getTipoIdentificacion().getTipoIdentificacionNombreCorto();
    	String numIdentContratante = tGSELECCONTRATOASOCpSolicitud.getContratante().getContratanteNumIdentificacion();


        // Para todos los beneficiarios del contrato que no sea el contratante, lo añadimos a la solicitud.
    	for (Patient bene : contrato.getContract().getSubject().getPatient() ) {
    	
    		String tipoIdentBene = ConsultarContratoResponse.getValueIdentifierPorClave(bene.getIdentifier(), "TIPO_IDENTIFICACION");
    		String numIdentBene = ConsultarContratoResponse.getValueIdentifierPorClave(bene.getIdentifier(), "NUMERO_IDENTIFICACION");
    		
    		if (tipoIdentBene.equalsIgnoreCase(tipoIdentContratante) && numIdentBene.equalsIgnoreCase(numIdentContratante)) {
    			continue;
    		}
    		
    		String codBancoRep = bene.getColCentralBankCod();
    		
			// Recuperamos a la persona desde el CORE
    		ConsultarPersonaRequest reqConsultarPersona = new ConsultarPersonaRequest();
    		reqConsultarPersona.setTipoIdentificacion(tipoIdentBene);
    		reqConsultarPersona.setNumeroIdentificacion(numIdentBene);
    		reqConsultarPersona.setNumSolicitud(tGSELECCONTRATOASOCpSolicitud.getSolicitudNumRadicado().toString());
    		ConsultarPersonaResponse responseConsultarPersona = bhCallService.consultarPersona(reqConsultarPersona);
    		
    		if (!responseConsultarPersona.isExito()) {
            	response.setResultCode("920");
            	response.setResultDescription(responseConsultarContrato.getTextoError());
            	return response;
    		}
    		
			EstadoPersona estadoPersona = null;
			// Cargar estado de la persona
			if (responseConsultarPersona.getEstadoPersona() != null && !responseConsultarPersona.getEstadoPersona().isEmpty()) {
				estadoPersona = userFunctionsSrv.fugetEstadoPersonaFun(Long.valueOf(responseConsultarPersona.getEstadoPersona()));
			}

			// Si no está prohibido para beneficiarios lo añadimos
			if (estadoPersona != null && !estadoPersona.isNull() && estadoPersona.getEstadoPersonaProhibidoBeneficiarios()) {
				continue;
			}
				
			String codLegalDepNac = responseConsultarPersona.getDepartamentoNacimiento();
			String codLegalMunNac = responseConsultarPersona.getMunicipioNacimiento();
			Departamento depNac = null;
			Municipio munNac = null;
			// Departamento y Municipio de nacimiento
			if (codLegalDepNac != null) {
				depNac =  userFunctionsSrv.fugetDepartamentoCLFun(codLegalDepNac);
			}
			if (codLegalMunNac != null) {
				munNac =  userFunctionsSrv.fugetMunicipioCLFun(codLegalMunNac);
			}

			EstadoCivil estCivil = null;
			Long estCivilNum = responseConsultarPersona.getEstadoCivil();
			if (estCivilNum != null) {
				estCivil = estadoCivilSrv.getById(estCivilNum);
			}
			TipoIdentificacion tipoIdent = userFunctionsSrv.fugetTipoIdentificacionFun(tipoIdentBene);

			// Datos de residencia
			Departamento depRes = null;
			Municipio munRes = null;
			Pais paisRes = null;
			String dirCompleta = null;
			if (responseConsultarPersona.tieneDireccionDeUso("RESIDENCIAL")) {
				munRes =  userFunctionsSrv.fugetMunicipioCLFun(responseConsultarPersona.getDatoDeDireccionDeUso("RESIDENCIAL", "MUN") );
				depRes =  userFunctionsSrv.fugetDepartamentoCLFun(responseConsultarPersona.getDatoDeDireccionDeUso("RESIDENCIAL", "DEP") );
				paisRes =  userFunctionsSrv.fugetPaisFun(responseConsultarPersona.getDatoDeDireccionDeUso("RESIDENCIAL", "PAIS") );
				dirCompleta = responseConsultarPersona.getDatoDeDireccionDeUso("RESIDENCIAL", "DIR");
			}

			Parentesco parentesco = null;
			if (bene.getRelationShip() != null && bene.getRelationShip().getCode() != null) {
				parentesco  = parentescoSrv.getById(bene.getRelationShip().getCode());
			}

			// Tiene EPS Sanitas
			Boolean tieneEPSSanitas = false;
			ConsultarContratoDePersonaRequest reqContPersona = new ConsultarContratoDePersonaRequest();
			reqContPersona.setTipoIdentificacion(tipoIdentBene);
			reqContPersona.setNumeroIdentificacion(numIdentBene);
			reqContPersona.setNumSolicitud(tGSELECCONTRATOASOCpSolicitud.getSolicitudNumRadicado().toString());
			ConsultarContratoResponse contPersonaResponse = bhCallService.consultarContratosAsociadosDePersona(reqContPersona);
			if (contPersonaResponse.isExito()) {
				tieneEPSSanitas = contPersonaResponse.isTieneEPSSanitas();
			}

			TGADDUSUARIODECONTRequest reqAddBene = new TGADDUSUARIODECONTRequest();
			reqAddBene.setTGADDUSUARIODECONTptpagrDepartamentoInstance(depRes);
			reqAddBene.setTGADDUSUARIODECONTptpagrDepartamentoNacimientoInstance(depNac);
			reqAddBene.setTGADDUSUARIODECONTptpagrEstadoCivilInstance(estCivil);
			reqAddBene.setTGADDUSUARIODECONTptpagrMunicipioInstance(munRes);
			reqAddBene.setTGADDUSUARIODECONTptpagrMunicipioNacimientoInstance(munNac);
			reqAddBene.setTGADDUSUARIODECONTptpagrPaisInstance(paisRes);
			reqAddBene.setTGADDUSUARIODECONTptpagrParentescoInstance(parentesco);
			reqAddBene.setTGADDUSUARIODECONTptpagrSolicitudInstance(tGSELECCONTRATOASOCpSolicitud);
			reqAddBene.setTGADDUSUARIODECONTptpagrTipoIdentificacionInstance(tipoIdent);
			// PTE Asignar el dato cuando este disponible 
			reqAddBene.setTGADDUSUARIODECONTptpatrBebeGestante(false);
			reqAddBene.setTGADDUSUARIODECONTptpatrcodigoBancoRep(codBancoRep);
			reqAddBene.setTGADDUSUARIODECONTptpatrCorreoElectronico(responseConsultarPersona.getCorreoElectronico());
			reqAddBene.setTGADDUSUARIODECONTptpatrDireccionCompleta(dirCompleta);
			reqAddBene.setTGADDUSUARIODECONTptpatrFechaNacimiento(responseConsultarPersona.getFechaNacimiento());
			reqAddBene.setTGADDUSUARIODECONTptpatrGenero(responseConsultarPersona.getGenero());
			reqAddBene.setTGADDUSUARIODECONTptpatrIndicadorExtranjero(responseConsultarPersona.getBasicData().isForeign());
			reqAddBene.setTGADDUSUARIODECONTptpatrNumIdentificacion(numIdentBene);
			reqAddBene.setTGADDUSUARIODECONTptpatrPrimerApellido(responseConsultarPersona.getPrimerApellido());
			reqAddBene.setTGADDUSUARIODECONTptpatrPrimerNombre(responseConsultarPersona.getPrimerNombre());
			reqAddBene.setTGADDUSUARIODECONTptpatrRural(false);
			reqAddBene.setTGADDUSUARIODECONTptpatrSegundoApellido(responseConsultarPersona.getSegundoApellido());
			reqAddBene.setTGADDUSUARIODECONTptpatrSegundoNombre(responseConsultarPersona.getSegundoNombre());
			reqAddBene.setTGADDUSUARIODECONTptpatrTelefonoCelular(responseConsultarPersona.getTelefonoCelular());
			reqAddBene.setTGADDUSUARIODECONTptpatrTelefonoFijo(responseConsultarPersona.getTelefonoFijoResidencia());
			reqAddBene.setTGADDUSUARIODECONTptpCodigo(responseConsultarPersona.getCodigo());
			reqAddBene.setTGADDUSUARIODECONTptpRechazadoAfiliacion(responseConsultarPersona.getRechazadoAfiliacion());
			reqAddBene.setTGADDUSUARIODECONTptpTieneEPSSanitas(tieneEPSSanitas);
			reqAddBene.setTGADDUSUARIODECONTptptParaContratante(true);
			
			tGADDUSUARIODECONTImplementation(reqAddBene );

    	}
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

        ConsultarContratoRequest reqConsultarContrato = new ConsultarContratoRequest();
		// Recuperamos los datos del contrato a partir de la info recibida
        reqConsultarContrato.setCodigoLegalProducto(tGSELECCONTRATOASOCTITptCodLegalProducto);
        reqConsultarContrato.setCodigoLegalPlan(tGSELECCONTRATOASOCTITptCodLegalPlan);
        reqConsultarContrato.setNumContrato(tGSELECCONTRATOASOCTITptNumContrato);
        reqConsultarContrato.setNumeroFamilia(tGSELECCONTRATOASOCTITptNumFamilia);
        reqConsultarContrato.setNumSolicitud(tGSELECCONTRATOASOCTITptpSolicitud.getSolicitudNumRadicado().toString());
        ConsultarContratoResponse responseConsultarContrato = bhCallService.consultaContrato(reqConsultarContrato );
        
        if (!responseConsultarContrato.isExito()) {
        	response.setResultCode("900");
        	response.setResultDescription(responseConsultarContrato.getTextoError());
        	return response;
        }
        
        if (responseConsultarContrato.getCoverResponse() == null || responseConsultarContrato.getCoverResponse().getCoverFamilyResponse() == null ||
        		responseConsultarContrato.getCoverResponse().getCoverFamilyResponse().isEmpty()) {
        	response.setResultCode("901");
        	response.setResultDescription("Contrato no encontrado");
        	return response;
        }
        // Nos quedamos con el contrato, solo debe haber uno
		CoverFamilyResponse contrato = responseConsultarContrato.getCoverResponse().getCoverFamilyResponse().get(0);

		String tipoIdentTitular = tGSELECCONTRATOASOCTITptpSolicitud.getTitular().getTipoIdentificacion().getTipoIdentificacionNombreCorto();
    	String numIdentTitular = tGSELECCONTRATOASOCTITptpSolicitud.getTitular().getTitularNumIdentificacion();

        // Para todos los beneficiarios del contrato que no sea el contratante, lo añadimos a la solicitud.
    	for (Patient bene : contrato.getContract().getSubject().getPatient() ) {
    	
    		String tipoIdentBene = ConsultarContratoResponse.getValueIdentifierPorClave(bene.getIdentifier(), "TIPO_IDENTIFICACION");
    		String numIdentBene = ConsultarContratoResponse.getValueIdentifierPorClave(bene.getIdentifier(), "NUMERO_IDENTIFICACION");
    		
    		if (tipoIdentBene.equalsIgnoreCase(tipoIdentTitular) && numIdentBene.equalsIgnoreCase(numIdentTitular)) {
    			continue;
    		}

    		String codBancoRep = bene.getColCentralBankCod();

			// Recuperamos a la persona desde el CORE
    		ConsultarPersonaRequest reqConsultarPersona = new ConsultarPersonaRequest();
    		reqConsultarPersona.setTipoIdentificacion(tipoIdentBene);
    		reqConsultarPersona.setNumeroIdentificacion(numIdentBene);
    		reqConsultarPersona.setNumSolicitud(tGSELECCONTRATOASOCTITptpSolicitud.getSolicitudNumRadicado().toString());
    		ConsultarPersonaResponse responseConsultarPersona = bhCallService.consultarPersona(reqConsultarPersona);
    		
    		if (!responseConsultarPersona.isExito()) {
            	response.setResultCode("920");
            	response.setResultDescription(responseConsultarContrato.getTextoError());
            	return response;
    		}
    		
			EstadoPersona estadoPersona = null;
			// Cargar estado de la persona
			if (responseConsultarPersona.getEstadoPersona() != null && !responseConsultarPersona.getEstadoPersona().isEmpty()) {
				estadoPersona = userFunctionsSrv.fugetEstadoPersonaFun(Long.valueOf(responseConsultarPersona.getEstadoPersona()));
			}

			// Si no está prohibido para beneficiarios lo añadimos
			if (estadoPersona != null && !estadoPersona.isNull() && estadoPersona.getEstadoPersonaProhibidoBeneficiarios()) {
				continue;
			}

			String codLegalDepNac = responseConsultarPersona.getDepartamentoNacimiento();
			String codLegalMunNac = responseConsultarPersona.getMunicipioNacimiento();
			Departamento depNac = null;
			Municipio munNac = null;
			// Departamento y Municipio de nacimiento
			if (codLegalDepNac != null) {
				depNac =  userFunctionsSrv.fugetDepartamentoCLFun(codLegalDepNac);
			}
			if (codLegalMunNac != null) {
				munNac =  userFunctionsSrv.fugetMunicipioCLFun(codLegalMunNac);
			}
        			
			EstadoCivil estCivil = null;
			Long estCivilNum = responseConsultarPersona.getEstadoCivil();
			if (estCivilNum != null) {
				estCivil = estadoCivilSrv.getById(estCivilNum);
			}
			TipoIdentificacion tipoIdent = userFunctionsSrv.fugetTipoIdentificacionFun(tipoIdentBene);

			// Datos de residencia
			Departamento depRes = null;
			Municipio munRes = null;
			Pais paisRes = null;
			String dirCompleta = null;
			if (responseConsultarPersona.tieneDireccionDeUso("RESIDENCIAL")) {
				munRes =  userFunctionsSrv.fugetMunicipioCLFun(responseConsultarPersona.getDatoDeDireccionDeUso("RESIDENCIAL", "MUN") );
				depRes =  userFunctionsSrv.fugetDepartamentoCLFun(responseConsultarPersona.getDatoDeDireccionDeUso("RESIDENCIAL", "DEP") );
				paisRes =  userFunctionsSrv.fugetPaisFun(responseConsultarPersona.getDatoDeDireccionDeUso("RESIDENCIAL", "PAIS") );
				dirCompleta = responseConsultarPersona.getDatoDeDireccionDeUso("RESIDENCIAL", "DIR");
			}


			Parentesco parentesco = null;
			if (bene.getRelationShip() != null && bene.getRelationShip().getCode() != null) {
				parentesco  = parentescoSrv.getById(bene.getRelationShip().getCode());
			}
			
			// Tiene EPS Sanitas
			Boolean tieneEPSSanitas = false;
			ConsultarContratoDePersonaRequest reqContPersona = new ConsultarContratoDePersonaRequest();
			reqContPersona.setTipoIdentificacion(tipoIdentBene);
			reqContPersona.setNumeroIdentificacion(numIdentBene);
			reqContPersona.setNumSolicitud(tGSELECCONTRATOASOCTITptpSolicitud.getSolicitudNumRadicado().toString());
			ConsultarContratoResponse contPersonaResponse = bhCallService.consultarContratosAsociadosDePersona(reqContPersona);
			if (contPersonaResponse.isExito()) {
				tieneEPSSanitas = contPersonaResponse.isTieneEPSSanitas();
			}
			
			TGADDUSUARIODECONTRequest reqAddBene = new TGADDUSUARIODECONTRequest();
			reqAddBene.setTGADDUSUARIODECONTptpagrDepartamentoInstance(depRes);
			reqAddBene.setTGADDUSUARIODECONTptpagrDepartamentoNacimientoInstance(depNac);
			reqAddBene.setTGADDUSUARIODECONTptpagrEstadoCivilInstance(estCivil);
			reqAddBene.setTGADDUSUARIODECONTptpagrMunicipioInstance(munRes);
			reqAddBene.setTGADDUSUARIODECONTptpagrMunicipioNacimientoInstance(munNac);
			reqAddBene.setTGADDUSUARIODECONTptpagrPaisInstance(paisRes);
			reqAddBene.setTGADDUSUARIODECONTptpagrParentescoInstance(parentesco);
			reqAddBene.setTGADDUSUARIODECONTptpagrSolicitudInstance(tGSELECCONTRATOASOCTITptpSolicitud);
			reqAddBene.setTGADDUSUARIODECONTptpagrTipoIdentificacionInstance(tipoIdent);
			// PTE Asignar el dato cuando esté disponible 
			reqAddBene.setTGADDUSUARIODECONTptpatrBebeGestante(false);
			reqAddBene.setTGADDUSUARIODECONTptpatrcodigoBancoRep(codBancoRep);
			reqAddBene.setTGADDUSUARIODECONTptpatrCorreoElectronico(responseConsultarPersona.getCorreoElectronico());
			reqAddBene.setTGADDUSUARIODECONTptpatrDireccionCompleta(dirCompleta);
			reqAddBene.setTGADDUSUARIODECONTptpatrFechaNacimiento(responseConsultarPersona.getFechaNacimiento());
			reqAddBene.setTGADDUSUARIODECONTptpatrGenero(responseConsultarPersona.getGenero());
			reqAddBene.setTGADDUSUARIODECONTptpatrIndicadorExtranjero(responseConsultarPersona.getBasicData().isForeign());
			reqAddBene.setTGADDUSUARIODECONTptpatrNumIdentificacion(numIdentBene);
			reqAddBene.setTGADDUSUARIODECONTptpatrPrimerApellido(responseConsultarPersona.getPrimerApellido());
			reqAddBene.setTGADDUSUARIODECONTptpatrPrimerNombre(responseConsultarPersona.getPrimerNombre());
			reqAddBene.setTGADDUSUARIODECONTptpatrRural(false);
			reqAddBene.setTGADDUSUARIODECONTptpatrSegundoApellido(responseConsultarPersona.getSegundoApellido());
			reqAddBene.setTGADDUSUARIODECONTptpatrSegundoNombre(responseConsultarPersona.getSegundoNombre());
			reqAddBene.setTGADDUSUARIODECONTptpatrTelefonoCelular(responseConsultarPersona.getTelefonoCelular());
			reqAddBene.setTGADDUSUARIODECONTptpatrTelefonoFijo(responseConsultarPersona.getTelefonoFijoResidencia());
			reqAddBene.setTGADDUSUARIODECONTptpCodigo(responseConsultarPersona.getCodigo());
			reqAddBene.setTGADDUSUARIODECONTptpRechazadoAfiliacion(responseConsultarPersona.getRechazadoAfiliacion());
			reqAddBene.setTGADDUSUARIODECONTptpTieneEPSSanitas(tieneEPSSanitas);
			reqAddBene.setTGADDUSUARIODECONTptptParaContratante(false);
			
			tGADDUSUARIODECONTImplementation(reqAddBene );
        }
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
                boolean ifCondition100 = !Utilities.isEqual(tGADDUSUARIODECONTptpagrSolicitud.getContratante().getTipoIdentificacion(), tGADDUSUARIODECONTptpagrTipoIdentificacion) || !(tGADDUSUARIODECONTptpagrSolicitud.getContratante().getContratanteNumIdentificacion()).equals(tGADDUSUARIODECONTptpatrNumIdentificacion);
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
                boolean ifCondition101 = !Utilities.isEqual(tGADDUSUARIODECONTptpagrSolicitud.getTitular().getTipoIdentificacion(), tGADDUSUARIODECONTptpagrTipoIdentificacion) || !(tGADDUSUARIODECONTptpagrSolicitud.getTitular().getTitularNumIdentificacion()).equals(tGADDUSUARIODECONTptpatrNumIdentificacion);
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
