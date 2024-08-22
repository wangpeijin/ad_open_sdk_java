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
@JsonAdapter(CreativeProceduralCreativeUpdateV2AdDataAdDownloadStatus.Adapter.class)
public enum CreativeProceduralCreativeUpdateV2AdDataAdDownloadStatus {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  CreativeProceduralCreativeUpdateV2AdDataAdDownloadStatus(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeProceduralCreativeUpdateV2AdDataAdDownloadStatus fromValue(Long value) {
    for (CreativeProceduralCreativeUpdateV2AdDataAdDownloadStatus b : CreativeProceduralCreativeUpdateV2AdDataAdDownloadStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeProceduralCreativeUpdateV2AdDataAdDownloadStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeProceduralCreativeUpdateV2AdDataAdDownloadStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeProceduralCreativeUpdateV2AdDataAdDownloadStatus read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return CreativeProceduralCreativeUpdateV2AdDataAdDownloadStatus.fromValue(value);
    }
  }
}

