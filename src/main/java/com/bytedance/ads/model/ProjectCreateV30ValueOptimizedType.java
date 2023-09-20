/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(ProjectCreateV30ValueOptimizedType.Adapter.class)
public enum ProjectCreateV30ValueOptimizedType {
  
  ACTION("ACTION"),
  
  OFF("OFF"),
  
  VALUE("VALUE");

  private String value;

  ProjectCreateV30ValueOptimizedType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCreateV30ValueOptimizedType fromValue(String value) {
    for (ProjectCreateV30ValueOptimizedType b : ProjectCreateV30ValueOptimizedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectCreateV30ValueOptimizedType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCreateV30ValueOptimizedType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCreateV30ValueOptimizedType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCreateV30ValueOptimizedType.fromValue(value);
    }
  }
}

