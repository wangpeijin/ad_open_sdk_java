/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
@JsonAdapter(QueryProjectV2FilteringReceiptStatusList.Adapter.class)
public enum QueryProjectV2FilteringReceiptStatusList {
  
  COMPLETED("COMPLETED"),
  
  PART_COMPLETED("PART_COMPLETED"),
  
  UNCOMPLETED("UNCOMPLETED");

  private String value;

  QueryProjectV2FilteringReceiptStatusList(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QueryProjectV2FilteringReceiptStatusList fromValue(String value) {
    for (QueryProjectV2FilteringReceiptStatusList b : QueryProjectV2FilteringReceiptStatusList.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QueryProjectV2FilteringReceiptStatusList> {
    @Override
    public void write(final JsonWriter jsonWriter, final QueryProjectV2FilteringReceiptStatusList enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QueryProjectV2FilteringReceiptStatusList read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QueryProjectV2FilteringReceiptStatusList.fromValue(value);
    }
  }
}

