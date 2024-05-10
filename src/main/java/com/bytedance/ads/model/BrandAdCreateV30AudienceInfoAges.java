/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@JsonAdapter(BrandAdCreateV30AudienceInfoAges.Adapter.class)
public enum BrandAdCreateV30AudienceInfoAges {
  
  ABOVE50("ABOVE50"),
  
  BETWEEN18_23("BETWEEN18_23"),
  
  BETWEEN24_30("BETWEEN24_30"),
  
  BETWEEN31_40("BETWEEN31_40"),
  
  BETWEEN41_49("BETWEEN41_49"),
  
  UNLIMITED("UNLIMITED");

  private String value;

  BrandAdCreateV30AudienceInfoAges(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAdCreateV30AudienceInfoAges fromValue(String value) {
    for (BrandAdCreateV30AudienceInfoAges b : BrandAdCreateV30AudienceInfoAges.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrandAdCreateV30AudienceInfoAges> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAdCreateV30AudienceInfoAges enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAdCreateV30AudienceInfoAges read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrandAdCreateV30AudienceInfoAges.fromValue(value);
    }
  }
}

