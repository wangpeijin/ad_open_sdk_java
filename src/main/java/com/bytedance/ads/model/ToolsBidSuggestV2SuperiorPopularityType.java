/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@JsonAdapter(ToolsBidSuggestV2SuperiorPopularityType.Adapter.class)
public enum ToolsBidSuggestV2SuperiorPopularityType {
  
  GAME("GAME"),
  
  NONE("NONE");

  private String value;

  ToolsBidSuggestV2SuperiorPopularityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2SuperiorPopularityType fromValue(String value) {
    for (ToolsBidSuggestV2SuperiorPopularityType b : ToolsBidSuggestV2SuperiorPopularityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2SuperiorPopularityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2SuperiorPopularityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2SuperiorPopularityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2SuperiorPopularityType.fromValue(value);
    }
  }
}

