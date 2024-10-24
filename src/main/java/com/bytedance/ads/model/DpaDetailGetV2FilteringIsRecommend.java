/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@JsonAdapter(DpaDetailGetV2FilteringIsRecommend.Adapter.class)
public enum DpaDetailGetV2FilteringIsRecommend {
  
  NUMBER_1(1l),
  
  NUMBER_0(0l);

  private Long value;

  DpaDetailGetV2FilteringIsRecommend(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpaDetailGetV2FilteringIsRecommend fromValue(Long value) {
    for (DpaDetailGetV2FilteringIsRecommend b : DpaDetailGetV2FilteringIsRecommend.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DpaDetailGetV2FilteringIsRecommend> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpaDetailGetV2FilteringIsRecommend enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpaDetailGetV2FilteringIsRecommend read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return DpaDetailGetV2FilteringIsRecommend.fromValue(value);
    }
  }
}

