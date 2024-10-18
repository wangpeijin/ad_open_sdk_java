/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(FileMaterialListV2MaterialSource.Adapter.class)
public enum FileMaterialListV2MaterialSource {
  
  AD("AD"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  FileMaterialListV2MaterialSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileMaterialListV2MaterialSource fromValue(String value) {
    for (FileMaterialListV2MaterialSource b : FileMaterialListV2MaterialSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileMaterialListV2MaterialSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileMaterialListV2MaterialSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileMaterialListV2MaterialSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileMaterialListV2MaterialSource.fromValue(value);
    }
  }
}

