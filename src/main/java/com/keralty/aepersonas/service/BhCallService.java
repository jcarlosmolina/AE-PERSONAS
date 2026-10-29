package com.keralty.aepersonas.service;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.integraciones.contract.ConsultarContratoDePersonaRequest;
import com.keralty.integraciones.contract.ConsultarContratoRequest;
import com.keralty.integraciones.contract.ConsultarContratoResponse;
import com.keralty.integraciones.coverage.ConsultarBeneficiarioRequest;
import com.keralty.integraciones.patient.ConsultarCuestionarioMedicoResponse;
import com.keralty.integraciones.patient.ConsultarPersonaRequest;
import com.keralty.integraciones.patient.ConsultarPersonaResponse;
import com.keralty.integraciones.patient.ConsultarPreexistenciasResponse;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api/bhcall")
@RegisterRestClient(configKey="ae-apigateway")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.aepersonas.utils.TokenUtilities.getToken4aeapigateway}")
public interface BhCallService {

    @POST
    @Path("/consultarContrato")
    ConsultarContratoResponse consultaContrato(ConsultarContratoRequest request);
    
    @POST
    @Path("/consultarPersona")
    ConsultarPersonaResponse consultarPersona(ConsultarPersonaRequest request);

    @POST
    @Path("/consultarContratosAsociadosDePersona")
    ConsultarContratoResponse consultarContratosAsociadosDePersona(ConsultarContratoDePersonaRequest request);
    
    @POST
    @Path("/consultarCausaExclusionBeneficiario")
    String consultarCausaExclusionBeneficiario(ConsultarBeneficiarioRequest request);

    @POST
    @Path("/consultarCuestionarioMedico")
    ConsultarCuestionarioMedicoResponse consultarCuestionarioMedico(ConsultarPersonaRequest request);
    
    @POST
    @Path("/consultarPreexistencias")
    ConsultarPreexistenciasResponse consultarPreexistencias(ConsultarPersonaRequest request);
    
}
