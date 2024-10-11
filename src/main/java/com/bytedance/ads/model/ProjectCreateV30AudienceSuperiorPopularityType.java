/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(ProjectCreateV30AudienceSuperiorPopularityType.Adapter.class)
public enum ProjectCreateV30AudienceSuperiorPopularityType {
  
  GAME("GAME"),
  
  NONE("NONE");

  private String value;

  ProjectCreateV30AudienceSuperiorPopularityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCreateV30AudienceSuperiorPopularityType fromValue(String value) {
    for (ProjectCreateV30AudienceSuperiorPopularityType b : ProjectCreateV30AudienceSuperiorPopularityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectCreateV30AudienceSuperiorPopularityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCreateV30AudienceSuperiorPopularityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCreateV30AudienceSuperiorPopularityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCreateV30AudienceSuperiorPopularityType.fromValue(value);
    }
  }
}

