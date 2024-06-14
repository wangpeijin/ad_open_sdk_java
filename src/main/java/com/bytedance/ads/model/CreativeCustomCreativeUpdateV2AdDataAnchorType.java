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
@JsonAdapter(CreativeCustomCreativeUpdateV2AdDataAnchorType.Adapter.class)
public enum CreativeCustomCreativeUpdateV2AdDataAnchorType {
  
  APP_GAME("APP_GAME"),
  
  INSURANCE("INSURANCE"),
  
  APP_INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  PRIVATE_CHAT("PRIVATE_CHAT"),
  
  ONLINE_SUBSCRIBE("ONLINE_SUBSCRIBE"),
  
  APP_SHOP("APP_SHOP"),
  
  SHOPPING_CART("SHOPPING_CART");

  private String value;

  CreativeCustomCreativeUpdateV2AdDataAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeCustomCreativeUpdateV2AdDataAnchorType fromValue(String value) {
    for (CreativeCustomCreativeUpdateV2AdDataAnchorType b : CreativeCustomCreativeUpdateV2AdDataAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeCustomCreativeUpdateV2AdDataAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeCustomCreativeUpdateV2AdDataAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeCustomCreativeUpdateV2AdDataAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeCustomCreativeUpdateV2AdDataAnchorType.fromValue(value);
    }
  }
}

