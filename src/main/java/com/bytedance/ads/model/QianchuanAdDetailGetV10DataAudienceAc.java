/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@JsonAdapter(QianchuanAdDetailGetV10DataAudienceAc.Adapter.class)
public enum QianchuanAdDetailGetV10DataAudienceAc {
  
  Enum_2G("2G"),
  
  Enum_3G("3G"),
  
  Enum_4G("4G"),
  
  Enum_5G("5G"),
  
  WIFI("WIFI");

  private String value;

  QianchuanAdDetailGetV10DataAudienceAc(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataAudienceAc fromValue(String value) {
    for (QianchuanAdDetailGetV10DataAudienceAc b : QianchuanAdDetailGetV10DataAudienceAc.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataAudienceAc> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataAudienceAc enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataAudienceAc read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataAudienceAc.fromValue(value);
    }
  }
}

