// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for PartnerNamespaces GetByResourceGroup. */
public final class PartnerNamespacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-10-15-preview/examples/PartnerNamespaces_Get.json
     */
    /**
     * Sample code: PartnerNamespaces_Get.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerNamespacesGet(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .partnerNamespaces()
            .getByResourceGroupWithResponse("examplerg", "examplePartnerNamespaceName1", Context.NONE);
    }
}