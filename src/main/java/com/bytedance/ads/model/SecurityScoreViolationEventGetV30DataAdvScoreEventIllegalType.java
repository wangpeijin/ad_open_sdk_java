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
@JsonAdapter(SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType.Adapter.class)
public enum SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType {
  
  GENERAL("GENERAL"),
  
  ONECLASS("ONECLASS"),
  
  SERIOUS("SERIOUS"),
  
  TWOTHREECLASS("TWOTHREECLASS");

  private String value;

  SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType fromValue(String value) {
    for (SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType b : SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType.fromValue(value);
    }
  }
}

