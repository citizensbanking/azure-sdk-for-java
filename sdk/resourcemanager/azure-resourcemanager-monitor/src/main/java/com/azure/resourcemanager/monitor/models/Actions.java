// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Actions to invoke when the alert fires. */
@Fluent
public final class Actions {
    /*
     * Action Group resource Ids to invoke when the alert fires.
     */
    @JsonProperty(value = "actionGroups")
    private List<String> actionGroups;

    /*
     * The properties of an alert payload.
     */
    @JsonProperty(value = "customProperties")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> customProperties;

    /** Creates an instance of Actions class. */
    public Actions() {
    }

    /**
     * Get the actionGroups property: Action Group resource Ids to invoke when the alert fires.
     *
     * @return the actionGroups value.
     */
    public List<String> actionGroups() {
        return this.actionGroups;
    }

    /**
     * Set the actionGroups property: Action Group resource Ids to invoke when the alert fires.
     *
     * @param actionGroups the actionGroups value to set.
     * @return the Actions object itself.
     */
    public Actions withActionGroups(List<String> actionGroups) {
        this.actionGroups = actionGroups;
        return this;
    }

    /**
     * Get the customProperties property: The properties of an alert payload.
     *
     * @return the customProperties value.
     */
    public Map<String, String> customProperties() {
        return this.customProperties;
    }

    /**
     * Set the customProperties property: The properties of an alert payload.
     *
     * @param customProperties the customProperties value to set.
     * @return the Actions object itself.
     */
    public Actions withCustomProperties(Map<String, String> customProperties) {
        this.customProperties = customProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
