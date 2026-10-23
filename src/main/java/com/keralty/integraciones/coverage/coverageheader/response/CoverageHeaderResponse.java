package com.keralty.integraciones.coverage.coverageheader.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoverageHeaderResponse {
    private List<Datum> data;

    @JsonProperty("data")
    public List<Datum> getData() { return data; }
    @JsonProperty("data")
    public void setData(List<Datum> value) { this.data = value; }
}
