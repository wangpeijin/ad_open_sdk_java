/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(ProjectListV30FilteringStatus.Adapter.class)
public enum ProjectListV30FilteringStatus {
  
  ALL("PROJECT_STATUS_ALL"),
  
  BUDGET_EXCEED("PROJECT_STATUS_BUDGET_EXCEED"),
  
  BUDGET_PRE_OFFLINE_BUDGET("PROJECT_STATUS_BUDGET_PRE_OFFLINE_BUDGET"),
  
  DELETE("PROJECT_STATUS_DELETE"),
  
  DISABLE("PROJECT_STATUS_DISABLE"),
  
  DONE("PROJECT_STATUS_DONE"),
  
  ENABLE("PROJECT_STATUS_ENABLE"),
  
  NOT_DELETE("PROJECT_STATUS_NOT_DELETE"),
  
  NOT_START("PROJECT_STATUS_NOT_START"),
  
  NO_SCHEDULE("PROJECT_STATUS_NO_SCHEDULE");

  private String value;

  ProjectListV30FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30FilteringStatus fromValue(String value) {
    for (ProjectListV30FilteringStatus b : ProjectListV30FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectListV30FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30FilteringStatus.fromValue(value);
    }
  }
}

