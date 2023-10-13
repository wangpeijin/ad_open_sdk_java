/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
@JsonAdapter(ReportCampaignGetV2FilteringCampaignTypes.Adapter.class)
public enum ReportCampaignGetV2FilteringCampaignTypes {
  
  FEED("FEED"),
  
  CONTENT("CONTENT"),
  
  SEARCH("SEARCH");

  private String value;

  ReportCampaignGetV2FilteringCampaignTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2FilteringCampaignTypes fromValue(String value) {
    for (ReportCampaignGetV2FilteringCampaignTypes b : ReportCampaignGetV2FilteringCampaignTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2FilteringCampaignTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2FilteringCampaignTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2FilteringCampaignTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2FilteringCampaignTypes.fromValue(value);
    }
  }
}

