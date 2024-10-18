/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(MaterialStatusUpdateV30DataOptStatus.Adapter.class)
public enum MaterialStatusUpdateV30DataOptStatus {
  
  DISABLE("DISABLE"),
  
  ENABLE("ENABLE");

  private String value;

  MaterialStatusUpdateV30DataOptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MaterialStatusUpdateV30DataOptStatus fromValue(String value) {
    for (MaterialStatusUpdateV30DataOptStatus b : MaterialStatusUpdateV30DataOptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MaterialStatusUpdateV30DataOptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final MaterialStatusUpdateV30DataOptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MaterialStatusUpdateV30DataOptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MaterialStatusUpdateV30DataOptStatus.fromValue(value);
    }
  }
}

