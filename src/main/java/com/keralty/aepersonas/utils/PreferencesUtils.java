package com.keralty.aepersonas.utils;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.persistence.GridPreferences;

public final class PreferencesUtils {

    private PreferencesUtils() {

    }

    public static List<GridPreferences> findByAgentName(String agentName) {
    	// TODO: IMPLEMENT!
        List<GridPreferences> gridPreferences = new ArrayList<>();
        GridPreferences gp = new GridPreferences();
        gp.setAgentName(agentName);
        gridPreferences.add(gp);
        return gridPreferences;
    }

    public static void update(GridPreferences gridPreferences) {
        // TODO: IMPLEMENT!
        if (gridPreferences == null) {
            throw new IllegalArgumentException("Can't update empty preferences");
        }
    }

    public static void delete(GridPreferences gridPreferences) {
        // TODO: IMPLEMENT!
        if (gridPreferences == null) {
            throw new IllegalArgumentException("Can't delete empty preferences");
        }
    }
}
