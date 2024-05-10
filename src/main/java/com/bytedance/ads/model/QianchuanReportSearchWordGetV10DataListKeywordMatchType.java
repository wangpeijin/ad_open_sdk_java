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
@JsonAdapter(QianchuanReportSearchWordGetV10DataListKeywordMatchType.Adapter.class)
public enum QianchuanReportSearchWordGetV10DataListKeywordMatchType {
  
  ALL("ALL"),
  
  EXTENSIVE("EXTENSIVE"),
  
  PHRASE("PHRASE"),
  
  PRECISION("PRECISION");

  private String value;

  QianchuanReportSearchWordGetV10DataListKeywordMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportSearchWordGetV10DataListKeywordMatchType fromValue(String value) {
    for (QianchuanReportSearchWordGetV10DataListKeywordMatchType b : QianchuanReportSearchWordGetV10DataListKeywordMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanReportSearchWordGetV10DataListKeywordMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportSearchWordGetV10DataListKeywordMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportSearchWordGetV10DataListKeywordMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportSearchWordGetV10DataListKeywordMatchType.fromValue(value);
    }
  }
}

