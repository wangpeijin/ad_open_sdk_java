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
@JsonAdapter(ProjectListV30DataListLandingType.Adapter.class)
public enum ProjectListV30DataListLandingType {
  
  APP("APP"),
  
  ARTICLE("ARTICLE"),
  
  BRAND_EXTERNAL("BRAND_EXTERNAL"),
  
  DPA("DPA"),
  
  GOODS("GOODS"),
  
  LINK("LINK"),
  
  LIVE("LIVE"),
  
  MICRO_GAME("MICRO_GAME"),
  
  NATIVE_ACTION("NATIVE_ACTION"),
  
  QUICK_APP("QUICK_APP"),
  
  SHOP("SHOP"),
  
  STORE("STORE");

  private String value;

  ProjectListV30DataListLandingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListLandingType fromValue(String value) {
    for (ProjectListV30DataListLandingType b : ProjectListV30DataListLandingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListLandingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListLandingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListLandingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListLandingType.fromValue(value);
    }
  }
}

