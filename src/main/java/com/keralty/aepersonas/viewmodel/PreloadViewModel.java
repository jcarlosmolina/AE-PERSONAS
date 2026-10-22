package com.keralty.aepersonas.viewmodel;

public class PreloadViewModel {

    private String jsonOID;

    private String supplementaryInfo;

    public PreloadViewModel() {
        this.jsonOID = "";
        this.supplementaryInfo = "";
    }

    public PreloadViewModel(String jsonOID, String supplementaryInfo) {
        this.jsonOID = jsonOID;
        this.supplementaryInfo = supplementaryInfo;
    }

    public String getJsonOID() {
        return jsonOID;
    }

    public void setJsonOID(String jsonOID) {
        this.jsonOID = jsonOID;
    }

    public String getSupplementaryInfo() {
        return supplementaryInfo;
    }

    public void setSupplementaryInfo(String supplementaryInfo) {
        this.supplementaryInfo = supplementaryInfo;
    }
}
