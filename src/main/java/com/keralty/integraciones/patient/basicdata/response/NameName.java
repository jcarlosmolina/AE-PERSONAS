package com.keralty.integraciones.patient.basicdata.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NameName {
    private String text;
    private String firstName;
    private String secondName;
    private String firstFamily;
    private String secondFamily;

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

    @JsonProperty("firstName")
    public String getFirstName() { return firstName; }
    @JsonProperty("firstName")
    public void setFirstName(String value) { this.firstName = value; }

    @JsonProperty("secondName")
    public String getSecondName() { return secondName; }
    @JsonProperty("secondName")
    public void setSecondName(String value) { this.secondName = value; }

    @JsonProperty("firstFamily")
    public String getFirstFamily() { return firstFamily; }
    @JsonProperty("firstFamily")
    public void setFirstFamily(String value) { this.firstFamily = value; }

    @JsonProperty("secondFamily")
    public String getSecondFamily() { return secondFamily; }
    @JsonProperty("secondFamily")
    public void setSecondFamily(String value) { this.secondFamily = value; }
}
