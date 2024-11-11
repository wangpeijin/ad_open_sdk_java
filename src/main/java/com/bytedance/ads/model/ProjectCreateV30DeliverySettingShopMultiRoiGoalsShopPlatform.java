/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform.Adapter.class)
public enum ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform {
  
  JD("JD"),
  
  OTHER("OTHER"),
  
  PDD("PDD"),
  
  TB("TB");

  private String value;

  ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform fromValue(String value) {
    for (ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform b : ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform.fromValue(value);
    }
  }
}

