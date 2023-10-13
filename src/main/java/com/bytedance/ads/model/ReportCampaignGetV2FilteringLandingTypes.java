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
@JsonAdapter(ReportCampaignGetV2FilteringLandingTypes.Adapter.class)
public enum ReportCampaignGetV2FilteringLandingTypes {
  
  ARTICLE("ARTICLE"),
  
  LINK("LINK"),
  
  AWEME("AWEME"),
  
  SHOP("SHOP"),
  
  APP("APP"),
  
  STORE("STORE"),
  
  GOODS("GOODS"),
  
  DPA("DPA"),
  
  LIVE("LIVE"),
  
  QUICK_APP("QUICK_APP");

  private String value;

  ReportCampaignGetV2FilteringLandingTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2FilteringLandingTypes fromValue(String value) {
    for (ReportCampaignGetV2FilteringLandingTypes b : ReportCampaignGetV2FilteringLandingTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2FilteringLandingTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2FilteringLandingTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2FilteringLandingTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2FilteringLandingTypes.fromValue(value);
    }
  }
}

