/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialImageMode.Adapter.class)
public enum QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialImageMode {
  
  AWEME_LIVE_ROOM("AWEME_LIVE_ROOM"),
  
  CAROUSEL("CAROUSEL"),
  
  LARGE("LARGE"),
  
  LARGE_VERTICAL("LARGE_VERTICAL"),
  
  SMALL("SMALL"),
  
  SQUARE("SQUARE"),
  
  UNION_SPLASH("UNION_SPLASH"),
  
  VIDEO_LARGE("VIDEO_LARGE"),
  
  VIDEO_VERTICAL("VIDEO_VERTICAL");

  private String value;

  QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialImageMode fromValue(String value) {
    for (QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialImageMode b : QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionAdDetailV10DataProgrammaticCreativeMediaListVideoMaterialImageMode.fromValue(value);
    }
  }
}

