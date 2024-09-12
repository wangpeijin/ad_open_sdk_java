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
@JsonAdapter(AdvertiserQualificationSubmitV30SubjectCompanyType.Adapter.class)
public enum AdvertiserQualificationSubmitV30SubjectCompanyType {
  
  COMPANY("COMPANY"),
  
  INDIVIDUAL("INDIVIDUAL");

  private String value;

  AdvertiserQualificationSubmitV30SubjectCompanyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdvertiserQualificationSubmitV30SubjectCompanyType fromValue(String value) {
    for (AdvertiserQualificationSubmitV30SubjectCompanyType b : AdvertiserQualificationSubmitV30SubjectCompanyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdvertiserQualificationSubmitV30SubjectCompanyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdvertiserQualificationSubmitV30SubjectCompanyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdvertiserQualificationSubmitV30SubjectCompanyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdvertiserQualificationSubmitV30SubjectCompanyType.fromValue(value);
    }
  }
}

