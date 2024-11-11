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
@JsonAdapter(ToolsCountryInfoV2DataDistrictsDescription.Adapter.class)
public enum ToolsCountryInfoV2DataDistrictsDescription {
  
  COUNTRY("COUNTRY"),
  
  STATE("STATE"),
  
  REGION("REGION");

  private String value;

  ToolsCountryInfoV2DataDistrictsDescription(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsCountryInfoV2DataDistrictsDescription fromValue(String value) {
    for (ToolsCountryInfoV2DataDistrictsDescription b : ToolsCountryInfoV2DataDistrictsDescription.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsCountryInfoV2DataDistrictsDescription> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsCountryInfoV2DataDistrictsDescription enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsCountryInfoV2DataDistrictsDescription read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsCountryInfoV2DataDistrictsDescription.fromValue(value);
    }
  }
}

