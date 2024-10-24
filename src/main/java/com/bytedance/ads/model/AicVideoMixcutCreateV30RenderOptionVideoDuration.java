/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@JsonAdapter(AicVideoMixcutCreateV30RenderOptionVideoDuration.Adapter.class)
public enum AicVideoMixcutCreateV30RenderOptionVideoDuration {
  
  Enum_10_15S("DURATION_10_15S"),
  
  Enum_15_30S("DURATION_15_30S"),
  
  Enum_30_60S("DURATION_30_60S"),
  
  Enum_60S("DURATION_60S");

  private String value;

  AicVideoMixcutCreateV30RenderOptionVideoDuration(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AicVideoMixcutCreateV30RenderOptionVideoDuration fromValue(String value) {
    for (AicVideoMixcutCreateV30RenderOptionVideoDuration b : AicVideoMixcutCreateV30RenderOptionVideoDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AicVideoMixcutCreateV30RenderOptionVideoDuration> {
    @Override
    public void write(final JsonWriter jsonWriter, final AicVideoMixcutCreateV30RenderOptionVideoDuration enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AicVideoMixcutCreateV30RenderOptionVideoDuration read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AicVideoMixcutCreateV30RenderOptionVideoDuration.fromValue(value);
    }
  }
}

