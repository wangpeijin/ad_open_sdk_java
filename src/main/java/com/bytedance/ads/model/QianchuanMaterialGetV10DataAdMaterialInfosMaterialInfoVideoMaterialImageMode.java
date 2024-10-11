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
@JsonAdapter(QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode.Adapter.class)
public enum QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode {
  
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

  QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode fromValue(String value) {
    for (QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode b : QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode.fromValue(value);
    }
  }
}

