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
@JsonAdapter(QianchuanProductAvailableGetV10FilterMarketingScene.Adapter.class)
public enum QianchuanProductAvailableGetV10FilterMarketingScene {
  
  FEED("FEED"),
  
  SEARCH("SEARCH"),
  
  SHOPPING_MALL("SHOPPING_MALL");

  private String value;

  QianchuanProductAvailableGetV10FilterMarketingScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanProductAvailableGetV10FilterMarketingScene fromValue(String value) {
    for (QianchuanProductAvailableGetV10FilterMarketingScene b : QianchuanProductAvailableGetV10FilterMarketingScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanProductAvailableGetV10FilterMarketingScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanProductAvailableGetV10FilterMarketingScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanProductAvailableGetV10FilterMarketingScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanProductAvailableGetV10FilterMarketingScene.fromValue(value);
    }
  }
}

