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
@JsonAdapter(StardeliveryTaskDetailV30DataStarTaskSource.Adapter.class)
public enum StardeliveryTaskDetailV30DataStarTaskSource {
  
  MY_CREATIONS("MY_CREATIONS"),
  
  SHARING("SHARING");

  private String value;

  StardeliveryTaskDetailV30DataStarTaskSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StardeliveryTaskDetailV30DataStarTaskSource fromValue(String value) {
    for (StardeliveryTaskDetailV30DataStarTaskSource b : StardeliveryTaskDetailV30DataStarTaskSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StardeliveryTaskDetailV30DataStarTaskSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final StardeliveryTaskDetailV30DataStarTaskSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StardeliveryTaskDetailV30DataStarTaskSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StardeliveryTaskDetailV30DataStarTaskSource.fromValue(value);
    }
  }
}

