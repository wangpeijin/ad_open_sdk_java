/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.21
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
@JsonAdapter(LocalPromotionListV30FilteringPromotionStatusSecond.Adapter.class)
public enum LocalPromotionListV30FilteringPromotionStatusSecond {
  
  AUDIT("AUDIT"),
  
  AUDIT_DENY("AUDIT_DENY"),
  
  AWEME_ACCOUNT_DISABLED("AWEME_ACCOUNT_DISABLED"),
  
  BALANCE_OFFLINE_BUDGET("BALANCE_OFFLINE_BUDGET"),
  
  DISABLED("DISABLED"),
  
  DISABLE_BY_QUOTA("DISABLE_BY_QUOTA"),
  
  LIVE_ROOM_OFF("LIVE_ROOM_OFF"),
  
  NO_SCHEDULE("NO_SCHEDULE"),
  
  OFFLINE_BALANCE("OFFLINE_BALANCE"),
  
  PRODUCT_OR_POI_OFFLINE("PRODUCT_OR_POI_OFFLINE"),
  
  PROJECT_DISABLED("PROJECT_DISABLED"),
  
  PROJECT_OFFLINE_BUDGET("PROJECT_OFFLINE_BUDGET"),
  
  PROMOTION_OFFLINE_BUDGET("PROMOTION_OFFLINE_BUDGET"),
  
  REAUDIT("REAUDIT"),
  
  TIME_NO_REACH("TIME_NO_REACH");

  private String value;

  LocalPromotionListV30FilteringPromotionStatusSecond(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionListV30FilteringPromotionStatusSecond fromValue(String value) {
    for (LocalPromotionListV30FilteringPromotionStatusSecond b : LocalPromotionListV30FilteringPromotionStatusSecond.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalPromotionListV30FilteringPromotionStatusSecond> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionListV30FilteringPromotionStatusSecond enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionListV30FilteringPromotionStatusSecond read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionListV30FilteringPromotionStatusSecond.fromValue(value);
    }
  }
}
