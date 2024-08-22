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
@JsonAdapter(QianchuanSuggestRoiGoalV10DeepBidType.Adapter.class)
public enum QianchuanSuggestRoiGoalV10DeepBidType {
  
  COMM_ROI("COMM_ROI"),
  
  MIN("MIN"),
  
  PAY_ROI("PAY_ROI");

  private String value;

  QianchuanSuggestRoiGoalV10DeepBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanSuggestRoiGoalV10DeepBidType fromValue(String value) {
    for (QianchuanSuggestRoiGoalV10DeepBidType b : QianchuanSuggestRoiGoalV10DeepBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanSuggestRoiGoalV10DeepBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanSuggestRoiGoalV10DeepBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanSuggestRoiGoalV10DeepBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanSuggestRoiGoalV10DeepBidType.fromValue(value);
    }
  }
}

