/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(PromotionCreateV30ShopMultiRoiGoalsShopPlatform.Adapter.class)
public enum PromotionCreateV30ShopMultiRoiGoalsShopPlatform {
  
  JD("JD"),
  
  OTHER("OTHER"),
  
  PDD("PDD"),
  
  TB("TB");

  private String value;

  PromotionCreateV30ShopMultiRoiGoalsShopPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionCreateV30ShopMultiRoiGoalsShopPlatform fromValue(String value) {
    for (PromotionCreateV30ShopMultiRoiGoalsShopPlatform b : PromotionCreateV30ShopMultiRoiGoalsShopPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionCreateV30ShopMultiRoiGoalsShopPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionCreateV30ShopMultiRoiGoalsShopPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionCreateV30ShopMultiRoiGoalsShopPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionCreateV30ShopMultiRoiGoalsShopPlatform.fromValue(value);
    }
  }
}

