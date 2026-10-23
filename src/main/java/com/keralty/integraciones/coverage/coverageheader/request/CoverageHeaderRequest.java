package com.keralty.integraciones.coverage.coverageheader.request;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CoverageHeaderRequest {
    private Patient patient;
    private Coverage coverage;
    private Boolean swFamily;
    private Boolean lastValid;
    private String date;

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("coverage")
    public Coverage getCoverage() { return coverage; }
    @JsonProperty("coverage")
    public void setCoverage(Coverage value) { this.coverage = value; }

    @JsonProperty("swFamily")
    public Boolean getSwFamily() { return swFamily; }
    @JsonProperty("swFamily")
    public void setSwFamily(Boolean value) { this.swFamily = value; }

    @JsonProperty("lastValid")
    public Boolean getLastValid() { return lastValid; }
    @JsonProperty("lastValid")
    public void setLastValid(Boolean value) { this.lastValid = value; }

    @JsonProperty("date")
    public String getDate() { return date; }
    @JsonProperty("date")
    public void setDate(String value) { this.date = value; }
}
