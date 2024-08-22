/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@JsonAdapter(ReportRtaGetV2OrderField.Adapter.class)
public enum ReportRtaGetV2OrderField {
  
  STAT_COST("stat_cost"),
  
  SHOW_CNT("show_cnt"),
  
  CLICK_CNT("click_cnt"),
  
  CONVERT_CNT("convert_cnt");

  private String value;

  ReportRtaGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportRtaGetV2OrderField fromValue(String value) {
    for (ReportRtaGetV2OrderField b : ReportRtaGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportRtaGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportRtaGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportRtaGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportRtaGetV2OrderField.fromValue(value);
    }
  }
}

