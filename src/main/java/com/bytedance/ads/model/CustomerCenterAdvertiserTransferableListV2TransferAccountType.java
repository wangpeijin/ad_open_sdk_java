/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@JsonAdapter(CustomerCenterAdvertiserTransferableListV2TransferAccountType.Adapter.class)
public enum CustomerCenterAdvertiserTransferableListV2TransferAccountType {
  
  PAYEE("PAYEE"),
  
  REMITTER("REMITTER");

  private String value;

  CustomerCenterAdvertiserTransferableListV2TransferAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CustomerCenterAdvertiserTransferableListV2TransferAccountType fromValue(String value) {
    for (CustomerCenterAdvertiserTransferableListV2TransferAccountType b : CustomerCenterAdvertiserTransferableListV2TransferAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CustomerCenterAdvertiserTransferableListV2TransferAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CustomerCenterAdvertiserTransferableListV2TransferAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CustomerCenterAdvertiserTransferableListV2TransferAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CustomerCenterAdvertiserTransferableListV2TransferAccountType.fromValue(value);
    }
  }
}

