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
@JsonAdapter(LocalProjectCreateV30AudienceGender.Adapter.class)
public enum LocalProjectCreateV30AudienceGender {
  
  FEMALE("FEMALE"),
  
  MALE("MALE"),
  
  NONE("NONE");

  private String value;

  LocalProjectCreateV30AudienceGender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LocalProjectCreateV30AudienceGender fromValue(String value) {
    for (LocalProjectCreateV30AudienceGender b : LocalProjectCreateV30AudienceGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LocalProjectCreateV30AudienceGender> {
    @Override
    public void write(final JsonWriter jsonWriter, final LocalProjectCreateV30AudienceGender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LocalProjectCreateV30AudienceGender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LocalProjectCreateV30AudienceGender.fromValue(value);
    }
  }
}

