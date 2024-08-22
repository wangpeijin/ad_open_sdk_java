/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@JsonAdapter(ToolsSiteTemplateGetV2DataListBricksButtonEventType.Adapter.class)
public enum ToolsSiteTemplateGetV2DataListBricksButtonEventType {
  
  APPOINT_EVENT("APPOINT_EVENT"),
  
  DOWNLOAD_EVENT("DOWNLOAD_EVENT"),
  
  LINK_EVENT("LINK_EVENT"),
  
  TELEPHONE_EVENT("TELEPHONE_EVENT");

  private String value;

  ToolsSiteTemplateGetV2DataListBricksButtonEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsSiteTemplateGetV2DataListBricksButtonEventType fromValue(String value) {
    for (ToolsSiteTemplateGetV2DataListBricksButtonEventType b : ToolsSiteTemplateGetV2DataListBricksButtonEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsSiteTemplateGetV2DataListBricksButtonEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsSiteTemplateGetV2DataListBricksButtonEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsSiteTemplateGetV2DataListBricksButtonEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsSiteTemplateGetV2DataListBricksButtonEventType.fromValue(value);
    }
  }
}

