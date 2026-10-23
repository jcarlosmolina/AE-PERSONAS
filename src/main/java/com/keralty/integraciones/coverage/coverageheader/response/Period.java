package com.keralty.integraciones.coverage.coverageheader.response;

import com.fasterxml.jackson.annotation.*;

import java.sql.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Period {
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
