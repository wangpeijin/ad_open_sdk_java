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
@JsonAdapter(ReportAgentGetV2V2DataListCustomerType.Adapter.class)
public enum ReportAgentGetV2V2DataListCustomerType {
  
  LA_AGENT("LA_AGENT"),
  
  VIRTUAL_CUS("VIRTUAL_CUS"),
  
  SELF_SERVICE("SELF_SERVICE"),
  
  VERTICAL("VERTICAL"),
  
  I18N_ADV("I18N_ADV"),
  
  LOCAL("LOCAL"),
  
  INTERNAL("INTERNAL"),
  
  SMB_AGENT("SMB_AGENT"),
  
  KA_AGENT("KA_AGENT"),
  
  REGION("REGION"),
  
  I18N_AGENT("I18N_AGENT"),
  
  VIRTUAL_SMB("VIRTUAL_SMB"),
  
  KA("KA"),
  
  VIRTUAL_LA("VIRTUAL_LA"),
  
  OVERSEA_VIRTUAL("OVERSEA_VIRTUAL"),
  
  DSP("DSP"),
  
  GAME("GAME"),
  
  EXCHANGE("EXCHANGE"),
  
  LA("LA"),
  
  SMB("SMB"),
  
  VIRTUAL_KA("VIRTUAL_KA"),
  
  INTERNET("INTERNET"),
  
  BRANCH("BRANCH");

  private String value;

  ReportAgentGetV2V2DataListCustomerType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAgentGetV2V2DataListCustomerType fromValue(String value) {
    for (ReportAgentGetV2V2DataListCustomerType b : ReportAgentGetV2V2DataListCustomerType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAgentGetV2V2DataListCustomerType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAgentGetV2V2DataListCustomerType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAgentGetV2V2DataListCustomerType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAgentGetV2V2DataListCustomerType.fromValue(value);
    }
  }
}

