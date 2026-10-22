package com.keralty.aepersonas.viewmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportRequest extends QueryRequest {

	private String className;
	
	private String reportName;
	
	private Map<String, Object> reportParameters;
	
	public ReportRequest() {
		className = "";
		reportName = "";
		jsonOID = "";
		displaySetName = "";
		displaySetItems = "";
		filters = new ArrayList<>();
		orderCriteriaName = "";
		reportParameters = new HashMap<>();
	}
	
	public QueryRequest getQueryRequest() {
		QueryRequest queryRequest = new QueryRequest();
		queryRequest.setJsonOID(jsonOID);
		queryRequest.setDisplaySetItems(displaySetItems);
		queryRequest.setDisplaySetName(displaySetName);
		queryRequest.setOrderCriteriaName(orderCriteriaName);
		queryRequest.setFilters(filters);
		return queryRequest;
	}
	
	public FilterRequest getFilterRequest() {
		return !filters.isEmpty() ? filters.get(0) : new FilterRequest();
	}

	public Map<String, Object> getEffectiveReportParameters(){
		Map<String, Object> parameters = new HashMap<>();
		parameters.putAll(getReportParameters());
		for(FilterVariableRequest fvar : getFilterParameters()) {
			if (!parameters.containsKey(fvar.getName()))
				parameters.put(fvar.getName(), fvar.getValue());
		}
		return parameters;
	}
	
	private List<FilterVariableRequest> getFilterParameters(){
		List<FilterVariableRequest> filterParameters = new ArrayList<>();
		for(FilterRequest filterRequest : filters) {
			for(FilterVariableRequest filterVariableRequest : filterRequest.getVariables()) {
				filterParameters.add(filterVariableRequest);
			}
		}
		return filterParameters;
	}
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public Map<String, Object> getReportParameters() {
		return reportParameters;
	}

	public void setReportParameters(Map<String, Object> reportParameters) {
		this.reportParameters = reportParameters;
	}
	
	public List<FilterVariableRequest> getReportParametersList(){
		List<FilterVariableRequest> parametersList = new ArrayList<>();
		for(Map.Entry<String, Object> param : reportParameters.entrySet()) {
			parametersList.add(new FilterVariableRequest(param.getKey(), param.getValue()));
		}
		return parametersList;
	}
}
