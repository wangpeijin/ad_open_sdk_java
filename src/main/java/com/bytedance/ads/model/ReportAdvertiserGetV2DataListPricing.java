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
@JsonAdapter(ReportAdvertiserGetV2DataListPricing.Adapter.class)
public enum ReportAdvertiserGetV2DataListPricing {
  
  CPC("PRICING_CPC"),
  
  CPA("PRICING_CPA"),
  
  ECPC("PRICING_ECPC"),
  
  CPV("PRICING_CPV"),
  
  OCPM("PRICING_OCPM"),
  
  OCPC("PRICING_OCPC"),
  
  CPM("PRICING_CPM");

  private String value;

  ReportAdvertiserGetV2DataListPricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdvertiserGetV2DataListPricing fromValue(String value) {
    for (ReportAdvertiserGetV2DataListPricing b : ReportAdvertiserGetV2DataListPricing.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdvertiserGetV2DataListPricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdvertiserGetV2DataListPricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdvertiserGetV2DataListPricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdvertiserGetV2DataListPricing.fromValue(value);
    }
  }
}

