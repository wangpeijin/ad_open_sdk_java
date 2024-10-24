/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@JsonAdapter(AgentAdvertiserAssignV2Role.Adapter.class)
public enum AgentAdvertiserAssignV2Role {
  
  COLLABORATOR("COLLABORATOR"),
  
  OPTIMIZER("OPTIMIZER");

  private String value;

  AgentAdvertiserAssignV2Role(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvertiserAssignV2Role fromValue(String value) {
    for (AgentAdvertiserAssignV2Role b : AgentAdvertiserAssignV2Role.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentAdvertiserAssignV2Role> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvertiserAssignV2Role enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvertiserAssignV2Role read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvertiserAssignV2Role.fromValue(value);
    }
  }
}

