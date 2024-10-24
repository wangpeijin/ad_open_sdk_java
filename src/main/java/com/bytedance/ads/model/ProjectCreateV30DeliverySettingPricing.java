/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@JsonAdapter(ProjectCreateV30DeliverySettingPricing.Adapter.class)
public enum ProjectCreateV30DeliverySettingPricing {
  
  CPC("PRICING_CPC"),
  
  CPM("PRICING_CPM"),
  
  OCPC("PRICING_OCPC"),
  
  OCPM("PRICING_OCPM");

  private String value;

  ProjectCreateV30DeliverySettingPricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCreateV30DeliverySettingPricing fromValue(String value) {
    for (ProjectCreateV30DeliverySettingPricing b : ProjectCreateV30DeliverySettingPricing.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectCreateV30DeliverySettingPricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCreateV30DeliverySettingPricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCreateV30DeliverySettingPricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCreateV30DeliverySettingPricing.fromValue(value);
    }
  }
}

