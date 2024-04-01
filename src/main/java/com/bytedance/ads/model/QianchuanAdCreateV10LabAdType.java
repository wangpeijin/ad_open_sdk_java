/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(QianchuanAdCreateV10LabAdType.Adapter.class)
public enum QianchuanAdCreateV10LabAdType {
  
  NOT_LAB_AD("NOT_LAB_AD"),
  
  LAB_AD("LAB_AD");

  private String value;

  QianchuanAdCreateV10LabAdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdCreateV10LabAdType fromValue(String value) {
    for (QianchuanAdCreateV10LabAdType b : QianchuanAdCreateV10LabAdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdCreateV10LabAdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdCreateV10LabAdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdCreateV10LabAdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdCreateV10LabAdType.fromValue(value);
    }
  }
}

