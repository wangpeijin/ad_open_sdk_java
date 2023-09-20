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
@JsonAdapter(ToolsLandingGroupCreateV2DataSitesSiteOptStatus.Adapter.class)
public enum ToolsLandingGroupCreateV2DataSitesSiteOptStatus {
  
  DISABLE("SITE_OPT_STATUS_DISABLE"),
  
  ENABLE("SITE_OPT_STATUS_ENABLE");

  private String value;

  ToolsLandingGroupCreateV2DataSitesSiteOptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsLandingGroupCreateV2DataSitesSiteOptStatus fromValue(String value) {
    for (ToolsLandingGroupCreateV2DataSitesSiteOptStatus b : ToolsLandingGroupCreateV2DataSitesSiteOptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsLandingGroupCreateV2DataSitesSiteOptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsLandingGroupCreateV2DataSitesSiteOptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsLandingGroupCreateV2DataSitesSiteOptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsLandingGroupCreateV2DataSitesSiteOptStatus.fromValue(value);
    }
  }
}

