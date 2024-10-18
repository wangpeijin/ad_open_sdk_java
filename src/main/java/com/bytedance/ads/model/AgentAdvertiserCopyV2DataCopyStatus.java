/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(AgentAdvertiserCopyV2DataCopyStatus.Adapter.class)
public enum AgentAdvertiserCopyV2DataCopyStatus {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l);

  private Long value;

  AgentAdvertiserCopyV2DataCopyStatus(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvertiserCopyV2DataCopyStatus fromValue(Long value) {
    for (AgentAdvertiserCopyV2DataCopyStatus b : AgentAdvertiserCopyV2DataCopyStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentAdvertiserCopyV2DataCopyStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvertiserCopyV2DataCopyStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvertiserCopyV2DataCopyStatus read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return AgentAdvertiserCopyV2DataCopyStatus.fromValue(value);
    }
  }
}

