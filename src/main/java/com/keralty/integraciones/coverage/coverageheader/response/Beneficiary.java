package com.keralty.integraciones.coverage.coverageheader.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Beneficiary {
    private List<Identifier> identifier;
    private String name;
    private String firstName;
    private String firstFamily;
    private String secondFamily;

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> value) { this.identifier = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("FirstName")
    public String getFirstName() { return firstName; }
    @JsonProperty("FirstName")
    public void setFirstName(String value) { this.firstName = value; }

    @JsonProperty("FirstFamily")
    public String getFirstFamily() { return firstFamily; }
    @JsonProperty("FirstFamily")
    public void setFirstFamily(String value) { this.firstFamily = value; }

    @JsonProperty("SecondFamily")
    public String getSecondFamily() { return secondFamily; }
    @JsonProperty("SecondFamily")
    public void setSecondFamily(String value) { this.secondFamily = value; }
}
