// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The PasswordCredential model. */
@Fluent
public final class PasswordCredentialInner {
    /*
     * The secretText property.
     */
    @JsonProperty(value = "secretText")
    private String secretText;

    /*
     * The keyId property.
     */
    @JsonProperty(value = "keyId")
    private String keyId;

    /*
     * The startDateTime property.
     */
    @JsonProperty(value = "startDateTime")
    private OffsetDateTime startDateTime;

    /*
     * The endDateTime property.
     */
    @JsonProperty(value = "endDateTime")
    private OffsetDateTime endDateTime;

    /**
     * Get the secretText property: The secretText property.
     *
     * @return the secretText value.
     */
    public String secretText() {
        return this.secretText;
    }

    /**
     * Set the secretText property: The secretText property.
     *
     * @param secretText the secretText value to set.
     * @return the PasswordCredentialInner object itself.
     */
    public PasswordCredentialInner withSecretText(String secretText) {
        this.secretText = secretText;
        return this;
    }

    /**
     * Get the keyId property: The keyId property.
     *
     * @return the keyId value.
     */
    public String keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId property: The keyId property.
     *
     * @param keyId the keyId value to set.
     * @return the PasswordCredentialInner object itself.
     */
    public PasswordCredentialInner withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Get the startDateTime property: The startDateTime property.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: The startDateTime property.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the PasswordCredentialInner object itself.
     */
    public PasswordCredentialInner withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the endDateTime property: The endDateTime property.
     *
     * @return the endDateTime value.
     */
    public OffsetDateTime endDateTime() {
        return this.endDateTime;
    }

    /**
     * Set the endDateTime property: The endDateTime property.
     *
     * @param endDateTime the endDateTime value to set.
     * @return the PasswordCredentialInner object itself.
     */
    public PasswordCredentialInner withEndDateTime(OffsetDateTime endDateTime) {
        this.endDateTime = endDateTime;
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