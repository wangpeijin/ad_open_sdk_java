/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(ReportAdvertiserGetV2TimeGranularity.Adapter.class)
public enum ReportAdvertiserGetV2TimeGranularity {
  
  MONTH("STAT_TIME_GRANULARITY_MONTH"),
  
  WEEK("STAT_TIME_GRANULARITY_WEEK"),
  
  DAILY("STAT_TIME_GRANULARITY_DAILY"),
  
  HOURLY("STAT_TIME_GRANULARITY_HOURLY");

  private String value;

  ReportAdvertiserGetV2TimeGranularity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdvertiserGetV2TimeGranularity fromValue(String value) {
    for (ReportAdvertiserGetV2TimeGranularity b : ReportAdvertiserGetV2TimeGranularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdvertiserGetV2TimeGranularity> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdvertiserGetV2TimeGranularity enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdvertiserGetV2TimeGranularity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdvertiserGetV2TimeGranularity.fromValue(value);
    }
  }
}

