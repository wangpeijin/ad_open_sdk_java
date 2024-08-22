/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@JsonAdapter(PromotionListV30DataListLearningPhase.Adapter.class)
public enum PromotionListV30DataListLearningPhase {
  
  LEARNING("LEARNING"),
  
  LEARN_FAILED("LEARN_FAILED"),
  
  LEARNED("LEARNED"),
  
  DEFAULT("DEFAULT");

  private String value;

  PromotionListV30DataListLearningPhase(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionListV30DataListLearningPhase fromValue(String value) {
    for (PromotionListV30DataListLearningPhase b : PromotionListV30DataListLearningPhase.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionListV30DataListLearningPhase> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionListV30DataListLearningPhase enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionListV30DataListLearningPhase read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionListV30DataListLearningPhase.fromValue(value);
    }
  }
}

