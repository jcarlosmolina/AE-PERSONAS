package com.keralty.aepersonas.api;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.SecurityContext;

import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.RestResponse.ResponseBuilder;

import com.keralty.aepersonas.security.UserAuthenticationService;
import com.keralty.aepersonas.security.User;
import com.keralty.aepersonas.viewmodel.LoginRequest;
import com.keralty.aepersonas.viewmodel.UserInfoViewModel;
import io.quarkus.security.UnauthorizedException;

@Path("/")
@RequestScoped
public class AccountApiController {

    UserAuthenticationService authenticationService;

    JsonWebToken jwt;
    
    public AccountApiController(UserAuthenticationService authenticationService, JsonWebToken jwt) {
    	this.authenticationService = authenticationService;
    	this.jwt = jwt;
    }

    @POST
    @Path("/Token")
    @Produces(MediaType.TEXT_PLAIN)
    public RestResponse<String> login(LoginRequest loginRequest) {
        Optional<String> token = authenticationService.login(loginRequest);
        if (token.isPresent()) {
            return ResponseBuilder.ok("\"" + token.get() + "\"", MediaType.TEXT_PLAIN_TYPE).build();
        } else {
            throw new UnauthorizedException();
        }
    }

    @POST
    @Path("/api/Account/Logout")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public boolean logout(User user) {
        authenticationService.logout(user);
        return true;
    }

    @POST
    @Path("/api/Account/UserInfo")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public UserInfoViewModel getUserInfo(@Context SecurityContext sec) {
        UserInfoViewModel userInfo = new UserInfoViewModel();
        Principal principal = sec.getUserPrincipal();
        if (principal != null){
            String userRoles = jwt.getGroups().stream().collect(Collectors.joining(","));
            userInfo = new UserInfoViewModel(principal.getName(), userRoles);
            userInfo.setGridPreferences(new ArrayList<>());
        }
        return userInfo;
    }
    
    @POST
    @Path("/api/Account/AnonymousUserInfo")
    @Operation(hidden = true)
    public UserInfoViewModel getAnonymousUserInfo() {
        return new UserInfoViewModel("", "");
    }
}
