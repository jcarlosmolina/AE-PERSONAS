package com.keralty.aepersonas.filters;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.resteasy.reactive.server.ServerResponseFilter;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;

public class ResponseHeadersFilter {

	@ConfigProperty(name = "csp")
	String csp;
	
    @ServerResponseFilter
    public void addHeaders(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {

    	String path = requestContext.getUriInfo().getPath();

        if (path.startsWith("q/") || path.startsWith("openapi/")) {
            return;
        }
    	
        responseContext.getHeaders().putSingle(
            "Content-Security-Policy",
            buildCsp()
        );
    }
    
    private String buildCsp() {
    	
    	if (csp != null && !csp.isBlank() && !csp.isEmpty())
    		return csp;
    	
        return String.join("; ",
            "default-src 'self'",
            "script-src 'self'",
            "style-src 'self' 'unsafe-inline'",
            "img-src 'self' data:",
            "font-src 'self'",
            "connect-src 'self'",
            "frame-ancestors 'none'",
            "object-src 'none'",
            "base-uri 'self'"
        );
    }
}
