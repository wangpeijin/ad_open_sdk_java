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
@JsonAdapter(ToolsAdConvertQueryV2MarketingScene.Adapter.class)
public enum ToolsAdConvertQueryV2MarketingScene {
  
  NORMAL("NORMAL"),
  
  GAME_SUBSCRIBE("GAME_SUBSCRIBE"),
  
  GAME_PROMOTION("GAME_PROMOTION");

  private String value;

  ToolsAdConvertQueryV2MarketingScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertQueryV2MarketingScene fromValue(String value) {
    for (ToolsAdConvertQueryV2MarketingScene b : ToolsAdConvertQueryV2MarketingScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertQueryV2MarketingScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertQueryV2MarketingScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertQueryV2MarketingScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertQueryV2MarketingScene.fromValue(value);
    }
  }
}

