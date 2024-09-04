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
@JsonAdapter(SharedWalletMainWalletGetV30AccountType.Adapter.class)
public enum SharedWalletMainWalletGetV30AccountType {
  
  AD("AD"),
  
  AGENT("AGENT"),
  
  LOCAL("LOCAL"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  SharedWalletMainWalletGetV30AccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SharedWalletMainWalletGetV30AccountType fromValue(String value) {
    for (SharedWalletMainWalletGetV30AccountType b : SharedWalletMainWalletGetV30AccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SharedWalletMainWalletGetV30AccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SharedWalletMainWalletGetV30AccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SharedWalletMainWalletGetV30AccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SharedWalletMainWalletGetV30AccountType.fromValue(value);
    }
  }
}

