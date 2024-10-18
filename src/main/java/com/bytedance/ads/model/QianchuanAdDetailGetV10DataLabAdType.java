/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(QianchuanAdDetailGetV10DataLabAdType.Adapter.class)
public enum QianchuanAdDetailGetV10DataLabAdType {
  
  LAB_AD("LAB_AD"),
  
  NOT_LAB_AD("NOT_LAB_AD");

  private String value;

  QianchuanAdDetailGetV10DataLabAdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataLabAdType fromValue(String value) {
    for (QianchuanAdDetailGetV10DataLabAdType b : QianchuanAdDetailGetV10DataLabAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataLabAdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataLabAdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataLabAdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataLabAdType.fromValue(value);
    }
  }
}

