/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(ProjectListV30DataListAssetType.Adapter.class)
public enum ProjectListV30DataListAssetType {
  
  AWEME("AWEME"),
  
  ENTERPRISE("ENTERPRISE"),
  
  MICRO_APP("MICRO_APP"),
  
  ORANGE("ORANGE"),
  
  THIRDPARTY("THIRDPARTY"),
  
  WECHAT_APPLET("WECHAT_APPLET");

  private String value;

  ProjectListV30DataListAssetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListAssetType fromValue(String value) {
    for (ProjectListV30DataListAssetType b : ProjectListV30DataListAssetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListAssetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListAssetType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListAssetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListAssetType.fromValue(value);
    }
  }
}

