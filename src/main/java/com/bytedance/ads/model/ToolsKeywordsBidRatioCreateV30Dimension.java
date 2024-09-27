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
@JsonAdapter(ToolsKeywordsBidRatioCreateV30Dimension.Adapter.class)
public enum ToolsKeywordsBidRatioCreateV30Dimension {
  
  ADVERTISER("ADVERTISER"),
  
  PROJECT("PROJECT");

  private String value;

  ToolsKeywordsBidRatioCreateV30Dimension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsKeywordsBidRatioCreateV30Dimension fromValue(String value) {
    for (ToolsKeywordsBidRatioCreateV30Dimension b : ToolsKeywordsBidRatioCreateV30Dimension.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsKeywordsBidRatioCreateV30Dimension> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsKeywordsBidRatioCreateV30Dimension enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsKeywordsBidRatioCreateV30Dimension read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsKeywordsBidRatioCreateV30Dimension.fromValue(value);
    }
  }
}

