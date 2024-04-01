/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(QianchuanTodayLiveRoomGetV10RoomStatus.Adapter.class)
public enum QianchuanTodayLiveRoomGetV10RoomStatus {
  
  ALL("ALL"),
  
  FINISH("FINISH"),
  
  LIVING("LIVING");

  private String value;

  QianchuanTodayLiveRoomGetV10RoomStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanTodayLiveRoomGetV10RoomStatus fromValue(String value) {
    for (QianchuanTodayLiveRoomGetV10RoomStatus b : QianchuanTodayLiveRoomGetV10RoomStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanTodayLiveRoomGetV10RoomStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanTodayLiveRoomGetV10RoomStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanTodayLiveRoomGetV10RoomStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanTodayLiveRoomGetV10RoomStatus.fromValue(value);
    }
  }
}

