/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@JsonAdapter(QianchuanReportSearchWordGetV10WordType.Adapter.class)
public enum QianchuanReportSearchWordGetV10WordType {
  
  KEY_WORD("KEY_WORD"),
  
  SEARCH_WORD("SEARCH_WORD");

  private String value;

  QianchuanReportSearchWordGetV10WordType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportSearchWordGetV10WordType fromValue(String value) {
    for (QianchuanReportSearchWordGetV10WordType b : QianchuanReportSearchWordGetV10WordType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportSearchWordGetV10WordType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportSearchWordGetV10WordType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportSearchWordGetV10WordType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportSearchWordGetV10WordType.fromValue(value);
    }
  }
}

