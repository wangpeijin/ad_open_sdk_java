/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
@JsonAdapter(DouplusOrderListV30FilterSceneType.Adapter.class)
public enum DouplusOrderListV30FilterSceneType {
  
  LIVE("LIVE"),
  
  VIDEO("VIDEO");

  private String value;

  DouplusOrderListV30FilterSceneType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderListV30FilterSceneType fromValue(String value) {
    for (DouplusOrderListV30FilterSceneType b : DouplusOrderListV30FilterSceneType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DouplusOrderListV30FilterSceneType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderListV30FilterSceneType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderListV30FilterSceneType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderListV30FilterSceneType.fromValue(value);
    }
  }
}

