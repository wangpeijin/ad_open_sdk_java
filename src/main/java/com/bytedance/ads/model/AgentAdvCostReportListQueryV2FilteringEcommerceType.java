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
@JsonAdapter(AgentAdvCostReportListQueryV2FilteringEcommerceType.Adapter.class)
public enum AgentAdvCostReportListQueryV2FilteringEcommerceType {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l),
  
  NUMBER_5(5l);

  private Long value;

  AgentAdvCostReportListQueryV2FilteringEcommerceType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvCostReportListQueryV2FilteringEcommerceType fromValue(Long value) {
    for (AgentAdvCostReportListQueryV2FilteringEcommerceType b : AgentAdvCostReportListQueryV2FilteringEcommerceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentAdvCostReportListQueryV2FilteringEcommerceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvCostReportListQueryV2FilteringEcommerceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvCostReportListQueryV2FilteringEcommerceType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return AgentAdvCostReportListQueryV2FilteringEcommerceType.fromValue(value);
    }
  }
}

