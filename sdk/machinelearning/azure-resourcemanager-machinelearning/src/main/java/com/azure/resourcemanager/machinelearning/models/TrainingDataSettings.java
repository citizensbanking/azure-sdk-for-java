// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Training data input. */
@Fluent
public final class TrainingDataSettings {
    /*
     * [Required] Training data MLTable.
     */
    @JsonProperty(value = "data", required = true)
    private MLTableJobInput data;

    /**
     * Get the data property: [Required] Training data MLTable.
     *
     * @return the data value.
     */
    public MLTableJobInput data() {
        return this.data;
    }

    /**
     * Set the data property: [Required] Training data MLTable.
     *
     * @param data the data value to set.
     * @return the TrainingDataSettings object itself.
     */
    public TrainingDataSettings withData(MLTableJobInput data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (data() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property data in model TrainingDataSettings"));
        } else {
            data().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TrainingDataSettings.class);
}