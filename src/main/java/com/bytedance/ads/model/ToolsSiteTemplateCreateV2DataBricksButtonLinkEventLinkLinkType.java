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
@JsonAdapter(ToolsSiteTemplateCreateV2DataBricksButtonLinkEventLinkLinkType.Adapter.class)
public enum ToolsSiteTemplateCreateV2DataBricksButtonLinkEventLinkLinkType {
  
  QUICK_APP("QUICK_APP"),
  
  SCHEME("SCHEME"),
  
  URL("URL");

  private String value;

  ToolsSiteTemplateCreateV2DataBricksButtonLinkEventLinkLinkType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsSiteTemplateCreateV2DataBricksButtonLinkEventLinkLinkType fromValue(String value) {
    for (ToolsSiteTemplateCreateV2DataBricksButtonLinkEventLinkLinkType b : ToolsSiteTemplateCreateV2DataBricksButtonLinkEventLinkLinkType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsSiteTemplateCreateV2DataBricksButtonLinkEventLinkLinkType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsSiteTemplateCreateV2DataBricksButtonLinkEventLinkLinkType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsSiteTemplateCreateV2DataBricksButtonLinkEventLinkLinkType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsSiteTemplateCreateV2DataBricksButtonLinkEventLinkLinkType.fromValue(value);
    }
  }
}

