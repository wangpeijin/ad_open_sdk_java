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
@JsonAdapter(AicElementUpdateV30AccountType.Adapter.class)
public enum AicElementUpdateV30AccountType {
  
  AGENT("AGENT"),
  
  BP("BP");

  private String value;

  AicElementUpdateV30AccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AicElementUpdateV30AccountType fromValue(String value) {
    for (AicElementUpdateV30AccountType b : AicElementUpdateV30AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AicElementUpdateV30AccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AicElementUpdateV30AccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AicElementUpdateV30AccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AicElementUpdateV30AccountType.fromValue(value);
    }
  }
}

