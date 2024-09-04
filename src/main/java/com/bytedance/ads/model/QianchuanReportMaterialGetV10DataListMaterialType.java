/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
@JsonAdapter(QianchuanReportMaterialGetV10DataListMaterialType.Adapter.class)
public enum QianchuanReportMaterialGetV10DataListMaterialType {
  
  VIDEO("video"),
  
  IMAGE("image"),
  
  CAROUSEL("carousel");

  private String value;

  QianchuanReportMaterialGetV10DataListMaterialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportMaterialGetV10DataListMaterialType fromValue(String value) {
    for (QianchuanReportMaterialGetV10DataListMaterialType b : QianchuanReportMaterialGetV10DataListMaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanReportMaterialGetV10DataListMaterialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportMaterialGetV10DataListMaterialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportMaterialGetV10DataListMaterialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportMaterialGetV10DataListMaterialType.fromValue(value);
    }
  }
}

