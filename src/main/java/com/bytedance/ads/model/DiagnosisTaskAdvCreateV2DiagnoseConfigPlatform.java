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
@JsonAdapter(DiagnosisTaskAdvCreateV2DiagnoseConfigPlatform.Adapter.class)
public enum DiagnosisTaskAdvCreateV2DiagnoseConfigPlatform {
  
  AD("AD"),
  
  QIANCHUAN("QIANCHUAN");

  private String value;

  DiagnosisTaskAdvCreateV2DiagnoseConfigPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiagnosisTaskAdvCreateV2DiagnoseConfigPlatform fromValue(String value) {
    for (DiagnosisTaskAdvCreateV2DiagnoseConfigPlatform b : DiagnosisTaskAdvCreateV2DiagnoseConfigPlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DiagnosisTaskAdvCreateV2DiagnoseConfigPlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiagnosisTaskAdvCreateV2DiagnoseConfigPlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiagnosisTaskAdvCreateV2DiagnoseConfigPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiagnosisTaskAdvCreateV2DiagnoseConfigPlatform.fromValue(value);
    }
  }
}

