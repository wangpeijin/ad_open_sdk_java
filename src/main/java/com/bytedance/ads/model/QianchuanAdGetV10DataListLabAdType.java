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
@JsonAdapter(QianchuanAdGetV10DataListLabAdType.Adapter.class)
public enum QianchuanAdGetV10DataListLabAdType {
  
  LAB_AD("LAB_AD"),
  
  NOT_LAB_AD("NOT_LAB_AD");

  private String value;

  QianchuanAdGetV10DataListLabAdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdGetV10DataListLabAdType fromValue(String value) {
    for (QianchuanAdGetV10DataListLabAdType b : QianchuanAdGetV10DataListLabAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdGetV10DataListLabAdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdGetV10DataListLabAdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdGetV10DataListLabAdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdGetV10DataListLabAdType.fromValue(value);
    }
  }
}

