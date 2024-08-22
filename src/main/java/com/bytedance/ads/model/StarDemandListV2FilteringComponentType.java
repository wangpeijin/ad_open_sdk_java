/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@JsonAdapter(StarDemandListV2FilteringComponentType.Adapter.class)
public enum StarDemandListV2FilteringComponentType {
  
  ANCHOR_CAR("ANCHOR_CAR"),
  
  ANCHOR_HOME("ANCHOR_HOME"),
  
  ANCHOR_INVESTMENT("ANCHOR_INVESTMENT"),
  
  ENTERPRISE_MICRO_APP("ENTERPRISE_MICRO_APP"),
  
  MICROAPP_ANCHOR("MICROAPP_ANCHOR"),
  
  ANCHOR_INSURANCE("ANCHOR_INSURANCE"),
  
  ENTERPRISE_ORDER_SERVICE("ENTERPRISE_ORDER_SERVICE"),
  
  ENTERPRISE_ECOM("ENTERPRISE_ECOM"),
  
  ANCHOR_ECOM("ANCHOR_ECOM"),
  
  ENTERPRISE_NOVEL("ENTERPRISE_NOVEL"),
  
  ANCHOR_XIGUA("ANCHOR_XIGUA"),
  
  ENTERPRISE_SALON("ENTERPRISE_SALON"),
  
  ALL("ALL"),
  
  ENTERPRISE_COUPON("ENTERPRISE_COUPON"),
  
  LINK("LINK"),
  
  ANCHOR_TELECOM("ANCHOR_TELECOM"),
  
  ENTERPRISE_CAR("ENTERPRISE_CAR"),
  
  ANCHOR_MOVIE("ANCHOR_MOVIE"),
  
  ENTERPRISE_WEDDING_PHOTO("ENTERPRISE_WEDDING_PHOTO"),
  
  BRAND_ANCHOR("BRAND_ANCHOR"),
  
  ENTERPRISE_DOWNLOAD("ENTERPRISE_DOWNLOAD"),
  
  ANCHOR_E_GAME("ANCHOR_E_GAME"),
  
  POI("POI"),
  
  ANCHOR_DOWNLOAD("ANCHOR_DOWNLOAD"),
  
  ANCHOR_ESTATE_SERVICE("ANCHOR_ESTATE_SERVICE"),
  
  ANCHOR_MICRO_APP_POI("ANCHOR_MICRO_APP_POI"),
  
  VARIETY_ANCHOR("VARIETY_ANCHOR"),
  
  ENTERPRISE_DOWNLOAD_APP("ENTERPRISE_DOWNLOAD_APP"),
  
  LIVE_ORDER_COMPONENT("LIVE_ORDER_COMPONENT"),
  
  CART("CART"),
  
  ANCHOR_EDUCATION("ANCHOR_EDUCATION"),
  
  GAME_ANCHOR("GAME_ANCHOR"),
  
  ANCHOR_TOURISM("ANCHOR_TOURISM");

  private String value;

  StarDemandListV2FilteringComponentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandListV2FilteringComponentType fromValue(String value) {
    for (StarDemandListV2FilteringComponentType b : StarDemandListV2FilteringComponentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarDemandListV2FilteringComponentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandListV2FilteringComponentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandListV2FilteringComponentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarDemandListV2FilteringComponentType.fromValue(value);
    }
  }
}

