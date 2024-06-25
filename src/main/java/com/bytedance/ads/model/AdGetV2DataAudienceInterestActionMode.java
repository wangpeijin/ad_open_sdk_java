/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
@JsonAdapter(AdGetV2DataAudienceInterestActionMode.Adapter.class)
public enum AdGetV2DataAudienceInterestActionMode {
  
  UNLIMITED("UNLIMITED"),
  
  RECOMMEND("RECOMMEND"),
  
  CUSTOM("CUSTOM");

  private String value;

  AdGetV2DataAudienceInterestActionMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceInterestActionMode fromValue(String value) {
    for (AdGetV2DataAudienceInterestActionMode b : AdGetV2DataAudienceInterestActionMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceInterestActionMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceInterestActionMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceInterestActionMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceInterestActionMode.fromValue(value);
    }
  }
}

