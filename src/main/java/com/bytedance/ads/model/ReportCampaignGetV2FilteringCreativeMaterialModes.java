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
@JsonAdapter(ReportCampaignGetV2FilteringCreativeMaterialModes.Adapter.class)
public enum ReportCampaignGetV2FilteringCreativeMaterialModes {
  
  CTR("CTR"),
  
  STATIC_ASSEMBLE("STATIC_ASSEMBLE"),
  
  INTERVENE("INTERVENE");

  private String value;

  ReportCampaignGetV2FilteringCreativeMaterialModes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2FilteringCreativeMaterialModes fromValue(String value) {
    for (ReportCampaignGetV2FilteringCreativeMaterialModes b : ReportCampaignGetV2FilteringCreativeMaterialModes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2FilteringCreativeMaterialModes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2FilteringCreativeMaterialModes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2FilteringCreativeMaterialModes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2FilteringCreativeMaterialModes.fromValue(value);
    }
  }
}

