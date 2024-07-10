/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@JsonAdapter(ProjectListV30DataListAudienceInterestActionMode.Adapter.class)
public enum ProjectListV30DataListAudienceInterestActionMode {
  
  CUSTOM("CUSTOM"),
  
  RECOMMEND("RECOMMEND"),
  
  UNLIMITED("UNLIMITED");

  private String value;

  ProjectListV30DataListAudienceInterestActionMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListAudienceInterestActionMode fromValue(String value) {
    for (ProjectListV30DataListAudienceInterestActionMode b : ProjectListV30DataListAudienceInterestActionMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListAudienceInterestActionMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListAudienceInterestActionMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListAudienceInterestActionMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListAudienceInterestActionMode.fromValue(value);
    }
  }
}

