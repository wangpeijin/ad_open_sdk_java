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
@JsonAdapter(LocalPromotionDetailV30DataLiveMaterialType.Adapter.class)
public enum LocalPromotionDetailV30DataLiveMaterialType {
  
  LIVE("LIVE"),
  
  VIDEO("VIDEO");

  private String value;

  LocalPromotionDetailV30DataLiveMaterialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionDetailV30DataLiveMaterialType fromValue(String value) {
    for (LocalPromotionDetailV30DataLiveMaterialType b : LocalPromotionDetailV30DataLiveMaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalPromotionDetailV30DataLiveMaterialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionDetailV30DataLiveMaterialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionDetailV30DataLiveMaterialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionDetailV30DataLiveMaterialType.fromValue(value);
    }
  }
}

