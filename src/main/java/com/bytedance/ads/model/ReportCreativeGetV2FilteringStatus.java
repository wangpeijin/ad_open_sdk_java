/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@JsonAdapter(ReportCreativeGetV2FilteringStatus.Adapter.class)
public enum ReportCreativeGetV2FilteringStatus {
  
  DELIVERY_OK("CREATIVE_STATUS_DELIVERY_OK"),
  
  BUDGET_EXCEED("CREATIVE_STATUS_BUDGET_EXCEED"),
  
  AUDIT("CREATIVE_STATUS_AUDIT"),
  
  DISABLE("CREATIVE_STATUS_DISABLE"),
  
  DONE("CREATIVE_STATUS_DONE"),
  
  REAUDIT("CREATIVE_STATUS_REAUDIT"),
  
  NOT_START("CREATIVE_STATUS_NOT_START"),
  
  CAMPAIGN_DISABLE("CREATIVE_STATUS_CAMPAIGN_DISABLE"),
  
  AD_AUDIT("CREATIVE_STATUS_AD_AUDIT"),
  
  ALL("CREATIVE_STATUS_ALL"),
  
  NOT_DELETE("CREATIVE_STATUS_NOT_DELETE"),
  
  AD_DISABLE("CREATIVE_STATUS_AD_DISABLE"),
  
  CAMPAIGN_EXCEED("CREATIVE_STATUS_CAMPAIGN_EXCEED"),
  
  DELETE("CREATIVE_STATUS_DELETE"),
  
  BALANCE_EXCEED("CREATIVE_STATUS_BALANCE_EXCEED"),
  
  AD_AUDIT_DENY("CREATIVE_STATUS_AD_AUDIT_DENY"),
  
  NO_SCHEDULE("CREATIVE_STATUS_NO_SCHEDULE"),
  
  AD_REAUDIT("CREATIVE_STATUS_AD_REAUDIT"),
  
  AUDIT_DENY("CREATIVE_STATUS_AUDIT_DENY");

  private String value;

  ReportCreativeGetV2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2FilteringStatus fromValue(String value) {
    for (ReportCreativeGetV2FilteringStatus b : ReportCreativeGetV2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2FilteringStatus.fromValue(value);
    }
  }
}
