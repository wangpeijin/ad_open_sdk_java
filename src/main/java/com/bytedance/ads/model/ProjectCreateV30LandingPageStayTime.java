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
@JsonAdapter(ProjectCreateV30LandingPageStayTime.Adapter.class)
public enum ProjectCreateV30LandingPageStayTime {
  
  NUMBER_1000(1000l),
  
  NUMBER_12000(12000l),
  
  NUMBER_20000(20000l),
  
  NUMBER_30000(30000l),
  
  NUMBER_40000(40000l),
  
  NUMBER_5000(5000l),
  
  NUMBER_50000(50000l),
  
  NUMBER_60000(60000l);

  private Long value;

  ProjectCreateV30LandingPageStayTime(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCreateV30LandingPageStayTime fromValue(Long value) {
    for (ProjectCreateV30LandingPageStayTime b : ProjectCreateV30LandingPageStayTime.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectCreateV30LandingPageStayTime> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCreateV30LandingPageStayTime enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCreateV30LandingPageStayTime read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ProjectCreateV30LandingPageStayTime.fromValue(value);
    }
  }
}

