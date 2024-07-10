/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@JsonAdapter(ClueCouponGetV2DataListCouponResourceListCodeType.Adapter.class)
public enum ClueCouponGetV2DataListCouponResourceListCodeType {
  
  MERCHANT("MERCHANT"),
  
  COMMON("COMMON"),
  
  API("API"),
  
  PLATFORM("PLATFORM");

  private String value;

  ClueCouponGetV2DataListCouponResourceListCodeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponGetV2DataListCouponResourceListCodeType fromValue(String value) {
    for (ClueCouponGetV2DataListCouponResourceListCodeType b : ClueCouponGetV2DataListCouponResourceListCodeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponGetV2DataListCouponResourceListCodeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponGetV2DataListCouponResourceListCodeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponGetV2DataListCouponResourceListCodeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponGetV2DataListCouponResourceListCodeType.fromValue(value);
    }
  }
}

