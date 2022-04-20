// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The role management policy enablement rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("RoleManagementPolicyEnablementRule")
@Fluent
public final class RoleManagementPolicyEnablementRule extends RoleManagementPolicyRule {
    /*
     * The list of enabled rules.
     */
    @JsonProperty(value = "enabledRules")
    private List<EnablementRules> enabledRules;

    /**
     * Get the enabledRules property: The list of enabled rules.
     *
     * @return the enabledRules value.
     */
    public List<EnablementRules> enabledRules() {
        return this.enabledRules;
    }

    /**
     * Set the enabledRules property: The list of enabled rules.
     *
     * @param enabledRules the enabledRules value to set.
     * @return the RoleManagementPolicyEnablementRule object itself.
     */
    public RoleManagementPolicyEnablementRule withEnabledRules(List<EnablementRules> enabledRules) {
        this.enabledRules = enabledRules;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoleManagementPolicyEnablementRule withId(String id) {
        super.withId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoleManagementPolicyEnablementRule withTarget(RoleManagementPolicyRuleTarget target) {
        super.withTarget(target);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}