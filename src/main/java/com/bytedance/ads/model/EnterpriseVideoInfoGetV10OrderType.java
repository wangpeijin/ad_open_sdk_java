/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(EnterpriseVideoInfoGetV10OrderType.Adapter.class)
public enum EnterpriseVideoInfoGetV10OrderType {
  
  DESC("DESC"),
  
  ASC("ASC");

  private String value;

  EnterpriseVideoInfoGetV10OrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnterpriseVideoInfoGetV10OrderType fromValue(String value) {
    for (EnterpriseVideoInfoGetV10OrderType b : EnterpriseVideoInfoGetV10OrderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnterpriseVideoInfoGetV10OrderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnterpriseVideoInfoGetV10OrderType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnterpriseVideoInfoGetV10OrderType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnterpriseVideoInfoGetV10OrderType.fromValue(value);
    }
  }
}

