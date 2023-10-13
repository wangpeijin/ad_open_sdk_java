/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
@JsonAdapter(PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform.Adapter.class)
public enum PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform {
  
  AD("AD"),
  
  CONTENT("CONTENT");

  private String value;

  PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform fromValue(String value) {
    for (PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform b : PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform.fromValue(value);
    }
  }
}

