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
@JsonAdapter(ProjectListV30DataListAudienceAc.Adapter.class)
public enum ProjectListV30DataListAudienceAc {
  
  Enum_2G("2G"),
  
  Enum_3G("3G"),
  
  Enum_4G("4G"),
  
  Enum_5G("5G"),
  
  WIFI("WIFI");

  private String value;

  ProjectListV30DataListAudienceAc(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListAudienceAc fromValue(String value) {
    for (ProjectListV30DataListAudienceAc b : ProjectListV30DataListAudienceAc.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListAudienceAc> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListAudienceAc enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListAudienceAc read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListAudienceAc.fromValue(value);
    }
  }
}

