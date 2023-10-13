/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
@JsonAdapter(AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted.Adapter.class)
public enum AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted {
  
  AD("AD"),
  
  ADVERTISER("ADVERTISER"),
  
  APP("APP"),
  
  CAMPAIGN("CAMPAIGN"),
  
  CUSTOMER("CUSTOMER"),
  
  NO_EXCLUDE("NO_EXCLUDE"),
  
  ORGANIZATION("ORGANIZATION");

  private String value;

  AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted fromValue(String value) {
    for (AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted b : AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdlabGroupListV30DataGroupsAdInfoAudienceHideIfConverted.fromValue(value);
    }
  }
}

