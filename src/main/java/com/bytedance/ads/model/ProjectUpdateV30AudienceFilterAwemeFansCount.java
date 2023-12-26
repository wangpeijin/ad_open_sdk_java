/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
@JsonAdapter(ProjectUpdateV30AudienceFilterAwemeFansCount.Adapter.class)
public enum ProjectUpdateV30AudienceFilterAwemeFansCount {
  
  NUMBER_0(0l),
  
  NUMBER_1000(1000l),
  
  NUMBER_200(200l),
  
  NUMBER_500(500l);

  private Long value;

  ProjectUpdateV30AudienceFilterAwemeFansCount(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectUpdateV30AudienceFilterAwemeFansCount fromValue(Long value) {
    for (ProjectUpdateV30AudienceFilterAwemeFansCount b : ProjectUpdateV30AudienceFilterAwemeFansCount.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectUpdateV30AudienceFilterAwemeFansCount> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectUpdateV30AudienceFilterAwemeFansCount enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectUpdateV30AudienceFilterAwemeFansCount read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ProjectUpdateV30AudienceFilterAwemeFansCount.fromValue(value);
    }
  }
}

