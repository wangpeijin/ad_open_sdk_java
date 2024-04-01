/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(NativeAnchorCreateV30AnchorInfoGameAnchorGameType.Adapter.class)
public enum NativeAnchorCreateV30AnchorInfoGameAnchorGameType {
  
  GENERAL("GENERAL"),
  
  MICRO_GAME("MICRO_GAME");

  private String value;

  NativeAnchorCreateV30AnchorInfoGameAnchorGameType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorCreateV30AnchorInfoGameAnchorGameType fromValue(String value) {
    for (NativeAnchorCreateV30AnchorInfoGameAnchorGameType b : NativeAnchorCreateV30AnchorInfoGameAnchorGameType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NativeAnchorCreateV30AnchorInfoGameAnchorGameType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorCreateV30AnchorInfoGameAnchorGameType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorCreateV30AnchorInfoGameAnchorGameType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorCreateV30AnchorInfoGameAnchorGameType.fromValue(value);
    }
  }
}

