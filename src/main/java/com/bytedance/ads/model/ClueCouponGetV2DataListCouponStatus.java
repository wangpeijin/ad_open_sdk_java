/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(ClueCouponGetV2DataListCouponStatus.Adapter.class)
public enum ClueCouponGetV2DataListCouponStatus {
  
  AUDIT_DOING("AUDIT_DOING"),
  
  OFFLINE("OFFLINE"),
  
  UNAUDITED("UNAUDITED"),
  
  PAUSE("PAUSE"),
  
  NORMAL("NORMAL"),
  
  AUDIT_FAIL("AUDIT_FAIL"),
  
  DELETED("DELETED");

  private String value;

  ClueCouponGetV2DataListCouponStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponGetV2DataListCouponStatus fromValue(String value) {
    for (ClueCouponGetV2DataListCouponStatus b : ClueCouponGetV2DataListCouponStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponGetV2DataListCouponStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponGetV2DataListCouponStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponGetV2DataListCouponStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponGetV2DataListCouponStatus.fromValue(value);
    }
  }
}

