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
@JsonAdapter(QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType.Adapter.class)
public enum QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType {
  
  FIRST_PUBLISH_MATERIAL("FIRST_PUBLISH_MATERIAL"),
  
  HIGH_QUALITY_MATERIAL("HIGH_QUALITY_MATERIAL"),
  
  LOW_QUALITY_MATERIAL("LOW_QUALITY_MATERIAL"),
  
  INEFFICIENT_MATERIAL("INEFFICIENT_MATERIAL"),
  
  CARRY_MATERIAL("CARRY_MATERIAL"),
  
  SIMILAR_MATERIAL("SIMILAR_MATERIAL");

  private String value;

  QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType fromValue(String value) {
    for (QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType b : QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionAdMaterialGetV10FilteringAnalysisType.fromValue(value);
    }
  }
}

