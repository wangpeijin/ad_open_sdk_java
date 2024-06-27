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
@JsonAdapter(AudiencePackageUpdateV2AutoExtendTargets.Adapter.class)
public enum AudiencePackageUpdateV2AutoExtendTargets {
  
  INTEREST_TAG("INTEREST_TAG"),
  
  GENDER("GENDER"),
  
  AD_TAG("AD_TAG"),
  
  REGION("REGION"),
  
  AGE("AGE"),
  
  CUSTOM_AUDIENCE("CUSTOM_AUDIENCE");

  private String value;

  AudiencePackageUpdateV2AutoExtendTargets(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageUpdateV2AutoExtendTargets fromValue(String value) {
    for (AudiencePackageUpdateV2AutoExtendTargets b : AudiencePackageUpdateV2AutoExtendTargets.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageUpdateV2AutoExtendTargets> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageUpdateV2AutoExtendTargets enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageUpdateV2AutoExtendTargets read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageUpdateV2AutoExtendTargets.fromValue(value);
    }
  }
}

