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
@JsonAdapter(ToolsWechatAppletUpdateV30RecommendedRechargeTier.Adapter.class)
public enum ToolsWechatAppletUpdateV30RecommendedRechargeTier {
  
  ABOVE_200("ABOVE_200"),
  
  FROM_100_TO_200("FROM_100_TO_200"),
  
  FROM_FIFTY_TO_HUNDRED("FROM_FIFTY_TO_HUNDRED"),
  
  FROM_ONE_TO_FIFTY("FROM_ONE_TO_FIFTY");

  private String value;

  ToolsWechatAppletUpdateV30RecommendedRechargeTier(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsWechatAppletUpdateV30RecommendedRechargeTier fromValue(String value) {
    for (ToolsWechatAppletUpdateV30RecommendedRechargeTier b : ToolsWechatAppletUpdateV30RecommendedRechargeTier.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsWechatAppletUpdateV30RecommendedRechargeTier> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsWechatAppletUpdateV30RecommendedRechargeTier enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsWechatAppletUpdateV30RecommendedRechargeTier read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsWechatAppletUpdateV30RecommendedRechargeTier.fromValue(value);
    }
  }
}
