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
@JsonAdapter(ToolsAwemeSimilarAuthorSearchV2Behaviors.Adapter.class)
public enum ToolsAwemeSimilarAuthorSearchV2Behaviors {
  
  COMMENTED_USER("COMMENTED_USER"),
  
  FOLLOWED_USER("FOLLOWED_USER"),
  
  GOODS_CARTS_CLICK("GOODS_CARTS_CLICK"),
  
  GOODS_CARTS_ORDER("GOODS_CARTS_ORDER"),
  
  LIKED_USER("LIKED_USER"),
  
  LIVE_COMMENT("LIVE_COMMENT"),
  
  LIVE_EFFECTIVE_WATCH("LIVE_EFFECTIVE_WATCH"),
  
  LIVE_EXCEPTIONAL("LIVE_EXCEPTIONAL"),
  
  LIVE_GOODS_CLICK("LIVE_GOODS_CLICK"),
  
  LIVE_GOODS_ORDER("LIVE_GOODS_ORDER"),
  
  LIVE_WATCH("LIVE_WATCH"),
  
  SHARED_USER("SHARED_USER");

  private String value;

  ToolsAwemeSimilarAuthorSearchV2Behaviors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeSimilarAuthorSearchV2Behaviors fromValue(String value) {
    for (ToolsAwemeSimilarAuthorSearchV2Behaviors b : ToolsAwemeSimilarAuthorSearchV2Behaviors.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeSimilarAuthorSearchV2Behaviors> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeSimilarAuthorSearchV2Behaviors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeSimilarAuthorSearchV2Behaviors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeSimilarAuthorSearchV2Behaviors.fromValue(value);
    }
  }
}

