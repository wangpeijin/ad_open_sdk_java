/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(NativeAnchorGetV30DataListSource.Adapter.class)
public enum NativeAnchorGetV30DataListSource {
  
  AUTO("AUTO"),
  
  CUSTOM("CUSTOM"),
  
  REPLACE_DOWNLOAD("REPLACE_DOWNLOAD");

  private String value;

  NativeAnchorGetV30DataListSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorGetV30DataListSource fromValue(String value) {
    for (NativeAnchorGetV30DataListSource b : NativeAnchorGetV30DataListSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NativeAnchorGetV30DataListSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorGetV30DataListSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorGetV30DataListSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorGetV30DataListSource.fromValue(value);
    }
  }
}

