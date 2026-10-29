package com.keralty.integraciones.patient.contact.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/*
 * En caso de no existir la persona devuelve todos los datos a null
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientContactResponse {
    private List<Identifier> identifier;
    private String name;
    private List<Telecom> telecom;
    private List<Address> address;

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> value) { this.identifier = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("telecom")
    public List<Telecom> getTelecom() { return telecom; }
    @JsonProperty("telecom")
    public void setTelecom(List<Telecom> value) { this.telecom = value; }

    @JsonProperty("address")
    public List<Address> getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(List<Address> value) { this.address = value; }
}
