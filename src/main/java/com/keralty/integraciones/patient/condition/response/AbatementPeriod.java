package com.keralty.integraciones.patient.condition.response;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbatementPeriod {
    private Date start;
    private Date end;

    @JsonProperty("start")
    public Date getStart() { return start; }
    @JsonProperty("start")
    public void setStart(Date value) { this.start = value; }
    
    @JsonProperty("end")
    public Date getEnd() { return end; }
    @JsonProperty("end")
    public void setEnd(Date value) { this.end = value; }
    
}
