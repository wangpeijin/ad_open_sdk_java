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
@JsonAdapter(DpaClueProductListV2DataProductsAuditStatus.Adapter.class)
public enum DpaClueProductListV2DataProductsAuditStatus {
  
  APPROVE("AUDIT_STATUS_APPROVE"),
  
  INIT("AUDIT_STATUS_INIT"),
  
  REJECT("AUDIT_STATUS_REJECT");

  private String value;

  DpaClueProductListV2DataProductsAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaClueProductListV2DataProductsAuditStatus fromValue(String value) {
    for (DpaClueProductListV2DataProductsAuditStatus b : DpaClueProductListV2DataProductsAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DpaClueProductListV2DataProductsAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaClueProductListV2DataProductsAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaClueProductListV2DataProductsAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaClueProductListV2DataProductsAuditStatus.fromValue(value);
    }
  }
}

