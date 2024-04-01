/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(ToolsNoBidSuggestBidV2FilteringPricing.Adapter.class)
public enum ToolsNoBidSuggestBidV2FilteringPricing {
  
  CPA("PRICING_CPA"),
  
  CPM("PRICING_CPM"),
  
  CPC_OCPM("PRICING_CPC_OCPM"),
  
  CPC("PRICING_CPC"),
  
  OCPC("PRICING_OCPC"),
  
  CPV("PRICING_CPV"),
  
  OCPM("PRICING_OCPM");

  private String value;

  ToolsNoBidSuggestBidV2FilteringPricing(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsNoBidSuggestBidV2FilteringPricing fromValue(String value) {
    for (ToolsNoBidSuggestBidV2FilteringPricing b : ToolsNoBidSuggestBidV2FilteringPricing.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsNoBidSuggestBidV2FilteringPricing> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsNoBidSuggestBidV2FilteringPricing enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsNoBidSuggestBidV2FilteringPricing read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsNoBidSuggestBidV2FilteringPricing.fromValue(value);
    }
  }
}

