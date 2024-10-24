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
@JsonAdapter(ProjectUpdateV30AudienceHideIfConverted.Adapter.class)
public enum ProjectUpdateV30AudienceHideIfConverted {
  
  ADVERTISER("ADVERTISER"),
  
  APP("APP"),
  
  CUSTOMER("CUSTOMER"),
  
  NO_EXCLUDE("NO_EXCLUDE"),
  
  ORGANIZATION("ORGANIZATION"),
  
  PROJECT("PROJECT"),
  
  PROMOTION("PROMOTION");

  private String value;

  ProjectUpdateV30AudienceHideIfConverted(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectUpdateV30AudienceHideIfConverted fromValue(String value) {
    for (ProjectUpdateV30AudienceHideIfConverted b : ProjectUpdateV30AudienceHideIfConverted.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectUpdateV30AudienceHideIfConverted> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectUpdateV30AudienceHideIfConverted enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectUpdateV30AudienceHideIfConverted read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectUpdateV30AudienceHideIfConverted.fromValue(value);
    }
  }
}

