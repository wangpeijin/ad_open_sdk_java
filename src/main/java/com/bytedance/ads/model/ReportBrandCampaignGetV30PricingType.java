/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
@JsonAdapter(ReportBrandCampaignGetV30PricingType.Adapter.class)
public enum ReportBrandCampaignGetV30PricingType {
  
  NUMBER_1(1l),
  
  NUMBER_10(10l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_5(5l),
  
  NUMBER_6(6l),
  
  NUMBER_7(7l),
  
  NUMBER_8(8l),
  
  NUMBER_9(9l);

  private Long value;

  ReportBrandCampaignGetV30PricingType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportBrandCampaignGetV30PricingType fromValue(Long value) {
    for (ReportBrandCampaignGetV30PricingType b : ReportBrandCampaignGetV30PricingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportBrandCampaignGetV30PricingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportBrandCampaignGetV30PricingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportBrandCampaignGetV30PricingType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ReportBrandCampaignGetV30PricingType.fromValue(value);
    }
  }
}

