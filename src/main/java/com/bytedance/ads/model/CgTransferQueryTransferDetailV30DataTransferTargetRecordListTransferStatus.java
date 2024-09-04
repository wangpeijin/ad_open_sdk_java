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
@JsonAdapter(CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus.Adapter.class)
public enum CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus {
  
  NO_TRANSFER("NO_TRANSFER"),
  
  TRANSFER_FAILED("TRANSFER_FAILED"),
  
  TRANSFER_ING("TRANSFER_ING"),
  
  TRANSFER_PART("TRANSFER_PART"),
  
  TRANSFER_SUCCESS("TRANSFER_SUCCESS");

  private String value;

  CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus fromValue(String value) {
    for (CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus b : CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferStatus.fromValue(value);
    }
  }
}

