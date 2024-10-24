/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@JsonAdapter(ReportLiveRoomAnalysisGetV2DataListRoomStatus.Adapter.class)
public enum ReportLiveRoomAnalysisGetV2DataListRoomStatus {
  
  END("END"),
  
  LIVING("LIVING"),
  
  PREPARING("PREPARING"),
  
  PAUSE("PAUSE");

  private String value;

  ReportLiveRoomAnalysisGetV2DataListRoomStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportLiveRoomAnalysisGetV2DataListRoomStatus fromValue(String value) {
    for (ReportLiveRoomAnalysisGetV2DataListRoomStatus b : ReportLiveRoomAnalysisGetV2DataListRoomStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportLiveRoomAnalysisGetV2DataListRoomStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportLiveRoomAnalysisGetV2DataListRoomStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportLiveRoomAnalysisGetV2DataListRoomStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportLiveRoomAnalysisGetV2DataListRoomStatus.fromValue(value);
    }
  }
}

