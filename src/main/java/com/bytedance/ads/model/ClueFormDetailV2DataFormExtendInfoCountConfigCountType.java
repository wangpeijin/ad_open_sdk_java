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
@JsonAdapter(ClueFormDetailV2DataFormExtendInfoCountConfigCountType.Adapter.class)
public enum ClueFormDetailV2DataFormExtendInfoCountConfigCountType {
  
  INCREMENT("COUNT_TYPE_INCREMENT"),
  
  DECREMENT("COUNT_TYPE_DECREMENT");

  private String value;

  ClueFormDetailV2DataFormExtendInfoCountConfigCountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueFormDetailV2DataFormExtendInfoCountConfigCountType fromValue(String value) {
    for (ClueFormDetailV2DataFormExtendInfoCountConfigCountType b : ClueFormDetailV2DataFormExtendInfoCountConfigCountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueFormDetailV2DataFormExtendInfoCountConfigCountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueFormDetailV2DataFormExtendInfoCountConfigCountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueFormDetailV2DataFormExtendInfoCountConfigCountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueFormDetailV2DataFormExtendInfoCountConfigCountType.fromValue(value);
    }
  }
}

