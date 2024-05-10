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
@JsonAdapter(QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode.Adapter.class)
public enum QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode {
  
  CUSTOM_CREATIVE("CUSTOM_CREATIVE"),
  
  PROGRAMMATIC_CREATIVE("PROGRAMMATIC_CREATIVE");

  private String value;

  QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode fromValue(String value) {
    for (QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode b : QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdDetailGetV10DataMultiProductCreativeListCreativeMaterialMode.fromValue(value);
    }
  }
}

