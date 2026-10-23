package com.keralty.integraciones.patient.questionnaire.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemItem {
    private String linkID;
    private String text;
    private List<ItemAnswer> answer;

    @JsonProperty("linkId")
    public String getLinkID() { return linkID; }
    @JsonProperty("linkId")
    public void setLinkID(String value) { this.linkID = value; }

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

    @JsonProperty("answer")
    public List<ItemAnswer> getAnswer() { return answer; }
    @JsonProperty("answer")
    public void setAnswer(List<ItemAnswer> value) { this.answer = value; }
}
