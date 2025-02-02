// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Type of storage. */
public enum AzureStorageType {
    /** Enum value AzureFiles. */
    AZURE_FILES("AzureFiles"),

    /** Enum value AzureBlob. */
    AZURE_BLOB("AzureBlob");

    /** The actual serialized value for a AzureStorageType instance. */
    private final String value;

    AzureStorageType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AzureStorageType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AzureStorageType object, or null if unable to parse.
     */
    @JsonCreator
    public static AzureStorageType fromString(String value) {
        if (value == null) {
            return null;
        }
        AzureStorageType[] items = AzureStorageType.values();
        for (AzureStorageType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
