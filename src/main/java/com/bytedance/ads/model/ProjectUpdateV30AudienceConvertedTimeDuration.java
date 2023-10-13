/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(ProjectUpdateV30AudienceConvertedTimeDuration.Adapter.class)
public enum ProjectUpdateV30AudienceConvertedTimeDuration {
  
  NONE("NONE"),
  
  ONE_MONTH("ONE_MONTH"),
  
  SEVEN_DAY("SEVEN_DAY"),
  
  SIX_MONTH("SIX_MONTH"),
  
  THREE_MONTH("THREE_MONTH"),
  
  TODAY("TODAY"),
  
  TWELVE_MONTH("TWELVE_MONTH");

  private String value;

  ProjectUpdateV30AudienceConvertedTimeDuration(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectUpdateV30AudienceConvertedTimeDuration fromValue(String value) {
    for (ProjectUpdateV30AudienceConvertedTimeDuration b : ProjectUpdateV30AudienceConvertedTimeDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectUpdateV30AudienceConvertedTimeDuration> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectUpdateV30AudienceConvertedTimeDuration enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectUpdateV30AudienceConvertedTimeDuration read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectUpdateV30AudienceConvertedTimeDuration.fromValue(value);
    }
  }
}

