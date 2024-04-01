/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
  
  CAMPAIGN_DISABLE("CREATIVE_STATUS_CAMPAIGN_DISABLE"),
  
  AD_REAUDIT("CREATIVE_STATUS_AD_REAUDIT"),
  
  ALL("CREATIVE_STATUS_ALL"),
  
  AD_AUDIT_DENY("CREATIVE_STATUS_AD_AUDIT_DENY"),
  
  NOT_DELETE("CREATIVE_STATUS_NOT_DELETE"),
  
  AD_DISABLE("CREATIVE_STATUS_AD_DISABLE"),
  
  AUDIT_DENY("CREATIVE_STATUS_AUDIT_DENY"),
  
  DONE("CREATIVE_STATUS_DONE"),
  
  NO_SCHEDULE("CREATIVE_STATUS_NO_SCHEDULE"),
  
  REAUDIT("CREATIVE_STATUS_REAUDIT"),
  
  DISABLE("CREATIVE_STATUS_DISABLE"),
  
  DELETE("CREATIVE_STATUS_DELETE"),
  
  NOT_START("CREATIVE_STATUS_NOT_START"),
  
  AD_AUDIT("CREATIVE_STATUS_AD_AUDIT"),
  
  AUDIT("CREATIVE_STATUS_AUDIT"),
  
  BALANCE_EXCEED("CREATIVE_STATUS_BALANCE_EXCEED"),
  
  CAMPAIGN_EXCEED("CREATIVE_STATUS_CAMPAIGN_EXCEED"),
  
  DELIVERY_OK("CREATIVE_STATUS_DELIVERY_OK"),
  
  BUDGET_EXCEED("CREATIVE_STATUS_BUDGET_EXCEED");

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

