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
@JsonAdapter(ToolsKeywordsBidRatioGetV30DataListDimension.Adapter.class)
public enum ToolsKeywordsBidRatioGetV30DataListDimension {
  
  ADVERTISER("ADVERTISER"),
  
  PROJECT("PROJECT");

  private String value;

  ToolsKeywordsBidRatioGetV30DataListDimension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsKeywordsBidRatioGetV30DataListDimension fromValue(String value) {
    for (ToolsKeywordsBidRatioGetV30DataListDimension b : ToolsKeywordsBidRatioGetV30DataListDimension.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsKeywordsBidRatioGetV30DataListDimension> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsKeywordsBidRatioGetV30DataListDimension enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsKeywordsBidRatioGetV30DataListDimension read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsKeywordsBidRatioGetV30DataListDimension.fromValue(value);
    }
  }
}

