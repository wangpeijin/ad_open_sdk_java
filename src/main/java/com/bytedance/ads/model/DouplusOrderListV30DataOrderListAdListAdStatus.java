/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(DouplusOrderListV30DataOrderListAdListAdStatus.Adapter.class)
public enum DouplusOrderListV30DataOrderListAdListAdStatus {
  
  AUDITING("AUDITING"),
  
  AUDIT_PAUSE("AUDIT_PAUSE"),
  
  DELIVERIED("DELIVERIED"),
  
  DELIVERING("DELIVERING"),
  
  OFFLINE_AUDIT("OFFLINE_AUDIT"),
  
  TIME_NO_REACH("TIME_NO_REACH"),
  
  UNDELIVERIED("UNDELIVERIED"),
  
  UNPAID("UNPAID"),
  
  WAIT_TO_START("WAIT_TO_START");

  private String value;

  DouplusOrderListV30DataOrderListAdListAdStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DouplusOrderListV30DataOrderListAdListAdStatus fromValue(String value) {
    for (DouplusOrderListV30DataOrderListAdListAdStatus b : DouplusOrderListV30DataOrderListAdListAdStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DouplusOrderListV30DataOrderListAdListAdStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DouplusOrderListV30DataOrderListAdListAdStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DouplusOrderListV30DataOrderListAdListAdStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DouplusOrderListV30DataOrderListAdListAdStatus.fromValue(value);
    }
  }
}

