package com.keralty.integraciones.contract.cover.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoverResponse {
    private List<CoverFamilyResponse> coverFamilyResponse;
    private String code;
    private String value;
    private List<CoverFamilyResponse> coverResponse;
    
    @JsonProperty("coverFamilyResponse")
    public List<CoverFamilyResponse> getCoverFamilyResponse() { return coverFamilyResponse; }
    @JsonProperty("coverFamilyResponse")
    public void setCoverFamilyResponse(List<CoverFamilyResponse> value) { this.coverFamilyResponse = value; }
    
    @JsonProperty("code")
	public String getCode() { return code; }
    @JsonProperty("code")
	public void setCode(String code) { this.code = code; }
	
    @JsonProperty("value")
	public String getValue() { return value; }
    @JsonProperty("value")
	public void setValue(String value) { this.value = value; }
	
    @JsonProperty("coverResponse")
    public List<CoverFamilyResponse> getCoverResponse() { return coverResponse; }
    @JsonProperty("coverResponse")
	public void setCoverResponse(List<CoverFamilyResponse> coverResponse) { this.coverResponse = coverResponse; }
    
    
}
