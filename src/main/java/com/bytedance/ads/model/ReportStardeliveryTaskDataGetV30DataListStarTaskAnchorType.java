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
@JsonAdapter(ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType.Adapter.class)
public enum ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType {
  
  GAME("APP_GAME"),
  
  INTERNET_SERVICE("APP_INTERNET_SERVICE"),
  
  SHOP("APP_SHOP");

  private String value;

  ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType fromValue(String value) {
    for (ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType b : ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType.fromValue(value);
    }
  }
}

