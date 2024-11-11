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
@JsonAdapter(AgentAdvCostReportListQueryV2DataListSystemOrigin.Adapter.class)
public enum AgentAdvCostReportListQueryV2DataListSystemOrigin {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  AgentAdvCostReportListQueryV2DataListSystemOrigin(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvCostReportListQueryV2DataListSystemOrigin fromValue(Long value) {
    for (AgentAdvCostReportListQueryV2DataListSystemOrigin b : AgentAdvCostReportListQueryV2DataListSystemOrigin.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentAdvCostReportListQueryV2DataListSystemOrigin> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvCostReportListQueryV2DataListSystemOrigin enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvCostReportListQueryV2DataListSystemOrigin read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return AgentAdvCostReportListQueryV2DataListSystemOrigin.fromValue(value);
    }
  }
}

