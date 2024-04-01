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
@JsonAdapter(CreativeStatusUpdateV2V2OptStatus.Adapter.class)
public enum CreativeStatusUpdateV2V2OptStatus {
  
  DELETE("delete"),
  
  ENABLE("enable"),
  
  DISABLE("disable");

  private String value;

  CreativeStatusUpdateV2V2OptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeStatusUpdateV2V2OptStatus fromValue(String value) {
    for (CreativeStatusUpdateV2V2OptStatus b : CreativeStatusUpdateV2V2OptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeStatusUpdateV2V2OptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeStatusUpdateV2V2OptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeStatusUpdateV2V2OptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeStatusUpdateV2V2OptStatus.fromValue(value);
    }
  }
}

