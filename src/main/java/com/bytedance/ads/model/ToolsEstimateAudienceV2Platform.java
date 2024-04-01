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
@JsonAdapter(ToolsEstimateAudienceV2Platform.Adapter.class)
public enum ToolsEstimateAudienceV2Platform {
  
  ANDROID("ANDROID"),
  
  NONE("NONE"),
  
  IOS("IOS"),
  
  PC("PC"),
  
  IPAD("IPAD"),
  
  WAP("WAP");

  private String value;

  ToolsEstimateAudienceV2Platform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2Platform fromValue(String value) {
    for (ToolsEstimateAudienceV2Platform b : ToolsEstimateAudienceV2Platform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2Platform> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2Platform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2Platform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEstimateAudienceV2Platform.fromValue(value);
    }
  }
}

