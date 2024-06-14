/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(ClueCouponDetailV2DataFormValidateType.Adapter.class)
public enum ClueCouponDetailV2DataFormValidateType {
  
  CLUE_PRIORITY("CLUE_PRIORITY"),
  
  ALL_VERIFICATION("ALL_VERIFICATION"),
  
  AUTO_VERIFICATION("AUTO_VERIFICATION"),
  
  VALIDITY_PRIORITY("VALIDITY_PRIORITY"),
  
  NONE_VERIFICATION("NONE_VERIFICATION");

  private String value;

  ClueCouponDetailV2DataFormValidateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponDetailV2DataFormValidateType fromValue(String value) {
    for (ClueCouponDetailV2DataFormValidateType b : ClueCouponDetailV2DataFormValidateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ClueCouponDetailV2DataFormValidateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponDetailV2DataFormValidateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponDetailV2DataFormValidateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponDetailV2DataFormValidateType.fromValue(value);
    }
  }
}

