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
@JsonAdapter(ClueCouponCodeGetV2Status.Adapter.class)
public enum ClueCouponCodeGetV2Status {
  
  EXPIRED("EXPIRED"),
  
  VALID("VALID"),
  
  ABANDONED("ABANDONED"),
  
  USED("USED"),
  
  INVALID("INVALID");

  private String value;

  ClueCouponCodeGetV2Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueCouponCodeGetV2Status fromValue(String value) {
    for (ClueCouponCodeGetV2Status b : ClueCouponCodeGetV2Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ClueCouponCodeGetV2Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueCouponCodeGetV2Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueCouponCodeGetV2Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueCouponCodeGetV2Status.fromValue(value);
    }
  }
}

