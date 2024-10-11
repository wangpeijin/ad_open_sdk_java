/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(LocalProjectCreateV30ExternalAction.Adapter.class)
public enum LocalProjectCreateV30ExternalAction {
  
  FOLLOW_ACTION("FOLLOW_ACTION"),
  
  LIVE_ENGAGEMENT("LIVE_ENGAGEMENT"),
  
  LIVE_ENTER_ACTION("LIVE_ENTER_ACTION"),
  
  LIVE_OTO_CLICK("LIVE_OTO_CLICK"),
  
  LIVE_OTO_GROUP_BUYING("LIVE_OTO_GROUP_BUYING"),
  
  LIVE_STAY_TIME("LIVE_STAY_TIME"),
  
  NATIVE_ACTION("NATIVE_ACTION"),
  
  SHOW("SHOW");

  private String value;

  LocalProjectCreateV30ExternalAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectCreateV30ExternalAction fromValue(String value) {
    for (LocalProjectCreateV30ExternalAction b : LocalProjectCreateV30ExternalAction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectCreateV30ExternalAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectCreateV30ExternalAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectCreateV30ExternalAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectCreateV30ExternalAction.fromValue(value);
    }
  }
}

