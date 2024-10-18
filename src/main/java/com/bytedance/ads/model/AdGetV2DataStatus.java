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
@JsonAdapter(AdGetV2DataStatus.Adapter.class)
public enum AdGetV2DataStatus {
  
  NO_SCHEDULE("AD_STATUS_NO_SCHEDULE"),
  
  REAUDIT("AD_STATUS_REAUDIT"),
  
  BALANCE_EXCEED("AD_STATUS_BALANCE_EXCEED"),
  
  DELIVERY_OK("AD_STATUS_DELIVERY_OK"),
  
  PRE_OFFLINE_BUDGET("AD_STATUS_PRE_OFFLINE_BUDGET"),
  
  DISABLE("AD_STATUS_DISABLE"),
  
  AWEME_ACCOUNT_DISABLED("AD_STATUS_AWEME_ACCOUNT_DISABLED"),
  
  CAMPAIGN_EXCEED("AD_STATUS_CAMPAIGN_EXCEED"),
  
  AUDIT_STATUS_ERROR("AD_STATUS_AUDIT_STATUS_ERROR"),
  
  DRAFT("AD_STATUS_DRAFT"),
  
  AUDIT("AD_STATUS_AUDIT"),
  
  AUDIT_DENY("AD_STATUS_AUDIT_DENY"),
  
  LIVE_CANNOT_LAUNCH("AD_STATUS_LIVE_CANNOT_LAUNCH"),
  
  CAMPAIGN_PRE_OFFLINE_BUDGET("AD_STATUS_CAMPAIGN_PRE_OFFLINE_BUDGET"),
  
  ADVERTISER_BUDGET_EXCEED("AD_STATUS_ADVERTISER_BUDGET_EXCEED"),
  
  EXTERNAL_URL_DISABLE("AD_STATUS_EXTERNAL_URL_DISABLE"),
  
  DATA_ERROR("AD_STATUS_DATA_ERROR"),
  
  CANNOT_EDIT("AD_STATUS_CANNOT_EDIT"),
  
  CAMPAIGN_DISABLE("AD_STATUS_CAMPAIGN_DISABLE"),
  
  DELETE("AD_STATUS_DELETE"),
  
  DSP_AD_DISABLE("AD_STATUS_DSP_AD_DISABLE"),
  
  PRODUCT_OFFLINE("AD_STATUS_PRODUCT_OFFLINE"),
  
  AWEME_ACCOUNT_PUNISHED("AD_STATUS_AWEME_ACCOUNT_PUNISHED"),
  
  FROZEN("AD_STATUS_FROZEN"),
  
  DISABLE_BY_QUOTA("AD_STATUS_DISABLE_BY_QUOTA"),
  
  DONE("AD_STATUS_DONE"),
  
  SOME_DELIVERY_OK("AD_STATUS_SOME_DELIVERY_OK"),
  
  PRE_ONLINE("AD_STATUS_PRE_ONLINE"),
  
  ADVERTISER_PRE_OFFLINE_BUDGET("AD_STATUS_ADVERTISER_PRE_OFFLINE_BUDGET"),
  
  LIVE_ROOM_OFF("AD_STATUS_LIVE_ROOM_OFF"),
  
  BUDGET_EXCEED("AD_STATUS_BUDGET_EXCEED"),
  
  CREATE("AD_STATUS_CREATE"),
  
  NOT_START("AD_STATUS_NOT_START");

  private String value;

  AdGetV2DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataStatus fromValue(String value) {
    for (AdGetV2DataStatus b : AdGetV2DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataStatus.fromValue(value);
    }
  }
}

