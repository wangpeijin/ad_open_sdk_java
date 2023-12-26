/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
@JsonAdapter(ToolsLandingGroupCreateV2ExperimentSiteType.Adapter.class)
public enum ToolsLandingGroupCreateV2ExperimentSiteType {
  
  OWN("OWN"),
  
  THIRD_PARTY("THIRD_PARTY");

  private String value;

  ToolsLandingGroupCreateV2ExperimentSiteType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsLandingGroupCreateV2ExperimentSiteType fromValue(String value) {
    for (ToolsLandingGroupCreateV2ExperimentSiteType b : ToolsLandingGroupCreateV2ExperimentSiteType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsLandingGroupCreateV2ExperimentSiteType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsLandingGroupCreateV2ExperimentSiteType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsLandingGroupCreateV2ExperimentSiteType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsLandingGroupCreateV2ExperimentSiteType.fromValue(value);
    }
  }
}

