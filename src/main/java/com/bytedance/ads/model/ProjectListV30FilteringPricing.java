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
@JsonAdapter(ProjectListV30FilteringPricing.Adapter.class)
public enum ProjectListV30FilteringPricing {
  
  CPC("PRICING_CPC"),
  
  CPM("PRICING_CPM"),
  
  OCPC("PRICING_OCPC"),
  
  OCPM("PRICING_OCPM");

  private String value;

  ProjectListV30FilteringPricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectListV30FilteringPricing fromValue(String value) {
    for (ProjectListV30FilteringPricing b : ProjectListV30FilteringPricing.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectListV30FilteringPricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectListV30FilteringPricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectListV30FilteringPricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectListV30FilteringPricing.fromValue(value);
    }
  }
}

