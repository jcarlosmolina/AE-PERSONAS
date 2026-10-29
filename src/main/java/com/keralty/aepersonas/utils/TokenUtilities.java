package com.keralty.aepersonas.utils;

import org.eclipse.microprofile.jwt.JsonWebToken;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class TokenUtilities {

	private JsonWebToken jwt;
	
	private static final TokenUtilities _instance = new TokenUtilities();
	
	public static TokenUtilities getInstance() {
		return _instance;
	}
	
	public void setJsonWebToken(JsonWebToken jwt) {
		this.jwt = jwt;
	}

	public static String getToken4aeapigateway() {
		if (TokenUtilities.getInstance().jwt != null)
			return TokenUtilities.getInstance().jwt.getRawToken();
		return "";
	}

	public static String getToken4aeusuarios() {
		if (TokenUtilities.getInstance().jwt != null)
			return TokenUtilities.getInstance().jwt.getRawToken();
		return "";
	}

	public static String getToken4aeconfiguraciones() {
		if (TokenUtilities.getInstance().jwt != null)
			return TokenUtilities.getInstance().jwt.getRawToken();
		return "";
	}

	public static String getToken4aereportes() {
		if (TokenUtilities.getInstance().jwt != null)
			return TokenUtilities.getInstance().jwt.getRawToken();
		return "";
	}

	public static String getToken4aefirmas() {
		if (TokenUtilities.getInstance().jwt != null)
			return TokenUtilities.getInstance().jwt.getRawToken();
		return "";
	}

	public static String getToken4aepersonas() {
		if (TokenUtilities.getInstance().jwt != null)
			return TokenUtilities.getInstance().jwt.getRawToken();
		return "";
	}

	public static String getToken4aesolicitudes() {
		if (TokenUtilities.getInstance().jwt != null)
			return TokenUtilities.getInstance().jwt.getRawToken();
		return "";
	}

	public static String getToken4aenovedades() {
		if (TokenUtilities.getInstance().jwt != null)
			return TokenUtilities.getInstance().jwt.getRawToken();
		return "";
	}

	public static String getToken4aegenerasolicitud() {
		if (TokenUtilities.getInstance().jwt != null)
			return TokenUtilities.getInstance().jwt.getRawToken();
		return "";
	}
}
