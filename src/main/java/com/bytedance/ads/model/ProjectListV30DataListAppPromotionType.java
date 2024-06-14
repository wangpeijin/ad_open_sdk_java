/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(ProjectListV30DataListAppPromotionType.Adapter.class)
public enum ProjectListV30DataListAppPromotionType {
  
  DOWNLOAD("DOWNLOAD"),
  
  LAUNCH("LAUNCH"),
  
  RESERVE("RESERVE");

  private String value;

  ProjectListV30DataListAppPromotionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListAppPromotionType fromValue(String value) {
    for (ProjectListV30DataListAppPromotionType b : ProjectListV30DataListAppPromotionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListAppPromotionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListAppPromotionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListAppPromotionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListAppPromotionType.fromValue(value);
    }
  }
}

