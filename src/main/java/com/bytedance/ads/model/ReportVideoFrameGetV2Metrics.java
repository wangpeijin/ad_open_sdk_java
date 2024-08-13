/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(ReportVideoFrameGetV2Metrics.Adapter.class)
public enum ReportVideoFrameGetV2Metrics {
  
  CLICK_CNT("click_cnt"),
  
  DY_COMMENT("dy_comment"),
  
  DY_FOLLOW("dy_follow"),
  
  DY_LIKE("dy_like"),
  
  USER_LOSE_CNT("user_lose_cnt");

  private String value;

  ReportVideoFrameGetV2Metrics(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportVideoFrameGetV2Metrics fromValue(String value) {
    for (ReportVideoFrameGetV2Metrics b : ReportVideoFrameGetV2Metrics.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportVideoFrameGetV2Metrics> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportVideoFrameGetV2Metrics enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportVideoFrameGetV2Metrics read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportVideoFrameGetV2Metrics.fromValue(value);
    }
  }
}

