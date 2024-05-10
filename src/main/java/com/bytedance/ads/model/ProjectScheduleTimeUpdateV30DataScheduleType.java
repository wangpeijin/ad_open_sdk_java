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
@JsonAdapter(ProjectScheduleTimeUpdateV30DataScheduleType.Adapter.class)
public enum ProjectScheduleTimeUpdateV30DataScheduleType {
  
  FROM_NOW("SCHEDULE_FROM_NOW"),
  
  START_END("SCHEDULE_START_END");

  private String value;

  ProjectScheduleTimeUpdateV30DataScheduleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectScheduleTimeUpdateV30DataScheduleType fromValue(String value) {
    for (ProjectScheduleTimeUpdateV30DataScheduleType b : ProjectScheduleTimeUpdateV30DataScheduleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectScheduleTimeUpdateV30DataScheduleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectScheduleTimeUpdateV30DataScheduleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectScheduleTimeUpdateV30DataScheduleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectScheduleTimeUpdateV30DataScheduleType.fromValue(value);
    }
  }
}

