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
@JsonAdapter(QianchuanAdRecommendKeywordsGetV10DataListSuggestReason.Adapter.class)
public enum QianchuanAdRecommendKeywordsGetV10DataListSuggestReason {
  
  CLICK("CLICK"),
  
  DARKHORSE("DARKHORSE"),
  
  LOW_COST("LOW_COST"),
  
  POTENTIAL("POTENTIAL"),
  
  PREFERENCE("PREFERENCE");

  private String value;

  QianchuanAdRecommendKeywordsGetV10DataListSuggestReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdRecommendKeywordsGetV10DataListSuggestReason fromValue(String value) {
    for (QianchuanAdRecommendKeywordsGetV10DataListSuggestReason b : QianchuanAdRecommendKeywordsGetV10DataListSuggestReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAdRecommendKeywordsGetV10DataListSuggestReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdRecommendKeywordsGetV10DataListSuggestReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdRecommendKeywordsGetV10DataListSuggestReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAdRecommendKeywordsGetV10DataListSuggestReason.fromValue(value);
    }
  }
}

