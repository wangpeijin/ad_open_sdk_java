/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@JsonAdapter(CustomerCenterFundTransferSeqCreateV2TransferType.Adapter.class)
public enum CustomerCenterFundTransferSeqCreateV2TransferType {
  
  GRANT("GRANT"),
  
  PREPAY_BID("PREPAY_BID"),
  
  PREPAY_BRAND("PREPAY_BRAND"),
  
  CREDIT_UNIVERSAL("CREDIT_UNIVERSAL"),
  
  CREDIT_BID("CREDIT_BID"),
  
  CREDIT_BRAND("CREDIT_BRAND"),
  
  PREPAY_UNIVERSAL("PREPAY_UNIVERSAL");

  private String value;

  CustomerCenterFundTransferSeqCreateV2TransferType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CustomerCenterFundTransferSeqCreateV2TransferType fromValue(String value) {
    for (CustomerCenterFundTransferSeqCreateV2TransferType b : CustomerCenterFundTransferSeqCreateV2TransferType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CustomerCenterFundTransferSeqCreateV2TransferType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CustomerCenterFundTransferSeqCreateV2TransferType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CustomerCenterFundTransferSeqCreateV2TransferType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CustomerCenterFundTransferSeqCreateV2TransferType.fromValue(value);
    }
  }
}

