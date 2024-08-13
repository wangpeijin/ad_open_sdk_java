/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(AdGetV2DataAudienceAwemeFanTimeScope.Adapter.class)
public enum AdGetV2DataAudienceAwemeFanTimeScope {
  
  FIFTEEN_DAYS("FIFTEEN_DAYS"),
  
  THIRTY_DAYS("THIRTY_DAYS"),
  
  SIXTY_DAYS("SIXTY_DAYS");

  private String value;

  AdGetV2DataAudienceAwemeFanTimeScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceAwemeFanTimeScope fromValue(String value) {
    for (AdGetV2DataAudienceAwemeFanTimeScope b : AdGetV2DataAudienceAwemeFanTimeScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceAwemeFanTimeScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceAwemeFanTimeScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceAwemeFanTimeScope read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceAwemeFanTimeScope.fromValue(value);
    }
  }
}

