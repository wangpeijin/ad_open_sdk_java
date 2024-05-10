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
@JsonAdapter(QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors.Adapter.class)
public enum QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors {
  
  COMMENTED_USER("COMMENTED_USER"),
  
  FOLLOWED_USER("FOLLOWED_USER"),
  
  GOODS_CARTS_CLICK("GOODS_CARTS_CLICK"),
  
  GOODS_CARTS_ORDER("GOODS_CARTS_ORDER"),
  
  LIKED_USER("LIKED_USER"),
  
  LIVE_COMMENT("LIVE_COMMENT"),
  
  LIVE_EFFECTIVE_WATCH("LIVE_EFFECTIVE_WATCH"),
  
  LIVE_EXCEPTIONAL("LIVE_EXCEPTIONAL"),
  
  LIVE_GOODS_CLICK("LIVE_GOODS_CLICK"),
  
  LIVE_GOODS_ORDER("LIVE_GOODS_ORDER"),
  
  LIVE_WATCH("LIVE_WATCH"),
  
  SHARED_USER("SHARED_USER");

  private String value;

  QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors fromValue(String value) {
    for (QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors b : QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanOrientationPackageGetV10DataListAwemeFanBehaviors.fromValue(value);
    }
  }
}

