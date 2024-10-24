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
@JsonAdapter(DpaClueProductListV2DataProductsCompletionStatus.Adapter.class)
public enum DpaClueProductListV2DataProductsCompletionStatus {
  
  AD_COMPLETED("AD_COMPLETED"),
  
  ALL_COMPLETED("ALL_COMPLETED"),
  
  LEADS_COMPLETED("LEADS_COMPLETED"),
  
  TO_BE_COMPLETED("TO_BE_COMPLETED");

  private String value;

  DpaClueProductListV2DataProductsCompletionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaClueProductListV2DataProductsCompletionStatus fromValue(String value) {
    for (DpaClueProductListV2DataProductsCompletionStatus b : DpaClueProductListV2DataProductsCompletionStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DpaClueProductListV2DataProductsCompletionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaClueProductListV2DataProductsCompletionStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaClueProductListV2DataProductsCompletionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpaClueProductListV2DataProductsCompletionStatus.fromValue(value);
    }
  }
}

