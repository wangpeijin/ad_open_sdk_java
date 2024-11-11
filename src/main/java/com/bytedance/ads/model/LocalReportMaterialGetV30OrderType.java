/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(LocalReportMaterialGetV30OrderType.Adapter.class)
public enum LocalReportMaterialGetV30OrderType {
  
  ASC("ASC"),
  
  DESC("DESC");

  private String value;

  LocalReportMaterialGetV30OrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalReportMaterialGetV30OrderType fromValue(String value) {
    for (LocalReportMaterialGetV30OrderType b : LocalReportMaterialGetV30OrderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalReportMaterialGetV30OrderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalReportMaterialGetV30OrderType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalReportMaterialGetV30OrderType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalReportMaterialGetV30OrderType.fromValue(value);
    }
  }
}

