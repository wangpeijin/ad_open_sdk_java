/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(ToolsAwemeAuthV2AuthType.Adapter.class)
public enum ToolsAwemeAuthV2AuthType {
  
  AWEME_ACCOUNT("AWEME_ACCOUNT"),
  
  AWEME_HOMEPAGE("AWEME_HOMEPAGE"),
  
  LIVE_ACCOUNT("LIVE_ACCOUNT"),
  
  VIDEO_ITEM("VIDEO_ITEM");

  private String value;

  ToolsAwemeAuthV2AuthType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeAuthV2AuthType fromValue(String value) {
    for (ToolsAwemeAuthV2AuthType b : ToolsAwemeAuthV2AuthType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeAuthV2AuthType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeAuthV2AuthType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeAuthV2AuthType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeAuthV2AuthType.fromValue(value);
    }
  }
}

