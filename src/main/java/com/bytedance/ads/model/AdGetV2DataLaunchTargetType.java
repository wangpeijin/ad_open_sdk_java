/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(AdGetV2DataLaunchTargetType.Adapter.class)
public enum AdGetV2DataLaunchTargetType {
  
  EXTERNAL("EXTERNAL"),
  
  APP("APP"),
  
  LIVE_CONVERT("LIVE_CONVERT");

  private String value;

  AdGetV2DataLaunchTargetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataLaunchTargetType fromValue(String value) {
    for (AdGetV2DataLaunchTargetType b : AdGetV2DataLaunchTargetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataLaunchTargetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataLaunchTargetType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataLaunchTargetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataLaunchTargetType.fromValue(value);
    }
  }
}

