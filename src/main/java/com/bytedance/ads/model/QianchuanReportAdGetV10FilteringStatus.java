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
@JsonAdapter(QianchuanReportAdGetV10FilteringStatus.Adapter.class)
public enum QianchuanReportAdGetV10FilteringStatus {
  
  ALL_INCLUDE_DELETED("ALL_INCLUDE_DELETED"),
  
  AUDIT("AUDIT"),
  
  DELETED("DELETED"),
  
  DELIVERY_OK("DELIVERY_OK"),
  
  DISABLE("DISABLE"),
  
  EXTERNAL_URL_DISABLE("EXTERNAL_URL_DISABLE"),
  
  FROZEN("FROZEN"),
  
  LIVE_ROOM_OFF("LIVE_ROOM_OFF"),
  
  NO_SCHEDULE("NO_SCHEDULE"),
  
  OFFLINE_AUDIT("OFFLINE_AUDIT"),
  
  OFFLINE_BALANCE("OFFLINE_BALANCE"),
  
  OFFLINE_BUDGET("OFFLINE_BUDGET"),
  
  QUOTA_DISABLE("QUOTA_DISABLE"),
  
  REAUDIT("REAUDIT"),
  
  SYSTEM_DISABLE("SYSTEM_DISABLE"),
  
  TIME_DONE("TIME_DONE"),
  
  TIME_NO_REACH("TIME_NO_REACH");

  private String value;

  QianchuanReportAdGetV10FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportAdGetV10FilteringStatus fromValue(String value) {
    for (QianchuanReportAdGetV10FilteringStatus b : QianchuanReportAdGetV10FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportAdGetV10FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportAdGetV10FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportAdGetV10FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportAdGetV10FilteringStatus.fromValue(value);
    }
  }
}

