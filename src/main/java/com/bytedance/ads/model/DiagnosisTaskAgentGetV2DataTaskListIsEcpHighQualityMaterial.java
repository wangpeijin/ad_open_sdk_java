/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial.Adapter.class)
public enum DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial {
  
  NO("NO"),
  
  UNKNOWN("UNKNOWN"),
  
  YES("YES");

  private String value;

  DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial fromValue(String value) {
    for (DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial b : DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial.fromValue(value);
    }
  }
}

