/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork.Adapter.class)
public enum DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork {
  
  ALL("ALL"),
  
  Enum_5G("5G"),
  
  Enum_4G("4G"),
  
  Enum_3G("3G"),
  
  Enum_2G("2G"),
  
  WIFI("WIFI");

  private String value;

  DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork fromValue(String value) {
    for (DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork b : DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork.fromValue(value);
    }
  }
}

