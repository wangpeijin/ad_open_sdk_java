/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(BrandQueryStockV30Classify.Adapter.class)
public enum BrandQueryStockV30Classify {
  
  SALE("SALE");

  private String value;

  BrandQueryStockV30Classify(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandQueryStockV30Classify fromValue(String value) {
    for (BrandQueryStockV30Classify b : BrandQueryStockV30Classify.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandQueryStockV30Classify> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandQueryStockV30Classify enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandQueryStockV30Classify read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandQueryStockV30Classify.fromValue(value);
    }
  }
}

