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
@JsonAdapter(QianchuanCarouselGetV10DataCarouselsImageMode.Adapter.class)
public enum QianchuanCarouselGetV10DataCarouselsImageMode {
  
  CAROUSEL("CAROUSEL");

  private String value;

  QianchuanCarouselGetV10DataCarouselsImageMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanCarouselGetV10DataCarouselsImageMode fromValue(String value) {
    for (QianchuanCarouselGetV10DataCarouselsImageMode b : QianchuanCarouselGetV10DataCarouselsImageMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanCarouselGetV10DataCarouselsImageMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanCarouselGetV10DataCarouselsImageMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanCarouselGetV10DataCarouselsImageMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanCarouselGetV10DataCarouselsImageMode.fromValue(value);
    }
  }
}

