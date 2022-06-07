// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Mutable Batch endpoint configuration. */
@Fluent
public final class PartialBatchEndpoint {
    /*
     * Default values for Batch Endpoint
     */
    @JsonProperty(value = "defaults")
    private BatchEndpointDefaults defaults;

    /**
     * Get the defaults property: Default values for Batch Endpoint.
     *
     * @return the defaults value.
     */
    public BatchEndpointDefaults defaults() {
        return this.defaults;
    }

    /**
     * Set the defaults property: Default values for Batch Endpoint.
     *
     * @param defaults the defaults value to set.
     * @return the PartialBatchEndpoint object itself.
     */
    public PartialBatchEndpoint withDefaults(BatchEndpointDefaults defaults) {
        this.defaults = defaults;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (defaults() != null) {
            defaults().validate();
        }
    }
}