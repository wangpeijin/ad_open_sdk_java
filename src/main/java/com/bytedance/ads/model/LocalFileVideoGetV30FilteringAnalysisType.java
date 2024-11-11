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
@JsonAdapter(LocalFileVideoGetV30FilteringAnalysisType.Adapter.class)
public enum LocalFileVideoGetV30FilteringAnalysisType {
  
  FIRST_PUBLISH("FIRST_PUBLISH"),
  
  FIRST_PUBLISH_AND_HIGH_QUALITY("FIRST_PUBLISH_AND_HIGH_QUALITY"),
  
  HIGH_QUALITY("HIGH_QUALITY");

  private String value;

  LocalFileVideoGetV30FilteringAnalysisType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalFileVideoGetV30FilteringAnalysisType fromValue(String value) {
    for (LocalFileVideoGetV30FilteringAnalysisType b : LocalFileVideoGetV30FilteringAnalysisType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalFileVideoGetV30FilteringAnalysisType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalFileVideoGetV30FilteringAnalysisType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalFileVideoGetV30FilteringAnalysisType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalFileVideoGetV30FilteringAnalysisType.fromValue(value);
    }
  }
}

