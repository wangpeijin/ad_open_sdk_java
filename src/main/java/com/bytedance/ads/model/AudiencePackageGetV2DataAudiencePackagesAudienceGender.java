/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(AudiencePackageGetV2DataAudiencePackagesAudienceGender.Adapter.class)
public enum AudiencePackageGetV2DataAudiencePackagesAudienceGender {
  
  FEMALE("GENDER_FEMALE"),
  
  MALE("GENDER_MALE"),
  
  UNLIMITED("GENDER_UNLIMITED");

  private String value;

  AudiencePackageGetV2DataAudiencePackagesAudienceGender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageGetV2DataAudiencePackagesAudienceGender fromValue(String value) {
    for (AudiencePackageGetV2DataAudiencePackagesAudienceGender b : AudiencePackageGetV2DataAudiencePackagesAudienceGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudiencePackageGetV2DataAudiencePackagesAudienceGender> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageGetV2DataAudiencePackagesAudienceGender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageGetV2DataAudiencePackagesAudienceGender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageGetV2DataAudiencePackagesAudienceGender.fromValue(value);
    }
  }
}

