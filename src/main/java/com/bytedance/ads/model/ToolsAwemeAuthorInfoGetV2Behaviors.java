/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(ToolsAwemeAuthorInfoGetV2Behaviors.Adapter.class)
public enum ToolsAwemeAuthorInfoGetV2Behaviors {
  
  COMMENTED_USER("COMMENTED_USER"),
  
  LIVE_GOODS_ORDER("LIVE_GOODS_ORDER"),
  
  GOODS_CARTS_CLICK("GOODS_CARTS_CLICK"),
  
  LIVE_EFFECTIVE_WATCH("LIVE_EFFECTIVE_WATCH"),
  
  LIVE_GOODS_CLICK("LIVE_GOODS_CLICK"),
  
  LIVE_EXCEPTIONAL("LIVE_EXCEPTIONAL"),
  
  GOODS_CARTS_ORDER("GOODS_CARTS_ORDER"),
  
  LIVE_WATCH("LIVE_WATCH"),
  
  LIKED_USER("LIKED_USER"),
  
  LIVE_COMMENT("LIVE_COMMENT"),
  
  SHARED_USER("SHARED_USER"),
  
  FOLLOWED_USER("FOLLOWED_USER");

  private String value;

  ToolsAwemeAuthorInfoGetV2Behaviors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeAuthorInfoGetV2Behaviors fromValue(String value) {
    for (ToolsAwemeAuthorInfoGetV2Behaviors b : ToolsAwemeAuthorInfoGetV2Behaviors.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeAuthorInfoGetV2Behaviors> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeAuthorInfoGetV2Behaviors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeAuthorInfoGetV2Behaviors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeAuthorInfoGetV2Behaviors.fromValue(value);
    }
  }
}

