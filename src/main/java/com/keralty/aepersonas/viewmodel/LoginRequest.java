package com.keralty.aepersonas.viewmodel;

public class LoginRequest {

	private String facetname;
	
	private String username;
	
	private String password;
	
	public LoginRequest() {
		facetname = "";
		username = "";
		password = "";
	}

	public String getFacetname() {
		return facetname;
	}

	public void setFacetname(String facetname) {
		this.facetname = facetname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
