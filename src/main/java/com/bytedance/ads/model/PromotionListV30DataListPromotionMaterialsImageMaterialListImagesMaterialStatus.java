/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus.Adapter.class)
public enum PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus {
  
  ADV_OFFLINE_BUDGET("MATERIAL_STATUS_ADV_OFFLINE_BUDGET"),
  
  ADV_PRE_OFFLINE_BUDGET("MATERIAL_STATUS_ADV_PRE_OFFLINE_BUDGET"),
  
  AUDIT("MATERIAL_STATUS_AUDIT"),
  
  AWEME_AC_DISABLED("MATERIAL_STATUS_AWEME_AC_DISABLED"),
  
  AWEME_ANCHOR_DISABLED("MATERIAL_STATUS_AWEME_ANCHOR_DISABLED"),
  
  AWEME_VIDEO_DISABLED("MATERIAL_STATUS_AWEME_VIDEO_DISABLED"),
  
  BUDGET_GROUP_OFFLINE_BUDGET("MATERIAL_STATUS_BUDGET_GROUP_OFFLINE_BUDGET"),
  
  DELETE("MATERIAL_STATUS_DELETE"),
  
  DISABLE("MATERIAL_STATUS_DISABLE"),
  
  ERROR_DEFAULT("MATERIAL_STATUS_ERROR_DEFAULT"),
  
  FROZEN("MATERIAL_STATUS_FROZEN"),
  
  LIVE_ROOM_OFF("MATERIAL_STATUS_LIVE_ROOM_OFF"),
  
  MATERIAL_DELETE("MATERIAL_STATUS_MATERIAL_DELETE"),
  
  NO_SCHEDULE("MATERIAL_STATUS_NO_SCHEDULE"),
  
  OFFLINE_AUDIT("MATERIAL_STATUS_OFFLINE_AUDIT"),
  
  OFFLINE_BALANCE("MATERIAL_STATUS_OFFLINE_BALANCE"),
  
  OFFLINE_BUDGET("MATERIAL_STATUS_OFFLINE_BUDGET"),
  
  OK("MATERIAL_STATUS_OK"),
  
  PREOFFLINE_BUGDET("MATERIAL_STATUS_PREOFFLINE_BUGDET"),
  
  PREONLINE("MATERIAL_STATUS_PREONLINE"),
  
  PRODUCT_OFFLINE("MATERIAL_STATUS_PRODUCT_OFFLINE"),
  
  PROJECT_DISABLE("MATERIAL_STATUS_PROJECT_DISABLE"),
  
  PROJECT_OFFLINE_BUDGET("MATERIAL_STATUS_PROJECT_OFFLINE_BUDGET"),
  
  PROJECT_PREOFFLINE_BUDGET("MATERIAL_STATUS_PROJECT_PREOFFLINE_BUDGET"),
  
  PROMOTION_DISABLE("MATERIAL_STATUS_PROMOTION_DISABLE"),
  
  PROMOTION_QUOTA_LIMIT("MATERIAL_STATUS_PROMOTION_QUOTA_LIMIT"),
  
  REAUDIT("MATERIAL_STATUS_REAUDIT"),
  
  SYSTEM_DISABLE_QUOTA_LIMIT("MATERIAL_STATUS_SYSTEM_DISABLE_QUOTA_LIMIT"),
  
  TIME_DONE("MATERIAL_STATUS_TIME_DONE"),
  
  TIME_NO_REACH("MATERIAL_STATUS_TIME_NO_REACH");

  private String value;

  PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus fromValue(String value) {
    for (PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus b : PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListPromotionMaterialsImageMaterialListImagesMaterialStatus.fromValue(value);
    }
  }
}

