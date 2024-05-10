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
@JsonAdapter(QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization.Adapter.class)
public enum QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization fromValue(Long value) {
    for (QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization b : QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanAdUpdateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeCardPromotionCardButtonSmartOptimization.fromValue(value);
    }
  }
}

