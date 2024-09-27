/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@JsonAdapter(ToolsClueLifeGetV2DataListEffectiveStateName.Adapter.class)
public enum ToolsClueLifeGetV2DataListEffectiveStateName {
  
  NOT_MARKED("NOT_MARKED"),
  
  NEED_CALLBACK("NEED_CALLBACK"),
  
  CONVERTED("CONVERTED"),
  
  INVALID("INVALID"),
  
  ADD_WEIXIN("ADD_WEIXIN"),
  
  WAIT_CONNECT("WAIT_CONNECT"),
  
  ARRIVE_STORE("ARRIVE_STORE");

  private String value;

  ToolsClueLifeGetV2DataListEffectiveStateName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueLifeGetV2DataListEffectiveStateName fromValue(String value) {
    for (ToolsClueLifeGetV2DataListEffectiveStateName b : ToolsClueLifeGetV2DataListEffectiveStateName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsClueLifeGetV2DataListEffectiveStateName> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueLifeGetV2DataListEffectiveStateName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueLifeGetV2DataListEffectiveStateName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueLifeGetV2DataListEffectiveStateName.fromValue(value);
    }
  }
}

