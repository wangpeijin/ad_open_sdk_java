/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
@JsonAdapter(DmpCustomAudienceSelectV2SelectType.Adapter.class)
public enum DmpCustomAudienceSelectV2SelectType {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  DmpCustomAudienceSelectV2SelectType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DmpCustomAudienceSelectV2SelectType fromValue(Long value) {
    for (DmpCustomAudienceSelectV2SelectType b : DmpCustomAudienceSelectV2SelectType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DmpCustomAudienceSelectV2SelectType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DmpCustomAudienceSelectV2SelectType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DmpCustomAudienceSelectV2SelectType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return DmpCustomAudienceSelectV2SelectType.fromValue(value);
    }
  }
}

