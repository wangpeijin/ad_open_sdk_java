/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
@JsonAdapter(ProjectListV30DataListOpenUrlType.Adapter.class)
public enum ProjectListV30DataListOpenUrlType {
  
  CUSTOM("CUSTOM"),
  
  DPA("DPA"),
  
  NONE("NONE");

  private String value;

  ProjectListV30DataListOpenUrlType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListOpenUrlType fromValue(String value) {
    for (ProjectListV30DataListOpenUrlType b : ProjectListV30DataListOpenUrlType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListOpenUrlType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListOpenUrlType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListOpenUrlType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListOpenUrlType.fromValue(value);
    }
  }
}

