/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@JsonAdapter(ClueFormDetailV2DataFormElementsAllowEmpty.Adapter.class)
public enum ClueFormDetailV2DataFormElementsAllowEmpty {
  
  Enum_0("0"),
  
  Enum_1("1");

  private String value;

  ClueFormDetailV2DataFormElementsAllowEmpty(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueFormDetailV2DataFormElementsAllowEmpty fromValue(String value) {
    for (ClueFormDetailV2DataFormElementsAllowEmpty b : ClueFormDetailV2DataFormElementsAllowEmpty.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueFormDetailV2DataFormElementsAllowEmpty> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueFormDetailV2DataFormElementsAllowEmpty enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueFormDetailV2DataFormElementsAllowEmpty read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueFormDetailV2DataFormElementsAllowEmpty.fromValue(value);
    }
  }
}

