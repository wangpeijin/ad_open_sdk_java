/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@JsonAdapter(EventManagerDeepBidTypeGetV30DataDeepBidType.Adapter.class)
public enum EventManagerDeepBidTypeGetV30DataDeepBidType {
  
  ALI_FL("ALI_FL"),
  
  AUTO_MIN_SECOND_STAGE("AUTO_MIN_SECOND_STAGE"),
  
  BID_PER_ACTION("BID_PER_ACTION"),
  
  DEEP_BID_DEFAULT("DEEP_BID_DEFAULT"),
  
  DEEP_BID_MIN("DEEP_BID_MIN"),
  
  DEEP_BID_PACING("DEEP_BID_PACING"),
  
  DEEP_BID_TYPE_RETENTION_DAYS("DEEP_BID_TYPE_RETENTION_DAYS"),
  
  FIRST_AND_SEVEN_PAY_ROI("FIRST_AND_SEVEN_PAY_ROI"),
  
  FORM_BID("FORM_BID"),
  
  MIN_SECOND_STAGE("MIN_SECOND_STAGE"),
  
  PACING_SECOND_STAGE("PACING_SECOND_STAGE"),
  
  PER_AND_SEVEN_PAY_ROI("PER_AND_SEVEN_PAY_ROI"),
  
  PHONE_CONNECT_BID("PHONE_CONNECT_BID"),
  
  ROI_COEFFICIENT("ROI_COEFFICIENT"),
  
  ROI_DIRECT_MAIL("ROI_DIRECT_MAIL"),
  
  ROI_PACING("ROI_PACING"),
  
  SMARTBID("SMARTBID"),
  
  SOCIAL_ROI("SOCIAL_ROI");

  private String value;

  EventManagerDeepBidTypeGetV30DataDeepBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerDeepBidTypeGetV30DataDeepBidType fromValue(String value) {
    for (EventManagerDeepBidTypeGetV30DataDeepBidType b : EventManagerDeepBidTypeGetV30DataDeepBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventManagerDeepBidTypeGetV30DataDeepBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerDeepBidTypeGetV30DataDeepBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerDeepBidTypeGetV30DataDeepBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerDeepBidTypeGetV30DataDeepBidType.fromValue(value);
    }
  }
}

