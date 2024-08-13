/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(QianchuanReportLongTransferOrderConfigGetV10DataTopics.Adapter.class)
public enum QianchuanReportLongTransferOrderConfigGetV10DataTopics {
  
  LONG_TRANSFER_ORDER("LONG_TRANSFER_ORDER");

  private String value;

  QianchuanReportLongTransferOrderConfigGetV10DataTopics(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportLongTransferOrderConfigGetV10DataTopics fromValue(String value) {
    for (QianchuanReportLongTransferOrderConfigGetV10DataTopics b : QianchuanReportLongTransferOrderConfigGetV10DataTopics.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportLongTransferOrderConfigGetV10DataTopics> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportLongTransferOrderConfigGetV10DataTopics enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportLongTransferOrderConfigGetV10DataTopics read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportLongTransferOrderConfigGetV10DataTopics.fromValue(value);
    }
  }
}

