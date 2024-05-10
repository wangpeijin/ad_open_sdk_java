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
@JsonAdapter(QianchuanReportLongTransferOrderGetV10OptimizationTimeScope.Adapter.class)
public enum QianchuanReportLongTransferOrderGetV10OptimizationTimeScope {
  
  NUMBER_1(1l),
  
  NUMBER_15(15l),
  
  NUMBER_3(3l),
  
  NUMBER_30(30l),
  
  NUMBER_7(7l);

  private Long value;

  QianchuanReportLongTransferOrderGetV10OptimizationTimeScope(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportLongTransferOrderGetV10OptimizationTimeScope fromValue(Long value) {
    for (QianchuanReportLongTransferOrderGetV10OptimizationTimeScope b : QianchuanReportLongTransferOrderGetV10OptimizationTimeScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportLongTransferOrderGetV10OptimizationTimeScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportLongTransferOrderGetV10OptimizationTimeScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportLongTransferOrderGetV10OptimizationTimeScope read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanReportLongTransferOrderGetV10OptimizationTimeScope.fromValue(value);
    }
  }
}

