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
@JsonAdapter(AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration.Adapter.class)
public enum AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration {
  
  NONE("NONE"),
  
  ONE_MONTH("ONE_MONTH"),
  
  SEVEN_DAY("SEVEN_DAY"),
  
  SIX_MONTH("SIX_MONTH"),
  
  THREE_MONTH("THREE_MONTH"),
  
  TODAY("TODAY"),
  
  TWELVE_MONTH("TWELVE_MONTH");

  private String value;

  AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration fromValue(String value) {
    for (AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration b : AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration.fromValue(value);
    }
  }
}

