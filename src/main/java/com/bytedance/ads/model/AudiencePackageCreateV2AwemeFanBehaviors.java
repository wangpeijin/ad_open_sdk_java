/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(AudiencePackageCreateV2AwemeFanBehaviors.Adapter.class)
public enum AudiencePackageCreateV2AwemeFanBehaviors {
  
  FOLLOWED_USER("FOLLOWED_USER"),
  
  SHARED_USER("SHARED_USER"),
  
  LIVE_GOODS_ORDER("LIVE_GOODS_ORDER"),
  
  LIVE_EFFECTIVE_WATCH("LIVE_EFFECTIVE_WATCH"),
  
  LIVE_COMMENT("LIVE_COMMENT"),
  
  LIKED_USER("LIKED_USER"),
  
  GOODS_CARTS_CLICK("GOODS_CARTS_CLICK"),
  
  LIVE_WATCH("LIVE_WATCH"),
  
  GOODS_CARTS_ORDER("GOODS_CARTS_ORDER"),
  
  LIVE_EXCEPTIONAL("LIVE_EXCEPTIONAL"),
  
  LIVE_GOODS_CLICK("LIVE_GOODS_CLICK"),
  
  COMMENTED_USER("COMMENTED_USER");

  private String value;

  AudiencePackageCreateV2AwemeFanBehaviors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageCreateV2AwemeFanBehaviors fromValue(String value) {
    for (AudiencePackageCreateV2AwemeFanBehaviors b : AudiencePackageCreateV2AwemeFanBehaviors.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageCreateV2AwemeFanBehaviors> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageCreateV2AwemeFanBehaviors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageCreateV2AwemeFanBehaviors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageCreateV2AwemeFanBehaviors.fromValue(value);
    }
  }
}

