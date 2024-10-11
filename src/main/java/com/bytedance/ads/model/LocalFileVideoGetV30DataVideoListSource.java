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
@JsonAdapter(LocalFileVideoGetV30DataVideoListSource.Adapter.class)
public enum LocalFileVideoGetV30DataVideoListSource {
  
  BP_PLATFORM("BP_PLATFORM"),
  
  CREATIVE_AIGC("CREATIVE_AIGC"),
  
  LOCAL_ADS_UPLOAD("LOCAL_ADS_UPLOAD"),
  
  MAPI("MAPI"),
  
  STAR("STAR");

  private String value;

  LocalFileVideoGetV30DataVideoListSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalFileVideoGetV30DataVideoListSource fromValue(String value) {
    for (LocalFileVideoGetV30DataVideoListSource b : LocalFileVideoGetV30DataVideoListSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalFileVideoGetV30DataVideoListSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalFileVideoGetV30DataVideoListSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalFileVideoGetV30DataVideoListSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalFileVideoGetV30DataVideoListSource.fromValue(value);
    }
  }
}

