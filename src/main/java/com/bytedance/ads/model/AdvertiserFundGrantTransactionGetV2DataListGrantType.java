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
@JsonAdapter(AdvertiserFundGrantTransactionGetV2DataListGrantType.Adapter.class)
public enum AdvertiserFundGrantTransactionGetV2DataListGrantType {
  
  UNKNOWN("unknown"),
  
  ACTIVITY("activity"),
  
  REFUND("refund"),
  
  INTERNAL_AD("internal_ad"),
  
  RETURN_GOODS("return_goods"),
  
  EXCHANGE("exchange"),
  
  SUPPLEMENT("supplement"),
  
  SUBSIDIARY("subsidiary");

  private String value;

  AdvertiserFundGrantTransactionGetV2DataListGrantType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserFundGrantTransactionGetV2DataListGrantType fromValue(String value) {
    for (AdvertiserFundGrantTransactionGetV2DataListGrantType b : AdvertiserFundGrantTransactionGetV2DataListGrantType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdvertiserFundGrantTransactionGetV2DataListGrantType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserFundGrantTransactionGetV2DataListGrantType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserFundGrantTransactionGetV2DataListGrantType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserFundGrantTransactionGetV2DataListGrantType.fromValue(value);
    }
  }
}

