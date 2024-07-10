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
@JsonAdapter(ReportCampaignGetV2DataListPricing.Adapter.class)
public enum ReportCampaignGetV2DataListPricing {
  
  CPM("PRICING_CPM"),
  
  ECPC("PRICING_ECPC"),
  
  OCPC("PRICING_OCPC"),
  
  CPC("PRICING_CPC"),
  
  OCPM("PRICING_OCPM"),
  
  CPA("PRICING_CPA"),
  
  CPV("PRICING_CPV");

  private String value;

  ReportCampaignGetV2DataListPricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2DataListPricing fromValue(String value) {
    for (ReportCampaignGetV2DataListPricing b : ReportCampaignGetV2DataListPricing.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2DataListPricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2DataListPricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2DataListPricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2DataListPricing.fromValue(value);
    }
  }
}

