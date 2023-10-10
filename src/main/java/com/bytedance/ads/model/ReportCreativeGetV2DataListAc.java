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
@JsonAdapter(ReportCreativeGetV2DataListAc.Adapter.class)
public enum ReportCreativeGetV2DataListAc {
  
  Enum_3G("3G"),
  
  WIFI("WIFI"),
  
  UNKNOWN("unknown"),
  
  Enum_5G("5G"),
  
  Enum_2G("2G"),
  
  Enum_4G("4G");

  private String value;

  ReportCreativeGetV2DataListAc(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2DataListAc fromValue(String value) {
    for (ReportCreativeGetV2DataListAc b : ReportCreativeGetV2DataListAc.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2DataListAc> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2DataListAc enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2DataListAc read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2DataListAc.fromValue(value);
    }
  }
}
