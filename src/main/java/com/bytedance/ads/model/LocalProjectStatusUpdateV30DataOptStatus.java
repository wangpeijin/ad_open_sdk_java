/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.21
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
@JsonAdapter(LocalProjectStatusUpdateV30DataOptStatus.Adapter.class)
public enum LocalProjectStatusUpdateV30DataOptStatus {
  
  ENABLE("ENABLE"),
  
  PAUSED("PAUSED");

  private String value;

  LocalProjectStatusUpdateV30DataOptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectStatusUpdateV30DataOptStatus fromValue(String value) {
    for (LocalProjectStatusUpdateV30DataOptStatus b : LocalProjectStatusUpdateV30DataOptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectStatusUpdateV30DataOptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectStatusUpdateV30DataOptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectStatusUpdateV30DataOptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectStatusUpdateV30DataOptStatus.fromValue(value);
    }
  }
}
