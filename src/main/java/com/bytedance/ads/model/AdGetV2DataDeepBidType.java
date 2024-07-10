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
@JsonAdapter(AdGetV2DataDeepBidType.Adapter.class)
public enum AdGetV2DataDeepBidType {
  
  DEEP_BID_PACING("DEEP_BID_PACING"),
  
  AUTO_MIN_SECOND_STAGE("AUTO_MIN_SECOND_STAGE"),
  
  ROI_DIRECT_MAIL("ROI_DIRECT_MAIL"),
  
  DEEP_BID_TYPE_RETENTION_DAYS("DEEP_BID_TYPE_RETENTION_DAYS"),
  
  SMARTBID("SMARTBID"),
  
  MIN_SECOND_STAGE("MIN_SECOND_STAGE"),
  
  ROI_COEFFICIENT("ROI_COEFFICIENT"),
  
  DEEP_BID_MIN("DEEP_BID_MIN"),
  
  DEEP_BID_DEFAULT("DEEP_BID_DEFAULT"),
  
  BID_PER_ACTION("BID_PER_ACTION"),
  
  SOCIAL_ROI("SOCIAL_ROI"),
  
  ALI_FL("ALI_FL"),
  
  PACING_SECOND_STAGE("PACING_SECOND_STAGE"),
  
  ROI_PACING("ROI_PACING");

  private String value;

  AdGetV2DataDeepBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataDeepBidType fromValue(String value) {
    for (AdGetV2DataDeepBidType b : AdGetV2DataDeepBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataDeepBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataDeepBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataDeepBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataDeepBidType.fromValue(value);
    }
  }
}

