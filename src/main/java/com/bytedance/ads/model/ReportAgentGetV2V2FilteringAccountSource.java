/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@JsonAdapter(ReportAgentGetV2V2FilteringAccountSource.Adapter.class)
public enum ReportAgentGetV2V2FilteringAccountSource {
  
  NORMAL_ADVERTISER("NORMAL_ADVERTISER"),
  
  LUBAN_ACCOUNT("LUBAN_ACCOUNT");

  private String value;

  ReportAgentGetV2V2FilteringAccountSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAgentGetV2V2FilteringAccountSource fromValue(String value) {
    for (ReportAgentGetV2V2FilteringAccountSource b : ReportAgentGetV2V2FilteringAccountSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAgentGetV2V2FilteringAccountSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAgentGetV2V2FilteringAccountSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAgentGetV2V2FilteringAccountSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAgentGetV2V2FilteringAccountSource.fromValue(value);
    }
  }
}

