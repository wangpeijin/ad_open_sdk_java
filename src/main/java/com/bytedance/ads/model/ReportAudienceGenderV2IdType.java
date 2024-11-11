/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(ReportAudienceGenderV2IdType.Adapter.class)
public enum ReportAudienceGenderV2IdType {
  
  ADVERTISER("AUDIENCE_STAT_ID_TYPE_ADVERTISER"),
  
  CAMPAIGN("AUDIENCE_STAT_ID_TYPE_CAMPAIGN"),
  
  AD("AUDIENCE_STAT_ID_TYPE_AD");

  private String value;

  ReportAudienceGenderV2IdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAudienceGenderV2IdType fromValue(String value) {
    for (ReportAudienceGenderV2IdType b : ReportAudienceGenderV2IdType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAudienceGenderV2IdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAudienceGenderV2IdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAudienceGenderV2IdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAudienceGenderV2IdType.fromValue(value);
    }
  }
}

