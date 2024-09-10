/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@JsonAdapter(AudiencePackageUpdateV2SuperiorPopularityType.Adapter.class)
public enum AudiencePackageUpdateV2SuperiorPopularityType {
  
  GAME("GAME"),
  
  NONE("NONE");

  private String value;

  AudiencePackageUpdateV2SuperiorPopularityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageUpdateV2SuperiorPopularityType fromValue(String value) {
    for (AudiencePackageUpdateV2SuperiorPopularityType b : AudiencePackageUpdateV2SuperiorPopularityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageUpdateV2SuperiorPopularityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageUpdateV2SuperiorPopularityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageUpdateV2SuperiorPopularityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageUpdateV2SuperiorPopularityType.fromValue(value);
    }
  }
}

