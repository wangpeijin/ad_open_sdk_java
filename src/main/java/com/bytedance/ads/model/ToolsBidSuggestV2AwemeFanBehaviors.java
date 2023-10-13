/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(ToolsBidSuggestV2AwemeFanBehaviors.Adapter.class)
public enum ToolsBidSuggestV2AwemeFanBehaviors {
  
  FOLLOWED_USER("FOLLOWED_USER"),
  
  GOODS_CARTS_ORDER("GOODS_CARTS_ORDER"),
  
  LIVE_EFFECTIVE_WATCH("LIVE_EFFECTIVE_WATCH"),
  
  COMMENTED_USER("COMMENTED_USER"),
  
  LIVE_COMMENT("LIVE_COMMENT"),
  
  LIVE_WATCH("LIVE_WATCH"),
  
  LIVE_EXCEPTIONAL("LIVE_EXCEPTIONAL"),
  
  SHARED_USER("SHARED_USER"),
  
  LIVE_GOODS_CLICK("LIVE_GOODS_CLICK"),
  
  LIVE_GOODS_ORDER("LIVE_GOODS_ORDER"),
  
  GOODS_CARTS_CLICK("GOODS_CARTS_CLICK"),
  
  LIKED_USER("LIKED_USER");

  private String value;

  ToolsBidSuggestV2AwemeFanBehaviors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2AwemeFanBehaviors fromValue(String value) {
    for (ToolsBidSuggestV2AwemeFanBehaviors b : ToolsBidSuggestV2AwemeFanBehaviors.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2AwemeFanBehaviors> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2AwemeFanBehaviors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2AwemeFanBehaviors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2AwemeFanBehaviors.fromValue(value);
    }
  }
}

