/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(AudiencePackageUpdateV2ConvertedTimeDuration.Adapter.class)
public enum AudiencePackageUpdateV2ConvertedTimeDuration {
  
  SEVEN_DAY("SEVEN_DAY"),
  
  THREE_MONTH("THREE_MONTH"),
  
  ONE_MONTH("ONE_MONTH"),
  
  NONE("NONE"),
  
  TWELVE_MONTH("TWELVE_MONTH"),
  
  TODAY("TODAY"),
  
  SIX_MONTH("SIX_MONTH");

  private String value;

  AudiencePackageUpdateV2ConvertedTimeDuration(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageUpdateV2ConvertedTimeDuration fromValue(String value) {
    for (AudiencePackageUpdateV2ConvertedTimeDuration b : AudiencePackageUpdateV2ConvertedTimeDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageUpdateV2ConvertedTimeDuration> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageUpdateV2ConvertedTimeDuration enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageUpdateV2ConvertedTimeDuration read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageUpdateV2ConvertedTimeDuration.fromValue(value);
    }
  }
}

