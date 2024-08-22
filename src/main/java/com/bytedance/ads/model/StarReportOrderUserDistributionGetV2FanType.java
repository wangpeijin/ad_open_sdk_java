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
@JsonAdapter(StarReportOrderUserDistributionGetV2FanType.Adapter.class)
public enum StarReportOrderUserDistributionGetV2FanType {
  
  ALL("ALL"),
  
  FANS("FANS"),
  
  NO_FANS("NO_FANS");

  private String value;

  StarReportOrderUserDistributionGetV2FanType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarReportOrderUserDistributionGetV2FanType fromValue(String value) {
    for (StarReportOrderUserDistributionGetV2FanType b : StarReportOrderUserDistributionGetV2FanType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarReportOrderUserDistributionGetV2FanType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarReportOrderUserDistributionGetV2FanType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarReportOrderUserDistributionGetV2FanType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarReportOrderUserDistributionGetV2FanType.fromValue(value);
    }
  }
}

