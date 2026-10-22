package com.keralty.aepersonas.security;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.Duration;
import java.util.HashSet;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.jwt.JsonWebToken;

import com.google.common.collect.Lists;

import io.smallrye.jwt.build.Jwt;

@ApplicationScoped
public class JWTTokenService implements TokenService {

    @ConfigProperty(name = "token.expirationinseconds")
    String tokenExpirationInSeconds;
    
    @Override
    public String issue(User user) {
    	long tokenExpiratiLong;
    	try {
    		tokenExpiratiLong = tokenExpirationInSeconds != null && !tokenExpirationInSeconds.isEmpty()
    				? Long.parseLong(tokenExpirationInSeconds)
    						: 0;    		
    	} catch (NumberFormatException e) {
    		tokenExpiratiLong = 0;
    	}
        String token = Jwt.issuer("https://example.com/issuer")
        .upn(user.getUsername())
        .groups(new HashSet<>(user.getRoles()))
        .expiresIn(Duration.ofSeconds(tokenExpiratiLong))
        .sign();
        return token;
    }

    @Override
    public String renew(JsonWebToken jwt) {
        User user = new User(jwt.getName(), "", Lists.newArrayList(jwt.getGroups()), jwt.getClaim("facetName"));
        return issue(user);
    }
    
}
