package com.keralty.integraciones.contract.cover.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subject {
    private List<Patient> patient;
    private Person person;
    private Organization organization;

    @JsonProperty("patient")
    public List<Patient> getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(List<Patient> value) { this.patient = value; }

    @JsonProperty("person")
    public Person getPerson() { return person; }
    @JsonProperty("person")
    public void setPerson(Person value) { this.person = value; }

    @JsonProperty("organization")
    public Organization getOrganization() { return organization; }
    @JsonProperty("organization")
	public void setOrganization(Organization organization) { this.organization = organization; }
    
    
}
