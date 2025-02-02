// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Communication.SMSReceived event. */
@Fluent
public final class AcsSmsReceivedEventData extends AcsSmsEventBaseProperties {
    /*
     * The SMS content
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The time at which the SMS was received
     */
    @JsonProperty(value = "receivedTimestamp")
    private OffsetDateTime receivedTimestamp;

    /** Creates an instance of AcsSmsReceivedEventData class. */
    public AcsSmsReceivedEventData() {}

    /**
     * Get the message property: The SMS content.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The SMS content.
     *
     * @param message the message value to set.
     * @return the AcsSmsReceivedEventData object itself.
     */
    public AcsSmsReceivedEventData setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the receivedTimestamp property: The time at which the SMS was received.
     *
     * @return the receivedTimestamp value.
     */
    public OffsetDateTime getReceivedTimestamp() {
        return this.receivedTimestamp;
    }

    /**
     * Set the receivedTimestamp property: The time at which the SMS was received.
     *
     * @param receivedTimestamp the receivedTimestamp value to set.
     * @return the AcsSmsReceivedEventData object itself.
     */
    public AcsSmsReceivedEventData setReceivedTimestamp(OffsetDateTime receivedTimestamp) {
        this.receivedTimestamp = receivedTimestamp;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsSmsReceivedEventData setMessageId(String messageId) {
        super.setMessageId(messageId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsSmsReceivedEventData setFrom(String from) {
        super.setFrom(from);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsSmsReceivedEventData setTo(String to) {
        super.setTo(to);
        return this;
    }
}
