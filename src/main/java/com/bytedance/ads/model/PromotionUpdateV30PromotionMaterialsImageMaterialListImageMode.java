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
@JsonAdapter(PromotionUpdateV30PromotionMaterialsImageMaterialListImageMode.Adapter.class)
public enum PromotionUpdateV30PromotionMaterialsImageMaterialListImageMode {
  
  CREATIVE_IMAGE_MODE_CALIBRATION_FREE_SINGLE_IMAGE("CREATIVE_IMAGE_MODE_CALIBRATION_FREE_SINGLE_IMAGE"),
  
  CREATIVE_IMAGE_MODE_LARGE("CREATIVE_IMAGE_MODE_LARGE"),
  
  CREATIVE_IMAGE_MODE_LARGE_VERTICAL("CREATIVE_IMAGE_MODE_LARGE_VERTICAL"),
  
  CREATIVE_IMAGE_MODE_SMALL("CREATIVE_IMAGE_MODE_SMALL"),
  
  CREATIVE_IMAGE_MODE_UNION_SPLASH("CREATIVE_IMAGE_MODE_UNION_SPLASH"),
  
  SEARCH_AD_SMALL_IMAGE("SEARCH_AD_SMALL_IMAGE"),
  
  TOUTIAO_SEARCH_AD_IMAGE("TOUTIAO_SEARCH_AD_IMAGE");

  private String value;

  PromotionUpdateV30PromotionMaterialsImageMaterialListImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionUpdateV30PromotionMaterialsImageMaterialListImageMode fromValue(String value) {
    for (PromotionUpdateV30PromotionMaterialsImageMaterialListImageMode b : PromotionUpdateV30PromotionMaterialsImageMaterialListImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionUpdateV30PromotionMaterialsImageMaterialListImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionUpdateV30PromotionMaterialsImageMaterialListImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionUpdateV30PromotionMaterialsImageMaterialListImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionUpdateV30PromotionMaterialsImageMaterialListImageMode.fromValue(value);
    }
  }
}

