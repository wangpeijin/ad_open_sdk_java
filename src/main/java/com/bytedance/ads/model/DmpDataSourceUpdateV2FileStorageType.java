/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(DmpDataSourceUpdateV2FileStorageType.Adapter.class)
public enum DmpDataSourceUpdateV2FileStorageType {
  
  NUMBER_0(0l);

  private Long value;

  DmpDataSourceUpdateV2FileStorageType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DmpDataSourceUpdateV2FileStorageType fromValue(Long value) {
    for (DmpDataSourceUpdateV2FileStorageType b : DmpDataSourceUpdateV2FileStorageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DmpDataSourceUpdateV2FileStorageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DmpDataSourceUpdateV2FileStorageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DmpDataSourceUpdateV2FileStorageType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return DmpDataSourceUpdateV2FileStorageType.fromValue(value);
    }
  }
}

