/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@JsonAdapter(ReportRubeexGetV2FilteringPlayableType.Adapter.class)
public enum ReportRubeexGetV2FilteringPlayableType {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l);

  private Long value;

  ReportRubeexGetV2FilteringPlayableType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportRubeexGetV2FilteringPlayableType fromValue(Long value) {
    for (ReportRubeexGetV2FilteringPlayableType b : ReportRubeexGetV2FilteringPlayableType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportRubeexGetV2FilteringPlayableType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportRubeexGetV2FilteringPlayableType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportRubeexGetV2FilteringPlayableType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ReportRubeexGetV2FilteringPlayableType.fromValue(value);
    }
  }
}
