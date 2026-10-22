package com.keralty.aepersonas.security;

import jakarta.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.jwt.JsonWebToken;

@ApplicationScoped
public interface TokenService {

    String issue(User user);

    String renew(JsonWebToken jwt);
}
