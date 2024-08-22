/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@JsonAdapter(DpaAssetV2ListV2DataAssetListStatus.Adapter.class)
public enum DpaAssetV2ListV2DataAssetListStatus {
  
  DISABLE("DISABLE"),
  
  ENABLE("ENABLE");

  private String value;

  DpaAssetV2ListV2DataAssetListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaAssetV2ListV2DataAssetListStatus fromValue(String value) {
    for (DpaAssetV2ListV2DataAssetListStatus b : DpaAssetV2ListV2DataAssetListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DpaAssetV2ListV2DataAssetListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaAssetV2ListV2DataAssetListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaAssetV2ListV2DataAssetListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaAssetV2ListV2DataAssetListStatus.fromValue(value);
    }
  }
}

