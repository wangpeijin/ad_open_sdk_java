/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@JsonAdapter(NativeAnchorGetV30FilteringStatus.Adapter.class)
public enum NativeAnchorGetV30FilteringStatus {
  
  AUDIT_FAILD("AUDIT_FAILD"),
  
  AUDIT_SUCCESS("AUDIT_SUCCESS"),
  
  CREATE("CREATE"),
  
  DELETE("DELETE");

  private String value;

  NativeAnchorGetV30FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorGetV30FilteringStatus fromValue(String value) {
    for (NativeAnchorGetV30FilteringStatus b : NativeAnchorGetV30FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NativeAnchorGetV30FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorGetV30FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorGetV30FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorGetV30FilteringStatus.fromValue(value);
    }
  }
}

