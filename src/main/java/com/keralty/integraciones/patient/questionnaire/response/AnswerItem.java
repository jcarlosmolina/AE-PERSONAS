package com.keralty.integraciones.patient.questionnaire.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AnswerItem {
    private List<FinalAnswer> answer;

    @JsonProperty("answer")
    public List<FinalAnswer> getAnswer() { return answer; }
    @JsonProperty("answer")
    public void setAnswer(List<FinalAnswer> value) { this.answer = value; }
}
