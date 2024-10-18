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
@JsonAdapter(LocalReportProjectGetV30FilteringCampaignType.Adapter.class)
public enum LocalReportProjectGetV30FilteringCampaignType {
  
  GENERAL("GENERAL"),
  
  SEARCHING("SEARCHING");

  private String value;

  LocalReportProjectGetV30FilteringCampaignType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalReportProjectGetV30FilteringCampaignType fromValue(String value) {
    for (LocalReportProjectGetV30FilteringCampaignType b : LocalReportProjectGetV30FilteringCampaignType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalReportProjectGetV30FilteringCampaignType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalReportProjectGetV30FilteringCampaignType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalReportProjectGetV30FilteringCampaignType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalReportProjectGetV30FilteringCampaignType.fromValue(value);
    }
  }
}

