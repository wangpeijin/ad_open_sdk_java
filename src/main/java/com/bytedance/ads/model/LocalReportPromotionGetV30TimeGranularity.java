/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(LocalReportPromotionGetV30TimeGranularity.Adapter.class)
public enum LocalReportPromotionGetV30TimeGranularity {
  
  DAILY("TIME_GRANULARITY_DAILY"),
  
  HOURLY("TIME_GRANULARITY_HOURLY"),
  
  TOTAL("TIME_GRANULARITY_TOTAL");

  private String value;

  LocalReportPromotionGetV30TimeGranularity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalReportPromotionGetV30TimeGranularity fromValue(String value) {
    for (LocalReportPromotionGetV30TimeGranularity b : LocalReportPromotionGetV30TimeGranularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalReportPromotionGetV30TimeGranularity> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalReportPromotionGetV30TimeGranularity enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalReportPromotionGetV30TimeGranularity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalReportPromotionGetV30TimeGranularity.fromValue(value);
    }
  }
}

