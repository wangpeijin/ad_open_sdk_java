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
@JsonAdapter(QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource.Adapter.class)
public enum QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource {
  
  AGENT("AGENT"),
  
  AI_GENERATE("AI_GENERATE"),
  
  ARTHUR("ARTHUR"),
  
  AUTO_GENERATE("AUTO_GENERATE"),
  
  AWEME("AWEME"),
  
  BP("BP"),
  
  CREATIVE_CENTER("CREATIVE_CENTER"),
  
  E_COMMERCE("E_COMMERCE"),
  
  JIANYING("JIANYING"),
  
  JI_CHUANG("JI_CHUANG"),
  
  LIVE_HIGHLIGHT("LIVE_HIGHLIGHT"),
  
  QUNFENG("QUNFENG"),
  
  SQUARE("SQUARE"),
  
  STAR("STAR"),
  
  TADA("TADA"),
  
  VIDEO_CAPTURE("VIDEO_CAPTURE");

  private String value;

  QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource fromValue(String value) {
    for (QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource b : QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource.fromValue(value);
    }
  }
}

