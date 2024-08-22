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
@JsonAdapter(ToolsSiteGetV2Status.Adapter.class)
public enum ToolsSiteGetV2Status {
  
  ALL("SITE_ALL"),
  
  ONLINE("SITE_ONLINE"),
  
  OFFLINE("SITE_OFFLINE"),
  
  REJECTED("SITE_REJECTED"),
  
  TRASH("SITE_TRASH");

  private String value;

  ToolsSiteGetV2Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsSiteGetV2Status fromValue(String value) {
    for (ToolsSiteGetV2Status b : ToolsSiteGetV2Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsSiteGetV2Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsSiteGetV2Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsSiteGetV2Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsSiteGetV2Status.fromValue(value);
    }
  }
}

