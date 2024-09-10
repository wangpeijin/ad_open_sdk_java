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
@JsonAdapter(CampaignCreateV2DedicateType.Adapter.class)
public enum CampaignCreateV2DedicateType {
  
  UNSET("UNSET"),
  
  DEDICATED("DEDICATED");

  private String value;

  CampaignCreateV2DedicateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignCreateV2DedicateType fromValue(String value) {
    for (CampaignCreateV2DedicateType b : CampaignCreateV2DedicateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignCreateV2DedicateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignCreateV2DedicateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignCreateV2DedicateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignCreateV2DedicateType.fromValue(value);
    }
  }
}

