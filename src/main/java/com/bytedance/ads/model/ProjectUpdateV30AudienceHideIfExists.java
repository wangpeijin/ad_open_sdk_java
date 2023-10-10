/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@JsonAdapter(ProjectUpdateV30AudienceHideIfExists.Adapter.class)
public enum ProjectUpdateV30AudienceHideIfExists {
  
  FILTER("FILTER"),
  
  TARGETING("TARGETING"),
  
  UNLIMITED("UNLIMITED");

  private String value;

  ProjectUpdateV30AudienceHideIfExists(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectUpdateV30AudienceHideIfExists fromValue(String value) {
    for (ProjectUpdateV30AudienceHideIfExists b : ProjectUpdateV30AudienceHideIfExists.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectUpdateV30AudienceHideIfExists> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectUpdateV30AudienceHideIfExists enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectUpdateV30AudienceHideIfExists read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectUpdateV30AudienceHideIfExists.fromValue(value);
    }
  }
}
