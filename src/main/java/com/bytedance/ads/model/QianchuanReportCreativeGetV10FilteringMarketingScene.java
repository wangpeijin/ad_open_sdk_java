/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(QianchuanReportCreativeGetV10FilteringMarketingScene.Adapter.class)
public enum QianchuanReportCreativeGetV10FilteringMarketingScene {
  
  ALL("ALL"),
  
  FEED("FEED"),
  
  SEARCH("SEARCH"),
  
  SHOPPING_MALL("SHOPPING_MALL");

  private String value;

  QianchuanReportCreativeGetV10FilteringMarketingScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportCreativeGetV10FilteringMarketingScene fromValue(String value) {
    for (QianchuanReportCreativeGetV10FilteringMarketingScene b : QianchuanReportCreativeGetV10FilteringMarketingScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportCreativeGetV10FilteringMarketingScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportCreativeGetV10FilteringMarketingScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportCreativeGetV10FilteringMarketingScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportCreativeGetV10FilteringMarketingScene.fromValue(value);
    }
  }
}

