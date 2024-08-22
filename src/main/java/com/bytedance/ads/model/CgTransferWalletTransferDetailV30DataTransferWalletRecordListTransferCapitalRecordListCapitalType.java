/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@JsonAdapter(CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType.Adapter.class)
public enum CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType {
  
  CREDIT_BIDDING("CREDIT_BIDDING"),
  
  CREDIT_BRAND("CREDIT_BRAND"),
  
  CREDIT_GENERAL("CREDIT_GENERAL"),
  
  PREPAY_BIDDING("PREPAY_BIDDING"),
  
  PREPAY_BRAND("PREPAY_BRAND"),
  
  PREPAY_GENERAL("PREPAY_GENERAL");

  private String value;

  CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType fromValue(String value) {
    for (CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType b : CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferWalletTransferDetailV30DataTransferWalletRecordListTransferCapitalRecordListCapitalType.fromValue(value);
    }
  }
}

