/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(LocalProjectUpdateV30PeakWeekDays.Adapter.class)
public enum LocalProjectUpdateV30PeakWeekDays {
  
  FRIDAY("FRIDAY"),
  
  MONDAY("MONDAY"),
  
  SATURDAY("SATURDAY"),
  
  SUNDAY("SUNDAY"),
  
  THURSDAY("THURSDAY"),
  
  TUESDAY("TUESDAY"),
  
  WEDNESDAY("WEDNESDAY");

  private String value;

  LocalProjectUpdateV30PeakWeekDays(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectUpdateV30PeakWeekDays fromValue(String value) {
    for (LocalProjectUpdateV30PeakWeekDays b : LocalProjectUpdateV30PeakWeekDays.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectUpdateV30PeakWeekDays> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectUpdateV30PeakWeekDays enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectUpdateV30PeakWeekDays read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectUpdateV30PeakWeekDays.fromValue(value);
    }
  }
}

