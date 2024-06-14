/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial.Adapter.class)
public enum DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial {
  
  NO("NO"),
  
  UNKNOWN("UNKNOWN"),
  
  YES("YES");

  private String value;

  DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial fromValue(String value) {
    for (DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial b : DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial.fromValue(value);
    }
  }
}

