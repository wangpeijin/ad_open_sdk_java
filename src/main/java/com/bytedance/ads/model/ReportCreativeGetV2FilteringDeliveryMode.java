/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(ReportCreativeGetV2FilteringDeliveryMode.Adapter.class)
public enum ReportCreativeGetV2FilteringDeliveryMode {
  
  STANDARD("STANDARD"),
  
  ADLAB_FREE("ADLAB_FREE");

  private String value;

  ReportCreativeGetV2FilteringDeliveryMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2FilteringDeliveryMode fromValue(String value) {
    for (ReportCreativeGetV2FilteringDeliveryMode b : ReportCreativeGetV2FilteringDeliveryMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2FilteringDeliveryMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2FilteringDeliveryMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2FilteringDeliveryMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2FilteringDeliveryMode.fromValue(value);
    }
  }
}

