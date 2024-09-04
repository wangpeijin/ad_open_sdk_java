/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
@JsonAdapter(ToolsLandingGroupGetV2DataListSitesSiteOptStatus.Adapter.class)
public enum ToolsLandingGroupGetV2DataListSitesSiteOptStatus {
  
  ENABLE("SITE_OPT_STATUS_ENABLE"),
  
  DISABLE("SITE_OPT_STATUS_DISABLE");

  private String value;

  ToolsLandingGroupGetV2DataListSitesSiteOptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsLandingGroupGetV2DataListSitesSiteOptStatus fromValue(String value) {
    for (ToolsLandingGroupGetV2DataListSitesSiteOptStatus b : ToolsLandingGroupGetV2DataListSitesSiteOptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsLandingGroupGetV2DataListSitesSiteOptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsLandingGroupGetV2DataListSitesSiteOptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsLandingGroupGetV2DataListSitesSiteOptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsLandingGroupGetV2DataListSitesSiteOptStatus.fromValue(value);
    }
  }
}

