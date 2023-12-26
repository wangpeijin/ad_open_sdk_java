/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
@JsonAdapter(ClueCouponEmployeeCreateV2DataExistedListUserType.Adapter.class)
public enum ClueCouponEmployeeCreateV2DataExistedListUserType {
  
  DOUYIN("DOUYIN"),
  
  TOUTIAO("TOUTIAO");

  private String value;

  ClueCouponEmployeeCreateV2DataExistedListUserType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponEmployeeCreateV2DataExistedListUserType fromValue(String value) {
    for (ClueCouponEmployeeCreateV2DataExistedListUserType b : ClueCouponEmployeeCreateV2DataExistedListUserType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponEmployeeCreateV2DataExistedListUserType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponEmployeeCreateV2DataExistedListUserType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponEmployeeCreateV2DataExistedListUserType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponEmployeeCreateV2DataExistedListUserType.fromValue(value);
    }
  }
}

