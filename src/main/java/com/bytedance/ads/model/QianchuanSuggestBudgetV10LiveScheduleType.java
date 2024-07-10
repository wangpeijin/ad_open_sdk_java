/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@JsonAdapter(QianchuanSuggestBudgetV10LiveScheduleType.Adapter.class)
public enum QianchuanSuggestBudgetV10LiveScheduleType {
  
  FROM_NOW("SCHEDULE_FROM_NOW"),
  
  START_END("SCHEDULE_START_END"),
  
  TIME_FIXEDRANGE("SCHEDULE_TIME_FIXEDRANGE");

  private String value;

  QianchuanSuggestBudgetV10LiveScheduleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanSuggestBudgetV10LiveScheduleType fromValue(String value) {
    for (QianchuanSuggestBudgetV10LiveScheduleType b : QianchuanSuggestBudgetV10LiveScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanSuggestBudgetV10LiveScheduleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanSuggestBudgetV10LiveScheduleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanSuggestBudgetV10LiveScheduleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanSuggestBudgetV10LiveScheduleType.fromValue(value);
    }
  }
}

