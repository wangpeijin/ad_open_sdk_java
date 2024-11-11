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
@JsonAdapter(DiagnosisTaskAdvListV2Results.Adapter.class)
public enum DiagnosisTaskAdvListV2Results {
  
  AD_HIGH_QUALITY_MATERIAL("AD_HIGH_QUALITY_MATERIAL"),
  
  ECP_HIGH_QUALITY_MATERIAL("ECP_HIGH_QUALITY_MATERIAL"),
  
  FIRST_PUBLISH_MATERIAL("FIRST_PUBLISH_MATERIAL"),
  
  INEFFICIENT_MATERIAL("INEFFICIENT_MATERIAL"),
  
  NON_AD_HIGH_QUALITY_MATERIAL("NON_AD_HIGH_QUALITY_MATERIAL"),
  
  NON_ECP_HIGH_QUALITY_MATERIAL("NON_ECP_HIGH_QUALITY_MATERIAL"),
  
  NON_FIRST_PUBLISH_MATERIAL("NON_FIRST_PUBLISH_MATERIAL"),
  
  NON_INEFFICIENT_MATERIAL("NON_INEFFICIENT_MATERIAL");

  private String value;

  DiagnosisTaskAdvListV2Results(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAdvListV2Results fromValue(String value) {
    for (DiagnosisTaskAdvListV2Results b : DiagnosisTaskAdvListV2Results.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAdvListV2Results> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAdvListV2Results enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAdvListV2Results read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAdvListV2Results.fromValue(value);
    }
  }
}

