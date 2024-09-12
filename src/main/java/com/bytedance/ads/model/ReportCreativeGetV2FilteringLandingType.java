/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(ReportCreativeGetV2FilteringLandingType.Adapter.class)
public enum ReportCreativeGetV2FilteringLandingType {
  
  GOODS("GOODS"),
  
  QUICK_APP("QUICK_APP"),
  
  STORE("STORE"),
  
  LIVE("LIVE"),
  
  LINK("LINK"),
  
  AWEME("AWEME"),
  
  ARTICLE("ARTICLE"),
  
  DPA("DPA"),
  
  APP("APP"),
  
  SHOP("SHOP");

  private String value;

  ReportCreativeGetV2FilteringLandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2FilteringLandingType fromValue(String value) {
    for (ReportCreativeGetV2FilteringLandingType b : ReportCreativeGetV2FilteringLandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2FilteringLandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2FilteringLandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2FilteringLandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2FilteringLandingType.fromValue(value);
    }
  }
}

