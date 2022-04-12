// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.models.AccountEncryption;
import com.azure.resourcemanager.mediaservices.models.KeyDelivery;
import com.azure.resourcemanager.mediaservices.models.PublicNetworkAccess;
import com.azure.resourcemanager.mediaservices.models.StorageAccount;
import com.azure.resourcemanager.mediaservices.models.StorageAuthentication;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** Properties of the Media Services account. */
@Fluent
public final class MediaServiceProperties {
    /*
     * The Media Services account ID.
     */
    @JsonProperty(value = "mediaServiceId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID mediaServiceId;

    /*
     * The storage accounts for this resource.
     */
    @JsonProperty(value = "storageAccounts")
    private List<StorageAccount> storageAccounts;

    /*
     * The storageAuthentication property.
     */
    @JsonProperty(value = "storageAuthentication")
    private StorageAuthentication storageAuthentication;

    /*
     * The account encryption properties.
     */
    @JsonProperty(value = "encryption")
    private AccountEncryption encryption;

    /*
     * The Key Delivery properties for Media Services account.
     */
    @JsonProperty(value = "keyDelivery")
    private KeyDelivery keyDelivery;

    /*
     * Whether or not public network access is allowed for resources under the
     * Media Services account.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Get the mediaServiceId property: The Media Services account ID.
     *
     * @return the mediaServiceId value.
     */
    public UUID mediaServiceId() {
        return this.mediaServiceId;
    }

    /**
     * Get the storageAccounts property: The storage accounts for this resource.
     *
     * @return the storageAccounts value.
     */
    public List<StorageAccount> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the storageAccounts property: The storage accounts for this resource.
     *
     * @param storageAccounts the storageAccounts value to set.
     * @return the MediaServiceProperties object itself.
     */
    public MediaServiceProperties withStorageAccounts(List<StorageAccount> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the storageAuthentication property: The storageAuthentication property.
     *
     * @return the storageAuthentication value.
     */
    public StorageAuthentication storageAuthentication() {
        return this.storageAuthentication;
    }

    /**
     * Set the storageAuthentication property: The storageAuthentication property.
     *
     * @param storageAuthentication the storageAuthentication value to set.
     * @return the MediaServiceProperties object itself.
     */
    public MediaServiceProperties withStorageAuthentication(StorageAuthentication storageAuthentication) {
        this.storageAuthentication = storageAuthentication;
        return this;
    }

    /**
     * Get the encryption property: The account encryption properties.
     *
     * @return the encryption value.
     */
    public AccountEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The account encryption properties.
     *
     * @param encryption the encryption value to set.
     * @return the MediaServiceProperties object itself.
     */
    public MediaServiceProperties withEncryption(AccountEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the keyDelivery property: The Key Delivery properties for Media Services account.
     *
     * @return the keyDelivery value.
     */
    public KeyDelivery keyDelivery() {
        return this.keyDelivery;
    }

    /**
     * Set the keyDelivery property: The Key Delivery properties for Media Services account.
     *
     * @param keyDelivery the keyDelivery value to set.
     * @return the MediaServiceProperties object itself.
     */
    public MediaServiceProperties withKeyDelivery(KeyDelivery keyDelivery) {
        this.keyDelivery = keyDelivery;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for resources under the
     * Media Services account.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for resources under the
     * Media Services account.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the MediaServiceProperties object itself.
     */
    public MediaServiceProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageAccounts() != null) {
            storageAccounts().forEach(e -> e.validate());
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (keyDelivery() != null) {
            keyDelivery().validate();
        }
    }
}