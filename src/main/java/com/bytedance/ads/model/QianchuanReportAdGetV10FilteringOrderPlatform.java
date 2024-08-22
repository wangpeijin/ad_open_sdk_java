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
@JsonAdapter(QianchuanReportAdGetV10FilteringOrderPlatform.Adapter.class)
public enum QianchuanReportAdGetV10FilteringOrderPlatform {
  
  ALL("ALL"),
  
  ECP_AWEME("ECP_AWEME"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  QianchuanReportAdGetV10FilteringOrderPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportAdGetV10FilteringOrderPlatform fromValue(String value) {
    for (QianchuanReportAdGetV10FilteringOrderPlatform b : QianchuanReportAdGetV10FilteringOrderPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportAdGetV10FilteringOrderPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportAdGetV10FilteringOrderPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportAdGetV10FilteringOrderPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportAdGetV10FilteringOrderPlatform.fromValue(value);
    }
  }
}

