// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.resourcemanager.machinelearning.models.AccountKeyDatastoreCredentials;
import com.azure.resourcemanager.machinelearning.models.AccountKeyDatastoreSecrets;
import com.azure.resourcemanager.machinelearning.models.AzureBlobDatastore;
import com.azure.resourcemanager.machinelearning.models.AzureDataLakeGen1Datastore;
import com.azure.resourcemanager.machinelearning.models.AzureDataLakeGen2Datastore;
import com.azure.resourcemanager.machinelearning.models.AzureFileDatastore;
import com.azure.resourcemanager.machinelearning.models.ServicePrincipalDatastoreCredentials;
import com.azure.resourcemanager.machinelearning.models.ServicePrincipalDatastoreSecrets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** Samples for Datastores CreateOrUpdate. */
public final class DatastoresCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Datastore/AzureDataLakeGen1WServicePrincipal/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate datastore (Azure Data Lake Gen1 w/ ServicePrincipal).
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateDatastoreAzureDataLakeGen1WServicePrincipal(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .datastores()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(
                new AzureDataLakeGen1Datastore()
                    .withDescription("string")
                    .withTags(mapOf("string", "string"))
                    .withCredentials(
                        new ServicePrincipalDatastoreCredentials()
                            .withAuthorityUrl("string")
                            .withClientId(UUID.fromString("00000000-1111-2222-3333-444444444444"))
                            .withResourceUrl("string")
                            .withSecrets(new ServicePrincipalDatastoreSecrets().withClientSecret("string"))
                            .withTenantId(UUID.fromString("00000000-1111-2222-3333-444444444444")))
                    .withStoreName("string"))
            .withSkipValidation(false)
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Datastore/AzureDataLakeGen2WServicePrincipal/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate datastore (Azure Data Lake Gen2 w/ Service Principal).
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateDatastoreAzureDataLakeGen2WServicePrincipal(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .datastores()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(
                new AzureDataLakeGen2Datastore()
                    .withDescription("string")
                    .withTags(mapOf("string", "string"))
                    .withCredentials(
                        new ServicePrincipalDatastoreCredentials()
                            .withAuthorityUrl("string")
                            .withClientId(UUID.fromString("00000000-1111-2222-3333-444444444444"))
                            .withResourceUrl("string")
                            .withSecrets(new ServicePrincipalDatastoreSecrets().withClientSecret("string"))
                            .withTenantId(UUID.fromString("00000000-1111-2222-3333-444444444444")))
                    .withAccountName("string")
                    .withEndpoint("string")
                    .withFilesystem("string")
                    .withProtocol("string"))
            .withSkipValidation(false)
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Datastore/AzureBlobWAccountKey/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate datastore (AzureBlob w/ AccountKey).
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateDatastoreAzureBlobWAccountKey(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .datastores()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(
                new AzureBlobDatastore()
                    .withDescription("string")
                    .withTags(mapOf("string", "string"))
                    .withCredentials(
                        new AccountKeyDatastoreCredentials()
                            .withSecrets(new AccountKeyDatastoreSecrets().withKey("string")))
                    .withAccountName("string")
                    .withContainerName("string")
                    .withEndpoint("core.windows.net")
                    .withProtocol("https"))
            .withSkipValidation(false)
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Datastore/AzureFileWAccountKey/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate datastore (Azure File store w/ AccountKey).
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateDatastoreAzureFileStoreWAccountKey(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .datastores()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(
                new AzureFileDatastore()
                    .withDescription("string")
                    .withTags(mapOf("string", "string"))
                    .withCredentials(
                        new AccountKeyDatastoreCredentials()
                            .withSecrets(new AccountKeyDatastoreSecrets().withKey("string")))
                    .withAccountName("string")
                    .withEndpoint("string")
                    .withFileShareName("string")
                    .withProtocol("string"))
            .withSkipValidation(false)
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}