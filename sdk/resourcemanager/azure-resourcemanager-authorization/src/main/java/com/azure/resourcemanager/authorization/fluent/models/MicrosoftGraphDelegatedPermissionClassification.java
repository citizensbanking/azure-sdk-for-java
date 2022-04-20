// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** delegatedPermissionClassification. */
@Fluent
public final class MicrosoftGraphDelegatedPermissionClassification extends MicrosoftGraphEntity {
    /*
     * permissionClassificationType
     */
    @JsonProperty(value = "classification")
    private MicrosoftGraphPermissionClassificationType classification;

    /*
     * The unique identifier (id) for the delegated permission listed in the
     * oauth2PermissionScopes collection of the servicePrincipal. Required on
     * create. Does not support $filter.
     */
    @JsonProperty(value = "permissionId")
    private String permissionId;

    /*
     * The claim value (value) for the delegated permission listed in the
     * oauth2PermissionScopes collection of the servicePrincipal. Does not
     * support $filter.
     */
    @JsonProperty(value = "permissionName")
    private String permissionName;

    /*
     * delegatedPermissionClassification
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the classification property: permissionClassificationType.
     *
     * @return the classification value.
     */
    public MicrosoftGraphPermissionClassificationType classification() {
        return this.classification;
    }

    /**
     * Set the classification property: permissionClassificationType.
     *
     * @param classification the classification value to set.
     * @return the MicrosoftGraphDelegatedPermissionClassification object itself.
     */
    public MicrosoftGraphDelegatedPermissionClassification withClassification(
        MicrosoftGraphPermissionClassificationType classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Get the permissionId property: The unique identifier (id) for the delegated permission listed in the
     * oauth2PermissionScopes collection of the servicePrincipal. Required on create. Does not support $filter.
     *
     * @return the permissionId value.
     */
    public String permissionId() {
        return this.permissionId;
    }

    /**
     * Set the permissionId property: The unique identifier (id) for the delegated permission listed in the
     * oauth2PermissionScopes collection of the servicePrincipal. Required on create. Does not support $filter.
     *
     * @param permissionId the permissionId value to set.
     * @return the MicrosoftGraphDelegatedPermissionClassification object itself.
     */
    public MicrosoftGraphDelegatedPermissionClassification withPermissionId(String permissionId) {
        this.permissionId = permissionId;
        return this;
    }

    /**
     * Get the permissionName property: The claim value (value) for the delegated permission listed in the
     * oauth2PermissionScopes collection of the servicePrincipal. Does not support $filter.
     *
     * @return the permissionName value.
     */
    public String permissionName() {
        return this.permissionName;
    }

    /**
     * Set the permissionName property: The claim value (value) for the delegated permission listed in the
     * oauth2PermissionScopes collection of the servicePrincipal. Does not support $filter.
     *
     * @param permissionName the permissionName value to set.
     * @return the MicrosoftGraphDelegatedPermissionClassification object itself.
     */
    public MicrosoftGraphDelegatedPermissionClassification withPermissionName(String permissionName) {
        this.permissionName = permissionName;
        return this;
    }

    /**
     * Get the additionalProperties property: delegatedPermissionClassification.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: delegatedPermissionClassification.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDelegatedPermissionClassification object itself.
     */
    public MicrosoftGraphDelegatedPermissionClassification withAdditionalProperties(
        Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDelegatedPermissionClassification withId(String id) {
        super.withId(id);
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