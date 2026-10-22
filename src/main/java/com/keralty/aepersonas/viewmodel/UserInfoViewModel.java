package com.keralty.aepersonas.viewmodel;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.GridPreferences;
import com.keralty.aepersonas.utils.DynamicPermissionsUtils;

public class UserInfoViewModel {

    @JsonProperty("email")
    private String email;

    @JsonProperty("hasRegistered")
    private boolean hasRegistered;

    @JsonProperty("roles")
    private String roles;

    @JsonProperty("visibleHATNodes")
    private List<String> visibleHATNodes;

    @JsonProperty("visibleIUs")
    private List<VisibleIUPermissions> visibleIUs;

    @JsonProperty("gridPreferences")
    private List<GridPreferences> gridPreferences;

    public UserInfoViewModel() {
        this.email = "";
        this.hasRegistered = false;
        this.roles = "";
        this.visibleHATNodes = new ArrayList<>();
        this.visibleIUs = new ArrayList<>();
        this.gridPreferences = new ArrayList<>();
    }

    public UserInfoViewModel(String userName, String userRoles) {
        this.email = userName;
        this.roles = userRoles;
        this.hasRegistered = true;
        DynamicPermissionsUtils dynamicPermissionsUtils = new DynamicPermissionsUtils(userName, userRoles);
        this.visibleHATNodes = dynamicPermissionsUtils.getVisibleHATNodesForUser();
        this.visibleIUs = dynamicPermissionsUtils.getVisibleIUsForUser();
        this.gridPreferences = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasRegistered() {
        return hasRegistered;
    }

    public void setHasRegistered(boolean hasRegistered) {
        this.hasRegistered = hasRegistered;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public List<String> getVisibleHATNodes() {
        return visibleHATNodes;
    }

    public void setVisibleHATNodes(List<String> visibleHATNodes) {
        this.visibleHATNodes = visibleHATNodes;
    }

    public List<VisibleIUPermissions> getVisibleIUs() {
        return visibleIUs;
    }

    public void setVisibleIUs(List<VisibleIUPermissions> visibleIUs) {
        this.visibleIUs = visibleIUs;
    }

    public List<GridPreferences> getGridPreferences() {
        return gridPreferences;
    }

    public void setGridPreferences(List<GridPreferences> gridPreferences) {
        this.gridPreferences = gridPreferences;
    }

}
