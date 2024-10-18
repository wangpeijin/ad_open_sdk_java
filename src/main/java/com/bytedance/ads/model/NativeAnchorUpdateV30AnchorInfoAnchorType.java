/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(NativeAnchorUpdateV30AnchorInfoAnchorType.Adapter.class)
public enum NativeAnchorUpdateV30AnchorInfoAnchorType {
  
  APP_GAME("APP_GAME"),
  
  APP_INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  APP_SHOP("APP_SHOP"),
  
  PRIVATE_CHAT("PRIVATE_CHAT"),
  
  SHOPPING_CART("SHOPPING_CART");

  private String value;

  NativeAnchorUpdateV30AnchorInfoAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorUpdateV30AnchorInfoAnchorType fromValue(String value) {
    for (NativeAnchorUpdateV30AnchorInfoAnchorType b : NativeAnchorUpdateV30AnchorInfoAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NativeAnchorUpdateV30AnchorInfoAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorUpdateV30AnchorInfoAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorUpdateV30AnchorInfoAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorUpdateV30AnchorInfoAnchorType.fromValue(value);
    }
  }
}

