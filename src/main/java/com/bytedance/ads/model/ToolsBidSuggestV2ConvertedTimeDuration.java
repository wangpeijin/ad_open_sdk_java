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
@JsonAdapter(ToolsBidSuggestV2ConvertedTimeDuration.Adapter.class)
public enum ToolsBidSuggestV2ConvertedTimeDuration {
  
  THREE_MONTH("THREE_MONTH"),
  
  SEVEN_DAY("SEVEN_DAY"),
  
  NONE("NONE"),
  
  TODAY("TODAY"),
  
  ONE_MONTH("ONE_MONTH"),
  
  TWELVE_MONTH("TWELVE_MONTH"),
  
  SIX_MONTH("SIX_MONTH");

  private String value;

  ToolsBidSuggestV2ConvertedTimeDuration(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2ConvertedTimeDuration fromValue(String value) {
    for (ToolsBidSuggestV2ConvertedTimeDuration b : ToolsBidSuggestV2ConvertedTimeDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2ConvertedTimeDuration> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2ConvertedTimeDuration enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2ConvertedTimeDuration read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2ConvertedTimeDuration.fromValue(value);
    }
  }
}

