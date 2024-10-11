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
@JsonAdapter(CampaignGetV2DataListMarketingScene.Adapter.class)
public enum CampaignGetV2DataListMarketingScene {
  
  CAR("CAR"),
  
  GAME_SUBSCRIBE("GAME_SUBSCRIBE"),
  
  SOCIAL("SOCIAL"),
  
  MERCHANTS("MERCHANTS"),
  
  VIDEO_INFO("VIDEO_INFO"),
  
  ECOMMERCE("ECOMMERCE"),
  
  GAME_PROMOTION("GAME_PROMOTION"),
  
  EDUCATION("EDUCATION"),
  
  PROMOTION_PURPOSE("PROMOTION_PURPOSE"),
  
  NOVEL("NOVEL");

  private String value;

  CampaignGetV2DataListMarketingScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignGetV2DataListMarketingScene fromValue(String value) {
    for (CampaignGetV2DataListMarketingScene b : CampaignGetV2DataListMarketingScene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CampaignGetV2DataListMarketingScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final CampaignGetV2DataListMarketingScene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignGetV2DataListMarketingScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignGetV2DataListMarketingScene.fromValue(value);
    }
  }
}

