// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.healthcareapis.models.FhirService;
import java.util.HashMap;
import java.util.Map;

/** Samples for FhirServices Update. */
public final class FhirServicesUpdateSamples {
    /*
     * x-ms-original-file: specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2021-11-01/examples/fhirservices/FhirServices_Patch.json
     */
    /**
     * Sample code: Update a Fhir Service.
     *
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void updateAFhirService(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        FhirService resource =
            manager.fhirServices().getWithResponse("testRG", "workspace1", "fhirservice1", Context.NONE).getValue();
        resource.update().withTags(mapOf("tagKey", "tagValue")).apply();
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