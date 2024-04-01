/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(EventManagerShareV30DataErrorListAllAccountType.Adapter.class)
public enum EventManagerShareV30DataErrorListAllAccountType {
  
  AD("AD");

  private String value;

  EventManagerShareV30DataErrorListAllAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerShareV30DataErrorListAllAccountType fromValue(String value) {
    for (EventManagerShareV30DataErrorListAllAccountType b : EventManagerShareV30DataErrorListAllAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventManagerShareV30DataErrorListAllAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerShareV30DataErrorListAllAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerShareV30DataErrorListAllAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerShareV30DataErrorListAllAccountType.fromValue(value);
    }
  }
}

