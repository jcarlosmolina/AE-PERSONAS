package com.keralty.integraciones.contract.getcontractparty.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TermIdentifier {
    private List<LegalStatusCoding> coding;

    @JsonProperty("coding")
    public List<LegalStatusCoding> getCoding() { return coding; }
    @JsonProperty("coding")
    public void setCoding(List<LegalStatusCoding> value) { this.coding = value; }

}
