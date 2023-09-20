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
@JsonAdapter(ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType.Adapter.class)
public enum ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType {
  
  FREE("FREE"),
  
  PRODUCT("PRODUCT"),
  
  TRIAL_AND_LIMIT_FUNCTIONS("TRIAL_AND_LIMIT_FUNCTIONS"),
  
  TRIAL_AND_PURCHASE("TRIAL_AND_PURCHASE");

  private String value;

  ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType fromValue(String value) {
    for (ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType b : ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAndroidBasicPackageUpdateV2PaymentType.fromValue(value);
    }
  }
}

