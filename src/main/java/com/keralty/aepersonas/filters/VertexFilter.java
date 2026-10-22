package com.keralty.aepersonas.filters;

import jakarta.inject.Inject;

import org.eclipse.microprofile.jwt.JsonWebToken;

import com.keralty.aepersonas.security.TokenService;

import io.quarkus.vertx.web.RouteFilter;
import io.vertx.ext.web.RoutingContext;

public class VertexFilter {

	static final String AUTHORIZATION_HEADER = "Authorization";
   
    static final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";
    
    static final String ACCESS_CONTROL_EXPOSE_HEADERS_VALUES = "Authorization";
	
    JsonWebToken jwt;

    TokenService tokenService;
    
    @Inject
    public VertexFilter(JsonWebToken jwt, TokenService tokenService) {
    	this.jwt = jwt;
    	this.tokenService = tokenService;
    }
    
    @RouteFilter
    void addUpdatedJWTToResponse(RoutingContext rc) {
        String authorizationHeader = rc.request().getHeader(AUTHORIZATION_HEADER);
        if (authorizationHeader != null && jwt != null) {
            rc.response().putHeader(AUTHORIZATION_HEADER, tokenService.renew(jwt));
            rc.response().putHeader(ACCESS_CONTROL_EXPOSE_HEADERS, ACCESS_CONTROL_EXPOSE_HEADERS_VALUES);
        }
        rc.next();
    }
    
}
