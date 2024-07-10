/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@JsonAdapter(SharedWalletDailyStatGetV30DataResultsWalletType.Adapter.class)
public enum SharedWalletDailyStatGetV30DataResultsWalletType {
  
  MAIN_WALLET("MAIN_WALLET"),
  
  SUB_CONSUME_WALLET("SUB_CONSUME_WALLET"),
  
  SUB_MANAGE_WALLET("SUB_MANAGE_WALLET");

  private String value;

  SharedWalletDailyStatGetV30DataResultsWalletType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SharedWalletDailyStatGetV30DataResultsWalletType fromValue(String value) {
    for (SharedWalletDailyStatGetV30DataResultsWalletType b : SharedWalletDailyStatGetV30DataResultsWalletType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SharedWalletDailyStatGetV30DataResultsWalletType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SharedWalletDailyStatGetV30DataResultsWalletType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SharedWalletDailyStatGetV30DataResultsWalletType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SharedWalletDailyStatGetV30DataResultsWalletType.fromValue(value);
    }
  }
}

