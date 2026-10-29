package com.keralty.aepersonas.persistence.oid;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GridPreferencesOid {

    private String agentName;

    private String piuName;

    public GridPreferencesOid() {

    }

    public GridPreferencesOid(String agentName, String piuName) {
        this.agentName = agentName;
        this.piuName = piuName;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((agentName == null) ? 0 : agentName.hashCode());
        result = prime * result + ((piuName == null) ? 0 : piuName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GridPreferencesOid other = (GridPreferencesOid) obj;
        if (agentName == null) {
            if (other.agentName != null)
                return false;
        } else if (!agentName.equals(other.agentName))
            return false;
        if (piuName == null) {
            if (other.piuName != null)
                return false;
        } else if (!piuName.equals(other.piuName))
            return false;
        return true;
    }

    public GridPreferencesOid fromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        GridPreferencesOid temp;
        try {
            temp = mapper.readValue(jsonString, GridPreferencesOid.class);
        } catch (Exception e) {
            temp = null;
        }
        if (temp != null) {
            this.agentName = temp.agentName;
            this.piuName = temp.piuName;
        }
        return this;
    }

    public String toJson() {
        ObjectMapper mapper = new ObjectMapper();
        String json;
        try {
            json = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            json = "";
        }
        return json;
    }
}
