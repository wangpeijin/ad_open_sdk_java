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
@JsonAdapter(ToolsLiveAuthorizeListV2DataListStatus.Adapter.class)
public enum ToolsLiveAuthorizeListV2DataListStatus {
  
  AUTHORIZE_OVERDUE("AUTHORIZE_OVERDUE"),
  
  APPLYING("APPLYING"),
  
  APPLY_OVERDUE("APPLY_OVERDUE"),
  
  AUTHORIZING("AUTHORIZING");

  private String value;

  ToolsLiveAuthorizeListV2DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsLiveAuthorizeListV2DataListStatus fromValue(String value) {
    for (ToolsLiveAuthorizeListV2DataListStatus b : ToolsLiveAuthorizeListV2DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsLiveAuthorizeListV2DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsLiveAuthorizeListV2DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsLiveAuthorizeListV2DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsLiveAuthorizeListV2DataListStatus.fromValue(value);
    }
  }
}

