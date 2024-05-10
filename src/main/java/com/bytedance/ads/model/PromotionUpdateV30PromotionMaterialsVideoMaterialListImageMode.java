/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@JsonAdapter(PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode.Adapter.class)
public enum PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode {
  
  CALIBRATION_FREE_VIDEO("CREATIVE_IMAGE_MODE_CALIBRATION_FREE_VIDEO"),
  
  VIDEO("CREATIVE_IMAGE_MODE_VIDEO"),
  
  VIDEO_VERTICAL("CREATIVE_IMAGE_MODE_VIDEO_VERTICAL");

  private String value;

  PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode fromValue(String value) {
    for (PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode b : PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode.fromValue(value);
    }
  }
}

