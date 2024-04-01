/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes.Adapter.class)
public enum AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes {
  
  AD("AD"),
  
  APP("APP"),
  
  E_COMMERCE("E-COMMERCE"),
  
  NEWS("NEWS"),
  
  SEARCH("SEARCH");

  private String value;

  AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes fromValue(String value) {
    for (AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes b : AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageGetV2DataAudiencePackagesAudienceActionV2ActionScenes.fromValue(value);
    }
  }
}

