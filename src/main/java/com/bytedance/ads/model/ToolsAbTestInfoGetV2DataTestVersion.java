/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(ToolsAbTestInfoGetV2DataTestVersion.Adapter.class)
public enum ToolsAbTestInfoGetV2DataTestVersion {
  
  V1("V1"),
  
  V2("V2");

  private String value;

  ToolsAbTestInfoGetV2DataTestVersion(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAbTestInfoGetV2DataTestVersion fromValue(String value) {
    for (ToolsAbTestInfoGetV2DataTestVersion b : ToolsAbTestInfoGetV2DataTestVersion.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAbTestInfoGetV2DataTestVersion> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAbTestInfoGetV2DataTestVersion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAbTestInfoGetV2DataTestVersion read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAbTestInfoGetV2DataTestVersion.fromValue(value);
    }
  }
}

