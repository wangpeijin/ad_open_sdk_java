/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@JsonAdapter(ClueWechatPoolListV2FilterAuditStatus.Adapter.class)
public enum ClueWechatPoolListV2FilterAuditStatus {
  
  AUDITING("AUDITING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED");

  private String value;

  ClueWechatPoolListV2FilterAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClueWechatPoolListV2FilterAuditStatus fromValue(String value) {
    for (ClueWechatPoolListV2FilterAuditStatus b : ClueWechatPoolListV2FilterAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ClueWechatPoolListV2FilterAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClueWechatPoolListV2FilterAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClueWechatPoolListV2FilterAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClueWechatPoolListV2FilterAuditStatus.fromValue(value);
    }
  }
}

