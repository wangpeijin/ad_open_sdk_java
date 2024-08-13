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
@JsonAdapter(SharedWalletTransactionDetailGetV30DataResultsBizType.Adapter.class)
public enum SharedWalletTransactionDetailGetV30DataResultsBizType {
  
  ADJUST_DECREASE("ADJUST_DECREASE"),
  
  ADJUST_FREEZE("ADJUST_FREEZE"),
  
  ADJUST_INCREASE("ADJUST_INCREASE"),
  
  CREDIT_RECHARGE("CREDIT_RECHARGE"),
  
  CREDIT_REFUND("CREDIT_REFUND"),
  
  INIT("INIT"),
  
  ORDER_PAY("ORDER_PAY"),
  
  ORDER_WITHDRAW("ORDER_WITHDRAW"),
  
  REFUND_FREEZE("REFUND_FREEZE"),
  
  SHARED_CANCEL_RECHARGE("SHARED_CANCEL_RECHARGE"),
  
  SHARED_FROZEN_REFUND("SHARED_FROZEN_REFUND"),
  
  SHARED_RECHARGE("SHARED_RECHARGE"),
  
  TRANSFER("TRANSFER"),
  
  TRANSFER_IN("TRANSFER_IN"),
  
  TRANSFER_OUT("TRANSFER_OUT");

  private String value;

  SharedWalletTransactionDetailGetV30DataResultsBizType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SharedWalletTransactionDetailGetV30DataResultsBizType fromValue(String value) {
    for (SharedWalletTransactionDetailGetV30DataResultsBizType b : SharedWalletTransactionDetailGetV30DataResultsBizType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SharedWalletTransactionDetailGetV30DataResultsBizType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SharedWalletTransactionDetailGetV30DataResultsBizType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SharedWalletTransactionDetailGetV30DataResultsBizType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SharedWalletTransactionDetailGetV30DataResultsBizType.fromValue(value);
    }
  }
}

