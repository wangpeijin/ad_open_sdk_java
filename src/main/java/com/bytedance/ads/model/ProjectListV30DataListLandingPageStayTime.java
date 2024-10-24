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
@JsonAdapter(ProjectListV30DataListLandingPageStayTime.Adapter.class)
public enum ProjectListV30DataListLandingPageStayTime {
  
  NUMBER_1000(1000l),
  
  NUMBER_12000(12000l),
  
  NUMBER_20000(20000l),
  
  NUMBER_30000(30000l),
  
  NUMBER_40000(40000l),
  
  NUMBER_5000(5000l),
  
  NUMBER_50000(50000l),
  
  NUMBER_60000(60000l);

  private Long value;

  ProjectListV30DataListLandingPageStayTime(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListLandingPageStayTime fromValue(Long value) {
    for (ProjectListV30DataListLandingPageStayTime b : ProjectListV30DataListLandingPageStayTime.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListLandingPageStayTime> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListLandingPageStayTime enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListLandingPageStayTime read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ProjectListV30DataListLandingPageStayTime.fromValue(value);
    }
  }
}

