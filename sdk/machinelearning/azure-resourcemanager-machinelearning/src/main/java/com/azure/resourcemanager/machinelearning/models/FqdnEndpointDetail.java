// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FqdnEndpointDetail model. */
@Fluent
public final class FqdnEndpointDetail {
    /*
     * The port property.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the port property: The port property.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port property.
     *
     * @param port the port value to set.
     * @return the FqdnEndpointDetail object itself.
     */
    public FqdnEndpointDetail withPort(Integer port) {
        this.port = port;
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