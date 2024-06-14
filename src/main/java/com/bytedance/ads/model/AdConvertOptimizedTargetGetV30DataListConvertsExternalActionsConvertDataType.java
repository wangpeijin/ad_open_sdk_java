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
@JsonAdapter(AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsConvertDataType.Adapter.class)
public enum AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsConvertDataType {
  
  EVERY_ONE("AD_CONVERT_DATA_TYPE_EVERY_ONE"),
  
  EVERY_ONE_NEW("AD_CONVERT_DATA_TYPE_EVERY_ONE_NEW"),
  
  LESS_THAN_HUNDRED("AD_CONVERT_DATA_TYPE_LESS_THAN_HUNDRED"),
  
  LESS_THAN_TEN("AD_CONVERT_DATA_TYPE_LESS_THAN_TEN"),
  
  ONLY_ONE("AD_CONVERT_DATA_TYPE_ONLY_ONE"),
  
  PER_TIMES("AD_CONVERT_DATA_TYPE_PER_TIMES");

  private String value;

  AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsConvertDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsConvertDataType fromValue(String value) {
    for (AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsConvertDataType b : AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsConvertDataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsConvertDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsConvertDataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsConvertDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdConvertOptimizedTargetGetV30DataListConvertsExternalActionsConvertDataType.fromValue(value);
    }
  }
}

