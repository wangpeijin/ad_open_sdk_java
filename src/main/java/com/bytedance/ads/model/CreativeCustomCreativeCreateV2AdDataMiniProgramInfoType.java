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
@JsonAdapter(CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType.Adapter.class)
public enum CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType {
  
  TEMPLATE_APP("TEMPLATE_APP"),
  
  BYTE_APP("BYTE_APP"),
  
  BYTE_GAME("BYTE_GAME"),
  
  SHELL_APP("SHELL_APP");

  private String value;

  CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType fromValue(String value) {
    for (CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType b : CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType.fromValue(value);
    }
  }
}

