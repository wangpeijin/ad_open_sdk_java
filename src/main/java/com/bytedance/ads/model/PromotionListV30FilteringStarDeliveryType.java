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
@JsonAdapter(PromotionListV30FilteringStarDeliveryType.Adapter.class)
public enum PromotionListV30FilteringStarDeliveryType {
  
  NOT_STAR_DELIVERY("NOT_STAR_DELIVERY"),
  
  STAR_DELIVERY("STAR_DELIVERY");

  private String value;

  PromotionListV30FilteringStarDeliveryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30FilteringStarDeliveryType fromValue(String value) {
    for (PromotionListV30FilteringStarDeliveryType b : PromotionListV30FilteringStarDeliveryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionListV30FilteringStarDeliveryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30FilteringStarDeliveryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30FilteringStarDeliveryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30FilteringStarDeliveryType.fromValue(value);
    }
  }
}

