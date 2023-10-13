/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(ToolsBpAssetManagementShareV30AssetType.Adapter.class)
public enum ToolsBpAssetManagementShareV30AssetType {
  
  APPLETS("APPLETS"),
  
  BYTED_APPLETS("BYTED_APPLETS"),
  
  BYTED_GAME("BYTED_GAME"),
  
  WECHAT_GAME("WECHAT_GAME");

  private String value;

  ToolsBpAssetManagementShareV30AssetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBpAssetManagementShareV30AssetType fromValue(String value) {
    for (ToolsBpAssetManagementShareV30AssetType b : ToolsBpAssetManagementShareV30AssetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBpAssetManagementShareV30AssetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBpAssetManagementShareV30AssetType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBpAssetManagementShareV30AssetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBpAssetManagementShareV30AssetType.fromValue(value);
    }
  }
}

