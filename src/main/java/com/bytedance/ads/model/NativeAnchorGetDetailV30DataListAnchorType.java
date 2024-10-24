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
@JsonAdapter(NativeAnchorGetDetailV30DataListAnchorType.Adapter.class)
public enum NativeAnchorGetDetailV30DataListAnchorType {
  
  APP_GAME("APP_GAME"),
  
  APP_INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  APP_SHOP("APP_SHOP"),
  
  INSURANCE("INSURANCE"),
  
  MICRO_APP("MICRO_APP"),
  
  MICRO_GAME("MICRO_GAME"),
  
  ONLINE_SUBSCRIBE("ONLINE_SUBSCRIBE"),
  
  PRIVATE_CHAT("PRIVATE_CHAT"),
  
  SHOPPING_CART("SHOPPING_CART");

  private String value;

  NativeAnchorGetDetailV30DataListAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorGetDetailV30DataListAnchorType fromValue(String value) {
    for (NativeAnchorGetDetailV30DataListAnchorType b : NativeAnchorGetDetailV30DataListAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NativeAnchorGetDetailV30DataListAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorGetDetailV30DataListAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorGetDetailV30DataListAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorGetDetailV30DataListAnchorType.fromValue(value);
    }
  }
}

