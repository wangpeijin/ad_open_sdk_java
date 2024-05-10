/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@JsonAdapter(StardeliveryTaskCreateResultGetV30DataStatus.Adapter.class)
public enum StardeliveryTaskCreateResultGetV30DataStatus {
  
  FAILED("FAILED"),
  
  RUNNING("RUNNING"),
  
  SUCCESS("SUCCESS");

  private String value;

  StardeliveryTaskCreateResultGetV30DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StardeliveryTaskCreateResultGetV30DataStatus fromValue(String value) {
    for (StardeliveryTaskCreateResultGetV30DataStatus b : StardeliveryTaskCreateResultGetV30DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StardeliveryTaskCreateResultGetV30DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StardeliveryTaskCreateResultGetV30DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StardeliveryTaskCreateResultGetV30DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StardeliveryTaskCreateResultGetV30DataStatus.fromValue(value);
    }
  }
}

