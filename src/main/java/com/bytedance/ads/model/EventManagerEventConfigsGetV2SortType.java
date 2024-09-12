/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(EventManagerEventConfigsGetV2SortType.Adapter.class)
public enum EventManagerEventConfigsGetV2SortType {
  
  DESC("DESC"),
  
  ASC("ASC");

  private String value;

  EventManagerEventConfigsGetV2SortType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerEventConfigsGetV2SortType fromValue(String value) {
    for (EventManagerEventConfigsGetV2SortType b : EventManagerEventConfigsGetV2SortType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventManagerEventConfigsGetV2SortType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerEventConfigsGetV2SortType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerEventConfigsGetV2SortType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerEventConfigsGetV2SortType.fromValue(value);
    }
  }
}

