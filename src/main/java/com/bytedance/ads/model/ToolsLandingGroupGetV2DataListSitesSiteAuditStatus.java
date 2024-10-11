/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(ToolsLandingGroupGetV2DataListSitesSiteAuditStatus.Adapter.class)
public enum ToolsLandingGroupGetV2DataListSitesSiteAuditStatus {
  
  AUDITING("AUDITING"),
  
  BANNED("BANNED"),
  
  UNKNOWN("UNKNOWN"),
  
  CREATED("CREATED"),
  
  REJECTED("REJECTED"),
  
  ACCEPTED("ACCEPTED");

  private String value;

  ToolsLandingGroupGetV2DataListSitesSiteAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsLandingGroupGetV2DataListSitesSiteAuditStatus fromValue(String value) {
    for (ToolsLandingGroupGetV2DataListSitesSiteAuditStatus b : ToolsLandingGroupGetV2DataListSitesSiteAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsLandingGroupGetV2DataListSitesSiteAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsLandingGroupGetV2DataListSitesSiteAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsLandingGroupGetV2DataListSitesSiteAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsLandingGroupGetV2DataListSitesSiteAuditStatus.fromValue(value);
    }
  }
}

