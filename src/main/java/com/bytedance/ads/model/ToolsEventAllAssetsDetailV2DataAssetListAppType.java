/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
@JsonAdapter(ToolsEventAllAssetsDetailV2DataAssetListAppType.Adapter.class)
public enum ToolsEventAllAssetsDetailV2DataAssetListAppType {
  
  ANDROID("ANDROID"),
  
  IOS("IOS");

  private String value;

  ToolsEventAllAssetsDetailV2DataAssetListAppType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventAllAssetsDetailV2DataAssetListAppType fromValue(String value) {
    for (ToolsEventAllAssetsDetailV2DataAssetListAppType b : ToolsEventAllAssetsDetailV2DataAssetListAppType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsEventAllAssetsDetailV2DataAssetListAppType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventAllAssetsDetailV2DataAssetListAppType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventAllAssetsDetailV2DataAssetListAppType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventAllAssetsDetailV2DataAssetListAppType.fromValue(value);
    }
  }
}

