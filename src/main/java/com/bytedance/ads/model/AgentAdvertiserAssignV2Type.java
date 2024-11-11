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
@JsonAdapter(AgentAdvertiserAssignV2Type.Adapter.class)
public enum AgentAdvertiserAssignV2Type {
  
  BIDDING("BIDDING"),
  
  BRAND("BRAND");

  private String value;

  AgentAdvertiserAssignV2Type(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentAdvertiserAssignV2Type fromValue(String value) {
    for (AgentAdvertiserAssignV2Type b : AgentAdvertiserAssignV2Type.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentAdvertiserAssignV2Type> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentAdvertiserAssignV2Type enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentAdvertiserAssignV2Type read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentAdvertiserAssignV2Type.fromValue(value);
    }
  }
}

