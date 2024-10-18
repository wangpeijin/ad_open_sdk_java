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
@JsonAdapter(ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType.Adapter.class)
public enum ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType {
  
  AD("AD");

  private String value;

  ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType fromValue(String value) {
    for (ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType b : ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType.fromValue(value);
    }
  }
}

