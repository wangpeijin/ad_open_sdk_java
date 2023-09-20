/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(AdlabGroupUpdateStatusV30DataOptStatus.Adapter.class)
public enum AdlabGroupUpdateStatusV30DataOptStatus {
  
  DISABLED("DISABLED"),
  
  ENABLED("ENABLED");

  private String value;

  AdlabGroupUpdateStatusV30DataOptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupUpdateStatusV30DataOptStatus fromValue(String value) {
    for (AdlabGroupUpdateStatusV30DataOptStatus b : AdlabGroupUpdateStatusV30DataOptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdlabGroupUpdateStatusV30DataOptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupUpdateStatusV30DataOptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupUpdateStatusV30DataOptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupUpdateStatusV30DataOptStatus.fromValue(value);
    }
  }
}

