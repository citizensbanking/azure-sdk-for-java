// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List document classifiers response object. */
@Immutable
public final class GetDocumentClassifiersResponse {
    /*
     * List of document classifiers.
     */
    @JsonProperty(value = "value", required = true)
    private List<DocumentClassifierDetails> value;

    /*
     * Link to the next page of document classifiers.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of GetDocumentClassifiersResponse class.
     *
     * @param value the value value to set.
     */
    @JsonCreator
    private GetDocumentClassifiersResponse(
            @JsonProperty(value = "value", required = true) List<DocumentClassifierDetails> value) {
        this.value = value;
    }

    /**
     * Get the value property: List of document classifiers.
     *
     * @return the value value.
     */
    public List<DocumentClassifierDetails> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to the next page of document classifiers.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
