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
@JsonAdapter(AudiencePackageGetV2FilteringDeliveryRange.Adapter.class)
public enum AudiencePackageGetV2FilteringDeliveryRange {
  
  DEFAULT("DEFAULT"),
  
  UNION("UNION"),
  
  UNIVERSAL("UNIVERSAL");

  private String value;

  AudiencePackageGetV2FilteringDeliveryRange(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageGetV2FilteringDeliveryRange fromValue(String value) {
    for (AudiencePackageGetV2FilteringDeliveryRange b : AudiencePackageGetV2FilteringDeliveryRange.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageGetV2FilteringDeliveryRange> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageGetV2FilteringDeliveryRange enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageGetV2FilteringDeliveryRange read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageGetV2FilteringDeliveryRange.fromValue(value);
    }
  }
}

