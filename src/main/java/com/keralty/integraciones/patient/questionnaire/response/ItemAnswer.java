package com.keralty.integraciones.patient.questionnaire.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemAnswer {
    private Boolean valueBoolean;
    private List<AnswerItem> item;

    @JsonProperty("valueBoolean")
    public Boolean getValueBoolean() { return valueBoolean; }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Boolean value) { this.valueBoolean = value; }

    @JsonProperty("item")
    public List<AnswerItem> getItem() { return item; }
    @JsonProperty("item")
    public void setItem(List<AnswerItem> value) { this.item = value; }
}
