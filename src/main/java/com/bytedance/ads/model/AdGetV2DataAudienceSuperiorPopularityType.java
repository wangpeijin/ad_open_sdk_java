/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@JsonAdapter(AdGetV2DataAudienceSuperiorPopularityType.Adapter.class)
public enum AdGetV2DataAudienceSuperiorPopularityType {
  
  GAME("GAME"),
  
  NONE("NONE");

  private String value;

  AdGetV2DataAudienceSuperiorPopularityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceSuperiorPopularityType fromValue(String value) {
    for (AdGetV2DataAudienceSuperiorPopularityType b : AdGetV2DataAudienceSuperiorPopularityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceSuperiorPopularityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceSuperiorPopularityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceSuperiorPopularityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceSuperiorPopularityType.fromValue(value);
    }
  }
}

