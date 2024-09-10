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
@JsonAdapter(QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus.Adapter.class)
public enum QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus {
  
  PASS("PASS"),
  
  REJECT("REJECT"),
  
  IN_PROGRESS("IN_PROGRESS");

  private String value;

  QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus fromValue(String value) {
    for (QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus b : QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus.fromValue(value);
    }
  }
}

