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
@JsonAdapter(LocalPromotionUpdateV30CustomerMaterialListImageMode.Adapter.class)
public enum LocalPromotionUpdateV30CustomerMaterialListImageMode {
  
  VIDEO("IMAGE_MODE_VIDEO"),
  
  VIDEO_VERTICAL("IMAGE_MODE_VIDEO_VERTICAL");

  private String value;

  LocalPromotionUpdateV30CustomerMaterialListImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionUpdateV30CustomerMaterialListImageMode fromValue(String value) {
    for (LocalPromotionUpdateV30CustomerMaterialListImageMode b : LocalPromotionUpdateV30CustomerMaterialListImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalPromotionUpdateV30CustomerMaterialListImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionUpdateV30CustomerMaterialListImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionUpdateV30CustomerMaterialListImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionUpdateV30CustomerMaterialListImageMode.fromValue(value);
    }
  }
}

