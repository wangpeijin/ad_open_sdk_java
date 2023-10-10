/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@JsonAdapter(ToolsAppManagementBpShareCancelV2AllAccountByCompanyAccountType.Adapter.class)
public enum ToolsAppManagementBpShareCancelV2AllAccountByCompanyAccountType {
  
  STAR("STAR"),
  
  BP("BP"),
  
  AD("AD");

  private String value;

  ToolsAppManagementBpShareCancelV2AllAccountByCompanyAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementBpShareCancelV2AllAccountByCompanyAccountType fromValue(String value) {
    for (ToolsAppManagementBpShareCancelV2AllAccountByCompanyAccountType b : ToolsAppManagementBpShareCancelV2AllAccountByCompanyAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementBpShareCancelV2AllAccountByCompanyAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementBpShareCancelV2AllAccountByCompanyAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementBpShareCancelV2AllAccountByCompanyAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementBpShareCancelV2AllAccountByCompanyAccountType.fromValue(value);
    }
  }
}

