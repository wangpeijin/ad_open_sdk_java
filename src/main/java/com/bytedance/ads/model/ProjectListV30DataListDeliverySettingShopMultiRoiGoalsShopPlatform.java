/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@JsonAdapter(ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform.Adapter.class)
public enum ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform {
  
  JD("JD"),
  
  OTHER("OTHER"),
  
  PDD("PDD"),
  
  TB("TB");

  private String value;

  ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform fromValue(String value) {
    for (ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform b : ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform.fromValue(value);
    }
  }
}

