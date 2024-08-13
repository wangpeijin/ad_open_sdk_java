/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(ToolsEventAllAssetsListV2DataAssetListAssetType.Adapter.class)
public enum ToolsEventAllAssetsListV2DataAssetListAssetType {
  
  THIRD_EXTERNAL("THIRD_EXTERNAL"),
  
  TETRIS_EXTERNAL("TETRIS_EXTERNAL"),
  
  APP("APP"),
  
  QUICK_APP("QUICK_APP"),
  
  MINI_PROGRAME("MINI_PROGRAME");

  private String value;

  ToolsEventAllAssetsListV2DataAssetListAssetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventAllAssetsListV2DataAssetListAssetType fromValue(String value) {
    for (ToolsEventAllAssetsListV2DataAssetListAssetType b : ToolsEventAllAssetsListV2DataAssetListAssetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsEventAllAssetsListV2DataAssetListAssetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventAllAssetsListV2DataAssetListAssetType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventAllAssetsListV2DataAssetListAssetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventAllAssetsListV2DataAssetListAssetType.fromValue(value);
    }
  }
}

