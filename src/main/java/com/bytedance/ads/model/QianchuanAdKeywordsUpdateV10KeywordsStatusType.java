/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@JsonAdapter(QianchuanAdKeywordsUpdateV10KeywordsStatusType.Adapter.class)
public enum QianchuanAdKeywordsUpdateV10KeywordsStatusType {
  
  DELETE("DELETE"),
  
  ENABLE("ENABLE"),
  
  PAUSED("PAUSED");

  private String value;

  QianchuanAdKeywordsUpdateV10KeywordsStatusType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdKeywordsUpdateV10KeywordsStatusType fromValue(String value) {
    for (QianchuanAdKeywordsUpdateV10KeywordsStatusType b : QianchuanAdKeywordsUpdateV10KeywordsStatusType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdKeywordsUpdateV10KeywordsStatusType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdKeywordsUpdateV10KeywordsStatusType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdKeywordsUpdateV10KeywordsStatusType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdKeywordsUpdateV10KeywordsStatusType.fromValue(value);
    }
  }
}
