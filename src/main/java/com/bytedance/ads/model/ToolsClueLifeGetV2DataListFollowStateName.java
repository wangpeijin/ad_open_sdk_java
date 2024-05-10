/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@JsonAdapter(ToolsClueLifeGetV2DataListFollowStateName.Adapter.class)
public enum ToolsClueLifeGetV2DataListFollowStateName {
  
  NOT_CALLED("NOT_CALLED"),
  
  NOT_ANSWERED("NOT_ANSWERED"),
  
  SHORT_ANSWERED("SHORT_ANSWERED"),
  
  ANSWERED("ANSWERED"),
  
  DEEP_ANSWERED("DEEP_ANSWERED");

  private String value;

  ToolsClueLifeGetV2DataListFollowStateName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueLifeGetV2DataListFollowStateName fromValue(String value) {
    for (ToolsClueLifeGetV2DataListFollowStateName b : ToolsClueLifeGetV2DataListFollowStateName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsClueLifeGetV2DataListFollowStateName> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueLifeGetV2DataListFollowStateName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueLifeGetV2DataListFollowStateName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueLifeGetV2DataListFollowStateName.fromValue(value);
    }
  }
}

