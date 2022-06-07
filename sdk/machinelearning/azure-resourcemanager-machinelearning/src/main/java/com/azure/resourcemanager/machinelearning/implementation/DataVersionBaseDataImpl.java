// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.DataVersionBaseDataInner;
import com.azure.resourcemanager.machinelearning.models.DataVersionBaseData;
import com.azure.resourcemanager.machinelearning.models.DataVersionBaseDetails;

public final class DataVersionBaseDataImpl
    implements DataVersionBaseData, DataVersionBaseData.Definition, DataVersionBaseData.Update {
    private DataVersionBaseDataInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public DataVersionBaseDetails properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DataVersionBaseDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String name;

    private String version;

    public DataVersionBaseDataImpl withExistingData(String resourceGroupName, String workspaceName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.name = name;
        return this;
    }

    public DataVersionBaseData create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataVersions()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, name, version, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataVersionBaseData create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataVersions()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, version, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataVersionBaseDataImpl(
        String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new DataVersionBaseDataInner();
        this.serviceManager = serviceManager;
        this.version = name;
    }

    public DataVersionBaseDataImpl update() {
        return this;
    }

    public DataVersionBaseData apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataVersions()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, name, version, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataVersionBaseData apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataVersions()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, version, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataVersionBaseDataImpl(
        DataVersionBaseDataInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "data");
        this.version = Utils.getValueFromIdByName(innerObject.id(), "versions");
    }

    public DataVersionBaseData refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataVersions()
                .getWithResponse(resourceGroupName, workspaceName, name, version, Context.NONE)
                .getValue();
        return this;
    }

    public DataVersionBaseData refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataVersions()
                .getWithResponse(resourceGroupName, workspaceName, name, version, context)
                .getValue();
        return this;
    }

    public DataVersionBaseDataImpl withProperties(DataVersionBaseDetails properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}