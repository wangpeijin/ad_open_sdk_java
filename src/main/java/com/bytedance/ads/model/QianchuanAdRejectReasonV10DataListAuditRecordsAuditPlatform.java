/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
@JsonAdapter(QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform.Adapter.class)
public enum QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform {
  
  CONTENT("CONTENT"),
  
  UNKNOWN("UNKNOWN"),
  
  AD("AD");

  private String value;

  QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform fromValue(String value) {
    for (QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform b : QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform.fromValue(value);
    }
  }
}

