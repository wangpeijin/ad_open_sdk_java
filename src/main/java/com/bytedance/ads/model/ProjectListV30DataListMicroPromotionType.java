/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(ProjectListV30DataListMicroPromotionType.Adapter.class)
public enum ProjectListV30DataListMicroPromotionType {
  
  BYTE_APP("BYTE_APP"),
  
  BYTE_GAME("BYTE_GAME"),
  
  WECHAT_APP("WECHAT_APP"),
  
  WECHAT_GAME("WECHAT_GAME");

  private String value;

  ProjectListV30DataListMicroPromotionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListMicroPromotionType fromValue(String value) {
    for (ProjectListV30DataListMicroPromotionType b : ProjectListV30DataListMicroPromotionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListMicroPromotionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListMicroPromotionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListMicroPromotionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListMicroPromotionType.fromValue(value);
    }
  }
}

