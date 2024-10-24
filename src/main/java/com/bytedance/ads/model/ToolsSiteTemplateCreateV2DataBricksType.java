/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@JsonAdapter(ToolsSiteTemplateCreateV2DataBricksType.Adapter.class)
public enum ToolsSiteTemplateCreateV2DataBricksType {
  
  BUTTON("BUTTON"),
  
  COUPON("COUPON"),
  
  FORM("FORM"),
  
  PICTURE("PICTURE"),
  
  PICTURE_GROUP("PICTURE_GROUP"),
  
  RICH_TEXT("RICH_TEXT"),
  
  SIMPLE_TEXT("SIMPLE_TEXT"),
  
  VIDEO("VIDEO"),
  
  WECHAT_APPLET("WECHAT_APPLET"),
  
  WECHAT_GAME("WECHAT_GAME");

  private String value;

  ToolsSiteTemplateCreateV2DataBricksType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsSiteTemplateCreateV2DataBricksType fromValue(String value) {
    for (ToolsSiteTemplateCreateV2DataBricksType b : ToolsSiteTemplateCreateV2DataBricksType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsSiteTemplateCreateV2DataBricksType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsSiteTemplateCreateV2DataBricksType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsSiteTemplateCreateV2DataBricksType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsSiteTemplateCreateV2DataBricksType.fromValue(value);
    }
  }
}

