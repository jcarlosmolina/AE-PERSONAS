package com.keralty.aepersonas.filters;

import java.io.IOException;

import org.eclipse.microprofile.jwt.JsonWebToken;

import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.global.UsuarioSistemaExternoConstants;
import com.keralty.aepersonas.security.TokenService;
import com.keralty.aepersonas.viewmodel.ServiceResponse;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;

@Provider
public class SesionUnicaFilter implements ContainerRequestFilter {

	@PersistenceContext
	protected EntityManager em;

	JsonWebToken jwt;

	TokenService tokenService;

	@Inject
	public SesionUnicaFilter(JsonWebToken jwt, TokenService tokenService) {
		this.jwt = jwt;
		this.tokenService = tokenService;
	}

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		// Verificamos si el id de sesion se encuentra en el Token JWT
		
		// Solo para los usuarios Funcionario
		if (jwt != null && jwt.getGroups() != null && jwt.getGroups().contains(FuncionarioConstants.CLASS_NAME)) {
			String sesionId = jwt.getClaim("misesionid");
			if (sesionId != null) {
				// Comprobamos que el id de sesion es el que corresponde con el usuario en tabla
				if (!verificarExistenciaIdSesion()) {
					ServiceResponse respuestaError = new ServiceResponse();
					respuestaError.setResultCode("777");
					respuestaError.setResultDescription("Sesion duplicada");
					requestContext.abortWith(Response.ok(respuestaError).build());
				}
			}
		}
	}

	private boolean verificarExistenciaIdSesion() {
		try {
			String misesionid = jwt.getClaim("misesionid");
			String usuario = jwt.getClaim("upn");

			String idEnBBDD = buscarIdParaUsuario(usuario);
			if (idEnBBDD != null && !idEnBBDD.isEmpty()) {
				if (idEnBBDD.equalsIgnoreCase(misesionid)) {
					return true;
				} else {
					return false;
				}
			}
			
		} catch (Exception e) {
			org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
		}
		return true;
	}

	private String buscarIdParaUsuario(String usuario) {
		try {
			String sql = "select IdSesion from Funcionario where Id = ?1";
			Query query = em.createNativeQuery(sql);

			query.setParameter(1, usuario);

			Object resultado = query.getSingleResult();

			if (resultado != null){
				return resultado.toString();
			}
		} catch (Exception e) {
			org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
		}

		return null;    	
	}
}
