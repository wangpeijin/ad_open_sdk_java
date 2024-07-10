/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@JsonAdapter(QianchuanCreativeGetV10DataListLabAdType.Adapter.class)
public enum QianchuanCreativeGetV10DataListLabAdType {
  
  LAB_AD("LAB_AD"),
  
  NOT_LAB_AD("NOT_LAB_AD");

  private String value;

  QianchuanCreativeGetV10DataListLabAdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanCreativeGetV10DataListLabAdType fromValue(String value) {
    for (QianchuanCreativeGetV10DataListLabAdType b : QianchuanCreativeGetV10DataListLabAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanCreativeGetV10DataListLabAdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanCreativeGetV10DataListLabAdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanCreativeGetV10DataListLabAdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanCreativeGetV10DataListLabAdType.fromValue(value);
    }
  }
}

