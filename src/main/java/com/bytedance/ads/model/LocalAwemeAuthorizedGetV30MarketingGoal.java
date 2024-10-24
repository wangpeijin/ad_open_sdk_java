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
@JsonAdapter(LocalAwemeAuthorizedGetV30MarketingGoal.Adapter.class)
public enum LocalAwemeAuthorizedGetV30MarketingGoal {
  
  LIVE("LIVE"),
  
  VIDEO_IMAGE("VIDEO_IMAGE");

  private String value;

  LocalAwemeAuthorizedGetV30MarketingGoal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalAwemeAuthorizedGetV30MarketingGoal fromValue(String value) {
    for (LocalAwemeAuthorizedGetV30MarketingGoal b : LocalAwemeAuthorizedGetV30MarketingGoal.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalAwemeAuthorizedGetV30MarketingGoal> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalAwemeAuthorizedGetV30MarketingGoal enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalAwemeAuthorizedGetV30MarketingGoal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalAwemeAuthorizedGetV30MarketingGoal.fromValue(value);
    }
  }
}

