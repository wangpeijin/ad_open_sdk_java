/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
@JsonAdapter(DpaVideoGetV2DataListVideoInfoStatus.Adapter.class)
public enum DpaVideoGetV2DataListVideoInfoStatus {
  
  UNAVAILABLE("UNAVAILABLE"),
  
  AVAILABLE("AVAILABLE");

  private String value;

  DpaVideoGetV2DataListVideoInfoStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaVideoGetV2DataListVideoInfoStatus fromValue(String value) {
    for (DpaVideoGetV2DataListVideoInfoStatus b : DpaVideoGetV2DataListVideoInfoStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DpaVideoGetV2DataListVideoInfoStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaVideoGetV2DataListVideoInfoStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaVideoGetV2DataListVideoInfoStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaVideoGetV2DataListVideoInfoStatus.fromValue(value);
    }
  }
}

