package com.keralty.aepersonas.security;

import static java.util.Objects.requireNonNull;

import java.util.List;

public class User {

    private String id;
    private String username;
    private String password;
    private List<String> roles;
    private String facetName;

    public User() {
        super();
    }

    public User(final String username, final String password, List<String> roles, String facetName) {
        super();
        this.id = requireNonNull(username);
        this.username = requireNonNull(username);
        this.password = requireNonNull(password);
        this.roles = roles;
        this.facetName = facetName;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void addRole(String roleName) {
        roles.add(roleName);
    }

    public void removeRole(String roleName) {
        roles.remove(roleName);
    }

    public boolean isInAnyRole(List<String> roleNames) {
        return roles.stream().filter(a -> roleNames.contains(a)).count() > 0;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getFacetName() {
        return facetName;
    }
}
