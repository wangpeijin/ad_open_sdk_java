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
@JsonAdapter(QianchuanImageGetV10DataListSource.Adapter.class)
public enum QianchuanImageGetV10DataListSource {
  
  CREATIVE_CENTER("CREATIVE_CENTER"),
  
  E_COMMERCE("E_COMMERCE"),
  
  JI_CHUANG("JI_CHUANG");

  private String value;

  QianchuanImageGetV10DataListSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanImageGetV10DataListSource fromValue(String value) {
    for (QianchuanImageGetV10DataListSource b : QianchuanImageGetV10DataListSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanImageGetV10DataListSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanImageGetV10DataListSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanImageGetV10DataListSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanImageGetV10DataListSource.fromValue(value);
    }
  }
}

