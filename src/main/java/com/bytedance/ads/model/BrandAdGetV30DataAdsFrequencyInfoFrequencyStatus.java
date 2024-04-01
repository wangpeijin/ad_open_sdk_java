/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus.Adapter.class)
public enum BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus fromValue(Long value) {
    for (BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus b : BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus.fromValue(value);
    }
  }
}

