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
@JsonAdapter(StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus.Adapter.class)
public enum StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus {
  
  AUDITING("AUDITING"),
  
  AUDIT_FAILED("AUDIT_FAILED"),
  
  AUDIT_PASS("AUDIT_PASS");

  private String value;

  StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus fromValue(String value) {
    for (StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus b : StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StarVasGetBoostGroupListV2DataBoostGroupInfosTaskInfosAuditStatus.fromValue(value);
    }
  }
}

