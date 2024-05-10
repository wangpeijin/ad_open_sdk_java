/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@JsonAdapter(CampaignCreateV2DeliveryRelatedNum.Adapter.class)
public enum CampaignCreateV2DeliveryRelatedNum {
  
  SINGLE_DELIVERY("CAMPAIGN_DPA_SINGLE_DELIVERY"),
  
  MULTI_DELIVERY("CAMPAIGN_DPA_MULTI_DELIVERY"),
  
  DEFAULT_NOT("CAMPAIGN_DPA_DEFAULT_NOT");

  private String value;

  CampaignCreateV2DeliveryRelatedNum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignCreateV2DeliveryRelatedNum fromValue(String value) {
    for (CampaignCreateV2DeliveryRelatedNum b : CampaignCreateV2DeliveryRelatedNum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignCreateV2DeliveryRelatedNum> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignCreateV2DeliveryRelatedNum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignCreateV2DeliveryRelatedNum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignCreateV2DeliveryRelatedNum.fromValue(value);
    }
  }
}

