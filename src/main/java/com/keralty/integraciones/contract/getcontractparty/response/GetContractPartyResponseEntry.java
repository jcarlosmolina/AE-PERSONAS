package com.keralty.integraciones.contract.getcontractparty.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetContractPartyResponseEntry {
    private List<EntryEntry> entry;

    @JsonProperty("entry")
    public List<EntryEntry> getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(List<EntryEntry> value) { this.entry = value; }
}
