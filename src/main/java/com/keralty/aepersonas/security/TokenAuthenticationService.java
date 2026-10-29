package com.keralty.aepersonas.security;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Objects;
import java.util.Optional;

import com.keralty.aepersonas.utils.Utilities;
import com.keralty.aepersonas.viewmodel.LoginRequest;

@ApplicationScoped
public class TokenAuthenticationService implements UserAuthenticationService {

    TokenService tokens;

    UserCrudService users;

    @Inject
    public TokenAuthenticationService(TokenService tokens, UserCrudService users) {
        this.tokens = tokens;
        this.users = users;
    }

    @Override
    public Optional<String> login(String username, String password) {
        Optional<User> user = users.findByUsername(username);
        if (user.isPresent()) {
            return user.filter(u -> Objects.equals(Utilities.encrypt(password), u.getPassword()))
                    .map(u -> tokens.issue(u));
        }
        return Optional.empty();
    }

    @Override
    public Optional<String> login(LoginRequest loginRequest){
    	Optional<User> user = loginRequest.getFacetname() == null || loginRequest.getFacetname().isEmpty()
    						? users.findByUsername(loginRequest.getUsername()) 
    						: users.findByFacetAndUsername(loginRequest.getFacetname(), loginRequest.getUsername());
        if (user.isPresent()) {
            return user.filter(u -> Objects.equals(Utilities.encrypt(loginRequest.getPassword()), u.getPassword()))
                    .map(u -> tokens.issue(u));
        }
    	return Optional.empty();
    }

    @Override
    public void logout(User user) {
        if (user != null) {
            throw new IllegalArgumentException("User must not be null");
        }
        // No additional logic
    }

}
