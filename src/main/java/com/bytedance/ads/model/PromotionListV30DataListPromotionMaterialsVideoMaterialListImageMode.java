/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode.Adapter.class)
public enum PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode {
  
  CREATIVE_IMAGE_MODE_AWEME_LIVE("CREATIVE_IMAGE_MODE_AWEME_LIVE"),
  
  CREATIVE_IMAGE_MODE_CALIBRATION_FREE_SINGLE_IMAGE("CREATIVE_IMAGE_MODE_CALIBRATION_FREE_SINGLE_IMAGE"),
  
  CREATIVE_IMAGE_MODE_CALIBRATION_FREE_VIDEO("CREATIVE_IMAGE_MODE_CALIBRATION_FREE_VIDEO"),
  
  CREATIVE_IMAGE_MODE_DISPLAY_WINDOW("CREATIVE_IMAGE_MODE_DISPLAY_WINDOW"),
  
  CREATIVE_IMAGE_MODE_GIF("CREATIVE_IMAGE_MODE_GIF"),
  
  CREATIVE_IMAGE_MODE_GROUP("CREATIVE_IMAGE_MODE_GROUP"),
  
  CREATIVE_IMAGE_MODE_LARGE("CREATIVE_IMAGE_MODE_LARGE"),
  
  CREATIVE_IMAGE_MODE_LARGE_VERTICAL("CREATIVE_IMAGE_MODE_LARGE_VERTICAL"),
  
  CREATIVE_IMAGE_MODE_PLAYABLE_HORIZONTAL("CREATIVE_IMAGE_MODE_PLAYABLE_HORIZONTAL"),
  
  CREATIVE_IMAGE_MODE_PLAYABLE_VERTICAL("CREATIVE_IMAGE_MODE_PLAYABLE_VERTICAL"),
  
  CREATIVE_IMAGE_MODE_SMALL("CREATIVE_IMAGE_MODE_SMALL"),
  
  CREATIVE_IMAGE_MODE_UNION_SPLASH("CREATIVE_IMAGE_MODE_UNION_SPLASH"),
  
  CREATIVE_IMAGE_MODE_UNION_SPLASH_VIDEO("CREATIVE_IMAGE_MODE_UNION_SPLASH_VIDEO"),
  
  CREATIVE_IMAGE_MODE_VIDEO("CREATIVE_IMAGE_MODE_VIDEO"),
  
  CREATIVE_IMAGE_MODE_VIDEO_VERTICAL("CREATIVE_IMAGE_MODE_VIDEO_VERTICAL"),
  
  SEARCH_AD_SMALL_IMAGE("SEARCH_AD_SMALL_IMAGE"),
  
  TOUTIAO_SEARCH_AD_IMAGE("TOUTIAO_SEARCH_AD_IMAGE");

  private String value;

  PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode fromValue(String value) {
    for (PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode b : PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode.fromValue(value);
    }
  }
}

