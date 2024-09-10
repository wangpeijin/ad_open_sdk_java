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
@JsonAdapter(StarClueGetV2DataListComponentType.Adapter.class)
public enum StarClueGetV2DataListComponentType {
  
  ALL("ALL"),
  
  ANCHOR_BRANCH_TRIAL("ANCHOR_BRANCH_TRIAL"),
  
  ANCHOR_CAR("ANCHOR_CAR"),
  
  ANCHOR_DOUYIN_MOVIE("ANCHOR_DOUYIN_MOVIE"),
  
  ANCHOR_DOWNLOAD("ANCHOR_DOWNLOAD"),
  
  ANCHOR_ECOM("ANCHOR_ECOM"),
  
  ANCHOR_EDUCATION("ANCHOR_EDUCATION"),
  
  ANCHOR_ESTATE_SERVICE("ANCHOR_ESTATE_SERVICE"),
  
  ANCHOR_E_GAME("ANCHOR_E_GAME"),
  
  ANCHOR_FILM("ANCHOR_FILM"),
  
  ANCHOR_HOME("ANCHOR_HOME"),
  
  ANCHOR_INSURANCE("ANCHOR_INSURANCE"),
  
  ANCHOR_INVESTMENT("ANCHOR_INVESTMENT"),
  
  ANCHOR_MICRO_APP_POI("ANCHOR_MICRO_APP_POI"),
  
  ANCHOR_MOVIE("ANCHOR_MOVIE"),
  
  ANCHOR_QINGYAN("ANCHOR_QINGYAN"),
  
  ANCHOR_TELECOM("ANCHOR_TELECOM"),
  
  ANCHOR_TOURISM("ANCHOR_TOURISM"),
  
  ANCHOR_XIGUA("ANCHOR_XIGUA"),
  
  ANCHOR_XINGTU("ANCHOR_XINGTU"),
  
  ASSEMBLE_COMPONENT("ASSEMBLE_COMPONENT"),
  
  BRAND_ANCHOR("BRAND_ANCHOR"),
  
  CART("CART"),
  
  CLUE_POI_ANCHOR("CLUE_POI_ANCHOR"),
  
  COCREATE_COMPONENT("COCREATE_COMPONENT"),
  
  DRAW_COMPONENT("DRAW_COMPONENT"),
  
  ENTERPRISE_CAR("ENTERPRISE_CAR"),
  
  ENTERPRISE_COUPON("ENTERPRISE_COUPON"),
  
  ENTERPRISE_DOWNLOAD("ENTERPRISE_DOWNLOAD"),
  
  ENTERPRISE_DOWNLOAD_APP("ENTERPRISE_DOWNLOAD_APP"),
  
  ENTERPRISE_ECOM("ENTERPRISE_ECOM"),
  
  ENTERPRISE_MICRO_APP("ENTERPRISE_MICRO_APP"),
  
  ENTERPRISE_NOVEL("ENTERPRISE_NOVEL"),
  
  ENTERPRISE_ORDER_SERVICE("ENTERPRISE_ORDER_SERVICE"),
  
  ENTERPRISE_SALON("ENTERPRISE_SALON"),
  
  ENTERPRISE_THIRD_PARTY_SHOPPING_CART("ENTERPRISE_THIRD_PARTY_SHOPPING_CART"),
  
  ENTERPRISE_WEDDING_PHOTO("ENTERPRISE_WEDDING_PHOTO"),
  
  GAME_ANCHOR("GAME_ANCHOR"),
  
  GROUP_BUY_ANCHOR("GROUP_BUY_ANCHOR"),
  
  GROUP_BUY_COMPONENT("GROUP_BUY_COMPONENT"),
  
  HOURLY_REACH_ANCHOR("HOURLY_REACH_ANCHOR"),
  
  LINK("LINK"),
  
  LIVE_APP_COMPNENT("LIVE_APP_COMPNENT"),
  
  LIVE_ATTRACT_COMPONENT("LIVE_ATTRACT_COMPONENT"),
  
  LIVE_GAME_COMPONENT("LIVE_GAME_COMPONENT"),
  
  LIVE_MICRO_GAME("LIVE_MICRO_GAME"),
  
  LIVE_ORDER_COMPONENT("LIVE_ORDER_COMPONENT"),
  
  MALL_ACTIVITY("MALL_ACTIVITY"),
  
  MICROAPP_ANCHOR("MICROAPP_ANCHOR"),
  
  ONLINE_CONSULT_COMPONENT("ONLINE_CONSULT_COMPONENT"),
  
  PAID_CONTENT_COMPONENT("PAID_CONTENT_COMPONENT"),
  
  POI("POI"),
  
  RESERVATION_COMPONENT("RESERVATION_COMPONENT"),
  
  SEARCH_COMPONENT("SEARCH_COMPONENT"),
  
  SERIES_MIX_COMPONENT("SERIES_MIX_COMPONENT"),
  
  STAR_ANCHOR_CAR("STAR_ANCHOR_CAR"),
  
  STAR_ANCHOR_FASHION("STAR_ANCHOR_FASHION"),
  
  STAR_ANCHOR_HOME("STAR_ANCHOR_HOME"),
  
  STAR_ANCHOR_SHOPPING("STAR_ANCHOR_SHOPPING"),
  
  STAR_EVALUATION_COMPONENT("STAR_EVALUATION_COMPONENT"),
  
  STORE_MARKET("STORE_MARKET"),
  
  VARIETY_ANCHOR("VARIETY_ANCHOR"),
  
  VIDEO_MICRO_GAME("VIDEO_MICRO_GAME");

  private String value;

  StarClueGetV2DataListComponentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarClueGetV2DataListComponentType fromValue(String value) {
    for (StarClueGetV2DataListComponentType b : StarClueGetV2DataListComponentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarClueGetV2DataListComponentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarClueGetV2DataListComponentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarClueGetV2DataListComponentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarClueGetV2DataListComponentType.fromValue(value);
    }
  }
}

