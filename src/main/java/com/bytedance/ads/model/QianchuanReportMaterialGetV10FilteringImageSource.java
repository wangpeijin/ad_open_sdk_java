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
@JsonAdapter(QianchuanReportMaterialGetV10FilteringImageSource.Adapter.class)
public enum QianchuanReportMaterialGetV10FilteringImageSource {
  
  AI_GENERATE("AI_GENERATE"),
  
  CREATIVE_CENTER("CREATIVE_CENTER"),
  
  E_COMMERCE("E_COMMERCE"),
  
  JI_CHUANG("JI_CHUANG"),
  
  QUNFENG("QUNFENG"),
  
  SQUARE("SQUARE");

  private String value;

  QianchuanReportMaterialGetV10FilteringImageSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanReportMaterialGetV10FilteringImageSource fromValue(String value) {
    for (QianchuanReportMaterialGetV10FilteringImageSource b : QianchuanReportMaterialGetV10FilteringImageSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanReportMaterialGetV10FilteringImageSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanReportMaterialGetV10FilteringImageSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanReportMaterialGetV10FilteringImageSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanReportMaterialGetV10FilteringImageSource.fromValue(value);
    }
  }
}

