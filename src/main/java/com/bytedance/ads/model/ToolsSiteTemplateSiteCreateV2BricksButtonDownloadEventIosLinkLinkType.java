/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventIosLinkLinkType.Adapter.class)
public enum ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventIosLinkLinkType {
  
  QUICK_APP("QUICK_APP"),
  
  SCHEME("SCHEME"),
  
  URL("URL");

  private String value;

  ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventIosLinkLinkType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventIosLinkLinkType fromValue(String value) {
    for (ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventIosLinkLinkType b : ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventIosLinkLinkType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventIosLinkLinkType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventIosLinkLinkType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventIosLinkLinkType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsSiteTemplateSiteCreateV2BricksButtonDownloadEventIosLinkLinkType.fromValue(value);
    }
  }
}

