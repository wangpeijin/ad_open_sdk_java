/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(PromotionListV30DataListStatusSecond.Adapter.class)
public enum PromotionListV30DataListStatusSecond {
  
  APP_NOT_ALLOWED("APP_NOT_ALLOWED"),
  
  AUDIT("AUDIT"),
  
  AUDIT_DENY("AUDIT_DENY"),
  
  AWEME_ACCOUNT_DISABLED("AWEME_ACCOUNT_DISABLED"),
  
  AWEME_ACCOUNT_OPTIMIZABLE("AWEME_ACCOUNT_OPTIMIZABLE"),
  
  AWEME_ANCHOR_DISABLED("AWEME_ANCHOR_DISABLED"),
  
  AWEME_VIDEO_OPTIMIZABLE("AWEME_VIDEO_OPTIMIZABLE"),
  
  BALANCE_OFFLINE_BUDGET("BALANCE_OFFLINE_BUDGET"),
  
  BUDGET_GROUP_OFFLINE_BUDGET("BUDGET_GROUP_OFFLINE_BUDGET"),
  
  DISABLED("DISABLED"),
  
  DISABLE_BY_QUOTA("DISABLE_BY_QUOTA"),
  
  LIVE_ROOM_OFF("LIVE_ROOM_OFF"),
  
  NO_SCHEDULE("NO_SCHEDULE"),
  
  OFFLINE_BALANCE("OFFLINE_BALANCE"),
  
  PRODUCT_OFFLINE("PRODUCT_OFFLINE"),
  
  PROJECT_DISABLED("PROJECT_DISABLED"),
  
  PROJECT_OFFLINE_BUDGET("PROJECT_OFFLINE_BUDGET"),
  
  PROMOTION_OFFLINE_BUDGET("PROMOTION_OFFLINE_BUDGET"),
  
  REAUDIT("REAUDIT"),
  
  TIME_NO_REACH("TIME_NO_REACH");

  private String value;

  PromotionListV30DataListStatusSecond(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListStatusSecond fromValue(String value) {
    for (PromotionListV30DataListStatusSecond b : PromotionListV30DataListStatusSecond.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListStatusSecond> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListStatusSecond enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListStatusSecond read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListStatusSecond.fromValue(value);
    }
  }
}

