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
@JsonAdapter(QianchuanSuggestRoiGoalV10MarketingGoal.Adapter.class)
public enum QianchuanSuggestRoiGoalV10MarketingGoal {
  
  LIVE_PROM_GOODS("LIVE_PROM_GOODS"),
  
  VIDEO_PROM_GOODS("VIDEO_PROM_GOODS");

  private String value;

  QianchuanSuggestRoiGoalV10MarketingGoal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanSuggestRoiGoalV10MarketingGoal fromValue(String value) {
    for (QianchuanSuggestRoiGoalV10MarketingGoal b : QianchuanSuggestRoiGoalV10MarketingGoal.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanSuggestRoiGoalV10MarketingGoal> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanSuggestRoiGoalV10MarketingGoal enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanSuggestRoiGoalV10MarketingGoal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanSuggestRoiGoalV10MarketingGoal.fromValue(value);
    }
  }
}

