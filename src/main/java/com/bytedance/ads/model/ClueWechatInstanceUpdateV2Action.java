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
@JsonAdapter(ClueWechatInstanceUpdateV2Action.Adapter.class)
public enum ClueWechatInstanceUpdateV2Action {
  
  ENABLE("ENABLE"),
  
  DISABLE("DISABLE"),
  
  DELETE("DELETE"),
  
  ADD("ADD");

  private String value;

  ClueWechatInstanceUpdateV2Action(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueWechatInstanceUpdateV2Action fromValue(String value) {
    for (ClueWechatInstanceUpdateV2Action b : ClueWechatInstanceUpdateV2Action.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ClueWechatInstanceUpdateV2Action> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueWechatInstanceUpdateV2Action enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueWechatInstanceUpdateV2Action read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueWechatInstanceUpdateV2Action.fromValue(value);
    }
  }
}

