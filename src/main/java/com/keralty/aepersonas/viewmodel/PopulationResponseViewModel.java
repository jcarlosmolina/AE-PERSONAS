package com.keralty.aepersonas.viewmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PopulationResponseViewModel extends QueryResponse {

    private List<Map<String, Object>> results;

    public PopulationResponseViewModel() {
        this.results = new ArrayList<>();
    }

    public PopulationResponseViewModel(Map<String, Object> singleResult) {
    	this.results = new ArrayList<>();
    	if (singleResult != null)
    		results.add(singleResult);
    	this.setTotalItems(results.size());
    }

    public PopulationResponseViewModel(List<Map<String, Object>> results) {
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public PopulationResponseViewModel(List<Map<String, Object>> results, int totalItems) {
    	this.results = results;
    	this.setTotalItems(totalItems != 0 ? totalItems : results.size());
    }

    public List<Map<String, Object>> getResults() {
        return results;
    }
}
