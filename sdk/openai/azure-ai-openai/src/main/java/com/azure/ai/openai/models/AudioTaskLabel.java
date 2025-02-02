// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines the possible descriptors for available audio operation responses. */
public final class AudioTaskLabel extends ExpandableStringEnum<AudioTaskLabel> {

    /** Accompanying response data resulted from an audio transcription task. */
    @Generated public static final AudioTaskLabel TRANSCRIBE = fromString("transcribe");

    /** Accompanying response data resulted from an audio translation task. */
    @Generated public static final AudioTaskLabel TRANSLATE = fromString("translate");

    /**
     * Creates a new instance of AudioTaskLabel value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AudioTaskLabel() {}

    /**
     * Creates or finds a AudioTaskLabel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AudioTaskLabel.
     */
    @Generated
    @JsonCreator
    public static AudioTaskLabel fromString(String name) {
        return fromString(name, AudioTaskLabel.class);
    }

    /**
     * Gets known AudioTaskLabel values.
     *
     * @return known AudioTaskLabel values.
     */
    @Generated
    public static Collection<AudioTaskLabel> values() {
        return values(AudioTaskLabel.class);
    }
}
