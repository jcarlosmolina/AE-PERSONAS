package com.keralty.integraciones.contract.cover.request;

import java.sql.Date;

import com.fasterxml.jackson.annotation.*;


/**
 * Clase base para la llamada a la capacidad 'cover'.
 * No lleva el campo 'lastValid' para implementar AT en busqueda de contrato en Novedaes (Aprobada por correo 7(8/26  
 */
public class CoverRequestBase {
    private Subject subject;
    private String planType;
    private Boolean swFamily;
    private Boolean isHolder;
    private Coverage coverage;
    private Date date;
    
    @JsonProperty("subject")
    public Subject getSubject() { return subject; }
    @JsonProperty("subject")
    public void setSubject(Subject value) { this.subject = value; }

    @JsonProperty("planType")
    public String getPlanType() { return planType; }
    @JsonProperty("planType")
    public void setPlanType(String value) { this.planType = value; }

    @JsonProperty("swFamily")
    public Boolean getSwFamily() { return swFamily; }
    @JsonProperty("swFamily")
    public void setSwFamily(Boolean value) { this.swFamily = value; }

    @JsonProperty("coverage")
    public Coverage getCoverage() { return coverage; }
    @JsonProperty("coverage")
    public void setCoverage(Coverage value) { this.coverage = value; }
    
    @JsonProperty("date")
	public Date getDate() { return date; }
    @JsonProperty("date")
	public void setDate(Date date) { this.date = date; }

    @JsonProperty("isHolder")
    public Boolean getIsHolder() { return isHolder; }
    @JsonProperty("isHolder")
	public void setIsHolder(Boolean isHolder) { this.isHolder = isHolder; }
}
