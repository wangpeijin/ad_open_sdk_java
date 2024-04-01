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
@JsonAdapter(CampaignUpdateStatusV2OptStatus.Adapter.class)
public enum CampaignUpdateStatusV2OptStatus {
  
  DELETE("delete"),
  
  ENABLE("enable"),
  
  DISABLE("disable");

  private String value;

  CampaignUpdateStatusV2OptStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignUpdateStatusV2OptStatus fromValue(String value) {
    for (CampaignUpdateStatusV2OptStatus b : CampaignUpdateStatusV2OptStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignUpdateStatusV2OptStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignUpdateStatusV2OptStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignUpdateStatusV2OptStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignUpdateStatusV2OptStatus.fromValue(value);
    }
  }
}

