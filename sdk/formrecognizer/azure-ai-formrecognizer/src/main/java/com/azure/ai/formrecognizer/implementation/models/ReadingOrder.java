// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ReadingOrder. */
public enum ReadingOrder {
    /** Enum value basic. */
    BASIC("basic"),

    /** Enum value natural. */
    NATURAL("natural");

    /** The actual serialized value for a ReadingOrder instance. */
    private final String value;

    ReadingOrder(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ReadingOrder instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ReadingOrder object, or null if unable to parse.
     */
    @JsonCreator
    public static ReadingOrder fromString(String value) {
        if (value == null) {
            return null;
        }
        ReadingOrder[] items = ReadingOrder.values();
        for (ReadingOrder item : items) {
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
