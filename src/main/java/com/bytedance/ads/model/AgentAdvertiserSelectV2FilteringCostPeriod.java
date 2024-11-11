/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(AgentAdvertiserSelectV2FilteringCostPeriod.Adapter.class)
public enum AgentAdvertiserSelectV2FilteringCostPeriod {
  
  YESTERDAY("YESTERDAY"),
  
  LAST_30_DAYS("LAST_30_DAYS"),
  
  TODAY("TODAY"),
  
  LAST_7_DAYS("LAST_7_DAYS"),
  
  LAST_15_DAYS("LAST_15_DAYS");

  private String value;

  AgentAdvertiserSelectV2FilteringCostPeriod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvertiserSelectV2FilteringCostPeriod fromValue(String value) {
    for (AgentAdvertiserSelectV2FilteringCostPeriod b : AgentAdvertiserSelectV2FilteringCostPeriod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentAdvertiserSelectV2FilteringCostPeriod> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvertiserSelectV2FilteringCostPeriod enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvertiserSelectV2FilteringCostPeriod read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvertiserSelectV2FilteringCostPeriod.fromValue(value);
    }
  }
}

