package com.keralty.aepersonas.viewmodel;

import java.util.HashMap;
import java.util.Map;

import com.keralty.aepersonas.persistence.AbstractAppEntity;

public class InstanceResponseViewModel extends QueryResponse {

    private String jsonOid;

    private Map<String, Object> properties;

    public InstanceResponseViewModel() {
        super();
        this.jsonOid = "";
        this.properties = new HashMap<>();
    }

    public InstanceResponseViewModel(AbstractAppEntity instance, String displaySetItems) {
        jsonOid = "";
        properties = new HashMap<>();
        if (instance != null) {
            jsonOid = instance.getOid().toJson();
            for (String dsItem : displaySetItems.split(",[ ]*")) {
                properties.put(dsItem, instance.getAttribute(dsItem));
            }
        }
        this.setTotalItems((instance != null ? 1 : 0));
    }

    public String getJsonOid() {
        return jsonOid;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

}

