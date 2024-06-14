/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum.Adapter.class)
public enum AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum {
  
  DEFAULT_NOT("CAMPAIGN_DPA_DEFAULT_NOT"),
  
  SINGLE_DELIVERY("CAMPAIGN_DPA_SINGLE_DELIVERY");

  private String value;

  AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum fromValue(String value) {
    for (AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum b : AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum.fromValue(value);
    }
  }
}

