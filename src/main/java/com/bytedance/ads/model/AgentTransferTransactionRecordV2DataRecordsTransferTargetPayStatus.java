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
@JsonAdapter(AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus.Adapter.class)
public enum AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus {
  
  NO_TRANSFER("NO_TRANSFER"),
  
  TRANSFER_FAILED("TRANSFER_FAILED"),
  
  TRANSFER_ING("TRANSFER_ING"),
  
  TRANSFER_PART("TRANSFER_PART"),
  
  TRANSFER_SUCCESS("TRANSFER_SUCCESS");

  private String value;

  AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus fromValue(String value) {
    for (AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus b : AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus.fromValue(value);
    }
  }
}

