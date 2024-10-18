/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(LocalPromotionDetailV30DataVideoHpVisibility.Adapter.class)
public enum LocalPromotionDetailV30DataVideoHpVisibility {
  
  ALWAYS_VISIBLE("ALWAYS_VISIBLE"),
  
  HIDE_VIDEO_ON_HP("HIDE_VIDEO_ON_HP");

  private String value;

  LocalPromotionDetailV30DataVideoHpVisibility(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalPromotionDetailV30DataVideoHpVisibility fromValue(String value) {
    for (LocalPromotionDetailV30DataVideoHpVisibility b : LocalPromotionDetailV30DataVideoHpVisibility.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LocalPromotionDetailV30DataVideoHpVisibility> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalPromotionDetailV30DataVideoHpVisibility enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalPromotionDetailV30DataVideoHpVisibility read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalPromotionDetailV30DataVideoHpVisibility.fromValue(value);
    }
  }
}

