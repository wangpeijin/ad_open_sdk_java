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
@JsonAdapter(AudiencePackageCreateV2ConvertedTimeDuration.Adapter.class)
public enum AudiencePackageCreateV2ConvertedTimeDuration {
  
  THREE_MONTH("THREE_MONTH"),
  
  SEVEN_DAY("SEVEN_DAY"),
  
  NONE("NONE"),
  
  TODAY("TODAY"),
  
  ONE_MONTH("ONE_MONTH"),
  
  TWELVE_MONTH("TWELVE_MONTH"),
  
  SIX_MONTH("SIX_MONTH");

  private String value;

  AudiencePackageCreateV2ConvertedTimeDuration(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageCreateV2ConvertedTimeDuration fromValue(String value) {
    for (AudiencePackageCreateV2ConvertedTimeDuration b : AudiencePackageCreateV2ConvertedTimeDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageCreateV2ConvertedTimeDuration> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageCreateV2ConvertedTimeDuration enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageCreateV2ConvertedTimeDuration read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageCreateV2ConvertedTimeDuration.fromValue(value);
    }
  }
}

