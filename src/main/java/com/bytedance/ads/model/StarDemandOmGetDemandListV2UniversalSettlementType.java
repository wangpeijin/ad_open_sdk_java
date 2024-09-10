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
@JsonAdapter(StarDemandOmGetDemandListV2UniversalSettlementType.Adapter.class)
public enum StarDemandOmGetDemandListV2UniversalSettlementType {
  
  NUMBER_16(16l),
  
  NUMBER_19(19l),
  
  NUMBER_33(33l);

  private Long value;

  StarDemandOmGetDemandListV2UniversalSettlementType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarDemandOmGetDemandListV2UniversalSettlementType fromValue(Long value) {
    for (StarDemandOmGetDemandListV2UniversalSettlementType b : StarDemandOmGetDemandListV2UniversalSettlementType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StarDemandOmGetDemandListV2UniversalSettlementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarDemandOmGetDemandListV2UniversalSettlementType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarDemandOmGetDemandListV2UniversalSettlementType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return StarDemandOmGetDemandListV2UniversalSettlementType.fromValue(value);
    }
  }
}

