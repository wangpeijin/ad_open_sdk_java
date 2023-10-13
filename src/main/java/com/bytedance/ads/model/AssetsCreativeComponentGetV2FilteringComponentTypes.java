/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
@JsonAdapter(AssetsCreativeComponentGetV2FilteringComponentTypes.Adapter.class)
public enum AssetsCreativeComponentGetV2FilteringComponentTypes {
  
  CHOICE_MAGNET("CHOICE_MAGNET"),
  
  UNION_LIGHT_INTERACTIVE("UNION_LIGHT_INTERACTIVE"),
  
  COMMERCE_MAGNET("COMMERCE_MAGNET"),
  
  COUPON_MAGNET("COUPON_MAGNET"),
  
  VOTE_MAGNET("VOTE_MAGNET"),
  
  PROMOTION_CARD("PROMOTION_CARD"),
  
  LUCKY_BOX("LUCKY_BOX"),
  
  RESERVATION_BUTTON("RESERVATION_BUTTON"),
  
  LIGHT_INTER_ACTIVE("LIGHT_INTER_ACTIVE"),
  
  GAME_PACK("GAME_PACK"),
  
  IMAGE_MAGNET("IMAGE_MAGNET");

  private String value;

  AssetsCreativeComponentGetV2FilteringComponentTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetsCreativeComponentGetV2FilteringComponentTypes fromValue(String value) {
    for (AssetsCreativeComponentGetV2FilteringComponentTypes b : AssetsCreativeComponentGetV2FilteringComponentTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AssetsCreativeComponentGetV2FilteringComponentTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetsCreativeComponentGetV2FilteringComponentTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetsCreativeComponentGetV2FilteringComponentTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetsCreativeComponentGetV2FilteringComponentTypes.fromValue(value);
    }
  }
}

