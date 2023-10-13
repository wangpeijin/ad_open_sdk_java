/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
@JsonAdapter(ReportCreativeGetV2FilteringPricing.Adapter.class)
public enum ReportCreativeGetV2FilteringPricing {
  
  OCPM("PRICING_OCPM"),
  
  CPM("PRICING_CPM"),
  
  CPV("PRICING_CPV"),
  
  CPA("PRICING_CPA"),
  
  CPC("PRICING_CPC"),
  
  CPC_OCPM("PRICING_CPC_OCPM"),
  
  OCPC("PRICING_OCPC");

  private String value;

  ReportCreativeGetV2FilteringPricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2FilteringPricing fromValue(String value) {
    for (ReportCreativeGetV2FilteringPricing b : ReportCreativeGetV2FilteringPricing.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2FilteringPricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2FilteringPricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2FilteringPricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2FilteringPricing.fromValue(value);
    }
  }
}

