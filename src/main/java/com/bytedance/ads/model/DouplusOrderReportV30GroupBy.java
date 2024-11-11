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
@JsonAdapter(DouplusOrderReportV30GroupBy.Adapter.class)
public enum DouplusOrderReportV30GroupBy {
  
  AD_ID("GROUP_BY_AD_ID"),
  
  CREATIVE_ID("GROUP_BY_CREATIVE_ID");

  private String value;

  DouplusOrderReportV30GroupBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderReportV30GroupBy fromValue(String value) {
    for (DouplusOrderReportV30GroupBy b : DouplusOrderReportV30GroupBy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DouplusOrderReportV30GroupBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderReportV30GroupBy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderReportV30GroupBy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderReportV30GroupBy.fromValue(value);
    }
  }
}

