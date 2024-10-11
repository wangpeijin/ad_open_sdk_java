/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(CreateStatementInvoiceV2InvoiceType.Adapter.class)
public enum CreateStatementInvoiceV2InvoiceType {
  
  GENERAL("GENERAL"),
  
  SPECIAL("SPECIAL"),
  
  E_GENERAL("E_GENERAL"),
  
  E_SPECIAL("E_SPECIAL"),
  
  ALL_E_GENERAL("ALL_E_GENERAL"),
  
  ALL_E_SPECIAL("ALL_E_SPECIAL");

  private String value;

  CreateStatementInvoiceV2InvoiceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreateStatementInvoiceV2InvoiceType fromValue(String value) {
    for (CreateStatementInvoiceV2InvoiceType b : CreateStatementInvoiceV2InvoiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreateStatementInvoiceV2InvoiceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreateStatementInvoiceV2InvoiceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreateStatementInvoiceV2InvoiceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreateStatementInvoiceV2InvoiceType.fromValue(value);
    }
  }
}

