/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@JsonAdapter(ToolsEventAllAssetsListV2FilteringAssetType.Adapter.class)
public enum ToolsEventAllAssetsListV2FilteringAssetType {
  
  THIRD_EXTERNAL("THIRD_EXTERNAL"),
  
  TETRIS_EXTERNAL("TETRIS_EXTERNAL"),
  
  APP("APP"),
  
  QUICK_APP("QUICK_APP"),
  
  MINI_PROGRAME("MINI_PROGRAME");

  private String value;

  ToolsEventAllAssetsListV2FilteringAssetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventAllAssetsListV2FilteringAssetType fromValue(String value) {
    for (ToolsEventAllAssetsListV2FilteringAssetType b : ToolsEventAllAssetsListV2FilteringAssetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEventAllAssetsListV2FilteringAssetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventAllAssetsListV2FilteringAssetType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventAllAssetsListV2FilteringAssetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventAllAssetsListV2FilteringAssetType.fromValue(value);
    }
  }
}

