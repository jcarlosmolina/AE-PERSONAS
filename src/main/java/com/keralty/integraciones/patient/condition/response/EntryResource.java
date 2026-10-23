package com.keralty.integraciones.patient.condition.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryResource {
    private String resourceType;
    private List<Code> category;
    private Code code;
    private AbatementPeriod abatementPeriod;
    private Subject subject;
    private Search search;
    private String note;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("category")
    public List<Code> getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(List<Code> value) { this.category = value; }

    @JsonProperty("code")
    public Code getCode() { return code; }
    @JsonProperty("code")
    public void setCode(Code value) { this.code = value; }

    @JsonProperty("abatementPeriod")
    public AbatementPeriod getAbatementPeriod() { return abatementPeriod; }
    @JsonProperty("abatementPeriod")
    public void setAbatementPeriod(AbatementPeriod value) { this.abatementPeriod = value; }

    @JsonProperty("subject")
    public Subject getSubject() { return subject; }
    @JsonProperty("subject")
    public void setSubject(Subject value) { this.subject = value; }

    @JsonProperty("search")
    public Search getSearch() { return search; }
    @JsonProperty("search")
    public void setSearch(Search value) { this.search = value; }

    @JsonProperty("note")
    public String getNote() { return note; }
    @JsonProperty("note")
    public void setNote(String value) { this.note = value; }
}
