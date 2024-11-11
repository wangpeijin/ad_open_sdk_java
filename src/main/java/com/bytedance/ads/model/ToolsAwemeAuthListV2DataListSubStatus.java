/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(ToolsAwemeAuthListV2DataListSubStatus.Adapter.class)
public enum ToolsAwemeAuthListV2DataListSubStatus {
  
  INVALID_CANCEL("INVALID_CANCEL"),
  
  INVALID_EXPIRED("INVALID_EXPIRED"),
  
  INVALID_REJECT("INVALID_REJECT"),
  
  INVALID_TIME_OUT("INVALID_TIME_OUT"),
  
  RENEWING("RENEWING"),
  
  RENEW_FAIL("RENEW_FAIL"),
  
  RENEW_SUCCESS("RENEW_SUCCESS");

  private String value;

  ToolsAwemeAuthListV2DataListSubStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAwemeAuthListV2DataListSubStatus fromValue(String value) {
    for (ToolsAwemeAuthListV2DataListSubStatus b : ToolsAwemeAuthListV2DataListSubStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAwemeAuthListV2DataListSubStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAwemeAuthListV2DataListSubStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAwemeAuthListV2DataListSubStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAwemeAuthListV2DataListSubStatus.fromValue(value);
    }
  }
}

