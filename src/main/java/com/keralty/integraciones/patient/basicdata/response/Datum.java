package com.keralty.integraciones.patient.basicdata.response;

import com.fasterxml.jackson.annotation.*;

import java.sql.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Datum {
    private String id;
    private List<Identifier> identifier;
    private DatumName name;
    private String gender;
    private Date birthDate;
    private Long age;
    private MaritalStatus maritalStatus;
    private List<Extension> extension;
    private boolean foreign = false;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> value) { this.identifier = value; }

    @JsonProperty("name")
    public DatumName getName() { return name; }
    @JsonProperty("name")
    public void setName(DatumName value) { this.name = value; }

    @JsonProperty("gender")
    public String getGender() { return gender; }
    @JsonProperty("gender")
    public void setGender(String value) { this.gender = value; }

    @JsonProperty("birthDate")
    public Date getBirthDate() { return birthDate; }
    @JsonProperty("birthDate")
    public void setBirthDate(Date value) { this.birthDate = value; }

    @JsonProperty("age")
    public Long getAge() { return age; }
    @JsonProperty("age")
    public void setAge(Long value) { this.age = value; }

    @JsonProperty("maritalStatus")
    public MaritalStatus getMaritalStatus() { return maritalStatus; }
    @JsonProperty("maritalStatus")
    public void setMaritalStatus(MaritalStatus value) { this.maritalStatus = value; }

    @JsonProperty("extension")
    public List<Extension> getExtension() { return extension; }
    @JsonProperty("extension")
    public void setExtension(List<Extension> value) { this.extension = value; }
	
    @JsonProperty("foreign")
    public boolean isForeign() { return foreign; }
    @JsonProperty("foreign")
	public void setForeign(boolean foreign) { this.foreign = foreign; }
}
