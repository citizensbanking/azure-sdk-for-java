// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.SubvolumeModel;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SubvolumesGetMetadataMockTests {
    @Test
    public void testGetMetadata() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"id\":\"dt\",\"name\":\"elqacslmot\",\"type\":\"bnfxofvc\",\"properties\":{\"path\":\"dirazf\",\"parentPath\":\"ejwabmdujtmvco\",\"size\":9128838673004505379,\"bytesUsed\":8297012461455476015,\"permissions\":\"buhhlkyqlt\",\"creationTimeStamp\":\"2021-08-25T14:45:36Z\",\"accessedTimeStamp\":\"2021-08-01T00:17:34Z\",\"modifiedTimeStamp\":\"2021-03-08T13:15:21Z\",\"changedTimeStamp\":\"2020-12-26T17:33:42Z\",\"provisioningState\":\"Succeeded\"}}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        NetAppFilesManager manager =
            NetAppFilesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SubvolumeModel response =
            manager
                .subvolumes()
                .getMetadata(
                    "eg", "amlbnseqacjjvpil", "uooqjagmdit", "ueio", "kjbsah", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dirazf", response.path());
        Assertions.assertEquals("ejwabmdujtmvco", response.parentPath());
        Assertions.assertEquals(9128838673004505379L, response.size());
        Assertions.assertEquals(8297012461455476015L, response.bytesUsed());
        Assertions.assertEquals("buhhlkyqlt", response.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-25T14:45:36Z"), response.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-01T00:17:34Z"), response.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-08T13:15:21Z"), response.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-26T17:33:42Z"), response.changedTimestamp());
        Assertions.assertEquals("Succeeded", response.provisioningState());
    }
}
