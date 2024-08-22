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
@JsonAdapter(QianchuanProductAnalyseListV10TimeRange.Adapter.class)
public enum QianchuanProductAnalyseListV10TimeRange {
  
  NUMBER_15(15l),
  
  NUMBER_30(30l),
  
  NUMBER_7(7l);

  private Long value;

  QianchuanProductAnalyseListV10TimeRange(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanProductAnalyseListV10TimeRange fromValue(Long value) {
    for (QianchuanProductAnalyseListV10TimeRange b : QianchuanProductAnalyseListV10TimeRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanProductAnalyseListV10TimeRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanProductAnalyseListV10TimeRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanProductAnalyseListV10TimeRange read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanProductAnalyseListV10TimeRange.fromValue(value);
    }
  }
}

