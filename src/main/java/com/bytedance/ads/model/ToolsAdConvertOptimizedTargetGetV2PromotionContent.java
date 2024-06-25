/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
@JsonAdapter(ToolsAdConvertOptimizedTargetGetV2PromotionContent.Adapter.class)
public enum ToolsAdConvertOptimizedTargetGetV2PromotionContent {
  
  THIRD_PARTY("THIRD_PARTY"),
  
  LIVE_ROOM("LIVE_ROOM"),
  
  NORMAL("NORMAL"),
  
  QUICK_APP_URL("QUICK_APP_URL"),
  
  SHOP("SHOP"),
  
  GOODS_LINK("GOODS_LINK"),
  
  EXTERNAL_URL("EXTERNAL_URL"),
  
  MICRO_APP("MICRO_APP"),
  
  AWEME_HOME_PAGE("AWEME_HOME_PAGE"),
  
  DOWNLOAD_URL("DOWNLOAD_URL"),
  
  DOUYIN("DOUYIN");

  private String value;

  ToolsAdConvertOptimizedTargetGetV2PromotionContent(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertOptimizedTargetGetV2PromotionContent fromValue(String value) {
    for (ToolsAdConvertOptimizedTargetGetV2PromotionContent b : ToolsAdConvertOptimizedTargetGetV2PromotionContent.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertOptimizedTargetGetV2PromotionContent> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertOptimizedTargetGetV2PromotionContent enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertOptimizedTargetGetV2PromotionContent read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertOptimizedTargetGetV2PromotionContent.fromValue(value);
    }
  }
}

