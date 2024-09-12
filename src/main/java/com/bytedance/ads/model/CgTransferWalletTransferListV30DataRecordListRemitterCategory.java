/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(CgTransferWalletTransferListV30DataRecordListRemitterCategory.Adapter.class)
public enum CgTransferWalletTransferListV30DataRecordListRemitterCategory {
  
  ACCOUNT("ACCOUNT"),
  
  WALLET("WALLET");

  private String value;

  CgTransferWalletTransferListV30DataRecordListRemitterCategory(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferWalletTransferListV30DataRecordListRemitterCategory fromValue(String value) {
    for (CgTransferWalletTransferListV30DataRecordListRemitterCategory b : CgTransferWalletTransferListV30DataRecordListRemitterCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CgTransferWalletTransferListV30DataRecordListRemitterCategory> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferWalletTransferListV30DataRecordListRemitterCategory enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferWalletTransferListV30DataRecordListRemitterCategory read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferWalletTransferListV30DataRecordListRemitterCategory.fromValue(value);
    }
  }
}

