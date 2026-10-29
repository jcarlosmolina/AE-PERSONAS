package com.keralty.aepersonas.viewmodel;

import java.util.ArrayList;
import java.util.List;

public class PreloadResponseViewModel extends QueryResponse {

    private List<PreloadViewModel> results;

    public PreloadResponseViewModel() {
        super();
        results = new ArrayList<>();
    }

    public PreloadResponseViewModel(List<PreloadViewModel> results) {
        this.results = results;
        this.setTotalItems(results.size());
    }

    public List<PreloadViewModel> getResults() {
        return results;
    }

}
