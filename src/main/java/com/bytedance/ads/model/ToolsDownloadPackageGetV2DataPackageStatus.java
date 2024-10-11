/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(ToolsDownloadPackageGetV2DataPackageStatus.Adapter.class)
public enum ToolsDownloadPackageGetV2DataPackageStatus {
  
  NEW_PACKAGE("NEW_PACKAGE"),
  
  PARSING("PARSING"),
  
  SUCCESS("SUCCESS"),
  
  FAIL("FAIL");

  private String value;

  ToolsDownloadPackageGetV2DataPackageStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsDownloadPackageGetV2DataPackageStatus fromValue(String value) {
    for (ToolsDownloadPackageGetV2DataPackageStatus b : ToolsDownloadPackageGetV2DataPackageStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsDownloadPackageGetV2DataPackageStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsDownloadPackageGetV2DataPackageStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsDownloadPackageGetV2DataPackageStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsDownloadPackageGetV2DataPackageStatus.fromValue(value);
    }
  }
}

