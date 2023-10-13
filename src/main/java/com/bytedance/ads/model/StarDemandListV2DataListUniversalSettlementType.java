/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(StarDemandListV2DataListUniversalSettlementType.Adapter.class)
public enum StarDemandListV2DataListUniversalSettlementType {
  
  ALL("ALL"),
  
  FLOW_SHARE("FLOW_SHARE"),
  
  FIXED_PRICE("FIXED_PRICE"),
  
  CPA("CPA"),
  
  CUSTOMIZE("CUSTOMIZE"),
  
  STAR_SUPPORT("STAR_SUPPORT"),
  
  RANK("RANK"),
  
  MONEY_SHARE("MONEY_SHARE"),
  
  EFFECT("EFFECT"),
  
  DOU_PLUS("DOU_PLUS"),
  
  EXCHANGE("EXCHANGE"),
  
  CPM("CPM"),
  
  GIFT("GIFT");

  private String value;

  StarDemandListV2DataListUniversalSettlementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandListV2DataListUniversalSettlementType fromValue(String value) {
    for (StarDemandListV2DataListUniversalSettlementType b : StarDemandListV2DataListUniversalSettlementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarDemandListV2DataListUniversalSettlementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandListV2DataListUniversalSettlementType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandListV2DataListUniversalSettlementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarDemandListV2DataListUniversalSettlementType.fromValue(value);
    }
  }
}

