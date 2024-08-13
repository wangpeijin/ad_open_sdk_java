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
@JsonAdapter(CgTransferWalletTransferDetailV30DataTransferDirection.Adapter.class)
public enum CgTransferWalletTransferDetailV30DataTransferDirection {
  
  IN("TRANSFER_IN"),
  
  OUT("TRANSFER_OUT");

  private String value;

  CgTransferWalletTransferDetailV30DataTransferDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferWalletTransferDetailV30DataTransferDirection fromValue(String value) {
    for (CgTransferWalletTransferDetailV30DataTransferDirection b : CgTransferWalletTransferDetailV30DataTransferDirection.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CgTransferWalletTransferDetailV30DataTransferDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferWalletTransferDetailV30DataTransferDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferWalletTransferDetailV30DataTransferDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferWalletTransferDetailV30DataTransferDirection.fromValue(value);
    }
  }
}

