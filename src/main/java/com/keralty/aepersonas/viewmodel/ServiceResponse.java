package com.keralty.aepersonas.viewmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.keralty.aepersonas.persistence.AbstractAppEntity;

public class ServiceResponse extends Response {

    private String resultMessageId;

    private List<String> resultMessageParts;
    
    @JsonIgnore
    private AbstractAppEntity instance;
    
    @JsonIgnore
    private String instanceSuppInfo;

    public ServiceResponse() {
        super();
        this.resultMessageId = "";
        this.resultMessageParts = new ArrayList<>();
        this.instance = null;
        this.instanceSuppInfo = "";
    }

    public ServiceResponse(String resultCode, String resultDescription) {
        super(resultCode, resultDescription, 0L);
        this.resultMessageId = "";
        this.resultMessageParts = new ArrayList<>();
        this.instance = null;
        this.instanceSuppInfo = "";
    }

    public ServiceResponse(String resultCode, String resultDescription, Long elapsedMillis) {
        super(resultCode, resultDescription, elapsedMillis);
        this.resultMessageId = "";
        this.resultMessageParts = new ArrayList<>();
        this.instance = null;
        this.instanceSuppInfo = "";
    }

    public String getResultMessageId() {
        return resultMessageId;
    }

    public void setResultMessageId(String resultMessageId) {
        this.resultMessageId = resultMessageId;
    }

    public List<String> getResultMessageParts() {
        return resultMessageParts;
    }

    public void setResultMessageParts(List<String> resultMessageParts) {
        this.resultMessageParts = resultMessageParts;
    }

    public AbstractAppEntity getInstance() {
        return instance;
    }

    public void setInstance(AbstractAppEntity instance) {
        this.instance = instance;
    }

    public String getInstanceSuppInfo() {
        return instanceSuppInfo;
    }

    public void setInstanceSuppInfo(String instanceSuppInfo) {
        this.instanceSuppInfo = instanceSuppInfo;
    }

    public Map<String, Object> buildOutArgs(){
    	return new HashMap<>();
    }
}
