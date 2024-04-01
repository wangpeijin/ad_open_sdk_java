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
@JsonAdapter(ReportAdGetV2FilteringStatus.Adapter.class)
public enum ReportAdGetV2FilteringStatus {
  
  DELETE("AD_STATUS_DELETE"),
  
  REAUDIT("AD_STATUS_REAUDIT"),
  
  DONE("AD_STATUS_DONE"),
  
  AUDIT_DENY("AD_STATUS_AUDIT_DENY"),
  
  CAMPAIGN_EXCEED("AD_STATUS_CAMPAIGN_EXCEED"),
  
  NO_SCHEDULE("AD_STATUS_NO_SCHEDULE"),
  
  DISABLE("AD_STATUS_DISABLE"),
  
  BALANCE_EXCEED("AD_STATUS_BALANCE_EXCEED"),
  
  DELIVERY_OK("AD_STATUS_DELIVERY_OK"),
  
  CAMPAIGN_DISABLE("AD_STATUS_CAMPAIGN_DISABLE"),
  
  NOT_DELETE("AD_STATUS_NOT_DELETE"),
  
  CREATE("AD_STATUS_CREATE"),
  
  ALL("AD_STATUS_ALL"),
  
  BUDGET_EXCEED("AD_STATUS_BUDGET_EXCEED"),
  
  NOT_START("AD_STATUS_NOT_START"),
  
  AUDIT("AD_STATUS_AUDIT");

  private String value;

  ReportAdGetV2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2FilteringStatus fromValue(String value) {
    for (ReportAdGetV2FilteringStatus b : ReportAdGetV2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2FilteringStatus.fromValue(value);
    }
  }
}

