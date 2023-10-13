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
@JsonAdapter(CampaignGetV2DataListCampaignType.Adapter.class)
public enum CampaignGetV2DataListCampaignType {
  
  FEED("FEED"),
  
  CONTENT("CONTENT"),
  
  SEARCH("SEARCH");

  private String value;

  CampaignGetV2DataListCampaignType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignGetV2DataListCampaignType fromValue(String value) {
    for (CampaignGetV2DataListCampaignType b : CampaignGetV2DataListCampaignType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignGetV2DataListCampaignType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignGetV2DataListCampaignType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignGetV2DataListCampaignType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignGetV2DataListCampaignType.fromValue(value);
    }
  }
}

