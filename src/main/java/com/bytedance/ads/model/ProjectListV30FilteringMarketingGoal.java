/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.6
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
@JsonAdapter(ProjectListV30FilteringMarketingGoal.Adapter.class)
public enum ProjectListV30FilteringMarketingGoal {
  
  LIVE("LIVE"),
  
  VIDEO_AND_IMAGE("VIDEO_AND_IMAGE");

  private String value;

  ProjectListV30FilteringMarketingGoal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30FilteringMarketingGoal fromValue(String value) {
    for (ProjectListV30FilteringMarketingGoal b : ProjectListV30FilteringMarketingGoal.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectListV30FilteringMarketingGoal> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30FilteringMarketingGoal enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30FilteringMarketingGoal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30FilteringMarketingGoal.fromValue(value);
    }
  }
}

