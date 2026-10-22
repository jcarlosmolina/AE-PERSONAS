package com.keralty.aepersonas.viewmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilterRequest {

    private String name;

    private List<FilterVariableRequest> variables;

    public FilterRequest() {
        this.name = "";
        this.variables = new ArrayList<>();
    }

    public FilterRequest(String name, List<FilterVariableRequest> variables) {
        this.name = name;
        this.variables = variables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FilterVariableRequest> getVariables() {
        return variables;
    }

    public void setVariables(List<FilterVariableRequest> variables) {
        this.variables = variables;
    }

    public boolean hasFilterVariable(String name) {
    	FilterVariableRequest fvr = getFilterVariableRequest(name);
    	return fvr != null && fvr.getValue() != null;
    }

    public Object getFilterVariable(String name) {
    	FilterVariableRequest fvr = getFilterVariableRequest(name);
    	return fvr != null ? fvr.getValue() : null;
    }
    
    public Object getFilterVariable(String name, String dataType) {
    	FilterVariableRequest fvr = getFilterVariableRequest(name);
    	return fvr != null ? fvr.getTypedValue(dataType) : null;
    }
    
    private FilterVariableRequest getFilterVariableRequest(String name) {
        Optional<FilterVariableRequest> filterVariableRequest = variables.stream()
                .filter(variable -> variable.getName().equalsIgnoreCase(name)).findFirst();
        return filterVariableRequest.isPresent() ? filterVariableRequest.get() : null;
    }

    public FilterRequest addFilterVariable(String name, Object value) {
        this.getVariables().add(new FilterVariableRequest(name, value));
        return this;
    }

    public FilterRequest addFilterVariable(FilterVariableRequest filterVariable) {
        this.getVariables().add(filterVariable);
        return this;
    }
}
