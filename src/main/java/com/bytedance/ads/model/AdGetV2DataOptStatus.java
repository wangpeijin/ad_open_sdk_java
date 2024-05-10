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
@JsonAdapter(AdGetV2DataOptStatus.Adapter.class)
public enum AdGetV2DataOptStatus {
  
  DISABLE_BY_QUOTA("AD_STATUS_DISABLE_BY_QUOTA"),
  
  FROZEN("AD_STATUS_FROZEN"),
  
  ENABLE("AD_STATUS_ENABLE"),
  
  DISABLE("AD_STATUS_DISABLE");

  private String value;

  AdGetV2DataOptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataOptStatus fromValue(String value) {
    for (AdGetV2DataOptStatus b : AdGetV2DataOptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataOptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataOptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataOptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataOptStatus.fromValue(value);
    }
  }
}

