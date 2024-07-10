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
@JsonAdapter(ReportCampaignGetV2FilteringPricings.Adapter.class)
public enum ReportCampaignGetV2FilteringPricings {
  
  CPM("PRICING_CPM"),
  
  ECPC("PRICING_ECPC"),
  
  OCPC("PRICING_OCPC"),
  
  CPC("PRICING_CPC"),
  
  OCPM("PRICING_OCPM"),
  
  CPA("PRICING_CPA"),
  
  CPV("PRICING_CPV");

  private String value;

  ReportCampaignGetV2FilteringPricings(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2FilteringPricings fromValue(String value) {
    for (ReportCampaignGetV2FilteringPricings b : ReportCampaignGetV2FilteringPricings.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2FilteringPricings> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2FilteringPricings enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2FilteringPricings read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2FilteringPricings.fromValue(value);
    }
  }
}

