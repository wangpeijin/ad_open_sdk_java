/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(BrandAdCreateV30AdForm.Adapter.class)
public enum BrandAdCreateV30AdForm {
  
  RECOMMEND("CONTENT_RECOMMEND"),
  
  SERVICE("CONTENT_SERVICE");

  private String value;

  BrandAdCreateV30AdForm(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAdCreateV30AdForm fromValue(String value) {
    for (BrandAdCreateV30AdForm b : BrandAdCreateV30AdForm.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandAdCreateV30AdForm> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAdCreateV30AdForm enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAdCreateV30AdForm read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandAdCreateV30AdForm.fromValue(value);
    }
  }
}

