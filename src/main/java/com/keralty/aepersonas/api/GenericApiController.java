package com.keralty.aepersonas.api;

import com.keralty.aepersonas.service.GenericService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;

@Path("/api/GenericApiController")
@RequestScoped
public class GenericApiController {
	
    GenericService genericService;

    @Inject
	public GenericApiController(GenericService genericService) {
        this.genericService = genericService;
    }

    @Path("/isPersonaCJpaRepositoryAvailable")
    public boolean isPersonaCJpaRepositoryAvailable() {
        return genericService.getPersonaCJpaRepository() != null;
    }
    @Path("/isDireccionCJpaRepositoryAvailable")
    public boolean isDireccionCJpaRepositoryAvailable() {
        return genericService.getDireccionCJpaRepository() != null;
    }
    @Path("/isContratoCJpaRepositoryAvailable")
    public boolean isContratoCJpaRepositoryAvailable() {
        return genericService.getContratoCJpaRepository() != null;
    }
    @Path("/isBeneficiarioCJpaRepositoryAvailable")
    public boolean isBeneficiarioCJpaRepositoryAvailable() {
        return genericService.getBeneficiarioCJpaRepository() != null;
    }
    @Path("/isNovedadJpaRepositoryAvailable")
    public boolean isNovedadJpaRepositoryAvailable() {
        return genericService.getNovedadJpaRepository() != null;
    }
    @Path("/isSolicitudNovedadJpaRepositoryAvailable")
    public boolean isSolicitudNovedadJpaRepositoryAvailable() {
        return genericService.getSolicitudNovedadJpaRepository() != null;
    }
    @Path("/isFamiliaNovedadJpaRepositoryAvailable")
    public boolean isFamiliaNovedadJpaRepositoryAvailable() {
        return genericService.getFamiliaNovedadJpaRepository() != null;
    }
    @Path("/isUsuarioNovedadJpaRepositoryAvailable")
    public boolean isUsuarioNovedadJpaRepositoryAvailable() {
        return genericService.getUsuarioNovedadJpaRepository() != null;
    }
    @Path("/isConfiguracionANSJpaRepositoryAvailable")
    public boolean isConfiguracionANSJpaRepositoryAvailable() {
        return genericService.getConfiguracionANSJpaRepository() != null;
    }
    @Path("/isReportesDominioJpaRepositoryAvailable")
    public boolean isReportesDominioJpaRepositoryAvailable() {
        return genericService.getReportesDominioJpaRepository() != null;
    }
}
