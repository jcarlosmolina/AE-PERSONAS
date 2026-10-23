package com.keralty.integraciones.patient.basicdata.response;

/*
 * En caso de no existir la persona devuelve data = null
 */
import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientBasicDataResponse {
    private List<Datum> data;

    @JsonProperty("data")
    public List<Datum> getData() { return data; }
    @JsonProperty("data")
    public void setData(List<Datum> value) { this.data = value; }
}
