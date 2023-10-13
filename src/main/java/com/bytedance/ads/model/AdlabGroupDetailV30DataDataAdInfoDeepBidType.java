/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(AdlabGroupDetailV30DataDataAdInfoDeepBidType.Adapter.class)
public enum AdlabGroupDetailV30DataDataAdInfoDeepBidType {
  
  AUTO_MIN_SECOND_STAGE("AUTO_MIN_SECOND_STAGE"),
  
  BID_PER_ACTION("BID_PER_ACTION"),
  
  DEEP_BID_DEFAULT("DEEP_BID_DEFAULT"),
  
  DEEP_BID_MIN("DEEP_BID_MIN"),
  
  DEEP_BID_PACING("DEEP_BID_PACING"),
  
  DEEP_BID_TYPE_RETENTION_DAYS("DEEP_BID_TYPE_RETENTION_DAYS"),
  
  MIN_SECOND_STAGE("MIN_SECOND_STAGE"),
  
  PACING_SECOND_STAGE("PACING_SECOND_STAGE"),
  
  ROI_COEFFICIENT("ROI_COEFFICIENT"),
  
  ROI_PACING("ROI_PACING"),
  
  SMARTBID("SMARTBID"),
  
  SOCIAL_ROI("SOCIAL_ROI");

  private String value;

  AdlabGroupDetailV30DataDataAdInfoDeepBidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupDetailV30DataDataAdInfoDeepBidType fromValue(String value) {
    for (AdlabGroupDetailV30DataDataAdInfoDeepBidType b : AdlabGroupDetailV30DataDataAdInfoDeepBidType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupDetailV30DataDataAdInfoDeepBidType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupDetailV30DataDataAdInfoDeepBidType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupDetailV30DataDataAdInfoDeepBidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupDetailV30DataDataAdInfoDeepBidType.fromValue(value);
    }
  }
}

