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
@JsonAdapter(ToolsAppManagementBpShareV2AllAccountsAccountType.Adapter.class)
public enum ToolsAppManagementBpShareV2AllAccountsAccountType {
  
  STAR("STAR"),
  
  AD("AD"),
  
  BP("BP");

  private String value;

  ToolsAppManagementBpShareV2AllAccountsAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementBpShareV2AllAccountsAccountType fromValue(String value) {
    for (ToolsAppManagementBpShareV2AllAccountsAccountType b : ToolsAppManagementBpShareV2AllAccountsAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementBpShareV2AllAccountsAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementBpShareV2AllAccountsAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementBpShareV2AllAccountsAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementBpShareV2AllAccountsAccountType.fromValue(value);
    }
  }
}

