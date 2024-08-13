/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(QianchuanVideoGetV10DataListSource.Adapter.class)
public enum QianchuanVideoGetV10DataListSource {
  
  AGENT("AGENT"),
  
  ARTHUR("ARTHUR"),
  
  AUTO_GENERATE("AUTO_GENERATE"),
  
  BP("BP"),
  
  CREATIVE_CENTER("CREATIVE_CENTER"),
  
  E_COMMERCE("E_COMMERCE"),
  
  JI_CHUANG("JI_CHUANG"),
  
  LIVE_HIGHLIGHT("LIVE_HIGHLIGHT"),
  
  STAR("STAR"),
  
  TADA("TADA"),
  
  VIDEO_CAPTURE("VIDEO_CAPTURE");

  private String value;

  QianchuanVideoGetV10DataListSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanVideoGetV10DataListSource fromValue(String value) {
    for (QianchuanVideoGetV10DataListSource b : QianchuanVideoGetV10DataListSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanVideoGetV10DataListSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanVideoGetV10DataListSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanVideoGetV10DataListSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanVideoGetV10DataListSource.fromValue(value);
    }
  }
}

