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
@JsonAdapter(DmpDataSourceCreateV2FileStorageType.Adapter.class)
public enum DmpDataSourceCreateV2FileStorageType {
  
  NUMBER_0(0l);

  private Long value;

  DmpDataSourceCreateV2FileStorageType(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DmpDataSourceCreateV2FileStorageType fromValue(Long value) {
    for (DmpDataSourceCreateV2FileStorageType b : DmpDataSourceCreateV2FileStorageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DmpDataSourceCreateV2FileStorageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DmpDataSourceCreateV2FileStorageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DmpDataSourceCreateV2FileStorageType read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return DmpDataSourceCreateV2FileStorageType.fromValue(value);
    }
  }
}

