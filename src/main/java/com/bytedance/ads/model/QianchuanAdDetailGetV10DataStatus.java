/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
@JsonAdapter(QianchuanAdDetailGetV10DataStatus.Adapter.class)
public enum QianchuanAdDetailGetV10DataStatus {
  
  ADVERTISER_OFFLINE_BUDGET("ADVERTISER_OFFLINE_BUDGET"),
  
  ADVERTISER_PRE_OFFLINE_BUDGET("ADVERTISER_PRE_OFFLINE_BUDGET"),
  
  AUDIT("AUDIT"),
  
  AUDIT_STATUS_ERROR("AUDIT_STATUS_ERROR"),
  
  AWEME_ACCOUNT_DISABLED("AWEME_ACCOUNT_DISABLED"),
  
  CAMPAIGN_DISABLE("CAMPAIGN_DISABLE"),
  
  CAMPAIGN_OFFLINE_BUDGET("CAMPAIGN_OFFLINE_BUDGET"),
  
  CAMPAIGN_PRE_OFFLINE_BUDGET("CAMPAIGN_PRE_OFFLINE_BUDGET"),
  
  CREATE("CREATE"),
  
  DELETE("DELETE"),
  
  DELIVERY_OK("DELIVERY_OK"),
  
  DISABLE("DISABLE"),
  
  DRAFT("DRAFT"),
  
  ERROR("ERROR"),
  
  EXTERNAL_URL_DISABLE("EXTERNAL_URL_DISABLE"),
  
  FROZEN("FROZEN"),
  
  LIVE_ROOM_OFF("LIVE_ROOM_OFF"),
  
  NO_SCHEDULE("NO_SCHEDULE"),
  
  OFFLINE_AUDIT("OFFLINE_AUDIT"),
  
  OFFLINE_BALANCE("OFFLINE_BALANCE"),
  
  OFFLINE_BUDGET("OFFLINE_BUDGET"),
  
  PRE_OFFLINE_BUDGET("PRE_OFFLINE_BUDGET"),
  
  PRE_ONLINE("PRE_ONLINE"),
  
  QUOTA_DISABLE("QUOTA_DISABLE"),
  
  REAUDIT("REAUDIT"),
  
  ROI2_DISABLE("ROI2_DISABLE"),
  
  SYSTEM_DISABLE("SYSTEM_DISABLE"),
  
  TIME_DONE("TIME_DONE"),
  
  TIME_NO_REACH("TIME_NO_REACH");

  private String value;

  QianchuanAdDetailGetV10DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataStatus fromValue(String value) {
    for (QianchuanAdDetailGetV10DataStatus b : QianchuanAdDetailGetV10DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataStatus.fromValue(value);
    }
  }
}

