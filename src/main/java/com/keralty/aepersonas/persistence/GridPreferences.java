package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.oid.GridPreferencesOid;

public class GridPreferences {

    @JsonProperty("agentname")
    private String agentName;

    @JsonProperty("piuname")
    private String piuName;

    @JsonProperty("gridstate")
    private String gridState;

    public GridPreferences() {

    }

    public GridPreferences(GridPreferencesOid oid) {
        this.agentName = oid.getAgentName();
        this.piuName = oid.getPiuName();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getPiuName() {
        return piuName;
    }

    public void setPiuName(String piuName) {
        this.piuName = piuName;
    }

    public String getGridState() {
        return gridState;
    }

    public void setGridState(String gridState) {
        this.gridState = gridState;
    }

}
