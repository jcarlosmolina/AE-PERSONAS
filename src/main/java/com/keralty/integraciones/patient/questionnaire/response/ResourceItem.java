package com.keralty.integraciones.patient.questionnaire.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceItem {
    private List<ItemItem> item;

    @JsonProperty("item")
    public List<ItemItem> getItem() { return item; }
    @JsonProperty("item")
    public void setItem(List<ItemItem> value) { this.item = value; }
}
