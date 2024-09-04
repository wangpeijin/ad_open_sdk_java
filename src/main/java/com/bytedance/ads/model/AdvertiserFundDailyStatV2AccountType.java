/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
@JsonAdapter(AdvertiserFundDailyStatV2AccountType.Adapter.class)
public enum AdvertiserFundDailyStatV2AccountType {
  
  AD("AD"),
  
  LOCAL("LOCAL"),
  
  STAR("STAR");

  private String value;

  AdvertiserFundDailyStatV2AccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserFundDailyStatV2AccountType fromValue(String value) {
    for (AdvertiserFundDailyStatV2AccountType b : AdvertiserFundDailyStatV2AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdvertiserFundDailyStatV2AccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserFundDailyStatV2AccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserFundDailyStatV2AccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserFundDailyStatV2AccountType.fromValue(value);
    }
  }
}

