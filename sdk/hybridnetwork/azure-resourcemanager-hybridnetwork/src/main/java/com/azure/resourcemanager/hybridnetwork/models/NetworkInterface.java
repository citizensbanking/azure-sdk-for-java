// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network interface properties. */
@Fluent
public final class NetworkInterface {
    /*
     * The name of the network interface.
     */
    @JsonProperty(value = "networkInterfaceName")
    private String networkInterfaceName;

    /*
     * The MAC address of the network interface.
     */
    @JsonProperty(value = "macAddress")
    private String macAddress;

    /*
     * A list of IP configurations of the network interface.
     */
    @JsonProperty(value = "ipConfigurations")
    private List<NetworkInterfaceIpConfiguration> ipConfigurations;

    /*
     * The type of the VM switch.
     */
    @JsonProperty(value = "vmSwitchType")
    private VMSwitchType vmSwitchType;

    /** Creates an instance of NetworkInterface class. */
    public NetworkInterface() {
    }

    /**
     * Get the networkInterfaceName property: The name of the network interface.
     *
     * @return the networkInterfaceName value.
     */
    public String networkInterfaceName() {
        return this.networkInterfaceName;
    }

    /**
     * Set the networkInterfaceName property: The name of the network interface.
     *
     * @param networkInterfaceName the networkInterfaceName value to set.
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface withNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }

    /**
     * Get the macAddress property: The MAC address of the network interface.
     *
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Set the macAddress property: The MAC address of the network interface.
     *
     * @param macAddress the macAddress value to set.
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get the ipConfigurations property: A list of IP configurations of the network interface.
     *
     * @return the ipConfigurations value.
     */
    public List<NetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: A list of IP configurations of the network interface.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface withIpConfigurations(List<NetworkInterfaceIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the vmSwitchType property: The type of the VM switch.
     *
     * @return the vmSwitchType value.
     */
    public VMSwitchType vmSwitchType() {
        return this.vmSwitchType;
    }

    /**
     * Set the vmSwitchType property: The type of the VM switch.
     *
     * @param vmSwitchType the vmSwitchType value to set.
     * @return the NetworkInterface object itself.
     */
    public NetworkInterface withVmSwitchType(VMSwitchType vmSwitchType) {
        this.vmSwitchType = vmSwitchType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
