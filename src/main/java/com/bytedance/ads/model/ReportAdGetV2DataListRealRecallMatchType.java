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
@JsonAdapter(ReportAdGetV2DataListRealRecallMatchType.Adapter.class)
public enum ReportAdGetV2DataListRealRecallMatchType {
  
  PRECISION("PRECISION"),
  
  EXTENSIVE("EXTENSIVE"),
  
  PHRASE("PHRASE");

  private String value;

  ReportAdGetV2DataListRealRecallMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2DataListRealRecallMatchType fromValue(String value) {
    for (ReportAdGetV2DataListRealRecallMatchType b : ReportAdGetV2DataListRealRecallMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2DataListRealRecallMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2DataListRealRecallMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2DataListRealRecallMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2DataListRealRecallMatchType.fromValue(value);
    }
  }
}

