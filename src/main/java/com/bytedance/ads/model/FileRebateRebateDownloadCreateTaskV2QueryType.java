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
@JsonAdapter(FileRebateRebateDownloadCreateTaskV2QueryType.Adapter.class)
public enum FileRebateRebateDownloadCreateTaskV2QueryType {
  
  MONTH_PUNISH_DETAILS("month_punish_details"),
  
  QUARTER_PUNISH_DETAILS("quarter_punish_details"),
  
  MONTH_REBATE_DETAILS("month_rebate_details"),
  
  QUARTER_REBATE_DETAILS("quarter_rebate_details"),
  
  MONTH_PERFORMANCE_DETAILS("month_performance_details"),
  
  QUARTER_PERFORMANCE_DETAILS("quarter_performance_details");

  private String value;

  FileRebateRebateDownloadCreateTaskV2QueryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileRebateRebateDownloadCreateTaskV2QueryType fromValue(String value) {
    for (FileRebateRebateDownloadCreateTaskV2QueryType b : FileRebateRebateDownloadCreateTaskV2QueryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileRebateRebateDownloadCreateTaskV2QueryType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileRebateRebateDownloadCreateTaskV2QueryType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileRebateRebateDownloadCreateTaskV2QueryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileRebateRebateDownloadCreateTaskV2QueryType.fromValue(value);
    }
  }
}

