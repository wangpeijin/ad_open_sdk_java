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
@JsonAdapter(QianchuanUniPromotionAdMaterialGetV10PageSize.Adapter.class)
public enum QianchuanUniPromotionAdMaterialGetV10PageSize {
  
  NUMBER_10(10l),
  
  NUMBER_20(20l),
  
  NUMBER_50(50l),
  
  NUMBER_100(100l);

  private Long value;

  QianchuanUniPromotionAdMaterialGetV10PageSize(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdMaterialGetV10PageSize fromValue(Long value) {
    for (QianchuanUniPromotionAdMaterialGetV10PageSize b : QianchuanUniPromotionAdMaterialGetV10PageSize.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdMaterialGetV10PageSize> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdMaterialGetV10PageSize enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdMaterialGetV10PageSize read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanUniPromotionAdMaterialGetV10PageSize.fromValue(value);
    }
  }
}

