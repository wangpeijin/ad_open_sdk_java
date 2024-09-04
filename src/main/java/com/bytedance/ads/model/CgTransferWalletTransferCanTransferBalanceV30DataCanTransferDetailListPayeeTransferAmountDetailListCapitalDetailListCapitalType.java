/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
@JsonAdapter(CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListPayeeTransferAmountDetailListCapitalDetailListCapitalType.Adapter.class)
public enum CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListPayeeTransferAmountDetailListCapitalDetailListCapitalType {
  
  CREDIT_BIDDING("CREDIT_BIDDING"),
  
  CREDIT_BRAND("CREDIT_BRAND"),
  
  CREDIT_GENERAL("CREDIT_GENERAL"),
  
  PREPAY_BIDDING("PREPAY_BIDDING"),
  
  PREPAY_BRAND("PREPAY_BRAND"),
  
  PREPAY_GENERAL("PREPAY_GENERAL");

  private String value;

  CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListPayeeTransferAmountDetailListCapitalDetailListCapitalType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListPayeeTransferAmountDetailListCapitalDetailListCapitalType fromValue(String value) {
    for (CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListPayeeTransferAmountDetailListCapitalDetailListCapitalType b : CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListPayeeTransferAmountDetailListCapitalDetailListCapitalType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListPayeeTransferAmountDetailListCapitalDetailListCapitalType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListPayeeTransferAmountDetailListCapitalDetailListCapitalType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListPayeeTransferAmountDetailListCapitalDetailListCapitalType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListPayeeTransferAmountDetailListCapitalDetailListCapitalType.fromValue(value);
    }
  }
}

