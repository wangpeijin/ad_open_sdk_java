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
@JsonAdapter(SharedWalletWalletInfoGetV30DataWalletInfoWalletType.Adapter.class)
public enum SharedWalletWalletInfoGetV30DataWalletInfoWalletType {
  
  MAIN_WALLET("MAIN_WALLET"),
  
  SUB_CONSUME_WALLET("SUB_CONSUME_WALLET"),
  
  SUB_MANAGE_WALLET("SUB_MANAGE_WALLET");

  private String value;

  SharedWalletWalletInfoGetV30DataWalletInfoWalletType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SharedWalletWalletInfoGetV30DataWalletInfoWalletType fromValue(String value) {
    for (SharedWalletWalletInfoGetV30DataWalletInfoWalletType b : SharedWalletWalletInfoGetV30DataWalletInfoWalletType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SharedWalletWalletInfoGetV30DataWalletInfoWalletType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SharedWalletWalletInfoGetV30DataWalletInfoWalletType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SharedWalletWalletInfoGetV30DataWalletInfoWalletType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SharedWalletWalletInfoGetV30DataWalletInfoWalletType.fromValue(value);
    }
  }
}
